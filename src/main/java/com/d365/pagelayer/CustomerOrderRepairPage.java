package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.d365.utils.MasterClass;

public class CustomerOrderRepairPage extends MasterClass {
	public CustomerOrderRepairPage() {
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

// modules
	@FindBy(id = "navPaneModuleID")
	private WebElement module;

	public WebElement modules() {
		return module;
	}

//Jewellery master
	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement jewel;

	public WebElement selectJewellery() {
		return jewel;
	}

	@FindBy(xpath = "//a[text()='Customer Order Repair']")
	private WebElement CsOrder;

	public WebElement customerOrderRepairModule() {
		return CsOrder;
	}

	@FindBy(xpath = "(//span[contains(@id, 'acxdmicustomerrepairorder') and contains(@id, 'btnOrder')])[2]")
	private WebElement CnfOrder;

	public WebElement submit() {
		return CnfOrder;
	}

//	Addline Elements

	@FindBy(xpath = "//span[text()='Add line']")
	private WebElement addLineButton;

	public WebElement Add_Line() {
		return addLineButton;
	}
	
//expand All
	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expnd;

	public WebElement expandAll() {
		return expnd;
	}

	// ---Webelement of new button
	@FindBy(xpath = "//span[contains(@id, '_label') and contains(@class, 'button-label') and text()='New']")
	private WebElement new_button;

	public WebElement newButton() {
		return new_button;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderNo')]")
	private WebElement orderNoField;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderType')]")
	private WebElement orderTypeField;

	@FindBy(name = "AcxCustOrderHeader_CustAccount")
	private WebElement customerNoField;

	@FindBy(name = "AcxCustOrderHeader_SalesPerson")
	private WebElement salesPersonField;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_DeliveryDate')]")
	private WebElement deliveryDateField;

	@FindBy(name = "AcxCustOrderHeader_ManualOrderNo")
	private WebElement manualOrderNoField;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderCategory')]")
	private WebElement orderCategoryField;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderDate')]")
	private WebElement orderDateField;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_Store')]")
	private WebElement storeField;

//	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderStatus')]")
//	private WebElement orderStatusField;

	public WebElement Order_No() {
		return orderNoField;
	}

	public WebElement Order_Type() {
		return orderTypeField;
	}

	public WebElement customerNo() {
		return customerNoField;
	}

	public WebElement salesPerson() {
		return salesPersonField;
	}

	public WebElement deliveryDate() {
		return deliveryDateField;
	}

	public WebElement manualOrderNo() {
		return manualOrderNoField;
	}

	public WebElement Order_Category() {
		return orderCategoryField;
	}

	public WebElement Order_Date() {
		return orderDateField;
	}

	public WebElement Store() {
		return storeField;
	}

//	public WebElement Order_Status() {
//		return orderStatusField1;
//	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement SaveButton() {
		return Save_B;
	}

	@FindBy(xpath = "//button[contains(@name, 'SystemDefinedCloseButton')]")
	private WebElement BackBtn;

	public WebElement Back_Btn() {
		return BackBtn;
	}

	@FindBy(xpath = "(//div[text()='Order No.'])[1]")
	private WebElement TableHeader;

	public WebElement Table_Order() {
		return TableHeader;
	}

	@FindBy(xpath = "//input[contains(@id, '__FilterField_MainGrid_OrderNo_OrderNo_Input_') and contains(@id, '_input')]")
	private WebElement TableItemIdSearch;

	public WebElement Table_Order_Search() {
		return TableItemIdSearch;
	}

	@FindBy(id = "__MainGrid_OrderNo_ApplyFilters_label")
	private WebElement TableApply;

	public WebElement TableOrderApply() {
		return TableApply;
	}

	@FindBy(xpath = "//span[contains(@id, '_label') and contains(@data-dyn-bind, 'button-label') and text()='Edit']")
	private WebElement Edit;

	public WebElement Edit_btn() {
		return Edit;
	}

	@FindBy(xpath = "//span[contains(@id, 'acxpackingmaterialmaster') and contains(@id, '_SystemDefinedDeleteButton_label') and contains(@class, 'button-label')]")
	private WebElement Delete;

	public WebElement Delete_btn() {
		return Delete;
	}

	@FindBy(xpath = "//span[contains(@id, '_btnDelete_label')]")
	private WebElement deleteButtonLi;

	public WebElement DeleteLine() {
		return deleteButtonLi;
	}

	@FindBy(xpath = "//span[contains(@id, '_label') and text()='Yes']")
	private WebElement DeleteCfm;

	public WebElement Delete_Cfm_btn() {
		return DeleteCfm;
	}

	@FindBy(xpath = "//div[contains(@class, 'dyn-container') and contains(@class, '_ln972h') and contains(@class, 'dyn-svg-symbol')]")
	private WebElement select;

	public WebElement select_btn() {
		return select;
	}

	@FindBy(xpath = "//input[contains(@id, 'acxcustomerorder_') and contains(@id, '_AcxCustOrderHeader_OrderNo_input')]")
	private WebElement orderNoField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderType')]")
	private WebElement orderTypeField1;

	@FindBy(xpath = "//input[contains(@id, '_input') and @name='AcxCustOrderHeader_SalesPerson']")
	private WebElement salesPersonField1;

	@FindBy(xpath = "//input[contains(@id, '_input') and @name='AcxCustOrderHeader_DeliveryDate']")
	private WebElement deliveryDateField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderCategory')]")
	private WebElement orderCategoryField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderDate')]")
	private WebElement orderDateField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_Store')]")
	private WebElement storeField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_OrderStatus')]")
	private WebElement orderStatusField1;

	@FindBy(xpath = "//input[contains(@id, 'AcxPackingMaterialMaster_FranchiseEntity')]")
	private WebElement franchiseEntityField1;



	@FindBy(xpath = "//button[contains(@id, 'AcxPackingMaterialMaster_Delete')]")
	private WebElement deleteButton;

	public WebElement Delete() {
		return deleteButton;
	}

	@FindBy(xpath = "//button[contains(@id, 'AcxPackingMaterialMaster_Cancel')]")
	private WebElement cancelButton;

	public WebElement addLineCancelButton() {
		return cancelButton;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_LineNo_')]")
	private WebElement lineNoField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_ItemType_')]")
	private WebElement itemTypeField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_ItemId_')]")
	private WebElement itemIdField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_VariantId')]")
	private WebElement variantNumberField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_carat_')]")
	private WebElement purityField;
	
	public WebElement getItemIdField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_ItemId_') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement getPurityField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_carat_') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement getVariantNumberField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_VariantId') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement getRepairRemarksField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_RepairRemarks') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}
	public WebElement getCustomerItemPCSField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_CustomerItemPCS') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement getCustomerItemGrossWeightField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_CustomerItemGrossWeight') and contains(@id, '_input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}
	public WebElement getCustomerItemNetWeightField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_CustomerItemQty') and contains(@id, 'input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	public WebElement getOrderRateField(int rowIndex) {
	    String dynamicXPath = "(//input[contains(@id, 'LineGrid_OrderRate') and contains(@id, 'input')])[" + rowIndex + "]";
	    return driver.findElement(By.xpath(dynamicXPath));
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_CustomerItemPCS')]")
	private WebElement CustomerItemPCS;

	public WebElement customerItemPCS() {
		return CustomerItemPCS;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_CustomerItemGrossWeight')]")
	private WebElement CustomerItemGrossWeight;

	public WebElement customerItemGrossWeight() {
		return CustomerItemGrossWeight;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_CustomerItemQty') and contains(@id, 'input')]")
	private WebElement CustomerItemNetWeight;

	public WebElement customerItemNetWeight() {
		return CustomerItemNetWeight;
	}

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderRate')]")
	private WebElement orderRateField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderValue_')]")
	private WebElement orderValueField;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_DeliveryStore_') and contains(@id, '_input') and @aria-label='Delivery Store']")
	private WebElement deliveryStoreField;

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

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderDescription1')]")
	private WebElement orderDescription1Field;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderDescription2')]")
	private WebElement orderDescription2Field;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_RepairRemarks') and contains(@id, '_input')]")
	private WebElement RepairRemarks;

	@FindBy(xpath = "//input[contains(@id, 'LineGrid_OrderStatus_')]")
	private WebElement orderStatusField;

	public WebElement lineNo() {
		return lineNoField;
	}

	public WebElement itemType() {
		return itemTypeField;
	}

	public WebElement itemId() {
		return itemIdField;
	}

	public WebElement variantNumber() {
		return variantNumberField;
	}

	public WebElement purity() {
		return purityField;
	}

	public WebElement orderRate() {
		return orderRateField;
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

	public WebElement repairRemarks() {
		return RepairRemarks;
	}

	public WebElement Order_StatusLine() {
		return orderStatusField1;
	}

	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement noteButton;

	public WebElement notificationCloseBtn() {
		return noteButton;
	}
	@FindBy(xpath = "//input[contains(@id, 'LineGrid_') and contains(@id,'CustomerItemQty')]")
	private WebElement netweight;

	public WebElement enterNetWeight() {
		return netweight;
	}
	
	@FindBy(xpath = "//a[text()='Customer Repair Positive Batch']")
	private WebElement repairbatch;

	public WebElement clickCustomerRepairBatch() {
		return repairbatch;
	}
	
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement okbutton;

	public WebElement clickOkButton() {
		return okbutton;
	}
	@FindBy(xpath = "//span[contains(@id, 'SysOperationTemplateForm_') and contains(@id,'CommandButton_label')]")
	private WebElement navigationbar;

	public WebElement clickNavigationBar() {
		return navigationbar;
	}
	@FindBy(xpath = "//div[text()='Customer Repair Postive Batch ***']")
	
	private WebElement positivemessagetext;

	public WebElement checkPositiveBatch() {
		return positivemessagetext;
	}
	@FindBy(xpath = "//span[contains(@id, 'SysOperationTemplateForm_') and contains(@id,'CommandButtonCancel_label')]")
	private WebElement cancelbutton;

	public WebElement cancelbutton() {
		return cancelbutton;
	}
	@FindBy(xpath = "//a[text()='Customer Repair Batch Wise']")
	private WebElement repairbatchwise;

	public WebElement clickCustomerRepairBatchWise() {
		return repairbatchwise;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_BatchNo_') and contains(@id,'_input')]")
	private WebElement batchno;

	public WebElement checkBatchNo() {
		return batchno;
	}
	//@FindBy(xpath = "//div[contains(@id, 'Grid1_OrderNo_') and contains(@id,'header')]")
	@FindBy(xpath = "//div[text() = 'Order No.']")
	private WebElement ordernoheader;

	public WebElement clickOrderNoHeader() {
		return ordernoheader;
	}
	@FindBy(xpath = "//input[contains(@id, 'FilterField_Grid1_OrderNo_OrderNo_') and contains(@id,'input')]")
	private WebElement orderno1;

	public WebElement enterOrderNo() {
		return orderno1;
	}
	
	@FindBy(xpath = "//span[contains(@id, '__Grid1_OrderNo_ApplyFilters') and contains(@id,'_label')]")
	private WebElement applyfilter;

	public WebElement clickApplyFilter() {
		return applyfilter;
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
	@FindBy(xpath = "(//span[text()='Delete'])[1]")
	private WebElement delete;

	public WebElement deleteHButton() {
		return delete;
	}
	@FindBy(xpath = "//span[contains(@id, 'acxdmicustomerrepairorder') and contains(@id,'_AcxCustRepairTagReservationProcess_label')]")
	private WebElement tagreserve;

	public WebElement clickTagReserve() {
		return tagreserve;
	}
	@FindBy(xpath = "//span[contains(@id, 'acxdmicustomerrepairorder') and contains(@id,'_btnCancel_label')]")
	private WebElement cancel;

	public WebElement clickCancelButton() {
		return cancel;
	}
	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement edit;

	public WebElement editbutton() {
		return edit;
	}
	@FindBy(xpath = "//div[text()='Batch No.']")
	private WebElement batchn;

	public WebElement columnBatchNo() {
		return batchn;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_CustAccount') and contains(@id,'_input')]")
	private WebElement cusno;

	public WebElement checkCustomerNo() {
		return cusno;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_GrossOrderQty') and contains(@id,'_input')]")
	private WebElement grossweight;

	public WebElement checkGrossWeight() {
		return grossweight;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_ItemType') and contains(@id,'_input')]")
	private WebElement itemtype;

	public WebElement checkItemType() {
		return itemtype;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_M_OrderDate') and contains(@id,'_input')]")
	private WebElement orderdate1;

	public WebElement checkOrderDate() {
		return orderdate1;
	}
	@FindBy(xpath = "//input[contains(@id, 'Grid1_OrnamentCategoryCode') and contains(@id,'_input')]")
	private WebElement itemcategory;

	public WebElement checkItemCategory() {
		return itemcategory;
	}
	@FindBy(name = "AcxCustOrderHeader_OrderDate")
	private WebElement orderdate;

	public WebElement validateOrderdate() {
		return orderdate;
	}
	@FindBy(xpath = "//input[contains(@id,'acxdmicustomerrepairorder')and contains(@id,'_AcxCustOrderHeader_OrderStatus_input')]")
	private WebElement orderstatus;
	public WebElement getOrderStatus() {
		return orderstatus;
	}
	 @FindBy(xpath = "//span[contains(@id,'acxdmicustomerrepairorder')and contains(@id,'_btnCancel_label')]")
	   private WebElement cancelno;
		public WebElement checkCancelNo() {
			return cancelno;
		}
		

		@FindBy(xpath = "//span[text()='Tag Reservation']")
		private WebElement reservetag;

		public WebElement clickReserveTagButton() {
			return reservetag;
		}
		
//		@FindBy(xpath = "//li[contains(@id,'acxdmicustomerrepairorder_')and contains(@id,'TagReservation_header')]")
		@FindBy(xpath="//span[text()='Reserved TAG']")
		private WebElement tagreserveheader;
 
		public WebElement clickTagReservedHeader() {
			return tagreserveheader;
		}

		@FindBy(xpath = "//input[contains(@id,'TA_TagReservations_ReservationTagNo_')and contains(@id,'_input')]")

		private WebElement reservetagno;

		public WebElement getReservedTagNo() {
			return reservetagno;
		}


		@FindBy(xpath = "//span[contains(@id,'acxdmicustomerrepairorder')and contains(@id,'_btnDeleteCopy1_label')]")
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
		
		@FindBy(xpath = "//input[contains(@id,'acxdmicustomerrepairorder')and contains(@id,'_AcxCustOrderHeader_OrderType_input')]")
		private WebElement ordertype;

		public WebElement checkOrderType() {
			return ordertype;
		}

		@FindBy(xpath = "//input[contains(@id,'acxdmicustomerrepairorder')and contains(@id,'_AcxCustOrderHeader_OrderCategory_input')]")
		private WebElement ordercategory;

		public WebElement checkOrderCategory() {
			return ordercategory;
		}
			
}

