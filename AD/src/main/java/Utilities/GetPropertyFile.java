package Utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream; 
import java.util.Properties;

public class GetPropertyFile {
	static Properties pp = new Properties();
	public static String username;
	public static String password;
	public static String browser1;
	public static String browser2;
	public static String browser3;
	public static String URL;
//	public static String tab;

	public static void main(String[] args) {
		getProperties();
		 setProperties();
		// getProperties();

	}

	public static void getProperties() {
		InputStream file = null;
		try {

			file = new FileInputStream(Contents.fileLocation);
			pp.load(file);
			URL = pp.getProperty("URL");
			browser1 = pp.getProperty("browser");
			browser2 = pp.getProperty("browser2");
			browser3 = pp.getProperty("browser3");
			username = pp.getProperty("username");
			password = pp.getProperty("password");

//			System.out.println(URL+browser1 + " " + username + " " + password);
//			System.out.println(URL+browser2 + " " + username + " " + password);
//			System.out.println(URL+browser3 + " " + username + " " + password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static void setProperties() {
		try {
			OutputStream changeOrenter = new FileOutputStream(Contents.fileLocation);
			pp.setProperty("browser1", "Egde");
			pp.setProperty("name","Venkatesh");
//			pp.setProperty("EmailXpath", "//input[text()='email']");
//			pp.setProperty("browser1", "Egde");
//			pp.setProperty("browser1", "Egde");
			pp.store(changeOrenter, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
	}

}
