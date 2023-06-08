package com.Argano.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.Argano.constants.FrameworkConstants;
import com.Argano.enums.ConfigProperties;
import com.Argano.reports.ExtentLogger;
import com.Argano.utlis.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {

	}

	public static void initDriver(String browser) {
		if (Objects.isNull(DriverManager.getDriver())) {
			 
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--disable-notifications");
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver(chromeOptions));
			} else if (browser.equalsIgnoreCase("firefox")) {
				FirefoxOptions firefox=new FirefoxOptions();
				WebDriverManager.firefoxdriver().setup();
				DriverManager.setDriver(new FirefoxDriver(firefox)); 

			} else if (browser.equalsIgnoreCase("Edge")) {
				EdgeOptions edge=new EdgeOptions();
				WebDriverManager.edgedriver().setup();
				DriverManager.setDriver(new  EdgeDriver(edge));

			} 
			
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(FrameworkConstants.getImplicitywaittime(),
					TimeUnit.SECONDS);
		DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
