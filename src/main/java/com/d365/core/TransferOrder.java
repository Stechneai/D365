package com.d365.core;

import java.io.IOException;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class TransferOrder extends MasterClass {
	public void addTransferOrderBranchAndStateWithValidTag(ExtentTest test, MasterDto masterDto) throws Exception {
		
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		

		try {

			if (transferOrderPage.btnNewTransferOrder().isDisplayed()
					&& transferOrderPage.btnTransferOrderIcon().isDisplayed()
					&& transferOrderPage.btnShip().isDisplayed()
					&& transferOrderPage.btnReceive().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Nvigating sucessfully of Transfer order page using following path Inventory management>>Outbound orders>>Transfer order:Is Passed");
				reportHelper.onTestSuccess(test,
						"Navigating sucessfully of Transfer order page using following path Inventory management>>Outbound orders>>Transfer order:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Navigating not sucessfully of Transfer page using following path Inventory management>>Outbound orders>>Transfer order :Is Failed");
				reportHelper.onTestFailure(test,
						"Navigating not sucessfully of Transfer page using following path Inventory management>>Outbound orders>>Transfer order : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Navigating not sucessfully of Transfer page using following path Inventory management>>Outbound orders>>Transfer order");
			reportHelper.onTestFailure(test,
					"Navigating not sucessfully of Transfer page using following path Inventory management>>Outbound orders>>Transfer order");

		}
//		genericHelper.clickWithJavascriptExecutor(transferOrderPage.lnkInventorymanagement());
//		
//		genericHelper.clickWithJavascriptExecutor(transferOrderPage.lnkTransferOrder());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());

		
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
				masterDto.getAttributeValue("Transfer Type"));

		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTagScan());

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransTag(),
				masterDto.getAttributeValue("Scan Tag"));
		Thread.sleep(2000);
		transferOrderPage.btnOtherclick().click();
		reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransGenerateLine());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShip());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());
		
		checkNotificationPresenceAndHandle(masterDto);
		
		Thread.sleep(2000);
		
		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Tag"), "");
		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferSite"), "");


		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkAllTags());
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnOk());
		Thread.sleep(1000);

		WebElement batchn = allTagPage.btnBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnBatchNo());

		allTagPage.txtbatchno().sendKeys(tag);
		Thread.sleep(4000);
		allTagPage.btnApply().click();
		Thread.sleep(2000);
		
		WebElement site=allTagPage.txtCurrentSite();
		String wsite=site.getAttribute("value");
		System.out.println("Get Site is:"+wsite);
		
		
		if (tsite.equals(wsite)) {
			reportHelper.onTestSuccess(test, "Transfer Tag to specified location"  +tsite+  "is sucessfully: ");
		} else {
			reportHelper.onTestFailure(test, "Transfer Tag to specified location"  +tsite+  "is not sucessfully: ");
		}
		// driver.navigate().refresh();

	}

	public void addTransferOrderBranchAndStateWithValidBulkTag(ExtentTest test, MasterDto masterDto) throws Exception {
		
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
    	genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());

		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));
		Thread.sleep(2000);

		if (transferOrderPage.btnValidateTransferStatus().isDisplayed()) {
			reportHelper.generateLogFullScreenSS(test, "Initially Transfer Type name is Created");
		} else {
			reportHelper.generateLogFullScreenSS(test, "Initially Transfer Type name is not  'Created'");

		}
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtTransferType(),
				masterDto.getAttributeValue("Transfer Type"));
		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
		Thread.sleep(2000);
		String type = transferOrderPage.btnValidateTransferOrder().getAttribute("title");
		// String type1=
		// transferorderpage.validateStockTransfer().getAttribute("title");

		System.out.println("type:" + type);

		Thread.sleep(2000);
		if (type.equals("Transfer order")) {
			reportHelper.generateLogFullScreenSS(test, "Tag Transfer is branch to branch");
		} else {
			reportHelper.generateLogFullScreenSS(test, "Tag Transfer is state to state");
		}

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTagScan());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnToggleButton());

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransTag(),
				masterDto.getAttributeValue("Scan Tag"));
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransGenerateLine());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShip());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());
		
		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Tag"), "");
		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferSite"), "");


		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkAllTags());
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnOk());
		Thread.sleep(1000);

		WebElement batchn = allTagPage.btnBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnBatchNo());

		allTagPage.txtbatchno().sendKeys(tag);
		Thread.sleep(4000);
		allTagPage.btnApply().click();
		Thread.sleep(2000);
		
		WebElement site=allTagPage.txtCurrentSite();
		String wsite=site.getAttribute("value");
		System.out.println("Get Site is:"+wsite);
		
		
		if (tsite.equals(wsite)) {
			reportHelper.onTestSuccess(test, "Transfer Tag to specified location"  +tsite+  "is sucessfully: ");
		} else {
			reportHelper.onTestFailure(test, "Transfer Tag to specified location"  +tsite+  "is not sucessfully: ");
		}

		
		// driver.navigate().refresh();
	}

	public void addTransferOrderGCTag(ExtentTest test, MasterDto masterDto) throws Exception {

		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
				masterDto.getAttributeValue("Transfer Type"));

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnGcScan());

		// genericHelper.clickWithJavascriptExecutor(transferorderpage.clickGcNew());
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFrombatch(),
				masterDto.getAttributeValue("From Batch"));
		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTobatch(),
				masterDto.getAttributeValue("To Batch"));

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnScan());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnGenerate());

		// genericHelper.clickWithJavascriptExecutor(transferorderpage.clickToggleButton());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShip());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());

	}

	public void addTransferOrderDocumentScan(ExtentTest test, MasterDto masterDto) throws Exception {
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
    	genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());

		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
				masterDto.getAttributeValue("Transfer Type"));
		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
		Thread.sleep(2000);
		transferOrderPage.txtTransferTagType().clear();
		transferOrderPage.txtTransferTagType().sendKeys(masterDto.getAttributeValue("Transfer Tag Type"), Keys.ENTER);
		Thread.sleep(2000);
		try {

			if (transferOrderPage.txtTransferTagType().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test, "Document scan is selected");
			}
		} catch (NoSuchElementException | TimeoutException e) { // Handle exceptions
			reportHelper.generateLogFullScreenSS(test, "Document scan is not selected or took too long.");
		}

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnSearchButton());
		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferid(),
				masterDto.getAttributeValue("Document Id"));
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkButton());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());
		// genericHelper.doubleClickOn(transferorderpage.clickship());
		transferOrderPage.btnShip().click();
		// Thread.sleep(2000);
		transferOrderPage.btnShipTransfer().click();
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());

	}

	public void addTransferOrderOldMetalCopy(ExtentTest test, MasterDto masterDto) throws Exception {
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
    	genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());

		// Step 1: Set From Warehouse
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));

		// Step 2: Set To Warehouse
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

		// Step 3: Select Transfer Type with JS
		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
				masterDto.getAttributeValue("Transfer Type"));
		reportHelper.generateLogFullScreenSS(test, "Successfully selected transfer type");

		// Step 4: Set Transfer Tag Type
		transferOrderPage.txtTransferTagType().clear();
		transferOrderPage.txtTransferTagType().sendKeys(masterDto.getAttributeValue("Transfer Tag Type"), Keys.ENTER);
		Thread.sleep(2000);

		// Step 5: Validate if Old Metal Copy is selected
		try {
			if (transferOrderPage.txtTransferTagType().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test, "Old metal copy is selected");
			}
		} catch (NoSuchElementException | TimeoutException e) {
			reportHelper.generateLogFullScreenSS(test, "Old metal copy is not selected or took too long.");
		}

		// Step 6: Search
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnSearchButton());
//		transferorderpage.enterDate().click();
//		Thread.sleep(3000);

	
		
