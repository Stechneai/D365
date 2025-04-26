package com.d365.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class MonthlySavingSchemeDefaulterList extends MasterClass {

	public void validateDefaulterListReportBoth(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");
		String customercode1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode1"), "");
		String customercode2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode2"), "");
		String customercode3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode3"), "");
		String schemeentryno1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber1"), "");
		String schemeentryno2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber2"), "");
		String schemeentryno3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber3"), "");

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = "01-14-2025"; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),fromdate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownType(), type);
		Thread.sleep(2000);
		monthlySavingSchemeDefaulterListPage.btnok().click();
		
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnok());
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnDownload());
		// monthlySavingSchemeDefaulterListPage.btnDownload().click();

		// Runtime.getRuntime().exec("C:/Users/lenovo/Downloads/downloadClick.exe");

		// Use Robot Class to handle system pop-ups
		downloadPDF();
		Thread.sleep(3000);

		// Get the latest downloaded PDF
		String latestPdfFile = waitForLatestDownloadedPDF(DOWNLOAD_DIR);
		if (latestPdfFile == null) {
			System.out.println("No PDF file found in the download directory.");
			return;
		}
		System.out.println("Latest PDF Found: " + latestPdfFile);

		// Extract data dynamically from the PDF
		Map<String, Object> extractedData = extractDataFromPDF(latestPdfFile);
		if (extractedData == null) {
			System.out.println("No data extracted from PDF.");
			return;
		}
		System.out.println("Extracted Invoice Data: " + extractedData);

		// Validate extracted data
		validateExtractedData(test, extractedData, schemeentryno1);
		validateExtractedData(test, extractedData, store);
		
//		WebElement cuscode2 = monthlySavingSchemeDefaulterListPage.txtCustomerCode2();
//		String actualCustomerCode2 = cuscode2.getAttribute("value");
//	   System.out.println("Value:" + actualCustomerCode2);
//	
// 	WebElement stores = monthlySavingSchemeDefaulterListPage.labelStored();
//	String actualStores = stores.getAttribute("value");
//   System.out.println("Value:" + actualStores);
//		if (customercode2.equalsIgnoreCase(actualCustomerCode2) && store.equalsIgnoreCase(actualStores))
//
//		{
//			reportHelper.onTestSuccess(test, "Selected branch data are displayed.");
//			reportHelper.generateLogFullScreenSS(test, "Selected branch data are displayed.");
//		} else {
//			reportHelper.onTestFailure(test, "Selected branch data are not displayed.");
//			reportHelper.generateLogFullScreenSS(test, "Selected branch data are not displayed.");
//	}
	}
//		WebElement cuscode2 = monthlySavingSchemeDefaulterListPage.txtCustomerCode2();
//		String actualCustomerCode2 = cuscode2.getAttribute("value");
//		System.out.println("Value:" + actualCustomerCode2);
//
//		WebElement schmentry2 = monthlySavingSchemeDefaulterListPage.txtSchemeEntryNo2();
//		String actualSchemeEntryNo2 = schmentry2.getAttribute("value");
//		System.out.println("Value:" + actualSchemeEntryNo2);
//
//		// Validate Making Item No.
//		WebElement cuscode3 = monthlySavingSchemeDefaulterListPage.txtCustomerCode3();
//		String actualCustomerCode3 = cuscode3.getAttribute("value");
//		System.out.println("Value:" + actualCustomerCode3);
//
//		WebElement schmentry3 = monthlySavingSchemeDefaulterListPage.txtSchemeEntryNo3();
//		String actualSchemeEntryNo3 = schmentry3.getAttribute("value");
//		System.out.println("Value:" + actualSchemeEntryNo3);

