package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots extends Driver {
	public static void main(String[] args) {
		 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//		failSS("Venky");
//		passSS("Dinesh");
		String a=captureandgetthepath(driver,"somp");
		System.out.println(a);
	}
	
	
	
	
	public static void failSS( String elementname)   {
		 
		 Date date =new Date();
			
	      String scrrenshotname=date.toString().replace(" ","").replace(":","");
	      System.out.println(scrrenshotname);
	     
	      File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            String s = System.getProperty("user.dir")+"/Res/fail/"+scrrenshotname + elementname +".png";
	            System.out.println(s);
	            FileUtils.moveFile(screenshotimage, new File(s));
	            System.out.print("ScreenShot has taken successfully");
	        } catch (IOException e) {
	            // TODO Auto-generated catch block            
	            e.printStackTrace();
	        }
	        System.out.print("ScreenShot taken successfully");
	    
	}
	public static void passSS( String elementname)   {
		 
		 Date date =new Date();
			
	      String scrrenshotname=date.toString().replace(" ","").replace(":","");
	      System.out.println(scrrenshotname);
	     
	      File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            String s = System.getProperty("user.dir")+"/Res/pass/"+scrrenshotname + elementname +".png";
	            System.out.println(s);
	            FileUtils.moveFile(screenshotimage, new File(s));
	            System.out.print("ScreenShot has taken successfully");
	        } catch (IOException e) {
	            // TODO Auto-generated catch block            
	            e.printStackTrace();
	        }
	        System.out.print("ScreenShot taken successfully");
	    
	}
	public static void capture( String elementname)   {
		 
		 Date date =new Date();
			
	      String scrrenshotname=date.toString().replace(" ","").replace(":","");
	      System.out.println(scrrenshotname);
	     
	      File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            String s = System.getProperty("user.dir")+"/Res/pass/"+scrrenshotname + elementname +".png";
	            System.out.println(s);
	            FileUtils.moveFile(screenshotimage, new File(s));
	            System.out.print("ScreenShot has taken successfully");
	        } catch (IOException e) {
	            // TODO Auto-generated catch block            
	            e.printStackTrace();
	        }
	        System.out.print("ScreenShot taken successfully");
	    
	}
//	public static  String captureandgetthepath(WebDriver driver, String elementname)   {
//		 
//		 Date date =new Date();
//			
//	      String scrrenshotname=date.toString().replace(" ","").replace(":","");
//	      System.out.println(scrrenshotname);
//	      String s = System.getProperty("user.dir")+"/Res/pass/"+scrrenshotname + elementname +".png";
//	     
//	      File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        try {
//	            
//	            System.out.println(s);
//	            FileUtils.moveFile(screenshotimage, new File(s));
//	            System.out.print("ScreenShot has taken successfully");
//	        } catch (IOException e) {
//	            // TODO Auto-generated catch block            
//	            e.printStackTrace();
//	        }
//	        System.out.print("ScreenShot taken successfully");
//	        return s;
//	    
//	}




	public static String captureandgetthepath(WebDriver driver, String elementname) {
		Date date =new Date();
		
	      String scrrenshotname=date.toString().replace(" ","").replace(":","");
	      System.out.println(scrrenshotname);
	      String s = System.getProperty("user.dir")+"/Res/pass/"+scrrenshotname + elementname +".png";
	     
	      File screenshotimage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            
	            System.out.println(s);
	            FileUtils.moveFile(screenshotimage, new File(s));
	            System.out.print("ScreenShot has taken successfully");
	        } catch (IOException e) {
	            // TODO Auto-generated catch block            
	            e.printStackTrace();
	        }
	        System.out.print("ScreenShot taken successfully");
	        return s;
	}





	
}
