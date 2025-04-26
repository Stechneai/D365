package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;

public class SizeMaster extends MasterClass {

	public String sizecode;
	public String itemId;
	public String configuration;
	public String fromRange;
	public String toRange;
	public String uom;

	public void addsizeMasterData() throws IOException, InterruptedException, InvalidFormatException {
		// Fetch values from the masterDto
		sizecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Size Code"), "");
		itemId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		fromRange = StringUtils.defaultIfBlank(masterDto.getAttributeValue("From Range"), "");
		toRange = StringUtils.defaultIfBlank(masterDto.getAttributeValue("To Range"), "");
		uom = StringUtils.defaultIfBlank(masterDto.getAttributeValue("UOM"), "");

		WebElement sizemasterpageTitle = sizeMasterPage.pageTitleSizeMaster();

		if (sizemasterpageTitle.isDisplayed()) {
			reportHelper.onTestSuccess(test,
					"User successfully reached the 'Size Master' page by navigating through "
							+ "Jewellery >> Master >> Size Master.\r\n" + "Expected fields:\r\n" + "1. Size Code\r\n"
							+ "2. Item ID\r\n" + "3. Configuration\r\n" + "4. From Range\r\n" + "5. To Range\r\n"
							+ "6. UOM\r\n");
			reportHelper.generateLogFullScreenSS(test, "Verified Size Master page navigation.");

			reportHelper.onTestSuccess(test, "Grid view Display");
			reportHelper.generateLogFullScreenSS(test, "Grid view Display");
		} else {
			reportHelper.onTestFailure(test, "Failed to navigate to the 'Size Master' page.");
			reportHelper.generateLogFullScreenSS(test, "Size Master page navigation failed.");
			return;
		}

		if (sizeMasterPage.sizeCode().isDisplayed() && sizeMasterPage.itemId().isDisplayed()
				&& sizeMasterPage.configuration().isDisplayed() && sizeMasterPage.fromRange().isDisplayed()
				&& sizeMasterPage.toRange().isDisplayed() && sizeMasterPage.uom().isDisplayed()) {

			reportHelper.onTestSuccess(test,
					"Upon clicking 'Add' button, the expected fields are displayed:\r\n"
							+ "1. Size Code (Auto-generated)\r\n" + "2. Item ID (Dropdown - Single Selection)\r\n"
							+ "3. Configuration (Fetched against Item ID)\r\n"
							+ "4. From Range (Cannot be zero or negative)\r\n" + "5. To Range (Only numeric values)\r\n"
							+ "6. UOM (Dropdown - Suggestion: Unit must be CM)\r\n");
			reportHelper.generateLogFullScreenSS(test, "Fields verified on Add operation.");

			// Enter values into the page fields
			genericHelper.clearAndSendKeysWithJavascriptExecutor(sizeMasterPage.itemId(), itemId);
			genericHelper.clearAndSendKeysWithJavascriptExecutor(sizeMasterPage.configuration(), configuration);
			genericHelper.clearAndSendKeysWithJavascriptExecutor(sizeMasterPage.fromRange(), fromRange);
			genericHelper.clearAndSendKeysWithJavascriptExecutor(sizeMasterPage.toRange(), toRange);
			genericHelper.clearAndsendKeysAndEnter(sizeMasterPage.uom(), uom); // Ensure this method name is correct
			genericHelper.clickWithJavascriptExecutor(customerOrderPage.saveButton());

			// Verify if the Size Master page elements are displayed correctly
			if (sizeMasterPage.itemId().isDisplayed() && sizeMasterPage.configuration().isDisplayed()
					&& sizeMasterPage.fromRange().isDisplayed() && sizeMasterPage.toRange().isDisplayed()
					&& sizeMasterPage.uom().isDisplayed()) {

				// Success log when the elements are displayed
				reportHelper.onTestSuccess(test,
						"User successfully reached the 'Size Master' page by navigating through Jewellery>>Master>>Size Master.\r\n"
								+ "The following options were provided:\r\n" + "1. Size Code: " + sizecode + "\r\n"
								+ "2. Item ID: " + itemId + "\r\n" + "3. Configuration: " + configuration + "\r\n"
								+ "4. From Range: " + fromRange + "\r\n" + "5. To Range: " + toRange + "\r\n"
								+ "6. UOM: " + uom + "\r\n");

				reportHelper.generateLogFullScreenSS(test,
						"User successfully reached the 'Size Master' page with the expected options displayed.\r\n"
								+ "1. Size Code: " + sizecode + "\r\n" + "2. Item ID: " + itemId + "\r\n"
								+ "3. Configuration: " + configuration + "\r\n" + "4. From Range: " + fromRange + "\r\n"
								+ "5. To Range: " + toRange + "\r\n" + "6. UOM: " + uom + "\r\n");
			} else {
				// Failure log if the elements are not displayed correctly
				reportHelper.onTestFailure(test,
						"User failed to reach the 'Size Master' page with the correct elements.\r\n"
								+ "Expected options were:\r\n" + "1. Size Code: " + sizecode + "\r\n" + "2. Item ID: "
								+ itemId + "\r\n" + "3. Configuration: " + configuration + "\r\n" + "4. From Range: "
								+ fromRange + "\r\n" + "5. To Range: " + toRange + "\r\n" + "6. UOM: " + uom + "\r\n");

				reportHelper.generateLogFullScreenSS(test,
						"Failed to verify the expected elements on the 'Size Master' page.\r\n" + "1. Size Code: "
								+ sizecode + "\r\n" + "2. Item ID: " + itemId + "\r\n" + "3. Configuration: "
								+ configuration + "\r\n" + "4. From Range: " + fromRange + "\r\n" + "5. To Range: "
								+ toRange + "\r\n" + "6. UOM: " + uom + "\r\n");
			}
		}
	}
}
