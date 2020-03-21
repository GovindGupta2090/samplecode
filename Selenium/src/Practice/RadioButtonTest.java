package Practice;

import java.io.IOException;
import java.util.ArrayList;






import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends initialsetup{

	public String allwindow;;
	
	public RadioButtonTest() throws IOException
	{
		super();
		
		
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
			}
	

	
@Test(enabled=false)
public void simpleradiobutton()
{
	System.out.println("frame set successfully");
	
	WebElement checkbox_male = driver.findElement(By.xpath("(//label[contains(text(),'Male')])[1]"));
	WebElement checkbox_female = driver.findElement(By.xpath("(//label[contains(text(),'Female')])[1]"));

	WebElement button_checkvalue = driver.findElement(By.cssSelector("button#buttoncheck"));
	
	button_checkvalue.click();
	Assert.assertTrue(driver.getPageSource().contains("Radio button is Not checked"));
	
	checkbox_male.click();
	button_checkvalue.click();
	Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
	
	checkbox_female.click();
	button_checkvalue.click();
	Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
	
	driver.quit();
}

@Test
public void groupradiobutton() 
{

	WebElement sex_group = driver.findElement(By.xpath("(//label[contains(text(),'Male')])[2]"));
	WebElement Age_Group = driver.findElement(By.xpath("//input[@value='5 - 15']"));
	WebElement getvalue = driver.findElement(By.xpath("//button[text()='Get values']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0,350);");
		
	ArrayList<WebElement> highlighter = new ArrayList<WebElement>();
	
	highlighter.add(sex_group);
	highlighter.add(Age_Group);
	highlighter.add(getvalue);
	sex_group.click();
	js.executeScript("arguments[0].style.border='3px solid green'",sex_group);
	Age_Group.click();
	js.executeScript("arguments[0].style.border='10px solid red'",Age_Group);
	getvalue.click();
	js.executeScript("arguments[0].style.border='3px solid blue'",getvalue);
	
	for (WebElement highlight :  highlighter)
	{
		if(highlight.getAttribute("class").equals("radio-inline"))
		{
	js.executeScript("arguments[0].style.border='10px solid red'",highlight);
		}
	}
	
	Assert.assertTrue(driver.getPageSource().contains("Sex : Male"));
	Assert.assertTrue(driver.getPageSource().contains("Age group: 5 - 15"));
	
}
}