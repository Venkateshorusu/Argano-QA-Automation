package com.Argano.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Argano.reports.ExtentLogger;
import com.Argano.reports.ExtentReport;
import com.Argano.utlis.SendEmailReportUtlis;


public class ListenerClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {

		ExtentReport.initReports();

	}

	@Override
	public void onFinish(ISuite suite) {

		ExtentReport.flushReports();
		try {
			SendEmailReportUtlis.sendEmailWithResults();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		ExtentLogger.pass(result.getMethod().getMethodName() + " is passed", true);

	}

	@Override
	public void onTestFailure(ITestResult result) {

		ExtentLogger.fail(result.getMethod().getMethodName() + " is failed", true);
		ExtentLogger.fail(result.getThrowable().toString());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped", true);
	}

}
