package com.d365.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;
import com.sharedutils.GlobalConstants;

public class CustomerOrderPos extends MasterClass {

	public void addCustomerOrderPos() throws InterruptedException, IOException, InvalidFormatException {

		validateEstimateFields(customerOrderPos.employeeError(), 1);
		validateEstimateFields(customerOrderPos.employeeError(), 2);
		getAllFieldValueAndCompare();
	}

	public void scanTag() throws InterruptedException {
		genericHelper.actions.click(customerOrderPos.employee()).build().perform();
		genericHelper.clearAndSendKeysAndEnter(customerOrderPos.empSearch(),
				getValueOrDefault(masterDto.getAttributeValue("Employee")));
//		genericHelper.clearAndSendKeysWithjavascriptExecutor(customerOrderPos.tagScan(),
//				getValueOrDefault(masterDto.getAttributeValue("TagScan")));
		genericHelper.clearAndSendkeysWithActions(customerOrderPos.orderNo(),
				getValueOrDefault(masterDto.getAttributeValue("OrderNo")));
		Thread.sleep(2000);
		genericHelper.actions.click(customerOrderPos.tagSearchBtn()).build().perform();
	}

//	public void handleValidationPos() throws InterruptedException, FileNotFoundException, IOException {
//		String estimationUrl = driver.getCurrentUrl();
//		System.out.println("URL " + estimationUrl);
//		if (estimationUrl.contains("saveEstimate")) {
//			System.out.println("In IF");
//			reportHelper.onTestSuccess(test, masterDto.getAttributeValue("ExpectedMessage"));
//			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ExpectedMessage"));
//			driver.navigate().to(propertyHelper.readDataFromPropertyFile(GlobalConstants.CONFIG_FILE, "URL"));
//		} else {
//			System.out.println("In else");
//			reportHelper.onTestFailure(test, masterDto.getAttributeValue("ErrorMessage"));
//			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ErrorMessage"));
//			driver.navigate().to(propertyHelper.readDataFromPropertyFile(GlobalConstants.CONFIG_FILE, "URL"));
//		}
//	}

