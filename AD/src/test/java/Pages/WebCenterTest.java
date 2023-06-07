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

public class WebCenterTest {
	public static ExtentReports ex;
	ExtentTest test;

	public ExtentTest creattest(String name) {
		test = ex.createTest(name);
		return test;
	}

	@BeforeSuite
	public void setup() {
		ExtentSparkReporter spk = new ExtentSparkReporter(
				"C:\\eclipse\\AD\\src\\test\\java\\TestReports\\webcenter.html");
		ex = new ExtentReports();
		ex.attachReporter(spk);
		spk.config().setDocumentTitle("PFL");
		spk.config().setReportName("login");
		spk.config().setTheme(Theme.STANDARD);

	}

	@AfterSuite
	public void generatereport() throws IOException {
		ex.flush();
		Desktop.getDesktop().browse(new File("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\webcenter.html").toURI());
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		test.assignAuthor("venky");
		test.assignDevice("Windows");
		test.assignCategory("Smoke");

	}

	@Test(priority = 1)
	public void Login() {
		try {
			test = creattest("TEST -1 Lonin function");
			LogInToAD.log();
			String path = Screenshot.captureandgetpath(Driver.driver, "login");
			test.addScreenCaptureFromPath(path);
			System.out
					.println("--------------------------------------------------------------------------------------");

		} catch (Exception e) {
			test.info(e);
			String path = Screenshot.captureandgetpath(Driver.driver, "login");
			test.addScreenCaptureFromPath(path);
			test.fail("Due to" + e);
			return;

		}
		test.pass("passed");

	}

	@Test(priority = 2)
	public void newTransaction() {
		try {
			test = creattest("TEST -2 New Transaction");
			NewTransaction.UptoSave();
			String path = Screenshot.captureandgetpath(Driver.driver, "New_Transaction_UptoSave");
			test.addScreenCaptureFromPath(path);
			NewTransaction.addLineItem();
			path = Screenshot.captureandgetpath(Driver.driver, "New_Transaction_addLineItem");
			test.addScreenCaptureFromPath(path);
			NewTransaction.CreateNew();
			path = Screenshot.captureandgetpath(Driver.driver, "New_Transaction_CreateNew");
			test.addScreenCaptureFromPath(path);
			System.out.println("--------------------------------------------------------------------------------------");

		} catch (Exception e) {
			test.info(e);
			test.fail("Due to" + e);
			String path = Screenshot.captureandgetpath(Driver.driver, "newTransaction");
			test.addScreenCaptureFromPath(path);
			return;

		}
		test.pass("passed");

	}
	
	

}
