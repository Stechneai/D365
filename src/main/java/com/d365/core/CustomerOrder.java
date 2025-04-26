package com.d365.core;

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

public class CustomerOrder extends MasterClass {

	public void addHeaderAndAddlineEnterAddItemDetailsAll() throws InterruptedException, IOException {
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		} else if ("Diamond".equalsIgnoreCase(itemType)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickPretagHeader());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickNewH());

			enterDataIntoField(customerOrderPage.enterItemidH(), "Item IdH", masterDto);
			enterDataIntoField(customerOrderPage.enterVarientH(), "VarientH", masterDto);
			enterDataIntoField(customerOrderPage.enterQuantityH(), "QuantityH", masterDto);

			enterDataIntoField(customerOrderPage.enterNosH(), "No Stone", masterDto);

		} else {
			// Default condition
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		}

		Thread.sleep(1000);
		WebElement actual = customerOrderPage.validateGenerateLineMsg();
		String actualMessage = actual.getText().trim();
		String expectedMessage = "Line Generated.";
		System.out.println("Message is: " + actualMessage);

//		if (actualMessage.equals(expectedMessage)) {
//			reportHelper.onTestSuccess(test, "Line generated successfully");
//			reportHelper.generateLogFullScreenSS(test, "Line generated successfully");
//		} else {
//			reportHelper.onTestFailure(test, "Line not generated successfully");
//			reportHelper.generateLogFullScreenSS(test, "Line not generated successfully");
//		}

		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());
	}

	public void addHeaderAndAddlineEnterAddItemDetailsNegative() throws InterruptedException, IOException {

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);
		enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
		enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

//		// Click generate line and validate message
//		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
//		Thread.sleep(1000);
//		WebElement actual = customerOrderPage.validateGenerateLineMsg();
//		String actualMessage = actual.getText().trim();
//		String expectedMessage = "Line Generated.";
//		System.out.println("Message is: " + actualMessage);

