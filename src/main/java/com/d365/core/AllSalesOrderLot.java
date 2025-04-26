package com.d365.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;

public class AllSalesOrderLot extends MasterClass {

	public void AllSalesOrder() throws IOException, InterruptedException, InvalidFormatException {

		String nofs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		// String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"),
		// "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagName"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);

		System.out.println("Tags to be scanned: " + childTags);
		int numTags2;
		boolean notificationHandled2 = false;
		try {
			numTags2 = (int) Double.parseDouble(nofs); // Parse as double, then cast to int
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'pcs': " + nofs, e);
		}
		// Loop through all tags and scan them
		for (int i = 1; i <= numTags2; i++) {
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

			genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
			Thread.sleep(5000); // Ensure enough delay for UI interactions
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
			Thread.sleep(10000);
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSalesOrder());
			Thread.sleep(2000);
			try {
				if (isNotificationDisplayed()) {
					checkNotificationPresenceAndHandle(masterDto);
					notificationHandled2 = true;
					break; // Exit the loop
				}
			} catch (Exception e) {
				System.out.println("No notification Found");
			}

		}

		// Continue with the rest of the workflow
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSellButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickConfirmNow());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPickPackButton1());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGeneratingPick());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGOkButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkButton());
		Thread.sleep(2000);
		// allsalesorderpage.clickRegistartionPick().click();
//		genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
		// Attempt to click the element using various methods
		boolean clickSuccessful = false;

		try {
			// Attempt 1: Using Actions class
//			genericHelper.actions.click(allsalesorderpage.clickRegistartionPick()).perform();
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			System.out.println("Click successful using Actions class.");
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			clickSuccessful = true;

			System.out.println("Click successful using Actions class." + clickSuccessful);

		} catch (Exception e) {
			System.out.println("Failed to click using Actions class: " + e.getMessage());
		}
		Thread.sleep(3000);

		if (clickSuccessful) {
			try {
				// Attempt 2: Using JavaScript Executor
//				genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
				genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
						allsalesorderpagelot.registrationPick());
				System.out.println("Click successful using JavaScript Executor.");
				clickSuccessful = true;
				System.out.println("Click successful using Actions Executor." + clickSuccessful);

			} catch (Exception e) {
				System.out.println("Failed to click using JavaScript Executor: " + e.getMessage());
			}
		} else {
			System.out.println("Failed to click using JavaScript Executor: ");
		}

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateAllButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickBackButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPackSlip());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		try {

			if (alltagpageslot.checkEdit().isDisplayed() && alltagpageslot.checkTransaction().isDisplayed()
					&& alltagpageslot.checkPostedTag().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags:Is Passed");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags :Is Failed");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags");

		}

		WebElement batchn = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(childTags);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);
		WebElement tagTypeName = alltagpageslot.getTagName();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);

		String actualTagName = tagTypeName.getAttribute("value");
		System.out.println("Tag Type for tag " + childTags + ": " + actualTagName);

		WebElement tagStatusName = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagStatusName);

		String actualTagStatus = tagStatusName.getAttribute("value");
		System.out.println("Tag Status for tag " + childTags + ": " + actualTagStatus);

		    if (tagName.contains(actualTagName)) {
		        reportHelper.onTestSuccess(test, "Valid Tag Type name is: " + actualTagName + " for tag " + childTags);
		    } else {
		        reportHelper.onTestFailure(test, " Invalid Tag name is: " + actualTagName + " for tag " + childTags);
		    }
		
		    if (tagStatus.contains(actualTagStatus)) {
		        reportHelper.onTestSuccess(test, "Invalid Tag Status name is: " + actualTagStatus + " for tag " + childTags);
		    } else {
		        reportHelper.onTestFailure(test, "Invalid Tag Status name is: " + actualTagStatus + " for tag " + childTags);
		    }
		


		reportHelper.generateLog(test, " Tag " + childTags + " verification completed");
		reportHelper.generateLogFullScreenSS(test, "Verification for Lot Tag " + childTags);
//		if (!notificationHandled) {
//		checkNotificationPresenceAndHandle();
//		}
}


	public void AllSalesOrderPartiallyTag() throws IOException, InterruptedException, InvalidFormatException {

		String nofs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		// String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"),
		// "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagName"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
//		int rowCount = rowCountExcel(excelPath + "LotTagCR.xlsx", "Sheet1");

//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
//				"Sheet1"); rowIndex++) {
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet1",
//					rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}

//			System.out.println("" + childTags);
		// Populate the childTags list
//		List<String> childTags = new ArrayList<>();
//		childTags.add(tag); // Add the main tag
//		for (int i = 1; i <= rowCount; i++) { // Adjust the range based on expected additional tags
//			String additionalTag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags" + i), "");
//			if (!additionalTag.isEmpty()) {
//				childTags.add(additionalTag);
//			}
//		}
		System.out.println("Tags to be scanned: " + childTags);
		int numTags2;
		boolean notificationHandled2 = false;
		try {
			numTags2 = (int) Double.parseDouble(nofs); // Parse as double, then cast to int
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'pcs': " + nofs, e);
		}
		// Loop through all tags and scan them
		for (int i = 1; i <= numTags2; i++) {
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

			genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
			Thread.sleep(5000); // Ensure enough delay for UI interactions
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
			Thread.sleep(10000);
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSalesOrder());
			Thread.sleep(2000);
			try {
				if (isNotificationDisplayed()) {
					checkNotificationPresenceAndHandle(masterDto);
					notificationHandled2 = true;
					break; // Exit the loop
				}
			} catch (Exception e) {
				System.out.println("No notification Found");
			}

		}

		// Continue with the rest of the workflow
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSellButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickConfirmNow());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPickPackButton1());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGeneratingPick());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGOkButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkButton());
		Thread.sleep(2000);
		// allsalesorderpage.clickRegistartionPick().click();
