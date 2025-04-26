package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;
import com.sharedutils.GenericHelper;

public class GiftVoucher extends MasterClass {
	WebDriverWait wait = null;

	public String giftCardType;
	public String referenceNo;
	public String itemID;
	public String variantID;
	public String Denomination;
	public String noOFGiftIssued;
	public String expiryDate;
	public String Customer;
	public String customerName;
	public String location;
	public String itemIDPGC;
	public String giftCard;
	public String scanString;
	public static JavascriptExecutor javascriptExecutor;


	

	public void generateGiftCard() throws InterruptedException, IOException {

		String giftCardType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gift Card Type"), "");
		String referenceNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Reference No."), "");
		String itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String variantID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant ID"), "");
		String denomination = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Denomination"), "");
		String noOFGiftCardIssued = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Gift Card Issued"),"");
		String expiryDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Expiry Date"), "");
		String customerAccount = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Account"), "");
		String customerName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Name"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String itemIDPGC = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String giftCard = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gift Card No"), "");
		String scanCount = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Count"), "");
		// *[@id="TA_GenerateGiftCardDialog_2_GiftCardType"]/div/div[2]/div

		// li[text()='Physical Gift Card']

		//test = reportHelper.createTestCase(test, extentReports, masterDto);
//		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.modules());
//		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.jewellery());
//		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.giftCardDetails());

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.generateGiftCard());

		giftvoucherpage.giftCardType().clear();
		Thread.sleep(2000);
		giftvoucherpage.giftCardType().sendKeys("Physical Gift Card");
		reportHelper.generateLogFullScreenSS(test, "selected physical gift card");
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.itemID(), itemID);
		Thread.sleep(2000);
		
		giftvoucherpage.variantID().clear();
		Thread.sleep(3000);
		giftvoucherpage.variantID().sendKeys("VAR000043");
		reportHelper.generateLogFullScreenSS(test, "selected variant id");
		
		
		
		//clearAndSendKeysWithActions(giftvoucherpage.variantID(), variantID);
		Thread.sleep(2000);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.denomination(), denomination);
		giftvoucherpage.denomination().isEnabled();
		Thread.sleep(2000);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.noOFGiftCardIssued(), noOFGiftCardIssued);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.expiryDate(), expiryDate);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.customerAcc(), customerAccount);
		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.okButton());

	}

	public void promotionalGiftCard() throws InterruptedException {
		String customerName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Name"), "");
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String itemIDPGC = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String giftCard = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gift Card No"), "");
		String scanCount = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Count"), "");
		// genericHelper.clickWithJavascriptExecutor(giftVoucherPage.generateGiftCard());

		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.newButton());
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.custname(), customerName);
		Thread.sleep(2000);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.location(), location);
		genericHelper.clearAndsendKeysAndEnter(giftvoucherpage.itemIDPGC(), itemIDPGC);
		Thread.sleep(500);
		// genericHelper.clearAndSendKeysWithJavascriptExecutor(giftVoucherPage.itemIDPGC(),
		// Customer);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(giftvoucherpage.giftCardNo(), giftCard);
		Thread.sleep(500);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(giftvoucherpage.scanCount(), scanCount);
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(giftvoucherpage.scanButton());

	}
	
	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

	public void clearAndSendKeysWithActions(WebElement element, String keys) throws InterruptedException {

		// Click the element to focus on it
		genericHelper.actions.click(element).perform();

		javascriptExecutor.executeScript("arguments[0].value = '';", element);
		// Wait briefly to ensure the field is cleared
		Thread.sleep(3000);

		// Send keys using Actions class
		genericHelper.actions.sendKeys(element, keys).perform();
		
		}
	
}