//		genericHelper.clearAndsendKeysAndEnter(transferorderpage.enterDate(),
//				masterDto.getAttributeValue("Date"));
//		reportHelper.generateLog(test, "Date entered");
//		Thread.sleep(10000);
	
		//String fromDateStr = getValueOrDefault(masterDto.getAttributeValue("From Date"));
		String toDateStr = getValueOrDefault(masterDto.getAttributeValue("Date"));
 
		// Safely handle null/empty dates
	//	String formattedFromDate = (fromDateStr != null && !fromDateStr.trim().isEmpty()) ? formatDate(fromDateStr): "";
		String formattedToDate = (toDateStr != null && !toDateStr.trim().isEmpty()) ? formatDate(toDateStr) : "";
 
		genericHelper.scrollingTillWebElement(transferOrderPage.txtDate());
		//genericHelper.clearAndSendKeysWithJavascriptExecutor(transferorderpage.enterDate(), formattedFromDate);
		genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtDate(), formattedToDate);
		
		Thread.sleep(2000);
		
	// Step 7: Enter Product Group
		
		genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtProductGroup(),
				getValueOrDefault(masterDto.getAttributeValue("Product Group")));
		reportHelper.generateLog(test, "Product group entered");
		System.out.println("Entered product group");
		Thread.sleep(20000);

		// Step 9: Click Ok Button