//		if (actualMessage.equals(expectedMessage)) {
//			reportHelper.onTestSuccess(test, "Line generated successfully");
//			reportHelper.generateLogFullScreenSS(test, "Line generated successfully");
//		} else {
//			reportHelper.onTestFailure(test, "Line not generated successfully");
//			reportHelper.generateLogFullScreenSS(test, "Line not generated successfully");
//		}

		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		// genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());
	}

	public void navigationCustomerOrder() throws InterruptedException, IOException {
		try {

			if (customerOrderPage.deleteHButton().isDisplayed() && customerOrderPage.confirmOrder().isDisplayed()
					&& customerOrderPage.tagReservedButton().isDisplayed()
					&& customerOrderPage.cancelOrder().isEnabled()) {
				reportHelper.generateLogFullScreenSS(test,
						"Customer order navigation sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Passed");
				reportHelper.onTestSuccess(test,
						"Customer order navigation sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Customer order navigation not sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Failed");
				reportHelper.onTestFailure(test,
						"Customer order navigation not sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Customer order navigation not sucessfully with mentioned  fields are not displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel");
			reportHelper.onTestFailure(test,
					"Customer order navigation not sucessfully with mentioned  fields are not displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel");

		}

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		driver.navigate().refresh();

	}

	public void addHeaderAndAddlineEnterAddItemDetails1() throws InterruptedException, IOException {

		// TC-02-Verify new button clickable
		try {

			if (customerOrderPage.deleteHButton().isDisplayed() && customerOrderPage.confirmOrder().isDisplayed()
					&& customerOrderPage.tagReservedButton().isDisplayed()
					&& customerOrderPage.cancelOrder().isEnabled()) {
				reportHelper.generateLogFullScreenSS(test,
						"Customer order navigation sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Passed");
				reportHelper.onTestSuccess(test,
						"Customer order navigation sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Customer order navigation not sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel :Is Failed");
				reportHelper.onTestFailure(test,
						"Customer order navigation not sucessfully with mentioned  fields are displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel : Is Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Customer order navigation not sucessfully with mentioned  fields are not displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel");
			reportHelper.onTestFailure(test,
					"Customer order navigation not sucessfully with mentioned  fields are not displayed 1. delete Id 2.confirm 3. tagReserve 4. Cancel");

		}
		// Retrieve the current date and convert it to "dd/MM/yyyy" format
		String currentDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Current Date"), "");
		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat("MM-dd-yyyy");
			System.out.println("Date is:" + originalFormat);
			SimpleDateFormat targetFormat = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("Date is:" + targetFormat);
			Date date = originalFormat.parse(currentDate);
			currentDate = targetFormat.format(date).trim();
			System.out.println("Current Date is:" + currentDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Validate and retrieve order date from the UI
		WebElement dateElement = customerOrderPage.validateOrderdate();
		String orderDate = dateElement.getAttribute("title").trim();
		System.out.println("Order date is: " + orderDate);

		try {
			if (orderDate.equals(currentDate)) {
				reportHelper.generateLogFullScreenSS(test,
						"TC_03-->OrderDate automatically displays current date: Passed");
				reportHelper.onTestSuccess(test, "TC_03-->OrderDate automatically displays current date: Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"TC_03-->OrderDate automatically displays current date: Failed");
				reportHelper.onTestFailure(test, "TC_03-->OrderDate automatically displays current date: Failed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test, "TC_03-->OrderDate automatically displays current date: Failed");
			reportHelper.onTestFailure(test, "TC_03-->OrderDate automatically displays current date: Failed");
		}

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);
		enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
		enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		// Click generate line and validate message
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(1000);
		WebElement actual = customerOrderPage.validateGenerateLineMsg();
		String actualMessage = actual.getText().trim();
		String expectedMessage = "Line Generated.";
		System.out.println("Message is: " + actualMessage);

		if (actualMessage.equals(expectedMessage)) {
			reportHelper.onTestSuccess(test, "Line generated successfully");
			reportHelper.generateLogFullScreenSS(test, "Line generated successfully");
		} else {
			reportHelper.onTestFailure(test, "Line not generated successfully");
			reportHelper.generateLogFullScreenSS(test, "Line not generated successfully");
		}

		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());
	}

	public void deleteOrder() throws InterruptedException, IOException, InvalidFormatException {

		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
//		VerifyField(customerOrder.customerNo(), "Customer No.", masterDto);

		customerOrderPage.addLineButton().click();
		Thread.sleep(2000);
		WebElement cno = customerOrderPage.getCustomerNo();
		String cusno = cno.getAttribute("title").trim();

		System.out.println("Customer no is" + cusno);

//		VerifyField(customerOrder.salesPerson(), "Sales Person", masterDto);
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);

//		VerifyField(customerOrder.variantNumber(), "Variant Number", masterDto);
//		

		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);

		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
		} else {
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		}

		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		// Click generate line
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(1000);
		WebElement actual = customerOrderPage.validateGenerateLineMsg();
		String actualmessage = actual.getText().trim();
		String expectedmessage = "Line Generated.";
		System.out.println("Message is: " + actual.getText());

		if (actualmessage.equals(expectedmessage)) {
			reportHelper.onTestSuccess(test, "Line is Generated Sucessfully");
			reportHelper.generateLogFullScreenSS(test, "Line is Generated Sucessfully");
		} else {
			reportHelper.onTestFailure(test, "Line is not Generated Sucessfully");
			reportHelper.generateLogFullScreenSS(test, "Line is not Generated Sucessfully");
		}

		// Delete Order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.deleteHButton());

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.deleteConfirmButton());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickBackButton());

		genericHelper.clearAndSendKeysAndEnter(customerOrderPage.searchFilterButton(), cusno);
		Thread.sleep(1000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickOrderNo());
		if (cno.isDisplayed()) {
			reportHelper.onTestFailure(test, "After Delete Order is displayed");
			reportHelper.generateLogFullScreenSS(test, "After Delete Order is displayed");
		} else {
			reportHelper.onTestSuccess(test, "After delete Order is not displayed");
			reportHelper.generateLogFullScreenSS(test, "After Delete Order is not displayed");
		}

	}

	public void reserveTagWithoutConfirmOrder() throws InterruptedException, IOException {

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);

