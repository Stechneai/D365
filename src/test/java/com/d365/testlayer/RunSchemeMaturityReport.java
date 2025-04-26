package com.d365.testlayer;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.GenericHelper;
import com.sharedutils.MasterDto;

public class RunSchemeMaturityReport extends MasterClass {
	ITestResult result;

	
//	public void login() throws InterruptedException {
//		driver.findElement(By.id("Username")).sendKeys("VaishnaviK");
//		// driver.findElement(By.id("idSIButton9")).click();
//		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Abcd@12345");
//		Thread.sleep(3000);
//		// driver.findElement(By.xpath("//input[contains(@id,\"idSIB\")]")).click();
//		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
//	}

	@Test
	public void RunSchemeMaturityReport() throws Exception {

		genericHelper.clickWithJavascriptExecutor(schememmaturityreportpage.lnkHambergermenu());
		genericHelper.clickWithJavascriptExecutor(schememmaturityreportpage.lnkSchemeMaturityReport());
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
