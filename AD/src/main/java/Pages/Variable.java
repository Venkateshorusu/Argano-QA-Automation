package Pages;

import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.CM;
import Utilities.Driver;
import Utilities.ReadPropertyFile;
import Utilities.Waits;

public class Variable {
	public static WebDriver driver = Driver.driver;
	static Properties vfile = ReadPropertyFile.read("C:\\eclipse\\AD\\src\\main\\java\\Resources\\Variable.properties");

	public static void main(String[] args) throws Exception {
		LogInToAD.intializeBrower();

		LogInToAD.log();

		WebcentersynforExistingQuote.openExistingQuote();
		WebcentersynforExistingQuote.reconfigure();

		variablemethods();

		System.out.println("Completed the floww -------------------------------------------");

	}

	/**
	 * 
	 */ 
	public static void variablemethods() {
		SelectInputFields();

		configure_CareModule();

		selectLayoutField();

		languageTranslationDetailsSection();

		build_Fiber_Content_Section();

		build_Care_Instructions_section();

		variable_Data_Input_Entry();
	}

	/**
	 * @throws Exception
	 * @throws InterruptedException
	 */
	public static void vdc() throws Exception, InterruptedException {
		LogInToAD.log();

		WebcentersynforExistingQuote.openExistingQuoteAndReConfigureButton();
//		Waits.EWait(20, "//span[text()='Variable Data']");
//		CM.click("VARIABLEDATA",  "//span[text()='Variable Data']");

		CM.click("VDComplete", vfile.getProperty("VDComplete"));
		Waits.sleep(10);
		CM.click("Save_And_Return", vfile.getProperty("Save_And_Return"));
		Waits.sleep(10);
		Waits.EWait(20, "//label[text()='RBO Code*']");
		Driver.driver.quit();
	}

	/**
	 * 
	 */
	public static void variable_Data_Input_Entry() {
		Waits.sleep(5);
		Waits.sleep(5);
		CM.click("select_The_row", vfile.getProperty("select_The_row"));
		Waits.sleep(5);
		CM.click("select_the_quantity", vfile.getProperty("select_the_quantity"));
		Waits.sleep(5);
		CM.sendKeysXpath(vfile.getProperty("enterQuantity"), "100");
		Waits.sleep(5);
		CM.jsClick("update_fiber_content", vfile.getProperty("update_fiber_content"));
		Waits.sleep(5);
		CM.click("select_The_row", vfile.getProperty("select_The_row"));
		Waits.sleep(5);
		CM.jsClick("Update_care_instructions", vfile.getProperty("Update_care_instructions"));
		Waits.sleep(5);
		CM.click("select_The_row", vfile.getProperty("select_The_row"));
		Waits.sleep(5);
		CM.click("EODclass", vfile.getProperty("EODclass"));
		Waits.sleep(5);
		CM.click("EODoption", vfile.getProperty("EODoption"));
		Waits.sleep(5);
		CM.click("country_origin", vfile.getProperty("country_origin"));
		Waits.sleep(5);
		CM.click("country_originotpions", vfile.getProperty("country_originotpions"));
		Waits.sleep(5);

		CM.click("Validate", vfile.getProperty("Validate"));
		CM.click("Validate", vfile.getProperty("Validate"));
		
		Waits.EWait(3, vfile.getProperty("Add_To_Transaction"));
		
		CM.click("Add To Transaction", vfile.getProperty("Add_To_Transaction"));
//		Waits.sleep(15);
//		Actions a = new Actions(Driver.driver);
//		WebElement VariableDataTAB = Driver.driver.findElement(By.xpath(vfile.getProperty("VariableDataTAB")));
//
//		a.scrollToElement(VariableDataTAB).build().perform();
//		CM.jsClick("VDComplete", vfile.getProperty("VDComplete"));
//		Waits.sleep(5);
//		CM.click("VDComplete", vfile.getProperty("VDComplete"));
//		Waits.sleep(15);
//		CM.click("Save_And_Return", vfile.getProperty("Save_And_Return"));
//		Waits.sleep(10);

	}

	/**
	 * 
	 */

	/**
	 * 
	 */
	public static void build_Care_Instructions_section() {
		Waits.sleep(5);
		CM.click("Build_Care_Instructions_section", vfile.getProperty("Build_Care_Instructions_section"));
		Waits.sleep(5);
		CM.click("washdropdown", vfile.getProperty("washdropdown"));
//		Waits.sleep(5);
		CM.click("wash_Option", vfile.getProperty("wash_Option"));
		Waits.sleep(5);
		CM.click("Bleachdropdown", vfile.getProperty("Bleachdropdown"));
//		Waits.sleep(5);
		CM.click("Bleach_option", vfile.getProperty("Bleach_option"));
	}
 
