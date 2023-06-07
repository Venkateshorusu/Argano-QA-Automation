package Utilities;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
 

public class CM {

	public static void clickByID(String id) {
		WebElement Wbe = Driver.driver.findElement(By.id(id));
		Wbe.click();

	}

	public static void sendKeysByID(String id, String data) {
		WebElement Wbe = Driver.driver.findElement(By.id(id));
		Wbe.sendKeys(data);

	}

	public static void sendKeysXpath(String Xpath, String data) {
		WebElement Wbe = Driver.driver.findElement(By.xpath(Xpath));
		Wbe.sendKeys(data);

	}

	public static void click(String name, String xpath, int waitinsec) {

		System.out.println("enter to click");

		try {
			WebElement Wbe = Driver.driver.findElement(By.xpath(xpath));
			System.out.println(name + "'s xpath is found ? " + Wbe.isDisplayed());

			Wbe.click();

			System.out.println(name + "'s is clicked");
		} catch (Exception NoSuchElementException) {
			Screenshots.failSS("fail  " + name);

			System.out.println(NoSuchElementException);
		}

//		ExtentReport.pass("Element get Clicked. <br /> element into: " + name);
//		ExtentReport.fail(name+"is unable click or error occured", true);

	}

	public static void click(String name, String xpath, String Sendkeys) {

		Waits.sleep(5);
		Waits.IWait(15);
		System.out.println("enter to type");

		try {
			WebElement Wbe = Driver.driver.findElement(By.xpath(xpath));
			System.out.println(name + "'s xpath is found ? " + Wbe.isDisplayed());

			Wbe.sendKeys(Sendkeys);

			System.out.println(name + "'s is entered");
		} catch (Exception NoSuchElementException) {
			Screenshots.failSS("fail  " + name);

			System.out.println(NoSuchElementException);
		}

//		ExtentReport.pass("Element get Clicked. <br /> element into: " + name);
//		ExtentReport.fail(name+"is unable click or error occured", true);

	}

	public static void clickcapture(String name, String xpath, int n) {
		Waits.sleep(4);

		System.out.println("enter to click");

		try {
			WebElement Wbe = Driver.driver.findElement(By.xpath(xpath));
			System.out.println(name + "'s xpath is found ? " + Wbe.isDisplayed());

			Wbe.click();

			System.out.println(name + "'s is clicked");
		} catch (Exception NoSuchElementException) {
			Screenshots.failSS("fail " + name);

			// TODO Auto-generated catch block

			System.out.println(NoSuchElementException);
		}

//		ExtentReport.pass("Element get Clicked. <br /> element into: " + name);
//		ExtentReport.fail(name+"is unable click or error occured", true);
	}

	public static void click(String name, String xpath) {

		Waits.EWait(10, xpath);
		WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(20));

		Actions act = new Actions(Driver.driver);

//		System.out.println("enter to click");

		WebElement Wbe = Driver.driver.findElement(By.xpath(xpath));
		act.moveToElement(Wbe);
		
		act.scrollToElement(Wbe);
		wait.until(ExpectedConditions.elementToBeClickable(Wbe));

//		System.out.println(name + "'s xpath is found ? " + Wbe.isDisplayed());

		Wbe.click();

//		System.out.println(name + "'s is clicked");

		// TODO Auto-generated catch block

	}

//		ExtentReport.pass("Element get Clicked. <br /> element into: " + name);
//		ExtentReport.fail(name+"is unable click or error occured", true);

	public static void setTxt(String element, String txt) {
//		Waits.EWait(FWConstants.ExplicitWait, element);
		Driver.driver.findElement(By.xpath(element)).sendKeys(txt);
//		ExtentReport.pass("Text entered. <br /> element into: " + element);
	}

	public static void setNumber(String element, int i) {
//		Waits.EWait(FWConstants.ExplicitWait, element);
		String s = "" + i;
		System.out.println("Data : " + s);
		Driver.driver.findElement(By.xpath(element)).sendKeys(Keys.valueOf(s));
//		ExtentReport.pass("Value entered. <br /> element into: " + element);
	}

	public static

			void sendTxt(String element, String txt) {
//		Waits.EWait(FWConstants.ExplicitWait, element);
		Driver.driver.findElement(By.xpath(element)).sendKeys(txt);
		Driver.driver.findElement(By.xpath(element)).submit();
//		ExtentReport.pass("Text Submitted. <br /> element into: " + element);
	}

	public static void jsClick(String name, String s) {
//		Waits.EWait(FWConstants.ExplicitWait, s);
		Waits.EWait(3, s);

		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		WebElement ele = Driver.driver.findElement(By.xpath(s));
		Actions act = new Actions(Driver.driver);
		act.moveToElement(ele);
		JavascriptExecutor executor = (JavascriptExecutor) Driver.driver;
		executor.executeScript("arguments[0].click();", ele);
		System.out.println(name + "jse Clicked element successfully");
		// ExtentReport.pass("Element get Clicked by JSE. <br /> element into: " + s);
	}

	public static void jsSendTxt(String s, String input) {
		// Waits.EWait(, s);
		WebElement webl = Driver.driver.findElement(By.xpath(s));
		JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
		js.executeScript("arguments[0].value='" + input + "';", webl);
//		ExtentReport.pass("Text inputed by JSE. <br /> element into: " + s);
	}

	public static void jsSendNumber(String s, int input) {
//		Waits.EWait(FWConstants.ExplicitWait, s);
		WebElement webl = Driver.driver.findElement(By.xpath(s));
		JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
		js.executeScript("arguments[0].value='" + input + "';", webl);
//		ExtentReport.pass("Value inputed by JSE. <br /> element into: " + s);
	}

	public static Boolean isSelected(String s) {
//		Waits.EWait(FWConstants.ExplicitWait, s);
		return Driver.driver.findElement(By.xpath(s)).isSelected();
	}
}