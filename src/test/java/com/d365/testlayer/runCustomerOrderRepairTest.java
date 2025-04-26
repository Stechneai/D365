package com.d365.testlayer;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runCustomerOrderRepairTest extends MasterClass {

//	@Test
//	public void addCustomerOrderRepairData() throws InterruptedException, Exception {
//		// loginPage(driver, username, password);
//		login();
//	}

//	@Test(enabled = false)
//	public void addCustomerRepair() throws IOException, InterruptedException, InvalidFormatException {
//		navigateToPage(customerOrderRepairPage.selectJewellery(), customerOrderRepairPage.customerOrderRepairModule());
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"Add"); rowIndex++) {
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"Add", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.addCustomerOrderRepair();
//				checkNotificationPresenceAndHandle1();
//
//			} catch (Exception e) {
//				getResults(masterDto);
//
//			}
//
//		}
//
//	}
//
//	@Test(enabled = false)
//	public void checkBatchNo() throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"BatchNo"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"BatchNo", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.checkRepairBatchNo();
//				// checkNotificationPresenceAndHandle();
//
//			} catch (Exception e) {
//				getResults(masterDto);
//
//			}
//
//		}
//
//	}
//
//	@Test(enabled = true)
//	public void checkDeleteOrder() throws IOException, InterruptedException, InvalidFormatException {
//		navigateToPage(customerOrderRepairPage.selectJewellery(), customerOrderRepairPage.customerOrderRepairModule());
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"Delete"); rowIndex++) {
//
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"Delete", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.deleteOrder();
//				// checkNotificationPresenceAndHandle();
//
//			} catch (Exception e) {
//				getResults(masterDto);
//
//			}
//
//		}
//
//	}

	// @Test(enabled = true)
	public void checkNavigationCustomerRepair() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"NavigationCustRepair"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"NavigationCustRepair", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.navigationCustomerOrderRepair();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}

		}

	}

//	@Test(enabled = true)
	public void checkNavigationCustomerRepairBatchWise()
			throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"NavigationCustBatchWise"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"NavigationCustBatchWise", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.navigationCustomerOrderRepair();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}

		}

	}
//
//	@Test(enabled = false)
//	public void validateDeleteValidation() throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"DeleteValidation"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"DeleteValidation", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.validateDeleteButtonAfterBefore();
//				// checkNotificationPresenceAndHandle();
//
//			} catch (Exception e) {
//				getResults(masterDto);
//			}
//		}
//
//	}
//
//	@Test(enabled = true)
//	public void validateOrderDateIsDisplayCurrentDate()
//			throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"CurrentDate"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"CurrentDate", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.validateCurrentDate();
//				// checkNotificationPresenceAndHandle();
//
//			} catch (Exception e) {
//				getResults(masterDto);
//			}
//		}
//	}

//	@Test(enabled = true)
//	public void validateStatusAfterConfirmCancelInitialOrder()
//			throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"Status"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"Status", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.validateOrderStatus();
//				// checkNotificationPresenceAndHandle();
//			} catch (Exception e) {
//				// getResults(masterDto);
//			}
//		}
//
//	}

//	@Test(enabled = false)
//	public void validationCustomerOrderRepair() throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"ValidationNegative"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"ValidationNegative", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.negativeCustomerOrderRepair();
//				checkNotificationPresenceAndHandle();
//			} catch (Exception e) {
//				getResults(masterDto);
//			}
//		}
//	}
//
//	@Test(enabled = false)
//	public void validateTagReserveWithoutConfirmOrder()
//			throws IOException, InterruptedException, InvalidFormatException {
//
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
//				"TagReservedWCO"); rowIndex++) {
//			navigateToPage(customerOrderRepairPage.selectJewellery(),
//					customerOrderRepairPage.customerOrderRepairModule());
//			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
//					"TagReservedWCO", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			try {
//				customerOrderRepair.reserveTagWithoutConfirmOrder();
//				checkNotificationPresenceAndHandle();
//			} catch (Exception e) {
//				getResults(masterDto);
//			}
//		}
//	}	

//	@Test(enabled = true)
	public void validateTagReserveProcess() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"TagReserved"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"TagReserved", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.reserveTagProcess(); 
			//	checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}	
		
	}

	//@Test(enabled = false)
	public void validateTagUnReserveProcess() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"TagUnReserved"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"TagUnReserved", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.unreserveTagProcess(); 
			//	checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}	
		
	}
	

//	@Test(enabled = true)
	public void negativeTagReserveProcess() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"TagReservedNegative"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"TagReservedNegative", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.reserveTagNegativeProcess(); 
				checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}
	}

//	@Test
	public void addMultipleDataAddLine()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"MultipleData"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"MultipleData", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.addMultipleDataOrder();
				checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}
	}
	//@Test(enabled = true)
	public void checkCancelFunctionality() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"Cancel"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"Cancel", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.checkCancelButtonValidation(); 
				checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}	
		
	}

//	@Test(enabled = true)
	public void checkOrderTypeOrderCategory() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"CheckFields"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"CheckFields", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.validateFields(); 
				
			//	checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				// getResults(masterDto);
				System.out.println(e);
			}
		}
		
	}
	
	@Test(enabled = true)
	public void checkValueCustomerRepairLines() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
				"ValidateValues"); rowIndex++) {
			navigateToPage(customerOrderRepairPage.selectJewellery(),
					customerOrderRepairPage.customerOrderRepairModule());
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
					"ValidateValues", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrderRepair.validateOrderValues(); 
			//	checkNotificationPresenceAndHandle1();
			} catch (Exception e) {
				 getResults(masterDto);
				System.out.println(e);
			}
			
		}	
	}

}