//		genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
		// Attempt to click the element using various methods
		boolean clickSuccessful = false;

		try {
			// Attempt 1: Using Actions class
//			genericHelper.actions.click(allsalesorderpage.clickRegistartionPick()).perform();
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			System.out.println("Click successful using Actions class.");
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			clickSuccessful = true;

			System.out.println("Click successful using Actions class." + clickSuccessful);

		} catch (Exception e) {
			System.out.println("Failed to click using Actions class: " + e.getMessage());
		}
		Thread.sleep(3000);

		if (clickSuccessful) {
			try {
				// Attempt 2: Using JavaScript Executor
//				genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
				genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
						allsalesorderpagelot.registrationPick());
				System.out.println("Click successful using JavaScript Executor.");
				clickSuccessful = true;
				System.out.println("Click successful using Actions Executor." + clickSuccessful);

			} catch (Exception e) {
				System.out.println("Failed to click using JavaScript Executor: " + e.getMessage());
			}
		} else {
			System.out.println("Failed to click using JavaScript Executor: ");
		}

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateAllButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickBackButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPackSlip());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		try {

			if (alltagpageslot.checkEdit().isDisplayed() && alltagpageslot.checkTransaction().isDisplayed()
					&& alltagpageslot.checkPostedTag().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags:Is Passed");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags :Is Failed");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of All Tags page using following path Jewellery>>Barcode Stock Taking>>Tagging>>All Tags");

		}

		WebElement batchn = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(childTags);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);
		WebElement tagTypeName = alltagpageslot.getTagName();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);

		String actualTagName = tagTypeName.getAttribute("value");
		System.out.println("Tag Type for tag " + childTags + ":" + actualTagName);

		WebElement tagStatusName = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);

		String actualTagStatus = tagStatusName.getAttribute("value");
		System.out.println("Tag Status for tag " + childTags + ": " + actualTagStatus);

		// Combined if-else to check both conditions
		if (tagName.equals(actualTagName) && tagStatus.equals(actualTagStatus)) {
			reportHelper.onTestSuccess(test, "Valid Tag Type name is: " + actualTagName
					+ " and Valid Tag Status name is: " + actualTagStatus + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Tag Type name is: " + actualTagName
					+ " and Invalid Tag Status name is: " + actualTagStatus + " for tag " + childTags);
		}

		reportHelper.generateLog(test, " Tag " + childTags + " verification completed");
		reportHelper.generateLogFullScreenSS(test, "Verification for Lot Tag " + childTags);
