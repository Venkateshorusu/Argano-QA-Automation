package Pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;

import Utilities.CM;
import Utilities.Contents;
import Utilities.Driver;
import Utilities.Getdate;
import Utilities.ReadPropertyFile;
import Utilities.Waits;

public class WebCenter {
	public static Properties p = ReadPropertyFile.read(Contents.webcenterPropertyFile);
	static WebDriver driver;
	static String CPQ;
	static String WC;

	public static void main(String[] args) throws Exception {
		LogInToAD.intializeBrower();
		loginToWC();
//		afterVDComplete();
		webcentermethod();

		// afterVDComplete();
//		 

		System.out.println("executed successfully");

	}

	/**
	 * @param driver
	 */
	public static void afterVDComplete() {

		Driver.driver.switchTo().window(WC);
		Driver.driver.navigate().refresh();
		Waits.EWait(20, p.getProperty("searchInMyToDoList"));

		CM.sendKeysXpath(p.getProperty("searchInMyToDoList"), p.getProperty("quotenum"));

		CM.click("searchIconInMyToDoList", p.getProperty("searchIconInMyToDoList"));
		Waits.sleep(5);
		CM.click("VDProjectNameLineItem", p.getProperty("VDProjectNameLineItem"));
		Waits.sleep(5);
		CM.click("VDTasksTab", p.getProperty("VDTasksTab"));
		int i = 0;

		while (true) {
			Waits.sleep(5);
			
			try {
				Driver.driver.get(Driver.driver.getCurrentUrl());
				System.out.println(i++);
//				Waits.sleep(5);
//				Driver.driver.navigate().to(Driver.driver.getCurrentUrl());
//				System.out.println(i++);
				Waits.sleep(5);
				Driver.driver.findElement(By.xpath(p.getProperty("CPQAnnotation")));
				break;
			} catch (Exception e) {
				Driver.driver.navigate().refresh();
				System.out.println(i++);
			}
		}

		Waits.sleep(10);
		Waits.EWait(20, p.getProperty("CPQAnnotation"));
		CM.click("CPQAnnotation", p.getProperty("CPQAnnotation"));
		Waits.sleep(10);

		CM.click("VDTaskComplete", p.getProperty("VDTaskComplete"));
		Waits.sleep(5);

		try {
			Driver.driver.switchTo().alert().accept();
			System.out.println("alert accepted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i = 0;

		while (true) {
			Waits.sleep(5);
			try {
				Driver.driver.get(Driver.driver.getCurrentUrl());
				System.out.println(i++);
//				Waits.sleep(5);
//				Driver.driver.navigate().to(Driver.driver.getCurrentUrl());
//				System.out.println(i++);
				Waits.sleep(5);
				Driver.driver.findElement(By.xpath(p.getProperty("VD_Item_QC_Legend")));
				break;
			} catch (Exception e) {
				Driver.driver.navigate().refresh();
				System.out.println(i++);
			}

		}
		Waits.EWait(20, p.getProperty("VD_Item_QC_Legend"));
		CM.click("VD_Item_QC_Legend", p.getProperty("VD_Item_QC_Legend"));
		CM.click("VDCheck_Accuracy_of_Legend", p.getProperty("VDCheck_Accuracy_of_Legend"));
		Select se = new Select(driver.findElement(By.xpath(p.getProperty("Check_Accuracy_of_Legend"))));
		se.selectByIndex(1);
		CM.click("VDBypass_Send_Email_to_CFEDSS", p.getProperty("VDBypass_Send_Email_to_CFEDSS"));
//option	

		CM.click("VDTaskComplete", p.getProperty("VDTaskComplete"));
		Waits.sleep(5);
		try {
			Driver.driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @throws Exception
	 */
	public static void webcentermethod() throws Exception {

		Waits.EWait(30, p.getProperty("searchInMyToDoList"));

		CM.sendKeysXpath(p.getProperty("searchInMyToDoList"), p.getProperty("quotenum"));

		CM.click("searchIconInMyToDoList", p.getProperty("searchIconInMyToDoList"));

		CM.click("ProjectNameLineItem", p.getProperty("ProjectNameLineItem"));

		CM.click("TasksTab", p.getProperty("TasksTab"));

		CM.jsClick("PA_Upload", p.getProperty("PA_Upload"));

		CM.click("+Upload_Working_File", p.getProperty("Upload_Working_File"));

		Waits.sleep(10);

		WebElement browse = Driver.driver.findElement(By.xpath(p.getProperty("browse")));

		browse.sendKeys(p.getProperty("workingfilepath"));

		Waits.sleep(10);

		WebElement DocumentName = Driver.driver.findElement(By.xpath(p.getProperty("DocumentName")));

		DocumentName.clear();
		DocumentName.sendKeys(p.getProperty("glidNum") + ".pdf");

		CM.click("PA_Assigned_Date", p.getProperty("PA_Assigned_Date"));

		String date = String.format(p.getProperty("selectDate"), Getdate.getDD());
		System.out.println(date);
		CM.click("date", date);

		CM.click("TaskComplete", p.getProperty("TaskComplete"));
		Waits.sleep(5);

		try {
			Driver.driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int i = 0;
		while (true) {
			Waits.sleep(5);
			try {
				Driver.driver.get(Driver.driver.getCurrentUrl());
				System.out.println(i++);
//				Waits.sleep(5);
//				Driver.driver.navigate().to(Driver.driver.getCurrentUrl());
//				System.out.println(i++);
				Waits.sleep(5);
				Driver.driver.findElement(By.xpath(p.getProperty("Item_QC_Legend")));
				break;
			} catch (Exception e) {
				Driver.driver.navigate().refresh();
				System.out.println(i++);
			}

		}
		Waits.EWait(100, p.getProperty("Item_QC_Legend"));
		CM.jsClick("Item QC Legend", p.getProperty("Item_QC_Legend"));

		Waits.EWait(10, p.getProperty("Check_Accuracy_of_Legend"));

		Select se = new Select(Driver.driver.findElement(By.xpath(p.getProperty("Check_Accuracy_of_Legend"))));
		se.selectByIndex(1);

		CM.click("Bypass_Send_Email_to_CFEDSS", p.getProperty("Bypass_Send_Email_to_CFEDSS"));

		CM.click("TaskComplete", p.getProperty("TaskComplete"));
		Waits.sleep(5);

		try {
			Driver.driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("executed successfully");

		Waits.sleep(7);
		Driver.driver.switchTo().window(CPQ);
	}

	/**
	 * @return
	 * @throws Exception
	 */
	public static void loginToWC() throws Exception {

		Driver.driver.manage().window().maximize();
		Driver.driver.switchTo().newWindow(WindowType.TAB);
		Set<String> list = Driver.driver.getWindowHandles();
		Iterator<String> it = list.iterator();
		CPQ = it.next();
		WC = it.next();
		Driver.driver.switchTo().window(WC);

		Driver.driver.get(p.getProperty("webcenterURL"));

		CM.sendKeysByID("username", p.getProperty("username"));

		CM.sendKeysByID("password", p.getProperty("password"));

		CM.click("Login_Button", p.getProperty("Login_Button_in_LoginPage"));
		try {
			if (Driver.driver.findElement(By.xpath("/input[@name='autoexpire']")).isDisplayed()) {
				Driver.driver.findElement(By.xpath("//input[@name='autoexpire']")).click();

				CM.sendKeysByID("username", p.getProperty("username"));

				CM.sendKeysByID("password", p.getProperty("password"));

				CM.click("Login_Button", p.getProperty("Login_Button_in_LoginPage"));
				
			}
			
		}

		catch(Exception e) {
			
			
		}
		

	}
}
