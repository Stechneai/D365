package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class TransferOrderPageLot extends MasterClass {

	public TransferOrderPageLot() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Invent Transfer Barcode']")
	private WebElement tagscanotherclick;

	public WebElement clickOtherclick() {
		return tagscanotherclick;
	}

	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expnd;

	public WebElement expandAll() {
		return expnd;
	}

	@FindBy(name = "Close")
	WebElement errorClose;

	public WebElement errorCloseButton() {
		return errorClose;
	}

	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement expandNotification;

	public WebElement expandNotificationBtn() {
		return expandNotification;
	}

	@FindBy(xpath = "//Span[@class='workspace-image GroupedList-symbol']")
	private WebElement module;

	public WebElement clickModule() {
		return module;
	}

	@FindBy(xpath = "//a[text()='Inventory management']")
	private WebElement inventorymanagement;

	public WebElement clickInventoryManagement() {
		return inventorymanagement;

	}

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement home;

	public WebElement clickHome() {
		return home;

	}

	@FindBy(xpath = "//a[text()='Transfer order']")
	private WebElement transferorder;

	public WebElement clickTransferOrder() {
		return transferorder;
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement newtransferoder;

	public WebElement clickNewTransferOrder() {
		return newtransferoder;
	}

	@FindBy(name = "LineViewHeader_InventLocationIdFrom")
	private WebElement fromwarehouse;

	public WebElement enterFromWarehouse() {
		return fromwarehouse;
	}

	@FindBy(name = "LineViewHeader_InventLocationIdTo")
	private WebElement towarehouse;

	public WebElement enterToWarehouse() {
		return towarehouse;
	}

	@FindBy(xpath = "//span[text()='Transfer order']")
	private WebElement transferordericon;

	public WebElement clickTransferOrderIcon() {
		return transferordericon;
	}

	@FindBy(xpath = "//span[text()='Tag Scan']")
	private WebElement tagscan;

	public WebElement clickTagScan() {
		return tagscan;
	}

	@FindBy(name = "SeTag")
	private WebElement tagno;

	public WebElement enterTransTag() {
		return tagno;
	}

	@FindBy(xpath = "//span[text()='Generate Line']")
	private WebElement transgenerateline;

	public WebElement clickTransGenerateLine() {
		return transgenerateline;

	}

	@FindBy(xpath = "(//span[text()='Lines'])[2]")
	private WebElement lines;

	public WebElement clickLines() {
		return lines;

	}

	@FindBy(xpath = "//span[text()='Ship']")
	private WebElement ship;

	public WebElement clickship() {
		return ship;

	}

	@FindBy(xpath = "//span[text()='Ship transfer order']")
	private WebElement shiptransfer;

	public WebElement clickShipTransfer() {
		return shiptransfer;

	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement oksbutton;

	public WebElement clickOkSButton() {
		return oksbutton;
	}

	@FindBy(xpath = "(//span[text()='Receive'])[1]")
	private WebElement receive;

	public WebElement clickReceive() {
		return receive;

	}

	@FindBy(xpath = "(//span[text()='Receive'])[2]")
	private WebElement shipreceive;

	public WebElement clickShipReceive() {
		return shipreceive;

	}

	@FindBy(xpath = "//input[@value='All']")
	private WebElement receiveall;

	public WebElement enterReceiveAll() {
		return receiveall;
	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement okrbutton;

	public WebElement clickOkRButton() {
		return okrbutton;
	}

	@FindBy(name = "LineViewHeader_TransferType_IN_TransferType_IN") // enter transfer order or stock transfer
	private WebElement transfertype;

	public WebElement enterTransferType() {
		return transfertype;

	}

	@FindBy(xpath = "(//input[@title='Transfer order'])[1]") // enter transfer order or stock transfer
	private WebElement transferordertype;

	public WebElement validateTransferOrder() {
		return transferordertype;

	}

	@FindBy(xpath = "//input[@title='Stock transfer']") // enter transfer order or stock transfer
	private WebElement stocktransfertype;

	public WebElement validateStockTransfer() {
		return stocktransfertype;

	}

	@FindBy(name = "LineViewHeader_TransferStatus_TransferStatus") // verify transfer status
	private WebElement transferstatus;

	public WebElement validateTransferStatus() {
		return transferstatus;

	}

	@FindBy(xpath = "(//span[text()='Transfer order history'])[2]")
	private WebElement transferorderhistory;

	public WebElement clickTransferOrderHistory() {
		return transferorderhistory;

	}

	@FindBy(xpath = "//span[text()='E-Invoice']")
	private WebElement einvoice;

	public WebElement clickEInvoice() {
		return einvoice;

	}

	@FindBy(xpath = "//span[text()='E-Way bill']")
	private WebElement ewaybill;

	public WebElement clickEwayBill() {
		return ewaybill;

	}

	@FindBy(xpath = "(//span[text()='Add'])[2]")
	private WebElement add;

	public WebElement clickAddButtonl() {
		return add;

	}

	@FindBy(xpath = "//span[contains(@id,'AcxBarcodeScanning_') and contains (@id,'_SeBulkTagMarking_toggle')]")
	private WebElement togglebutton;

	public WebElement clickToggleButton() {
		return togglebutton;

	}

	@FindBy(xpath = "//span[text()='GC Scan']")
	private WebElement gcscan;

	public WebElement clickGcScan() {
		return gcscan;

	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement gcnew;

	public WebElement clickGcNew() {
		return gcnew;

	}

	@FindBy(name = "FromBatch")
	private WebElement frombatch;

	public WebElement enterFrombatch() {
		return frombatch;

	}

	@FindBy(name = "ToBatch")
	private WebElement tobatch;

	public WebElement enterTobatch() {
		return tobatch;

	}

	@FindBy(xpath = "//span[text()='Scan']")
	private WebElement scan;

	public WebElement clickScan() {
		return scan;

	}

	@FindBy(xpath = "//span[text()='Generate']")
	private WebElement generate;

	public WebElement clickGenerate() {
		return generate;

	}

	@FindBy(xpath = "Operation completed")
	private WebElement validmsg;

	public WebElement checkValidMessage() {
		return validmsg;

	}

	@FindBy(xpath = "//span[text()='Tag is not current location or TagStatus must be released']")
	private WebElement invalidmsg;

	public WebElement checkInValidMessage() {
		return invalidmsg;

	}

	@FindBy(xpath = "//button[@title='2 Messages in list.']")
	private WebElement clickarrow;

	public WebElement clickArrow() {
		return clickarrow;

	}

	@FindBy(xpath = "//span[text()='Field 'From warehouse' must be filled in.']")
	private WebElement emptyfromwarehouse;

	public WebElement emptyFromWarehouseMessage() {
		return emptyfromwarehouse;

	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement saveButton() {
		return Save_B;
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

	@FindBy(xpath = "//span[contains(@id,'SysBoxForm_')and contains(@id,'_Ok_label')]")
	private WebElement cnfBtn;

	public WebElement confirmPOPupButton() {
		return cnfBtn;
	}

	@FindBy(name = "BtnSearch")
	private WebElement searchBtn;

	public WebElement clickSearchButton() {
		return searchBtn;
	}

	@FindBy(name = "Fld2_1")
	private WebElement transferid;

	public WebElement enterTransferid() {
		return transferid;
	}

	@FindBy(name = "OkButton")
	private WebElement okb;

	public WebElement clickOkButton() {
		return okb;
	}

	@FindBy(name = "LineViewHeader_TransferId")
	private WebElement transfernumber;

	public WebElement viewTranferNumber() {
		return transfernumber;
	}

	@FindBy(name = "InventTransferTable_TransferType")
	private WebElement transfertagtype;

	public WebElement enterTransferTagType() {
		return transfertagtype;
	}

	@FindBy(xpath = "(//div[text()='Transfer number'])[1]")
	private WebElement transfernumberheader;

	public WebElement clickTransferNumberHeader() {
		return transfernumberheader;
	}

	@FindBy(name = "FilterField_MainGrid_TransferId_TransferId_Input_0")
	private WebElement itemsearch;

	public WebElement searchSendTransferNumber() {
		return itemsearch;
	}

	@FindBy(name = "MainGrid_TransferId_ApplyFilters")
	private WebElement apply;

	public WebElement clickApplyButton() {
		return apply;
	}

	@FindBy(id = "//input[@id='MainGrid_TransferId_35394_0_0_input']")
	private WebElement clicksearchnumber;

	public WebElement clickSearchNumber() {
		return clicksearchnumber;
	}

	@FindBy(name = "Fld2_1")
	private WebElement productgroup;

	public WebElement enterProductGroup() {
		return productgroup;
	}

	@FindBy(name = "Fld3_1")
	private WebElement date;

	public WebElement enterDate() {
		return date;
	}

}
