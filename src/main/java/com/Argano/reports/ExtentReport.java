package com.Argano.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.Argano.constants.FrameworkConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	private ExtentReport() {

	}

	private static ExtentReports extent;

	public static void initReports() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getEXTENTREPORTFILEPATH());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Keste");
			spark.config().setReportName(FrameworkConstants.getApplicationname());
		}
	}

	public static void flushReports() {
		if (Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentManager.unload();
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getEXTENTREPORTFILEPATH()).toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void createTest(String testCasesname) {
		ExtentTest test = extent.createTest(testCasesname);
		ExtentManager.setExtentTest(test);
	}
}
