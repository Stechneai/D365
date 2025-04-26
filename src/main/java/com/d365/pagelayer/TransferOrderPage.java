package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class TransferOrderPage extends MasterClass {

	public TransferOrderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Invent Transfer Barcode']")
	private WebElement tagscanotherclick;

	public WebElement btnOtherclick() {
		return tagscanotherclick;
	}

	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement expnd;

	public WebElement btnExpandAll() {
		return expnd;
	}

	@FindBy(name = "Close")
	WebElement btnErrorClose;

	public WebElement btnErrorClose() {
		return btnErrorClose;
	}

	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement btnExpandNotification;

	public WebElement btnExpandNotification() {
		return btnExpandNotification;
	}

	@FindBy(xpath = "//Span[@class='workspace-image GroupedList-symbol']")
	private WebElement btnModule;

	public WebElement btnModule() {
		return btnModule;
	}

	@FindBy(xpath = "//a[text()='Inventory management']")
	private WebElement lnkInventorymanagement;

	public WebElement lnkInventorymanagement() {
		return lnkInventorymanagement;

	}

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement btnHome;

	public WebElement btnHome() {
		return btnHome;

	}

	@FindBy(xpath = "(//a[text()='Transfer order'])[2]")
	private WebElement transferorder;

	public WebElement lnkTransferOrder() {
		return transferorder;
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement newtransferoder;

	public WebElement btnNewTransferOrder() {
		return newtransferoder;
	}

	@FindBy(name = "LineViewHeader_InventLocationIdFrom")
	private WebElement fromwarehouse;

	public WebElement txtFromWarehouse() {
		return fromwarehouse;
	}

	@FindBy(name = "LineViewHeader_InventLocationIdTo")
	private WebElement towarehouse;

	public WebElement txtToWarehouse() {
		return towarehouse;
	}

	@FindBy(xpath = "//span[text()='Transfer order']")
	private WebElement transferordericon;

	public WebElement btnTransferOrderIcon() {
		return transferordericon;
	}

	@FindBy(xpath = "//span[text()='Tag Scan']")
	private WebElement tagscan;

	public WebElement btnTagScan() {
		return tagscan;
	}

	@FindBy(name = "SeTag")
	private WebElement tagno;

	public WebElement txtTransTag() {
		return tagno;
	}

	@FindBy(xpath = "//span[text()='Generate Line']")
	private WebElement transgenerateline;

	public WebElement btnTransGenerateLine() {
		return transgenerateline;

	}

	@FindBy(xpath = "(//span[text()='Lines'])[2]")
	private WebElement lines;

	public WebElement btnLines() {
		return lines;

	}

	@FindBy(xpath = "//span[text()='Ship']")
	private WebElement ship;

	public WebElement btnShip() {
		return ship;

	}

	@FindBy(xpath = "//span[text()='Ship transfer order']")
	private WebElement shiptransfer;

	public WebElement btnShipTransfer() {
		return shiptransfer;

	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement oksbutton;

	public WebElement btnOkS() {
		return oksbutton;
	}

	@FindBy(xpath = "(//span[text()='Receive'])[1]")
	private WebElement receive;

	public WebElement btnReceive() {
		return receive;

	}

	@FindBy(xpath = "(//span[text()='Receive'])[2]")
	private WebElement shipreceive;

	public WebElement btnShipReceive() {
		return shipreceive;

	}

	@FindBy(xpath = "//input[@value='All']")
	private WebElement receiveall;

	public WebElement txtReceiveAll() {
		return receiveall;
	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement okrbutton;

	public WebElement btnOkR() {
		return okrbutton;
	}

	@FindBy(name = "LineViewHeader_TransferType_IN_TransferType_IN") // enter transfer order or stock transfer
	private WebElement transfertype;

	public WebElement txtTransferType() {
		return transfertype;

	}

	@FindBy(xpath = "(//input[@title='Transfer order'])[1]") // enter transfer order or stock transfer
	private WebElement transferordertype;

	public WebElement btnValidateTransferOrder() {
		return transferordertype;

	}

	@FindBy(xpath = "//input[@title='Stock transfer']") // enter transfer order or stock transfer
	private WebElement stocktransfertype;

	public WebElement btnValidateStockTransfer() {
		return stocktransfertype;

	}

	@FindBy(name = "LineViewHeader_TransferStatus_TransferStatus") // verify transfer status
	private WebElement transferstatus;

	public WebElement btnValidateTransferStatus() {
		return transferstatus;

	}
	@FindBy(xpath = "//span[text()='Operation completed']") // verify transfer status
	private WebElement smessage;

	public WebElement lblValidateShipMessage() {
		return smessage;

	}
	@FindBy(xpath = "//span[text()='Operation completed']") // verify transfer status
	private WebElement rmessage;

	public WebElement lblValidateReceiveMesssage() {
		return rmessage;

	}
	@FindBy(name = "LineViewHeader_ShipDate") // verify transfer date
	private WebElement sdate;

	public WebElement lblValidateShipDate() {
		return sdate;

	}


	@FindBy(xpath = "(//span[text()='Transfer order history'])[2]")
	private WebElement transferorderhistory;

	public WebElement btnTransferOrderHistory() {
		return transferorderhistory;

	}

	@FindBy(xpath = "//span[text()='E-Invoice']")
	private WebElement einvoice;

	public WebElement btnEInvoice() {
		return einvoice;

	}

	@FindBy(xpath = "//span[text()='E-Way bill']")
	private WebElement ewaybill;

	public WebElement btnEwayBill() {
		return ewaybill;

	}

	@FindBy(xpath = "(//span[text()='Add'])[2]")
	private WebElement add;

	public WebElement btnAddButtonl() {
		return add;

	}

	@FindBy(xpath = "//span[contains(@id,'AcxBarcodeScanning_') and contains (@id,'_SeBulkTagMarking_toggle')]")
	private WebElement togglebutton;

	public WebElement btnToggleButton() {
		return togglebutton;

	}

	@FindBy(xpath = "//span[text()='GC Scan']")
	private WebElement gcscan;

	public WebElement btnGcScan() {
		return gcscan;

	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement gcnew;

	public WebElement btnGcNew() {
		return gcnew;

	}

	@FindBy(name = "FromBatch")
	private WebElement frombatch;

	public WebElement txtFrombatch() {
		return frombatch;

	}

	@FindBy(name = "ToBatch")
	private WebElement tobatch;

	public WebElement txtTobatch() {
		return tobatch;

	}

	@FindBy(xpath = "//span[text()='Scan']")
	private WebElement scan;

	public WebElement btnScan() {
		return scan;

	}

	@FindBy(xpath = "//span[text()='Generate']")
	private WebElement generate;

	public WebElement btnGenerate() {
		return generate;

	}

	@FindBy(xpath = "Operation completed")
	private WebElement validmsg;

	public WebElement lblCheckValidMessage() {
		return validmsg;

	}

	@FindBy(xpath = "//span[text()='Tag is not current location or TagStatus must be released']")
	private WebElement invalidmsg;

	public WebElement lblCheckInValidMessage() {
		return invalidmsg;

	}

	@FindBy(xpath = "//button[@title='2 Messages in list.']")
	private WebElement clickarrow;

	public WebElement btnArrow() {
		return clickarrow;

	}

	@FindBy(xpath = "//span[text()='Field 'From warehouse' must be filled in.']")
	private WebElement emptyfromwarehouse;

	public WebElement lblEmptyFromWarehouseMessage() {
		return emptyfromwarehouse;

	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement btnSave() {
		return Save_B;
	}

	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement noteButton;

	public WebElement btnNotificationClose() {
		return noteButton;
	}

	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement noteOpenButton;

	public WebElement btnNotificationOpen() {
		return noteOpenButton;
	}

	@FindBy(xpath = "//span[contains(@id,'SysBoxForm_')and contains(@id,'_Ok_label')]")
	private WebElement cnfBtn;

	public WebElement btnConfirmPOPup() {
		return cnfBtn;
	}

	@FindBy(name = "BtnSearch")
	private WebElement searchBtn;

	public WebElement btnSearchButton() {
		return searchBtn;
	}

	@FindBy(name = "Fld2_1")
	private WebElement transferid;

	public WebElement txtTransferid() {
		return transferid;
	}

	@FindBy(name = "OkButton")
	private WebElement okb;

	public WebElement btnOkButton() {
		return okb;
	}

	@FindBy(name = "LineViewHeader_TransferId")  //viewTranferNumber
	private WebElement transfernumber;

	public WebElement lblTranferNumber() {
		return transfernumber;
	}

	@FindBy(name = "InventTransferTable_TransferType")
	private WebElement transfertagtype;

	public WebElement txtTransferTagType() {
		return transfertagtype;
	}

	@FindBy(xpath = "(//div[text()='Transfer number'])[1]")
	private WebElement transfernumberheader;

	public WebElement btnTransferNumberHeader() {
		return transfernumberheader;
	}

	@FindBy(name = "FilterField_MainGrid_TransferId_TransferId_Input_0")
	private WebElement itemsearch;

	public WebElement btnSearchSendTransferNumber() {
		return itemsearch;
	}

	@FindBy(name = "MainGrid_TransferId_ApplyFilters")
	private WebElement apply;

	public WebElement btnApplyButton() {
		return apply;
	}

	@FindBy(id = "//input[@id='MainGrid_TransferId_35394_0_0_input']")
	private WebElement clicksearchnumber;

	public WebElement btnSearchNumber() {
		return clicksearchnumber;
	}

	@FindBy(name = "Fld2_1")
	private WebElement productgroup;

	public WebElement txtProductGroup() {
		return productgroup;
	}

	@FindBy(name = "Fld3_1")
	private WebElement date;

	public WebElement txtDate() {
		return date;
	}

	
	
	@FindBy(name = "//ul[contains(@id,'inventtransferorder_4_LineViewHeader_TransferType_IN_TransferType_IN_list')]/li[1]")
	private WebElement ele0;

	public WebElement lblEle0() {
		return ele0;
	}

	@FindBy(name = "//ul[contains(@id,'inventtransferorder_4_LineViewHeader_TransferType_IN_TransferType_IN_list')]/li[2]")
	private WebElement ele1;

	public WebElement lblEle1() {
		return ele1;
	}
}
