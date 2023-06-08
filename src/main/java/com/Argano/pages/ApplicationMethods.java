package com.Argano.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import com.Argano.enums.JSAction;
import com.Argano.enums.WaitStrategy;
import com.Argano.factory.ExplicitWaitFactory;
import com.Argano.utlis.DynamicXpathUtlis;
import com.google.common.util.concurrent.Uninterruptibles;

public class ApplicationMethods extends BasePage {

	protected final By txtPopUpTitles = By.xpath("//div[@class='actionBody']//h2");
	private final static String tabXpath = "//a[@title='%s']";
	protected final By txtSucessMsg = By.xpath("/html/body/div[6]/div/div/div");
	protected final By txtquoteSucessMsg = By.xpath("/html/body/div[6]/div/div[2]/div");
	protected final By globalSearchDropdown = By.xpath("//input[@role='combobox']");
	protected final String globalSearchObjectXpath = "//div[@role='listbox']//ul//li//span[@title='%s'][1]";
	protected final By txtGlobalSearchBox = By.xpath("//button[contains(text(),'Search.')]");
	protected final By txtGlobalSearch = By.xpath("//input[contains(@Placeholder,'Search.')]");
	protected final By section_Related = By.xpath("//li[@title='Related']//a");
	protected final String list_RelatedSection = "//slot/span[contains(text(),'%s')]";

	protected String getPopUpTitle() {
		return getText(txtPopUpTitles, 15);

	}

	protected static void navigateToTab(String tabname) {
		String tabNewXpath = DynamicXpathUtlis.getXpath(tabXpath, tabname);
		jsOperation(JSAction.CLICK, By.xpath(tabNewXpath), "Navigated to tab "+ tabname);

	}

	protected String getSuccessText() {
		return getText(txtSucessMsg, 10);
	}

	protected String getquoteSuccessText() {
		return getText(txtquoteSucessMsg, 10);
	}

	public String getSuccessMessage() {
		String sucessMsg;
		ExplicitWaitFactory.performExplicitWait(txtSucessMsg, WaitStrategy.VISIBLE, 10);
		sucessMsg = getText(txtSucessMsg, 50);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		return sucessMsg;
	}

	public void globalSearch(String searchKeyword) {
		// click(globalSearchDropdown, WaitStrategy.CLICKABLE, 10);
		// String globalSearchObjectSelection =
		// DynamicXpathUtlis.getXpath(globalSearchObjectXpath, objectName);
		// jsOperation(JSAction.SCROLLTOVIEW, By.xpath(globalSearchObjectSelection));
		System.out.print(searchKeyword);
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		click(txtGlobalSearchBox, WaitStrategy.CLICKABLE, 30);
		sendKeys(txtGlobalSearch, searchKeyword, WaitStrategy.VISIBLE, 10);
		click(By.xpath("//span[@title='" + searchKeyword + "']"), WaitStrategy.CLICKABLE, 15,
				"Searched for record " + searchKeyword + " and ");
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		// clear(By.xpath("//button[contains(@aria-label,'Search')]"),
		// WaitStrategy.CLICKABLE, 10);

	}

	public void getRelatedSection(String section) {
		click(section_Related, WaitStrategy.CLICKABLE, 10);
		String sectionValueXpath = DynamicXpathUtlis.getXpath(list_RelatedSection, section);
		click(By.xpath(sectionValueXpath), WaitStrategy.CLICKABLE, 10, "Related " + section);
	}

}