//		VerifyField(customerOrder.variantNumber(), "Variant Number", masterDto);

		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);

		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);

		enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);

		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		// Click generate line
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.notificationCloseButton());

		// Click reserved Tag
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickReserveTagButton());
		Thread.sleep(3000);
	}

	public void reserveTagProcess() throws InterruptedException, IOException {
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
		} else {
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		}

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		Thread.sleep(2000);
		// genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());

		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");

		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales PersonR"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Status"), "");

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickReserveTagButton());
		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterSalesPerson(), salesp);

		Thread.sleep(5000);
		// enterDataIntoField(customerOrderPage.enterSalesPerson(), "Sales Person",
		// masterDto);
		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterTagNo(), tagno);
		// enterDataIntoField(customerOrderPage.enterTagNo(), "Tag No", masterDto);

		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickOkButtonTagReservation());

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickTagReservedHeader());

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

		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");

		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales PersonR"), "");
		String tagStatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Status"), "");
		String tagStatus1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("UnReserved Tag Status"), "");
//		String con= StringUtils.defaultIfBlank(masterDto.getAttributeValue("CON"), "");
//		System.out.println("No is"+con);

		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		Thread.sleep(2000);

		WebElement cno1 = customerOrderPage.getCustomerNo();
		String cusno1 = cno1.getAttribute("title").trim();

		System.out.println("Customer no is" + cusno1);
		Thread.sleep(2000);

		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
		} else {
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		}

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickReserveTagButton());
		// customerOrderPage.enterSalesPerson().sendKeys(salesp);
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickSalePersonDropDown());

		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterSalesPerson(), salesp);

		Thread.sleep(2000);

		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterTagNo(), tagno);

		// enterDataIntoField(customerOrderPage.enterSalesPerson(), "Sales Person",
		// masterDto);

//		GenericHelper.actions.sendKeys(Keys.TAB).build().perform();
//		customerOrderPage.enterSalesPerson().sendKeys("ABC");
//		Thread.sleep(2000);
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(customerOrderPage.enterTagNo(), tagno);
//		 

//		Thread.sleep(5000);

		// WebElement salesPersonInput = customerOrderPage.enterSalesPerson(); // Your
		// input field element

