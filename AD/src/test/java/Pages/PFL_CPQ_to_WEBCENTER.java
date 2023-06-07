package Pages;

import java.awt.Desktop;


import java.io.File;
import java.io.IOException;
import org.testng.*;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utilities.Driver;
import Utilities.Screenshot;
import Utilities.Waits;
import junit.framework.Assert;

public class PFL_CPQ_to_WEBCENTER {
	public static ExtentReports ex;
	ExtentTest test;

	public ExtentTest creattest(String name) {
		test = ex.createTest(name);
		return test;
	}

	@BeforeSuite
	public void setup() throws Exception {
		LogInToAD.intializeBrower();
		ExtentSparkReporter spk = new ExtentSparkReporter(
				"C:\\eclipse\\AD\\src\\test\\java\\TestReports\\PFL_CPQ_to_WEBCENTER.html");
		ex = new ExtentReports();
		ex.attachReporter(spk);
		spk.config().setDocumentTitle("PFL");
		spk.config().setReportName("PFL_CPQ_to_WEBCENTER");
		spk.config().setTheme(Theme.STANDARD);

	}

	@AfterMethod
	public void getResult(ITestResult result) {
		test.assignAuthor("venky");
		test.assignDevice("Windows");
		test.assignCategory("Smoke");

	}

	@AfterSuite
	public void generatereport() throws IOException {
		 
		
		ex.flush();
		Desktop.getDesktop()
				.browse(new File("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\PFL_CPQ_to_WEBCENTER.html").toURI());
		
	}

	@Test(priority = 1)
	public void LoginCreatNewQuote() {
		try {
			test = creattest("TEST -1 Login and Creat NewQuote");
			test.assignCategory("CPQ");
			LogInToAD.log();			 
			NewTransaction.UptoSave(); 
			 
			NewTransaction.addLineItem();
			NewTransaction.CreateNew();
			NewTransaction.saveGlidnumAndQuoteNum();
			String path = Screenshot.captureandgetpath(Driver.driver, "login  to save  Quote and glid");
			test.addScreenCaptureFromPath(path);
 			System.out
					.println("--------------------------------------------------------------------------------------");

		} 
		catch (Exception e) { 
 		 
			String path = Screenshot.captureandgetpath(Driver.driver, "LoginCreatNewQuote");
			test.fail("failed",MediaEntityBuilder.createScreenCaptureFromPath(path).build()); 
			test.fail("Due to" + e);
		 
			return;

		}
		test.pass("passed");

	}
//	,,dependsOnMethods="LoginCreatNewQuote"

	@Test(priority = 2)
	public void webcenterUploadWorkingFile() {
		try {
			test = creattest("TEST -2 web center Upload Working File");
			test.assignCategory("WebCenter");
			WebCenter.loginToWC();
			String path = Screenshot.captureandgetpath(Driver.driver, "loginToWC");
			test.addScreenCaptureFromPath(path);
			WebCenter.webcentermethod();
			Waits.sleep(5);
			path = Screenshot.captureandgetpath(Driver.driver, "webcentermethod");
			test.addScreenCaptureFromPath(path);
			 
			System.out
					.println("--------------------------------------------------------------------------------------");

		} catch (Exception e) {
			test.info(e);
			String path = Screenshot.captureandgetpath(Driver.driver, "webcenterUploadWorkingFile");
			test.addScreenCaptureFromPath(path);
			test.fail("Due to" + e);
			return;

		}
		test.pass("passed");

	}
 
//	@Test(priority = 3,dependsOnMethods="webcenterUploadWorkingFile")
//	public void ArtworkAndPricingApproval() {
//		try {
//
//			test = creattest("TEST -3 Artwork And Pricing Approval");
// 
//			WebcentersynforExistingQuote.artWorkAndPricingApproval();
//			String path = Screenshot.captureandgetpath(Driver.driver, "artWorkAndPricingApproval");
//			test.addScreenCaptureFromPath(path);
//			WebcentersynforExistingQuote.reconfigure();
//			path = Screenshot.captureandgetpath(Driver.driver, "reconfigure");
//			test.addScreenCaptureFromPath(path);
//
//			System.out
//					.println("--------------------------------------------------------------------------------------");
//
//		} catch (Exception e) {
//			test.info(e);
//			String path = Screenshot.captureandgetpath(Driver.driver, "ArtworkAndPricingApproval");
//			test.addScreenCaptureFromPath(path);
//			test.fail("Due to" + e);
//			return;
//
//		}
//		test.pass("passed");
//
//	}
//
//	@Test(priority = 4,dependsOnMethods="ArtworkAndPricingApproval")
//	public void variableDataComplete() {
//		try {
//			test = creattest("TEST -4 variable Data Complete");
//
//			Variable.variablemethods();
//			String path = Screenshot.captureandgetpath(Driver.driver, "variablemethods");
//			test.addScreenCaptureFromPath(path);
//
////			Variable.vdc();
////			Waits.sleep(5);
////			path = Screenshot.captureandgetpath(Driver.driver, "variable_Data");
////			test.addScreenCaptureFromPath(path);
// 
//			System.out
//					.println("--------------------------------------------------------------------------------------");
//
//		} catch (Exception e) {
//			test.info(e);
//			String path = Screenshot.captureandgetpath(Driver.driver, "variableDataComplete");
//			test.addScreenCaptureFromPath(path);
//			test.fail("Due to" + e);
//			return;
//
//		}
//		test.pass("passed");
//
//	}
//
//	@Test(priority = 5, dependsOnMethods="variableDataComplete")
//	public void webCenterAfterVDComplete() {
//		try {
//			test = creattest("TEST -5 webCenterAfterVDComplete"); 
//			WebCenter.afterVDComplete();
//			Waits.sleep(5);
//			String path = Screenshot.captureandgetpath(Driver.driver, "afterVDComplete");
//			test.addScreenCaptureFromPath(path);
//			Driver.driver.quit();
//			System.out.println("--------------------------------------------------------------------------------------");
//
//		} catch (Exception e) {
////			test.info(e);
//			String path = Screenshot.captureandgetpath(Driver.driver, "variableDataComplete");
//			test.addScreenCaptureFromPath(path);
//			test.fail("Due to" + e);
//			return;
//
//		}
//		test.pass("passed");
//
//	} 



}

 