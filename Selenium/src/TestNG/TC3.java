package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3 {

	@Test	
	public void TC3_test1()
	{
		Assert.assertTrue(true);
	}
	
@Test(groups={"TC4_SameGroup"})	
	public void TC3_test2()
	{
		Assert.assertTrue(false);
	}
	
	
	
}
