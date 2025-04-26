package com.d365.testlayer;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunTransferReceipt extends MasterClass{
	ITestResult result;
	
	@Test(priority=1, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void displayNoOfBoxesInCraeteInventoryPage() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "NoofBoxesInventory");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.displayNoOfBoxesInCraeteInventoryPage(test, masterDto);
					//checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		
	}
	@Test(priority=2, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void negativeNoOfBoxesInventory() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "NegativeNoOfBoxesInventory");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.negativeNoOfBoxesInventory(test, masterDto);
					checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		}
	
	
	@Test(priority=4, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void displayNoOfBoxesInHeader() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "DisplayNoOfBoxesHeader");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.displayNoOfBoxesInHeader(test, masterDto);
					//checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		
	}
	@Test(priority=3, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void reflectionNoOfBoxesInHeader() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "ReflectionNoOfBoxesHeader");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.reflectionNoOfBoxesInHeader(test, masterDto);
					//checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		
	}
	@Test(priority=5, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void negativeNoOfBoxesHeader() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "NoOfboxesNegativeHeader");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.displayNoOfBoxesInCraeteInventoryPage(test, masterDto);
					//checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		
	}
	
	
	@Test(priority=6, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void beforePostedPrint () throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "BeforePrintJournal");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.beforePostedPrint(test, masterDto);
					checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		}
	@Test(priority=8, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void afterPostNoOfBoxesFiled () throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "afterPostNoPField");
			for (MasterDto masterDto : masterDtos) {

			try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.afterPostNoOfBoxesFiled(test, masterDto);
				//	checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
				//	getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		}
	@Test(priority=7, groups = { "Admin", "Inventory Management", "TransferReceipt", "Functionality" }) 
	   public void validateFieldsOfPrint() throws InterruptedException, Exception {
			//login();
			
			navigateToPage(transferReceiptPage.lnkInventorymanagement(), transferReceiptPage.lnktTransfer());
			
			List<MasterDto> masterDtos = excelHelper.getTestData(transferReceiptModuleSheet, "validateDataOnPrint");
			for (MasterDto masterDto : masterDtos) {

				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);

					transferReceipt.validateFieldsOfPrint(test, masterDto);
					checkNotificationPresenceAndHandle(masterDto);
				}  catch (Exception e) {
					getResults(masterDto);
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}
		}
}
