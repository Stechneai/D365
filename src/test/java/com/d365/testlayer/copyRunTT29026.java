package com.d365.testlayer;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class copyRunTT29026 extends MasterClass {
	ITestResult result;

	@Test(priority = 1)
	public void addProvisionalParcel() throws Exception {
		login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet1");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto); 
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 2) 
	public void verifyProvisionalparcelforDuplicateEntrywithSameItemSamePuritySameConfig_TC_05() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet2"); 
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntrywithSameItemSamePuritySameConfig(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 3) 
	public void verifyQcprocess_TC_07() throws Exception {
		//login(); 

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet3");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyQcProcessForDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{
				e.printStackTrace();
			} finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

   @Test (priority = 4) 
	public void verifyBatchRegistrationforDuplicateEntry_TC_08() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet4");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistration_TC_08(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto); 
			}
		}

	}

    @Test (priority = 5) 
	public void verifyBatchRegistrationforDuplicateEntry_Karagir_TC_10() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet5");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistrationForKaragir_TC_10(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
    
    @Test (priority = 6)
    public void addProvisionalParcelSilver() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet6");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto); 
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 7) 
	public void verifyProvisionalparcelforDuplicateEntrywithSameItemSamePuritySameConfig_TC_05_Silver() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet7"); 
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntrywithSameItemSamePuritySameConfig(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 8) 
	public void verifyQcprocess_TC_07_Silver() throws Exception {
		//login(); 

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet8");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyQcProcessForDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{
				e.printStackTrace();
			} finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

   @Test (priority = 9) 
	public void verifyBatchRegistrationforDuplicateEntry_TC_08_Silver() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet9");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistration_TC_08(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto); 
			}
		}

	}

    @Test (priority = 10) 
	public void verifyBatchRegistrationforDuplicateEntry_Karagir_TC_10_Silver() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet10");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistrationForKaragir_TC_10(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
    
    @Test (priority = 11) 
    public void addProvisionalParcelPlatinum() throws Exception 
    {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet11");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto); 
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 12) 
	public void verifyProvisionalparcelforDuplicateEntrywithSameItemSamePuritySameConfig_TC_05_Platinum() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet12"); 
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntrywithSameItemSamePuritySameConfig(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 13) 
	public void verifyQcprocess_TC_07_Platinum() throws Exception {
		//login(); 

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet13");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyQcProcessForDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{
				e.printStackTrace();
			} finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

   @Test (priority = 14) 
	public void verifyBatchRegistrationforDuplicateEntry_TC_08_Platinum() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet14");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistration_TC_08(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto); 
			}
		}

	}

    @Test (priority = 15) 
	public void verifyBatchRegistrationforDuplicateEntry_Karagir_TC_10_Platinum() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet15");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistrationForKaragir_TC_10(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
    
    @Test (priority = 16) 
    public void addProvisionalParcelMRPForming() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet16");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto); 
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 17) 
	public void verifyProvisionalparcelforDuplicateEntrywithSameItemSamePuritySameConfig_TC_05MRPForming() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet17"); 
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyprovisionalParcelforDuplicateEntrywithSameItemSamePuritySameConfig(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				getResults();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

  @Test (priority = 18) 
	public void verifyQcprocess_TC_07MRPForming() throws Exception {
		//login(); 

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet18");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyQcProcessForDuplicateEntry(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{
				e.printStackTrace();
			} finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

   @Test (priority = 19) 
	public void verifyBatchRegistrationforDuplicateEntry_TC_08MRPForming() throws Exception {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet19");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistration_TC_08(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto); 
			}
		}

	}

    @Test (priority = 20) 
	public void verifyBatchRegistrationforDuplicateEntry_Karagir_TC_10MRPForming() throws Exception 
    {
		//login();

		List<MasterDto> masterDtos = excelHelper.getTestData(duplicateentryProvisional, "Sheet20");
		for (MasterDto masterDto : masterDtos) {

			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				provisionalParcelDuplicateEntry.verifyBatchRegistrationForKaragir_TC_10(masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
				e.printStackTrace();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}

}