	public void isFieldMandatory(WebElement element) throws IOException, InterruptedException {
		String actualAlertMessage = element.getText();
		System.out.println("actualAlertMessage " + actualAlertMessage);
		if (actualAlertMessage.equalsIgnoreCase(masterDto.getAttributeValue("ExpectedMessage"))) {
			reportHelper.onTestSuccess(test, masterDto.getAttributeValue("ExpectedMessage"));
			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ExpectedMessage"));
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.employeeAlertClose());
			driver.navigate().refresh();

		} else {
			reportHelper.onTestFailure(test, masterDto.getAttributeValue("ErrorMessage"));
			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ErrorMessage"));
			driver.navigate().refresh();
		}
	}

	public void validateEstimateFields(WebElement error, int rowNum)
			throws IOException, InterruptedException, InvalidFormatException {
		Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "posCustomerOrder_TestData.xlsx",
				"POS", rowNum);
		for (Map.Entry<String, String> entry : orderData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		genericHelper.actions.click(customerOrderPos.employee()).build().perform();
		genericHelper.clearAndSendKeysAndEnter(customerOrderPos.empSearch(),
				getValueOrDefault(masterDto.getAttributeValue("Employee")));

//		genericHelper.clearAndSendKeysWithjavascriptExecutor(customerOrderPos.tagScan(),
//				getValueOrDefault(masterDto.getAttributeValue("TagScan")));
		genericHelper.clearAndSendkeysWithActions(customerOrderPos.orderNo(),
				getValueOrDefault(masterDto.getAttributeValue("OrderNo")));
		Thread.sleep(2000);
		genericHelper.actions.click(customerOrderPos.tagSearchBtn()).build().perform();
		isFieldMandatory(error);
	}

	public void checkCalculations(WebElement element, String expectedValue, int rowNum)
			throws IOException, InterruptedException, InvalidFormatException {
		Map<String, String> rowData = excelHelper.readExcelDataAndMap(excelPath + "posCustomerOrder_TestData.xlsx",
				"POS", rowNum);

		for (Map.Entry<String, String> entry : rowData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		scanTag();
		if (rowNum > 6 && rowNum < 20) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.barcodeDetails());
		} else if (rowNum > 20 && rowNum < 29) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.makingDetails());
		} else if (rowNum > 29 && rowNum < 37) {
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.stoneAmountDetails());
		}
		String actualValue;
		try {

			try {

				actualValue = element.getText();
			} catch (Exception e) {
				actualValue = element.getAttribute("Value");
			}
			softAssert.assertEquals(actualValue, expectedValue, masterDto.getAttributeValue("ExpectedMessage"));
			reportHelper.onTestSuccess(test, masterDto.getAttributeValue("ExpectedMessage"));
			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ExpectedMessage"));
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.tableAction());
			driver.navigate().refresh();
		} catch (Exception e) {
			reportHelper.onTestFailure(test, masterDto.getAttributeValue("ErrorMessage"));
			reportHelper.generateLogFullScreenSS(test, masterDto.getAttributeValue("ErrorMessage"));
			genericHelper.clickWithJavascriptExecutor(customerOrderPos.tableAction());
			driver.navigate().refresh();
		}
	}

	public void getAllFieldValueAndCompare() throws IOException, InterruptedException, InvalidFormatException {

		checkCalculations(customerOrderPos.barcodeScanned(), getValueOrDefault(masterDto.getAttributeValue("Barcode")),
				3);
		checkCalculations(customerOrderPos.rate(), getValueOrDefault(masterDto.getAttributeValue("Rate")), 4);
		checkCalculations(customerOrderPos.pcs(), getValueOrDefault(masterDto.getAttributeValue("PCS")), 5);
		checkCalculations(customerOrderPos.netWeightTable(),
				getValueOrDefault(masterDto.getAttributeValue("NetWeight")), 6);
		checkCalculations(customerOrderPos.itemName(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeItemName")), 7);
		checkCalculations(customerOrderPos.category(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeCategory")), 8);
		checkCalculations(customerOrderPos.purity(), getValueOrDefault(masterDto.getAttributeValue("BarcodePurity")),
				9);
		checkCalculations(customerOrderPos.grossWeight(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeGrossWeight")), 10);
		checkCalculations(customerOrderPos.netWeight(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeNetWeight")), 11);
		checkCalculations(customerOrderPos.metalAmount(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeMetalAmount")), 12);
		checkCalculations(customerOrderPos.hmcharges(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeHmCharges")), 13);
		checkCalculations(customerOrderPos.brMakingCharges(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeMakingCharges")), 14);
		checkCalculations(customerOrderPos.brStoneAmount(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeStoneAmount")), 15);
		checkCalculations(customerOrderPos.brLiDiscount(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeLIDiscount")), 16);
		checkCalculations(customerOrderPos.brItemAmount(),
				getValueOrDefault(masterDto.getAttributeValue("BarcodeItemAmount")), 17);
		checkCalculations(customerOrderPos.empid(), getValueOrDefault(masterDto.getAttributeValue("BarcodeEmpId")), 18);
		checkCalculations(customerOrderPos.size(), getValueOrDefault(masterDto.getAttributeValue("BarcodeSize")), 19);
		checkCalculations(customerOrderPos.makingCharges(),
				getValueOrDefault(masterDto.getAttributeValue("MakingCharges")), 20);

		checkCalculations(customerOrderPos.labourType(), getValueOrDefault(masterDto.getAttributeValue("LabourType")),
				21);
		checkCalculations(customerOrderPos.labourRate(), getValueOrDefault(masterDto.getAttributeValue("LabourRate")),
				22);
		checkCalculations(customerOrderPos.labourCharges(),
				getValueOrDefault(masterDto.getAttributeValue("LabourCharges")), 23);
		checkCalculations(customerOrderPos.netWeightMk(), getValueOrDefault(masterDto.getAttributeValue("NetWeightMk")),
				24);
		checkCalculations(customerOrderPos.wastageRate(), getValueOrDefault(masterDto.getAttributeValue("WastageRate")),
				25);
		checkCalculations(customerOrderPos.wastageWeight(),
				getValueOrDefault(masterDto.getAttributeValue("WastageWeight")), 26);
		checkCalculations(customerOrderPos.wastageAmount(),
				getValueOrDefault(masterDto.getAttributeValue("WastageAmount")), 27);
		checkCalculations(customerOrderPos.otherCharges(),
				getValueOrDefault(masterDto.getAttributeValue("OtherCharges")), 28);
		checkCalculations(customerOrderPos.stoneAmount(), getValueOrDefault(masterDto.getAttributeValue("StoneAmount")),
				29);

		checkCalculations(customerOrderPos.stoneName(), getValueOrDefault(masterDto.getAttributeValue("StoneName")),
				30);
		checkCalculations(customerOrderPos.stoneCategory(),
				getValueOrDefault(masterDto.getAttributeValue("StoneCategory")), 31);
		checkCalculations(customerOrderPos.stoneSize(), getValueOrDefault(masterDto.getAttributeValue("StoneSize")),
				32);
		checkCalculations(customerOrderPos.stonePcs(), getValueOrDefault(masterDto.getAttributeValue("StonePCS")), 33);
		checkCalculations(customerOrderPos.stoneWeight(),
				getValueOrDefault(masterDto.getAttributeValue("StoneWeight(g)")), 34);
		checkCalculations(customerOrderPos.stoneRate(), getValueOrDefault(masterDto.getAttributeValue("StoneRate")),
				35);
		checkCalculations(customerOrderPos.stoneAmountDetails(),
				getValueOrDefault(masterDto.getAttributeValue("StoneAmountSt")), 36);
		checkCalculations(customerOrderPos.netWeightTable(),
				getValueOrDefault(masterDto.getAttributeValue("LIDiscount")), 37);
		checkCalculations(customerOrderPos.astrologer(), getValueOrDefault(masterDto.getAttributeValue("Astrologer")),
				38);
	}

}