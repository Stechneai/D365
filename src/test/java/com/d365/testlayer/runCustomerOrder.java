package com.d365.testlayer;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runCustomerOrder extends MasterClass {
//	@Test
//	public void getLogin() throws InterruptedException {
//		login();
//	}

	// @Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void createCustomerOrder() throws InterruptedException, AWTException, IOException, InvalidFormatException {

		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Add"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Add", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.addHeaderAndAddlineEnterAddItemDetailsAll();
				// checkCalculations();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
//					reportHelper.onTestFailure(test, "Exception in Run " + e.getMessage());
//					reportHelper.generateLogWithScreenshot(test, "AssertionError: ");
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void validationCustomerOrder()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {

		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Negative"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Negative", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

//			if (rowIndex==1) {
//				customerOrder.addHeaderAndAddlineEnterAddItemDetailsNegative();
//				// checkCalculations();
//				checkNotificationPresenceAndHandle(masterDto);
//				break;
//			}

			try {
				customerOrder.addHeaderAndAddlineEnterAddItemDetailsNegative();
				// checkCalculations();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
//					reportHelper.onTestFailure(test, "Exception in Run " + e.getMessage());
//					reportHelper.generateLogWithScreenshot(test, "AssertionError: ");
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void createCustomerOrderNavigation()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Navigation"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Navigation", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.navigationCustomerOrder();
				// checkCalculations();
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
//						reportHelper.onTestFailure(test, "Exception in Run " + e.getMessage());
//						reportHelper.generateLogWithScreenshot(test, "AssertionError: ");
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void deleteCustomerOrder() throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Delete"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Delete", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.deleteOrder();

				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
//					reportHelper.onTestFailure(test, "Exception in Run " + e.getMessage());
//					reportHelper.generateLogWithScreenshot(test, "AssertionError: ");
			}
		}

	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void validateReservedTagWithoutConfirmOrder()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"ReservedWCO"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"ReservedWCO", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

//				try {
			customerOrder.reserveTagWithoutConfirmOrder();
			checkNotificationPresenceAndHandle(masterDto);
//				} catch (Exception e) {
			//
//					// getResults(masterDto);
//				}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void addMultipleDataAddLine()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"MultipleData"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"MultipleData", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

//				try {
			customerOrder.addMultipleDataOrder();
			checkNotificationPresenceAndHandle(masterDto);

//				} catch (Exception e) {

//					getResults(masterDto);
//					reportHelper.onTestFailure(test, "Exception in Run " + e.getMessage());
//					reportHelper.generateLogWithScreenshot(test, "AssertionError: ");
//				}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void verifyTagReserved() throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"TagReserved"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"TagReserved", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			customerOrder.reserveTagProcess();
			// checkNotificationPresenceAndHandle(masterDto);
		}
	}

	@Test
	public void verifyTagUnReserved() throws InterruptedException, AWTException, IOException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"TagUnReserved"); rowIndex++) {
			navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
					customerOrderPage.tableOrder());

			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"TagUnReserved", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

//			try {
			customerOrder.unreserveTagProcess();
			// checkNotificationPresenceAndHandle(masterDto);
//			} catch (Exception e) {

			// getResults(masterDto);
//			}
		}
	}

	@Test
	public void verifyTagReservedNegative()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"TagReservedNegative"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"TagReservedNegative", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.reserveTagNegativeProcess();
				checkNotificationPresenceAndHandleNew(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void verifyCancelDisable() throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Cancel"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Cancel", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.checkCancelDisable();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

	// @Test(groups = { "Admin", "jewellery", "Customer Order", "UI/UX" })
	public void verifyFieldDisable() throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"FieldCheck"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"FieldCheck", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.validateFields();
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Functionality" })
	public void verifyCurrentDate() throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Currentdate"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Currentdate", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.validateCurrentDate();
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Validation" })
	public void verifyCancelFunctionalityStatus()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"Status"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"Status", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.validateOrderStatus();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

//	@Test(groups = { "Admin", "jewellery", "Customer Order", "Validation" })
	public void verifyValuesAllOrderLines()
			throws InterruptedException, AWTException, IOException, InvalidFormatException {
		navigateToPage(customerOrderPage.selectJewellery(), customerOrderPage.customerOrderModule(),
				customerOrderPage.tableOrder());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
				"ValidateValues"); rowIndex++) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
					"ValidateValues", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				customerOrder.validateOrderValues();
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {

				getResults(masterDto);
			}
		}
	}

}
