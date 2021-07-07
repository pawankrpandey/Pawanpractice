package Practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.PracticePage;
import resource.base;

public class navigation extends base{

	public WebDriver driver;
	public PracticePage p;
	public List<WebElement> row;

	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializedDriver();
		
		driver.get(prop.getProperty("url"));
		 
	}
	
	@Test(priority=1)
	public void radioButton()
	{
		//driver.get(prop.getProperty("url"));
		p= new PracticePage(driver);
	
		p.radio().click();
	}
	
	@Test(priority=2)
	public void suggesetionClass() {
		 p= new PracticePage(driver);
		p.suggesetion().sendKeys("pawan");
		
	}
	
	@Test(priority=3)
	public void dropDown() {
		 p= new PracticePage(driver);
		//d.selectByIndex(2);
		p.Staticdropdown().selectByIndex(2);
		String opt=p.Staticdropdown().getFirstSelectedOption().getText();
		Assert.assertEquals(opt , "Option2");
	}
	
	@Test(priority=4)
	public void checkBox() {
		 p= new PracticePage(driver);
		p.checkBoxes().click();
		
	}
	
	@Test(priority=5)
	public void switchWindow() {
		 p= new PracticePage(driver);
		p.moveWindow();
			
	}
	
	@Test(priority=6)
	public void alertWindow() {
		 p= new PracticePage(driver);
	
	p.alert().click();
	p.driver.switchTo().alert().accept();
	}
	
	
	@Test(priority=7)
	public void Table() {
		 p= new PracticePage(driver);
		 p.table();
		 	String a=p.row.get(0).getText();
		 	Assert.assertEquals(a,"Rahul Shetty");
		 	String b=p.row.get(1).getText();
		 	Assert.assertEquals(b, "Appium (Selenium) - Mobile Automation Testing from Scratch");
		 	String c=p.row.get(2).getText();
		 	Assert.assertEquals(c, "30");
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

