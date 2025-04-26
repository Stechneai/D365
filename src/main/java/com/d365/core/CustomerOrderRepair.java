package com.d365.core;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;
import com.sharedutils.GenericHelper;

public class CustomerOrderRepair extends MasterClass {

	public void addCustomerOrderRepair() throws InterruptedException, IOException {
		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

	}

	public void checkRepairBatchNo() throws InterruptedException, IOException {
		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemtype1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type1"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grossweight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		String scustomerno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer No."), "");
		String itemcategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(2000);
		WebElement orderno = customerOrderPage.getCustomerNo();
		String actualorderno = orderno.getAttribute("title").trim();

		System.out.println("Customer no is" + actualorderno);

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grossweight);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

		driver.navigate().refresh();
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.selectJewellery());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickCustomerRepairBatch());

		try {
			if (customerOrderRepairPage.cancelbutton().isDisplayed()
					&& customerOrderRepairPage.clickOkButton().isDisplayed()
					&& customerOrderRepairPage.checkPositiveBatch().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch sucessfully");
				reportHelper.onTestSuccess(test, "Navigation Customer repair batch sucessfully");
			} else {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch not sucessfully");
				reportHelper.onTestFailure(test, "Navigation Customer repair batch not sucessfully");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch not sucessfully");
			reportHelper.onTestFailure(test, "Navigation Customer repair batch sucessfully");
		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickOkButton());

		driver.navigate().refresh();
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.selectJewellery());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickCustomerRepairBatchWise());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickOrderNoHeader());
		// String cus="COR000000466";
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.enterOrderNo(), actualorderno);
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickApplyFilter());

		WebElement batchno = customerOrderRepairPage.checkBatchNo();
		String ActualBatchNo = batchno.getAttribute("title");
		System.out.println("Number is" + ActualBatchNo);

		WebElement customerno = customerOrderRepairPage.checkCustomerNo();
		String actualCustomerNo = customerno.getAttribute("value");
		System.out.println("Customer Number is" + actualCustomerNo);

		WebElement grossweigt = customerOrderRepairPage.checkGrossWeight();
		String actualgrossweight = grossweigt.getAttribute("title");
		System.out.println("Gross Weight is" + actualgrossweight);

		WebElement itemType = customerOrderRepairPage.checkItemType();
		String actualitemType = itemType.getAttribute("title").trim();
		System.out.println("Item Type is" + actualitemType);

		WebElement itemCategory = customerOrderRepairPage.checkItemCategory();
		String actualItemCategory = itemCategory.getAttribute("title").trim();
		System.out.println("Item Category is" + actualItemCategory);

		if (ActualBatchNo.isBlank()) {
			reportHelper.generateLogFullScreenSS(test, "Batch No is blank");
			reportHelper.onTestFailure(test, "Batch No is blank");
		} else {
			reportHelper.generateLogFullScreenSS(test, "Batch No is: " + ActualBatchNo);
			reportHelper.onTestSuccess(test, "Batch No is: " + ActualBatchNo);
		}
		if (actualCustomerNo.contains(scustomerno)) {
			reportHelper.generateLogFullScreenSS(test, "Customer no is correct: " + ActualBatchNo);
			reportHelper.onTestSuccess(test, "Customer no is correct: ");

		} else {
			reportHelper.generateLogFullScreenSS(test, "Customer no is not correct");
			reportHelper.onTestFailure(test, "Customer no is not correct");
		}
		if (actualgrossweight.contains(grossweight)) {
			reportHelper.generateLogFullScreenSS(test, "Grossweight is correct: " + ActualBatchNo);
			reportHelper.onTestSuccess(test, "Grossweight is correct: ");

		} else {
			reportHelper.generateLogFullScreenSS(test, "Grossweight is not correct");
			reportHelper.onTestFailure(test, "Grossweight is not correct");
		}
		if (actualitemType.contains(itemtype1)) {
			reportHelper.generateLogFullScreenSS(test, "Item type is correct: " + ActualBatchNo);
			reportHelper.onTestSuccess(test, "Item type is correct: ");

		} else {
			reportHelper.generateLogFullScreenSS(test, "Item type is not correct");
			reportHelper.onTestFailure(test, "Item type is not correct");
		}
		if (actualItemCategory.contains(itemcategory)) {
			reportHelper.generateLogFullScreenSS(test, "Item category is correct: " + actualItemCategory);
			reportHelper.onTestSuccess(test, "Item category is correct: ");

		} else {
			reportHelper.generateLogFullScreenSS(test, "Item category is not correct");
			reportHelper.onTestFailure(test, "Item category is not correct");
		}

		// driver.navigate().refresh();
	}

	public void deleteOrder() throws InterruptedException, IOException, InvalidFormatException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		WebElement orderno = customerOrderPage.getCustomerNo();
		String actualorderno = orderno.getAttribute("title").trim();

		System.out.println("Customer no is" + actualorderno);

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			Thread.sleep(2000);
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}
		// Delete Order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.deleteHButton());

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.deleteConfirmButton());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickBackButton());

		genericHelper.clearAndSendKeysAndEnter(customerOrderPage.searchFilterButton(), actualorderno);
		Thread.sleep(1000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickOrderNo());
		if (orderno.isDisplayed()) {
			reportHelper.onTestFailure(test, "After Delete Order is displayed");
			reportHelper.generateLogFullScreenSS(test, "After Delete Order is displayed");
		} else {
			reportHelper.onTestSuccess(test, "After delete Order is not displayed");
			reportHelper.generateLogFullScreenSS(test, "After Delete Order is not displayed");
		}

	}

	public void validateDeleteButtonAfterBefore() throws InterruptedException, IOException, InvalidFormatException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		if (customerOrderRepairPage.deleteHButton().isEnabled()) {
			reportHelper.onTestSuccess(test, "Delete Button is Enable before confirm Order");
			reportHelper.generateLogFullScreenSS(test, "Delete Button is Enable before confirm Order");

		} else {
			reportHelper.onTestFailure(test, "Delete Button is disable before confirm Order");
			reportHelper.generateLogFullScreenSS(test, "Delete Button is disable before confirm Order");
		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			Thread.sleep(2000);
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());
		Thread.sleep(2000);

		if (!customerOrderRepairPage.deleteHButton().isEnabled()) {
			reportHelper.onTestFailure(test, "Delete Button is Enable after confirm Order");
			reportHelper.generateLogFullScreenSS(test, "Delete Button is Enable after confirm Order");

		} else {
			reportHelper.onTestSuccess(test, "Delete Button is disable after confirm Order");
			reportHelper.generateLogFullScreenSS(test, "Delete Button is disable after confirm Order");
		}

	}

	public void navigationRepairBatchWise() throws InterruptedException, IOException {

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.selectJewellery());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickCustomerRepairBatchWise());

		try {
			if (customerOrderRepairPage.editbutton().isDisplayed()
					&& customerOrderRepairPage.columnBatchNo().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch sucessfully");
				reportHelper.onTestSuccess(test, "Navigation Customer repair batch sucessfully");
			} else {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch not sucessfully");
				reportHelper.onTestFailure(test, "Navigation Customer repair batch not sucessfully");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "Navigation Customer repair batch not sucessfully");
			reportHelper.onTestFailure(test, "Navigation Customer repair batch sucessfully");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void navigationCustomerOrderRepair() throws InterruptedException, IOException {

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.modules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.selectJewellery());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.customerOrderRepairModule());

		try {
			if (customerOrderRepairPage.clickCancelButton().isDisplayed()
					&& customerOrderRepairPage.clickTagReserve().isDisplayed()
					&& customerOrderRepairPage.deleteHButton().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer order repair  sucessfully");
				reportHelper.onTestSuccess(test, "Navigation Customer order repair  sucessfully");
			} else {
				reportHelper.generateLogFullScreenSS(test, "Navigation Customer order repair not sucessfully");
				reportHelper.onTestFailure(test, "Navigation Customer order repair not sucessfully");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "Navigation Customer order repair not sucessfully");
			reportHelper.onTestFailure(test, "Navigation Customer order repair not sucessfully");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void validateCurrentDate() throws InterruptedException, IOException {

		// Enter order details
		enterDataIntoField(customerOrderRepairPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderRepairPage.salesPerson(), "Sales Person", masterDto);
		Thread.sleep(2000);

		// Retrieve the current date and convert it to "dd/MM/yyyy" format
		WebElement dateElement = customerOrderRepairPage.validateOrderdate();
		String orderDate = dateElement.getAttribute("title").trim();
		System.out.println("Order date is: " + orderDate);
		String currentDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Current Date"), "");
		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Original Date is:" + originalFormat);
			SimpleDateFormat targetFormat = new SimpleDateFormat("M/d/yyyy");
			System.out.println("Target Date is:" + targetFormat);
			Date date = originalFormat.parse(currentDate);
			currentDate = targetFormat.format(date).trim();
			System.out.println("Current Date is:" + currentDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Validate and retrieve order date from the UI
		// WebElement dateElement = customerOrderPage.validateOrderdate();
		// String orderDate = dateElement.getAttribute("title").trim();
		// System.out.println("Order date is: " + orderDate);

		try {
			if (orderDate.equals(currentDate)) {
				reportHelper.generateLogFullScreenSS(test, "OrderDate automatically displays current date: Passed");
				reportHelper.onTestSuccess(test, "OrderDate automatically displays current date: Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test, "OrderDate automatically displays current date: Failed");
				reportHelper.onTestFailure(test, "OrderDate automatically displays current date: Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "OrderDate automatically displays current date: Failed");
			reportHelper.onTestFailure(test, "OrderDate automatically displays current date: Failed");
		}

		// Click add line button
		customerOrderPage.addLineButton().click();
		driver.navigate().refresh();

	}

	public void validateOrderStatus() throws InterruptedException, IOException {
		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		String initialstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Initial Status"), "");
		String orderstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Confirm Status"), "");
		String cancelstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Cancel Status"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		WebElement status = customerOrderPage.getOrderStatus();
		String actualStatus = status.getAttribute("title");
		System.out.println("Status is:" + actualStatus);

		if (initialstatus.contains(actualStatus)) {
			reportHelper.onTestSuccess(test, "Initial Status is displayed " + actualStatus + " as Open: Passed");
		} else {
			reportHelper.onTestSuccess(test, "Initial Status is not displayed as Open: Failed");
		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

		Thread.sleep(2000);
		WebElement status1 = customerOrderRepairPage.getOrderStatus();
		String actualStatus1 = status1.getAttribute("title");
		System.out.println(actualStatus1);

		if (orderstatus.contains(actualStatus1)) {
			reportHelper.onTestSuccess(test, "Confirm Status is displayed " + actualStatus1 + " as Ordered: Passed");
		} else {
			reportHelper.onTestFailure(test, "Confirm Status is not displayed as Ordered: Failed");
		}

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.checkCancelNo());
		Thread.sleep(2000);
		WebElement status2 = customerOrderPage.getOrderStatus();
		String actualStatus2 = status2.getAttribute("title");
		System.out.println(actualStatus2);

		if (cancelstatus.contains(actualStatus2)) {
			reportHelper.onTestSuccess(test, "Cancel Status is displayed " + actualStatus2 + " as Cancelled: Passed");
		} else {
			reportHelper.onTestFailure(test, "Cancel Status is not displayed as Cancelled: Failed");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void negativeCustomerOrderRepair() throws InterruptedException, IOException {
		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

	}

	public void reserveTagWithoutConfirmOrder() throws InterruptedException, IOException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		// Click reserved Tag
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickReserveTagButton());
		Thread.sleep(3000);
	}

	public void reserveTagProcess() throws InterruptedException, IOException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales PersonR"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Status"), "");

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

		Thread.sleep(2000);
		// Click reserved Tag
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickReserveTagButton());
		Thread.sleep(3000);
		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterTagNo(), tagno);
		Thread.sleep(500);
		// genericHelper.clearAndsendKeysAndEnter(customerOrderPage.enterSalesPerson(), salesp);
		customerOrderPage.enterSalesPerson().sendKeys(salesp);

		Thread.sleep(500);
		// genericHelper.actions.sendKeys(Keys.TAB,Keys.ENTER).build().perform();

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickOkButton());

		Thread.sleep(2000);

		// genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickTagReservedHeader());
		// customerOrderRepairPage.clickTagReservedHeader().click();
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickTagReservedHeader());

		WebElement tag = customerOrderPage.getReservedTagNo();

		String rtagno = tag.getAttribute("value");
		System.out.println(rtagno);
		

		if (rtagno.contains(tagno)) {
			reportHelper.onTestSuccess(test, "Tag reserved sucessfully");
			reportHelper.generateLogFullScreenSS(test, "Tag reserved Sucessfully");

		} else {
			reportHelper.onTestFailure(test, "Tag is not reserved");
			reportHelper.generateLogFullScreenSS(test, "Tag is not reserved");
		}

		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickUnreserveTag());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickYesButton());

