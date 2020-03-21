package Practice;

import java.io.IOException;
//import java.util.ArrayList;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputFormSubmission extends initialsetup  {

	public InputFormSubmission() throws IOException {
		super();
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
	}

@DataProvider
public ArrayList<Object[]> getformdata()
{

	ArrayList<Object[]> data = new ArrayList<Object[]>();
	
	String fname="Govind";
	String lane="Gupta";
	String eid="abc@gmail.com";
	String contatc="845)555-1212";
	String Address="Address";
	String City="City";
	String Conutry="daho";
	String Postcode="411057";
	String website="https://xyz.com";
	String projdesc="Project Description";
		
	Object valueset[]={fname,lane,eid,contatc,Address,City,Conutry,Postcode,website,projdesc};
	//data.add(new Object[] {fname,lane,eid,contatc,Address,City,Conutry,Postcode,website,projdesc});
	data.add(valueset);
	
	return data;
}
	
@Test(dataProvider="getformdata")
public void submitform(String FirstName,String LastName,String EmailAddr,String PhoneNumber,String Address,String City,String State,String ZipCode,String Website,String ProjectDescription ) throws InterruptedException 
{

	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(FirstName);
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(LastName);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmailAddr);
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(PhoneNumber);
	driver.findElement(By.xpath("//input[@name='address']")).sendKeys(Address);
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
	driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(ZipCode);
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys(Website);
	driver.findElement(By.xpath("//input[@name='comment']")).sendKeys(ProjectDescription);
	
	Select state = new Select(driver.findElement(By.cssSelector("select[name='state']")));

	state.selectByVisibleText(State);
	
	driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
	Thread.sleep(5000);
}
}
