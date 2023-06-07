package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot extends Driver {

	
	
	
	// ---------------------- To capture screenshot and store in Resource folder // ----------------------------------------------//   

	public static void main(String args[]) throws IOException {

		driver.get("https://www.google.com");
		System.out.println(getBase64Image(driver));
		Desktop.getDesktop().browse(new File(captureandgetpath(driver, "sample")).toURI());
	}

	public static void capture(WebDriver driver, String elementname) {
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String s = System.getProperty("user.dir") + "/Res/" + df.format(date) + elementname + ".png";
			System.out.println(s);
			FileUtils.moveFile(screenshotimage, new File(s));
			System.out.print("ScreenShot has taken successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block           
			e.printStackTrace();
		}
		System.out.print("ScreenShot taken successfully");

	}
	// ---------------------- To capture the  Image
		// -----------------------------------------------------------------------//   

	public static String captureandgetpath(WebDriver driver, String elementname) {
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String s = System.getProperty("user.dir") + "/Res/" + df.format(date) + elementname + ".png";

		try {
			// String s = System.getProperty("user.dir")+"/Res/"+df.format(date) +
			// elementname +".png";
			// System.out.println(s);
			FileUtils.moveFile(screenshotimage, new File(s));
			System.out.println("ScreenShot has taken successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block           
			e.printStackTrace();
		}
		// System.out.print("ScreenShot taken successfully");
		return s;
	}

	// ---------------------- To capture Base64 Image
	// -----------------------------------------------------------------------//   
	public static String getBase64Image(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
}
