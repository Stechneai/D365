package com.d365.testlayer;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.core.TransferOrder;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class runTransferOrder extends MasterClass {
	ITestResult result;
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void addBulkTagTransferOrder() throws Exception {
	//	navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());

		try {
			List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "TransferOTag");
			
				// Click to create a new transfer order
				//genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());

				
				// Set attributes from the Excel data
				for (MasterDto masterDto : masterDtos) {
	
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				try {
					transferOrder.addTransferOrderBranchAndStateWithValidTag(test, masterDto);
				//	transferorder.AllTagCheck();
				//	checkNotificationPresenceAndHandle(masterDto);
				} catch (Exception e) {
					getResults(masterDto);
				}
			}
		} catch (NoSuchElementException e) {
			// Log when no element is found
			reportHelper.onTestFailure(test, "Exception: " + e.getMessage());
			reportHelper.generateLog(test, "Exception: " + e.getMessage());
			reportHelper.generateLogWithScreenshot(test, "No message found.");
		} catch (AssertionError a) {
			reportHelper.onTestFailure(test, "Exception: " + a.getMessage());
			reportHelper.generateLog(test, "AssertionError: " + a.getMessage());
			reportHelper.generateLogWithScreenshot(test, "AssertionError: " + a.getMessage());
		}

	}
	
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void addGCScanTagTransferOrder() throws Exception {

//		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
//		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "GCScan");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transferOrder.addTransferOrderGCTag(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void addDocumentScan() throws Exception {

		//navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "Add");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transferOrder.addTransferOrderDocumentScan(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void addOldMetalCopy() throws Exception {

		//navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "Sheet1");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transferOrder.addTransferOrderOldMetalCopy(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
	
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Validation" })
	public void validateDateReceiveShipFunctionality() throws Exception {

		//navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "Validate");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transferOrder.validateData(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality/Validation" })
	public void validateNegativeTagTransferTag() throws Exception {

//		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderModuleSheet, "TagBulkNegativeTestCase");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transferOrder.validateNegativeTagData(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
}
