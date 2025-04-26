package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.core.UrdAddData;
import com.d365.utils.MasterClass;

public class RunUrdAddData extends MasterClass {

	@Test(priority = 0, enabled = true, groups = "Functionality")
	public void getLogin() throws Exception {
		loginPage(driver, username, password);
	}

//	@Test(priority = 1, enabled = true, groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void testUrdAddDataAllItem() throws Exception {
//		loginPage(driver, username, password);
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"UrdAddAllItem1"); rowIndex++) {
			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"UrdAddAllItem1", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			urdAddData.UrdAddAllItem();

			try {
				urdAddData.UrdAddAllItem();
			} catch (Exception e) {
				getResults();
				
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdAddDataMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"MrpFormingAdd"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"MrpFormingAdd", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdAddMrpFoItem();
//				checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdDataOpenEstimateAllItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OpenEstimateAllItem"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OpenEstimateAllItem", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdopenestimateAllItem();
//					checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdDataOpenEstimateMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OpenEstimateMrpForming"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OpenEstimateMrpForming", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdopenestimateMrpFoItem();
//					checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdDataCancelEstimateAllItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"CancelEstimateAllItem"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"CancelEstimateAllItem", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdcancelestimateAllItem();
//						checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdDataCancelEstimateMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"CancelEstimateMrpForming"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"CancelEstimateMrpForming", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdCancelEstimateMrpFoItem();
//						checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDataDeleteAllItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"DeleteAllItem"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"DeleteAllItem", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrddeleteAllItem();
//							checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDataDeleteMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"DeleteMrpForming"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"DeleteMrpForming", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrddeleteMrpFoItem();
//							checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDataOrnamentCategoryAllItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OrnamentCategoryAllItemGSP"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OrnamentCategoryAllItemGSP", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdornamentcategoryAllItem();
//								checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDataOrnamentCategoryMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OrnamentCategoryDataMrpForming"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OrnamentCategoryDataMrpForming", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdornamentcategoryMrpFoItem();
//								checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void PurchaseTransValueDataAllItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"PurchaseTransValueAllItem"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"PurchaseTransValueAllItem", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.PurchaseTransValueAllItem();
				checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void PurchaseTransValueDataMrpFoItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"Sheet4"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx", "Sheet4",
					rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.PurchaseTransValueMrpFoItem();
				checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdAddDataDiamondJewelleryItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"DiamondJewelleryAddData"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"DiamondJewelleryAddData", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdAddDiamondJewelleryItem();
//			checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdOpenEstimateDataDiamondJewelleryItem()
			throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OpenEstimateDJdata"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OpenEstimateDJdata", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdOpenEstimateDiamondJewelleryItem();
//				checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdCancelEstimateDataDiamondJewelleryItem()
			throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"CancelEstimateDJData"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"CancelEstimateDJData", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdCancelEstimagteDiamondJewelleryItem();
//					checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDeleteDataDiamondJewelleryItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"DeleteDJData"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"DeleteDJData", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdDeleteDiamondJewelleryItem();
//						checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Validation" })
	public void UrdDataOrnamentCategoryDJItem() throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"OrnamentCategoryDataMrpForming"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"OrnamentCategoryDataMrpForming", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdornamentcategoryDJItem();
//							checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

	@Test(groups = { "Admin", "Jewellery", "Old Gold Note", "Functionality" })
	public void UrdPurchTransValueDataDiamondJewelleryItem()
			throws InvalidFormatException, IOException, InterruptedException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "urd_TestData.xlsx",
				"PurchTransValueDJData"); rowIndex++) {

			// Reading and mapping data from the Excel file for the current row
			Map<String, String> invoiceData = excelHelper.readExcelDataAndMap(excelPath + "urd_TestData.xlsx",
					"PurchTransValueDJData", rowIndex);
			navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
			// Set attributes in the DTO for easy access to data later
			for (Map.Entry<String, String> entry : invoiceData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}

			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				urdAddData.UrdPurchTransValueDiamondJewelleryItem();
//							checkNotificationPresenceAndHandle();
			} catch (Exception e) {
				getResults();
			}
		}
	}

}
