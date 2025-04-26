package com.d365.core;

import com.d365.utils.MasterClass;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PendingVendorInvoices extends MasterClass {

	

	public void postPendingVendorInvoiceData() throws IOException, InterruptedException {
		String invoiceNumber = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invoice number"), "");

		// Step 1: Click 'From product receipt'
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickFromProductReceipt());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.selectLastRow());
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.selectcheckbox());
		// Step 2: Select 'Include' checkbox
//		WebElement checkboxElement = driver.findElement(By.cssSelector("svg._15hssbx"));
//		checkboxElement.click();
//		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.checkIncludeCheckbox());
//		Thread.sleep(1000);

		// Step 3: Click 'OK'
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickOK());
		Thread.sleep(1500);

		// Step 4: Enter the invoice number
		genericHelper.clearAndSendKeysWithJavascriptExecutor(pendingVendorInvoicesPage.enterInvoiceNumber(),
				invoiceNumber);

		// Step 5: Click 'Match product receipts'
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickMatchProductReceipts());
		Thread.sleep(2000);

		// Step 6: Click 'OK'
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickOK());
		Thread.sleep(2000);

		// Step 7: Click 'Post'
		genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickPost());
		Thread.sleep(5000);
//         genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.clickmessagebar());
//         genericHelper.clickWithJavascriptExecutor(pendingVendorInvoicesPage.printMessage());

		// Step 8: Verify if the expected notification message matches the actual
		// message

	}
}