	/**
	 * 
	 */
	public static void build_Fiber_Content_Section() {
		Waits.sleep(5);
		CM.click("Build_Fiber_Content_Section", vfile.getProperty("Build_Fiber_Content_Section"));
		Waits.sleep(5);
		CM.click("Select_Garment_Parts", vfile.getProperty("Select_Garment_Parts"));
		Waits.sleep(5);
		CM.click("Add_Garment_Parts", vfile.getProperty("Add_Garment_Parts"));
		Waits.sleep(5);
		CM.click("Fiber_1field", vfile.getProperty("Fiber_1field"));
		Waits.sleep(5);
		CM.click("Fiber1option", vfile.getProperty("Fiber1option"));
		Waits.sleep(5);
		CM.click("Percentage_field", vfile.getProperty("Percentage_field"));
		Waits.sleep(5);
		CM.sendKeysXpath(vfile.getProperty("percentage_input"), "100");

	}

	/**
	 * 
	 */

	public static void languageTranslationDetailsSection() {

		// EOD
		/**
		 * try { Waits.sleep(10); CM.click("field_name",
		 * vfile.getProperty("field_name")); Waits.sleep(5); CM.click("EOD_field_name",
		 * vfile.getProperty("EOD_field_name")); Waits.sleep(5);
		 * CM.click("Languagefield", vfile.getProperty("Languagefield"));
		 * Waits.sleep(5); CM.jsClick("LanguageforEnglish",
		 * vfile.getProperty("LanguageforEnglish")); Waits.sleep(5); } catch (Exception
		 * e) {
		 * 
		 * Waits.sleep(10); CM.click("field_name", vfile.getProperty("field_name"));
		 * Waits.sleep(5); CM.click("EOD_field_name",
		 * vfile.getProperty("EOD_field_name")); Waits.sleep(5);
		 * CM.click("Languagefield", vfile.getProperty("Languagefield"));
		 * Waits.sleep(5); CM.jsClick("LanguageforEnglish",
		 * vfile.getProperty("LanguageforEnglish")); Waits.sleep(5);
		 * e.printStackTrace(); } CM.click("Add_Language_detailsButton",
		 * vfile.getProperty("Add_Language_detailsButton"));
		 * 
		 * // Country_of_Origin try { Waits.sleep(7); CM.click("field_name",
		 * vfile.getProperty("field_name")); Waits.sleep(5);
		 * CM.click("Country_of_Origin", vfile.getProperty("Country_of_Origin"));
		 * Waits.sleep(5); CM.click("Languagefield",
		 * vfile.getProperty("Languagefield")); Waits.sleep(5);
		 * CM.click("LanguageforEnglish", vfile.getProperty("LanguageforEnglish")); }
		 * catch (Exception e) {
		 * 
		 * Waits.sleep(7); CM.click("field_name", vfile.getProperty("field_name"));
		 * Waits.sleep(5); CM.click("Country_of_Origin",
		 * vfile.getProperty("Country_of_Origin")); Waits.sleep(5);
		 * CM.click("Languagefield", vfile.getProperty("Languagefield"));
		 * Waits.sleep(5); CM.click("LanguageforEnglish",
		 * vfile.getProperty("LanguageforEnglish"));
		 * 
		 * e.printStackTrace(); } Waits.sleep(5); CM.click("Add_Language_detailsButton",
		 * vfile.getProperty("Add_Language_detailsButton"));
		 * 
		 * // AD_INFO try { Waits.sleep(7); CM.click("field_name",
		 * vfile.getProperty("field_name")); Waits.sleep(5); CM.click("AD_INFO",
		 * vfile.getProperty("AD_INFO")); Waits.sleep(5); CM.click("Languagefield",
		 * vfile.getProperty("Languagefield")); Waits.sleep(5);
		 * CM.click("LanguageforSpanish", vfile.getProperty("LanguageforSpanish")); }
		 * catch (Exception e) { Waits.sleep(7); CM.click("field_name",
		 * vfile.getProperty("field_name")); Waits.sleep(5); CM.click("AD_INFO",
		 * vfile.getProperty("AD_INFO")); Waits.sleep(5); CM.click("Languagefield",
		 * vfile.getProperty("Languagefield")); Waits.sleep(5);
		 * CM.click("LanguageforSpanish", vfile.getProperty("LanguageforSpanish"));
		 * 
		 * e.printStackTrace(); } Waits.sleep(5); CM.click("Add_Language_detailsButton",
		 * vfile.getProperty("Add_Language_detailsButton")); // CUT_NUMBER try {
		 * Waits.sleep(7); CM.click("field_name", vfile.getProperty("field_name"));
		 * Waits.sleep(5); CM.click("CUT_NUMBER", vfile.getProperty("CUT_NUMBER"));
		 * Waits.sleep(5); CM.click("Languagefield",
		 * vfile.getProperty("Languagefield")); Waits.sleep(5);
		 * CM.click("LanguageforSpanish", vfile.getProperty("LanguageforSpanish")); }
		 * catch (Exception e) { Waits.sleep(7); CM.click("field_name",
		 * vfile.getProperty("field_name")); Waits.sleep(5); CM.click("CUT_NUMBER",
		 * vfile.getProperty("CUT_NUMBER")); Waits.sleep(5); CM.click("Languagefield",
		 * vfile.getProperty("Languagefield")); Waits.sleep(5);
		 * CM.click("LanguageforSpanish", vfile.getProperty("LanguageforSpanish"));
		 * e.printStackTrace(); } Waits.sleep(5); CM.click("Add_Language_detailsButton",
		 * vfile.getProperty("Add_Language_detailsButton"));
		 */// Care_Module
		try {
			Waits.sleep(7);
			CM.click("field_name", vfile.getProperty("field_name"));
//			Waits.sleep(5);
			CM.click("Care_Module", vfile.getProperty("Care_Module"));
			Waits.sleep(5);
			CM.click("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforEnglish"));
			Waits.sleep(5);
			CM.click("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforSpanish"));
		} catch (Exception e) {
			Waits.sleep(7);
			CM.click("field_name", vfile.getProperty("field_name"));
			Waits.sleep(5);
			CM.click("Care_Module", vfile.getProperty("Care_Module"));
			Waits.sleep(5);
			CM.click("Languagefield", vfile.getProperty("Languagefield"));
			Waits.sleep(5);
			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforEnglish"));
			Waits.sleep(5);
			CM.click("Languagefield", vfile.getProperty("Languagefield"));
			Waits.sleep(5);
			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforSpanish"));
			e.printStackTrace();
		}
		Waits.sleep(5);
		CM.click("Add_Language_detailsButton", vfile.getProperty("Add_Language_detailsButton"));
