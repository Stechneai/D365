package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunPostProductReceipt extends MasterClass{
	@Test
	public void getLogin() throws InterruptedException, IOException, InvalidFormatException {

		login();
	
	}
	@Test(groups = { "Admin", "Procrucment and Sourcing", "Post Product Receipt", "Functionality" })
	public void addPostProductReceiptData() throws InvalidFormatException, IOException, InterruptedException {
		navigateToPage(postproductreceiptpage.clickProcrumentandSourcing(),
				postproductreceiptpage.clickPostProductReceipt());
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "postproductreceipt_TestData.xlsx",
				"Sheet1"); rowIndex++) {
//			navigateToPage(postproductreceiptpage.clickProcrumentandSourcing(),
//					postproductreceiptpage.clickPostProductReceipt());
//			genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.clickSelect());
			Map<String, String> orderData = excelHelper
					.readExcelDataAndMap(excelPath + "postproductreceipt_TestData.xlsx", "Sheet1", rowIndex);

			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
				postproductreceipt.postproductreceiptData();
			} catch (Exception e) {
				saveOrderAndHandleErrorsForPPR();
			}

		}
	}

}
