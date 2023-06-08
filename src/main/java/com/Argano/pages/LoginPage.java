package com.Argano.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import com.Argano.enums.WaitStrategy;
import com.Argano.reports.ExtentLogger;
import com.google.common.util.concurrent.Uninterruptibles;

public final class LoginPage extends ApplicationMethods {

	private final By txtLoginUsername = By.xpath("//input[@name='username']");
	private final By txtLoginPswd = By.xpath("//input[@name='pw']");
	private final By bttnLogin = By.xpath("//input[@name='Login']");

	public LoginPage enterUserName(String username) {

		sendKeys(txtLoginUsername, username, WaitStrategy.VISIBLE, 10);
		return this;
	}

	public LoginPage enterPassword(String password) {
		sendKeys(txtLoginPswd, password, WaitStrategy.VISIBLE, 10);
		return this;
	}

	public HomePage clickLogin() {
		click(bttnLogin, WaitStrategy.CLICKABLE, 10);
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		return new HomePage();
	}

	public HomePage login(String username, String password) {
		enterUserName(username).enterPassword(password).clickLogin();
		ExtentLogger.pass("Logged in as " + username);
		return new HomePage();

	}

}
