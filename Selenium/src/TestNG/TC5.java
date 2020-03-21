package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import ExtentReporting.TestNGListener;

public class TC5  {

	@Test(priority=2)	
	public void TC5_test1()
	{
		Assert.assertTrue(false);
	}

@Test(priority=1,dependsOnMethods = { "TC5_test1" })	
	public void TC5_test2()
	{
		Assert.assertTrue(true);
	}
	
}
