package com.Argano.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import com.Argano.enums.JSAction;
import com.Argano.reports.ExtentLogger;
import com.google.common.util.concurrent.Uninterruptibles;

public class HomePage extends ApplicationMethods {

//	private final By MenuTabLeads = By.xpath("//a[@title='Leads']");
	private final By icon_user = By.xpath("//img[@title='User']");
	private final By link_logout = By.xpath("//a[text()='Log Out']");

	public String getHomePageTitle() {
		return getPageTitle();
	}

	public LoginPage logout() {
		jsOperation(JSAction.CLICK, icon_user);
		jsOperation(JSAction.CLICK, link_logout, "user logged out");
		// click(link_logout, WaitStrategy.CLICKABLE, 10, "Logged out of application");
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		return new LoginPage();
	}

	public LeadPage clickLeadsTab() {
		navigateToTab("Leads");
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		return new LeadPage();
	}

	public AccountPage clickAccountsTab() {
		navigateToTab("Accounts");
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		return new AccountPage();
	}

	public OpportunityPage clickOpportunityTab() {
		navigateToTab("Opportunities");
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		return new OpportunityPage();
	}

//	public QuotePage clickQuoteTab() {
//		navigateToTab("Quote");
//		//ExtentLogger.info("Clicked on Accounts tab menu");
//		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
//		return new QuotePage();
//	}

}
