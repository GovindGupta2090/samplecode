package Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends initialsetup {

	public DropDownTest() throws IOException {
		super();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
	}

@Test()
public void singlevaluedropdown() throws Exception
{
	WebElement DropDown =  driver.findElement(By.cssSelector("select#select-demo"));
	
	Select day_dropdown= new Select(DropDown);
	
	if(!day_dropdown.isMultiple())
	{
	
	System.out.println("Selectiong by value-Wednesday");
	Thread.sleep(1000);
	day_dropdown.selectByValue("Wednesday");
	System.out.println("Selectiong index 1");
	Thread.sleep(1000);
	day_dropdown.selectByIndex(1);
	System.out.println("Selecting by visible text");
	Thread.sleep(1000);
	day_dropdown.selectByVisibleText("Monday");
	
	System.out.println("getting all options");
	System.out.println(day_dropdown.getOptions());
	
	ArrayList<WebElement> Allvalues= new ArrayList<WebElement>(day_dropdown.getOptions());
	
	System.out.println("Total availble dropdown value:"+(Allvalues.size()));
	
	Iterator<WebElement> itr = Allvalues.iterator();
	
	String DropDownvalues="" ;
	
	while(itr.hasNext())
	{
		 DropDownvalues =DropDownvalues+itr.next().getText()+",";
		
	}
	System.out.println("Dropdown values are as below,seperated by ,");
	System.out.println(DropDownvalues);
   
	//StringBuffer sb = new StringBuffer(DropDownvalues);
	
	FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\Govind\\workspace\\Selenium\\src\\Practice\\SingleDropDownValue.txt"));
	
	byte[] b = DropDownvalues.getBytes();
	
	fout.write(b);
	
	fout.close();
	}

}

@Test
public void MultiselectDropdown()
{
	WebElement multiselect_DropDown = driver.findElement(By.cssSelector("select#multi-select"));
	
	Select Multi_select_contry= new Select(multiselect_DropDown);
	
	if (Multi_select_contry.isMultiple())
	{
	Multi_select_contry.selectByIndex(0);
	Multi_select_contry.selectByIndex(4);
	
	Multi_select_contry.deselectByIndex(0);
	Multi_select_contry.selectByIndex(5);
	
	Multi_select_contry.deselectAll();

	//.....
	
	Multi_select_contry.selectByIndex(2);
	Multi_select_contry.selectByIndex(5);
	
	ArrayList<WebElement> getselectedvalues = new ArrayList<WebElement>(Multi_select_contry.getAllSelectedOptions());
	
	System.out.println("total selected:"+getselectedvalues.size());
		
	for(WebElement getselectedvalue:getselectedvalues)
	{
		System.out.println(getselectedvalue.getText());
	}
	
	
//	...
	
	Multi_select_contry.deselectAll();
	
	}
	
	else
	{
		Assert.assertTrue(false,"does not support multiple selection");
	}
}
	
}

