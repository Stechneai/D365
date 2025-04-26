package com.d365.core;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class ItemTypeMaster extends MasterClass {

	public void addHmItemData(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		String itemTypeName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeName"), "");
		String fineitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineItem"), "");
		String primaryitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PrimaryItem"), "");
		String hmitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HmItem"), "");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());
		
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnNew());

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemType(), itemtypecode);

		WebElement itemtypecod = itemTypeMasterPage.txtItemType();
		String actualItemTypeCode = itemtypecod.getAttribute("title").trim();

		System.out.println("Item Name is" + actualItemTypeCode);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemTypeName(), itemTypeName);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtFineItem(), fineitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtPrimaryItem(), primaryitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtHmItem(), hmitem);
		reportHelper.generateLogFullScreenSS(test, "Hm Item is selected ");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnSave());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.iconFilter());
		itemTypeMasterPage.btnSearchItemcode().sendKeys(itemtypecode);
		Thread.sleep(2000);
		itemTypeMasterPage.btnApply().click();
		Thread.sleep(2000);

		if (itemtypecod.isDisplayed()) {
			reportHelper.onTestSuccess(test, "After Add Item is displayed");
			reportHelper.generateLogFullScreenSS(test, "After Add Item is displayed");
		} else {
			reportHelper.onTestFailure(test, "After Add Item is not displayed");
			reportHelper.generateLogFullScreenSS(test, "After Add Item is not displayed");
		}

	}

	public void duplicateRecord(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		String itemTypeName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeName"), "");
		String fineitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineItem"), "");
		String primaryitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PrimaryItem"), "");
		String hmitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HmItem"), "");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());
		
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnNew());

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemType(), itemtypecode);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemTypeName(), itemTypeName);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtFineItem(), fineitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtPrimaryItem(), primaryitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtHmItem(), hmitem);

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnSave());

	}

	public void navigationItemMaster(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());

		// navigation of offline tagging
		try {

			if (itemTypeMasterPage.btnEdit().isDisplayed() && itemTypeMasterPage.btnNew().isDisplayed()
					&& itemTypeMasterPage.checkItemTypeMaster().isDisplayed()
					&& itemTypeMasterPage.btnOptions().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of Item Type Master using following Path Jewellery>>Master>>Item Type Master(Group)");

		}
	}

	public void addHmItem(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		String itemTypeName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeName"), "");
		String fineitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineItem"), "");
		String primaryitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PrimaryItem"), "");
		String hmitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HmItem"), "");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnNew());

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemType(), itemtypecode);

		WebElement itemtypecod = itemTypeMasterPage.txtItemType();
		String actualItemTypeCode = itemtypecod.getAttribute("title").trim();

		System.out.println("Item Name is" + actualItemTypeCode);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemTypeName(), itemTypeName);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtFineItem(), fineitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtPrimaryItem(), primaryitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtHmItem(), hmitem);

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnSave());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.iconFilter());
		itemTypeMasterPage.btnSearchItemcode().sendKeys(itemtypecode);
		Thread.sleep(2000);
		itemTypeMasterPage.btnApply().click();
		Thread.sleep(2000);

		WebElement hmitemvalue = itemTypeMasterPage.txtHmItem();
		String actualhmitemvalue = hmitemvalue.getAttribute("value");
		System.out.println("Value is:" + actualhmitemvalue);

		if (actualhmitemvalue == null || actualhmitemvalue.trim().isEmpty()
				|| !actualhmitemvalue.trim().equalsIgnoreCase(hmitem.trim())) {
			reportHelper.onTestFailure(test,
					"HM Item value is incorrect. Expected: [" + hmitem + "] but found: [" + actualhmitemvalue + "]");
			reportHelper.generateLogFullScreenSS(test, "HM Item Value is incorrect.");
		} else {
			reportHelper.onTestSuccess(test, "HM Item value is correctly selected.");
			reportHelper.generateLogFullScreenSS(test, "HM Item validation succeeded.");
		}

	}

	public void editableOrNotHmItem(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		String itemTypeName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeName"), "");
		String fineitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineItem"), "");
		String primaryitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PrimaryItem"), "");
		String hmitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HmItem"), "");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnNew());

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemType(), itemtypecode);

		WebElement itemtypecod = itemTypeMasterPage.txtItemType();
		String actualItemTypeCode = itemtypecod.getAttribute("title").trim();

		System.out.println("Item Name is" + actualItemTypeCode);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemTypeName(), itemTypeName);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtFineItem(), fineitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtPrimaryItem(), primaryitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtHmItem(), hmitem);

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnSave());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.iconFilter());
		itemTypeMasterPage.btnSearchItemcode().sendKeys(itemtypecode);
		Thread.sleep(2000);
		itemTypeMasterPage.btnApply().click();
		Thread.sleep(2000);

		genericHelper.scrollingTillWebElement(itemTypeMasterPage.txtHmItem());

//		WebElement hmitemvalue = itemTypeMasterPage.enterHmItem();
//		String actualhmitemvalue = hmitemvalue.getAttribute("value").trim();
//		System.out.println("Value is:" + actualhmitemvalue);

		WebElement hmItemField = itemTypeMasterPage.txtHmItem();
		if (!hmItemField.isEnabled() || hmItemField.getAttribute("readonly") != null) {
			System.out.println("The HM Item field is not editable.");
			reportHelper.onTestFailure(test, "HM Item field is not editable.");
			reportHelper.generateLogFullScreenSS(test, "HM Item field is not editable.");
			return;
		} else {
			System.out.println("The HM Item field is  editable.");
			reportHelper.onTestSuccess(test, "HM Item field is  editable.");
			reportHelper.generateLogFullScreenSS(test, "HM Item field is  editable.");
			return;
		}

	}

	public void delete(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.iconFilter());
		itemTypeMasterPage.btnSearchItemcode().sendKeys(itemtypecode);
		Thread.sleep(2000);
		itemTypeMasterPage.btnApply().click();
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.radioRow());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnDelete());

	}

	public void invalideHmItem(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String itemtypecode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeCode"), "");
		String itemTypeName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ItemTypeName"), "");
		String fineitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FineItem"), "");
		String primaryitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PrimaryItem"), "");
		String hmitem = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HmItem"), "");

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkModules());
		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.lnkItemMaster());

		genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.btnNew());

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemType(), itemtypecode);

		WebElement itemtypecod = itemTypeMasterPage.txtItemType();
		String actualItemTypeCode = itemtypecod.getAttribute("title").trim();

		System.out.println("Item Name is" + actualItemTypeCode);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtItemTypeName(), itemTypeName);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtFineItem(), fineitem);

		genericHelper.clearAndSendKeysAndEnter(itemTypeMasterPage.txtPrimaryItem(), primaryitem);

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(itemTypeMasterPage.txtHmItem(), hmitem);

		// genericHelper.clickWithJavascriptExecutor(itemTypeMasterPage.clickSave());
	}

}
