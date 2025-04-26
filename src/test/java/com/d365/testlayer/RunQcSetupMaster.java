package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunQcSetupMaster extends MasterClass {
@Test
	public void getLogin() throws InterruptedException, IOException, InvalidFormatException {

		login();
			 
	}
@Test(groups = { "Admin", "Jewellery", "Qc Setuo Master", "Functionality" })
public void addQcSetupMaster() throws InvalidFormatException, IOException, InterruptedException {

	navigateToPage(qcSetupMasterPage.clickJewellery(),
			qcSetupMasterPage.clickQcSetupMaster()); 
	
	if(qcSetupMasterPage.NewBtn().isDisplayed() &&  qcSetupMasterPage.editBtn().isDisplayed() && qcSetupMasterPage.Delete_btn().isDisplayed()&& qcSetupMasterPage.itemIdField().isDisplayed() && qcSetupMasterPage.configurationField().isDisplayed()
		&& qcSetupMasterPage.designCheckFieldDD().isDisplayed()	&& qcSetupMasterPage.QCCheckFieldDD().isDisplayed() && qcSetupMasterPage.hmCheckFieldDD().isDisplayed() && qcSetupMasterPage.lmCheckFieldDD().isDisplayed() && qcSetupMasterPage.poCheckFieldDD().isDisplayed())
	{
		reportHelper.onTestSuccess(test,"TC_01 User should be successfully reaches the \"Qc Set Up Master\" page by navigating through"
				+ "Jewellery>>Master>>Qc Set Up Master"
				+ "with below option\r\n"
				+ "1.New"
				+ "2.Edit"
				+ "3.Delete "
				+ "TC_02Grid view of Qc Set Up should be contains below fields 1.Item Id 2.Configuration 3.Dc Check 4.Qc ceck 5.Hm Check 6.LM Check 7.Po Check"); 
		reportHelper.generateLogFullScreenSS(test, "TC_01 User should be successfully reaches the \"Qc Set Up Master\" page by navigating through\"\r\n"
				+ "					+ \"Jewellery>>Master>>Qc Set Up Master"
				+ "					+ \"with below option"
				+ "					+ \"1.New"
				+ "					+ \"2.Edit"
				+ "					+ \"3.Delete"
				+ "TC_02Grid view of Qc Set Up should be contains below fields 1.Item Id 2.Configuration 3.Dc Check 4.Qc ceck 5.Hm Check 6.LM Check 7.Po Check");
	}
	else
	{
		reportHelper.onTestFailure(test, "TC_01User should be successfully reaches the \"Qc Set Up Master\" page by navigating through\r\n"
				+ "Jewellery>>Master>>Qc Set Up Master\r\n"
				+ "with below option\r\n"
				+ "1.New\r\n"
				+ "2.Edit\r\n"
				+ "3.Delete\r\n"
				+ "TC_02Grid view of Qc Set Up should be contains below fields 1.Item Id 2.Configuration 3.Dc Check 4.Qc ceck 5.Hm Check 6.LM Check 7.Po Check");
		reportHelper.generateLogFullScreenSS(test, "TC_01User should be successfully reaches the \"Qc Set Up Master\" page by navigating through\r\n"
				+ "Jewellery>>Master>>Qc Set Up Master\r\n"
				+ "with below option\r\n"
				+ "1.New\r\n"
				+ "2.Edit\r\n"
				+ "3.Delete\r\n"
				+ "TC_02Grid view of Qc Set Up should be contains below fields 1.Item Id 2.Configuration 3.Dc Check 4.Qc ceck 5.Hm Check 6.LM Check 7.Po Check");
	}
	
	
	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "qcsetupmaster_TestData.xlsx",
			"Sheet1"); rowIndex++) {
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		// Reading and mapping data from the Excel file for the current row
		Map<String, String> invoiceData = excelHelper
				.readExcelDataAndMap(excelPath + "qcsetupmaster_TestData.xlsx", "Sheet1", rowIndex);

		// Set attributes in the DTO for easy access to data later
		for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}

		test = reportHelper.createTestCase(test, extentReports, masterDto);
		try {
			qcSetupMaster.qcsetupmaster();
			
		} catch (Exception e) {
			getResults(); // Error handling for Pending Vendor Invoices (PVI)
		}
	}
}

@Test(groups = { "Admin", "Jewellery", "Qc Setup Master", "Validation" })
public void withoutAllDataQcSetupMaster() throws InvalidFormatException, IOException, InterruptedException {

	navigateToPage(qcSetupMasterPage.clickJewellery(),
			qcSetupMasterPage.clickQcSetupMaster()); // Navigate to Pending Vendor Invoices
	// page
	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "qcsetupmaster_TestData.xlsx",
			"Sheet2"); rowIndex++) {
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		// Reading and mapping data from the Excel file for the current row
		Map<String, String> invoiceData = excelHelper
				.readExcelDataAndMap(excelPath + "qcsetupmaster_TestData.xlsx", "Sheet2", rowIndex);

		// Set attributes in the DTO for easy access to data later
		for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}

		test = reportHelper.createTestCase(test, extentReports, masterDto);
		try {
			qcSetupMaster.withoutDataqcsetup();
			
		} catch (Exception e) {
			getResults(); // Error handling for Pending Vendor Invoices (PVI)
		}
	}
}
@Test(groups = { "Admin", "Jewellery", "Qc Setup MAster", "Functionality" })
public void EditRecordQcSetupMaster() throws InvalidFormatException, IOException, InterruptedException {

	navigateToPage(qcSetupMasterPage.clickJewellery(),
			qcSetupMasterPage.clickQcSetupMaster()); // Navigate to Pending Vendor Invoices
	// page
	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "qcsetupmaster_TestData.xlsx",
			"Sheet3"); rowIndex++) {
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.editBtn());   //change path of edit button earlier new button path is added 
		// Reading and mapping data from the Excel file for the current row
		Map<String, String> invoiceData = excelHelper
				.readExcelDataAndMap(excelPath + "qcsetupmaster_TestData.xlsx", "Sheet3", rowIndex);

		// Set attributes in the DTO for easy access to data later
		for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}

		test = reportHelper.createTestCase(test, extentReports, masterDto);
		try {
			qcSetupMaster.editrecordqcsetup();
			
		} catch (Exception e) {
			getResults(); // Error handling for Pending Vendor Invoices (PVI)
		}
	}
}
}
