package ExtentReporting;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestNGListener extends TestListenerAdapter {

	ExtentReports Report_Formatter;
    ExtentTest Report_Test;
    static String ReportPath = System.getProperty("user.dir");	
	public TestNGListener(){
	String ReportName=ReportPath+"\\ExtentReprt.html";
	//System.out.println(ReportName);
	Report_Formatter = new ExtentReports(ReportName,true);	
	//System.out.println("Reprt Path is"+ReportPath);	
	
	
	    Report_Formatter.addSystemInfo("Host Name","GovindG");
		Report_Formatter.addSystemInfo("Environment","QA");
		Report_Formatter.addSystemInfo("User Name","Govind");
		
}
		
	public void onTestSuccess(ITestResult tr) {
	  
		
		System.out.println("indside SUCCESS Block");
		Report_Test.log(LogStatus.PASS, tr.getName());
		Report_Test.log(LogStatus.PASS,Report_Test.addScreencast("D:\\songs\\vid\\I can only imagine.MP4"));
		
	  }

	  
	  public void onTestFailure(ITestResult tr) {
	  
		  System.out.println("indside Failure Block");
		  Report_Test.log(LogStatus.FAIL, tr.getName());
		  Report_Test.log(LogStatus.FAIL, tr.getThrowable());
		  Report_Test.log(LogStatus.FAIL,Report_Test.addScreenCapture("D:\\PHOTO\\125.jpg"));
	  }

	  
	  public void onTestSkipped(ITestResult tr) {
		  System.out.println("indside TestSkipped Block");
		  Report_Test.log(LogStatus.SKIP, tr.getName());
	  }


  	 
	  public void onStart(ITestContext tc) {
		 
		  Report_Test = Report_Formatter.startTest(tc.getName());
		  System.out.println("indside onstart Block");
		  
	  }

	  
	  public void onFinish(ITestContext Tc) {
		  System.out.println("on Test Finish Block");
		  Report_Formatter.endTest(Report_Test);
		  Report_Formatter.flush();
		  //Report_Formatter.close();
		  
	  }

	
	
	
}
