package Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.CM;
import Utilities.Contents;
import Utilities.Driver;
import Utilities.ReadPropertyFile;
import Utilities.Waits;
import Utilities.WriteintoPropertyfile;

public class WebcentersynforExistingQuote {
	static WebDriver driver;
	static Properties p1 = ReadPropertyFile.read(Contents.webcenterPropertyFile);
	static Properties p2 = ReadPropertyFile.read(Contents.openExitsingquote);

	public static void main(String[] args) throws Exception {
		LogInToAD.intializeBrower();

		LogInToAD.log();

		openExistingQuote();
		 
//		saveGlidNumber();
//		artWorkAndPricingApproval();
//		CM.jsClick("reConfigureButton", p2.getProperty("reConfigureButton"));
//		sample();
//		artWorkAndPricingApproval();

//		VariableData.VariableDataTab(); //completed
//		System.out.println("variableTab function runned");
//		VariableData.SelectInputFields_section(); //completed
//		System.out.println("SelectInputFields_section function runned");
//		VariableData.ConfigureCareModule_section(); //completed
//		System.out.println("ConfigureCareModule_section function runned");
//		
//		System.out.println("SelectLayoutField_Section function started");
//		
//		VariableData.SelectLayoutField_Section(); //completed
//		System.out.println("SelectLayoutField_Section function runned");
//		VariableData.Language_Translations_Details(); //completed
//		System.out.println("Language_Translations_Details function runned");

	}

	public static void openExistingQuoteAndReConfigureButton() throws InterruptedException {

		CM.click("PFL", p2.getProperty("PFL"));
		Thread.sleep(20000);
		Waits.EWait(100, p2.getProperty("QuoteManager"));
		CM.click("QuoteManager", p2.getProperty("QuoteManager"));
		CM.click("Search", p2.getProperty("Search"));

		driver = Driver.driver; 
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				CM.click("TransactionID1", p2.getProperty("TransactionID1"));
				CM.click("Next1", p2.getProperty("Next1"));
				CM.click("TransactionID2", p2.getProperty("TransactionID2"));
				CM.click("Next2", p2.getProperty("Next2"));
				Select se = new Select(driver.findElement(By.xpath(p2.getProperty("Comparator"))));
				// Select the option by index
				se.selectByIndex(1);

				CM.sendKeysXpath(p2.getProperty("Value"), p2.getProperty("quotenum"));
				String quote = String.format(p2.getProperty("clickQuote"), p2.getProperty("quotenum"));
				CM.click("Search", p2.getProperty("Search"));

				Waits.sleep(5);
				driver.switchTo().frame("searchResultFrame");
				CM.click("Quote", quote);
				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}
		}
		Waits.sleep(10);
		CM.jsClick("rowcheckbox", p2.getProperty("rowcheckbox"));
		reconfigure();
		 
	}

	/**
	 * 
	 */
	public static void reconfigure() {
		Waits.EWait(100, p2.getProperty("rowcheckbox"));

		CM.jsClick("rowcheckbox", p2.getProperty("rowcheckbox"));

		System.out.println("executed ss");

		CM.jsClick("reConfigureButton", p2.getProperty("reConfigureButton"));
	}

	public static void openExistingQuote() throws Exception {

		CM.click("PFL", p2.getProperty("PFL"));
		Thread.sleep(20000);
		CM.click("QuoteManager", p2.getProperty("QuoteManager"));
		CM.click("Search", p2.getProperty("Search"));

		driver = Driver.driver;
		String parentWindow = driver.getWindowHandle(); // will get the current window
		Set<String> handles = driver.getWindowHandles(); // set of all the windows
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				CM.click("TransactionID1", p2.getProperty("TransactionID1"));
				CM.click("Next1", p2.getProperty("Next1"));
				CM.click("TransactionID2", p2.getProperty("TransactionID2"));
				CM.click("Next2", p2.getProperty("Next2"));
				Select se = new Select(driver.findElement(By.xpath(p2.getProperty("Comparator"))));
				// Select the option by index
				se.selectByIndex(1);

				CM.sendKeysXpath(p2.getProperty("Value"), p2.getProperty("quotenum"));
				String quote = String.format(p2.getProperty("clickQuote"), p2.getProperty("quotenum"));
				CM.click("Search", p2.getProperty("Search"));

				Waits.sleep(5);
				driver.switchTo().frame("searchResultFrame");
				CM.click("Quote", quote);
				driver.close(); // closing child window
				driver.switchTo().window(parentWindow); // cntrl to parent window

			}
		}

		Waits.sleep(10);

		System.out.println("executed ss");

//		CM.jsClick("reConfigureButton", p2.getProperty("reConfigureButton"));

//		Waits.EWait(5, "//span[text()='Variable Data']");

	}

	public static void artWorkAndPricingApproval() {
		
		 
		
//		CM.jsClick("rowcheckbox", "//div[@role='rowgroup']//input[@title='Select Row']/..");

		Waits.sleep(7);
		CM.click("Approve_Reject", p2.getProperty("Approve_Reject"));
		Waits.sleep(7);

		CM.click("ArtworkApproval_Section", p2.getProperty("ArtworkApproval_Section"));

		Waits.sleep(5);

		CM.click("selectrowforArtwork", p2.getProperty("selectrowforArtwork"));

		Waits.sleep(10);

		CM.click("artworkApprovalRejection_t", p2.getProperty("artworkApprovalRejection_t"));

		Waits.sleep(3);

		CM.click("RequestForApproval", p2.getProperty("RequestForApproval"));

		Waits.sleep(3);
		
		CM.click("Leftarrow", p2.getProperty("Leftarrow"));

		CM.click("SAVE", p2.getProperty("Save"));

		Waits.sleep(10);

		CM.click("artworkApprovalRejection_t", p2.getProperty("artworkApprovalRejection_t"));

		Waits.sleep(3);

		CM.click("artworkApprove", p2.getProperty("artworkApprove"));

		Waits.sleep(3);

		CM.click("selectrowforArtwork", p2.getProperty("selectrowforArtwork"));

		Waits.sleep(3);

		CM.click("SAVE", p2.getProperty("Save"));

		Waits.sleep(10);

		CM.click("pricing_section", p2.getProperty("pricing_section"));

		CM.click("Pricing_Approval_Rejection", p2.getProperty("Pricing_Approval_Rejection"));

		CM.click("Price_approval_request", p2.getProperty("Price_approval_request"));

		CM.click("selectRowforPricing", p2.getProperty("selectRowforPricing"));

		CM.click("SAVE", p2.getProperty("Save"));

		Waits.sleep(10);

		CM.click("Pricing_Approval_Rejection", p2.getProperty("Pricing_Approval_Rejection"));

		CM.click("Price_approve", p2.getProperty("Price_approve"));

		CM.click("selectRowforPricing", p2.getProperty("selectRowforPricing"));

		CM.click("SAVE", p2.getProperty("Save"));
		Waits.sleep(10);
		System.out.println("art Work And Pricing Approval is successful");
	}

	public static void saveGlidNumber() throws IOException {
		Waits.EWait(20, p2.getProperty("gildNumXpath"));

		WebElement glidNum = driver.findElement(By.xpath(p2.getProperty("gildNumXpath")));

		String s = glidNum.getText();

		System.out.println(s);

		p1.setProperty("glidNum", s);

		WriteintoPropertyfile.WritePropertiesFile("glidNum", s, Contents.webcenterPropertyFile);
		System.out.println("Glid number is saved");
	}

}
