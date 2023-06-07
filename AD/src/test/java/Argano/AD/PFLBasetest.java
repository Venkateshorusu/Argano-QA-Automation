package Argano.AD;



import static org.junit.jupiter.api.Assertions.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.Screenshot;

public class PFLBasetest {
	public static WebDriver driver;
	public static ExtentReports ex;
	public static ExtentTest et;
    
	@BeforeSuite
	public void intializingtheExtentReport(ITestContext context) {
		ExtentSparkReporter spk=new ExtentSparkReporter("PFL.html");
		ex=new ExtentReports();
		ex.attachReporter(spk);
		
		
	}
	
	@AfterSuite
	public void closingTheExtentReport() throws IOException {
		ex.flush();
		Desktop.getDesktop().browse(new File("PFL.html").toURI());
		
	}
	
	@BeforeTest
	public void setup(ITestContext context) {
		
		ex.setSystemInfo("OS", System.getProperty("os.name"));
		String author=context.getCurrentXmlTest().getParameter("author");
		et=ex.createTest(context.getName());
		
	}
	@AfterMethod
	public void generatetheStatus(Method m,ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) {
			String fail=Screenshot.captureandgetpath(driver, m.getName());
			et.addScreenCaptureFromPath(fail);
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println(m.getName()+"is passed");
			
		}
		
	}
  
}
