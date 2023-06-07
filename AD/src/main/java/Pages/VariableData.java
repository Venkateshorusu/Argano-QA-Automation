package Pages;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.CM;
import Utilities.Driver;
import Utilities.RandomTxt;
import Utilities.Screenshots;
import Utilities.Waits;

public class VariableData extends Driver {
	public static WebDriver driver=Driver.driver;
	public static void main(String args[]) throws Exception {
		variable();
	}

	public static void variable() throws Exception {

		LogInToAD.log();
		System.out.println("LogIn function runned");
		NewTransaction.UptoSave();
		System.out.println("UptoSave function runned");
		NewTransaction.addLineItem();
		System.out.println("addLineItem function runned");
		NewTransaction.CreateNew();
		System.out.println("CreateNew function runned");
		VariableDataTab();
		System.out.println("variableTab function runned");
		SelectInputFields_section();
		System.out.println("SelectInputFields_section function runned");
		ConfigureCareModule_section();
		System.out.println("ConfigureCareModule_section function runned");
		System.out.println("SelectLayoutField_Section function started");
		SelectLayoutField_Section();
		System.out.println("SelectLayoutField_Section function runned");
		Language_Translations_Details();
		System.out.println("Language_Translations_Details function runned");
		Build_Fiber_Content_Section();
		System.out.println(" Build_Fiber_Content_Section() function runned");

	}

	public static void jsclick(String variablename, String Xpath) {

		WebElement webele = Driver.driver.findElement(By.xpath(Xpath));
		System.out.println(webele.isDisplayed());
		JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
		executor.executeScript("arguments[0].click();", webele);
		System.out.println(" Clicked element " + variablename + "  successfully");
		Waits.IWait(5);
	}

	public static void VariableDataTab() {
		Waits.EWait(5, "//span[text()='Variable Data']");
		WebElement VariableTab = Driver.driver.findElement(By.xpath("//a//span[text()='Variable Data']"));
		JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
		executor.executeScript("arguments[0].click();", VariableTab);
		System.out.println("jse Clicked element successfully");
	}

