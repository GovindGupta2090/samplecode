package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FileDownload_IE_AutoIt {

	@Test
	public void AutoIt() throws IOException, InterruptedException
	{
	
	System.setProperty("webdriver.ie.driver","D:\\Selenium\\driver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();

	driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
    driver.findElement(By.linkText("smilechart.xls")).click(); 
    
    /*
      
     ControlFocus("Windows Internet Explorer","","Button3")
ControlSetText("Save As","","Edit1","D:\Selenium\Demo\")
ControlClick("open","","Button1")
     */
    
   Thread.sleep(3000);
    Runtime.getRuntime().exec("D:\\Selenium\\AutoIT files\\FileDownLoad.exe");	
    
    
}
	
	
	@Test
	public void DownloadRoboaclas()
	{
		
		
		
		
	}
	
	
}
