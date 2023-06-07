package Pages;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.CM;
import Utilities.Driver;
import Utilities.Waits;

public class SalesforceDataEntry {
	public static void main(String[] args) throws Exception {
		Driver.getDriver("chrome");
//		
//		Driver.driver.get(
//				"https://argano.my.salesforce.com/?ec=301&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fargano.lightning.force.com%252Flightning%252Fr%252FAccount%252F0015f00001IlZIyAAN%252Fview");
		Driver.driver.get("https://argano--full.sandbox.my.salesforce.com/");
		
		WebDriver d = Driver.driver;
		d.findElement(By.id("username")).sendKeys("venkatesh.orusu1@argano.com.full");
		d.findElement(By.id("password")).sendKeys("Venky@27");
		d.findElement(By.id("Login")).click();
		Thread.sleep(10000);

//		try {
//			d.switchTo().alert().accept();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Login ss");
		 
	String [] arr=	{
			"Motor Coach Industries",
			"Mountaire",
			"Munchkin Inc.",
			"MWD",
			"Nashville Electric Service",
			"National Retail Properties, Inc.",
			"New Flyer Industries",
			"NexInfo Solutions Inc",
			"NFIB",
			"North Horizon Consulting",
		"NOV",
			"Nova Scotia Power",
			"NOW Foods",
			"NOW Health Group, Inc.",
			"NRI Australia Limited",
			"NSF",
			"NSF International",
			"Nufarm Americas",
			"O2Works",
			"Oak Ridge Associated Universities, Inc.",
		"oAppsNET Partners, LLC",
			"OATC",
			"Ocean Capital Holdings",
			"OCIO",
			"OCIO - Office of the Chief Inf",
			"OCIO - Office of the Chief Information Officer Executive Council",
			"Office of the Chief Information Officer",
			"Official Payroll Advisor",
			"OFS Brands",
			"Opkey",
			"ORAU",
			"Otter Tail Power",
			"Overhead Door Corporation",
			"PMI Worldwide",
			"Panaya",
			"Parker Health Group Inc",
			"PayrollOrg",
			"Performance Architects",
			"Philadelphia Gas Works",
			"Phillips Distilling Co.",
			"Piedmont Healthcare",
			"Pinellas BTS/OBAEC",
			"County of Pinellas (FL)",
			"PMI",
			"Polk County Board of County Commissioners",
			"Polk County Clerk of Courts",
			"Premier International",
			"Project Partners LLC",
			"Projects Expert UK Limited",
			"PROMATIS software GmbH",
			"Pythian",
			"Pythian Services Inc",
			"R&S Northeast",
			"Raiffeisen Bank International AG",
			"Randolph Air Force Base",
			"Rhapsody Technologies, Inc.",
			"Rheem",
			"Ruger",
			"SafePaaS",
			"Sandia National Laboratories",
			"Saskatchewan Water Corporation",
			"SaskWater",
			"SBLI",
			"SCI",
			"SCIF",
			"seagen",
			"ServiceNow",
			"Sherwin-Williams",
			"SMACT Works",
			"Sonoco Products",
			"Southern Company",
			"Southwest Gas Corp",
			"Southwest Key Programs",
			"Spinnaker Support",
			"SPS Commerce",
			"SQL Connect / SplashBI",
			"SS&C Technologies",
			"Stanford University",
			"Stantec Consulting",
			"State Compensation Insurance Fund",
			"State Corporation Commission",
			"STERIS",
			"Stony Brook University",
			"Stratix Corporation",
			"Sturm Ruger & Co., Inc",
			"Subaru of America",
			"Sundt Construction",
			"Sunera Technologies Inc.",
			"Sunflower Electric Power Corporation",
			"Syntax",
			"Syntax Systems",
			"Tanana Chiefs Conference",
			"Taylor Corporation",
			"TaylorMade Golf",
			"TCS",
			"Technology Resource Services, Inc",
			"TextronSystems",
			"Thales",
			"THALES DIS CPL USA, Inc",
			"The Donaldson Company Inc",
			"The Johns Hopkins University Applied Physics Lab",
			"The Metropolitan Water District of Southern California",
			"The Ottawa Hospital",
			"The ResourceHub",
			"ThinkTalent",
			"Thomson Reuters",
			"TMEIC Corporation Americas",
			"Toshiba International Corporation",
			"Towson University",
			"Toyota Boshoku America",
			"TPI Composites",
			"Trane Technologies",
			"Trinamix",
			"TTX Company",
			"UGN, Inc.",
			"UL",
			"University of Pittsburgh",
			"University of Tennessee",
			"University Of Texas System",
			"UQTR",
			"US Air Force",
			"US Postal Service",
			"USSS",
			"UT MD Anderson Cancer Center",
			"Vertex, Inc.",
			"Victorias Secret & Company",
			"Voya Financial",
			"WAPA",
			"County of Washington (OR)",
			"Western Area Power Administration",
			"Wheaton College (IL)",
			"WorkStrategy, Inc.",
			"WSSC Water",
			"XTGlobal",
			"Zenith Insurance Company",
			"Zeus Company Inc.",
			"Zions Bancorporation"
		};
//	ffor(String i:arr) {
//		System.out.println(i);
//		CM.click("search", "//button[@aria-label='Search']");
//		d.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(i, Keys.ENTER);
//		 Waits.sleep(3);
//		CM.click("record", "//h2//a[@data-refid='recordId']");
////		d.findElement(By.xpath("//button[@aria-label='Search']")).click();
////		Thread.sleep(5000);
////		d.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(text, Keys.ENTER);
////		Thread.sleep(5000);
////		d.findElement(By.xpath("//h2//a[@data-refid='recordId']")).click();
//		List<WebElement> aa=d
//		.findElements(By.xpath("//span[text()=\"Account Name\"]/../..//lightning-formatted-text"));
//		System.out.println(aa.size());
//
//		String AccountName = d
//				.findElement(By.xpath("//span[text()=\"Account Name\"]/../..//lightning-formatted-text"))
//				.getText();
//		String AccountID = d
//				.findElement(By.xpath("//span[text()=\"Account ID\"]/../..//lightning-formatted-text"))
//				.getAttribute("value");
//
//		System.out.println(AccountName + " " + AccountID);
//		Waits.sleep(5);
//	}
		System.out.println(Arrays.toString(arr));
	}
	

}