	public static void SelectInputFields_section() {

		// WebElement Select_Input_Fields_section =
		// Driver.driver.findElement(By.xpath("//a//span[text()='Variable Data']"));

		// click("Select_Input_Fields_section ","//h3[text()='Select Input Fields']");

		WebElement Select_Input_Fields_section = Driver.driver
				.findElement(By.xpath("//h3[text()='Select Input Fields']"));
		JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
		executor.executeScript("arguments[0].click();", Select_Input_Fields_section);
		System.out.println(" Clicked element " + Select_Input_Fields_section + "  successfully");

		// jsclick("FiberModule", "//input[@id='fiber_module']");

		WebElement FiberModule = Driver.driver.findElement(By.xpath("//input[@id='fiber_module']"));
		System.out.println(FiberModule.isDisplayed());
		System.out.println("clicking the  FiberModule");
		FiberModule.click();
		System.out.println("FiberModule is clicked");

		WebElement exclusive_of_decoration = Driver.driver
				.findElement(By.xpath("//input[@id='exclusive_of_decoration']"));
		System.out.println(exclusive_of_decoration.isDisplayed());
		System.out.println("clicking the  exclusive_of_decoration");
		exclusive_of_decoration.click();
		System.out.println("exclusive_of_decoration is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

		// WebElement
		// ad_info=Driver.driver.findElement(By.xpath("//input[@id='ad_info']"));
		jsclick("ad_info", "//input[@id='ad_info']");
//		System.out.println(ad_info.isDisplayed());
//		System.out.println("clicking the  ad_info");
//		ad_info.click();
//		System.out.println("ad_info is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

		WebElement country_origin = Driver.driver.findElement(By.xpath("//input[@id='country_origin']"));
		System.out.println(country_origin.isDisplayed());
		System.out.println("clicking the  country_origin");
		country_origin.click();
		System.out.println("country_origin is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

		//WebElement CareModule = Driver.driver.findElement(By.xpath("//input[@id='care_module']"));
	//	System.out.println(CareModule.isDisplayed());
		System.out.println("clicking the  CareModule");
		CM.jsClick("CareModule", "//input[@id='care_module']");
		System.out.println("CareModule is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

//		WebElement cut_number = Driver.driver.findElement(By.xpath("//input[@id='cut_number']"));
//		System.out.println(cut_number.isDisplayed());
		System.out.println("clicking the  cut_number");
		CM.jsClick("cut_number", "//input[@id='cut_number']");
		System.out.println("cut_number is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

//		WebElement read_only_for_ad_info = Driver.driver
//				.findElement(By.xpath("//input[@id='ad_info']/..//../td[6]//input"));
//		System.out.println(read_only_for_ad_info.isDisplayed());
		System.out.println("clicking the  read_only_for_ad_info");

		CM.jsClick("read_only_for_ad_info", "//input[@id='ad_info']/..//../td[6]//input");
		System.out.println("read_only_for_ad_info is clicked");
		Waits.sleep(10);
		Waits.IWait(20); 
		
		CM.jsClick("read_only_for_cut_number", "//input[@id='cut_number']/..//../td[6]//input");
		System.out.println("read_only_for_ad_info is clicked");
		Waits.sleep(10);
		Waits.IWait(20); 

//		WebElement read_only_for_cut_number = Driver.driver
//				.findElement(By.xpath("//input[@id='cut_number']/..//../td[6]//input"));
//		System.out.println(read_only_for_cut_number.isDisplayed());
//		System.out.println("clicking the  read_only_for_cut_number");
//		read_only_for_cut_number.click();
		System.out.println("read_only_for_cut_number is clicked");
		Waits.sleep(10);
		Waits.IWait(20);

	}

	public static void ConfigureCareModule_section() {

		WebElement Configure_Care_Module_section = Driver.driver
				.findElement(By.xpath("//label//h3[text()='Configure Care Module']"));

		System.out.println(Configure_Care_Module_section.isDisplayed());
		System.out.println("clicking the  Configure_Care_Module_section");
		Configure_Care_Module_section.click();
		System.out.println("Configure_Care_Module_section is clicked");

		WebElement Wash = Driver.driver.findElement(By.xpath("//span[text()='Wash']/../..//div[3]//input"));
		System.out.println(Wash.isDisplayed());
		System.out.println("clicking the  Wash");
		Wash.click();
		System.out.println("Wash is clicked");

		Waits.IWait(10);
		WebElement Bleach = Driver.driver.findElement(By.xpath("//span[text()='Bleach']/../..//div[3]//input"));
		System.out.println(Bleach.isDisplayed());
		System.out.println("clicking the  Bleach");
		Bleach.click();
		System.out.println("Bleach is clicked");
	}

	public static void SelectLayoutField_Section() {
		WebElement Select_Layout_Field_Section = Driver.driver
				.findElement(By.xpath("//h3[text()='Select Layout Fields']"));
		System.out.println(Select_Layout_Field_Section.isDisplayed());
		System.out.println("clicking the  Select_Layout_Field_Section");
		Select_Layout_Field_Section.click();
		System.out.println("Select_Layout_Field_Section is clicked");
		Waits.sleep(5);

		WebElement fiberclass1 = 
				driver.findElement(By
		.xpath("//div[text()='Layout Field']/ancestor::div[@role='row']/../following-sibling::div//div//div[3]"));
		System.out.println(fiberclass1.isDisplayed());
		System.out.println("clicking the  fiberclass");
		fiberclass1.click();
		Waits.sleep(2);

//		Waits.sleep(2);
		System.out.println("fiberclass is clicked");
		

		Waits.sleep(5);
		Waits.IWait(10);

		WebElement fiberModuleoption = driver.findElement(By.xpath("//li//div[text()='Fiber Module']"));
		System.out.println(fiberModuleoption.isDisplayed());
		System.out.println("clicking the  fiberModuleoption");
		fiberModuleoption.click();
		System.out.println("fiberModuleoption is clicked");

		Waits.sleep(5);
		Waits.IWait(10);
		WebElement PlusIcon = driver.findElement(By.xpath(
				"//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/cpq-table-toolbar[1]/oj-toolbar[1]/div[1]/div[1]/oj-button[1]/button[1]/div[1]"));

		System.out.println(PlusIcon.isDisplayed());
		System.out.println("clicking the  PlusIcon");
		PlusIcon.click();
		System.out.println("PlusIcon is clicked");
		Waits.sleep(7);
		Waits.IWait(10);
		 
		WebElement fiberclass2 = driver.findElement(By.xpath(
				"//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]"));
//		fiberclass2.click();
		System.out.println("fiberclass2 is displayed"+fiberclass2.isDisplayed());
		System.out.println("clicking the  fiberclass2");
		fiberclass2.click();

		System.out.println("fiberclass2 is clicked");
		Waits.sleep(10);
		Waits.IWait(10);
		WebElement CareModuleoption = driver.findElement(By.xpath("//li//div[text()='Care Module']"));
		System.out.println(CareModuleoption.isDisplayed());
		System.out.println("clicking the  CareModuleoption");
		CareModuleoption.click();
		System.out.println("CareModuleoption is clicked");
		Waits.IWait(10);
		PlusIcon.click();
		Waits.sleep(10);
		Waits.IWait(10);
		WebElement fiberclass3 = driver
				.findElement(By.xpath("//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]"));
		System.out.println(fiberclass3.isDisplayed());
		System.out.println("clicking the  fiberclass3");
		fiberclass3.click();
		Waits.sleep(10);
		Waits.IWait(10);
		WebElement AD_INFO = driver.findElement(By.xpath("//div[text()='AD_INFO']"));
		System.out.println(AD_INFO.isDisplayed());
		System.out.println("clicking the  AD_INFO");
		AD_INFO.click();
		System.out.println("AD_INFO is clicked");

		PlusIcon.click();
		Waits.sleep(10);
		Waits.IWait(10);
		WebElement fiberclass4 = driver.findElement(By.xpath(
				"//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[3]"));
		System.out.println(fiberclass4.isDisplayed());
		System.out.println("clicking the  fiberclass4");
		fiberclass4.click();
		Waits.sleep(10);
		Waits.IWait(10);

		WebElement CUT_NUMBER = driver.findElement(By.xpath("//div[text()='CUT_NUMBER']"));
		System.out.println(CUT_NUMBER.isDisplayed());
		System.out.println("clicking the  CUT_NUMBER");
		CUT_NUMBER.click();
		System.out.println("CUT_NUMBER is clicked");

//		PlusIcon.click();
//		Waits.sleep(10);
//		Waits.IWait(10);
//		WebElement fiberclass5 = driver.findElement(By.xpath(
//				"//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[3]"));
//		System.out.println(fiberclass5.isDisplayed());
//		System.out.println("clicking the  fiberclass5");
//		fiberclass5.click();
//		Waits.sleep(10);
//		Waits.IWait(10);
//
//		WebElement EOD = driver.findElement(By.xpath("//div[text()='EOD']"));
//		System.out.println(EOD.isDisplayed());
//		System.out.println("clicking the  EOD");
//		EOD.click();
//		System.out.println("EOD is clicked");
//
//		PlusIcon.click();
//		Waits.sleep(10);
//		Waits.IWait(10);
//		WebElement fiberclass6 = driver.findElement(By.xpath(
//				"//body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/oj-switcher[1]/oj-defer[4]/div[1]/div[1]/div[6]/oj-collapsible[1]/div[2]/div[1]/div[1]/div[1]/div[1]/cpq-table[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[3]"));
//		System.out.println(fiberclass6.isDisplayed());
//		System.out.println("clicking the  fiberclass6");
//		fiberclass6.click();
//		Waits.sleep(10);
//		Waits.IWait(10);
//		WebElement Country_of_Origin = driver.findElement(By.xpath("//div[text()='Country of Origin']"));
//		System.out.println(Country_of_Origin.isDisplayed());
//		System.out.println("clicking the  Country_of_Origin");
//		Country_of_Origin.click();
//		System.out.println("Country_of_Origin is clicked");
	}

	public static void Language_Translations_Details() {
		Waits.IWait(50);

		System.out.println("Working fine still now");
		//String LTD="";

//		ADD LANGUAGE FOR THE CARE MODULE
		CM.click("Care_Module_field_name", "//label[text()='Field Name']/../../../../div[2]//a");
		Waits.IWait(5);

		CM.click("Care_Module_field_name_select_option", "//li//div[text()='Care Module']");  
		Waits.IWait(5);
		CM.click("Care_Module_field_nameLanguage",
				"//label[text()='Language']/../../../..//div[2]//div[@role='presentation']//div");
		Waits.IWait(5);
		//
		CM.click("Care_Module_field_nameLanguage_option", "//div[text()='Spanish']"); // spanish //
		Waits.IWait(5);
		CM.click("Add_Language_details", "//input[@id='addLanguageDetails']");
		Waits.IWait(5);

//		ADD LANGUAGE FOR THE EOD
		CM.click("EOD_field_name", "//label[text()='Field Name']/../../../../div[2]//a");
		Waits.IWait(5);

		CM.click("EOD_field_namefield_name_select_option", "//li//div[text()='EOD']"); //
		Waits.IWait(5);
		CM.click("EOD_field_nameLanguage", "//label[text()='Language']/../../../..//div[2]//div[@role='presentation']//div");
		
		CM.click("EOD_field_nameLanguage_option", "//div[text()='English']"); // spanish //
		CM.click("Add_Language_details", "//input[@id='addLanguageDetails']");
		Waits.sleep(10);
		Waits.IWait(10);
		
//		ADD LANGUAGE FOR THE COUNTRY
//		CM.click("COUNTRYfield_name", "//label[text()='Field Name']/../../../..//a");
//
//		CM.click("COUNTRYfield_name_select_option", "//li//div[text()='Country of Origin']");
//		Waits.sleep(5);
//		CM.click("COUNTRYLanguage", "//label[text()='Language']/../../../..//div[2]//div[@role='presentation']//div");
//		//
//		CM.click("COUNTRYLanguage_option", "//div[text()='Spanish']"); // spanish //
//		CM.click("Add_Language_details", "//input[@id='addLanguageDetails']");
		//Waits.EWait(15, "//h3[text()='Build Fiber Content']");

		CM.click("Build_Fiber_Content_Section", "//h3[text()='Build Fiber Content']");  
		CM.click("Select_Garment_Parts", "//option[text()='ARMHOLE']");
		Waits.IWait(10);

		CM.click("Add_Garment_Parts", "//input[@id='Add_Garment_Parts']");

		CM.click("Fiber_1field", "//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]");

		CM.click("Fiber1option", "//div[text()='COTTON']");

		CM.click("Percentage", "//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]");

		WebElement Percentag_enter_value = driver.findElement(By.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]//input"));

		Percentag_enter_value.sendKeys("100", Keys.ENTER);  

		CM.click("Build_Care_Instructions_section", "//h3[text()='Build Care Instructions']");

		CM.click("wash", "//label[text()='Wash']/../../../..//input[@role='combobox']");

		CM.click("wash_Option", "//div[text()='AFTER EACH USE, HAND WASH IN COOL WATER.']");

		CM.click("Bleach", "//label[text()='Bleach']/../../../..//a");
		Waits.sleep(5);
		CM.click("Bleach_option", "//div[text()='BLEACH AS NEEDED']");
		
		Waits.sleep(10);

		CM.click("select_The_row",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[3]//input");
		Waits.sleep(5);
		CM.click("select_the_quantity",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]");

		WebElement enterQuantity = driver.findElement(
				By.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]//input"));

		enterQuantity.sendKeys("100", Keys.ENTER); //
		CM.jsClick("Add/update_fiber_content", "//input[@value='Add/Update Fiber Content']"); 
		Waits.sleep(10);
		
		CM.click("select_The_row",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[3]//input");

		Waits.sleep(5);

		CM.jsClick("Add?Update_care_instructions", "//input[@value='Add/Update Care Instructions']");

		Waits.sleep(5);
		
		CM.click("EODclass", "//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[7]");
		
		CM.click("EODoption","//div[text()='EXCLUSIVE OF DECORATION']");
		
		 

		 
		 

		CM.click("country_origin", "//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[9]");
		Waits.sleep(5);

		List<WebElement> country_originotpions = driver
				.findElements(By.xpath("//div[text()='Made in Cambodia']/../../../ul/li"));
		int country_originotpionssize = country_originotpions.size();
		//System.out.println(country_originotpions);
		System.out.println(country_originotpionssize);

		CM.click("EODoptionselect", "//div[text()='Made in Cambodia']/../../../ul/li["
				+ RandomTxt.randomInt(country_originotpionssize)+ "]");

		//
		CM.click("Validate", "//span[text()='Validate']"); //
//		  
		Waits.sleep(10);
		CM.click("Add_To_Transaction", "//span[text()=' Add to Transaction']");

	}

	public static void Build_Fiber_Content_Section() {
		
//		Waits.EWait(15, "//h3[text()='Build Fiber Content']");
//
//		CM.click("Build_Fiber_Content_Section", "//h3[text()='Build Fiber Content']");  

		CM.click("Select_Garment_Parts", "//option[text()='ARMHOLE']");
		Waits.IWait(10);

		CM.click("Add_Garment_Parts", "//input[@id='Add_Garment_Parts']");

		CM.click("Fiber_1", "//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]");

		CM.click("Fiber1option", "//div[text()='COTTON']");

		CM.click("Percentage", "//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]");

		WebElement Percentag_enter_value = driver.findElement(By.xpath("//div[text()='Garment Part']/../../../../../..//div[@role='rowgroup'][2]//div//div[5]//input"));

		Percentag_enter_value.sendKeys("100", Keys.ENTER);  

		CM.click("Build_Care_Instructions_section", "//h3[text()='Build Care Instructions']");

		CM.click("wash", "//label[text()='Wash']/../../../..//input[@role='combobox']");

		CM.click("wash_Option", "//div[text()='AFTER EACH USE, HAND WASH IN COOL WATER.']");

		CM.click("Beach", "//label[text()='Bleach']/../../../..//a");
		Waits.sleep(5);
		CM.click("Bleach_option", "//div[text()='BLEACH AS NEEDED']");
		
		Waits.sleep(10);

		CM.click("select_The_row",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[3]//input");
		Waits.sleep(5);
		CM.click("select_the_quantity",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]");

		WebElement enterQuantity = driver.findElement(
				By.xpath("//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[4]//input"));

		enterQuantity.sendKeys("100", Keys.ENTER); //
		CM.jsClick("Add/update_fiber_content", "//input[@value='Add/Update Fiber Content']"); 
		Waits.sleep(10);
		
		CM.click("select_The_row",
				"//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[3]//input");

		Waits.sleep(5);

		CM.jsClick("Add?Update_care_instructions", "//input[@value='Add/Update Care Instructions']");

		Waits.sleep(5);
		Waits.EWait(5, "//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[7]");

		CM.click("EODclass", "//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[7]");

		Waits.sleep(5);
		

		List<WebElement> EODoption = driver.findElements(By.xpath("//div[text()='EXCLUSIVE OF DECORATION']/../../../ul/li"));
		int EODoptionsize = EODoption.size();
		//System.out.println(EODoption);
		System.out.println(EODoptionsize-1);

		CM.click("EODoptionselect",
				"//div[text()='EXCLUSIVE OF DECORATION']/../../../ul/li[" +RandomTxt.randomInt(EODoptionsize+1)+"]");

		CM.click("country_origin", "//div[text()='Quantity']/../../../../../..//div[@role='rowgroup'][2]//div//div[9]");
		Waits.sleep(5);

		List<WebElement> country_originotpions = driver
				.findElements(By.xpath("//div[text()='Made in Cambodia']/../../../ul/li"));
		int country_originotpionssize = country_originotpions.size();
		//System.out.println(country_originotpions);
		System.out.println(country_originotpionssize);

		CM.click("EODoptionselect", "//div[text()='Made in Cambodia']/../../../ul/li["
				+ RandomTxt.randomInt(country_originotpionssize)+ "]");

		//
		CM.click("Validate", "//span[text()='Validate']"); //
//		  
		Waits.sleep(10);
		CM.click("Add_To_Transaction", "//span[text()=' Add to Transaction']");
//		  
		 
	}

}
