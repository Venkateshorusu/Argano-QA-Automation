package Argano.AD;

import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=WebDriverManager
.chromedriver().create();
		driver.get("https://www.google.com");

	}

}
