package Practice;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SimpleInputForm  extends initialsetup{

public String Wh;

	public SimpleInputForm() throws IOException
	{
		super();
				
		
	}
	
@Test(enabled=false)
public void singleinputform()
{
	driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
	String Textverification= driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/p")).getText();
	String ExpectedText="First Let us try be very simple with only one input field and a Button";
	Assert.assertEquals(Textverification, ExpectedText);
	System.out.println("Static Text Verified");
	WebElement inputbox = driver.findElement(By.xpath("//*[@placeholder='Please enter your Message']"));
	WebElement showbutton = driver.findElement(By.xpath("//*[contains(text(),'Show Message') and @type='button']"));
	
	String key;
	key = "Myname";
	
	inputbox.sendKeys(key);
	
	Actions seacraction = new Actions(driver);
	seacraction.moveToElement(showbutton).click().build().perform();
	
	String VerifyData = driver.findElement(By.xpath("//span[@id='display']")).getText();
	
	Assert.assertEquals(key, VerifyData);
	
	System.out.println("Daynamic Text Verified");
	
			//span[@id='display']
	
	
	
}


@Test

public void multipleinputform()
{
	
	//identified from first Enter a label
	WebElement textbox_a = driver.findElement(By.xpath("//label[contains(text(),'Enter a')]/following-sibling::input"));
	
	//identify after traversing from get total button
	WebElement textbox_b = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]/parent::form/div[2]/label/following-sibling::input"));
	
//
	WebElement Result_button = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
	
	String val1="10";
	String val2="20";
	textbox_a.sendKeys(val1);
	textbox_b.sendKeys(val2);
	Result_button.click();

	String Sum_result = driver.findElement(By.xpath("//form[@id='gettotal']/following-sibling::div/child::span")).getText();
	
	
	textbox_a.sendKeys(val1);
	textbox_b.sendKeys(val2);
	
	int parsed_a = Integer.parseInt(val1);
	int parsed_b = Integer.parseInt(val2);
			//val1+val2;
	int c = parsed_a+parsed_b;
	String sum= Integer.toString(c);
	System.out.println("Verifying Sum");
	Assert.assertEquals(sum, Sum_result);
	System.out.println("Sum Verified sucessfully");
	
	
	
	
	
}





}
