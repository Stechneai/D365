package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunPendingVendorInvoices extends MasterClass {

	@Test
	public void getLogin() throws InterruptedException, IOException, InvalidFormatException {

		login();
		
	}
	@Test(groups = { "Admin", "Account Payable", "Pending Vendor Invoices", "Functionality" })
	public void addPendingVendorInvoiceData() throws InvalidFormatException, IOException, InterruptedException {

		navigateToPage(pendingVendorInvoicesPage.clickAccountPayable(),
				pendingVendorInvoicesPage.clickPendingVendorInvoices()); // Navigate to Pending Vendor Invoices
		// page
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "pendingvendorinvoices_TestData.xlsx",
				"Sheet1"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper
					.readExcelDataAndMap(excelPath + "pendingvendorinvoices_TestData.xlsx", "Sheet1", rowIndex);

			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				pendingvendorinvoices.postPendingVendorInvoiceData();
				// Perform the actual process for posting pending vendor invoices
			} catch (Exception e) {
				getResults(); // Error handling for Pending Vendor Invoices (PVI)
			}
		}
	}
}
