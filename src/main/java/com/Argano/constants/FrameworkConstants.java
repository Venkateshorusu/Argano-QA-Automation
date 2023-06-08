package com.Argano.constants;

import com.Argano.enums.ConfigProperties;
import com.Argano.utlis.PropertyUtils;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String EXCELPATH = RESOURCESPATH + "/excel/TestManager.xlsx";
	private static final String RUNMANAGERSHEET = "RUNMANAGER";
	private static final String TESTDATASHEET = "TESTDATA";
	public  static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir") + "/extent-test-output/";
	private static       String EXTENTREPORTFILEPATH = "";
	private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
	private static final String APPLICATIONNAME = "Global CRM";
	
	private static final int IMPLICITYWAITTIME = 30;
	
	private static final String REPORTSENDINGEMAILID= "testautomationkeste@gmail.com";
	private static final String REPORTSENDINGPSWD= "Keste@2020";
	
	
	public static String getReportsendingemailid() {
		return REPORTSENDINGEMAILID;
	}

	public static String getReportsendingpswd() {
		return REPORTSENDINGPSWD;
	}

	public static String getTestdatasheet() {
		return TESTDATASHEET;
	}

	public static String getRunmanagersheet() {
		return RUNMANAGERSHEET;
	}

	public static int getImplicitywaittime() {
		return IMPLICITYWAITTIME;
	}

	public static String getApplicationname() {
		return APPLICATIONNAME;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	public static String getEXTENTREPORTFILEPATH() {
		if (EXTENTREPORTFILEPATH.isEmpty()) {
			EXTENTREPORTFILEPATH = createReportPath();
		}
		return EXTENTREPORTFILEPATH;
	}

	private static String createReportPath() {
		if (PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no"))
			return EXTENTREPORTFOLDERPATH + System.currentTimeMillis() + "/index.html";
		else {

			return EXTENTREPORTFOLDERPATH + "index.html";
		}
	}

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

}