//		if (customercode1.equalsIgnoreCase(actualCustomerCode1)
//				&& schemeentryno1.equalsIgnoreCase(actualSchemeEntryNo1)) {
//			reportHelper.onTestSuccess(test, "Customer code1 and SchemeEntryNo1 are correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code1 and SchemeEntryNo1 are correctly fetched.");
//		} else {
//			reportHelper.onTestFailure(test, "Customer code1 and SchemeEntryNo1 are not  correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code1 and SchemeEntryNo1 are not correctly fetched.");
//		}
//
//		if (customercode2.equalsIgnoreCase(actualCustomerCode2)
//				&& schemeentryno2.equalsIgnoreCase(actualSchemeEntryNo2))
//
//		{
//			reportHelper.onTestSuccess(test, "Customer code2 and SchemeEntryNo2 are correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code2 and SchemeEntryNo2 are correctly fetched.");
//		} else {
//			reportHelper.onTestFailure(test, "Customer code2 and SchemeEntryNo2 are not  correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code2 and SchemeEntryNo2 are not correctly fetched.");
//		}
//		if (customercode3.equalsIgnoreCase(actualCustomerCode3)
//				&& schemeentryno3.equalsIgnoreCase(actualSchemeEntryNo3)) {
//			reportHelper.onTestSuccess(test, "Customer code3 and SchemeEntryNo3 are correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code1 and SchemeEntryNo1 are correctly fetched.");
//		} else {
//			reportHelper.onTestFailure(test, "Customer code3 and SchemeEntryNo3 are not  correctly fetched.");
//			reportHelper.generateLogFullScreenSS(test, "Customer code3 and SchemeEntryNo3 are not correctly fetched.");
//		}

	
	public void navigationDefaulterListReport(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException {

			genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		try {

			if (monthlySavingSchemeDefaulterListPage.labelStorel().isDisplayed()
					&& monthlySavingSchemeDefaulterListPage.labelSchemeTypel().isDisplayed()
					&& monthlySavingSchemeDefaulterListPage.labelFromDatel().isDisplayed()
					&& monthlySavingSchemeDefaulterListPage.labelToDatel().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Navigating sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");
				reportHelper.onTestSuccess(test,
						"Navigating sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Navigating not sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");
				reportHelper.onTestFailure(test,
						"Navigating not sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Navigating not sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");
			reportHelper.onTestFailure(test,
					"Navigating not sucessfully of Scheme Defaultter list using following Path Jewellery>>Monthly Saving Scheme Defaulter Report");

		}
	}
	
	public void multipleSelectionStoreDefaulterListReport(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String store1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store1"), "");
		System.out.println("Store1:"+store1);
		String store2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store2"), "");
		System.out.println("Store2:"+store2);
		String storemulti = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StoreMulti"), "");
		System.out.println("StoreMulti:"+storemulti);



		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store1);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store2);
		
//		String fieldName = masterDto.getAttributeValue("labelStorel");
//	    String expected = masterDto.getAttributeValue("Store1");
//		compareFields(test, masterDto, fieldName, expected);
		
		WebElement store = monthlySavingSchemeDefaulterListPage.dropDownStore();
		String actualStore = store.getAttribute("value");
	     System.out.println("Value:" + actualStore);
		if (storemulti.equalsIgnoreCase(actualStore))

		{
			reportHelper.onTestSuccess(test, "Store dropdown is mutiselection");
			reportHelper.generateLogFullScreenSS(test, "Store dropdown is mutiselection.");
		} else {
			reportHelper.onTestFailure(test, "Store dropdown is single selection.");
			reportHelper.generateLogFullScreenSS(test, "Store dropdown is single selection");
		}
	}
		
	public void mandatoryFields(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = "MM-DD-YYYY"; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),fromdate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownType(), type);
		Thread.sleep(2000);
		monthlySavingSchemeDefaulterListPage.btnok().click();
		
		monthlySavingSchemeDefaulterListPage.btnNotification().click();
		
		

	}
	
	public void mandatoryFieldForStore(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = fromdate; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),fromdate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownType(), type);
		Thread.sleep(2000);
		monthlySavingSchemeDefaulterListPage.btnok().click();
		
		monthlySavingSchemeDefaulterListPage.btnNotification().click();
		
		

	}
	public void validationFromDate(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = fromdate; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);
		
		WebElement fromdte=monthlySavingSchemeDefaulterListPage.datePickerFromDate();
		String atualFromDate=fromdte.getAttribute("value");
		System.out.println("Date:"+atualFromDate);

		if (formattedDate.equalsIgnoreCase(atualFromDate))
		{
			reportHelper.onTestSuccess(test, "From date field is accept future or past date");
			reportHelper.generateLogFullScreenSS(test, "From date field is accept future or past date");
		} else {
			reportHelper.onTestFailure(test, "From date field is not accept future or past date");
			reportHelper.generateLogFullScreenSS(test, "From date field is not accept future or past date");
		}
		driver.navigate().refresh();
	}
		
		

	
	public void validationToDate(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
	
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(3000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(3000);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
	
		WebElement todte=monthlySavingSchemeDefaulterListPage.datePickerToDate();
		String atualToDate=todte.getAttribute("value");
		System.out.println("Date:"+atualToDate);
		if (todate.equalsIgnoreCase(atualToDate))

		{
			reportHelper.onTestSuccess(test, "To date field is accept future or past date");
			reportHelper.generateLogFullScreenSS(test, "To date field is accept future or past date");
		} else {
			reportHelper.onTestFailure(test, "To date field is not accept future or past date");
			reportHelper.generateLogFullScreenSS(test, "To date field is not accept future or past date");
		}
		driver.navigate().refresh();


	}
	
	public void validateDefaulterListReportLess(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");
		String customercode1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode1"), "");
		String customercode2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode2"), "");
		String customercode3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode3"), "");
		String schemeentryno1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber1"), "");
		String schemeentryno2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber2"), "");
		String schemeentryno3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber3"), "");

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = "01-14-2025"; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),fromdate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownType(), type);
		Thread.sleep(2000);
		monthlySavingSchemeDefaulterListPage.btnok().click();
		
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnok());
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnDownload());
		// monthlySavingSchemeDefaulterListPage.btnDownload().click();

		// Runtime.getRuntime().exec("C:/Users/lenovo/Downloads/downloadClick.exe");

		// Use Robot Class to handle system pop-ups
		downloadPDF();
		Thread.sleep(3000);

		// Get the latest downloaded PDF
		String latestPdfFile = waitForLatestDownloadedPDF(DOWNLOAD_DIR);
		if (latestPdfFile == null) {
			System.out.println("No PDF file found in the download directory.");
			return;
		}
		System.out.println("Latest PDF Found: " + latestPdfFile);

		// Extract data dynamically from the PDF
		Map<String, Object> extractedData = extractDataFromPDF(latestPdfFile);
		if (extractedData == null) {
			System.out.println("No data extracted from PDF.");
			return;
		}
		System.out.println("Extracted Invoice Data: " + extractedData);

		// Validate extracted data
		validateExtractedData(test, extractedData, schemeentryno1);
		validateExtractedData(test, extractedData, store);
		
