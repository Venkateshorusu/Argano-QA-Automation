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

public class CPQ_functionalTest {
	public static ExtentReports ex;
	static ExtentTest test;

	public static ExtentTest creattest(String name) {
		test = ex.createTest(name);
		return test;
	}

	@BeforeSuite
	public void setup() throws Exception {
		LogInToAD.intializeBrower();
		ExtentSparkReporter spk = new ExtentSparkReporter(
				"C:\\eclipse\\AD\\src\\test\\java\\TestReports\\CPQ_functionalTest.html");
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
//		Driver.quit();

		ex.flush();
		Desktop.getDesktop()
				.browse(new File("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\CPQ_functionalTest.html").toURI());

	}

	@Test(priority = 1)
	public static void LoginAndOpenExistingQuote() throws Exception {

		test = creattest("TEST -1 Login and Opening the Existing Quote");
		test.assignCategory("CPQ");
		LogInToAD.log();
		String path = Screenshot.captureandgetpath(Driver.driver,"LogInToAD");
		test.addScreenCaptureFromPath(path);
		Creatnew.productSpecification();
		path = Screenshot.captureandgetpath(Driver.driver,"productSpecification");
		test.addScreenCaptureFromPath(path);
		Variable.variablemethods();
		path = Screenshot.captureandgetpath(Driver.driver,"variablemethods");
		test.addScreenCaptureFromPath(path);

	}

}
