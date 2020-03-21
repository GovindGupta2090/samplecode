package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC6_xml_Parameter {

@Test	
@Parameters({"uname","password","anyintValue"})
public void add(String uname,String Password, int anyintValue )
{
	System.out.println(uname);
	System.out.println(uname);
	int sum=anyintValue+10;
	System.out.println(sum);
}


	
	
}
