package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CM;
import Utilities.Driver;
import Utilities.GetPropertyFile;
import Utilities.Waits;

public class LogInToAD {
	public static void main(String[] args) throws Exception {
		intializeBrower();
		log();
	}

	public static void log() throws Exception {
		 
		WebDriver driver=Driver.driver;

		Driver.driver.get(GetPropertyFile.URL);

		System.out.println("opening browser");

		CM.click("Login", "//a[text()='Login']");

		System.out.println("clicking the login button");

		System.out.println("login page opend");

		Waits.IWait(5);

		WebElement username = Driver.driver.findElement(By.id("username"));

		WebElement password = Driver.driver.findElement(By.id("psword"));

		System.out.println("entering user name");

		username.sendKeys(GetPropertyFile.username);

		System.out.println("sneding password");

		password.sendKeys(GetPropertyFile.password);

		System.out.println("clicking the login");

		WebElement login = Driver.driver.findElement(By.id("log_in"));

		login.click();

		 

		 

	}

	/**
	 * @return
	 * @throws Exception
	 */
	public static WebDriver intializeBrower() throws Exception {
		GetPropertyFile.getProperties();

		WebDriver driver = Driver.getDriver(GetPropertyFile.browser1);
//		properties p=ReadPropertie
		System.out.println(GetPropertyFile.browser1);
		driver.manage().window().maximize();
		return driver;
	}
	
}
