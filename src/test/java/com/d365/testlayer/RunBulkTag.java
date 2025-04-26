package com.d365.testlayer;

import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunBulkTag extends MasterClass {

	ITestResult result;

	@Test(groups = { "Admin", "Jewellery", "Offline Tagging Bulk Tag", "Functionality" })
	public void Add() throws Exception {
//		login();

		// masterDto);
		List<MasterDto> masterDtos = excelHelper.getTestData(bulktagExcel, "Sheet1");

		// navigateToPage(bulkTagPage.lnkJewellery(), bulkTagPage.lnkOfflineTagging(),
		for (MasterDto masterDto : masterDtos) {
			genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
			genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkJewellery());
			genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkOfflineTagging());

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				bulkTag.bulktagGO(masterDto);
				checkNotificationPresenceAndHandleForBulkTagForThreeCondition(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	// @Test(groups = { "Admin", "Jewellery", "Offline Tagging Bulk Tag",
	// "Validation" })
	public void Delete() throws Exception {
		genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
		genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkOfflineTagging());

		// navigateToPage(bulkTagPage.lnkJewellery(), bulkTagPage.lnkOfflineTagging(),
		// masterDto);
		List<MasterDto> masterDtos = excelHelper.getTestData(bulktagExcel, "Sheet1");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				bulkTag.bulktagallitemDelete(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {

				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
}
