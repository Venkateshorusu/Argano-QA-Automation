package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachSSToTest {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		ExtentReports ex = new ExtentReports();
		File file = new File("ReportsByFileWithSS.html");
		ExtentSparkReporter exsp = new ExtentSparkReporter(file);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String base64 = Screenshot.getBase64Image(driver);
		String path = Screenshot.captureandgetpath(driver, "demo");
		
		ex.attachReporter(exsp);
		
		ex.createTest("Test1", "attaching the ss to the test").info("this the info for the test")
				.addScreenCaptureFromBase64String(base64, "google");
		
		ex.createTest("Test2", "attaching the ss to the test").info("this the info for the test")
				.addScreenCaptureFromPath(path);
				
		
		ex.flush();
		
		driver.quit();
		Desktop.getDesktop().browse(new File("ReportsByFileWithSS.html").toURI());

	}

}
