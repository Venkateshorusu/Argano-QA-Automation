package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UtilListners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Started:" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Success:" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is Failed:" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped:" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is failed nut with in success Percentage:" +result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test is Failed With Timeout:" +result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test onStart:" +result.getName());
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test on Finish:" +result.getName());
	}

}
