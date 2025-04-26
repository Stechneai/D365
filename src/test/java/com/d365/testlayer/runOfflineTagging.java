package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runOfflineTagging extends MasterClass {

	@Test
	public void verifyOfflineTagging() throws Exception {
		login();
	//	addGoldTagWithoutWeight();
//		addGoldTagWithWeight();
//       	addMRPTagWithoutWeight();
//		calculationPcs();
//		checkDisableTagAndDoc();

	}
	@Test(groups = { "Admin", "jewellery", "OfflineTagging", "Functionality" }) 
	public void addGoldTagWithoutWeight() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 7; rowIndex <= excelHelper.rowCountExcel(excelPath + "Offlinetaggingnewchanges.xlsx",
				"Sheet1"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "Offlinetaggingnewchanges.xlsx",
					"Sheet1", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);

			try {
				offlineTagging.offlineTaggingWithoutDivideWeight();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}
		}
	}
	@Test(groups = { "Admin", "jewellery", "OfflineTagging", "Functionality" }) 
	public void addGoldTagWithWeight() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Offlinetaggingnewchanges.xlsx",
				"SingleDataWT"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "Offlinetaggingnewchanges.xlsx",
					"SingleDataWT", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				offlineTagging.offlineTaggingWithDivideWeight();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}
		}
	}
	@Test(groups = { "Admin", "jewellery", "OfflineTagging", "Functionality" }) 
	public void addMRPTagWithoutWeight() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Offlinetaggingnewchanges.xlsx",
				"SingleDataWOTMRP"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "Offlinetaggingnewchanges.xlsx",
					"SingleDataWOTMRP", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				offlineTagging.offlineTaggingWithoutDivideWeightMRP();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			}
		}
	}
	@Test(groups = { "Admin", "jewellery", "OfflineTagging", "Validation" }) 
	public void calculationPcs() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Offlinetaggingnewchanges.xlsx",
				"CalPcs"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "Offlinetaggingnewchanges.xlsx",
					"CalPcs", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				offlineTagging.offlineTaggingWithPcsCalc();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			}
		}
	}
	@Test(groups = { "Admin", "jewellery", "OfflineTagging", "UI/UX" }) 
	public void checkDisableTagAndDoc() throws IOException, InterruptedException, InvalidFormatException {

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Offlinetaggingnewchanges.xlsx",
				"DisableDocAndTag"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "Offlinetaggingnewchanges.xlsx",
					"DisableDocAndTag", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				offlineTagging.offlineTaggingWiTagandDocDisable();
			} catch (Exception e) {
				getResults(masterDto);
			}
		}
	}
}
