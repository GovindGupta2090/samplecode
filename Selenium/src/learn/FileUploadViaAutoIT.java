package learn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FileUploadViaAutoIT {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{

	WebDriver driver;
	
	System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
	
	
	//System.setProperty("webdriver.ie.driver","D:\\Selenium\\driver\\IEDriverServer.exe");
	
	driver=new FirefoxDriver();
	
    driver.get("https://www.guru99.com/become-an-instructor.html");
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,400)", "");
    
    //driver.findElement(By.id("postjob")).click();			
    //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='input_1']"));
    //driver.findElement(By.id("input_1")).sendKeys("Gaurav");                                 					
    //driver.findElement(By.id("input_2")).sendKeys("test.test@gmail.com");	
    //driver.findElement(By.id("input_3")).sendKeys("Gaurav"); 
    driver.findElement(By.name("file")).click();		
    // below line execute the AutoIT script .
    Thread.sleep(3000);
     Runtime.getRuntime().exec("D:\\Selenium\\AutoIT files\\FileUpload.exe");		
   // driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");		
     
    driver.findElement(By.id("input_5")).click();
    driver.close();
     }
	
	
}
