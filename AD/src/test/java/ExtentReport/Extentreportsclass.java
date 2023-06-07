package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extentreportsclass {
	public static void main(String args[]) {
		System.out.println("Opening the reportby path");
		getReportByPath();
		System.out.println("Opening the reportby filr");		
		getReportByFile();
		System.out.println("done");		
	}
	public static void getReportByPath() {
		ExtentReports ex=new ExtentReports();
		ExtentSparkReporter exsp=new ExtentSparkReporter("ReportsByPath.html");
		ex.attachReporter(exsp); 
		
		ExtentTest test1=ex.createTest("test 1");
		
		test1.pass("This test is passed");
		
		ExtentTest test2=ex.createTest("test 2");
		test2.log(Status.FAIL, "This is failed");
		
		ex.createTest("test3").skip("This test is skipped");
		
		
//		for log the the XML and Json text in the extent reports.
		
		ex.createTest("This is Json test").info(MarkupHelper.createCodeBlock("{\"employees\":[\r\n"
				+ "  { \"firstName\":\"John\", \"lastName\":\"Doe\" },\r\n"
				+ "  { \"firstName\":\"Anna\", \"lastName\":\"Smith\" },\r\n"
				+ "  { \"firstName\":\"Peter\", \"lastName\":\"Jones\" }\r\n"
				+ "]}\r\n"
				+ ""));
		
		ex.createTest("This is XML test").info(MarkupHelper.createCodeBlock("<employees>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>John</firstName> <lastName>Doe</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>Anna</firstName> <lastName>Smith</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>Peter</firstName> <lastName>Jones</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "</employees>"));
//		for log the List, set and map information in the extent test reports
		
		Map<Integer,String> map=new HashMap<>();	
		map.put(1,"venky");
		map.put(2, "Dinesh");
		map.put(3, "Kaushik");
		map.put(4, "Sai");
		map.put(5, "pooja");
		map.put(6, "Rajeshwari");
		map.put(7, "Rajesh");
		map.put(8, "sruthi");
		map.put(9, "Ravi");
		Set<Integer> set= map.keySet();
		Collection<String> set1= map.values();
		
		ex.createTest("Map based test").info(MarkupHelper.createOrderedList(map)).info(MarkupHelper.createUnorderedList(map));
		
		ex.createTest("set based test").info(MarkupHelper.createOrderedList(set)).info(MarkupHelper.createUnorderedList(set));
		
		ex.createTest("list based test").info(MarkupHelper.createOrderedList(set1)).info(MarkupHelper.createUnorderedList(set1));

		
		
		
		
		ex.flush();
		
		try {
			Desktop.getDesktop().browse(new File("ReportsByPath.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getReportByFile() {
		ExtentReports ex=new ExtentReports();
		File file=new File("ReportsByFile.html");
		ExtentSparkReporter exsp=new ExtentSparkReporter(file);
		ex.attachReporter(exsp); 
		
		ExtentTest test1=ex.createTest("test 1");
		test1.pass("This test is passed");
		
		ExtentTest test2=ex.createTest("test 2");
		test2.log(Status.FAIL, "This is failed");
		
		ex.createTest("test3").skip("This test is skipped");
			
		
		ex.flush();
		
		try {
			Desktop.getDesktop().browse(new File("ReportsByFile.html").toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
