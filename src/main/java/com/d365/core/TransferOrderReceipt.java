package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class TransferOrderReceipt extends MasterClass{

public void TransferOrderReceipt(ExtentTest test, MasterDto masterDto) throws Exception {
		
		navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
		 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");


		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

		
		genericHelper.clearAndSendKeysAndEnter(transferOrderReceiptPage.txtFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
		genericHelper.clearAndSendKeysAndEnter(transferOrderReceiptPage.txtToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

		//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtNoOfBoxes(), noofboxes);
	       Thread.sleep(200);

		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransferOrderIcon());

		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTagScan());

		genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransTag(),
				masterDto.getAttributeValue("Scan Tag"));
		Thread.sleep(2000);
		transferOrderReceiptPage.btnOtherclick().click();
		reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransGenerateLine());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShip());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShipTransfer());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnOkS());
		
		 Thread.sleep(2000);
         genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnPrintTransfer());
         Thread.sleep(2000);
         reportHelper.generateLogFullScreenSS(test, "Transfer order Print Receipt is generated Sucessfully");
         
		

//		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnReceive());
//		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShipReceive());
//		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnOkR());
	
//		checkNotificationPresenceAndHandle(masterDto);
//		
//		Thread.sleep(2000);
		
//		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Tag"), "");
//		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferSite"), "");
//
//
//		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkModules());
//		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
//		Thread.sleep(2000);
//		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkJewellery());
//		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkAllTags());
//		genericHelper.clickWithJavascriptExecutor(allTagPage.btnO	k());
//		Thread.sleep(1000);
//
//		WebElement batchn = allTagPage.btnBatchNo();
//		genericHelper.scrollingTillWebElement(batchn);
//		genericHelper.clickWithJavascriptExecutor(allTagPage.btnBatchNo());
//
//		allTagPage.txtbatchno().sendKeys(tag);
//		Thread.sleep(4000);
//		allTagPage.btnApply().click();
//		Thread.sleep(2000);
//		
//		WebElement site=allTagPage.txtCurrentSite();
//		String wsite=site.getAttribute("value");
//		System.out.println("Get Site is:"+wsite);
//		
//		
//		if (tsite.equals(wsite)) {
//			reportHelper.onTestSuccess(test, "Transfer Tag to specified location"  +tsite+  "is sucessfully: ");
//		} else {
//			reportHelper.onTestFailure(test, "Transfer Tag to specified location"  +tsite+  "is not sucessfully: ");
//		}
//		// driver.navigate().refresh();
//
	}

public void negativeTransferOrderReceipt(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");

	
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
	
	
	genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';",
			transferOrderReceiptPage.txtNoOfBoxes());
	transferOrderReceiptPage.txtNoOfBoxes().sendKeys(Keys.BACK_SPACE);
	transferOrderReceiptPage.txtNoOfBoxes().sendKeys(noofboxes);
	Thread.sleep(3000);

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransferOrderIcon());
	
	
}
public void validateNoOfBoxesField(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");

	
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
	
	genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtNoOfBoxes(), noofboxes);
      Thread.sleep(200);

	reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransferOrderIcon());

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTagScan());
	
}

public void displayNoOfBoxesField(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");

	
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	
	
	try {
		if (transferOrderReceiptPage.labelNoOfBoxes().isDisplayed()) {
			reportHelper.onTestSuccess(test,"No of boxes field is display in transfer order header");
			reportHelper.generateLogFullScreenSS(test,"No of boxes field isdisplay in transfer order header");
		} else {
			reportHelper.onTestSuccess(test, "No of boxes field is not display in transfer order header");
			reportHelper.generateLogFullScreenSS(test,"No of boxes field is not display in transfer order header");
		}
	} catch (Exception e) {
		reportHelper.generateLogFullScreenSS(test, "No of boxes field is not display in transfer order header");
	}
	
	
}
public void beforeShippedPrintTransfer(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");

	
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
	
	genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtNoOfBoxes(), noofboxes);
      Thread.sleep(2000);
      

		genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShip());
		Thread.sleep(2000);
   
	  genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnPrintTransfer());
      
     }