//		if (!notificationHandled) {
//		checkNotificationPresenceAndHandle();
//		}
	}

	public void offlineTaggingNegative() throws InterruptedException, IOException {
		String tagId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String Location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagToBeGenerated"), "");
		String nopcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfPieces"), "");
		String docNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");

		// Initialize UI operations for offline tagging
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.modules());
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.newButton());
		Thread.sleep(1000);
		// navigation of offline tagging
		try {

			if (offlinetaggingpagelot.newButton().isDisplayed() && offlinetaggingpagelot.generateTag().isDisplayed()
					&& offlinetaggingpagelot.validateButton().isDisplayed()
					&& offlinetaggingpagelot.postButton().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging:Is Passed");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging :Is Failed");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of offline tagging page using following path Jewellery>>Barcode Stock Taking>>Tagging>>Offline tagging");

		}
		genericHelper.clearAndSendkeysWithActions(offlineTaggingPage.enterDocNo(), docNo);
		genericHelper.clearAndSendkeysWithActions(offlineTaggingPage.tagID(), tagId);
		genericHelper.clearAndSendkeysWithActions(offlineTaggingPage.location(), Location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.clearAndSendkeysWithActions(offlineTaggingPage.tagToBeGenerate(), tag);
		genericHelper.clearAndSendkeysWithActions(offlineTaggingPage.enterNoOfPcs(), nopcs);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(2000);
	}

	public void AllSalesOrderNegative() throws IOException, InterruptedException, InvalidFormatException {

		// String tagId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag"),
		// "");
		String nof = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagName"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		try {

			if (allsalesorderpagelot.clickNewS().isDisplayed() && allsalesorderpagelot.clickSellButton1().isDisplayed()
					&& allsalesorderpagelot.clickPickPackButton1().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders:Is Passed");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders :Is Failed");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of All Sales Order page using following path Accounts receivable>>Orders>>All sales orders");

		}

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);

		int numTags;
		boolean notificationHandled = false;
		try {
			numTags = (int) Double.parseDouble(nof); // Parse as double, then cast to int
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'pcs': " + nof, e);
		}
		// Loop through all tags and scan them
		for (int i = 1; i <= numTags + 1; i++) {
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());
			genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
			Thread.sleep(5000); // Ensure enough delay for UI interactions
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
			Thread.sleep(10000);
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSalesOrder());
			Thread.sleep(2000);

			if (isNotificationDisplayed()) {
				checkNotificationPresenceAndHandle(masterDto);
				notificationHandled = true;
				break; // Exit the loop
			}
		}
		if (!notificationHandled) {
			checkNotificationPresenceAndHandle(masterDto);
		}
	}

	public void MandatoryFields() throws IOException, InterruptedException, InvalidFormatException {

		// String tagId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag"),
		// "");

		String site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String warehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse *"), "");

		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");

		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterSalesSite(), site);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterSalesWarehouse(), warehouse);

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());

	}

	public void LotTransferTag() throws InterruptedException, IOException {
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println(childTags);
		navigateToPage(transferorderpagelot.clickInventoryManagement(), transferorderpagelot.clickTransferOrder());
		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on TransferOrder");
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickNewTransferOrder());

		genericHelper.clearAndSendKeysAndEnter(transferorderpagelot.enterFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Site")));
		genericHelper.clearAndSendKeysAndEnter(transferorderpagelot.enterToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Site")));

		genericHelper.clearAndSendkeysWithActions(transferorderpagelot.enterTransferType(),
				masterDto.getAttributeValue("Transfer Type"));
		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTransferOrderIcon());

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTagScan());

		genericHelper.clearAndSendkeysWithActions(transferorderpagelot.enterTransTag(), childTags);
		Thread.sleep(2000);
		transferorderpage.clickOtherclick().click();
		reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTransGenerateLine());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickship());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickOkSButton());

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickReceive());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickOkRButton());
		Thread.sleep(2000);
		checkNotificationPresenceAndHandle(masterDto);

		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Transfer Site"), "");

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		WebElement batchn = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(childTags);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);

		WebElement site = alltagpage.getCurrentSite();
		String wsite = site.getAttribute("value");
		System.out.println("Get Site is:" + wsite);

		if (tsite.equals(wsite)) {
			reportHelper.onTestSuccess(test, "Transfer Tag to specified location" + tsite + "is sucessfully: ");
		} else {
			reportHelper.onTestFailure(test, "Transfer Tag to specified location" + tsite + "is not sucessfully: ");
		}
		Thread.sleep(2000);

		String nof = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tosite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("To Site"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterSalesSite(), tosite);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterSalesWarehouse(), tosite);

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);

		int numTags;
		boolean notificationHandled = false;
		try {
			numTags = (int) Double.parseDouble(nof); // Parse as double, then cast to int
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'pcs': " + nof, e);
		}
		// Loop through all tags and scan them
		for (int i = 1; i <= numTags + 1; i++) {
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());
			genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
			Thread.sleep(5000); // Ensure enough delay for UI interactions
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
			Thread.sleep(10000);
			genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSalesOrder());
			Thread.sleep(2000);

			if (isNotificationDisplayed()) {
				checkNotificationPresenceAndHandle(masterDto);
				notificationHandled = true;
				break; // Exit the loop
			}
		}

	}

	public void LotNegativeTransferTag() throws InterruptedException, IOException {
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println(childTags);
		navigateToPage(transferorderpagelot.clickInventoryManagement(), transferorderpagelot.clickTransferOrder());
		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on TransferOrder");
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickNewTransferOrder());

		genericHelper.clearAndSendKeysAndEnter(transferorderpagelot.enterFromWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("From Site")));
		genericHelper.clearAndSendKeysAndEnter(transferorderpagelot.enterToWarehouse(),
				getValueOrDefault(masterDto.getAttributeValue("To Site")));

		genericHelper.clearAndSendkeysWithActions(transferorderpagelot.enterTransferType(),
				masterDto.getAttributeValue("Transfer Type"));
		reportHelper.generateLogFullScreenSS(test, "Succesfully select transfer type");

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTransferOrderIcon());

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTagScan());

		genericHelper.clearAndSendkeysWithActions(transferorderpagelot.enterTransTag(), childTags);
		Thread.sleep(2000);
		transferorderpage.clickOtherclick().click();
		reportHelper.generateLogFullScreenSS(test, "Release tag  scan sucessfully");
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickTransGenerateLine());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickship());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickShipTransfer());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickOkSButton());

		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickReceive());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickShipReceive());
		genericHelper.clickWithJavascriptExecutor(transferorderpagelot.clickOkRButton());
		Thread.sleep(2000);

		String tsite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Transfer Site"), "");

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		WebElement batchn = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(childTags);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);

		WebElement site = alltagpage.getCurrentSite();
		String wsite = site.getAttribute("value");
		System.out.println("Get Site is:" + wsite);

		if (tsite.equals(wsite)) {
			reportHelper.onTestSuccess(test, "Transfer Tag to specified location" + tsite + "is sucessfully: ");
		} else {
			reportHelper.onTestFailure(test, "Transfer Tag to specified location" + tsite + "is not sucessfully: ");
		}
		Thread.sleep(2000);

		String nof = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tosite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("To Site"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
//		genericHelper.clearAndsendKeysAndEnter(allsalesorderpagelot.enterSalesSite(), tosite);
//		genericHelper.clearAndsendKeysAndEnter(allsalesorderpagelot.enterSalesWarehouse(), tosite);

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());
		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());

	}

	public void RemainingPcsAndWeightAllTag() throws IOException, InterruptedException, InvalidFormatException {

		String tagType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagToBeGenerated"), "");
		String nopcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfPieces"), "");
		String tagId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String docNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");

		// Updated parsing for 'pcs' to handle decimal values
		int numTags;
		try {
			numTags = (int) Double.parseDouble(pcs); // Parse as double, then cast to int
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'pcs': " + pcs, e);
		}

		List<String> grossWeights = new ArrayList<>();
		List<String> stWeights = new ArrayList<>();

		// Populate lists with data from masterDto
		for (int i = 1; i <= numTags; i++) {
			String grossWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("gr wt" + i), "");
			grossWeights.add(grossWeight);

			if ("DJ".equalsIgnoreCase(tagType)) {
				String stWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("st wt" + i), "");
				stWeights.add(stWeight);
			}
		}

		// Initialize UI operations for offline tagging
		// genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.modules());
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.newButton());
		Thread.sleep(1000);
		genericHelper.clearAndSendkeysWithActions(offlinetaggingpagelot.enterDocNo(), docNo);
		genericHelper.clearAndSendkeysWithActions(offlinetaggingpagelot.tagID(), tagId);
		genericHelper.clearAndSendkeysWithActions(offlinetaggingpagelot.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.generateTag());
		genericHelper.clearAndSendkeysWithActions(offlinetaggingpagelot.tagToBeGenerate(), pcs);
		genericHelper.clearAndSendkeysWithActions(offlinetaggingpagelot.enterNoOfPcs(), nopcs);
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.okButton());
		Thread.sleep(500);

		// Loop to input gross weights dynamically and store the tag number each time
		for (int i = 0; i < grossWeights.size(); i++) {
			WebElement currentTagNoWE = getDynamicTagNoField(i + 1);
			String currentTagNo = currentTagNoWE.getAttribute("value");
//			generatedTagNumbers.add(currentTagNo); // Store the tag number in the list
			System.out.println("Current Tag No for item " + (i + 1) + " :- " + currentTagNo);
			excelHelper.writeToExcel(excelPath + "LotTagCR.xlsx", "Sheet8", (i + 1), 6, currentTagNo);

			WebElement weightElement = getDynamicGrossWeightField(i + 1);
			genericHelper.scrollingTillWebElement(weightElement);
			genericHelper.clearAndSendkeysWithActions(weightElement, grossWeights.get(i));

			if ("DJ".equalsIgnoreCase(tagType)) {
				WebElement stWeightElement = getDynamicStoneWeightField(i + 1);
				genericHelper.scrollingTillWebElement(stWeightElement);
				genericHelper.clearAndSendkeysWithActions(stWeightElement, stWeights.get(i));
			}
		}

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.validateButton());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.postButton());
		Thread.sleep(30000);

		// String nofs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"),
		// "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagType"), "");
		String grossweight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("gr wt1"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet8"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet8",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
		}

		WebElement batchn = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(childTags);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);
		WebElement tagTypeName = alltagpageslot.getTagName();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);

		String actualTagName = tagTypeName.getAttribute("value");
		System.out.println("Tag Type for tag " + childTags + ": " + actualTagName);

		WebElement tagStatusName = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);

		String actualTagStatus = tagStatusName.getAttribute("value");
		System.out.println("Tag Status for tag " + childTags + ": " + actualTagStatus);

		WebElement tagLocation = alltagpageslot.getLocation();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagLocation);

		String actualTagLocation = tagLocation.getAttribute("value");
		System.out.println("Tag Location for tag " + childTags + ": " + actualTagLocation);

		WebElement tagPcs = alltagpageslot.getPcs();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagPcs);

		String actualTagPcs = tagPcs.getAttribute("value");
		System.out.println("Tag tag pcs for tag " + childTags + ": " + actualTagPcs);

		WebElement tagGrossweight = alltagpageslot.getGrossWeight();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});",
				tagGrossweight);

		String actualTagGrossWeight = tagGrossweight.getAttribute("value");
		System.out.println("Tag gross weight for tag " + childTags + ": " + actualTagGrossWeight);

		WebElement tagSite = alltagpageslot.getCurrentSite();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagSite);

		String actualTagSite = tagSite.getAttribute("value");
		System.out.println("Tag Site for tag " + childTags + ": " + actualTagSite);

		// Combined if-else to check both conditions

		if (tagName.contains(actualTagName)) {
			reportHelper.onTestSuccess(test, "Valid Tag Name: " + actualTagName + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Tag Name: " + actualTagName + " for tag " + childTags);
		}
		if (tagStatus.contains(actualTagStatus)) {
			reportHelper.onTestSuccess(test, "Valid Tag Status: " + actualTagStatus + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Tag Status: " + actualTagStatus + " for tag " + childTags);
		}
		if (grossweight.contains(actualTagGrossWeight)) {
			reportHelper.onTestSuccess(test, "Valid Grossweight: " + actualTagGrossWeight + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Grossweight: " + actualTagGrossWeight + " for tag " + childTags);
		}

		if (location.contains(actualTagLocation)) {
			reportHelper.onTestSuccess(test, "Valid Location: " + actualTagLocation + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Location: " + actualTagLocation + " for tag " + childTags);
		}

		if (nopcs.contains(actualTagPcs)) {
			reportHelper.onTestSuccess(test, "Valid Pcs: " + actualTagPcs + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Pcs: " + actualTagPcs + " for tag " + childTags);
		}

		if (site.contains(actualTagSite)) {
			reportHelper.onTestSuccess(test, "Valid Pcs: " + actualTagSite + " for tag " + childTags);
		} else {
			reportHelper.onTestFailure(test, "Invalid Pcs: " + actualTagSite + " for tag " + childTags);
		}

		reportHelper.generateLog(test, " Tag " + childTags + " verification completed");
		reportHelper.generateLogFullScreenSS(test, "Verification for Lot Tag " + childTags);
//		if (!notificationHandled) {
		// checkNotificationPresenceAndHandle();
//		}
	}

	public void AllSalesOrderRemoveButton() throws IOException, InterruptedException, InvalidFormatException {

		String nofs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		// String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"),
		// "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagName"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
		Thread.sleep(10000);

		// Continue with the rest of the workflow
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSellButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickConfirmNow());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPickPackButton1());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGeneratingPick());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGOkButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkButton());
		Thread.sleep(2000);
		// Attempt to click the element using various methods
		boolean clickSuccessful = false;

		try {
			// Attempt 1: Using Actions class
//			genericHelper.actions.click(allsalesorderpage.clickRegistartionPick()).perform();
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			System.out.println("Click successful using Actions class.");
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			clickSuccessful = true;

			System.out.println("Click successful using Actions class." + clickSuccessful);

		} catch (Exception e) {
			System.out.println("Failed to click using Actions class: " + e.getMessage());
		}
		Thread.sleep(3000);

		if (clickSuccessful) {
			try {
				// Attempt 2: Using JavaScript Executor
//				genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
				genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
						allsalesorderpagelot.registrationPick());
				System.out.println("Click successful using JavaScript Executor.");
				clickSuccessful = true;
				System.out.println("Click successful using Actions Executor." + clickSuccessful);

			} catch (Exception e) {
				System.out.println("Failed to click using JavaScript Executor: " + e.getMessage());
			}
		} else {
			System.out.println("Failed to click using JavaScript Executor: ");
		}

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateAllButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickBackButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPackSlip());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkInvoiceButton());
		Thread.sleep(5000);

		if (!allsalesorderpagelot.getRemove().isEnabled()) {
			reportHelper.onTestSuccess(test, "After Invoiced Remove button is disable ");
		} else {
			reportHelper.onTestFailure(test, "After Invoiced Remove button is not disable ");
		}
	}

	public void WeightPcsSalesOrder() throws IOException, InterruptedException, InvalidFormatException {

		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
		Thread.sleep(10000);

		WebElement qty = allsalesorderpagelot.getSaleLineQuantity();
		String actualqty = qty.getAttribute("value");
		System.out.println("Quantity is:" + actualqty);
		WebElement pc = allsalesorderpagelot.getSaleLinePcs();
		String actualpcs = pc.getAttribute("value");
		System.out.println("Pcs is:" + actualpcs);

		if (quantity.contains(actualqty)) {
			reportHelper.onTestSuccess(test, "Valid Gross Weight reflected" + actualqty + "in sales order line ");
		} else {
			reportHelper.onTestFailure(test, "InValid Gross Weight reflected" + actualqty + "in sales order line ");
		}
		Thread.sleep(2000);

		if (pcs.contains(actualpcs)) {
			reportHelper.onTestSuccess(test, "Valid Pcs reflected" + actualpcs + "in sales order line ");
		} else {
			reportHelper.onTestFailure(test, "InValid Pcs reflected" + actualpcs + "in sales order line ");
		}

		Thread.sleep(2000);
	}

	public void ValidatePhysicalInventory() throws IOException, InterruptedException, InvalidFormatException {

		String nofs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		// String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"),
		// "");
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagName"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
		Thread.sleep(10000);

		// Continue with the rest of the workflow
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickSellButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickConfirmNow());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPickPackButton1());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGeneratingPick());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGOkButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkButton());
		Thread.sleep(2000);
		// Attempt to click the element using various methods
		boolean clickSuccessful = false;

		try {
			// Attempt 1: Using Actions class
//			genericHelper.actions.click(allsalesorderpage.clickRegistartionPick()).perform();
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			System.out.println("Click successful using Actions class.");
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
					allsalesorderpagelot.registrationPick());
			clickSuccessful = true;

			System.out.println("Click successful using Actions class." + clickSuccessful);

		} catch (Exception e) {
			System.out.println("Failed to click using Actions class: " + e.getMessage());
		}
		Thread.sleep(3000);

		if (clickSuccessful) {
			try {
				// Attempt 2: Using JavaScript Executor
//				genericHelper.clickWithJavascriptExecutor(allsalesorderpage.clickRegistartionPick());
				genericHelper.javascriptExecutor.executeScript("arguments[0].click();",
						allsalesorderpagelot.registrationPick());
				System.out.println("Click successful using JavaScript Executor.");
				clickSuccessful = true;
				System.out.println("Click successful using Actions Executor." + clickSuccessful);

			} catch (Exception e) {
				System.out.println("Failed to click using JavaScript Executor: " + e.getMessage());
			}
		} else {
			System.out.println("Failed to click using JavaScript Executor: ");
		}

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickUpdateAllButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickBackButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickPackSlip());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkPackSlip());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCInvoiceButton());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkInvoiceButton());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickCOkInvoiceButton());
		Thread.sleep(5000);

		String batchno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemId"), "");
		String physicalqty = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.clickWithJavascriptExecutor(onhandlistpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(onhandlistpagelot.clickInventoryManagement());
		genericHelper.clickWithJavascriptExecutor(onhandlistpagelot.clickOnHandList());

		try {

			if (onhandlistpagelot.clickInterCompanyhand().isDisplayed()
					&& onhandlistpagelot.clickQuantityAdjustment().isDisplayed()
					&& onhandlistpagelot.clickDimension().isDisplayed()
					&& onhandlistpagelot.clickView().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of Onhand list page using following path Inventory management>>Inquiries and reports>>On-hand list:Is Passed");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of Onhand list page using following path Inventory management>>Inquiries and reports>>On-hand list:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of On hand list page using following path Inventory management>>Inquiries and reports>>On-hand list :Is Failed");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of On hand list page using following path Inventory management>>Inquiries and reports>>On-hand list: Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of On hand list page using following path Inventory management>>Inquiries and reports>>On-hand list");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of On hand list page using following path Inventory management>>Inquiries and reports>>On-hand list");

		}

		genericHelper.clearAndSendkeysWithActions(onhandlistpagelot.enterItemNumber(), itemid);
		Thread.sleep(2000);
		genericHelper.clearAndSendkeysWithActions(onhandlistpagelot.enterBatchNumber(), batchno);
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(onhandlistpagelot.clickApply());

		Thread.sleep(2000);

		WebElement phyqty = onhandlistpagelot.getPhyasicalInentory();
		String actualphyqty = phyqty.getAttribute("title");
		System.out.println("Physical Inventory is" + actualphyqty);

		if (physicalqty.contains(actualphyqty)) {
			reportHelper.onTestSuccess(test, "Physical Quantity is reflected" + actualphyqty + "correctly");
		} else {
			reportHelper.onTestFailure(test, "Physical Quantity is not reflected" + actualphyqty + "correctly");
		}

	}

	public void PcsNonEmptyField() throws IOException, InterruptedException, InvalidFormatException {
		
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
		Thread.sleep(10000);
		WebElement pc = allsalesorderpagelot.getSaleLinePcs();
		String actualpcs = pc.getAttribute("value");
		System.out.println("Pcs is:" + actualpcs);

		if (actualpcs != null && !actualpcs.isEmpty()) {
			reportHelper.onTestSuccess(test, "The Pcs field is non-empty:" + actualpcs);
		} else {
			reportHelper.onTestFailure(test, "The Pcs field is empty.");
		}
		Thread.sleep(2000);
	}

	public void WeightNonEmptyField() throws IOException, InterruptedException, InvalidFormatException {

		
		String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		System.out.println("" + childTags);
		String cusac = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerAccount"), "");
		String numbersq = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SequenceNumber"), "");

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAcreceivable());
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickAllSalesOrder());

		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickNewS());
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.enterNumberSequence(), numbersq);
		genericHelper.clearAndSendKeysAndEnter(allsalesorderpagelot.selectCusAc(), cusac);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickOkButton());
		Thread.sleep(1000);
		System.out.println("Tags to be scanned: " + childTags);
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickTagScanning());

		genericHelper.clearAndSendkeysWithActions(allsalesorderpagelot.enterTag(), childTags);
		Thread.sleep(5000); // Ensure enough delay for UI interactions
		genericHelper.clickWithJavascriptExecutor(allsalesorderpagelot.clickGenerateLine());
		Thread.sleep(10000);
		WebElement qty = allsalesorderpagelot.getSaleLineQuantity();
		String actualqty = qty.getAttribute("value");
		System.out.println("Quantity is:" + actualqty);

		if (actualqty != null && !actualqty.isEmpty()) {
			reportHelper.generateLogFullScreenSS(test, "The Weight field is non-empty:");
			reportHelper.onTestSuccess(test, "The Weight field is non-empty:" + actualqty);
		} else {
			reportHelper.generateLogFullScreenSS(test, "The Weight field is empty:");
			reportHelper.onTestFailure(test, "The Weight field is empty.");
		}
	

		Thread.sleep(2000);
	}
	public void MultipleRemainingPcsAndWeightAllTag() throws IOException, InterruptedException, InvalidFormatException {

//		 String tagType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
//		    String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
//		    String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagToBeGenerated"), "");
//		    String nopcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("NoOfPieces"), "");
//		    String tagId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
//		    String docNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
//
//		    // Updated parsing for 'pcs' to handle decimal values
//		    int numTags;
//		    try {
//		        numTags = (int) Double.parseDouble(pcs); // Parse as double, then cast to int
//		    } catch (NumberFormatException e) {
//		        throw new IllegalArgumentException("Invalid value for 'pcs': " + pcs, e);
//		    }
//
//		    List<String> grossWeights = new ArrayList<>();
//		    List<String> stWeights = new ArrayList<>();
//
//		    // Populate lists with data from masterDto
//		    for (int i = 1; i <= numTags; i++) {
//		        String grossWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("gr wt" + i), "");
//		        grossWeights.add(grossWeight);
//
//		        if ("DJ".equalsIgnoreCase(tagType)) {
//		            String stWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("st wt" + i), "");
//		            stWeights.add(stWeight);
//		        }
//		    }
//
//		    // Initialize UI operations for offline tagging
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.modules());
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.jewellery());
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.offlineTagging());
//
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.selectButton());
//		    Thread.sleep(2000);
//
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.newButton());
//		    Thread.sleep(1000);
//		    genericHelper.clearAndSendKeysWithJavascriptExecutor(offlinetaggingpagelot.enterDocNo(), docNo);
//		    genericHelper.clearAndSendKeysWithJavascriptExecutor(offlinetaggingpagelot.tagID(), tagId);
//		    genericHelper.clearAndSendKeysWithJavascriptExecutor(offlinetaggingpagelot.location(), location);
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.generateTag());
//		    genericHelper.clearAndSendKeysWithJavascriptExecutor(offlinetaggingpagelot.tagToBeGenerate(), pcs);
//		    genericHelper.clearAndSendKeysWithJavascriptExecutor(offlinetaggingpagelot.enterNoOfPcs(), nopcs);
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.okButton());
//		    Thread.sleep(500);
//
//		    // Retrieve generated tag numbers using XPath with two contains()
//		    List<WebElement> tagElements = driver.findElements(By.xpath("//input[contains(@id, 'AcxPreTagHeader') and contains(@id, 'TagNo')]"));
//		    List<String> generatedTags = new ArrayList<>();
//		    for (WebElement tagElement : tagElements) {
//		        generatedTags.add(tagElement.getAttribute("value")); // Extract the 'value' attribute containing the tag number
//		    }
//
//		    // Loop to input gross weights dynamically and store the tag number each time
//		    for (int i = 0; i < grossWeights.size(); i++) {
//		        String currentTagNo = generatedTags.get(i); // Get the tag number from the list
//		        System.out.println("Current Tag No for item " + (i + 1) + " :- " + currentTagNo);
//		        excelHelper.writeToExcel(excelPath + "LotTagCR.xlsx", "Sheet14", (i + 1), 6, currentTagNo);
//
//		        WebElement weightElement = getDynamicGrossWeightField(i + 1);
//		        genericHelper.scrollingTillWebElement(weightElement);
//		        genericHelper.clearAndSendKeysWithJavascriptExecutor(weightElement, grossWeights.get(i));
//
//		        if ("DJ".equalsIgnoreCase(tagType)) {
//		            WebElement stWeightElement = getDynamicStoneWeightField(i + 1);
//		            genericHelper.scrollingTillWebElement(stWeightElement);
//		            genericHelper.clearAndSendKeysWithJavascriptExecutor(stWeightElement, stWeights.get(i));
//		        }
//		    }
//
//		    Thread.sleep(2000);
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.validateButton());
//		    Thread.sleep(2000);
//		    genericHelper.clickWithJavascriptExecutor(offlinetaggingpagelot.postButton());
//		    Thread.sleep(30000);

		    // Read data from the masterDto
		    String childTags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Child Tags"), "");
		    System.out.println("Child Tags: " + childTags);

		    String site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		    String tagName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagType"), "");
		    String grossweight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("gr wt1"), "");
		    String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagStatus"), "");

		    // Split child tags and write them into the same row in different columns
		    List<String> childTagsList = Arrays.asList(childTags.split(",")); // Split the childTags string
		    int startColumn = 6; // Starting column index for child tags (e.g., Column G)

		    for (int i = 0; i < childTagsList.size(); i++) {
		        String childTag = childTagsList.get(i).trim(); // Get each child tag and trim whitespace
		        excelHelper.writeToExcel(excelPath + "LotTagCR.xlsx", "Sheet14", startColumn + i,1, childTag); // Write child tag to a new column

		    }

		    // Navigate through the UI
		    genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		    Thread.sleep(2000);
		    genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		    genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		    genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		    Thread.sleep(1000);

		    // Read data from the Excel file
		    for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx", "Sheet14"); rowIndex++) {
		        Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet14", rowIndex);
		        for (Map.Entry<String, String> entry : orderData.entrySet()) {
		            masterDto.setAttribute(entry.getKey(), entry.getValue());
		        }
		    }

		    // Process each child tag
		    for (String childTag : childTagsList) {
		        System.out.println("Processing tag: " + childTag.trim());

		        // Click and input batch number
		        WebElement batchn = alltagpageslot.clickBatchNo();
		        genericHelper.scrollingTillWebElement(batchn);
		        genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());
		        alltagpageslot.enterBatchNo().sendKeys(childTag.trim());
		        Thread.sleep(4000);
		        alltagpageslot.clickApply().click();
		        Thread.sleep(2000);

		        // Retrieve and verify tag details
		        WebElement tagTypeName = alltagpageslot.getTagName();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagTypeName);
		        String actualTagName = tagTypeName.getAttribute("value");
		        System.out.println("Tag Type for tag " + childTag + ": " + actualTagName);

		        WebElement tagStatusName = alltagpageslot.checkTagStatus();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagStatusName);
		        String actualTagStatus = tagStatusName.getAttribute("value");
		        System.out.println("Tag Status for tag " + childTag + ": " + actualTagStatus);

		        WebElement tagLocation = alltagpageslot.getLocation();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagLocation);
		        String actualTagLocation = tagLocation.getAttribute("value");
		        System.out.println("Tag Location for tag " + childTag + ": " + actualTagLocation);

		        WebElement tagPcs = alltagpageslot.getPcs();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagPcs);
		        String actualTagPcs = tagPcs.getAttribute("value");
		        System.out.println("Tag Pcs for tag " + childTag + ": " + actualTagPcs);

		        WebElement tagGrossweight = alltagpageslot.getGrossWeight();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagGrossweight);
		        String actualTagGrossWeight = tagGrossweight.getAttribute("value");
		        System.out.println("Tag Gross Weight for tag " + childTag + ": " + actualTagGrossWeight);

		        WebElement tagSite = alltagpageslot.getCurrentSite();
		        genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});", tagSite);
		        String actualTagSite = tagSite.getAttribute("value");
		        System.out.println("Tag Site for tag " + childTag + ": " + actualTagSite);

	        reportHelper.generateLog(test, "Tag " + childTag + " verification completed");
	        reportHelper.generateLogFullScreenSS(test, "Verification for Lot Tag " + childTag);
	    }

	}
	// public void validateMultipleTag() throws Exception {
