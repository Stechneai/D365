package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runRng extends MasterClass {
	
//	@Test(priority = 0, enabled = true)
	public void rngProcess() throws Exception {
		System.out.println("IN RNGPROCESS.............");
		login();
	}

	@Test(groups = { "Admin", "jewellery", "RNG",
			"Functionality" })
	public void add() throws Exception {
		login();
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx", "Add"); rowIndex++) {

			navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Add",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addData();
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Validation" })
	public void validate() throws Exception {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"ValidateGenerate"); rowIndex++) {

			navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"ValidateGenerate", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {

				rng.checkValidatedGeneratedPostTag();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "UI/UX" })
	public void navigation() throws Exception {

		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"Navigation"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			try {
				if (rngpage.clickRNew().isDisplayed() && rngpage.clickValidate().isDisplayed()
						&& rngpage.clickPost().isDisplayed()) {
					reportHelper.onTestSuccess(test,
							"Navigate sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");

					reportHelper.generateLogFullScreenSS(test,
							"Navigate sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");
				} else {
					reportHelper.onTestFailure(test,
							"Navigate not sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");

					reportHelper.generateLogFullScreenSS(test,
							"Navigate not sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");
				}
			} catch (Exception e) {
				reportHelper.generateLogFullScreenSS(test,
						"Navigate not sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");
				reportHelper.onTestFailure(test,
						"Navigate not sucessfully to RNG Process using following path:-> Jewellery>>Master>>RNG Process");

			}

			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Navigation",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.checkNavigation();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Validation" })
	public void addNegative() throws Exception {

		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"Negative"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Negative",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.negativeData();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Functionality" })
	public void delete() throws InterruptedException, InvalidFormatException, IOException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"Delete"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Delete",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.deleteData();
				// checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "UI/UX" })
	public void postCheck() throws InterruptedException, InvalidFormatException, IOException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"PostEnable"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "PostEnable",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.postEnableDisable();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Functionality" })
	public void addDiamond() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"Diamond"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Diamond",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addDData();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Functionality" })
	public void multipleData() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"Multiple"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "Multiple",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addMultipleData();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Validation" })
	public void multipleNegativeData() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"MultipleNegative"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"MultipleNegative", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addMultipleNegativeData();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "UI/UX" })
	public void validatePoststatus() throws InvalidFormatException, IOException, InterruptedException {

		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"ValidateStatus"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());

			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"ValidateStatus", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.validateStatus();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Functionality" })
	public void negativeTagQuantity() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"QuantityFieldCheck"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"QuantityFieldCheck", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.negativeQuantity();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Functionality" })
	public void checkToggleButton() throws InvalidFormatException, IOException, InterruptedException {

		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"ValidateToggle"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());

			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"ValidateToggle", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.validateToggleButton();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Validation" })
	public void checkDate() throws InvalidFormatException, IOException, InterruptedException {

		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"ValidateDate"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());

			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "ValidateDate",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.validateDate();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Validation" })
	public void validateQuantityPreTagHeader() throws Exception {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"QuantityPreTagField"); rowIndex++) {

			navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx",
					"QuantityPreTagField", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addValidateQuantityPreTagHeader();
				checkNotificationPresenceAndHandleAlert();
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	@Test(groups = { "Admin", "jewellery", "RNG", "Funtionality" })
	public void addMultipleDiamond() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(rngpage.clickJewellery(), rngpage.clickRng());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "TestData.xlsx",
				"DiamondMult"); rowIndex++) {

			genericHelper.clickWithJavascriptExecutor(rngpage.clickRNew());
			// genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "TestData.xlsx", "DiamondMult",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				rng.addDaimondMultipleData();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}



}
