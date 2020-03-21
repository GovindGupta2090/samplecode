package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4 {
	
	@Test(priority=2,groups={"TC4_case1","TC4_case2"})		
	public void TC4_test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,groups={"TC4_case2"})		
	public void TC4_test2()
	{
		Assert.assertTrue(false);
	}

@Test(priority=1,groups={"TC4_SameGroup"})	
public void TC4_test3()
{
	Assert.assertTrue(false);
}

@Test(priority=1,groups={"TC4_SameGroup"})	
public void TC4_test4()
{
	Assert.assertTrue(true);
}
	

}