//		WebElement cuscode2 = monthlySavingSchemeDefaulterListPage.txtCustomerCode2();
//		String actualCustomerCode2 = cuscode2.getAttribute("value");
//	   System.out.println("Value:" + actualCustomerCode2);
//	
// 	WebElement stores = monthlySavingSchemeDefaulterListPage.labelStored();
//	String actualStores = stores.getAttribute("value");
//   System.out.println("Value:" + actualStores);
//		if (customercode2.equalsIgnoreCase(actualCustomerCode2) && store.equalsIgnoreCase(actualStores))
//
//		{
//			reportHelper.onTestSuccess(test, "Selected branch data are displayed.");
//			reportHelper.generateLogFullScreenSS(test, "Selected branch data are displayed.");
//		} else {
//			reportHelper.onTestFailure(test, "Selected branch data are not displayed.");
//			reportHelper.generateLogFullScreenSS(test, "Selected branch data are not displayed.");
//	}
	}

	public void validateDefaulterListReportExcess(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException, AWTException {
		String store = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store"), "");
		String schemetype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");
		String customercode1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode1"), "");
		String customercode2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode2"), "");
		String customercode3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerCode3"), "");
		String schemeentryno1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber1"), "");
		String schemeentryno2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber2"), "");
		String schemeentryno3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryNumber3"), "");

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.lnkSchemeDefaulterList());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownStore(),
				store);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownSchemeType(),
				schemetype);
		Thread.sleep(2000);

		String excelDate = "01-14-2025"; // Example input from Excel
		String formattedDate = convertDateFormatJava8(excelDate);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),
				formattedDate);

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerFromDate(),fromdate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.datePickerToDate(),
				todate);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.dropDownType(), type);
		Thread.sleep(2000);
		monthlySavingSchemeDefaulterListPage.btnok().click();
		
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnok());
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnDownload());
		// monthlySavingSchemeDefaulterListPage.btnDownload().click();

		// Runtime.getRuntime().exec("C:/Users/lenovo/Downloads/downloadClick.exe");

		// Use Robot Class to handle system pop-ups
		downloadPDF();
		Thread.sleep(3000);

		// Get the latest downloaded PDF
		String latestPdfFile = waitForLatestDownloadedPDF(DOWNLOAD_DIR);
		if (latestPdfFile == null) {
			System.out.println("No PDF file found in the download directory.");
			return;
		}
		System.out.println("Latest PDF Found: " + latestPdfFile);

		// Extract data dynamically from the PDF
		Map<String, Object> extractedData = extractDataFromPDF(latestPdfFile);
		if (extractedData == null) {
			System.out.println("No data extracted from PDF.");
			return;
		}
		System.out.println("Extracted Invoice Data: " + extractedData);

		// Validate extracted data
		validateExtractedData(test, extractedData, schemeentryno1);
		validateExtractedData(test, extractedData, store);
		}
}