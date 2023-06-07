
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
import Utilities.Waits;


public class PFL1 extends Driver {
	public static ExtentReports ex;
	ExtentTest test;

	public ExtentTest creattest(String name) {
		test = ex.createTest(name);
		return test;
	}

	@BeforeSuite
	public void setup() {
		ExtentSparkReporter spk = new ExtentSparkReporter("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\PFL1.html");
		ex = new ExtentReports();
		ex.attachReporter(spk);
		spk.config().setDocumentTitle("PFL");
		spk.config().setReportName("login");
		spk.config().setTheme(Theme.STANDARD);

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		test.assignAuthor("venky");

		

	}

	@AfterSuite
	public void generatereport() throws IOException {
		ex.flush();
		Desktop.getDesktop().browse(new File("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\PFL1.html").toURI());
	}

	@Test
	public void test1() {
		try {
			test = creattest("TEST -1 Lonin function");
			LogInToAD.log();
			System.out.println("--------------------------------------------------------------------------------------");

		} catch (Exception e) {
			test.info(e);
			test.fail("Due to" + e);
			return;

		}
		test.pass("passed");

	}

//	
//
	@Test
	public void test2() {

		try {
			test = creattest("TEST -2 NewTranction UptoSave ");
			NewTransaction.UptoSave();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch (Exception e) {
			test.info(e);
			test.fail("Failed Due to Exception");
			return;
		}

		
		test.pass("passed");
	}

	@Test
	public void test3() {

		try {
			test = creattest("TEST -3 NewTranction addline item ");
			NewTransaction.addLineItem();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch (Exception e) {
			test.info(e);
			test.fail("Failed Due to Exception");
			return;
		}

		
		test.pass("passed");

	}

	@Test
	public void test4() {

		try {
			test = creattest("TEST -4 NewTranction creatnew ");
			NewTransaction.CreateNew();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch (Exception e) {
			test.info(e);
			test.fail("Failed Due to Exception");
			return;
		}

		
		test.pass("passed");
	}

	@Test
	public void test5() {

		try {
			test = creattest("TEST -5 VariableData VariableDataTab ");
			VariableData.VariableDataTab();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch (Exception e) {
			test.info(e);
			test.fail("Failed Due to Exception");
			return;
		}

	
		test.pass("passed");
	}

	@Test
	public void test6() {

		try {
			test = creattest("TEST -6 VariableData  SelectInputFields_section");
			VariableData.SelectInputFields_section();
			VariableData.ConfigureCareModule_section();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch (Exception e) {
			test.info(e);
			test.fail("Failed Due to Exception");
			return;
		}

		
		test.pass("passed");
	}

//	@Test
//	public void test7() {
//		try {
//			test = creattest("TEST -7 ConfigureCareModule_section   ");
//			VariableData.ConfigureCareModule_section();
//			System.out.println("--------------------------------------------------------------------------------------");
//		} catch (Exception e) {
//			test.info(e);
//			test.fail("Failed Due to Exception");
//			return;
//		}
//
//		
//		test.pass("passed");
//	}

	@Test
	public void test7() {

		try {
			test = creattest("TEST -8 VariableData SelectLayoutField_Section ");
			VariableData.SelectLayoutField_Section();
			System.out.println("--------------------------------------------------------------------------------------");
		} catch(Exception e) {
			test.info(e);
			test.fail("Failed Due to"+ " " +e);
//			String path=Screenshot.captureandgetpath(Driver.driver,"login");
//			test.addScreenCaptureFromPath(path);
//			return ;
			
		}
		test.pass("passed");
//		String path=Screenshot.captureandgetpath(Driver.driver,"login");
//		test.addScreenCaptureFromPath(path);
		
		 
	}

	@Test
	public void test8() {

		 
			test = creattest("TEST -9 VariableData Language_Translations_Details ");

			VariableData.Language_Translations_Details();
			System.out.println("--------------------------------------------------------------------------------------");
			Waits.IWait(10);
		
 
		test.pass("passed");
	}

//	@Test
//	public void test10() {
//	
//
//		try {
//			test = creattest("TEST -10 VariableData Build_Fiber_Content_Section ");
//			VariableData.Build_Fiber_Content_Section();
//			System.out.println("--------------------------------------------------------------------------------------");
//		} catch (Exception e) {
//			test.info(e);
//			test.fail("Failed Due to Exception");
//			return;
//		}
//
//		
//		test.pass("passed");
//	}

}
						