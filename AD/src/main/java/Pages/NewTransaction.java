package Pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Argano.AD.SleepTheDriver;
import Utilities.CM;
import Utilities.Contents;
import Utilities.Driver;
import Utilities.RandomTxt;
import Utilities.ReadPropertyFile;
import Utilities.Waits;
import Utilities.WriteintoPropertyfile;

public class NewTransaction extends Driver {
	static Properties p1 = ReadPropertyFile.read(Contents.webcenterPropertyFile);
	static Properties p2 = ReadPropertyFile.read(Contents.openExitsingquote);
	static Properties newtran = ReadPropertyFile.read(Contents.TransactionFile);
	public static WebDriver driver;  

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		logtosaveQuoteandglid();

	}

	/**
	 * @throws Exception
	 * @throws InterruptedException
	 */
	public static void logtosaveQuoteandglid() throws Exception, InterruptedException {
		LogInToAD.intializeBrower();
		driver = Driver.driver;
		
		LogInToAD.log();
		
		UptoSave();
		addLineItem();
		CreateNew();
		saveGlidnumAndQuoteNum();
	}

	public static void addtoTransAndSynctoWebcenter() {

	}

	public static void CreateNew() throws InterruptedException {
		  driver= Driver.driver;
//		
		Waits.EWait(10, "//input[@id='copyCustomerSearchData']");
//		Creat new
		WebElement CreatNew =  driver.findElement(By.xpath("//input[@id='copyCustomerSearchData']"));
		System.out.println(CreatNew.isDisplayed());
		System.out.println("clicking the CreatNew");
		CreatNew.click();

		WebElement CustomerItemNumber =   driver
				.findElement(By.xpath("//label[text()='Customer Item Number']/../../../../..//input"));
		System.out.println(CustomerItemNumber.isDisplayed());
		String Customer_Item_Number = RandomTxt.randomStr(3) + " Kaushik ";
		// +RandomTxt.randomStr(3);
		CustomerItemNumber.sendKeys(Customer_Item_Number);
		System.out.println("CustomerItemNumber is entered");

//		Variable Data 
		WebElement VariableData =  Driver.driver
				.findElement(By.xpath("//label[text()='Variable Data']/../../../..//div[@role='switch']/.."));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", VariableData);
		System.out.println("jse Clicked element successfully");
		VariableData.click();
		Waits.IWait(10);

		WebElement DSS = Driver.driver.findElement(By.xpath("//label[text()='DSS']/../../../..//a"));

		executor.executeScript("arguments[0].click();", DSS);
		System.out.println("jse Clicked element successfully");
		System.out.println(DSS.isEnabled());
		DSS.click();
		System.out.println("DSS is clicked ");
		Waits.sleep(10);

//		DSS Options
		CM.click("DSS_Options", "//div[text()='Trang Palmer']");

		Waits.sleep(3);
//		GPD
		WebElement GPD = driver.findElement(By.xpath("//label[text()='GPD']/../../../..//a"));
		System.out.println(GPD.isDisplayed());
		GPD.click();
		System.out.println("GPD is clicked");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement GPDoption = driver.findElement(By.xpath("//div[text()='Tracey Goddard']"));
		System.out.println(GPDoption.isDisplayed());
		CM.jsClick("GPDoption", "//div[text()='Tracey Goddard']");
		GPDoption.click();
		System.out.println("GPDoption is clicked");

//		Avery Product Category
		WebElement AveryProductCategory = driver
				.findElement(By.xpath("//label[text()='Avery Product Category']/../../../..//span//a"));
		System.out.println(AveryProductCategory.isDisplayed());
		AveryProductCategory.click();
		System.out.println("AveryProductCategory is clicked");

		WebElement AveryProductCategoryOptionSelect = driver
				.findElement(By.xpath("//div[text()='PRINTED FABRIC LABEL']"));
		System.out.println(AveryProductCategoryOptionSelect.isDisplayed());
		AveryProductCategoryOptionSelect.click();
		System.out.println("AveryProductCategoryOptionSelect is clicked");

//		Avery Product Line
		WebElement AveryProductLine = driver
				.findElement(By.xpath("//label[text()='Avery Product Line']/../../../..//span//a"));
		System.out.println(AveryProductLine.isDisplayed());
		AveryProductLine.click();
		System.out.println("AveryProductLine is clicked");

		WebElement AveryProductLineOptionSelect = driver
				.findElement(By.xpath("//div[text()='EXTERIOR EMBELLISHMENT PFL']"));
		System.out.println(AveryProductLineOptionSelect.isDisplayed());
		AveryProductLineOptionSelect.click();
		System.out.println("AveryProductLineOptionSelect is clicked");

//		Avery Product Type
		WebElement AveryProductType = driver
				.findElement(By.xpath("//label[text()='Avery Product Type']/../../../..//span//a"));
		System.out.println(AveryProductType.isDisplayed());
		AveryProductType.click();
		System.out.println("AveryProductType is clicked");

		WebElement AveryProductTypeOptionSelect = driver.findElement(By.xpath("//div[text()='COATED COTTON']"));
		System.out.println(AveryProductTypeOptionSelect.isDisplayed());
		AveryProductTypeOptionSelect.click();
		System.out.println("AveryProductTypeOptionSelect is clicked");

//		press Type
		WebElement pressType = driver
				.findElement(By.xpath("//label[text()='Press Type']/../../../following-sibling::div//a"));
		System.out.println(pressType.isDisplayed());
		pressType.click();
		System.out.println("pressType is clicked");

//		press Type Option Select
		WebElement pressTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Rotary']"));
		System.out.println(pressTypeOptionSelect.isDisplayed());
		pressTypeOptionSelect.click();
		System.out.println("pressTypeOptionSelect is clicked");

//		Tape style number
		WebElement TapeStyleNumber = driver
				.findElement(By.xpath("//label[text()='Tape Style Number']/../../../following-sibling::div//a"));
		System.out.println(TapeStyleNumber.isDisplayed());
		TapeStyleNumber.click();
		System.out.println("TapeStyleNumber is clicked");

//		Tape Style Number Select Option
		WebElement TapeStyleNumberSelectOption = driver
				.findElement(By.xpath("//div[text()='AT009T | white | XSF coating']"));
		System.out.println(TapeStyleNumberSelectOption.isDisplayed());
		TapeStyleNumberSelectOption.click();
		System.out.println("TapeStyleNumberSelectOption is clicked");

//		Overall Width
		WebElement Overall_Width = driver.findElement(By.xpath("//input[@id='overallWidthInches|input']"));
		System.out.println(Overall_Width.isDisplayed());
		Overall_Width.click();
		Overall_Width.sendKeys("28");
		Overall_Width.sendKeys(Keys.ENTER);
		System.out.println("Overall_Width is clicked");

//		NOTE
		WebElement NoteSection = driver.findElement(By.xpath("//div[@id='oj-collapsible-13-header']"));
		System.out.println(NoteSection.isDisplayed());
		NoteSection.click();

//		ArtProofNote
		WebElement ArtProofNote = driver.findElement(By.xpath("//textarea[@id='artProofNote_PL|input']"));
		System.out.println(ArtProofNote.isDisplayed());
		ArtProofNote.sendKeys("Kaushik123	" + Customer_Item_Number + "	 ArtProofNote ");
		System.out.println("ArtProofNote is entered");

//		Finished Width
		WebElement FinishedWidth = driver.findElement(By.xpath("//label[text()='Finished Width']/../../../..//input"));
		System.out.println(FinishedWidth.isDisplayed());
		// FinishedWidth.click();
		FinishedWidth.sendKeys("28");
		FinishedWidth.sendKeys(Keys.ENTER);
		System.out.println("FinishedWidth is entered");

//		Finished Length
		WebElement FinishedLength = driver.findElement(By.xpath("//input[@id='finishedLength_M|input']"));
		System.out.println(FinishedLength.isDisplayed());
		FinishedLength.click();
		FinishedLength.sendKeys("7");
		FinishedLength.sendKeys(Keys.ENTER);
		System.out.println("FinishedLength is entered");

//		

//		Cut Type
		Waits.IWait(10);
		WebElement CutType = driver.findElement(By.xpath("//label[text()='Cut Type']/../../../..//a"));
		System.out.println(CutType.isDisplayed());
		CutType.click();
		System.out.println("CutType is clicked");

		WebElement CutTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Angle Cut']"));
		System.out.println(CutTypeOptionSelect.isDisplayed());
		CutTypeOptionSelect.click();
		System.out.println("CutTypeOptionSelect is clicked");

//		Fold Type
		WebElement FoldType = driver
				.findElement(By.xpath("//label[text()='Fold Type']/../../../../..//span//a[@role='presentation']"));
		System.out.println(FoldType.isDisplayed());
		FoldType.click();
		System.out.println("FoldType is clicked");

		WebElement FoldTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Center Fold']"));
		System.out.println(FoldTypeOptionSelect.isDisplayed());
		FoldTypeOptionSelect.click();
		System.out.println("FoldTypeOptionSelect is clicked");

//		Front Number Inks
		WebElement FrontNumberInks = driver.findElement(By.xpath("//input[@id='frontNumberInks|input']"));
		System.out.println(FrontNumberInks.isDisplayed());
		FrontNumberInks.sendKeys("3");
		System.out.println("FrontNumberInks is entered");
		Waits.IWait(10);

//		clicking the status section
		driver.findElement(By.xpath("//h3[text()='Status']")).click();

//		selecting the GPD Config Attributes Complete 
		driver.findElement(By.xpath("//label[text()='GPD Config Attributes Complete']/../../../../..//input")).click();

//		Validation 
		WebElement Validate = driver.findElement(By.xpath("//span[text()='Validate']"));
		System.out.println(Validate.isDisplayed());
		Validate.click();
		System.out.println("Validated Successfully .....");
//		Waits.IWait(10);
		Waits.sleep(15);
		Waits.EWait(10, "//span[text()=' Add to Transaction']");

		CM.click("AddtoTransaction", "//span[text()=' Add to Transaction']");

		Waits.EWait(12, "//input[@id='customerArtworkLink|input']");

		CM.sendKeysXpath("//input[@id='customerArtworkLink|input']", "Artwork");

		CM.click("Artwork_Required", "//input[starts-with(@id,'art')]");
		

		try {
			CM.jsClick("rowcheckbox", "//div[@role='rowgroup']//input[@title='Select Row']/..");
			System.out.println("rowcheckbox clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("not clicked");
		}

		CM.click("SaveButton", "//span[text()='Save']");

		Waits.sleep(7); 
		Waits.sleep(7);

		CM.click("Sync_To_WebCenter", "//span[text()='Sync To WebCenter']");
		Waits.sleep(3);

		CM.click("Sync_To_WebCenter", "//span[text()='Sync To WebCenter']");

	}

	/**
	 * 
	 */
	public static void saveGlidnumAndQuoteNum() {
		Waits.EWait(20, p2.getProperty("gildNumXpath"));
		p2.remove("glidNum");

		WebElement glidNum = driver.findElement(By.xpath(p2.getProperty("gildNumXpath")));
		Waits.EWait(10, "//input[@id='transactionID_t|input']");
		WebElement quotenumber = Driver.driver.findElement(By.xpath("//input[@id='transactionID_t|input']"));
//		String s=quotenumber.getText();//
		String u = quotenumber.getAttribute("value");
		System.out.println(u);

		String s = glidNum.getText();

		System.out.println(s);

		p1.setProperty("glidNum", s);

		try {
			WriteintoPropertyfile.WritePropertiesFile("glidNum", s, Contents.webcenterPropertyFile);
			WriteintoPropertyfile.WritePropertiesFile("quotenum", u, Contents.webcenterPropertyFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Glid number is saved");
		System.out.println("Quote number is saved");
	}

	public static void UptoSave() {
		driver = Driver.driver;

		CM.click("QuoteManager", newtran.getProperty("QuoteManager"));
		CM.click("NewTransaction", newtran.getProperty("NewTransaction"));
		CM.click("RBOcodedropdown", newtran.getProperty("RBOcodedropdown"));
		CM.sendKeysXpath(newtran.getProperty("RBOcode"), "WALM");
		CM.click("WALM", newtran.getProperty("WALM"));
		CM.sendKeysXpath(newtran.getProperty("projectmanager"), "kevin Parnell");
		CM.click("Kevin_Parnell", newtran.getProperty("Kevin_Parnell"));

		CM.sendKeysXpath(newtran.getProperty("customer_Artwork_Link"), "artwork_001");

		WebElement selling_location = Driver.driver
				.findElement(By.xpath("//oj-select-many[@id='[[fieldId()]]']//div[@role='presentation']"));
		System.out.println(selling_location.isDisplayed());
		System.out.println("clicking the selling location");
		selling_location.click();
		SleepTheDriver.sleep(4);

		WebElement select_country = Driver.driver.findElement(By.xpath("//div[@id='__oj_zorder_container']//li[1]"));
		System.out.println(select_country.isDisplayed());
		System.out.println("selecting the selling location");
		select_country.click();

		WebElement SaveTheTransaction = Driver.driver
				.findElement(By.xpath("//oj-button[@name='save']//div[@class='oj-button-label']"));
		System.out.println(SaveTheTransaction.isDisplayed());
		System.out.println("saving the Quote");
		SaveTheTransaction.click();
		System.out.println("Quote is Saved");
		Waits.sleep(5);

	}

	/**
	 * 
	 */
	public static void addLineItem() {
		driver= Driver.driver;
		
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Waits.EWait(10, "//div[@class='cpq-table-wrapper']//button//span[text()='Add Line Item']");
//		Add Line Item
		WebElement AddLineItem = Driver.driver.findElement(By.xpath("//div[@class='cpq-table-wrapper']//button//span[text()='Add Line Item']"));
		System.out.println(AddLineItem.isDisplayed());
		System.out.println("clicking the Addlineitem");
		AddLineItem.click();
		System.out.println("add line item is clicked");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		select Model
		WebElement selectModel = Driver.driver.findElement(By.xpath("//img[@alt='Printed Fabric Label']"));
		System.out.println(selectModel.isDisplayed());
		System.out.println("clicking the model");
		selectModel.click();
		System.out.println("model is selected");

		SleepTheDriver.sleep(5);

	}

}