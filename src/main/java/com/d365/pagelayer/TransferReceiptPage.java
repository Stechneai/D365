package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class TransferReceiptPage extends MasterClass{
	  public TransferReceiptPage()
      {
    	  PageFactory.initElements(driver, this);
      }
	  @FindBy(xpath = "//Span[@class='workspace-image GroupedList-symbol']")
		private WebElement lnkmodule;

		public WebElement lnkmodule() {
			return lnkmodule;
		}

		@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
		private WebElement btnSave;

		public WebElement btnSave() {
			return btnSave;
		}

		@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")  //expandNotification
		WebElement btnExpandNotification;

		public WebElement btnExpandNotification() {
			return btnExpandNotification;
		}

		@FindBy(name = "Close")
		WebElement btnErrorClose;

		public WebElement btnErrorClose() {
			return btnErrorClose;
		}

		@FindBy(xpath = "//input[@name='InventJournalTable_TA_NoofBoxes']")
		WebElement journalnoofboxes;

		public WebElement txtJournalNoOfBoxes() {
			return journalnoofboxes;
		}
		@FindBy(xpath = "//input[@name='NoofBoxes']")
		WebElement headernoofboxes;

		public WebElement txtHeaderNoOfBoxes() {
			return headernoofboxes;
		}
		
		@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
		private WebElement btnNotificationOpen;

		public WebElement btnNotificationOpen() {
			return btnNotificationOpen;
		}

//		@FindBy(xpath = "//a[text()='Jewellery']")
//		private WebElement jewellery;
	//
//		public WebElement clickJewellery() {
//			return jewellery;
//		}

		@FindBy(xpath = "//a[text()='Inventory management']")
		private WebElement lnkInventorymanagement;

		public WebElement lnkInventorymanagement() {
			return lnkInventorymanagement;

		}

		@FindBy(xpath = "//a[text()='Transfer']")
		private WebElement lnktTransfer;

		public WebElement lnktTransfer() {
			return lnktTransfer;

		}

		@FindBy(name = "SystemDefinedNewButton")
		private WebElement btnNeworder;

		public WebElement btnNeworder() {
			return btnNeworder;

		}

		@FindBy(name = "RetailStoreInventory_InventSiteId")
		private WebElement txtSite;

		public WebElement txtSite() {
			return txtSite;

		}

		@FindBy(xpath = "//input[@name='RetailStoreInventory_InventLocationId']")
		private WebElement txtWarehouse;

		public WebElement txtWarehouse() {
			return txtWarehouse;

		}

		@FindBy(xpath = "//span[text()='OK']")
		private WebElement btnOk;

		public WebElement btnOk() {
			return btnOk;

		}

		@FindBy(xpath = "//span[text()='Tag Scanning']")
		private WebElement btnTagScanning;

		public WebElement btnTagScanning() {
			return btnTagScanning;

		}
//		@FindBy(xpath="//span[contains(@id,'AcxBarcodeScanning_') and contains (@id,'_SeBulkTagMarking_toggle')]")
//		private WebElement togglebutton;
	//
//		public WebElement clickToggleButton() {
//			return togglebutton;
	//
//		}

		@FindBy(name = "SeTag")  //enterTag
		private WebElement releasetag;

		public WebElement txtEnterTag() {
			return releasetag;

		}
		@FindBy(name = "SeInventLocation")
		private WebElement txtLocation;

		public WebElement txtLocation() {
			return txtLocation;

		}
		@FindBy(xpath="//input[@name='InventJournalTable_wMSLocationId']")
		private WebElement  location;

		public WebElement txtInventoryLocation() {
			return location;

		}

		@FindBy(xpath = "//input[@name='SewMSLocationId']")
		private WebElement txtCounter;

		public WebElement txtCounter() {
			return txtCounter;

		}

		@FindBy(xpath = "//span[text()='Generate Line']")
		private WebElement generateline;

		public WebElement btnGenerateLine() {
			return generateline;

		}

		@FindBy(xpath = "//span[text()='Validate']")
		private WebElement validate;

		public WebElement btnValidate() {
			return validate;

		}

		@FindBy(xpath = "//span[text()='OK']")
		private WebElement btnValidateOk;

		public WebElement btnValidateOk() {
			return btnValidateOk;

		}

		@FindBy(xpath = "//span[text()='Release']")
		private WebElement btnTagrelease;

		public WebElement btnTagrelease() {
			return btnTagrelease;

		}

		@FindBy(xpath = "//input[@name='InventJournalTable_ScanningStatus']")
		private WebElement txtScanningStatus;

		public WebElement txtScanningStatus() {
			return txtScanningStatus;

		}

		@FindBy(xpath = "//span[text()='Post']")
		private WebElement post;

		public WebElement btnPost() {
			return post;

		}

		@FindBy(xpath = "//span[text()='OK']")
		private WebElement postok;

		public WebElement btnPostOK() {
			return postok;
		}
		//print journal transfer
		@FindBy(xpath = "//span[text()='Print Journal Transfer']")
		private WebElement printtransfer;

		public WebElement btnPrintTransfer() {
			return printtransfer;
		}
		//No of boxes
		@FindBy(xpath = "//input[@name='NoofBoxes']")
		private WebElement noofboxesh;

		public WebElement txtNoOfBoxesHeader() {
			return noofboxesh;
		}
		//No of boxes
		@FindBy(xpath = "//input[@name='InventJournalTable_TA_NoofBoxes']")
		private WebElement noofboxes;

		public WebElement txtNoOfBoxesInventory() {
			return noofboxes;
		}
		@FindBy(xpath = "(//label[text()='No Of Boxes'])")
		private WebElement noofboxesliventory;

		public WebElement labelNoOfBoxesInventory() {
			return noofboxesliventory;

		}
		@FindBy(xpath = "(//label[text()='No Of Boxes'])[1]")
		private WebElement noofboxeslheader;

		public WebElement labelNoOfBoxesHeader() {
			return noofboxeslheader;

		}
		@FindBy(xpath = "//span[text()='Save']")
		private WebElement save;

		public WebElement btnSaveTransfer() {
			return save;

		}
		
		@FindBy(xpath = "//span[contains(text(),'Journal:')]")
		private WebElement message;

		public WebElement lblCheckValidMessage() {
			return message;
		}

		@FindBy(xpath = "//a[text()='Home']")
		private WebElement home;

		public WebElement btnHome() {
			return home;

		}

		@FindBy(xpath = "//span[text()='Lines']")
		private WebElement lines;

		public WebElement btnLines() {
			return lines;

		}

		@FindBy(xpath = "//input[@aria-label='Vehicle No.']")
		private WebElement vehicleno;

		public WebElement txtVehicleNo() {
			return vehicleno;

		}

		@FindBy(xpath = "//input[@aria-label='Document No.']")
		private WebElement documentno;

		public WebElement txtDocumentNo() {
			return documentno;

		}

		@FindBy(xpath = "//input[@aria-label='Document date']")
		private WebElement documentdate;

		public WebElement txtDocumentDate() {
			return documentdate;

		}

		@FindBy(xpath = "//input[@aria-label='Document date']")
		private WebElement vehicletype;

		public WebElement txtVehicleType() {
			return vehicletype;

		}

		@FindBy(xpath = "//span[contains(@id,'AcxBarcodeScanning_') and contains (@id,'_SeBulkTagMarking_toggle')]")
		private WebElement togglebutton;

		public WebElement txtToggleButton() {
			return togglebutton;

		}

		@FindBy(name = "InventJournalTable_JournalNameId")
		// @FindBy(xpath="(//input[@title='InvT'])[3]")
		private WebElement name;

		public WebElement txtCheckName() {
			return name;

		}

		@FindBy(name = "InventJournalTable_JournalNameId")
		private WebElement description;

		public WebElement txtCheckDescription() {
			return description;

		}

		@FindBy(xpath = "//span[text()='Tag is not from selected location or Tag is not release status']")
		private WebElement invalidtag;

		public WebElement txtInvalidTag() {
			return invalidtag;

		}
		@FindBy(xpath = "//span[text()='Cannot select Bulk tag']")
		private WebElement invalidbulktag;

		public WebElement txtInvalidBulkTag() {
			return invalidbulktag;

		}
		  @FindBy(xpath = "//span[text()='Invent Transfer Barcode']")
			private WebElement tagscanotherclick;

			public WebElement btnOtherclick() {
				return tagscanotherclick;
			}

		@FindBy(xpath = "//label[text()='Invent Location *']")
		private WebElement labellocation;

		public WebElement lblLocation() {
			return labellocation;

		}
		@FindBy(name = "//input[contains(@id, 'InventJournalTrans_Qty') and contains(@id, '_input')]")
		private WebElement qty;

		public WebElement txtQuantity() {
			return qty;
		}
		

		@FindBy(name = "//input[contains(@id, 'InventJournalTrans_FineWeight') and contains(@id, '_input')]")
		private WebElement finewt;

		public WebElement txtFineWeight() {
			return finewt;
		}
		@FindBy(name = "//input[contains(@id, 'InventJournalTrans_AcxNetWeight') and contains(@id, '_input')]")
		private WebElement netwt;

		public WebElement txtNetWeight() {
			return netwt;
		}
		@FindBy(name = "//input[contains(@id, 'InventJournalTrans_Purity') and contains(@id, '_input')]")
		private WebElement purity;

		public WebElement txtPurity() {
			return purity;
		}
		@FindBy(name = "//input[contains(@id, 'InventJournalTrans_PurchaseCost') and contains(@id, '_input')]")
		private WebElement purcost;

		public WebElement txtPurchaseCost() {
			return purcost;
		}

}
