package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static void main(String[] args) throws Exception {
		WebDriver d = getDriver("chrome");
		d.manage().window().maximize();
		d.get("https://chat.openai.com/");

	}

	public static WebDriver driver;

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static WebDriver getDriver(String browsername) throws Exception {
		System.out.println("hello");

		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new IllegalArgumentException("Please provide a valid browser name in lowercase");
		}
		return driver;
	}

}