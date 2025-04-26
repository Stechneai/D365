package com.d365.testlayer;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class RunJobWorkMaster extends MasterClass {

	@Test
	public void getLogin() throws Exception {

		login();

	}
	@Test(groups = { "Admin", "Jewellery", "Job Work Master", "Functionality" })
	public void addjobwork() throws InterruptedException, InvalidFormatException, AWTException, IOException,
			org.apache.poi.openxml4j.exceptions.InvalidFormatException {

		navigateToPage(jobWorkMasterPage.clickJewellery(), jobWorkMasterPage.clickJobWorkMaster());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "jobWorkChargesMaster_TestData.xlsx",
				"Sheet1"); rowIndex++) {
			// genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
			Map<String, String> orderData = excelHelper
					.readExcelDataAndMap(excelPath + "jobWorkChargesMaster_TestData.xlsx", "Sheet1", rowIndex);
			genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());

			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				jobWorkMaster.adddata();
				checkNotificationPresenceAndHandleJW();
			} catch (Exception e) {
				getResults();
			}

		}

	}
	@Test(groups = { "Admin", "Jewellery", "Job Work Master", "Validation" })
	public void Deletejobwork() throws InterruptedException, InvalidFormatException, AWTException, IOException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException {

navigateToPage(jobWorkMasterPage.clickJewellery(), jobWorkMasterPage.clickJobWorkMaster());
for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "jobWorkChargesMaster_TestData.xlsx",
		"Sheet2"); rowIndex++) {
	// genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
	Map<String, String> orderData = excelHelper
			.readExcelDataAndMap(excelPath + "jobWorkChargesMaster_TestData.xlsx", "Sheet2", rowIndex);
	genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
	for (Map.Entry<String, String> entry : orderData.entrySet()) {
		masterDto.setAttribute(entry.getKey(), entry.getValue());

	}
	test = reportHelper.createTestCase(test, extentReports, masterDto);
	try {
		jobWorkMaster.deletedata();
		checkNotificationPresenceAndHandleJW();
	} catch (Exception e) {
		getResults();
	}
	}

}
	@Test(groups = { "Admin", "Jewellery", "Job Work Master", "Functionality" })
	public void Editjobwork() throws InterruptedException, InvalidFormatException, AWTException, IOException,
	org.apache.poi.openxml4j.exceptions.InvalidFormatException {

navigateToPage(jobWorkMasterPage.clickJewellery(), jobWorkMasterPage.clickJobWorkMaster());
for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "jobWorkChargesMaster_TestData.xlsx",
		"Sheet3"); rowIndex++) {
	// genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
	Map<String, String> orderData = excelHelper
			.readExcelDataAndMap(excelPath + "jobWorkChargesMaster_TestData.xlsx", "Sheet3", rowIndex);
	genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickNew());
	for (Map.Entry<String, String> entry : orderData.entrySet()) {
		masterDto.setAttribute(entry.getKey(), entry.getValue());

	}
	test = reportHelper.createTestCase(test, extentReports, masterDto);
	try {
		jobWorkMaster.editdata();
		checkNotificationPresenceAndHandleJW();
	} catch (Exception e) {
		getResults();
	}
	}

}
}	

