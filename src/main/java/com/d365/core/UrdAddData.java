package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.common.usermodel.GenericRecord;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.d365.pagelayer.URDPage;
import com.d365.utils.MasterClass;

public class UrdAddData extends MasterClass {
	public String customerCode;
	public String salesPersonCode;
	public String purchaseType;
	public String itemType;
	public String purchaseCategory;
	public String itemID;
	public String ornamentCategory;
	public String purityCarat;
	public String grossWt;
	public String netWt;
	public String fineWt;
	public String stonePcs;
	public String quantity;

	public Float quantity1;
	public String variantId;
	public String configuration;
	public String rate;
	public String mrpFormingPercentage;
	public String tagNo;
	public String site;
	public String location;
	public String deduction;
	public String noofPieces;
	public String oldornamnetValue;
	public String prequantity;
	public String purchtransValue;
	public String preitemid;
	public String prevariantid;
	public String preconfiguration;
	public String prestonepieces;

	public void UrdAddAllItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		Thread.sleep(5000);
//		urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);
//		urdPage.enterCustomerCode().sendKeys(customerCode);
//		Thread.sleep(3000);
//		urdPage.enterCustomerCode().sendKeys(Keys.ENTER);

//		urdPage.enterCustomerCode().sendKeys(customerCode, Keys.ENTER);
//		genericHelper.sendKeysAndEnterWithWait(urdPage.enterCustomerCode(), customerCode);
//		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

//		genericHelper.sendKeysAndEnterWithWait(urdPage.enterSalesPersonCode(), salesPersonCode);
//		Thread.sleep(3000);
		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//		clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		genericHelper.scrollingTillWebElement(urdPage.transFineWt());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}

	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

	public void UrdAddMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//			urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);
//			urdPage.enterCustomerCode().sendKeys(customerCode);
//			Thread.sleep(3000);
//			urdPage.enterCustomerCode().sendKeys(Keys.ENTER);

//			urdPage.enterCustomerCode().sendKeys(customerCode, Keys.ENTER);
//			genericHelper.sendKeysAndEnterWithWait(urdPage.enterCustomerCode(), customerCode);
//			Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

//			genericHelper.sendKeysAndEnterWithWait(urdPage.enterSalesPersonCode(), salesPersonCode);
//			Thread.sleep(3000);
		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//			clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preRate(), rate);
		genericHelper.clearAndsendKeysAndEnter(urdPage.mrpformingPercenetage(), mrpFormingPercentage);
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}

	public String getValueOrDefaultMF(String value) {
		return value != null ? value : "";
	}

	public void UrdopenestimateAllItem() throws IOException, InterruptedException {
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		Thread.sleep(5000);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickopenEstimate());
		checkNotificationPresenceAndHandle();
	}

	public void UrdopenestimateMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//				urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);
//				urdPage.enterCustomerCode().sendKeys(customerCode);
//				Thread.sleep(3000);
//				urdPage.enterCustomerCode().sendKeys(Keys.ENTER);

//				urdPage.enterCustomerCode().sendKeys(customerCode, Keys.ENTER);
//				genericHelper.sendKeysAndEnterWithWait(urdPage.enterCustomerCode(), customerCode);
//				Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

