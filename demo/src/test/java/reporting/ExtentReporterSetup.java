package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterSetup {

	public static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
		}

		return extent;

	}

}
