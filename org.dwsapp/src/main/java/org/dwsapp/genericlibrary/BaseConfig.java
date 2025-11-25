package org.dwsapp.genericlibrary;

import java.text.SimpleDateFormat;

import org.dwsapp.pagerepository.BookPage;


import org.dwsapp.pagerepository.ComputerPage;
import org.dwsapp.pagerepository.ElectronicsPage;
import org.dwsapp.pagerepository.LoginPage;
import org.dwsapp.pagerepository.ShoppingCartPage;
import org.dwsapp.pagerepository.WelcomePage;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseConfig extends WebDriverLibrary {

	public WelcomePage wpobj;
	public LoginPage lpobj;
	public PropertiesLibrary plib;
	public BookPage bpobj;
	public ComputerPage cpobj; 
	public ElectronicsPage epobj;
	public ExcelLibrary exlib;
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	public ShoppingCartPage scobj;
	
	@BeforeTest
	public void ReportSetup() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		spark= new ExtentSparkReporter("./AdvanceReports/report"+sdf+".html");
				
				//configure the spark report information
				spark.config().setDocumentTitle("Regression Testing for the swagLabs");
	            spark.config().setReportName("RegressionSuite");
	            spark.config().setTheme(Theme.STANDARD);
	            
	            //Create the Extent report
	            report = new ExtentReports();
	            
	            //create the extent report
	            report.attachReporter(spark);
	            
	            //configure the system information in extent report
	             report.setSystemInfo("DeviceName:", "Asif");
	             report.setSystemInfo("OperatingSystem:", "Windows11");
	             report.setSystemInfo("Browser:", "Chrome");
	             report.setSystemInfo("BrowserVersion:", "chrome-138.0.7204.169");
	}
	
	@AfterTest
	public void ReportTerminate() {
		
		//flush the report information
		report.flush();
		
	}
	

	

	@Parameters({ "url", "browser" })
	@BeforeClass
	public void browserSetup(String url, String browser) {

		// WebDriverLibrary wlib = new WebDriverLibrary(); - used as extends.
		openBrowser(browser);

		maximizeBrowser();
		waitStatement();

		navigateToApp(url);

		Reporter.log(url, true);
		Reporter.log(browser, true);

		Reporter.log("Browser setup success", true);

	}

	@BeforeMethod
	public void login()  {
		
		waitStatement();

		plib = new PropertiesLibrary();

		wpobj = new WelcomePage(driver);
		clickOnElement(wpobj.getloginlink());

		lpobj = new LoginPage(driver);

		enterDataOnElement(lpobj.getemailTextfield(), plib.readData("email"));
		enterDataOnElement(lpobj.getpasswordTextField(), plib.readData("password"));
		clickOnElement(lpobj.loginButton());

		Reporter.log("login", true);
	}

	@AfterMethod
	public void logout() {
		wpobj = new WelcomePage(driver);
		clickOnElement(wpobj.getlogoutlink());

		Reporter.log("logOut", true);
	}

	@AfterClass
	public void browserTerminate() {

		closeBrowser();
		Reporter.log("Browser closed", true);
	}
}
