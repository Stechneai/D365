package com.d365.testlayer;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunMonthlySavingSchemeDefaulterList extends MasterClass {
	ITestResult result;  
	
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void validateDefaulterListReport() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "Add");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.validateDefaulterListReportBoth(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} 
			finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Functional" })
	public void navigationDefaulterListReport() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "Navigation");
		for (MasterDto masterDto : masterDtos) {
//			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.navigationDefaulterListReport(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
//			} catch (Exception e) {
//				getResults(masterDto);
//			} finally {
        	reportHelper.generateExcelReport(test, result, masterDto);
//			}
		}
	}	
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Functional" })
	public void multipleSelectionStoreDefaulterListReport() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "MultipleStore");
		for (MasterDto masterDto : masterDtos) {
//			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.multipleSelectionStoreDefaulterListReport(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
//			} catch (Exception e) {
//				getResults(masterDto);
//			} finally {
//				reportHelper.generateExcelReport(test, result, masterDto);
//			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void mandatoryFields() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "Mandatory");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.mandatoryFields(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}	
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void mandatoryFieldForStore() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "MandatoryStore");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.mandatoryFieldForStore(test, masterDto);
				checkNotificationPresenceAndHandleForStore(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}	
	
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void validationFromDate() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "FromDatePastAndFuture");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.validationFromDate(test, masterDto);
			//	checkNotificationPresenceAndHandleForStore(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}	
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void validationToDate() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "ToDatePastAndFuture");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.validationToDate(test, masterDto);
			//	checkNotificationPresenceAndHandleForStore(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void validateDefaulterListReportLess() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "LessType");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.validateDefaulterListReportLess(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} 
			finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "MonthlySavingDefaulterList", "Validation" })
	public void validateDefaulterListReportExcess() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(defaultmaturitylist, "ExcessType");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				monthlySavingSchemeDefaulterList.validateDefaulterListReportExcess(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} 
			finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
}