//		WebElement tag1 = customerOrderPage.getReservedTagNo();
//		String rtagno1 = tag1.getAttribute("value");
//		System.out.println(rtagno1);

		try {
		    WebElement tag1 = customerOrderPage.getReservedTagNo();  // Re-fetch the element
		    if (tag1.isDisplayed()) {
		        reportHelper.onTestFailure(test, "Tag is not unreserved");
		        reportHelper.generateLogFullScreenSS(test, "Tag is not unreserved");
		    }
		} catch (NoSuchElementException e) {
		    reportHelper.onTestSuccess(test, "Tag unreserved successfully");
		    reportHelper.generateLogFullScreenSS(test, "Tag unreserved Successfully");
		}
		driver.navigate().refresh();

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

		alltagpageslot.enterBatchNo().sendKeys(tagno);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);

		WebElement tagStatusName = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});",
				tagStatusName);

		String actualTagStatus = tagStatusName.getAttribute("value");
		System.out.println("Tag Status for tag " + tagno + ": " + actualTagStatus);

		// Combined if-else to check both conditions
		if (actualTagStatus.equals(tagStatus) && actualTagStatus.equals(tagStatus)) {
			reportHelper.onTestSuccess(test, "Valid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		} else {
			reportHelper.onTestFailure(test, "Invalid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		}

	}
	public void unreserveTagProcess() throws InterruptedException, IOException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");
		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales PersonR"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Status"), "");

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

		Thread.sleep(2000);
		// Click reserved Tag
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickReserveTagButton());
		Thread.sleep(3000);
		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterTagNo(), tagno);
		Thread.sleep(500);
		// genericHelper.clearAndsendKeysAndEnter(customerOrderPage.enterSalesPerson(), salesp);
		customerOrderPage.enterSalesPerson().sendKeys(salesp);

		Thread.sleep(500);
		// genericHelper.actions.sendKeys(Keys.TAB,Keys.ENTER).build().perform();

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickOkButton());

		Thread.sleep(2000);

		// genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickTagReservedHeader());
		// customerOrderRepairPage.clickTagReservedHeader().click();
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickTagReservedHeader());

		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickUnreserveTag());

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickYesButton());

		try {
		    WebElement tag1 = customerOrderPage.getReservedTagNo();  // Re-fetch the element
		    if (tag1.isDisplayed()) {
		        reportHelper.onTestFailure(test, "Tag is not unreserved");
		        reportHelper.generateLogFullScreenSS(test, "Tag is not unreserved");
		    }
		} catch (NoSuchElementException e) {
		    reportHelper.onTestSuccess(test, "Tag unreserved successfully");
		    reportHelper.generateLogFullScreenSS(test, "Tag unreserved Successfully");
		}
		driver.navigate().refresh();

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

		alltagpageslot.enterBatchNo().sendKeys(tagno);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);

		WebElement tagStatusName = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});",
				tagStatusName);

		String actualTagStatus = tagStatusName.getAttribute("value");
		System.out.println("Tag Status for tag " + tagno + ": " + actualTagStatus);

		// Combined if-else to check both conditions
		if (actualTagStatus.equals(tagStatus) && actualTagStatus.equals(tagStatus)) {
			reportHelper.onTestSuccess(test, "Valid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		} else {
			reportHelper.onTestFailure(test, "Invalid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		}

	}

	public void reserveTagNegativeProcess() throws InterruptedException, IOException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("	Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());
		closeAllNotifications();

		Thread.sleep(2000);

		// Click reserved Tag
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.clickReserveTagButton());
		Thread.sleep(3000);

		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");

		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales PersonR"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Status"), "");

		// genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickReserveTagButton());

		// genericHelper.actions.sendKeys(Keys.TAB).perform();
		customerOrderPage.enterTagNo().sendKeys(tagno);
		// genericHelper.clearAndsendKeysAndEnter(customerOrderPage.enterTagNo(),
		// tagno);
		// enterDataIntoField(customerOrderPage.enterTagNo(), "Tag No", masterDto);

		// genericHelper.clearAndsendKeysAndEnter(customerOrderPage.enterSalesPerson(),
		// salesp);

		Thread.sleep(500);
		customerOrderPage.enterSalesPerson().sendKeys(salesp);
		Thread.sleep(500);
		// genericHelper.scrollingTillWebElement(customerOrderPage.clickOkButtonTagReservation());
		customerOrderPage.clickOkButtonTagReservation().click();
	}

	public void addMultipleDataOrder()
			throws InterruptedException, IOException, NumberFormatException, InvalidFormatException {

		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");

		enterDataIntoField(customerOrderRepairPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderRepairPage.salesPerson(), "Sales Person", masterDto);

		String caseID = masterDto.getAttributeValue("CaseID");
		String noOfItem = masterDto.getAttributeValue("No of item");

		int caseIDOriginal = (int) Double.parseDouble(caseID);
		int noOfItems = (int) Double.parseDouble(noOfItem);

		if (noOfItems >= 1) {
			for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerRepairSheet.xlsx",
					"Multi"); rowIndex++) {
				Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerRepairSheet.xlsx",
						"Multi", rowIndex);
				for (Map.Entry<String, String> entry : orderData.entrySet()) {
					masterDto.setAttribute(entry.getKey(), entry.getValue());
				}
				String itemtype1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
				String itemid1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
				String varientid1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
				String pcs1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
				String grosswt1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"),
						"");
				String remark1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
				String purity1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");

				String currentCaseID = masterDto.getAttributeValue("CaseID");
				int caseIDFromRow = (int) Double.parseDouble(currentCaseID);

				if (caseIDOriginal == caseIDFromRow) {
					customerOrderRepairPage.Add_Line().click();
					genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getItemIdField(rowIndex),
							masterDto.getAttributeValue("Item Id"));
					reportHelper.generateLogWithScreenshot(test, "Item Id SS");
					genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getVariantNumberField(rowIndex),
							masterDto.getAttributeValue("Variant number"));
					reportHelper.generateLogWithScreenshot(test, "Variant Number SS");
					genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getCustomerItemPCSField(rowIndex),
							masterDto.getAttributeValue("Customer Item PCS"));
					reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

					if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
						enterDataIntoField(customerOrderRepairPage.getOrderRateField(rowIndex), "Order Rate",
								masterDto);
						genericHelper.scrollingTillWebElement(customerOrderRepairPage.getRepairRemarksField(rowIndex));
						genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getRepairRemarksField(rowIndex),
								remark);
						reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
					} else if ("Diamond".equalsIgnoreCase(itemtype)) {
						genericHelper.sendKeysWithjavascriptExecutor(
								customerOrderRepairPage.getCustomerItemGrossWeightField(rowIndex), grosswt1);
						closeAllNotifications();
						genericHelper.scrollingTillWebElement(customerOrderRepairPage.getRepairRemarksField(rowIndex));
						genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getRepairRemarksField(rowIndex),
								remark1);
						reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
						genericHelper.scrollingTillWebElement(customerOrderRepairPage.getPurityField(rowIndex));
						genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getPurityField(rowIndex),
								purity1);
						reportHelper.generateLogWithScreenshot(test, "Purity SS");
					} else {
						genericHelper.sendKeysWithjavascriptExecutor(
								customerOrderRepairPage.getCustomerItemGrossWeightField(rowIndex), grosswt1);
						reportHelper.generateLogWithScreenshot(test, "Customer Item Gross Weight SS");
						genericHelper.scrollingTillWebElement(customerOrderRepairPage.getRepairRemarksField(rowIndex));
						genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getRepairRemarksField(rowIndex),
								remark1);
						reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
						closeAllNotifications();
						genericHelper.scrollingTillWebElement(customerOrderRepairPage.getPurityField(rowIndex));
						genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.getPurityField(rowIndex),
								purity1);
						reportHelper.generateLogWithScreenshot(test, "Purity SS");
					}
				}
			}
			Thread.sleep(2000);
			genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());
			Thread.sleep(2000);
		}
	}
	
	public void checkCancelButtonValidation() throws InterruptedException, IOException {
		String itemtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		String grosswt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		String remark = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");
		
		if (!customerOrderRepairPage.checkCancelNo().isEnabled()) {
			reportHelper.onTestFailure(test, "Cancel button is enable");
		} else {

			reportHelper.onTestSuccess(test, "Cancel button is disable");
		}
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemid);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientid);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcs);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtype) || "Forming".equalsIgnoreCase(itemtype)) {
			
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());

		} else if ("Diamond".equalsIgnoreCase(itemtype)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderRepairPage.customerItemGrossWeight(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswt);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remark);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), purity);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.submit());

		Thread.sleep(2000);

		if (customerOrderRepairPage.checkCancelNo().isEnabled()) {
			reportHelper.onTestSuccess(test, "After confirm order Cancel button is enable");
		} else {

			reportHelper.onTestFailure(test, "After confirm order Cancel button is disable");
		}
		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.checkCancelNo());
		Thread.sleep(2000);
	}
	public void validateFields() throws InterruptedException, IOException {
		
		String ordertype=StringUtils.defaultIfBlank(masterDto.getAttributeValue("Order Type"), "");
		String ordercategory=StringUtils.defaultIfBlank(masterDto.getAttributeValue("Order Category"), "");

		// Enter order details
		enterDataIntoField(customerOrderRepairPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderRepairPage.salesPerson(), "Sales Person", masterDto);
		Thread.sleep(2000);

		if (!customerOrderRepairPage.checkOrderType().isEnabled() && !customerOrderRepairPage.checkOrderCategory().isEnabled()
				&& !customerOrderRepairPage.validateOrderdate().isEnabled()) {
			reportHelper.onTestFailure(test, "Ordertype and Order category fields are enable");
		} else {

			reportHelper.onTestSuccess(test, "Ordertype and Order category fields are disable");
		}

		// Click add line button
		customerOrderRepairPage.Add_Line().click();
		
		driver.navigate().refresh();

	}
	
	public void validateOrderValues() throws InterruptedException, IOException {
		String itemtypes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String itemids = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientids = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String pcss = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item PCS"), "");
		System.out.println("Value"+pcss);
		String grosswts = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Item Gross Weight"), "");
		System.out.println("Value Gw"+grosswts);
		String remarks = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Repair Remarks"), "");
		String puritys = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Customer_No SS");
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		reportHelper.generateLogWithScreenshot(test, "Sale Person SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.manualOrderNo(),
				getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
		reportHelper.generateLogWithScreenshot(test, "Manual Order No. SS");

		genericHelper.clickWithJavascriptExecutor(customerOrderRepairPage.Add_Line());
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.itemId(), itemids);
		reportHelper.generateLog(test, "Item Id: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Item Id SS");
		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.variantNumber(), varientids);
		reportHelper.generateLog(test, "Variant Number: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Variant Number SS");

		genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemPCS(), pcss);
		reportHelper.generateLog(test, "Customer Item PCS: " + "Data Inserted");
		reportHelper.generateLogWithScreenshot(test, "Customer Item PCS SS");

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemtypes) || "Forming".equalsIgnoreCase(itemtypes)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remarks);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");

		} else if ("Diamond".equalsIgnoreCase(itemtypes)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderRepairPage.customerItemGrossWeight(), "Gross Order Qty", masterDto);
			closeAllNotifications();
			enterDataIntoField(customerOrderRepairPage.enterNetWeight(), "Net Order Qty", masterDto);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remarks);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), puritys);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		} else {
			// Default condition
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.customerItemGrossWeight(), grosswts);
			reportHelper.generateLog(test, "Customer Item Gross Weight: " + "Data Inserted");
			Thread.sleep(2000);
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderRepairPage.repairRemarks());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.repairRemarks(), remarks);
			reportHelper.generateLog(test, "repairRemarks: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "repairRemarks SS");
			closeAllNotifications();
			genericHelper.scrollingTillWebElement(customerOrderRepairPage.purity());
			genericHelper.clearAndSendKeysAndEnter(customerOrderRepairPage.purity(), puritys);
			reportHelper.generateLog(test, "Purity: " + "Data Inserted");
			reportHelper.generateLogWithScreenshot(test, "Purity SS");

		}

		Thread.sleep(1000);
		WebElement gw = customerOrderRepairPage.customerItemGrossWeight();
		String actaulgrossweight = gw.getAttribute("value");
		System.out.println("value" + actaulgrossweight);

		WebElement pcs = customerOrderRepairPage.customerItemPCS();
		String actaulorderpcs = pcs.getAttribute("title");
		System.out.println("value" + actaulorderpcs);

		WebElement itemi = customerOrderRepairPage.itemId();
		String actaulitemid = itemi.getAttribute("value");
		System.out.println("value" + actaulitemid);

		WebElement purityy = customerOrderRepairPage.purity();
		String actaulpurity = purityy.getAttribute("value");
		System.out.println("value" + actaulpurity);

		WebElement varientid = customerOrderRepairPage.variantNumber();
		String actautvarient = varientid.getAttribute("value");
		System.out.println("value" + actautvarient);

		if (grosswts.contains(actaulgrossweight)) {
			reportHelper.onTestSuccess(test, "Gross weight is correct displayed as " + actaulgrossweight);
		} else {
			reportHelper.onTestFailure(test, "Gross weight is not correct displayed as " + actaulgrossweight);
		}
		if (pcss.contains(actaulorderpcs)) {
			reportHelper.onTestSuccess(test, "Order pcs is correct displayed as " + actaulorderpcs);
		} else {
			reportHelper.onTestFailure(test, "Order pcs is not correct displayed as " + actaulorderpcs);
		}
		if (itemids.contains(actaulitemid)) {
			reportHelper.onTestSuccess(test, "Item id is correct displayed as " + actaulitemid);
		} else {
			reportHelper.onTestFailure(test, "Item id is not correct displayed as " + actaulitemid);
		}
		if (puritys.contains(actaulpurity)) {
			reportHelper.onTestSuccess(test, "Purity is correct displayed as " + actaulpurity);
		} else {
			reportHelper.onTestFailure(test, "Purity is not correct displayed as " + actaulpurity);
		}
		if (varientids.contains(actautvarient)) {
			reportHelper.onTestSuccess(test, "Varient is correct displayed as " + actautvarient);
		} else {
			reportHelper.onTestFailure(test, "Varient is not correct displayed as " + actautvarient);
		}

		driver.navigate().refresh();

	}

}