//		// Fiber_Module
//		try {
//			Waits.sleep(7);
//			CM.jsClick("field_name", vfile.getProperty("field_name"));
//			Waits.sleep(5);
//			CM.jsClick("Fiber_Module", vfile.getProperty("Fiber_Module"));
//			Waits.sleep(5);
//			CM.jsClick("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
//			CM.jsClick("LanguageforEnglish", vfile.getProperty("LanguageforEnglish"));
//			Waits.sleep(5);
//			CM.jsClick("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
//			CM.jsClick("LanguageforEnglish", vfile.getProperty("LanguageforSpanish"));
//		} catch (Exception e) {
//			Waits.sleep(7);
//			CM.click("field_name", vfile.getProperty("field_name"));
//			Waits.sleep(5);
//			CM.click("Fiber_Module", vfile.getProperty("Fiber_Module"));
//			Waits.sleep(5);
//			CM.click("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
//			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforEnglish"));
//			Waits.sleep(5);
//			CM.click("Languagefield", vfile.getProperty("Languagefield"));
//			Waits.sleep(5);
//			CM.click("LanguageforEnglish", vfile.getProperty("LanguageforSpanish"));
//			 
//		}
//		Waits.sleep(5);
//		CM.click("Add_Language_detailsButton", vfile.getProperty("Add_Language_detailsButton"));
	}

	/**
	 * 
	 */
	public static void selectLayoutField() {
		Waits.sleep(5);
		CM.click("Select_Layout_Field_Section", vfile.getProperty("Select_Layout_Field_Section"));
		Waits.sleep(5);

		try {
			CM.click("fiberclass1", vfile.getProperty("fiberclass1"));
//			Waits.sleep(8);
			Waits.EWait(1, vfile.getProperty("fiberModuleoption"));
			CM.click("fiberModuleoption", vfile.getProperty("fiberModuleoption"));
//			Waits.sleep(5);

		} catch (Exception e) {

			e.printStackTrace();
			CM.click("fiberclass1", vfile.getProperty("fiberclass1"));
			Waits.sleep(8);
			CM.click("fiberModuleoption", vfile.getProperty("fiberModuleoption"));
			Waits.sleep(5);
		}

		CM.jsClick("PlusIcon", vfile.getProperty("PlusIcon"));
		Waits.sleep(5);

		try {
			CM.click("fiberclass2", vfile.getProperty("fiberclass2"));
//			Waits.sleep(8);
			Waits.EWait(1, vfile.getProperty("CareModuleoption"));
			CM.click("CareModuleoption", vfile.getProperty("CareModuleoption"));
//			Waits.sleep(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CM.click("fiberclass2", vfile.getProperty("fiberclass2"));
			Waits.sleep(5);
			CM.click("CareModuleoption", vfile.getProperty("CareModuleoption"));
			Waits.sleep(5);

		}

		CM.jsClick("PlusIcon", vfile.getProperty("PlusIcon"));
		Waits.sleep(5);

		try {
			CM.click("fiberclass3", vfile.getProperty("fiberclass3"));
//			Waits.sleep(8);
			Waits.EWait(1, vfile.getProperty("AD_INFO"));
			CM.click("AD_INFO", vfile.getProperty("AD_INFO"));
			Waits.sleep(5);
		} catch (Exception e) {
			CM.click("fiberclass3", vfile.getProperty("fiberclass3"));
			Waits.sleep(5);
			CM.click("AD_INFO", vfile.getProperty("AD_INFO"));
			Waits.sleep(5); 

		}

		CM.jsClick("PlusIcon", vfile.getProperty("PlusIcon"));
		Waits.sleep(5);

		try {
			CM.click("fiberclass4", vfile.getProperty("fiberclass4"));
//			Waits.sleep(8);

			Waits.EWait(1, vfile.getProperty("CUT_NUMBER"));
			CM.click("CUT_NUMBER", vfile.getProperty("CUT_NUMBER"));
			Waits.sleep(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CM.click("fiberclass4", vfile.getProperty("fiberclass4"));
			Waits.sleep(8);
			CM.click("CUT_NUMBER", vfile.getProperty("CUT_NUMBER"));
			Waits.sleep(5);

		}

		CM.jsClick("PlusIcon", vfile.getProperty("PlusIcon"));
		Waits.sleep(5);

		try {
			CM.click("fiberclass5", vfile.getProperty("fiberclass5"));
			Waits.sleep(8);
			Waits.EWait(1, vfile.getProperty("EOD"));
			CM.click("EOD", vfile.getProperty("EOD"));
//			Waits.sleep(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CM.click("fiberclass5", vfile.getProperty("fiberclass5"));
//			Waits.sleep(8);
			CM.click("EOD", vfile.getProperty("EOD"));
			Waits.sleep(5);

		}

		CM.jsClick("PlusIcon", vfile.getProperty("PlusIcon"));
		Waits.sleep(5);

		try {
			CM.jsClick("fiberclass6", vfile.getProperty("fiberclass6"));
			CM.click("fiberclass6", vfile.getProperty("fiberclass6"));
//			Waits.sleep(8);
			Waits.EWait(1, vfile.getProperty("Country_of_Origin"));
			CM.click("Country_of_Origin", vfile.getProperty("Country_of_Origin"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CM.click("fiberclass6", vfile.getProperty("fiberclass6"));
			Waits.sleep(5);
			CM.click("Country_of_Origin", vfile.getProperty("Country_of_Origin"));

		}
	}

	/**
	 * This method will select the Wash and Bleach options in Configuration Care
	 * module under the variable tab
	 * 
	 * 
	 */
	public static void configure_CareModule() {
		CM.click("Configure_Care_Module_section", vfile.getProperty("Configure_Care_Module_section"));
		CM.click("Wash", vfile.getProperty("Wash"));
		CM.click("Bleach", vfile.getProperty("Bleach"));
	}

	/**
	 * This is the method which will select the 6 inputs under the Select Input
	 * Fields section in the Variable Tab
	 * 
	 * 
	 */
	public static void SelectInputFields() {

		Waits.EWait(20, "//span[text()='Variable Data']");
		Waits.sleep(10);
		Actions a = new Actions(Driver.driver);
		WebElement variableTab = Driver.driver.findElement(By.xpath(vfile.getProperty("VariableDataTAB")));
//		a.moveToElement(variableTab).build().perform();
		a.scrollToElement(variableTab).build().perform();
		CM.jsClick("VariableDataTab", vfile.getProperty("VariableDataTAB"));
		Waits.sleep(5);
		CM.jsClick("Select_Input_Fields_section", vfile.getProperty("Select_Input_Fields_section"));
		Waits.sleep(5);
		CM.click("FiberModule", vfile.getProperty("FiberModule"));
		Waits.sleep(5);
		CM.click("exclusive_of_decoration", vfile.getProperty("exclusive_of_decoration"));
		Waits.sleep(5);
		CM.jsClick("ad_info", vfile.getProperty("ad_info"));
		Waits.sleep(5);
		CM.click("country_origin", vfile.getProperty("country_origin1"));
		Waits.sleep(5);
		CM.jsClick("CareModule", vfile.getProperty("CareModule"));
		Waits.sleep(5);
		CM.jsClick("cut_number", vfile.getProperty("cut_number"));
		Waits.sleep(5);
		CM.jsClick("read_only_for_ad_info", vfile.getProperty("read_only_for_ad_info"));
		Waits.sleep(5);
		CM.jsClick("read_only_for_cut_number", vfile.getProperty("read_only_for_cut_number"));
	}

}
