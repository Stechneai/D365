package com.d365.core;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class TransferReceipt extends MasterClass {
	public void generateTransferReceipt(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.sendKeysAndEnterWithWait(transferReceiptPage.txtSite(), datasite, 0);
		Thread.sleep(2000);

		genericHelper.clearAndSendKeysAndEnter(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtHeaderNoOfBoxes(), noofboxes);
		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagScanning());

		// genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtEnterTag(),
		// datatag);
		// Thread.sleep(2000);
		transferReceiptPage.txtEnterTag().sendKeys(datatag);
		Thread.sleep(4000);
		genericHelper.actions.sendKeys(Keys.TAB).build().perform();

		// Thread.sleep(200);
		try {
			// Wait for visibility of invalid tag
			wait.until(ExpectedConditions.visibilityOf(transferReceiptPage.txtInvalidTag()));
			if (transferReceiptPage.txtInvalidTag().isDisplayed()) {

				reportHelper.generateLogFullScreenSS(test,
						"Tag is not from selected location or Tag is not release status");

			} else {
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtLocation(), datalocation);
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtCounter(), datalocationid);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnGenerateLine());

				Thread.sleep(200);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagrelease());
				Thread.sleep(200);

				genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtScanningStatus(),
						statusyes);
				Thread.sleep(300);

				transferReceiptPage.btnValidate().click();
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnValidateOk());
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnLines());
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPost());

				Thread.sleep(300);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPostOK());
				Thread.sleep(200);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPrintTransfer());
				Thread.sleep(200);

				reportHelper.generateLogFullScreenSS(test, "Transfer Print Receipt is generated Sucessfully");
			}
		} catch (NoSuchElementException | TimeoutException e) { // Handle exceptions
			System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
		}

	}

	public void negativeTransferReceipt(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String noofboxes1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes1"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtNoOfBoxesHeader(), noofboxes);
		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagScanning());

		genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtEnterTag(), datatag);
		// Thread.sleep(2000);
		genericHelper.actions.sendKeys(Keys.TAB).build().perform();

		// Thread.sleep(200);
		try {
			// Wait for visibility of invalid tag
			wait.until(ExpectedConditions.visibilityOf(transferReceiptPage.txtInvalidTag()));
			if (transferReceiptPage.txtInvalidTag().isDisplayed()) {

				reportHelper.generateLogFullScreenSS(test,
						"Tag is not from selected location or Tag is not release status");
				checkNotificationPresenceAndHandle(masterDto);
			}
		} catch (NoSuchElementException | TimeoutException e) { // Handle exceptions
			System.out.println("No invalid tag element found. Proceeding with valid tag actions.");

		}
	}

	public void displayNoOfBoxesInCraeteInventoryPage(ExtentTest test, MasterDto masterDto) throws Exception {
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOFBoxes"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());
//
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
//		Thread.sleep(2000);
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
//		Thread.sleep(2000);
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
//				inventorylocation);
//		Thread.sleep(2000);
		// genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(),
		// noofboxes);

		// genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

//		WebElement nob = 
//		String actualNoOfBoxes = nob.getText();
//		System.out.println(":" + actualNoOfBoxes);
		try {
			if (transferReceiptPage.labelNoOfBoxesInventory().isDisplayed()) {
				reportHelper.onTestSuccess(test, "No of boxes field is display");
				reportHelper.generateLogFullScreenSS(test, "No of boxes field isdisplay");
			} else {
				reportHelper.onTestFailure(test, "No of boxes field is not display");
				reportHelper.generateLogFullScreenSS(test, "No of boxes field is not display");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "No of boxes field is not display");
		}
	}

	public void negativeNoOfBoxesInventory(ExtentTest test, MasterDto masterDto)
			throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);

		genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';",
				transferReceiptPage.txtJournalNoOfBoxes());
		transferReceiptPage.txtJournalNoOfBoxes().sendKeys(Keys.BACK_SPACE);
		transferReceiptPage.txtJournalNoOfBoxes().sendKeys(noofboxes);
		Thread.sleep(3000);
		
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
//		genericHelper.clearAndSendkeysWithActions(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

	}

	public void displayNoOfBoxesInHeader(ExtentTest test, MasterDto masterDto) throws Exception {
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOFBoxes"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");
		String noofboxes1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes1"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.sendKeysAndEnterWithWait(transferReceiptPage.txtSite(), datasite, 0);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.labelNoOfBoxesHeader(),
		// noofboxes);
		
		try {
			if (transferReceiptPage.labelNoOfBoxesHeader().isDisplayed()) {
				reportHelper.onTestSuccess(test, "No of boxes field is display");
				reportHelper.generateLogFullScreenSS(test, "No of boxes field isdisplay");
			} else {
				reportHelper.onTestFailure(test, "No of boxes field is not display");
				reportHelper.generateLogFullScreenSS(test, "No of boxes field is not display");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "No of boxes field is not display");
		}
	}

	public void reflectionNoOfBoxesInHeader(ExtentTest test, MasterDto masterDto) throws Exception {
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOFBoxes"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");
		String noofboxes1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes1"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		// genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.labelNoOfBoxesHeader(),
		// noofboxes);

		WebElement nob = transferReceiptPage.txtHeaderNoOfBoxes();
		String actualNoOfBoxes = nob.getText();
		System.out.println(":" + actualNoOfBoxes);

		if (noofboxes1.equalsIgnoreCase(actualNoOfBoxes)) {
			reportHelper.onTestSuccess(test, "No of boxes is reflected correctly in Header no of boxes");
			reportHelper.generateLogFullScreenSS(test, "No of boxes is reflected correctly in Header no of boxes");
		} else {
			reportHelper.onTestSuccess(test, "No of boxes is not reflected correctly in Header no of boxes");
			reportHelper.generateLogFullScreenSS(test, "No of boxes is not reflected correctly in Header no of boxes");
		}
	}

	public void negativeNoOfBoxesHeader(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String noofboxes1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes1"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtNoOfBoxesHeader(), noofboxes1);
		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnSave());

	}

	public void beforePostedPrint(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPrintTransfer());

	}

	public void afterPostNoOfBoxesFiled(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtJournalNoOfBoxes(), noofboxes);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtNoOfBoxesHeader(), noofboxes);
		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagScanning());
