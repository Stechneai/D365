package com.d365.testlayer;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunTransferOrderReceipt extends MasterClass {
	ITestResult result;
	
	@Test(priority=2,groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void validateNoOfBoxesField() throws Exception {

//		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
//		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());
		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderReceiptModuleSheet, "NegativeNoOfBoxes");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				transferOrderReceipt.validateNoOfBoxesField(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(priority=1,groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void displayNoOfBoxesField() throws Exception {

		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderReceiptModuleSheet, "displayNoOfBoxes");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				transferOrderReceipt.displayNoOfBoxesField(test, masterDto);
				//checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(priority=3,groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void beforeShippedPrintTransfer() throws Exception {

		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderReceiptModuleSheet, "printTransferBeforeShipped");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				transferOrderReceipt.beforeShippedPrintTransfer(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(priority=4,groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void afterShippedNoOfBoxField() throws Exception {

		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderReceiptModuleSheet, "afterShipNoPField");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				transferOrderReceipt.afterShippedNoOfBoxField(test, masterDto);
				//checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(priority=4,groups = { "Admin", "Inventory Management", "TransferOrder", "Functionality" })
	public void validateDataOfPrint() throws Exception {

		List<MasterDto> masterDtos = excelHelper.getTestData(transferOrderReceiptModuleSheet, "verifydataprintreceipt");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				transferOrderReceipt.validateDataOfPrint(test, masterDto);
				//checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

}
