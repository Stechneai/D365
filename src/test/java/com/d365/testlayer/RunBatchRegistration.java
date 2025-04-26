package com.d365.testlayer;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunBatchRegistration extends MasterClass {
	ITestResult result;

	//@Test(enabled = true, groups = { "admin", "Jewellery", "BatchRegistration", "Functionality" })
	public void verifyMakingItemNo() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "ValidateMakingNoBR");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				batchRegistration.processProvisonalParcelPOBatchRegistration(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "BatchRegistration", "Functionality" })
	public void verifyWithoutEnterMakingItemNo() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "withoutEnterMakingNo");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				batchRegistration.WithoutEnterMakingItemNo(test, masterDto);
				checkNotificationPresenceAndHandleBR(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "BatchRegistration", "Functionality" })
	public void validatePmcDataValue() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "PMCLineData");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				batchRegistration.validatePMCData(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "BatchRegistration", "Functionality" })
	public void validateMakingItemNoEditableOrNot() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "MakingItemEditable");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				batchRegistration.editableMakingItemNo1(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

}