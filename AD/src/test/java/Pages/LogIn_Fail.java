package Pages;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

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

public class LogIn_Fail {
	public static ExtentReports ex;
	ExtentTest test;

	public ExtentTest creattest(String name) {
		test = ex.createTest(name);
		return test;
	}

	@BeforeSuite
	public void setup() {
		ExtentSparkReporter spk = new ExtentSparkReporter(
				"C:\\eclipse\\AD\\src\\test\\java\\TestReports\\LoginFailed.html");
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
				.browse(new File("C:\\eclipse\\AD\\src\\test\\java\\TestReports\\LoginFailed.html").toURI());
	}
	

	@Test(priority = 1)
	public void LoginCreatNewQuote() {
		try {
			test = creattest("TEST -1 Login and Creat NewQuote");
			test.assignCategory("CPQ");
			LogInToAD.log();
			String quote=Driver.driver.findElement(By.xpath("//span[@title='AD Opportunity to Quote - Manager']/following-sibling::span")).getText();
			org.testng.Assert.assertEquals(quote, "AD Opportunity to Quote - Manager");
			String path = Screenshot.captureandgetpath(Driver.driver, "login  to save  Quote and glid");
			
			test.addScreenCaptureFromPath(path);

			Driver.driver.quit();
			System.out
					.println("--------------------------------------------------------------------------------------");

		} catch (Exception e) { 
			String path = Screenshot.captureandgetpath(Driver.driver, "LoginCreatNewQuote");
			test.fail("failed",MediaEntityBuilder.createScreenCaptureFromPath(path).build()); 
			test.fail("Due to" + e);
		 
			return;

		}
		test.pass("passed");

	}
}
