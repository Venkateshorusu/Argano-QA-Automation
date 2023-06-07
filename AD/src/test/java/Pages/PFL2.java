package Pages;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utilities.Driver;
import Utilities.Screenshot;

public class PFL2 extends Driver{
	public static ExtentReports ex;
	ExtentTest test;
	
	public ExtentTest creattest(String name) {
		test=ex.createTest(name);
		return test;
	}
	
	
	@BeforeSuite
	public void setup() {
		ExtentSparkReporter spk=new ExtentSparkReporter("PFL2.html");
		ex=new ExtentReports();
		ex.attachReporter(spk);
		spk.config().setDocumentTitle("PFL");
		spk.config().setReportName("login");
		spk.config().setTheme(Theme.DARK);
		
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		test.assignAuthor("venky");
//		if(result.getStatus()==ITestResult.SUCCESS) {
//		
//			test.pass("passed");
//			String path=Screenshot.captureandgetpath(driver,"login");
//			test.addScreenCaptureFromPath(path);
//		}
//		
//		else {
//			test.fail("Failed Due to Exception");
//			String path=Screenshot.captureandgetpath(driver,"login"); 
//			test.addScreenCaptureFromPath(path);
//		}
		 
		
		
	
		
	}
	@AfterSuite
	public void generatereport() throws IOException {
		ex.flush();
		Desktop.getDesktop().browse(new File("PFL2.html").toURI());
	}
	
	@Test
	public void test1()
	{
		try {
		test=creattest("Lonin function");
		LogInToAD.log();
		
		}
		catch(Exception e) {
			test.info(e);
			test.fail("Due to"+e);
			String path=Screenshot.captureandgetpath(Driver.driver,"login");
			test.addScreenCaptureFromPath(path);
			return ;
			
		}
		test.pass("passed");
		String path=Screenshot.captureandgetpath(Driver.driver,"login");
		test.addScreenCaptureFromPath(path);
		
		
		
	}
	
//	
//
	@Test
	public void test2() {
		
		
		try {
			test=creattest("NewTranction UptoSave ");
			NewTransaction.UptoSave();
			}
			catch(Exception e) {
				test.info(e);
				test.fail("Failed Due to Exception");
				String path=Screenshot.captureandgetpath(Driver.driver,"login");
				test.addScreenCaptureFromPath(path);
	
				return ;
			}
			
			test.info("after return");
			test.pass("passed");
			String path=Screenshot.captureandgetpath(Driver.driver,"NewTranction_UptoSave");
			test.addScreenCaptureFromPath(path);
	}

//	@Test
//	public void test3() {
//	
//
//	try {
//		test=creattest("NewTranction addline item ");
//		NewTranction.addLineItem();
//		}
//		catch(Exception e) {
//			test.info(e);
//			test.fail("Failed Due to Exception");
//			return ;
//		}
//		
//		test.info("after return");
//		test.pass("passed");
//	
//	
//	}
//
//	@Test
//	public void test4() {
//		
//		try {
//			test=creattest("NewTranction creatnew ");
//			NewTranction.CreateNew();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test5() { 
//		
//		try {
//			test=creattest("VariableData VariableDataTab ");
//			VariableData.VariableDataTab();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test6() {
//		
//		try {
//			test=creattest("VariableData  SelectInputFields_section");
//			VariableData.SelectInputFields_section();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test7() {
//	 	try {
//			test=creattest("VariableData VariableDataTab ");
//			VariableData.VariableDataTab();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test8() {
//		 
//		try {
//			test=creattest("VariableData SelectLayoutField_Section ");
//			VariableData.SelectLayoutField_Section();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test9() {
//		 
//		 
//		try {
//			test=creattest("VariableData Language_Translations_Details ");
//
//			VariableData.Language_Translations_Details();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
//
//	@Test
//	public void test10() {
//		
//		
//		try {
//			test=creattest("VariableData Build_Fiber_Content_Section ");
//			VariableData.Build_Fiber_Content_Section();
//			}
//			catch(Exception e) {
//				test.info(e);
//				test.fail("Failed Due to Exception");
//				return ;
//			}
//			
//			test.info("after return");
//			test.pass("passed");
//	}
	 
}