//		genericHelper.actions.sendKeys(Keys.TAB);
//		genericHelper.actions.sendKeys(Keys.TAB);
//		genericHelper.actions.sendKeys(Keys.ENTER);
		transferOrderPage.btnOkButton().click();

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShip());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());

	}
	public static String convertExcelSerialDate(double excelDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1900, Calendar.JANUARY, 1); // Excel starts counting from 1900-01-01
		calendar.add(Calendar.DATE, (int) excelDate - 2); // Excel offset (leap year bug)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}
 
// Method to format any date string to "MM/dd/yyyy"
	public static String formatDate(String dateStr) {
		String targetFormat = "MM/dd/yyyy"; // Desired output format
 
		try {
			if (dateStr.matches("\\d+(\\.0)?")) { // Check if it's an Excel serial date
				dateStr = convertExcelSerialDate(Double.parseDouble(dateStr));
			}
			SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat desiredFormat = new SimpleDateFormat(targetFormat);
			Date date = originalFormat.parse(dateStr);
			return desiredFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void validateData(ExtentTest test, MasterDto masterDto) throws Exception {
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
    	genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());
	    // Fetch values from `masterDto`
	    String shipMessage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ValidateSMessage"), "");
	    String receiveMessage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ValidateRMessage"), "");
	    String expectedDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ShipCurrentDate"), "");
	    System.out.println("Expected Ship Date: " + expectedDate);

	    // Populate "From Warehouse" and "To Warehouse" fields
	    genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
	            getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	    genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
	            getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	    try {
	        // Validate Ship Date
	        WebElement shipDateElement = transferOrderPage.lblValidateShipDate();
	        String shipDateText = shipDateElement.getAttribute("title"); // Example: "12/7/2024"

	        // Parse and compare dates
	        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
	        LocalDate webDate = LocalDate.parse(shipDateText, dateFormat);
	        LocalDate currentDate = LocalDate.now();

	        System.out.println("Displayed Ship Date: " + shipDateText);
	        System.out.println("Parsed Ship Date: " + webDate);
	        System.out.println("Current System Date: " + currentDate);

	        // Compare displayed date with current date
	        if (webDate.equals(currentDate)) {
	            System.out.println("The displayed date matches the current date.");
	        } else {
	            System.out.println("The displayed date does NOT match the current date.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("An error occurred while validating the ship date.");
	    }

	    // Enter "Transfer Type"
	    genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
	            masterDto.getAttributeValue("Transfer Type"));

	    // Perform Tag Scan
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTagScan());
	    genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransTag(),
	            masterDto.getAttributeValue("Scan Tag"));

	    Thread.sleep(2000);
	    transferOrderPage.btnOtherclick().click();
	    Thread.sleep(2000);

	    // Generate Transfer Lines
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransGenerateLine());
	    Thread.sleep(2000);


	    // Perform Ship operation
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShip());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipTransfer());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkS());

	    // Validate Ship Message
	    WebElement shipMessageElement = transferOrderPage.lblValidateShipMessage();
	    String actualShipMessage = shipMessageElement.getText();
	    if (actualShipMessage.equalsIgnoreCase(shipMessage)) {
	        reportHelper.generateLogFullScreenSS(test, "Ship functionality is completed");
	    } else {
	        reportHelper.generateLogFullScreenSS(test, "Ship functionality is not completed");
	    }

	    Thread.sleep(2000);

	    // Perform Receive operation
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnReceive());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnShipReceive());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnOkR());

	    // Validate Receive Message
	    WebElement receiveMessageElement = transferOrderPage.lblValidateShipMessage();
	    String actualReceiveMessage = receiveMessageElement.getText();
	    if (actualReceiveMessage.equalsIgnoreCase(receiveMessage)) {
	        reportHelper.generateLogFullScreenSS(test, "Receive functionality is completed");
	    } else {
	        reportHelper.generateLogFullScreenSS(test, "Receive functionality is not started");
	    }
	}
	public void validateNegativeTagData(ExtentTest test, MasterDto masterDto) throws Exception {
		
		navigateToPage(transferOrderPage.lnkInventorymanagement(), transferOrderPage.lnkTransferOrder());
    	genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnNewTransferOrder());
	    // Fetch values from `masterDto`
	    String shipMessage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ValidateSMessage"), "");
	    String receiveMessage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ValidateRMessage"), "");
	    String expectedDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ShipCurrentDate"), "");
	    System.out.println("Expected Ship Date: " + expectedDate);

	    // Populate "From Warehouse" and "To Warehouse" fields
	    genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtFromWarehouse(),
	            getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	    genericHelper.clearAndSendKeysAndEnter(transferOrderPage.txtToWarehouse(),
	            getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	    // Enter "Transfer Type"
	    genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransferType(),
	            masterDto.getAttributeValue("Transfer Type"));

	    // Perform Tag Scan
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTransferOrderIcon());
	    genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnTagScan());
	    genericHelper.sendKeysWithjavascriptExecutor(transferOrderPage.txtTransTag(),
	            masterDto.getAttributeValue("Scan Tag"));

	    Thread.sleep(2000);
	    transferOrderPage.btnOtherclick().click();
	    Thread.sleep(2000);
	    checkNotificationPresenceAndHandle(masterDto);

