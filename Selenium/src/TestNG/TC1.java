package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC1 {

@BeforeMethod
public void TC1_Before_Method()
{
	System.out.println("Before Method ran for TC1");
}

@AfterMethod
public void TC1_After_Method()
{
	System.out.println("After Method ran for TC1");
}

	
@Test	
	public void TC1_test1()
	{
		Assert.assertTrue(true);
	}

//
@Test(enabled=true)	
	public void TC1_test2()
	{
		Assert.assertTrue(false);
	}
	
	
}