//				genericHelper.sendKeysAndEnterWithWait(urdPage.enterSalesPersonCode(), salesPersonCode);
//				Thread.sleep(3000);
		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//				clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preRate(), rate);
		genericHelper.clearAndsendKeysAndEnter(urdPage.mrpformingPercenetage(), mrpFormingPercentage);
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickopenEstimate());
		checkNotificationPresenceAndHandle();
	}

	public void UrdcancelestimateAllItem() throws IOException, InterruptedException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickCancelEstimate());
		checkCancelEstimatePresenceAndHandle();
	}

	public void UrdCancelEstimateMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//					urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//					clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preRate(), rate);
		genericHelper.clearAndsendKeysAndEnter(urdPage.mrpformingPercenetage(), mrpFormingPercentage);
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickCancelEstimate());
		checkCancelEstimatePresenceAndHandle();
	}

	public void UrddeleteAllItem() throws IOException, InterruptedException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		Thread.sleep(5000);
		urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		genericHelper.clickWithJavascriptExecutor(urdPage.delete());
		genericHelper.clickWithJavascriptExecutor(urdPage.deleteYes());
		try {
			WebElement itemId = urdPage.selectItemID();
			if (itemId.isDisplayed()) {
//							reportHelper.onTestFailure(test, "Line not deleted");
				reportHelper.generateLogFullScreenSS(test, "Line not deleted");
			} else {
//							reportHelper.onTestSuccess(test, "Line Deleted");
				reportHelper.generateLogFullScreenSS(test, "Line deleted");
			}
		} catch (Exception e) {
//						reportHelper.onTestFailure(test, "Line not deleted");
			reportHelper.generateLogFullScreenSS(test, "Line Deleted As no Element found");
		}

	}

	public void UrddeleteMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//						urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//						clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.delete());
		genericHelper.clickWithJavascriptExecutor(urdPage.deleteYes());
		try {
			WebElement itemId = urdPage.selectItemID();
			if (itemId.isDisplayed()) {
//								reportHelper.onTestFailure(test, "Line not deleted");
				reportHelper.generateLogFullScreenSS(test, "Line not deleted");
			} else {
//								reportHelper.onTestSuccess(test, "Line Deleted");
				reportHelper.generateLogFullScreenSS(test, "Line deleted");
			}
		} catch (Exception e) {
//							reportHelper.onTestFailure(test, "Line not deleted");
			reportHelper.generateLogFullScreenSS(test, "Line Deleted As no Element found");
		}

	}

	public void UrdornamentcategoryAllItem() throws IOException, InterruptedException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code *"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		checkNotificationPresenceAndHandle();

	}

	public void UrdornamentcategoryMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code *"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//						urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//						clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		checkNotificationPresenceAndHandle();

	}

	public void PurchaseTransValueAllItem() throws IOException, InterruptedException, InvalidFormatException {
		navigateToPage(urdPage.clickJewellery(), urdPage.clickOldGoldNote());
//	customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
		urdPage.enterCustomerCode().sendKeys("CUS000000002");
//	genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
//			getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
//	Thread.sleep(3000);

//	urdPage.enterCustomerCode().sendKeys(customerCode);
		Thread.sleep(3000);
//	urdPage.enterCustomerCode().sendKeys(Keys.ENTER);

//	urdPage.enterCustomerCode().sendKeys(customerCode, Keys.ENTER);
//	genericHelper.sendKeysAndEnterWithWait(urdPage.enterCustomerCode(), customerCode);
//	Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys("000041");
		Thread.sleep(3000);

//	genericHelper.sendKeysAndEnterWithWait(urdPage.enterSalesPersonCode(), salesPersonCode);
//	Thread.sleep(3000);
		urdPage.enterPurchaseType().clear();
//	urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
//	genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//	clearSendKeysAndLog(urdPage.enterItemType(), itemType);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterPurchaseType(), purchaseType);
		Thread.sleep(3000);
		// urdPage.enterPurchaseType().sendKeys("Purchase");
		// Thread.sleep(3000);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
		// urdPage.enterItemType().sendKeys("GOLD");
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);
		compareSingleFieldValue("Purch Trans Value *");

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		genericHelper.scrollingTillWebElement(urdPage.transFineWt());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
//	compareSingleFieldValue("");

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());

		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}

	public void PurchaseTransValueMrpFoItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//	urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);
//	urdPage.enterCustomerCode().sendKeys(customerCode);
//	Thread.sleep(3000);
//	urdPage.enterCustomerCode().sendKeys(Keys.ENTER);

//	urdPage.enterCustomerCode().sendKeys(customerCode, Keys.ENTER);
//	genericHelper.sendKeysAndEnterWithWait(urdPage.enterCustomerCode(), customerCode);
//	Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

