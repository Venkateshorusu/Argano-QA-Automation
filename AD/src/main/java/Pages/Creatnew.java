package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CM;
import Utilities.Driver;
import Utilities.RandomTxt;
import Utilities.Waits;

public class Creatnew {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = Driver.driver;
//		 
		
		Creatnew.productSpecification();
	}

	/**
	 * @throws Exception 
	 * 
	 */
	public static void productSpecification() throws Exception {
		WebcentersynforExistingQuote.openExistingQuote();
		NewTransaction.addLineItem();
		Waits.EWait(10, "//input[@id='copyCustomerSearchData']");
//		Creat new
		driver = Driver.driver;
		WebElement CreatNew = driver.findElement(By.xpath("//input[@id='copyCustomerSearchData']"));
		System.out.println(CreatNew.isDisplayed());
		System.out.println("clicking the CreatNew");
		CreatNew.click();

		WebElement CustomerItemNumber = driver
				.findElement(By.xpath("//label[text()='Customer Item Number']/../../../../..//input"));
		System.out.println(CustomerItemNumber.isDisplayed());
		String Customer_Item_Number = RandomTxt.randomStr(3) + " Kaushik ";
		// +RandomTxt.randomStr(3);
		CustomerItemNumber.sendKeys(Customer_Item_Number);
		System.out.println("CustomerItemNumber is entered");

//			Variable Data 
		WebElement VariableData = Driver.driver
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

//			DSS Options
		CM.click("DSS_Options", "//div[text()='Trang Palmer'] ");

		Waits.sleep(3);
//			GPD
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

//			Avery Product Category
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

//			Avery Product Line
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

//			Avery Product Type
		WebElement AveryProductType = driver
				.findElement(By.xpath("//label[text()='Avery Product Type']/../../../..//span//a"));
		System.out.println(AveryProductType.isDisplayed());
		AveryProductType.click();
		System.out.println("AveryProductType is clicked");

		WebElement AveryProductTypeOptionSelect = driver.findElement(By.xpath("//div[text()='COATED COTTON']"));
		System.out.println(AveryProductTypeOptionSelect.isDisplayed());
		AveryProductTypeOptionSelect.click();
		System.out.println("AveryProductTypeOptionSelect is clicked");

//			press Type
		WebElement pressType = driver
				.findElement(By.xpath("//label[text()='Press Type']/../../../following-sibling::div//a"));
		System.out.println(pressType.isDisplayed());
		pressType.click();
		System.out.println("pressType is clicked");

//			press Type Option Select
		WebElement pressTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Rotary']"));
		System.out.println(pressTypeOptionSelect.isDisplayed());
		pressTypeOptionSelect.click();
		System.out.println("pressTypeOptionSelect is clicked");

//			Tape style number
		WebElement TapeStyleNumber = driver
				.findElement(By.xpath("//label[text()='Tape Style Number']/../../../following-sibling::div//a"));
		System.out.println(TapeStyleNumber.isDisplayed());
		TapeStyleNumber.click();
		System.out.println("TapeStyleNumber is clicked");

//			Tape Style Number Select Option
		WebElement TapeStyleNumberSelectOption = driver
				.findElement(By.xpath("//div[text()='AT009T | white | XSF coating']"));
		System.out.println(TapeStyleNumberSelectOption.isDisplayed());
		TapeStyleNumberSelectOption.click();
		System.out.println("TapeStyleNumberSelectOption is clicked");

//			Overall Width
		WebElement Overall_Width = driver.findElement(By.xpath("//input[@id='overallWidthInches|input']"));
		System.out.println(Overall_Width.isDisplayed());
		Overall_Width.click();
		Overall_Width.sendKeys("28");
		Overall_Width.sendKeys(Keys.ENTER);
		System.out.println("Overall_Width is clicked");

//			NOTE
		WebElement NoteSection = driver.findElement(By.xpath("//div[@id='oj-collapsible-13-header']"));
		System.out.println(NoteSection.isDisplayed());
		NoteSection.click();

//			ArtProofNote
		WebElement ArtProofNote = driver.findElement(By.xpath("//textarea[@id='artProofNote_PL|input']"));
		System.out.println(ArtProofNote.isDisplayed());
		ArtProofNote.sendKeys("Kaushik123	" + Customer_Item_Number + "	 ArtProofNote ");
		System.out.println("ArtProofNote is entered");

//			Finished Width
		WebElement FinishedWidth = driver.findElement(By.xpath("//label[text()='Finished Width']/../../../..//input"));
		System.out.println(FinishedWidth.isDisplayed());
		// FinishedWidth.click();
		FinishedWidth.sendKeys("28");
		FinishedWidth.sendKeys(Keys.ENTER);
		System.out.println("FinishedWidth is entered");

//			Finished Length
		WebElement FinishedLength = driver.findElement(By.xpath("//input[@id='finishedLength_M|input']"));
		System.out.println(FinishedLength.isDisplayed());
		FinishedLength.click();
		FinishedLength.sendKeys("7");
		FinishedLength.sendKeys(Keys.ENTER);
		System.out.println("FinishedLength is entered");

//			

//			Cut Type
		Waits.IWait(10);
		WebElement CutType = driver.findElement(By.xpath("//label[text()='Cut Type']/../../../..//a"));
		System.out.println(CutType.isDisplayed());
		CutType.click();
		System.out.println("CutType is clicked");

		WebElement CutTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Angle Cut']"));
		System.out.println(CutTypeOptionSelect.isDisplayed());
		CutTypeOptionSelect.click();
		System.out.println("CutTypeOptionSelect is clicked");

//			Fold Type
		WebElement FoldType = driver
				.findElement(By.xpath("//label[text()='Fold Type']/../../../../..//span//a[@role='presentation']"));
		System.out.println(FoldType.isDisplayed());
		FoldType.click();
		System.out.println("FoldType is clicked");

		WebElement FoldTypeOptionSelect = driver.findElement(By.xpath("//span[text()='Center Fold']"));
		System.out.println(FoldTypeOptionSelect.isDisplayed());
		FoldTypeOptionSelect.click();
		System.out.println("FoldTypeOptionSelect is clicked");

//			Front Number Inks
		WebElement FrontNumberInks = driver.findElement(By.xpath("//input[@id='frontNumberInks|input']"));
		System.out.println(FrontNumberInks.isDisplayed());
		FrontNumberInks.sendKeys("3");
		System.out.println("FrontNumberInks is entered");
		Waits.IWait(10);

//			clicking the status section
		driver.findElement(By.xpath("//h3[text()='Status']")).click();

//			selecting the GPD Config Attributes Complete 
		driver.findElement(By.xpath("//label[text()='GPD Config Attributes Complete']/../../../../..//input")).click();

//			Validation 
		WebElement Validate = driver.findElement(By.xpath("//span[text()='Validate']"));
		System.out.println(Validate.isDisplayed());
		Validate.click();
		System.out.println("Validated Successfully ....."); 
		Waits.sleep(15);
	}

}
