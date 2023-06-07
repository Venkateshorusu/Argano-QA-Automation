package Pages;
import Utilities.CM;
import Utilities.Driver;

public class TempForScreenshots {
	public static void main(String args[]) throws Exception {
		Driver.getDriver("chrome");
		Driver.driver.manage().window().maximize();
		Driver.driver.manage().deleteCookie(null);
		Driver.driver.get("https://www.google.com");
		CM.click("menuoption ", "//div[@id='gbwaa']");
	}

}
