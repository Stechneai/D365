package com.d365.testlayer;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunPDCReport extends MasterClass {
	
	ITestResult result;
	
	@Test(enabled=true,groups={"admin","Jewellery","PDCReport","Functionality"})
	public void validatePdcReport() throws InvalidFormatException, IOException, InterruptedException
	{

		List<MasterDto> masterDtos = excelHelper.getTestData(pdcreport, "Sheet1");
		for (MasterDto masterDto : masterDtos) {
//			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				pdcReport.reportReportDataValidate(test, masterDto);
				//checkNotificationPresenceAndHandleBR(masterDto);
//			} catch (Exception e) {
//				getResults(masterDto);
//			} finally {
//				reportHelper.generateExcelReport(test, result, masterDto);
//			}
		}
	
	}
}


