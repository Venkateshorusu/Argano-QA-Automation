package com.Argano.factory;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Argano.driver.DriverManager;
import com.Argano.enums.WaitStrategy;

public final class ExplicitWaitFactory {
	
	private ExplicitWaitFactory()
	{
		
	}
	  

	public static WebElement performExplicitWait(By by,WaitStrategy waitstrategy,int timeinsec)
	{
		WebElement element = null;
		if(waitstrategy ==WaitStrategy.CLICKABLE)
		{
			element =new WebDriverWait(DriverManager.getDriver(),timeinsec)
			.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy ==WaitStrategy.VISIBLE)
		{
			element=	new WebDriverWait(DriverManager.getDriver(),timeinsec)
			.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitstrategy ==WaitStrategy.PRESENCE)
		{
			element=	new WebDriverWait(DriverManager.getDriver(),timeinsec)
			.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy ==WaitStrategy.NONE) {
			element=	DriverManager.getDriver().findElement(by);

		}
		return element;
	}
}
