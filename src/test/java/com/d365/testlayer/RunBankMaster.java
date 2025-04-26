package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunBankMaster extends MasterClass {
	@Test
	public void getLogin() throws InterruptedException, IOException, InvalidFormatException {
		login();
	}
	
	@Test(groups = { "Admin", "Jewellery", "Bank Master", "Functionality" })
	public void addBankMasterData() throws IOException, InterruptedException, InvalidFormatException {
		// Navigate to Bank Master page
		navigateToPage(bankMasterPage.clickJewellery(), bankMasterPage.clickBankMasterMenu());

		// Loop through the rows in the Excel sheet for data-driven testing
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "bankmaster_TestData.xlsx",
				"Sheet1"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			// Read and map data from Excel for the current row
			Map<String, String> bankData = excelHelper.readExcelDataAndMap(excelPath + "bankmaster_TestData.xlsx",
					"Sheet1", rowIndex);

			// Store the Excel data into the masterDto object for further use
			for (Map.Entry<String, String> entry : bankData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			// Create a test case report
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
			bankMaster.bankMasterData();
				saveOrderAndHandleErrorsBM(); // Check if an error was handled

			} catch (Exception e) {
				// Handle any exceptions that occur

			}
		}
	}
	@Test(groups = { "Admin", "Jewellery", "Bank Master", "Validation" })
	public void deleteBank() throws InvalidFormatException, IOException, InterruptedException {

		navigateToPage(bankMasterPage.clickJewellery(), bankMasterPage.clickBankMasterMenu());

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "bankmaster_TestData.xlsx",
				"Sheet2"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "bankmaster_TestData.xlsx",
					"Sheet2", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				bankMaster.deleteBankData();
				saveOrderAndHandleErrorsBM();
			} catch (Exception e) {

			}

		}

	}
}