//	    	login();
	//
//	    	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
//	    			"Sheet14"); rowIndex++) {
//	    		Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
//	    				"Sheet14", rowIndex);
//	    		for (Map.Entry<String, String> entry : orderData.entrySet()) {
//	    			masterDto.setAttribute(entry.getKey(), entry.getValue());
//	    		}
//	    		test = reportHelper.createTestCase(test, extentReports, masterDto);
//	    		try {
//	    		    
//	    			allsalesorderlot.MultipleRemainingPcsAndWeightAllTag();
//	    	     	//checkNotificationPresenceAndHandle();
//	    	     
//	    	} catch (Exception e) {
//	    			getResults(masterDto);
//	    			}
//	    		
//	    	}
//	    }
	public void verifySalesInvoiceCheck() throws Exception {
		

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet1"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
					"Sheet1", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
	//		try {
			    
				allsalesorderlot.AllSalesOrder();
		// 	checkNotificationPresenceAndHandle();

//		} catch (Exception e) {
//				getResults(masterDto);

			}
		}
	


    public void checkOffTagNegative() throws Exception {
 
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet2"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
					"Sheet2", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {		    
				allsalesorderlot.offlineTaggingNegative();
		     	checkNotificationPresenceAndHandle(masterDto);


		} catch (Exception e) {
				getResults(masterDto);

			}
			
		}
	}

	public void verifySalesNegativeInvoiceCheck() throws Exception {
		
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet3"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
					"Sheet3", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {		    
				allsalesorderlot.AllSalesOrderNegative();
//				checkNotificationPresenceAndHandle();
		} catch (Exception e) {
			getResults(masterDto);

			}
			
		}
	}
	public void verifySalesInvoicePartiallyTagCheck() throws Exception {
		

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet4"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
					"Sheet4", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {
			    
				allsalesorderlot.AllSalesOrderPartiallyTag();
		// 	checkNotificationPresenceAndHandle();


		} catch (Exception e) {
				getResults(masterDto);

			}
			
		}
	    }
