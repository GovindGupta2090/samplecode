package learn;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver d;
		
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		//		d = new FirefoxDriver();
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\driver\\chromedriver.exe");
		
		
		 d = new ChromeDriver();
		
		d.get("https://www.javatpoint.com/");
		
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	d.manage().window().maximize();
	
   String Title = d.getTitle();
   String currentulr = d.getCurrentUrl();
   String PageSorurce = d.getPageSource();
   
  
   System.out.println("Before wait");
   System.out.println("Title:"+Title);
   System.out.println("currentulr:"+currentulr);
   //System.out.println("PageSorurce:"+PageSorurce);
   
   String wh= d.getWindowHandle();
      d.switchTo().window(wh);
   d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   System.out.println("Now Working on after wait");
   String Coursetosearch="Java";
   WebElement text_box = d.findElement(By.name("q"));
   text_box.sendKeys(Coursetosearch);
   text_box.sendKeys(Keys.ENTER);
   d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
   String new_tab_title;
   
   ArrayList <String> child_element = new ArrayList<String>(d.getWindowHandles());
   
   d.switchTo().window(child_element.get(2));
   
   System.out.println(d.getTitle());
   d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
   System.out.println("Now on searched window");
   new_tab_title= d.getTitle();
   System.out.println(new_tab_title);
   WebElement search_box = d.findElement(By.id("lst-ib"));
   

   String ExpectedSearcText = "Java site:www.javatpoint.com";
   String ActaulSearchText = search_box.getText();
   System.out.println(ExpectedSearcText);
   System.out.println(ActaulSearchText);
   
		 //  Java site:www.javatpoint.com
   if(ExpectedSearcText.contains(ActaulSearchText)){
	
	   System.out.println("Redirecte to correct search text,now clicking on link to get the actaul cource");
	   
	   WebElement searchlink= d.findElement(By.linkText("Java Tutorial | Learn Java - javatpoint"));
	  // WebElement firtslink= d.findElement(By.xpath(//input[type=id]);
	   searchlink.click();
	   	 
		  
		  if(d.getCurrentUrl().equals("https://www.javatpoint.com/java-tutorial")){
			  
			  d.findElement(By.linkText("Operators")).click(); 
			  //d.wait(5);
			 if ( d.getPageSource().contains("Operators in java"))
			 {
				 System.out.println("Naviagted  to correct page");
				 //d.close();
				 //d.switchTo().window(wh);
				 d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				 int opened_window = child_element.size();
				 System.out.println(opened_window);
				 for (int i=0;i<opened_window;i++)
				 {
					 System.out.println("Closing frame one by one");

					 d.switchTo().window(child_element.get(i)).close();
					 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
				 }
				 
			 }
			  //close();Operators in java


		  }
		  
		  else{
			  System.out.println("Try Again");
			  d.quit();
		  }
			  
		  
	   
   }
   
 
   
   
   
  /* for(String Child_window : d.getWindowHandles() )
   {
	   d.switchTo().window(Child_window.)); 
	   System.out.println(d.getTitle());
	   System.out.println("inside for loop");
	   if ((d.getTitle().equals("Java site:www.javatpoint.com - Google Search")))
	   {
		   
	   new_tab_title= d.getTitle();
	   System.out.println("Now on searched window");
	   System.out.println(new_tab_title);
	   WebElement search_box = d.findElement(By.id("lst-ib"));
	   

	   String ExpectedSearcText = "Java site:www.javatpoint.com";
	   String ActaulSearchText = search_box.getText();
			 //  Java site:www.javatpoint.com
	   if(ExpectedSearcText.equals(ActaulSearchText)){
		
		   System.out.println("Redirecte to correct search text,now clicking on link to get the actaul cource");
		   
		   
	   }
	   else{
		   System.out.println("R");
	   
	   }
	   }
	   
	   */
   }
   
 
   
   
   
   
   
   
 
			
			
	}

