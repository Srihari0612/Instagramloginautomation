package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent ;
	static ExtentSparkReporter reporter;
	
	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		 reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Insagram Automation Results");
		reporter.config().setDocumentTitle("Test Results ");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Srihari");
		return extent;
	}
}
