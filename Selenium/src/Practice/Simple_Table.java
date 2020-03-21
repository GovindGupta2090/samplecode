package Practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * @author Govind
 *
 */
public class Simple_Table extends initialsetup {

	public Simple_Table() throws IOException {
		super();
		driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
	}
}	
	
//@Test
/*
public void genralTable()
{
	driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
	
	//int Search_row_num;
	//Search_row_num=12;
	
	
	String Headerdata = driver.findElement(By.xpath("//tbody[@id='myTable']/tr[5]/td[1]")).getText();
	
	System.out.println(Headerdata);
	
	
	
}
}
*/
