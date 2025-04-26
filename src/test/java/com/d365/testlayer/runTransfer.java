package com.d365.testlayer;


import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;


public class runTransfer extends MasterClass {
	ITestResult result;
//   @Test
//	public void transferRun() throws Exception
//	{
////	loginPage(driver, username, password);
//	//	transfer.newTransfer();
//	//	transfer.newBulkTransfer();
//	//	transfer.newValidate();
//	//	transfer.newValidateCounter();
//	}
	
	
	@Test(priority=1, groups = { "Admin", "Inventory Management", "Transfer", "Functionality" }) 
   public void newTransfer() throws InterruptedException, Exception {
		login();
		
		navigateToPage(transferPage.lnkInventorymanagement(), transferPage.lnktTransfer());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferModuleSheet, "TransferTag");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transfer.addTagTransfer(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			}  catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	@Test(priority=2, groups = { "Admin", "Inventory Management", "Transfer", "Funtionality" }) 
	public void newBulkTransfer() throws InterruptedException, Exception {
		
		login();
		navigateToPage(transferPage.lnkInventorymanagement(), transferPage.lnktTransfer());
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferModuleSheet, "TransferBulk");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transfer.addBulkTagTransfer(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}		
	}
	
	@Test(priority=3, groups = { "Admin", "Inventory Management", "Transfer", "Validation" })
	public void newValidate() throws InterruptedException, Exception {
		loginPage(driver, username, password);

		List<MasterDto> masterDtos = excelHelper.getTestData(transferModuleSheet, "NavigationValidate");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);

				transfer.validateNavigation(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(priority=4, groups = { "Admin", "Inventory Management", "Transfer", "Validation" }) 
	public void newValidateCounter() throws InterruptedException, Exception {
		loginPage(driver, username, password);
		
		List<MasterDto> masterDtos = excelHelper.getTestData(transferModuleSheet, "TransferTagValidate");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				
				transfer.validateTagCounter(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
}