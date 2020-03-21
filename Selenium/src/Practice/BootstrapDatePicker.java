package Practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BootstrapDatePicker extends initialsetup {

	public BootstrapDatePicker() throws IOException {
		super();
		driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
	}

@Test
public void SimpleDatePicker() throws Exception
{
	String date = "03/09/1990";
	String arr[] = date.split("/");
	String day=arr[0];
	String Month=arr[1];
	String Year=arr[2];
	
   driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
   WebElement year_picker =driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
   year_picker.click();
   
   
   driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
      
  year_picker =driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]")); 
   
  WebElement YearTravers = driver.findElement(By.xpath("(//th[@class='prev'])[2]"));
  
  
  
   
  Actions yearaction= new Actions(driver);
 
     
  
	while(!(year_picker.getText().equals(Year)))
	{
		yearaction.moveToElement(YearTravers).click().build().perform();
        
	}
	
	//select month
    int month_val= Integer.parseInt(Month);
	
	driver.findElement(By.xpath("(//td[@colspan='7']/span)["+month_val+"]")).click();
	Thread.sleep(3000);
	
	int date_day= Integer.parseInt(day);
	
	for(int row=1;row<=6;row++)
	{
		System.out.println("run number:"+row);
		String Xpath = "//table[@class='table-condensed']/child::tbody/tr["+row+"]/td[@class='day' and text()='"+date_day+"']";
		
		int found=0;
		try
		{
		
					
			//driver.findElement(By.xpath("//table[@class='table-condensed']/child::tbody/tr["+row+"]/td[@class='day' and text()='"+date_day+"']")).click();

			if (driver.findElement(By.xpath(Xpath)).isDisplayed())
			{
				found=1;
				if (driver.findElement(By.xpath(Xpath)).isEnabled())
				{
					driver.findElement(By.xpath(Xpath)).click();
					
				}
				else
				{
					System.out.println("Date is not correct or else selected date is on sunday");
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Element not found");
		}
		
		if (found==1)
		{
			break;
		}
	
	}
		
	
	
	
	}

}