//		actions.moveToElement(salesPersonInput)
//		       .click()
//		       .sendKeys(salesp)  // Enter text using Actions
//		       .build()
//		       .perform();
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(customerOrderPage.enterSalesPerson(), salesp);
//		Thread.sleep(5000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickOkButtonTagReservation());

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickTagReservedHeader());

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
			reportHelper.onTestSuccess(test,
					"After Tag Reserved Valid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		} else {
			reportHelper.onTestFailure(test,
					"After Tag Reserved Invalid Tag Status name is: " + actualTagStatus + " for tag " + tagno);
		}

		Thread.sleep(3000);
		driver.navigate().refresh();
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		driver.navigate().refresh();

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickCustomerOrder());

		genericHelper.sendKeysWithjavascriptExecutor(customerOrderPage.enterCusOrder(), cusno1);
		customerOrderPage.enterCusOrder().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickCusOrder());
		actions.moveToElement(customerOrderPage.clickCusOrder()).doubleClick().perform();

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickTagReservedHeader());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickUnreserveTag());
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickYesButton());

		driver.navigate().refresh();

		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		// genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());
		Thread.sleep(1000);

		WebElement batchn1 = alltagpageslot.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn1);
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickBatchNo());

		alltagpageslot.enterBatchNo().sendKeys(tagno);
		Thread.sleep(4000);
		alltagpageslot.clickApply().click();
		Thread.sleep(2000);

		WebElement tagStatusName1 = alltagpageslot.checkTagStatus();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});",
				tagStatusName1);

		String actualTagStatus1 = tagStatusName1.getAttribute("value");
		System.out.println("Tag Status for tag " + tagno + ": " + actualTagStatus1);

		// Combined if-else to check both conditions
		if (actualTagStatus1.equals(tagStatus1)) {
			reportHelper.onTestSuccess(test,
					"After Tag UnReserved Valid Tag Status name is: " + actualTagStatus1 + " for tag " + tagno);
		} else {
			reportHelper.onTestFailure(test,
					"After Tag UnReserved Invalid Tag Status name is: " + actualTagStatus1 + " for tag " + tagno);
		}

		Thread.sleep(3000);
		driver.navigate().refresh();
		genericHelper.clickWithJavascriptExecutor(alltagpageslot.clickOkButton());

	}

	public void reserveTagNegativeProcess() throws InterruptedException, IOException {
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
		} else {
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		}

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		Thread.sleep(2000);
		customerOrderPage.notificationCloseButton();
		// genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());

		String tagno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag No"), "");

		String salesp = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person"), "");

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickReserveTagButton());
		enterDataIntoField(customerOrderPage.enterTagNo(), "Tag No", masterDto);
		Thread.sleep(5000);
		// enterDataIntoField(customerOrderPage.enterSalesPerson(), "Sales Person",
		// masterDto);
		// genericHelper.clearAndSendKeysWithJavascriptExecutor(customerOrderPage.enters,
		// salesp);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(customerOrderPage.enterSalesPerson(), salesp);
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickOkButtonTagReservation());

		Thread.sleep(2000);

	}

	public void checkCancelDisable() throws InterruptedException, IOException {
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		if (!customerOrderPage.checkCancelNo().isEnabled()) {
			reportHelper.onTestFailure(test, "Cancel button is enable");
		} else {

			reportHelper.onTestSuccess(test, "Cancel button is disable");
		}

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
		} else {
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
		}

		// Scroll and enter delivery store
		GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
				customerOrderPage.deliveryStore1());
		enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		Thread.sleep(2000);

		if (customerOrderPage.checkCancelNo().isEnabled()) {
			reportHelper.onTestSuccess(test, "After confirm order Cancel button is enable");
		} else {

			reportHelper.onTestFailure(test, "After confirm order Cancel button is disable");
		}
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.checkCancelNo());
		Thread.sleep(2000);

	}

	public void addMultipleDataOrder()
			throws InterruptedException, IOException, NumberFormatException, InvalidFormatException {

		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		String caseID = masterDto.getAttributeValue("CaseID");
		String noOfItem = masterDto.getAttributeValue("No of item");

		// Parse input values
		int caseIDOriginal = (int) Double.parseDouble(caseID);
		int noOfItems = (int) Double.parseDouble(noOfItem);

		test = reportHelper.createTestCase(test, extentReports, masterDto);

		if (noOfItems >= 1) {
			for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "CustomerOrderSheet.xlsx",
					"Multi"); rowIndex++) {
				// Read data from Excel and map it to masterDto
				Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx",
						"Multi", rowIndex);
				for (Map.Entry<String, String> entry : orderData.entrySet()) {
					masterDto.setAttribute(entry.getKey(), entry.getValue());
				}

				// Get the CaseID for the current row and parse it
				String currentCaseID = masterDto.getAttributeValue("CaseID");
				int caseIDFromRow = (int) Double.parseDouble(currentCaseID);

				// Check if CaseIDs match
				if (caseIDOriginal == caseIDFromRow) {
					customerOrderPage.addLineButton().click();
//	                genericHelper.scrollingTillWebElement(customerOrderPage.itemId1());

					// Populate fields for the current line
					enterDataIntoField(customerOrderPage.AddLineItemIdFiel(rowIndex), "Item Id", masterDto);
					enterDataIntoField(customerOrderPage.AddLineVariantNumber(rowIndex), "Variant number", masterDto);
					enterDataIntoField(customerOrderPage.purity(rowIndex), "Purity", masterDto);
					enterDataIntoField(customerOrderPage.orderPcs(rowIndex), "Order Pcs", masterDto);
					enterDataIntoField(customerOrderPage.grossOrderQty(rowIndex), "Gross Order Qty", masterDto);

					// Scroll and enter delivery store
					GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
							customerOrderPage.deliveryStore(rowIndex));
					enterDataIntoField(customerOrderPage.deliveryStore(rowIndex), "Delivery Store", masterDto);

					// Generate line and wait for the process
					genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
					Thread.sleep(1000);
				}
			}

			// Confirm and save the order after processing all lines
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());
		}
	}

	public void validateFields() throws InterruptedException, IOException {

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		Thread.sleep(2000);

		if (!customerOrderPage.checkOrderType().isEnabled() && !customerOrderPage.checkOrderCategory().isEnabled()
				&& !customerOrderPage.validateOrderdate().isEnabled()) {
			reportHelper.onTestFailure(test, "Ordertype and Order category fields are enable");
		} else {

			reportHelper.onTestSuccess(test, "Ordertype and Order category fields are disable");
		}

		// Click add line button
		customerOrderPage.addLineButton().click();
		driver.navigate().refresh();

	}

	public void validateCurrentDate() throws InterruptedException, IOException {

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);
		Thread.sleep(2000);

		// Retrieve the current date and convert it to "dd/MM/yyyy" format
		WebElement dateElement = customerOrderPage.validateOrderdate();
		String orderDate = dateElement.getAttribute("title").trim();
		System.out.println("Order date is: " + orderDate);
		String currentDate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Current Date"), "");
		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Date is:" + originalFormat);
			SimpleDateFormat targetFormat = new SimpleDateFormat("M/dd/yyyy");
			System.out.println("Date is:" + targetFormat);
			Date date = originalFormat.parse(currentDate);
			currentDate = targetFormat.format(date).trim();
			System.out.println("Current Date is:" + currentDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Validate and retrieve order date from the UI
//		WebElement dateElement = customerOrderPage.validateOrderdate();
//		String orderDate = dateElement.getAttribute("title").trim();
//		System.out.println("Order date is: " + orderDate);

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
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String initialstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Initial Status"), "");
		String orderstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Confirm Status"), "");
		String cancelstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Cancel Status"), "");

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		WebElement status = customerOrderPage.getOrderStatus();
		String actualStatus = status.getAttribute("title");
		System.out.println("Status is:" + actualStatus);

		if (initialstatus.contains(actualStatus)) {
			reportHelper.onTestSuccess(test, "Initial Status is displayed " + actualStatus + " as Open: Passed");
		} else {
			reportHelper.onTestSuccess(test, "Initial Status is not displayed as Open: Failed");
		}

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		} else if ("Diamond".equalsIgnoreCase(itemType)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickPretagHeader());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickNewH());

			enterDataIntoField(customerOrderPage.enterItemidH(), "Item IdH", masterDto);
			enterDataIntoField(customerOrderPage.enterVarientH(), "VarientH", masterDto);
			enterDataIntoField(customerOrderPage.enterQuantityH(), "QuantityH", masterDto);

			enterDataIntoField(customerOrderPage.enterNosH(), "No Stone", masterDto);

		} else {
			// Default condition
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		}
		Thread.sleep(2000);

		// Confirm and save the order
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.confirmOrder());
		Thread.sleep(2000);
		WebElement status1 = customerOrderPage.getOrderStatus();
		String actualStatus1 = status1.getAttribute("title");
		System.out.println(actualStatus1);

		if (orderstatus.contains(actualStatus1)) {
			reportHelper.onTestSuccess(test, "Confirm Status is displayed " + actualStatus1 + " as Ordered: Passed");
		} else {
			reportHelper.onTestFailure(test, "Confirm Status is not displayed as Ordered: Failed");
		}
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.checkCancelNo());
		Thread.sleep(2000);
		WebElement status2 = customerOrderPage.getOrderStatus();
		String actualStatus2 = status2.getAttribute("title");
		System.out.println(actualStatus2);

		if (cancelstatus.contains(actualStatus2)) {
			reportHelper.onTestSuccess(test, "Cancel Status is displayed " + actualStatus2 + " as Cancelled: Passed");
		} else {
			reportHelper.onTestFailure(test, "Cancel Status is not displayed as Cancelled: Failed");
		}

	}

	public void validateOrderValues() throws InterruptedException, IOException {
		String itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		String grossweight = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Order Qty"), "");
		String itemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String varientno = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant number"), "");
		String purity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity"), "");
		String orderpcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Order Pcs"), "");

		// Enter order details
		enterDataIntoField(customerOrderPage.customerNo(), "Customer No.", masterDto);
		enterDataIntoField(customerOrderPage.salesPerson(), "Sales Person", masterDto);

		// Click add line button
		customerOrderPage.addLineButton().click();
		enterDataIntoField(customerOrderPage.itemId1(), "Item Id", masterDto);
		enterDataIntoField(customerOrderPage.variantNumber1(), "Variant number", masterDto);
		enterDataIntoField(customerOrderPage.purity1(), "Purity", masterDto);
		enterDataIntoField(customerOrderPage.orderPcs1(), "Order Pcs", masterDto);

		// Apply condition for item type based on the Excel sheet column "Item Type"
		if ("MRP".equalsIgnoreCase(itemType) || "Forming".equalsIgnoreCase(itemType)) {
			enterDataIntoField(customerOrderPage.orderRate(), "Order Rate", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		} else if ("Diamond".equalsIgnoreCase(itemType)) {
			// Specific condition for Diamond
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickPretagHeader());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickNewH());

			enterDataIntoField(customerOrderPage.enterItemidH(), "Item IdH", masterDto);
			enterDataIntoField(customerOrderPage.enterVarientH(), "VarientH", masterDto);
			enterDataIntoField(customerOrderPage.enterQuantityH(), "QuantityH", masterDto);

			enterDataIntoField(customerOrderPage.enterNosH(), "No Stone", masterDto);

		} else {
			// Default condition
			enterDataIntoField(customerOrderPage.grossOrderQty1(), "Gross Order Qty", masterDto);
			enterDataIntoField(customerOrderPage.netOrderQty(), "Net Order Qty", masterDto);
			// Scroll and enter delivery store
			GenericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
					customerOrderPage.deliveryStore1());
			enterDataIntoField(customerOrderPage.deliveryStore1(), "Delivery Store", masterDto);

			// Click generate line and validate message
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.clickGenerateLine());
		}

		Thread.sleep(1000);
		WebElement gw = customerOrderPage.grossOrderQty1();
		String actaulgrossweight = gw.getAttribute("title");
		System.out.println("value" + actaulgrossweight);

		WebElement pcs = customerOrderPage.orderPcs1();
		String actaulorderpcs = pcs.getAttribute("title");
		System.out.println("value" + actaulorderpcs);

		WebElement itemi = customerOrderPage.itemId1();
		String actaulitemid = itemi.getAttribute("value");
		System.out.println("value" + actaulitemid);

		WebElement purityy = customerOrderPage.purity1();
		String actaulpurity = purityy.getAttribute("title");
		System.out.println("value" + actaulpurity);

		WebElement varientid = customerOrderPage.variantNumber1();
		String actautvarient = varientid.getAttribute("value");
		System.out.println("value" + actautvarient);

		if (grossweight.contains(actaulgrossweight)) {
			reportHelper.onTestSuccess(test, "Gross weight is correct displayed as " + actaulgrossweight);
		} else {
			reportHelper.onTestFailure(test, "Gross weight is not correct displayed as " + actaulgrossweight);
		}
		if (orderpcs.contains(actaulorderpcs)) {
			reportHelper.onTestSuccess(test, "Order pcs is correct displayed as " + actaulorderpcs);
		} else {
			reportHelper.onTestFailure(test, "Order pcs is not correct displayed as " + actaulorderpcs);
		}
		if (itemid.contains(actaulitemid)) {
			reportHelper.onTestSuccess(test, "Item id is correct displayed as " + actaulitemid);
		} else {
			reportHelper.onTestFailure(test, "Item id is not correct displayed as " + actaulitemid);
		}
		if (purity.contains(actaulpurity)) {
			reportHelper.onTestSuccess(test, "Purity is correct displayed as " + actaulitemid);
		} else {
			reportHelper.onTestFailure(test, "Purity is not correct displayed as " + actaulitemid);
		}
		if (varientno.contains(actautvarient)) {
			reportHelper.onTestSuccess(test, "Varient is correct displayed as " + actaulitemid);
		} else {
			reportHelper.onTestFailure(test, "Varient is not correct displayed as " + actaulitemid);
		}

		driver.navigate().refresh();

	}

	public void checkCalculations() throws IOException, InterruptedException, InvalidFormatException {
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet.xlsx", "Sheet2",
				1);
		for (Map.Entry<String, String> entry : orderData.entrySet()) {
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}

		addHeaderAndAddlineEnterAddItemDetailsAll();

		String[] fields = { "Purity", "Order Pieces", "Gross Order Qty", "Net Order Qty", "Fine Order Qty",
				"Order Rate", "Making Rate", "Making Charge", "Order Value", "Metal Value", "Wastage Code",
				"Stone amount" };

		try {
			for (String fieldName : fields) {
				try {
					Object expectedValue = masterDto.getAttribute(fieldName);
					Object actualValue = getFieldValue(fieldName);
					if (expectedValue != null) {
						expectedValue = expectedValue.toString();
//							System.out.println("expectedValue: " + expectedValue);
						actualValue = getFieldValue(fieldName).getAttribute("value").toString();
//							System.out.println("actualValue: " + fieldName + " " + actualValue);
					} else {
						expectedValue = Double.parseDouble(masterDto.getAttribute(fieldName).toString());
//							System.out.println("expectedValue: " + fieldName + " " + expectedValue);

						actualValue = Double.parseDouble(getFieldValue(fieldName).getAttribute("value").toString());
//							System.out.println("actualValue: " + fieldName + " " + actualValue);
					}

					softAssert.assertEquals(actualValue, expectedValue,
							"Expected value of " + fieldName + " does not match actual value");
					reportHelper.onTestSuccess(test, "actual Value of " + fieldName + " is equal to expected Value");
					reportHelper.generateLogFullScreenSS(test,
							"actual Value of " + fieldName + " is equal to expected Value");
				} catch (NumberFormatException | NoSuchElementException e) {
					reportHelper.onTestFailure(test, "Failed to validate field: " + fieldName);
					reportHelper.generateLogFullScreenSS(test, "Failed to validate field: " + fieldName);
				}
			}
			driver.navigate().refresh();
//		softAssert.assertAll(); // Assert all collected failures
		} catch (Exception e) {
			System.err.println("An error occurred while checking formulas: " + e.getMessage());
		}
	}

	private WebElement getFieldValue(String fieldName) {
		switch (fieldName) {
		case "Purity":
			System.out.println("Purity switch");
			return customerOrderPage.purity1();
		case "Order Pieces":
			return customerOrderPage.orderPcs1();
		case "Gross Order Qty":
			return customerOrderPage.grossOrderQty1();
		case "Net Order Qty":
			return customerOrderPage.netOrderQty();
		case "Fine Order Qty":
			return customerOrderPage.fineOrderQty();
		case "Order Rate":
			return customerOrderPage.orderRate();
		case "Making Rate":
			return customerOrderPage.makingRate();
		case "Making Charge":
			return customerOrderPage.makingCharge();
		case "Order Value":
			return customerOrderPage.orderValue();
		case "Metal Value":
			return customerOrderPage.metalValue();
//		case "Order Status":
//			return customerOrder.Order_StatusLine();
		case "Wastage Code":
			return customerOrderPage.wastageCode();
		case "Stone amount":
			return customerOrderPage.stoneAmount();
		default:
			throw new IllegalArgumentException("Invalid field name: " + fieldName);
		}
	}

	public void validateFields(String fieldName, WebElement element, int rowNum)
			throws IOException, InterruptedException, InvalidFormatException {
		try {
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "CustomerOrderSheet", "Sheet2",
					rowNum);
			for (Map.Entry<String, String> entry : orderData.entrySet()) {
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			test = reportHelper.createTestCase(test, extentReports, masterDto);
			genericHelper.clearAndSendKeysAndEnter(element, getValueOrDefault(masterDto.getAttributeValue(fieldName)));

			if (fieldName != null && fieldName.equals(fieldName)) {
				try {
					WebElement salePerson = driver
							.findElement(By.xpath("//input[contains(@id,'SysGen_AgentCode') and contains(@value,'"
									+ masterDto.getAttributeValue(fieldName) + "')]"));

					if (salePerson.isDisplayed()) {
						reportHelper.onTestSuccess(test, "Sale Person is deactivated");
						reportHelper.generateLogFullScreenSS(test, "Sale Person is deactivated");
					} else {
						reportHelper.onTestFailure(test, "Sale Person is active for " + fieldName);
						reportHelper.generateLogFullScreenSS(test, "Sale Person is active for " + fieldName);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			reportHelper.generateLog(test, fieldName + ": " + element.getText());
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());
			getResults(masterDto);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
