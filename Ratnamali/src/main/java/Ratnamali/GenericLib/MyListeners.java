package Ratnamali.GenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListeners implements ITestListener{
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method PASSED",true);
		extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+"method PASSED", ExtentColor.GREEN));
		
	}

	public void onTestFailure(ITestResult result) {
		//Reporter.log(result.getName()+" method FAILED",true);
		extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName()+"method FAILED", ExtentColor.RED));
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.getFullScreenshot("./screenshots/"+result.getName()+".png");
	}

	public void onTestSkipped(ITestResult result) {
		//Reporter.log(result.getName()+" method SKIPPED",true);
		extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+"method SKIPED", ExtentColor.BLUE));
	}

	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" started",true);
		ExtentSparkReporter spark=new ExtentSparkReporter(IAutoConsts.REPORT_PATH);;
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Ratnamali Report");
		spark.config().setReportName("Extent Reports  5");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
	}

	public void onFinish(ITestContext context) {
		//Reporter.log(context.getName()+" ended",true);
	     extent.flush();
	}
	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
