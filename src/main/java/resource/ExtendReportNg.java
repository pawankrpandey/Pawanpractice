package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportNg {

	static ExtentReports extent;
	public static ExtentReports getReportObject() 
	{
		String path=System.getProperty("user.dir")+"\\pawan\\index.html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Practice page Automation Result");
		report.config().setDocumentTitle("TestResult");
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "pawan");
		
		return extent;
		
		}
	
	
}
