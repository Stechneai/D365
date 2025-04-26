package com.d365.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PurchaseOrderPageObject extends MasterClass {

	public PurchaseOrderPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "navPaneModuleID")
	private WebElement module;

	public WebElement modules() {
		return module;
	}

	@FindBy(xpath = "//a[text()='Accounts payable']")
	private WebElement accPayable;

	public WebElement accountPayable() {
		return accPayable;
	}

	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expand;

	public WebElement expandAll() {
		return expand;
	}

	@FindBy(xpath = "//a[text()='All purchase orders']")
	private WebElement allPo;

	public WebElement allPurchaseOrders() {
		return allPo;
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement newButtonPo;

	public WebElement newBtnPo() {
		return newButtonPo;
	}

	// Vendor account
	@FindBy(xpath = "//input[@name='PurchTable_OrderAccount']")
	private WebElement vendorAccountField_PO;

	public WebElement vendorAccountPO() {
		return vendorAccountField_PO;
	}

	@FindBy(xpath = "//span[text()='Expand all']")
	private WebElement expndRC;

	public WebElement expandAllrightClick() {
		return expndRC;
	}

	@FindBy(xpath = "//span[text()='Add line']")
	private WebElement AddlinePO;

	public WebElement Addline_PO() {
		return AddlinePO;
	}

	@FindBy(xpath = "//button[text()='General']")
	private WebElement GeneralField_PO;

	public WebElement GeneralFieldPO() {
		return GeneralField_PO;
	}

	@FindBy(xpath = "//button[contains(@id,'_VendorTab_caption')]")
	private WebElement vendorStrField_PO;

	public WebElement vendorStrFieldPO() {
		return vendorStrField_PO;
	}

	// Site
	@FindBy(name = "PurchTable_InventSiteId")
	private WebElement siteField_PO;

	public WebElement sitePO() {
		return siteField_PO;
	}

	// Warehouse
	@FindBy(xpath = "//input[@name='PurchTable_InventLocationId']")
	private WebElement warehouseField_PO;

	public WebElement warehousePO() {
		return warehouseField_PO;
	}

	// OK button
	@FindBy(xpath = "//span[contains(@id,'_OK_label')]")
	private WebElement okButton_PO;

	public WebElement okButtonPO() {
		return okButton_PO;
	}

	// Item Number
	@FindBy(xpath = "//input[contains(@id,'PurchLine_ItemId_') and contains(@id,'_input')]")
	private WebElement itemNumberField_PO;

	public WebElement itemNumberPO() {
		return itemNumberField_PO;
	}

	// Product name
	@FindBy(xpath = "//input[@name='ProductName']")
	private WebElement productNameField_PO;

	public WebElement productNamePO() {
		return productNameField_PO;
	}

	// Variant number
	@FindBy(xpath = "//input[contains(@id,'PurchLine_VariantId')]")
	private WebElement variantNumberField1;

	public WebElement variantNumberPO() {
		return variantNumberField1;
	}

	// Inventory Item
	@FindBy(xpath = "//input[contains(@id,'PurchLine_AcxItemId')]")
	private WebElement inventoryItemField_PO;

	public WebElement inventoryItemPO() {
		return inventoryItemField_PO;
	}

	// Inventory Variant Id
	@FindBy(xpath = "//input[contains(@id,'PurchLine_AcxVariantId')]")
	private WebElement inventoryVariantIdField_PO;

	public WebElement inventoryVariantIdPO() {
		return inventoryVariantIdField_PO;
	}

	// Quantity
	@FindBy(xpath = "(//div[contains(@id,'PurchLine_VariantId_')])[2]")
	private WebElement quantityField_PO;

	public WebElement quantityPO() {
		return quantityField_PO;
	}

	// Unit
	@FindBy(xpath = "//input[contains(@id,'PurchLine_PurchUnitGrid')]")
	private WebElement unitField_PO;

	public WebElement unitPO() {
		return unitField_PO;
	}

	// Unit price
	@FindBy(xpath = "//input[@name='UnitPrice']")
	private WebElement unitPriceField_PO;

	public WebElement unitPricePO() {
		return unitPriceField_PO;
	}

	// Net amount
	@FindBy(xpath = "//input[@name='NetAmount']")
	private WebElement netAmountField_PO;

	public WebElement netAmountPO() {
		return netAmountField_PO;
	}

	// Purity
	@FindBy(xpath = "//input[contains(@id,'PurchLine_Purity')]")
	private WebElement purityField_;

	public WebElement purityPO() {
		return purityField_;
	}

	// PCS
	@FindBy(xpath = "//input[@name='PCS']")
	private WebElement pcsField_PO;

	public WebElement pcsPO() {
		return pcsField_PO;
	}

	// Annexure PO Lines button
	@FindBy(xpath = "//span[text()='Annexure PO Lines']")
	private WebElement annexurePOLinesButton;

	public WebElement annexurePOLinesButton() {
		return annexurePOLinesButton;
	}

	// AL_Item Id
	@FindBy(xpath = "//input[@name='ALItemId']")
	private WebElement alItemIdField;

	public WebElement alItemIdPO() {
		return alItemIdField;
	}

	// AL_Product Name
	@FindBy(xpath = "//input[@name='ALProductName']")
	private WebElement alProductNameField;

	public WebElement alProductName() {
		return alProductNameField;
	}

	// AL_Size Range
	@FindBy(xpath = "//input[contains(@id,'AcxAnnexurePOLines_SizeRange')]")
	private WebElement alSizeRangeField;

	public WebElement alSizeRange() {
		return alSizeRangeField;
	}

	// AL_Weight Range
	@FindBy(xpath = "//input[contains(@id,'AcxAnnexurePOLines_WtRange')]")
	private WebElement alFromWeight;

	public WebElement alFromWeight() {
		return alFromWeight;
	}

	// AL_Weight Range
	@FindBy(xpath = "//input[contains(@id,'AcxAnnexurePOLines_WtRange')]")
	private WebElement aiToWeight;

	public WebElement aiToWeight() {
		return aiToWeight;
	}

	// AL_Exact Wt.
	@FindBy(xpath = "//input[@name='ALExactWt']")
	private WebElement alExactWtField;

	public WebElement alExactWt() {
		return alExactWtField;
	}

	// aiToPurity
	@FindBy(xpath = "//input[contains(@id,'AcxAnnexurePOLines_WtRange')]")
	private WebElement alToPurity;

	public WebElement alToPurity() {
		return alToPurity;
	}

	// aiFromPurity.
	@FindBy(xpath = "//input[@name='ALExactWt']")
	private WebElement alFromPurity;

	public WebElement alFromPurity() {
		return alFromPurity;
	}

	// AL_Pcs
	@FindBy(xpath = "//input[contains(@id,'AcxAnnexurePOLines_WtRange')]")
	private WebElement alPcsField;

	public WebElement alPcs() {
		return alPcsField;
	}

	// AL_Qty
	@FindBy(xpath = "//input[@name='ALQty']")
	private WebElement alQtyField;

	public WebElement alQty() {
		return alQtyField;
	}

	// Delivery Schedule Button
	@FindBy(xpath = "//span[text()='Delivery Schedule']")
	private WebElement deliveryScheduleButton;

	public WebElement deliveryScheduleButton() {
		return deliveryScheduleButton;
	}

	// DS_Delivery date
	@FindBy(xpath = "//input[contains(@id,'AcxDeliverySchedule_DeliveryDate_')]")
	private WebElement dsDeliveryDateField;

	public WebElement dsDeliveryDate() {
		return dsDeliveryDateField;
	}

	// DS_Pcs
	@FindBy(xpath = "//input[contains(@id,'AcxDeliverySchedule_Pcs_')]")
	private WebElement dsPcsField;

	public WebElement dsPcs() {
		return dsPcsField;
	}

	// AL_Pcs
	@FindBy(xpath = "//input[@name='SystemDefinedCloseButton']")
	private WebElement SystemDefinedCloseButton;

	public WebElement BackButtonPO() {
		return SystemDefinedCloseButton;
	}

	// DS_Annexure line No
	@FindBy(xpath = "//input[@name='DSAnnexureLineNo']")
	private WebElement dsAnnexureLineNoField;

	public WebElement dsAnnexureLineNo() {
		return dsAnnexureLineNoField;
	}

	// purchase Confirm on Main page
	@FindBy(xpath = "//button[contains(@id,'purchtablelistpage') and contains(@id,'Purchase_button')]")
	private WebElement purchaseConfirm_Shtr;

	public WebElement purchaseConfirmShtr() {
		return purchaseConfirm_Shtr;
	}

	// purchase Confirm on Main page
	@FindBy(xpath = "//span[contains(@id,'purchtablelistpage_') and contains(@id,'_buttonConfirm_label')]")
	private WebElement purchaseOK_Shtr;

	public WebElement purchaseOKcnf() {
		return purchaseOK_Shtr;
	}

	// ---Webelement of new button
	@FindBy(xpath = "//button[contains(@name, 'SystemDefinedNewButton')]")
	private WebElement new_buttonPO;

	public WebElement NewBtnPO() {
		return new_buttonPO;
	}

	@FindBy(name = "SystemDefinedSaveButton")
	private WebElement Save_Bds;

	public WebElement SaveButtonDS() {
		return Save_Bds;
	}

	@FindBy(name = "PurchTable_PurchaseType")
	private WebElement purchType;

	public WebElement purchaseType() {
		return purchType;
	}
//_______________________________________________________________________________________________________________________

//	Login
	@FindBy(id = "otherTileText")
	private WebElement anotherAct;

	public WebElement anotherAccount() {
		return anotherAct;
	}

	@FindBy(id = "i0116")
	private WebElement email;

	public WebElement enterEmail() {
		return email;
	}

	@FindBy(xpath = "//input[@value='Next']")
	private WebElement nxtbtn;

	public WebElement nextBtn() {
		return nxtbtn;
	}

	@FindBy(id = "i0118")
	private WebElement pwd;

	public WebElement enterPwd() {
		return pwd;
	}

	@FindBy(xpath = "//input[@value='Sign in']")
	private WebElement signin;

	public WebElement signInBtn() {
		return signin;
	}

	@FindBy(xpath = "//input[@value='Yes']")
	private WebElement yesbtn;

	public WebElement yesBtn() {
		return yesbtn;
	}

//	@FindBy(id = "navPaneModuleID")
//	private WebElement module;
//
//	public WebElement modules() {
//		return module;
//	}

	@FindBy(xpath = "//a[text()='Product information management']")
	private WebElement productInfo;

	public WebElement productInfoManage() {
		return productInfo;
	}

	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expnd;

	public WebElement poexpandAll() {
		return expnd;
	}

	@FindBy(xpath = "//a[text()='Released products']")
	private WebElement products;

	public WebElement releaseProd() {
		return products;
	}

	@FindBy(xpath = "//button[@name='SystemDefinedNewButton']")
	private WebElement newbtn;

	public WebElement add() {
		return newbtn;
	}

	@FindBy(xpath = "//input[@name='Types_ProductType']")
	private WebElement pdType;

	public WebElement productType() {
		return pdType;
	}

	@FindBy(xpath = "//input[@name='Types_ProductSubtype']")
	private WebElement pdsubType;

	public WebElement productSubType() {
		return pdsubType;
	}

	@FindBy(xpath = "//li[text()='Product master']")
	private WebElement prdMaster;

	public WebElement productMaster() {
		return prdMaster;
	}

	@FindBy(xpath = "//input[@name='Identification_ProductNumber']")
	private WebElement prodNum;

	public WebElement productNumber() {
		return prodNum;
	}

	@FindBy(xpath = "//input[@name='Identification_Name']")
	private WebElement prodName;

	public WebElement productName() {
		return prodName;
	}

	@FindBy(xpath = "//input[@name='Identification_SearchName']")
	private WebElement sname;

	public WebElement searchName() {
		return sname;
	}

	@FindBy(xpath = "//input[@name='ItemIdentification_ItemId']")
	private WebElement itemnum;

	public WebElement itemNumber() {
		return itemnum;
	}

	@FindBy(xpath = "//input[@name='ItemIdentification_NameAlias']")
	private WebElement nameAlias;

	public WebElement searchItem() {
		return nameAlias;
	}

	@FindBy(xpath = "//input[@name='CategoryReferenceGroup_Name']")
	private WebElement retailCat;

	public WebElement retailCategory() {
		return retailCat;
	}

	@FindBy(xpath = "//li[@aria-label='GOLD']")
	private WebElement goldopt;

	public WebElement gold() {
		return goldopt;
	}

	@FindBy(xpath = "(//button[@name='OKButton'])[2]")
	private WebElement okbtn;

	public WebElement ok() {
		return okbtn;
	}

	@FindBy(xpath = "//input[@name='ProductDimensionGroup_Name']")
	private WebElement prodDigrp;

	public WebElement productDimensionGroup() {
		return prodDigrp;
	}

	@FindBy(xpath = "//input[@name='VariantConfigurationTechnology']")
	private WebElement configTech;

	public WebElement configurationTechnology() {
		return configTech;
	}

	@FindBy(xpath = "//input[@name='ModelGroupId']")
	private WebElement modelitemGrp;

	public WebElement itemModelGroup() {
		return modelitemGrp;
	}

	@FindBy(xpath = "//input[@name='ItemGroupId']")
	private WebElement itemgrp;

	public WebElement itemGroup() {
		return itemgrp;
	}

	@FindBy(xpath = "//input[@name='StorageDimensionGroup_Name']")
	private WebElement storageDiName;

	public WebElement storageDimensionGroup() {
		return storageDiName;
	}

	@FindBy(xpath = "//input[@name='TrackingDimensionGroup_Name']")
	private WebElement trackingDiName;

	public WebElement trackingDimensionGroup() {
		return trackingDiName;
	}

	@FindBy(xpath = "//input[@name='BuyerGroupId']")
	private WebElement buyergrp;

	public WebElement buyerGroup() {
		return buyergrp;
	}

	@FindBy(xpath = "//input[@name='InventUnitId']")
	private WebElement inventory;

	public WebElement inventoryUnit() {
		return inventory;
	}

	@FindBy(xpath = "//input[@name='PurchUnitId']")
	private WebElement purch;

	public WebElement purchUnit() {
		return purch;
	}

	@FindBy(xpath = "//input[@name='SalesUnitId']")
	private WebElement sales;

	public WebElement salesUnit() {
		return sales;
	}

	@FindBy(xpath = "//input[@name='BOMUnitId']")
	private WebElement bom;

	public WebElement BOMUnit() {
		return bom;
	}

	@FindBy(xpath = "//button[@name='OKButton']")
	private WebElement okbutton;

	public WebElement okItem() {
		return okbutton;
	}

	@FindBy(xpath = "//span[text()='testing_gold : testing gold']")
	private WebElement itemTitle;

	public WebElement nameOfItem() {
		return itemTitle;
	}

//	Edit
	@FindBy(xpath = "//div[contains(@data-dyn-columnname,'InventTable_ItemIdGrid')]")
	private WebElement itmno;

	public WebElement itemNoCol() {
		return itmno;
	}

	@FindBy(xpath = "//input[@name='FilterField_InventTable_ItemIdGrid_ItemId_Input_0']")
	private WebElement filter;

	public WebElement filterdropdown() {
		return filter;
	}

	@FindBy(name = "InventTable_ItemIdGrid_ApplyFilters")
	private WebElement apply;

	public WebElement applyBtn() {
		return apply;
	}

	@FindBy(xpath = "//button[@name='SystemDefinedViewEditButton']")
	private WebElement edit;

	public WebElement editBtn() {
		return edit;
	}

	@FindBy(xpath = "//input[@value='testing_gold1' and contains(@id,'InventTable_ItemIdGrid')]")
	private WebElement itm;

	public WebElement selectItem() {
		return itm;
	}

	@FindBy(xpath = "//input[@name='AcxCustomeField_ItemTypeCode']")
	private WebElement itmcode;

	public WebElement itemTypeCode() {
		return itmcode;
	}

	@FindBy(xpath = "//span[contains(@id,'AcxCustomeField_PurityApplicable_toggle')]")
	private WebElement purityToggle;

	public WebElement purityApplicable() {
		return purityToggle;
	}

	@FindBy(xpath = "//input[@name='AcxCustomeField_CkClassificationType']")
	private WebElement ck;

	public WebElement ckClassification() {
		return ck;
	}

	@FindBy(xpath = "//input[@name='AcxInventTable_Purity']")
	private WebElement defpurity;

	public WebElement defaultPurity() {
		return defpurity;
	}

	@FindBy(xpath = "//button[@name='SystemDefinedSaveButton']")
	private WebElement save;

	public WebElement saveBtn() {
		return save;
	}

	@FindBy(xpath = "//button[@name='SystemDefinedCloseButton']")
	private WebElement back;

	public WebElement backButton() {
		return back;
	}

	@FindBy(xpath = "//button[@name='SystemDefinedDeleteButton']")
	private WebElement delete;

	public WebElement deleteBtn() {
		return delete;
	}

	@FindBy(xpath = "//button[@name='Yes']")
	private WebElement ok;

	public WebElement okBtn() {
		return ok;
	}

	@FindBy(xpath = "//a[text()='Product masters']")
	private WebElement pm;

	public WebElement prdctMaster() {
		return pm;
	}

	@FindBy(xpath = "//div[text()='Search name']")
	private WebElement searchN;

	public WebElement searchNamePm() {
		return searchN;
	}

	@FindBy(xpath = "//input[contains(@name,'FilterField_EcoResProduct_SearchName_SearchName_Input')]")
	private WebElement fltr;

	public WebElement filterPm() {
		return fltr;
	}

	@FindBy(xpath = "//button[contains(@name,'EcoResProduct_SearchName_ApplyFilters')]")
	private WebElement app;

	public WebElement applyPm() {
		return app;
	}

//	Item variants
	@FindBy(xpath = "//span[text()='Product dimensions']")
	private WebElement prdtD;

	public WebElement productDimensionsV() {
		return prdtD;
	}

	@FindBy(xpath = "//button[@name='NewConfiguration']")
	private WebElement newPd;

	public WebElement newBtnPd() {
		return newPd;
	}

	@FindBy(xpath = "//input[contains(@id,'EcoResConfiguration_Name')]")
	private WebElement confi;

	public WebElement configPd() {
		return confi;
	}

	@FindBy(xpath = "//div[contains(@id,'EcoResProductMasterConfiguration_Name') and @role='gridcell']")
	private WebElement confiName;

	public WebElement namePd() {
		return confiName;
	}

	@FindBy(xpath = "//span[text()='Released product variants']")
	private WebElement releasePd;

	public WebElement releaseProductV() {
		return releasePd;
	}

	@FindBy(xpath = "//button[contains(@id,'ActionPaneTabProductVariant_button')]")
	private WebElement pdVar;

	public WebElement prdVariantTab() {
		return pdVar;
	}

	@FindBy(xpath = "//span[contains(@id,'EcoResProductVariantPerCompanyMgr_label')]")
	private WebElement suggestions;

	public WebElement variantSuggestions() {
		return suggestions;
	}

	@FindBy(xpath = "//span[contains(@id,'SuggestAllButton_label')]")
	private WebElement suggAll;

	public WebElement suggestAll() {
		return suggAll;
	}

	@FindBy(xpath = "//span[contains(@id,'SelectAll_label')]")
	private WebElement slctAll;

	public WebElement selectAll() {
		return slctAll;
	}

	@FindBy(xpath = "//button[contains(@id,'CommandButtonOk')]")
	private WebElement crt;

	public WebElement createBtn() {
		return crt;
	}

	@FindBy(xpath = "//span[text()='Operation completed']")
	private WebElement msg;

	public WebElement succesMsg() {
		return msg;
	}

	@FindBy(xpath = "(//button[@aria-label='Close' and @name='SystemDefinedCloseButton'])[2]")
	private WebElement bck;

	public WebElement backPD() {
		return bck;
	}

	@FindBy(xpath = "//div[text()='Item number']")
	private WebElement itmNumberCol;

	public WebElement itemNumberCol() {
		return itmNumberCol;
	}

	@FindBy(name = "FilterField_InventTable_ItemIdGrid_ItemId_Input_0")
	private WebElement itmfil;

	public WebElement itemFilter() {
		return itmfil;
	}

	@FindBy(name = "AcxInventTable_ItemCategory")
	private WebElement itmCt;

	public WebElement itemCategory() {
		return itmCt;
	}

	@FindBy(name = "InventTable_ItemIdGrid_ResetFilters")
	private WebElement clr;

	public WebElement clearBtn() {
		return clr;
	}

	@FindBy(xpath = "//li[text()='Configurations']")
	private WebElement configTab;

	public WebElement configurationTab() {
		return configTab;
	}

	@FindBy(name = "NewConfiguration")
	private WebElement newconfig;

	public WebElement newConfiguration() {
		return newconfig;
	}

	@FindBy(xpath = "//input[contains(@id,'EcoResConfiguration_Name')]")
	private WebElement vrName;

	public WebElement variantName() {
		return vrName;
	}

//	@FindBy(xpath = "//button[text()='General']")
	@FindBy(xpath = "//button[contains(@id,'TabPageGeneral_caption')]")
	private WebElement gnral;

	public WebElement generalTab() {
		return gnral;
	}

	@FindBy(xpath = "//input[@name='GST_IN_HSNCodeTable_IN_Code']")
	private WebElement hsnCd;

	public WebElement hsnCodes() {
		return hsnCd;
	}

	@FindBy(xpath = "//span[text()='Expand all']")
	private WebElement expand1;

	public WebElement expandAllTabs() {
		return expand1;
	}

	@FindBy(xpath = "//input[@name='InventTable_PdsVendorCheckItem']")
	private WebElement approvedVd;

	public WebElement approvedVendor() {
		return approvedVd;
	}

	@FindBy(xpath = "//input[@name='AcxCustomeField_ItemTypeCode']")
	private WebElement itemTypeCust;

	public WebElement itemTypeCodeCustom() {
		return itemTypeCust;
	}

//	Variants
	@FindBy(xpath = "//button[contains(@id,'_ActionPaneTabDefine_button')]")
	private WebElement prdtTab;

	public WebElement productTab() {
		return prdtTab;
	}

	@FindBy(name = "AcxCustomeField_MakingServiceItem")
	private WebElement mkServiceItm;

	public WebElement makingServiceItem() {
		return mkServiceItm;
	}

	@FindBy(xpath = "//*[contains(@id,'_CategoryReferenceGroup')]/div/div[2]/div")
	private WebElement retailDrp;

	public WebElement retailDropdown() {
		return retailDrp;
	}

	@FindBy(name = "NameFilter_Input")
	private WebElement rtFilter;

	public WebElement retailFilter() {
		return rtFilter;
	}

}
