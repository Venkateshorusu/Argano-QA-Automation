package Utilities;




import java.time.*;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	
    //------------------------- Explicit wait ---------------------------------//
	
    public static void EWait(int i, String xpath) {
    	
    	Duration dr = Duration.ofSeconds(i*20);
        WebDriverWait wait =new  WebDriverWait(Driver.driver, dr);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    } 
    
    //------------------------- Implicit wait --------------------------------//
    
	@SuppressWarnings("deprecation")
	public static void IWait(int i) {
        Driver.driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }
	
    //------------------------- Sleep ----------------------------------------//
	
    public static void sleep(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}