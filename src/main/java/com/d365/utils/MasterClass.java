package com.d365.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import com.sharedutils.GlobalConstants;
import com.sharedutils.ExcelHelper;
import com.sharedutils.GenericHelper;
import com.sharedutils.MasterDto;
import com.sharedutils.PropertyHelper;
import com.sharedutils.ReportsHelper;
import com.sharedutils.ScreenShotHelper;

public class MasterClass extends ProjectFunctions {

	@BeforeSuite
	public void preSuiteHandler() throws Exception {
		masterDto.setAttribute("qaName", qaName);
//		masterDto.setAttribute("CustomerOrderDocTitle", docTitle);
//		masterDto.setAttribute("CustomerOrderReportName", reportName);
		masterDto.setAttribute("docTitle", docTitle);
		masterDto.setAttribute("reportName", reportName);

		extentReports = reportHelper.generateReport(masterDto);
		test = extentReports.createTest("Setup");

		String browser = "chrome";
		driver = genericHelper.startBrowser(browser);
		pageInitialiazation(driver);
		String url = propertyHelper.readDataFromPropertyFile(GlobalConstants.CONFIG_FILE, "UAT");
		genericHelper.navigateToURL(test, url);
		login();
	}

	@AfterMethod
	public void postMethodHandler(ITestResult result) throws IOException, Exception {
		reportHelper.tearDown(test, result);
		extentReports.flush();
	}
//
//	@AfterSuite
//	public void postSuiteHandler() throws IOException, Exception {
//		isLoggedIn = false;
//	}

}
