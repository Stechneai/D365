package com.d365.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;

public class OfflineTagging extends MasterClass {

	public void offlineTaggingWithoutDivideWeight() throws InterruptedException, IOException {
		String docno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String tagType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String tags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.newButton1());

		int numTags;
		try {
			numTags = (int) Double.parseDouble(tags); // Parse as double, then cast to int
			System.out.println("Tags is: " + numTags);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid value for 'Tags': " + tags,e);
		}

		List<String> grossWeights = new ArrayList<>();
		List<String> stWeights = new ArrayList<>();

		// Populate lists with data from masterDto
		for (int i = 1; i <= numTags; i++) {
			String grossWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("gr wt" + i), "");
			grossWeights.add(grossWeight);
			System.out.println("Gross weight: " + grossWeight);

			if ("DJ".equalsIgnoreCase(tagType)) {
				String stWeight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("st wt" + i), "");
				stWeights.add(stWeight);
			}
		}

		// Navigation and data entry

		Thread.sleep(1000);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterDocNo(), docno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagID(), tagno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagToBeGenerate(), tags);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterNoOfPcs(), pcs);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(500);

		// Loop to input gross weights dynamically
		for (int i = 0; i < grossWeights.size(); i++) {
			WebElement weightElement = getDynamicGrossWeightField(i + 1);
			genericHelper.scrollingTillWebElement(weightElement);
			genericHelper.sendKeysWithjavascriptExecutor(weightElement, grossWeights.get(i));
			genericHelper.actions.sendKeys(Keys.ARROW_DOWN).perform();

			if ("DJ".equalsIgnoreCase(tagType)) {
				WebElement stWeightElement = getDynamicStoneWeightField(i + 1);
				genericHelper.scrollingTillWebElement(stWeightElement);
				genericHelper.sendKeysWithjavascriptExecutor(stWeightElement, stWeights.get(i));
			}
		}

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.validateButton());
		Thread.sleep(5000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.postButton());
		Thread.sleep(30000);

	}

	// Method to get the gross weight WebElement based on index (can handle variable
	// XPath changes)
	public WebElement getDynamicGrossWeightField(int index) {
		String dynamicXpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])["
				+ index + "]";
		return driver.findElement(By.xpath(dynamicXpath));
	}

	// Method to get the standard weight WebElement based on index
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

	public void offlineTaggingWithDivideWeight() throws InterruptedException, IOException {

		String docno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String tags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.newButton1());
		Thread.sleep(1000);
		// navigation of offline tagging
		try {

			if (offlineTaggingPage.newButton().isDisplayed() && offlineTaggingPage.generateTag().isDisplayed()
					&& offlineTaggingPage.validateButton().isDisplayed()
					&& offlineTaggingPage.postButton().isDisplayed()) {
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
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterDocNo(), docno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagID(), tagno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagToBeGenerate(), tags);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterNoOfPcs(), pcs);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.clickToggle());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(500);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.validateButton());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.postButton());
		Thread.sleep(30000);

	}

	public void offlineTaggingWithPcsCalc() throws InterruptedException, IOException {

		String docno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String tags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		String repcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("RemainingPcs"), "");

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.newButton1());
		Thread.sleep(1000);

		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterDocNo(), docno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagID(), tagno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagToBeGenerate(), tags);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterNoOfPcs(), pcs);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.clickToggle());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(500);

		System.out.println("Sheet Pcs:" + repcs);
		WebElement rpcsElement = offlineTaggingPage.getRePcsCount();
		String actualRepcs = rpcsElement.getAttribute("title");
		System.out.println("Web Pcs:" + actualRepcs);

		try {
			if (repcs.equals(actualRepcs)) {
				reportHelper.onTestSuccess(test, "Remaining pcs is calculated correctly");
				reportHelper.generateLogFullScreenSS(test, "Remaining pcs is calculated correctly");
			} else {
				reportHelper.onTestFailure(test, "Remaining pcs is not calculated correctly");
				reportHelper.generateLogFullScreenSS(test, "Remaining pcs is not calculated correctly");
			}
		} catch (Exception e) {
			reportHelper.onTestFailure(test, "Error occurred while verifying remaining pcs: " + e.getMessage());
			reportHelper.generateLogFullScreenSS(test, "Error occurred while verifying remaining pcs.");
			throw e; // Re-throw the exception if necessary
		}

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.validateButton());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.postButton());
		Thread.sleep(30000);
		checkNotificationPresenceAndHandle(masterDto);

	}

	public void offlineTaggingWiTagandDocDisable() throws InterruptedException, IOException {

		String docno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String tags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.selectButton());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.newButton1());
		Thread.sleep(1000);

		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterDocNo(), docno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagID(), tagno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagToBeGenerate(), tags);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterNoOfPcs(), pcs);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.clickToggle());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(500);
		// verify field is disable(doc no and Tag no)
		if (!offlineTaggingPage.enterDocNo().isEnabled() & !offlineTaggingPage.tagID().isEnabled()) {
			reportHelper.onTestSuccess(test, " Doc no and Tag no field are disable after generated tags");

			reportHelper.generateLogFullScreenSS(test, "Doc no and Tag no field are disable after generated tags");
		} else {
			reportHelper.onTestFailure(test, "Doc no and Tag no field are not disable after generated tags");

			reportHelper.generateLogFullScreenSS(test, "Doc no and Tag no field are not disable after generated tags");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.validateButton());
		Thread.sleep(2000);
		// checkNotificationPresenceAndHandle();
//		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.postButton());
//		Thread.sleep(30000);
//		checkNotificationPresenceAndHandle();

	}

	public void offlineTaggingWithoutDivideWeightMRP() throws InterruptedException, IOException {

		String docno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Doc No"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String tagType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String tags = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tags"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Pcs"), "");
		String mrprate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP Rate"), "");

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.modules());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.jewellery());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.offlineTagging());

		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.selectButton());
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.newButton1());
		Thread.sleep(1000);
		// navigation of offline tagging

		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterDocNo(), docno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagID(), tagno);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.location(), location);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.generateTag());
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.tagToBeGenerate(), tags);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterNoOfPcs(), pcs);
		Thread.sleep(20000);
		genericHelper.sendKeysWithjavascriptExecutor(offlineTaggingPage.enterMrpRate(), mrprate);
		Thread.sleep(20000);

		// verify field is disable
		if (!offlineTaggingPage.clickToggle().isEnabled()) {
			reportHelper.onTestSuccess(test, " Toggle button is disable ");

			reportHelper.generateLogFullScreenSS(test, "Toggle button is disable");
		} else {
			reportHelper.onTestFailure(test, "Toggle button is not disable");

			reportHelper.generateLogFullScreenSS(test, "Toggle button is not disable");
		}
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.okButton());
		Thread.sleep(2000);
		// checkNotificationPresenceAndHandle();
//		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.validateButton());
//		Thread.sleep(2000);
//		genericHelper.clickWithJavascriptExecutor(offlineTaggingPage.postButton());
//		Thread.sleep(30000);

	}

}