//	genericHelper.sendKeysAndEnterWithWait(urdPage.enterSalesPersonCode(), salesPersonCode);
//	Thread.sleep(3000);
		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//	clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preRate(), rate);
		genericHelper.clearAndsendKeysAndEnter(urdPage.mrpformingPercenetage(), mrpFormingPercentage);
		Thread.sleep(3000);
		genericHelper.scrollingTillWebElement(urdPage.prePurchTransPrice());
		Thread.sleep(3000);
		compareSingleFieldValue("Purch Trans Value *");
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());

		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());

		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());

	}

	public void UrdAddDiamondJewelleryItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		prequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		preitemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id 2"), "");
		prevariantid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		preconfiguration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration *"), "");
		prestonepieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Stone Pcs"), "");

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.preaddLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preItemID(), preitemid);

		genericHelper.clearAndsendKeysAndEnter(urdPage.preQuantity(), prequantity);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preVariantID(), prevariantid);
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.preConfigID(), preconfiguration);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preNoofStonePcs(), prestonepieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}

	public void UrdOpenEstimateDiamondJewelleryItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		prequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		preitemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id 2"), "");
		prevariantid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		preconfiguration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration *"), "");
		prestonepieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Stone Pcs"), "");

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.preaddLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preItemID(), preitemid);

		genericHelper.clearAndsendKeysAndEnter(urdPage.preQuantity(), prequantity);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preVariantID(), prevariantid);
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.preConfigID(), preconfiguration);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preNoofStonePcs(), prestonepieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickopenEstimate());
		checkNotificationPresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}

	public void UrdCancelEstimagteDiamondJewelleryItem()
			throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		prequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		preitemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id 2"), "");
		prevariantid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		preconfiguration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration *"), "");
		prestonepieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Stone Pcs"), "");

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.preaddLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preItemID(), preitemid);

		genericHelper.clearAndsendKeysAndEnter(urdPage.preQuantity(), prequantity);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preVariantID(), prevariantid);
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.preConfigID(), preconfiguration);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preNoofStonePcs(), prestonepieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();

		genericHelper.clickWithJavascriptExecutor(urdPage.clickCancelEstimate());
		checkCancelEstimatePresenceAndHandle();
	}

	public void UrdDeleteDiamondJewelleryItem() throws IOException, InterruptedException, InvalidFormatException {
		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		prequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		preitemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id 2"), "");
		prevariantid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		preconfiguration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration *"), "");
		prestonepieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Stone Pcs"), "");

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.preaddLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preItemID(), preitemid);

		genericHelper.clearAndsendKeysAndEnter(urdPage.preQuantity(), prequantity);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preVariantID(), prevariantid);
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.preConfigID(), preconfiguration);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preNoofStonePcs(), prestonepieces);
		genericHelper.clickWithJavascriptExecutor(urdPage.oldtagheader());
		genericHelper.clickWithJavascriptExecutor(urdPage.delete());
		genericHelper.clickWithJavascriptExecutor(urdPage.deleteYes());
	}

	public void UrdornamentcategoryDJItem() throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code *"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");

		Thread.sleep(3000);

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		Thread.sleep(5000);
//					urdPage.enterCustomerCode().sendKeys("CUS000000002");
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);
//					clearSendKeysAndLog(urdPage.enterItemType(), itemType);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
	}

	public void UrdPurchTransValueDiamondJewelleryItem()
			throws IOException, InterruptedException, InvalidFormatException {

		customerCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Customer Code"), "");
		salesPersonCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Sales Person code"), "");
		purchaseType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase Type"), "");
		itemType = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Type"), "");
		purchaseCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purchase category *"), "");
		itemID = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id *"), "");
		ornamentCategory = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Ornament Category Code"), "");
		purityCarat = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Purity Carat"), "");
		grossWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Gross Weight *"), "");
		netWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Net Weight *"), "");
		fineWt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Fine Weight *"), "");
		// stonePcs = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of
		// Pieces"), "");
		quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		variantId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		rate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Rate *"), "");
		mrpFormingPercentage = StringUtils.defaultIfBlank(masterDto.getAttributeValue("MRP & Forming Percentage"), "");
		site = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Site Id"), "");
		location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Default Location Id"), "");
		deduction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Deduction"), "");
		noofPieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Pieces"), "");
		prequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		preitemid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id 2"), "");
		prevariantid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Variant Id *"), "");
		preconfiguration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration *"), "");
		prestonepieces = StringUtils.defaultIfBlank(masterDto.getAttributeValue("No. of Stone Pcs"), "");

		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.newButton());

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterCustomerCode(),
				getValueOrDefault(masterDto.getAttributeValue("Customer Code")));

		genericHelper.clickWithJavascriptExecutor(urdPage.enterSalesPersonCode());
		Thread.sleep(3000);
		urdPage.enterSalesPersonCode().sendKeys(salesPersonCode);
		Thread.sleep(3000);

		urdPage.enterPurchaseType().clear();
		urdPage.enterPurchaseType().sendKeys(purchaseType, Keys.ENTER);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterItemType(), itemType);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickAddLine());

		genericHelper.clearAndsendKeysAndEnter(urdPage.selectPurchaseCategory(), purchaseCategory);
		genericHelper.clearAndsendKeysAndEnter(urdPage.selectItemID(), itemID);
		Thread.sleep(3000);
		urdPage.selectOrnamentcategory().sendKeys(ornamentCategory, Keys.ENTER);
		genericHelper.sendKeysAndEnterWithWait(urdPage.selectOrnamentcategory(), ornamentCategory);

		genericHelper.insertDataIntoField(urdPage.selectPutiyCarat(), purityCarat);
		urdPage.selectPutiyCarat().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterGrossWeight(), grossWt);
		genericHelper.insertDataIntoField(urdPage.enterGrossWeight(), grossWt);
		urdPage.enterGrossWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.enterNetWeight(), netWt);
		genericHelper.insertDataIntoField(urdPage.enterNetWeight(), netWt);
		urdPage.enterNetWeight().sendKeys(Keys.ENTER);

		genericHelper.clearAndsendKeysAndEnter(urdPage.enterFineWt(), fineWt);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.enterNoOfPieces(), noofPieces);

		genericHelper.clickWithJavascriptExecutor(urdPage.clickPretagLine());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(urdPage.preaddLine());
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preItemID(), preitemid);

		genericHelper.clearAndsendKeysAndEnter(urdPage.preQuantity(), prequantity);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preVariantID(), prevariantid);
		Thread.sleep(3000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(urdPage.preConfigID(), preconfiguration);
		Thread.sleep(3000);
		genericHelper.clearAndsendKeysAndEnter(urdPage.preNoofStonePcs(), prestonepieces);
		compareSingleFieldValue("Purch Trans Value *");

		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderStatus());
		genericHelper.clickWithJavascriptExecutor(urdPage.clickValidate());
		checkValidatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.clickOrderEstimate());
		checkOrderEstimatePresenceAndHandle();
		genericHelper.clickWithJavascriptExecutor(urdPage.backbutton());
	}
}