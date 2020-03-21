package Practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class initialsetup {

	
	
	//public static final String USERNAME = "govindgupta3";
	  //public static final String AUTOMATE_KEY = "qh2zPQNdaJAruxynGsPZ";
	  //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	WebDriver driver;
	
	public initialsetup() throws IOException
	{
	
		//Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		
		/*
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("device", "iPhone 8");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11.0");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
*/
		driver = new ChromeDriver();
		
		//driver =new RemoteWebDriver(new java.net.URL(URL), caps);	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
String Mainwindow = driver.getWindowHandle();		
		ArrayList<String> allwindow=new ArrayList<String>(driver.getWindowHandles());
		
			
		for(String window:allwindow)
		{
			if(!(window.equals(Mainwindow)))
			
			driver.switchTo().window(window).close();
		}
	
		driver.switchTo().window(Mainwindow);

		
	}
	
}
