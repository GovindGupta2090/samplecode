package Practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptiosTest {
	
	static DesiredCapabilities  capabilities;
	static String DeviceName;
	WebDriver driver;
	
	@Test
	public void ResizeChrromwwindoTest()
	{
	    
		/* Working Method 1*/
		Map<String, Object> deviceMetrics = new HashMap<>();
		deviceMetrics.put("width", 768);
		deviceMetrics.put("height", 1024);
		deviceMetrics.put("pixelRatio", 2);
		Map<String, Object> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceMetrics", deviceMetrics);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");
		Map<String, Object> chromeOptions = new HashMap<>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		  
		driver = new ChromeDriver(capabilities);
       
       driver.get("https://dzone.com/articles/mobile-testing-with-chrome-and-webdriver");
		
			}


	@Test(priority=1)
	public void ChromeDeviceEmulator()
	{
	    
		//options.AddArgument("--start-maximized");
		//options.addArguments("--disable-extensions");
		//options.addArguments("incognito");
		
		Map<String, Object> mobileEmulation = new HashMap<>();
		
		mobileEmulation.put("deviceName", "Apple iPad");
		
		Map<String, Object> chromeOptions = new HashMap<>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
			  
		driver = new ChromeDriver(capabilities);
       
       driver.get("https://dzone.com/articles/mobile-testing-with-chrome-and-webdriver");
		

	}


}

