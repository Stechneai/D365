package com.d365.testlayer;

import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunDesignCodeMaster extends MasterClass {

	ITestResult result;

	@Test(groups = { "Admin", "Jewellery", "Design Code Master", "Functionality" })
	public void DesignCodeMasterData() throws Exception {

		genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
		genericHelper.clickWithJavascriptExecutor(bulkTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(designCodeMasterPage.lnkDesignCodeMaster());

		List<MasterDto> masterDtos = excelHelper.getTestData(designcodeExcel, "Sheet1");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				designCodeMaster.adddesigncodeMasterData(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				checkNotificationPresenceAndHandle(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

}