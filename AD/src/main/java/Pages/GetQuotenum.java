package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.Driver;
import Utilities.Waits;

public class GetQuotenum {
	public static void main(String[] args) throws Exception {
		LogInToAD.log();
		
		
		WebElement QuoteManager = Driver.driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]/a"));
		System.out.println("Quote Manager is clicking");
		QuoteManager.click();
		System.out.println("Quote Manager is clicked");

		WebElement NewTransaction = Driver.driver.findElement(By.xpath("//a[text()='New Transaction']"));
		System.out.println("New Transaction is clicking");
		NewTransaction.click();
		Waits.sleep(10);
		System.out.println("New Transaction page is opened");

		Waits.EWait(10, "//input[@id='transactionID_t|input']");
		WebElement quotenumber=Driver.driver.findElement(By.xpath("//input[@id='transactionID_t|input']"));
//		String s=quotenumber.getText();//
		String u = quotenumber.getAttribute("value");
		System.out.println(u);
		
	}

}
