package com.d365.testlayer;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunFranchiseeReport extends MasterClass {
	ITestResult result;

		@Test
	public void FranchiseeReport() throws Exception {

		genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
		genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(franchiseereportpage.lnkFranchiseeReport());

		List<MasterDto> masterDtos = excelHelper.getTestData(franchiseereportExcel, "Sheet1");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				franchiseereport.add(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				checkNotificationPresenceAndHandle(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
}
