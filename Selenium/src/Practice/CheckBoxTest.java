package Practice;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CheckBoxTest extends initialsetup {

	String Wh;
	
	public CheckBoxTest() throws Exception
	{
		super();
		
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	}


@Test(enabled=false)

public void singlecheckbox()
{
	//bycss
	
	//byid
	WebElement single_checkbox = driver.findElement(By.cssSelector("input#isAgeSelected"));
	//
	
	//select css value by attribute
	WebElement VerifyText = driver.findElement(By.cssSelector("div[id='txtAge']"));
	
	String Confrimationtext;
	for (int i=1;i<=2;i++)
	{
		single_checkbox.click();
		Confrimationtext = VerifyText.getText();
		
		if (single_checkbox.isSelected() )
		{
			//first Itration ran
			Assert.assertEquals(Confrimationtext, "Success - Check box is checked");
		}
		
		else
		{
			
			Assert.assertEquals(Confrimationtext, "");
		}
	}
			
			
	}
	
	@Test
	public void multiple_checkbox()
	{
		
		List<WebElement> all_checkbox = driver.findElements(By.cssSelector("input.cb1-element"));
		
		WebElement checkbox_button= driver.findElement(By.cssSelector("input#check1"));
		//Iterator itr = Iterator.all_checkbox;
	
		int size = all_checkbox.size();
		
		for(int i=0;i<size;i++)
		{
			all_checkbox.get(i).click();
			if ( i<3)
			{
				Assert.assertEquals("Check All", checkbox_button.getAttribute("value"));
			}
			else
			{
				Assert.assertEquals("Uncheck All", checkbox_button.getAttribute("value"));
			}
		}
		
		checkbox_button.click();
		
		for (WebElement checkbox:all_checkbox) 
		{
			
			Assert.assertFalse(checkbox.isSelected());
			}
		
		checkbox_button.click();
		
		Iterator<WebElement> itr=  all_checkbox.iterator();
		
		while(itr.hasNext())
		{
		
			Assert.assertTrue(itr.next().isSelected());
		}
	}
}
