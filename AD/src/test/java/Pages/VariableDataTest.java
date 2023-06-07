package Pages;

import org.testng.annotations.Test;

import Utilities.Driver;

public class VariableDataTest {
	@Test(testName="VariableDataTab" )
	public void VariableDataTab() {
		VariableData.VariableDataTab();
	}
	@Test(testName="SelectInputFields_section" )
	public void SelectInputFields_section() {
		VariableData.SelectInputFields_section();
		
	}
	@Test(testName="ConfigureCareModule_section" )
	public void ConfigureCareModule_section() {
		VariableData.ConfigureCareModule_section();
	}
	@Test(testName="SelectLayoutField_Section" )
	public void SelectLayoutField_Section() {
		VariableData.SelectLayoutField_Section();
	}
	@Test(testName="Language_Translations_Details" )
	public void Language_Translations_Details() {
		VariableData.Language_Translations_Details();
	}
	@Test(testName="Build_Fiber_Content_Section" )
	public void Build_Fiber_Content_Section() {
		VariableData.Build_Fiber_Content_Section();
	}
	

}
