package com.d365.testlayer;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.sharedutils.MasterDto;

public class runItemTypeMaster extends MasterClass {

	ITestResult result;
	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })
	public void addHMInItemMaster() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "Add");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.addHmItemData(test, masterDto);
			//	checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);	
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	
	//@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void ValidateDublicateRecord() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "Duplicate");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.duplicateRecord(test, masterDto);
			//		checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}	
	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void verifyNavigationItemMaster() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "Navigation");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.navigationItemMaster(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	
	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void verifySelectionOfHMItem() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "CheckHMField");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.addHmItem(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void verifyEditableOrNotHMItem() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "EditHMField");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.editableOrNotHmItem(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void deleteData() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "Delete");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.delete(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "ItemTypeMaster", "Functionality" })

	public void validateInvalideHmItem() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(hmtype, "HMFieldHallInvalid");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				itemTypeMaster.invalideHmItem(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			}catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	

}
