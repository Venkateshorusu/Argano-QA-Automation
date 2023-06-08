package com.Argano.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.Argano.driver.Driver;
import com.Argano.pages.HomePage;
import com.Argano.pages.LoginPage;

public class Sample {

	@Test
	public static void runthetest(Map<String, String> data) {
		Driver.initDriver("chrome");
		LoginPage loginpage = new LoginPage();
		HomePage homepage = new HomePage();
		homepage = loginpage.login(data.get("Username"), data.get("Password"));
		 
		 
	}
}