//	    // Generate Transfer Lines
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickTransGenerateLine());
//	    Thread.sleep(2000);
//		
//	    // Perform Ship operation
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickship());
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickShipTransfer());
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickOkSButton());
//
//	    Thread.sleep(2000);
//
//	    // Perform Receive operation
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickReceive());
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickShipReceive());
//	    genericHelper.clickWithJavascriptExecutor(transferorderpage.clickOkRButton());
//	    Thread.sleep(2000);
//		//checkNotificationPresenceAndHandle(masterDto);

	}
	public void AllTagCheck(ExtentTest test, MasterDto masterDto) throws IOException, InterruptedException {

		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Tag"), "");
		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferSite"), "");


		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkAllTags());
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnOk());
		Thread.sleep(1000);

		WebElement batchn = allTagPage.btnBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(allTagPage.btnBatchNo());

		allTagPage.txtbatchno().sendKeys(tag);
		Thread.sleep(4000);
		allTagPage.btnApply().click();
		Thread.sleep(2000);
		
		WebElement site=allTagPage.txtCurrentSite();
		String wsite=site.getAttribute("value");
		System.out.println("Get Site is:"+wsite);
		
		
		if (tsite.equals(wsite)) {
			reportHelper.onTestSuccess(test, "Transfer Tag to specified location"  +tsite+  "is sucessfully: ");
		} else {
			reportHelper.onTestFailure(test, "Transfer Tag to specified location"  +tsite+  "is not sucessfully: ");
		}

		
		// driver.navigate().refresh();
	}


	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

}
