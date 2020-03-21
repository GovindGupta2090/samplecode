package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserRun {

	public static void main(String[] args) {
		
		
		//IE Challanges - Zooming Issue-IE mode Setting-text entered one by one in 64 bit driver,if xpath  fail use 
		
		//System.setProperty("webdriver.ie.driver","D:\\Selenium\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();

	}

}
