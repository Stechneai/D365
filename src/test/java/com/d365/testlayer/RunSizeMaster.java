package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunSizeMaster extends MasterClass {

//	@Test
//	public void getLogin() throws InterruptedException, IOException, InvalidFormatException {
//      login(); 
//	}

	@Test(groups = { "Admin", "Jewellery", "Size Master", "Functionality" })
	public void SizeMasterData() throws IOException, InterruptedException, InvalidFormatException {
		login();
		navigateToPage(sizeMasterPage.clickJewellery(), sizeMasterPage.clickSizeMaster()); // Navigate to Pending Vendor
																							// Invoices page

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "sizemaster_TestData.xlsx",
				"Sheet1"); rowIndex++) { // Added closing parenthesis here
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "sizemaster_TestData.xlsx",
					"Sheet1", rowIndex);
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				sizeMaster.addsizeMasterData();
				checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults(); // Error handling for Pending Vendor Invoices (PVI)
			}
		}
	}
}
