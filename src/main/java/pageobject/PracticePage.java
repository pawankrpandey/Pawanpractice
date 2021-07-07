package pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticePage {
	
	public WebDriver driver;
	public List<WebElement> row;
	
	public PracticePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By radio=By.xpath("//input[@value='radio1']");
	By suggesetion=By.id("autocomplete");
	By Staticdropdown=By.id("dropdown-class-example");
	By checkbox=By.name("checkBoxOption2");
	By window=By.id("openwindow");
	By Alert =By.id("name");
	By AlertButton =By.id("alertbtn");
	By table=By.id("product");
	By rows =By.tagName("tr");
	By coloum=By.tagName("td");
	
	public WebElement radio()
	{
		return driver.findElement(radio);
	}
	
	public WebElement suggesetion()
	{
		return driver.findElement(suggesetion);
		//return (WebElement) driver;
	}
	
	public Select Staticdropdown() 
	{
		WebElement s= driver.findElement(Staticdropdown);
	
		Select d= new Select(s);
	
		return d;
	}
		
	
	public WebElement checkBoxes()
	{
		return driver.findElement(checkbox);
	}
	
	public WebDriver moveWindow()
	{
		 driver.findElement(window).click();;
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		return driver;
		
	}
	
	public WebElement alert()
	{
		 driver.findElement(Alert).sendKeys("kumar");;
		return driver.findElement(AlertButton);
		
		 
	}
	
	public List<WebElement> table() {
		
		WebElement tab=driver.findElement(table);
		System.out.println(tab.findElements(rows).size());
		System.out.println(tab.findElements(coloum).size());
		return row=  tab.findElements(rows).get(3).findElements(coloum);
		
		
	}
	
	
	
}
