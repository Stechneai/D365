package com.d365.core;

import java.io.IOException;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;

public class PostProductReceipt extends MasterClass {

	public String purchaseOrderNo;
	public String chalanNo;
	public String productReceipt;


	public void postproductreceiptData() throws IOException, InterruptedException {
		purchaseOrderNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Order No"), "");
		Thread.sleep(3000);
		chalanNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Challan No"), "");
		productReceipt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Product receipt"), "");

		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.clickSelect());
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(postproductreceiptpage.enterPONo(), purchaseOrderNo);
		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.clickOK());
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(postproductreceiptpage.enterChalanNo(), chalanNo);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(postproductreceiptpage.enterproductReceipt(),
				productReceipt);
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.clickLineregistration());

		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.processOk());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.messageCenterButton());
		Thread.sleep(3000);
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
		WebElement getMessageFromNotificationWE = postproductreceiptpage.getMessageFromNotification();
		String getMessageFromNotification = getMessageFromNotificationWE.getText();

		if (getMessageFromNotification.contains(expectedMessage)) {
			reportHelper.onTestSuccess(test,
					"Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
			reportHelper.generateLog(test,
					" Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
			reportHelper.generateLogFullScreenSS(test,
					" Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
		} else {
			reportHelper.onTestFailure(test,
					"Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
			reportHelper.generateLog(test,
					" Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
			reportHelper.generateLogFullScreenSS(test,
					" Expected: " + expectedMessage + " | Actual: " + getMessageFromNotification);
		}

		genericHelper.clickWithJavascriptExecutor(postproductreceiptpage.clickModule());
		navigateToPage(postproductreceiptpage.clickProcrumentandSourcing(),
				postproductreceiptpage.clickPostProductReceipt());
	}

	// Helper method to check if the message bar is displayed and call
	// saveOrderAndHandleErrors
//	private void checkForMessageAndHandleErrors() throws InterruptedException, IOException {
//		try {
//			String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
//			genericHelper
//					.scrollingTillWebElement(driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']")));
//			WebElement xpathExpression = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));
//			String actualMessage = xpathExpression.getText();
//			if (xpathExpression.isDisplayed()) {
//				System.out.println("Actual Message: " + actualMessage);
//
//				if (actualMessage.contains(expectedMessage)) {
//					reportHelper.onTestSuccess(test, "Expected: " + xpathExpression + " | Actual: " + actualMessage);
//					reportHelper.generateLog(test, "Expected: " + xpathExpression + " | Actual: " + actualMessage);
//					reportHelper.generateLogFullScreenSS(test,
//							"Expected: " + xpathExpression + " | Actual: " + actualMessage);
//				} else {
//					reportHelper.onTestFailure(test, "Expected: " + xpathExpression + " | Actual: " + actualMessage);
//					reportHelper.generateLog(test, "Expected: " + xpathExpression + " | Actual: " + actualMessage);
//					reportHelper.generateLogFullScreenSS(test,
//							"Expected: " + xpathExpression + " | Actual: " + actualMessage);
//				}
//				driver.navigate().refresh();
//			}
//
//		} catch (NoSuchElementException e) {
//			// Do nothing, continue normal flow if no message bar is found
//		}
//	}
}
