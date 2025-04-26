package com.d365.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class CustomerOrderPage extends MasterClass {
	public CustomerOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Login
	@FindBy(id = "otherTileText")
	private WebElement anotherAct;

	public WebElement anotherAccount() {
		return anotherAct;
	}

	// email
	@FindBy(id = "i0116")
	private WebElement email;

	public WebElement enterEmail() {
		return email;
	}

//	next button
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement nxtbtn;

	public WebElement nextBtn() {
		return nxtbtn;
	}

// password
	@FindBy(id = "i0118")
	private WebElement pwd;

	public WebElement enterPwd() {
		return pwd;
	}

//sign in button
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

	@FindBy(id = "navPaneModuleID")
	private WebElement module;

	public WebElement modules() {
		return module;
	}

	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement expandNotification;

	public WebElement expandNotificationBtn() {
		return expandNotification;
	}

//	@FindBy(xpath = "//span[contains(@id,'SysBoxForm') and contains(@id,'Close_label')]")
//	WebElement errorClose;
//
//	public WebElement errorCloseButton() {
//		return errorClose;
//	}

	@FindBy(name = "Close")
	WebElement errorClose;

	public WebElement errorCloseButton() {
		return errorClose;
	}

	// ---Webelement of new button
	@FindBy(name = "SystemDefinedNewButton")
	private WebElement new_button;

	public WebElement newButton() {
		return new_button;
	}

//Jewellery master
	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement jewellery;

	public WebElement selectJewellery() {
		return jewellery;
	}

	@FindBy(xpath = "//a[text()='Customer Order']")
	private WebElement CsOrder;

	public WebElement customerOrderModule() {
		return CsOrder;
	}

	@FindBy(xpath = "//span[text()='Generate Line']")
	private WebElement generateline;

	public WebElement clickGenerateLine() {
		return generateline;
	}

	@FindBy(xpath = "//span[text()='Line Generated.']")
	private WebElement generatelinemsg;

	public WebElement validateGenerateLineMsg() {
		return generatelinemsg;
	}

	@FindBy(name = "btnOrder")
	private WebElement CnfOrder;

	public WebElement confirmOrder() {
		return CnfOrder;
	}

	@FindBy(xpath = "//span[text()='Tag Reservation']")
	private WebElement tagreserveb;

	public WebElement tagReservedButton() {
		return tagreserveb;
	}

	@FindBy(xpath = "//span[contains(@id, '_btnOpen_label') and text()='ReOpen']")
	private WebElement reopnOrder;

	public WebElement reopenOrder() {
		return reopnOrder;
	}

	@FindBy(xpath = "//span[contains(@id, '_btnCancel_label') and text()='Cancel']")
	private WebElement cnlOrder;

	public WebElement cancelOrder() {
		return cnlOrder;
	}

//expand All
	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expnd;

	public WebElement expandAll() {
		return expnd;
	}

	@FindBy(xpath = "//input[contains(@id, '_AcxCustOrderHeader_OrderNo_input')]")
	private WebElement orderNoField;

	public WebElement Order_No() {
		return orderNoField;
	}

	@FindBy(xpath = "//input[contains(@name,'AcxCustOrderHeader_OrderType') and contains(@id, '_AcxCustOrderHeader_OrderType_input')]")
	private WebElement orderTypeField;

	public WebElement Order_Type() {
		return orderTypeField;
	}

	@FindBy(xpath = "//input[contains(@name, 'AcxCustOrderHeader_CustAccount')]")
	private WebElement customerNoField;

	public WebElement Customer_No() {
		return customerNoField;
	}

	@FindBy(xpath = "//input[contains(@name, 'AcxCustOrderHeader_SalesPerson')]")
	private WebElement salesPersonField;

	public WebElement salesPerson() {
		return salesPersonField;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_DeliveryDate')]")
	private WebElement deliveryDateField;

	public WebElement deliveryDate() {
		return deliveryDateField;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_ManualOrderNo')]")
	private WebElement manualOrderNoField;

	public WebElement manualOrderNo() {
		return manualOrderNoField;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderCategory')]")
	private WebElement orderCategoryField;

	public WebElement orderCategory() {
		return orderCategoryField;
	}

	@FindBy(xpath = "//input[contains(@id, '_AcxCustOrderHeader_OrderDate_input')]")
	private WebElement orderDateField;

	public WebElement orderDate() {
		return orderDateField;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_Store')]")
	private WebElement storeField;

	public WebElement store() {
		return storeField;
	}

	@FindBy(name = "AcxCustOrderHeader_OrderDate")
	private WebElement orderdate;

	public WebElement validateOrderdate() {
		return orderdate;
	}

	@FindBy(xpath = "//input[contains(@id, '_AcxCustOrderHeader_OrderStatus_input')]")
	private WebElement orderStatusFieldH;

	public WebElement orderStatusHeader() {
		return orderStatusFieldH;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_FranchiseEntity')]")
	private WebElement franchiseEntityField;

	public WebElement franchiseEntity() {
		return franchiseEntityField;
	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement saveButton() {
		return Save_B;
	}

	@FindBy(xpath = "(//span[text()='Delete'])[1]")
	private WebElement delete;

	public WebElement deleteHButton() {
		return delete;
	}

	@FindBy(xpath = "//span[text()='Tag Reservation']")
	private WebElement reservetag;

	public WebElement clickReserveTagButton() {
		return reservetag;
	}

	@FindBy(xpath = "(//div[@role='presentation' and contains(@class, 'lookupDock-buttonContainer')])[22]")
	private WebElement SalePersonDropDown;

	public WebElement clickSalePersonDropDown() {
		return SalePersonDropDown;
	}

	@FindBy(xpath = "//span[contains(@class, 'button-commandRing') and contains(@class, 'Back-symbol') and contains(@data-dyn-bind, 'img: $dyn.ui.img($data)') and @data-dyn-image-type='Symbol']")
	private WebElement BackBtn;

	public WebElement backBtn() {
		return BackBtn;
	}

	@FindBy(xpath = "(//div[text()='Order No.'])[1]")
	private WebElement TableHeader;

	public WebElement tableOrder() {
		return TableHeader;
	}

	@FindBy(xpath = "//input[contains(@id, '__FilterField_MainGrid_OrderNo_OrderNo_Input_') and contains(@id, '_input')]")
	private WebElement TableItemIdSearch;

	public WebElement tableOrderSearch() {
		return TableItemIdSearch;
	}

	@FindBy(id = "__MainGrid_OrderNo_ApplyFilters_label")
	private WebElement TableApply;

	public WebElement tableOrderApply() {
		return TableApply;
	}

	@FindBy(xpath = "//span[contains(@id, '_label') and contains(@data-dyn-bind, 'button-label') and text()='Edit']")
	private WebElement Edit;

	public WebElement editButton() {
		return Edit;
	}

	@FindBy(xpath = "//span[contains(@id, 'acxpackingmaterialmaster') and contains(@id, '_SystemDefinedDeleteButton_label') and contains(@class, 'button-label')]")
	private WebElement Delete;

	public WebElement deleteButton() {
		return Delete;
	}

	@FindBy(xpath = "//span[contains(@id, '_label') and text()='Yes']")
	private WebElement deleteCfm;

	public WebElement deleteConfirmButton() {
		return deleteCfm;
	}

	@FindBy(xpath = "//div[contains(@class, 'dyn-container') and contains(@class, '_ln972h') and contains(@class, 'dyn-svg-symbol')]")
	private WebElement select;

	public WebElement selectButton() {
		return select;
	}

	@FindBy(name = "MainQuickFilter_Input")
	private WebElement filter;

	public WebElement searchFilterButton() {
		return filter;
	}

	@FindBy(name = "AcxCustOrderHeader_OrderNo")
	private WebElement cusorderno;

	public WebElement getCustomerNo() {
		return cusorderno;
	}

	@FindBy(name = "SystemDefinedCloseButton")
	private WebElement backbutton;

	public WebElement clickBackButton() {
		return backbutton;
	}

	@FindBy(xpath = "//span[text()='Order No.']")
	private WebElement orderno;

	public WebElement clickOrderNo() {
		return orderno;
	}

	@FindBy(xpath = "//input[contains(@id, 'acxcustomerorder_') and contains(@id, '_AcxCustOrderHeader_OrderNo_input')]")
	private WebElement orderNoField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderType')]")
	private WebElement orderTypeField1;

	@FindBy(name = "AcxCustOrderHeader_SalesPerson")
	private WebElement salesPersonField1;

	@FindBy(xpath = "//input[contains(@id, '_input') and @name='AcxCustOrderHeader_DeliveryDate']")
	private WebElement deliveryDateField1;

	@FindBy(xpath = "//*[@id=\"acxcustomerorder_2_AcxCustOrderHeader_OrderCategory_input\"]")
	private WebElement orderCategoryField12;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderDate')]")
	private WebElement orderDateField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_Store')]")
	private WebElement storeField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderStatus')]")
	private WebElement orderStatusField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_FranchiseEntity')]")
	private WebElement franchiseEntityField1;

	@FindBy(name = "AcxCustOrderHeader_CustAccount")
	private WebElement customerNoField1;

	public WebElement customerNo() {
		return customerNoField1;
	}

	@FindBy(xpath = "//input[contains(@name,'AcxCustOrderHeader_ManualOrderNo')]")
	private WebElement manualOrderNoField1;

	public WebElement orderStatus() {
		return orderStatusField1;
	}

//	Addline Elements

	@FindBy(xpath = "//span[text()='Add line']")
	private WebElement addLineButton;

	public WebElement addLineButton() {
		return addLineButton;
	}
	

	@FindBy(xpath = "//span[contains(@id, '_btnDelete_label')]")
	private WebElement deleteButtonLi;

	public WebElement DeleteLine() {
		return deleteButtonLi;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder_')and contains(@id,'_btnCancelLine_label')]")
	private WebElement cancelButton;

	public WebElement Cancel() {
		return cancelButton;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_LineNum_')]")
	private WebElement lineNoField;

	@FindBy(xpath = "//input[contains(@id,'LineGrid_ItemType_')]")
	private WebElement itemTypeField;

//	public WebElement itemId() {
//	return itemIdField;
//}
//
//public WebElement variantNumber() {
//	return variantNumberField;
//}
//
//public WebElement purity() {
//	return purityField;
//}
//
//public WebElement orderPcs() {
//	return orderPcsField;
//}
	public WebElement AddLineItemIdFiel(int rowIndex) {
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_ItemId_') and contains(@id, 'input')])[" + rowIndex
				+ "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement AddLineVariantNumber(int rowIndex) {
		// Dynamically construct the XPath with rowIndex
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_VariantId')])[" + rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	// Dynamic method for 'purityField'
	public WebElement purity(int rowIndex) {
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_carat_')])[" + rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	// Dynamic method for 'orderPcsField'
	public WebElement orderPcs(int rowIndex) {
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_OrderPcs_')])[" + rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	// Dynamic method for 'deliveryStoreField'
	public WebElement deliveryStore(int rowIndex) {
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store'])["
				+ rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	// Dynamic method for 'grossOrderQtyField'
	public WebElement grossOrderQty(int rowIndex) {
		String dynamicXPath = "(//input[contains(@id, 'LineGrid_OrderQty_') and contains(@id, '_input') and @aria-label='Gross Order Qty'])["
				+ rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}
//	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderQty_') and contains(@id, '_input') and @aria-label='Gross Order Qty']")
//	private WebElement grossOrderQtyField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_NetOrderQty_') and contains(@id, '_input') and @aria-label='Net Order Qty']")
	private WebElement netOrderQtyField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_FineOrderQty_')]")
	private WebElement fineOrderQtyField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderRate_')]")
	private WebElement orderRateField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderSize_') and contains(@id, '_input') and @aria-label='Order Size']")
	private WebElement orderSizeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_MakingCharge') and contains(@id, '_input')]")
	private WebElement makingChargeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_MakingRate_') and contains(@id, '_input') and @aria-label='Making Rate']")
	private WebElement makingrate;

	public WebElement makingRate() {
		return makingrate;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder_')and contains(@id,'_btnCancelLine_label')]")
	private WebElement cancelButtonli;

	public WebElement cancelLI() {
		return cancelButtonli;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderValue_')]")
	private WebElement orderValueField;

//	@FindBy(xpath = "//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store']")
//	private WebElement deliveryStoreField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_MetalValue_')]")
	private WebElement metalValueField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_BatchNo_')]")
	private WebElement batchNoField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_ReservationTagNo_')]")
	private WebElement reservationTagNoField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_ReservationTagDate_')]")
	private WebElement reservationTagDateField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_AstrologerCode_') and contains(@id, '_input') and @aria-label='Astrologer Code']")
	private WebElement astrologerCodeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_SalesPersonCode_')]")
	private WebElement salesPersonCodeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderDescription1_')]")
	private WebElement orderDescription1Field;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderDescription2_')]")
	private WebElement orderDescription2Field;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrnamentCategoryCode_')]")
	private WebElement ornamentCategoryCodeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OramentSubCategoryCode_') and contains(@id, '_input') and @aria-label='Ornament Sub-Category Code']")
	private WebElement ornamentSubCategoryCodeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_CollectionCode_') and contains(@id, '_input') and @aria-label='Collection Code']")
	private WebElement collectionCodeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderStatus_')]")
	private WebElement orderStatusField;

	public WebElement lineNo() {
		return lineNoField;
	}

	public WebElement itemType() {
		return itemTypeField;
	}

//	public WebElement grossOrderQty() {
//		return grossOrderQtyField;
//	}

	public WebElement netOrderQty() {
		return netOrderQtyField;
	}

	public WebElement fineOrderQty() {
		return fineOrderQtyField;
	}

	public WebElement orderRate() {
		return orderRateField;
	}

	public WebElement orderSize() {
		return orderSizeField;
	}

	public WebElement makingCharge() {
		return makingChargeField;
	}

	public WebElement orderValue() {
		return orderValueField;
	}

//	public WebElement deliveryStore() {
//		return deliveryStoreField;
//	}

	public WebElement metalValue() {
		return metalValueField;
	}

	public WebElement batchNo() {
		return batchNoField;
	}

	public WebElement reservationTagNo() {
		return reservationTagNoField;
	}

	public WebElement reservationTagDate() {
		return reservationTagDateField;
	}

	public WebElement astrologerCode() {
		return astrologerCodeField;
	}

	public WebElement salesPersonCode() {
		return salesPersonCodeField;
	}

	public WebElement orderDescription1() {
		return orderDescription1Field;
	}

	public WebElement orderDescription2() {
		return orderDescription2Field;
	}

	public WebElement ornamentCategoryCode() {
		return ornamentCategoryCodeField;
	}

	public WebElement ornamentSubCategoryCode() {
		return ornamentSubCategoryCodeField;
	}

	public WebElement collectionCode() {
		return collectionCodeField;
	}

	public WebElement orderStatusLine() {
		return orderStatusField;
	}

	@FindBy(xpath = "//input[contains(@id,'LineGrid_StoneAmount_')]")
	private WebElement stoneAmount;

	public WebElement stoneAmount() {
		return stoneAmount;
	}

	@FindBy(xpath = "//input[contains(@id,'LineGrid_MetalValue_')]")
	private WebElement wastage_Code;

	public WebElement wastageCode() {
		return wastage_Code;
	}

	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement noteButton;

	public WebElement notificationCloseButton() {
		return noteButton;
	}

	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement noteOpenButton;

	public WebElement notificationOpenButton() {
		return noteOpenButton;
	}

	@FindBy(xpath = "//span[contains(@id,'SysBoxForm_')	and contains(@id,'_Ok_label')]")
	private WebElement cnfBtn;

	public WebElement confirmPOPupButton() {
		return cnfBtn;
	}

	@FindBy(xpath = "//span[text()='Only Confirmed Order Can be Cancelled.']")
	private WebElement error;

	public WebElement orderErrorMessage() {
		return error;
	}

//	// Method to dynamically locate the Item Id field based on line index
//	public WebElement getItemIdField1(int lineIndex) {
//		String xpath = String.format("(//input[contains(@id, 'LineGrid_ItemId_') and contains(@id, 'input')])[%d]",
//				lineIndex);
//		return driver.findElement(By.xpath(xpath));
//	}

	// Method to dynamically locate the Variant Number field based on line index
	public WebElement getVariantNumberField1(int lineIndex) {
		String xpath = String.format("(//input[contains(@id, 'LineGrid_VariantId')])[%d]", lineIndex);
		return driver.findElement(By.xpath(xpath));
	}

	// Method to dynamically locate the Purity field based on line index
	@FindBy(xpath = "//input[contains(@id,'LineGrid_ItemId_') and contains(@id,'_input')]")
	private WebElement itemIdField1;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_ItemId_') and contains(@id, 'input')])[2]")
	private WebElement itemIdField2;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_ItemId_') and contains(@id, 'input')])[3]")
	private WebElement itemIdField3;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_VariantId')])[1]")
	private WebElement variantNumberField1;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_VariantId')])[2]")
	private WebElement variantNumberField2;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_VariantId')])[3]")
	private WebElement variantNumberField3;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_carat_')])[1]")
	private WebElement purityField1;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_carat_')])[2]")
	private WebElement purityField2;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_carat_')])[3]")
	private WebElement purityField3;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderPcs_')])[1]")
	private WebElement orderPcsField1;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderPcs_')])[2]")
	private WebElement orderPcsField2;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderPcs_')])[3]")
	private WebElement orderPcsField3;

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderQty_') and contains(@id, '_input') and @aria-label='Gross Order Qty'])[1]")
	private WebElement grossOrderQtyField1;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderQty_') and contains(@id, '_input') and @aria-label='Gross Order Qty'])[2]")
	private WebElement grossOrderQtyField2;
	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_OrderQty_') and contains(@id, '_input') and @aria-label='Gross Order Qty'])[3]")
	private WebElement grossOrderQtyField3;

	public WebElement itemId1() {
		return itemIdField1;
	}

	public WebElement itemId2() {
		return itemIdField2;
	}

	public WebElement itemId3() {
		return itemIdField3;
	}

	public WebElement variantNumber1() {
		return variantNumberField1;
	}

	public WebElement variantNumber2() {
		return variantNumberField2;
	}

	public WebElement variantNumber3() {
		return variantNumberField3;
	}

	public WebElement purity1() {
		return purityField1;
	}

	public WebElement purity2() {
		return purityField2;
	}

	public WebElement purity3() {
		return purityField3;
	}

	public WebElement orderPcs1() {
		return orderPcsField1;
	}

	public WebElement orderPcs2() {
		return orderPcsField2;
	}

	public WebElement orderPcs3() {
		return orderPcsField3;
	}

	public WebElement grossOrderQty1() {
		return grossOrderQtyField1;
	}

	public WebElement grossOrderQty2() {
		return grossOrderQtyField2;
	}

	public WebElement grossOrderQty3() {
		return grossOrderQtyField3;
	}

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store'])[1]")
	private WebElement deliveryStoreField1;

	public WebElement deliveryStore1() {
		return deliveryStoreField1;
	}

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store'])[2]")
	private WebElement deliveryStoreField2;

	public WebElement deliveryStore2() {
		return deliveryStoreField2;
	}

	@FindBy(xpath = "(//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store'])[3]")
	private WebElement deliveryStoreField3;

	public WebElement deliveryStore3() {
		return deliveryStoreField3;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder_')and contains(@id,'AcxCustOrderTagReservationProcess_label')]")
	private WebElement reservebutton;

	public WebElement clickReservedButton() {
		return reservebutton;
	}
//	@FindBy(xpath = "//input[contains(@id,'Dialog_')and contains(@id,'Fld1_1_input')]")
//	private WebElement tagno;
//	public WebElement enterTagNo() {
//		return tagno;
//	}

	@FindBy(xpath = "(//input[contains(@id,'Dialog_') and contains(@id,'_Fld')])[1]")
	private WebElement tagno;

	public WebElement enterTagNo() {
		return tagno;
	}

	@FindBy(xpath = "//input[contains(@id,'Dialog_')and contains(@id,'Fld3_1_input')]")
	private WebElement astrologer;

	public WebElement enterAstrologer() {
		return astrologer;
	}

	@FindBy(xpath = "(//input[contains(@id,'Dialog_') and contains(@id,'_Fld')])[2]")
	private WebElement salesperson;

	public WebElement enterSalesPerson() {
		return salesperson;
	}

	@FindBy(xpath = "//span[text()='OK']")

	private WebElement okbutton;

	public WebElement clickOkButtonTagReservation() {
		return okbutton;
	}

	@FindBy(xpath = "//li[contains(@id,'acxcustomerorder_')and contains(@id,'TagReservation_header')]")
	private WebElement tagreserveheader;

	public WebElement clickTagReservedHeader() {
		return tagreserveheader;
	}

	@FindBy(xpath = "//input[contains(@id,'TA_TagReservations_ReservationTagNo_')and contains(@id,'_input')]")

	private WebElement reservetagno;

	public WebElement getReservedTagNo() {
		return reservetagno;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder')and contains(@id,'_btnCancel_label')]")
	private WebElement cancelno;

	public WebElement checkCancelNo() {
		return cancelno;
	}

	@FindBy(xpath = "//input[contains(@id,'MainQuickFilter_Input_input')and contains(@id,'MainQuickFilter_Input_input')]")
	private WebElement filterh;

	public WebElement enterCusOrder() {
		return filterh;
	}

	@FindBy(xpath = "(//input[contains(@id,'MainGrid_OrderNo')and contains(@id,'_input')])")
	private WebElement enter_cusor;

	public WebElement clickCusOrder() {
		return enter_cusor;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder')and contains(@id,'_btnDeleteCopy1_label')]")
	private WebElement unresetag;

	public WebElement clickUnreserveTag() {
		return unresetag;
	}

	@FindBy(xpath = "//a[text()='Customer Order']")
	private WebElement customerorder;

	public WebElement clickCustomerOrder() {
		return customerorder;
	}

	@FindBy(xpath = "//span[contains(@id,'SysBoxForm_')and contains(@id,'_Yes_label')]")
	private WebElement yesbutton;

	public WebElement clickYesButton() {
		return yesbutton;
	}

	@FindBy(xpath = "//li[contains(@id,'acxcustomerorder')and contains(@id,'_MainQuickFilter_listbox_item0')]")
	private WebElement cusorderselect;

	public WebElement selectCustomerOrder() {
		return cusorderselect;
	}

	@FindBy(xpath = "//input[contains(@id,'acxcustomerorder')and contains(@id,'_AcxCustOrderHeader_OrderType_input')]")
	private WebElement ordertype;

	public WebElement checkOrderType() {
		return ordertype;
	}

	@FindBy(xpath = "//input[contains(@id,'acxcustomerorder')and contains(@id,'_AcxCustOrderHeader_OrderCategory_input')]")
	private WebElement ordercategory;

	public WebElement checkOrderCategory() {
		return ordercategory;
	}

	@FindBy(xpath = "//li[contains(@id,'acxcustomerorder')and contains(@id,'_CustomerOrderPreTagLines_header')]")
	private WebElement cuspretagheader;

	public WebElement clickPretagHeader() {
		return cuspretagheader;
	}

	@FindBy(xpath = "//span[contains(@id,'acxcustomerorder')and contains(@id,'_CmdBtnNewTagLine_label')]")
	private WebElement newb;

	public WebElement clickNewH() {
		return newb;
	}

	@FindBy(xpath = "(//input[contains(@id,'PreTagLines_ItemId')and contains(@id,'_input')])[2]")
	private WebElement itemidh;

	public WebElement enterItemidH() {
		return itemidh;
	}

	@FindBy(xpath = "(//input[contains(@id,'PreTagLines_VariantId')and contains(@id,'_input')])[2]")
	private WebElement varienth;

	public WebElement enterVarientH() {
		return varienth;
	}

	@FindBy(xpath = "(//input[contains(@id,'PreTagLines_Quantity')and contains(@id,'_input')])[2]")
	private WebElement quantityh;

	public WebElement enterQuantityH() {
		return quantityh;
	}

	@FindBy(xpath = "(//input[contains(@id,'PreTagLines_NoofStonePcs')and contains(@id,'_input')])[2]")
	private WebElement nos;

	public WebElement enterNosH() {
		return nos;
	}

	@FindBy(xpath = "//input[contains(@id,'acxcustomerorder')and contains(@id,'_AcxCustOrderHeader_OrderStatus_input')]")
	private WebElement orderstatus;

	public WebElement getOrderStatus() {
		return orderstatus;
	}

}