public void afterShippedNoOfBoxField(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");


	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
	
	genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtNoOfBoxes(), noofboxes);
       Thread.sleep(2000);

	reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransferOrderIcon());

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTagScan());

	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransTag(),
			masterDto.getAttributeValue("Scan Tag"));
	Thread.sleep(2000);
	transferOrderReceiptPage.btnOtherclick().click();
	reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransGenerateLine());
	Thread.sleep(2000);

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShip());
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShipTransfer());
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnOkS());
	
	 Thread.sleep(2000);
    
	 WebElement noboxes=transferOrderReceiptPage.txtNoOfBoxes();
	 
	 if(noboxes.isEnabled())
	 {
			reportHelper.onTestFailure(test,"No of pieces field is not disable");
			reportHelper.generateLogFullScreenSS(test,"No of pieces field is not disable");
	 }
	 else
	 {
			reportHelper.onTestSuccess(test,"No of pieces field is disable");
			reportHelper.generateLogFullScreenSS(test,"No of pieces field is disable");
	 }
}   
public void validateDataOfPrint(ExtentTest test, MasterDto masterDto) throws Exception {
	
	navigateToPage(transferOrderReceiptPage.lnkInventorymanagement(), transferOrderReceiptPage.lnkTransferOrder());
	 String noofboxes=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
	 String transferid=StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferId"), "");
	 String itemno=StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemNo"), "");
	 String pcs=StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
	 String netwt=StringUtils.defaultIfBlank(masterDto.getAttributeValue("NetWt"), "");
	 String finewt=StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineWt"), "");
	 String total=StringUtils.defaultIfBlank(masterDto.getAttributeValue("Total"), "");
	 String outlocation=StringUtils.defaultIfBlank(masterDto.getAttributeValue("OutLocation"), "");
	 String inlocation=StringUtils.defaultIfBlank(masterDto.getAttributeValue("InLocation"), "");


	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnNewTransferOrder());

	
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtFromWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("From Warehouse")));
	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtToWarehouse(),
			getValueOrDefault(masterDto.getAttributeValue("To Warehouse")));

	//genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransferType(),masterDto.getAttributeValue("Transfer Type"));
	
	genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtNoOfBoxes(), noofboxes);
       Thread.sleep(200);

	reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransferOrderIcon());

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTagScan());

	genericHelper.sendKeysWithjavascriptExecutor(transferOrderReceiptPage.txtTransTag(),
			masterDto.getAttributeValue("Scan Tag"));
	Thread.sleep(2000);
	transferOrderReceiptPage.btnOtherclick().click();
	reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnTransGenerateLine());
	Thread.sleep(2000);

	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShip());
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnShipTransfer());
	Thread.sleep(2000);
	genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnOkS());
	
	 Thread.sleep(2000);
     genericHelper.clickWithJavascriptExecutor(transferOrderReceiptPage.btnPrintTransfer());
     Thread.sleep(200);
     reportHelper.generateLogFullScreenSS(test, "Transfer order Print Receipt is generated Sucessfully");
     
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
  		validateExtractedData(test, extractedData, noofboxes);
  		transferidDisplay();
  		validateExtractedData(test, extractedData, itemno);
  		validateExtractedData(test, extractedData, pcs);
  		validateExtractedData(test, extractedData, netwt);
  		validateExtractedData(test, extractedData, finewt);
  		validateExtractedData(test, extractedData, total);
  		validateExtractedData(test, extractedData, outlocation);
  		validateExtractedData(test, extractedData, inlocation);
  	
  		
}

public void transferidDisplay() throws IOException {
    String transferId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TransferId"), "");
    String actualTransferId = "TNUM0000000";

    if (actualTransferId.contains(transferId)) {
        reportHelper.onTestSuccess(test, "Transfer ID matches");
    } else {
        reportHelper.onTestFailure(test, "Transfer ID does not match");
    }
}
}

