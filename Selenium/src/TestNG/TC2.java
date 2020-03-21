package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 {

	@Test(expectedExceptions = ArithmeticException.class)	
	public void TC2_test1()
	{
		int a=10;
		int b=0;
		int c=0;
		c=a/b;
		
		Assert.assertTrue(true);
	}
	
@Test	
	public void TC2_test2()
	{
	 int c= 10/0;
		Assert.assertTrue(true);
	}
	
	
}
