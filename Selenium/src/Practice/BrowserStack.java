package Practice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStack {

		public static final String USERNAME = "govindgupta3";
	  public static final String AUTOMATE_KEY = "qh2zPQNdaJAruxynGsPZ";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	
	public void browserstacktest() throws MalformedURLException
	{

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("device", "iPhone 8");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11.0");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	
}
}