public void checkMandatoryFields() throws Exception {
	

	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
			"Sheet5"); rowIndex++) {
		Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx",
				"Sheet5", rowIndex);
		for (Map.Entry<String, String> entry : orderData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		try {
		    
			allsalesorderlot.MandatoryFields();
	     	checkNotificationPresenceAndHandle(masterDto);


	} catch (Exception e) {
			getResults(masterDto);

		}
		
	}
    }

  public void checkTransferTag() throws Exception {
	
	for (int rowIndex = 1;rowIndex<=excelHelper.rowCountExcel(excelPath+"LotTagCR.xlsx","Sheet6");rowIndex++)
	{
		Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet6",
				rowIndex);
		for (Map.Entry<String, String> entry : orderData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		try {

			allsalesorderlot.LotTransferTag();
			// checkNotificationPresenceAndHandle();

		} catch (Exception e) {
			getResults(masterDto);

		}
	}
	}

	public void checkNegativeTransferTag() throws Exception {
		

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet7"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet7",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.LotNegativeTransferTag();
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);

			}
		}
	}

	public void checkWeightPcsAllTag() throws Exception {
	

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet8"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet8",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.RemainingPcsAndWeightAllTag();
				//checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}

		}
	}

	public void validateRemoveButton() throws Exception {
		

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet9"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet9",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.AllSalesOrderRemoveButton();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}
		}
	}

	

	public void ValidateWeightPcsSalesOrder() throws Exception {
	

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet10"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet10",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.WeightPcsSalesOrder();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);
			}

		}
	}

	public void checkPhysicalInventory() throws Exception {
	

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet11"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet11",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.ValidatePhysicalInventory();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}
		}
	}

	public void validatePcsField() throws Exception {
	
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet12"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet12",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.PcsNonEmptyField();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}
		}
	}
   public void validateWeightField() throws Exception {
		

		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "LotTagCR.xlsx",
				"Sheet13"); rowIndex++) {
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "LotTagCR.xlsx", "Sheet13",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			try {

				allsalesorderlot.WeightNonEmptyField();
				// checkNotificationPresenceAndHandle();

			} catch (Exception e) {
				getResults(masterDto);

			}
		}
	}


	// Method to get the gross weight WebElement based on index (can handle variable
	// XPath changes)
	public WebElement getDynamicGrossWeightField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])["
				+ index + "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	public WebElement getDynamicStoneWeightField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_StoneWeight') and contains(@id, 'input')])["
				+ index + "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	public WebElement getDynamicMRPRateField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_MRPRate') and contains(@id, 'input')])[" + index
				+ "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	public WebElement getDynamicMRPField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_MRP') and contains(@id, 'input')])[" + index
				+ "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	public WebElement getDynamicHallmarkingPcsField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_HMPcs') and contains(@id, 'input')])[" + index
				+ "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	public WebElement getDynamicOtherAmountField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_OtherAmount') and contains(@id, 'input')])["
				+ index + "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	// Method to get the tagNo WebElement based on index
	public WebElement getDynamicTagNoField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_TagNo') and contains(@id, 'input')])[" + index
				+ "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	private boolean isNotificationDisplayed() {
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the element is displayed
			return notificationElement.isDisplayed();
		} catch (NoSuchElementException e) {
			// Notification element not found
			return false;
		}
	}
}
