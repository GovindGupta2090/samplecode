package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@Test
	public void test1() throws MalformedURLException
	{
	
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		//class to help running test in selenium grid env
		DesiredCapabilities dc = DesiredCapabilities.chrome();
				
		
		dc.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, dc);

		 			
		
	driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
	}
	
}