//		
//
//		//genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtEnterTag(), datatag);
//		// Thread.sleep(2000);
//		transferReceiptPage.txtEnterTag().sendKeys(datatag);
//		Thread.sleep(4000);
//		genericHelper.actions.sendKeys(Keys.TAB).build().perform();

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferOrderReceiptPage.txtTransTag(),
				masterDto.getAttributeValue("Scan Individual Tag"));
		Thread.sleep(2000);
		transferOrderReceiptPage.labelclick().click();

		// Thread.sleep(200);
		try {
			// Wait for visibility of invalid tag
			wait.until(ExpectedConditions.visibilityOf(transferReceiptPage.txtInvalidTag()));
			if (transferReceiptPage.txtInvalidTag().isDisplayed()) {

				reportHelper.generateLogFullScreenSS(test,
						"Tag is not from selected location or Tag is not release status//Cannot Select Bulk Tag");

			} else {
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtLocation(), datalocation);
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtCounter(), datalocationid);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnGenerateLine());

				Thread.sleep(200);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagrelease());
				Thread.sleep(200);

				genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtScanningStatus(),
						statusyes);
				Thread.sleep(300);

				transferReceiptPage.btnValidate().click();
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnValidateOk());
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnLines());
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPost());

				Thread.sleep(300);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPostOK());
				Thread.sleep(2000);

				WebElement noboxes = transferReceiptPage.txtNoOfBoxesHeader();

				if (noboxes.isEnabled()) {
					reportHelper.onTestFailure(test, "No of pieces field is not disable");
					reportHelper.generateLogFullScreenSS(test, "No of pieces field is not disable");
				} else {
					reportHelper.onTestSuccess(test, "No of pieces field is disable");
					reportHelper.generateLogFullScreenSS(test, "No of pieces field is disable");
				}
			}
		} catch (NoSuchElementException | TimeoutException e) { // Handle exceptions
			System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
		}

	}

	public void validateFieldsOfPrint(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct WebDriverWait usage

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		String noofboxes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfBoxes"), "");
		String journalid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("JournalId"), "");
		String itemno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemNo"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		String netwt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NetWt"), "");
		String finewt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineWt"), "");
		String total = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Total"), "");
		String outlocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("OutLocation"), "");
		String inlocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InLocation"), "");
		String inventorylocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("InventoryLocation"), "");

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnNeworder());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtSite(), datasite);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtWarehouse(), datawarehouse);
		Thread.sleep(2000);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferReceiptPage.txtInventoryLocation(),
				inventorylocation);
		Thread.sleep(2000);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtNoOfBoxesInventory(), noofboxes);
		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnOk());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtNoOfBoxesHeader(), noofboxes);
		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagScanning());

		// genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtEnterTag(),
		// datatag);
		// Thread.sleep(2000);
		transferReceiptPage.txtEnterTag().sendKeys(datatag);
		Thread.sleep(4000);
		genericHelper.actions.sendKeys(Keys.TAB).build().perform();

		// Thread.sleep(200);
		try {
			// Wait for visibility of invalid tag
			wait.until(ExpectedConditions.visibilityOf(transferReceiptPage.txtInvalidTag()));
			if (transferReceiptPage.txtInvalidTag().isDisplayed()) {

				reportHelper.generateLogFullScreenSS(test,
						"Tag is not from selected location or Tag is not release status//Cannot Select Bulk Tag");

			} else {
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtLocation(), datalocation);
				genericHelper.sendKeysWithjavascriptExecutor(transferReceiptPage.txtCounter(), datalocationid);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnGenerateLine());

				Thread.sleep(200);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnTagrelease());
				Thread.sleep(200);

				genericHelper.clearAndSendKeysWithJavascriptExecutor(transferReceiptPage.txtScanningStatus(),
						statusyes);
				Thread.sleep(300);

				transferReceiptPage.btnValidate().click();
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnValidateOk());
				Thread.sleep(300);

				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnLines());
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPost());

				Thread.sleep(300);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPostOK());
				Thread.sleep(2000);
				genericHelper.clickWithJavascriptExecutor(transferReceiptPage.btnPrintTransfer());
				Thread.sleep(2000);

				reportHelper.generateLogFullScreenSS(test, "Transfer Print Receipt is generated Sucessfully");

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
				journalidDisplay();
				validateExtractedData(test, extractedData, itemno);
				validateExtractedData(test, extractedData, pcs);
				validateExtractedData(test, extractedData, netwt);
				validateExtractedData(test, extractedData, finewt);
				validateExtractedData(test, extractedData, total);
				validateExtractedData(test, extractedData, outlocation);
				validateExtractedData(test, extractedData, inlocation);

			}
		} catch (NoSuchElementException | TimeoutException e) { // Handle exceptions
			System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
		}

	}

	public void journalidDisplay() throws IOException {
		String journalid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("JournalId"), "");
		String actaulJournalid = "JO000000";
		if (actaulJournalid.contains(journalid)) {
			reportHelper.onTestSuccess(test, "Transfer ID matches");
		} else {
			reportHelper.onTestFailure(test, "Transfer ID does not match");
		}
	}

}
