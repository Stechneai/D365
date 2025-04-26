package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class karagirNaveJamaPage extends MasterClass
{
	public karagirNaveJamaPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---module
	@FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
	private WebElement btnmoduleClick;    
	public WebElement btnmoduleClick() {
	    return btnmoduleClick;
	}

	//---inventoryManagment
	@FindBy(xpath="//a[text()=\"Inventory management\"]")
	private WebElement btninventoryManagement;    
	public WebElement btninventoryManagement() {
	    return btninventoryManagement;
	}

	//---transfer
	@FindBy(xpath="//a[text()=\"Transfer\"]")
	private WebElement btntransfer;    
	public WebElement btntransfer() {
	    return btntransfer;
	}

	//---newBtnofTransfer
	@FindBy(xpath="//span[text()=\"New\"]")
	private WebElement btnNewTransfer;    
	public WebElement btnNewTransfer() {
	    return btnNewTransfer;
	}

	//---name
	@FindBy(xpath="//input[contains(@name,\"InventJournalTable_JournalNameId\")]")
	private WebElement txtName;    
	public WebElement txtName() {
	    return txtName;
	}

	//---smithName
	@FindBy(xpath="//input[contains(@name,\"InventJournalTable_AcxSubSmit\")]")
	private WebElement txtSmithNames;    
	public WebElement txtSmithNames() {
	    return txtSmithNames;
	}

	//----site
	@FindBy(xpath="//input[contains(@name,\"RetailStoreInventory_InventSiteId\")]")
	private WebElement txtSites;    
	public WebElement txtSites() {
	    return txtSites;
	}

	//---wareHouse
	@FindBy(xpath="//input[contains(@name,\"RetailStoreInventory_InventLocationId\")]")
	private WebElement txtWareHouses;    
	public WebElement txtWareHouses() {
	    return txtWareHouses;
	}

	//---okButton
	@FindBy(xpath="//span[text()=\"OK\"]")
	private WebElement btnOk;    
	public WebElement btnOk() {
	    return btnOk;
	}

	//---newbtnOfJournalLine
	@FindBy(xpath="(//span[text()=\"New\"])[3]")
	private WebElement btnNewJournalLine;    
	public WebElement btnNewJournalLine() {
	    return btnNewJournalLine;
	}

	//---itemNumber
	@FindBy(xpath="//div[contains(@id,\"GridCell-0-InventJournalTrans_ItemId\")]")
	private WebElement txtItemNumber;    
	public WebElement txtItemNumber() {
	    return txtItemNumber;
	}

	//---toSite
	@FindBy(xpath="//input[contains(@id,\"InventDimReceipt_InventSiteI\")]")
	private WebElement txtToSite;    
	public WebElement txtToSite() {
	    return txtToSite;
	}

	//---toWareHouse
	@FindBy(xpath="//input[contains(@id,\"InventDimReceipt_InventLocationI\")]")
	private WebElement txtToWareHouse;    
	public WebElement txtToWareHouse() {
	    return txtToWareHouse;
	}

	//---fromLocation
	@FindBy(xpath="//input[contains(@id,\"InventDimIssue_wMSLocationId\")]")
	private WebElement txtFromLocation;    
	public WebElement txtFromLocation() {
	    return txtFromLocation;
	}

	//---toLocation
	@FindBy(xpath="//input[contains(@id,\"InventDimReceipt_wMSLocationId_\")]")
	private WebElement txtToLocation;    
	public WebElement txtToLocation() {
	    return txtToLocation;
	}

	//---qty
	@FindBy(xpath="//input[contains(@id,\"InventJournalTrans_Qty\")]")
	private WebElement txtQty;    
	public WebElement txtQty() {
	    return txtQty;
	}

	//----netwt
	@FindBy(xpath="//input[contains(@id,\"InventJournalTrans_AcxNetWeight\")]")
	private WebElement txtNetwt;    
	public WebElement txtNetwt() {
	    return txtNetwt;
	}

	//---purity
	@FindBy(xpath="//input[contains(@id,\"InventJournalTrans_Purity\")]")
	private WebElement txtPurity;    
	public WebElement txtPurity() {
	    return txtPurity;
	}

	//----makingrate
	@FindBy(xpath="//input[contains(@id,\"InventJournalTrans_MakingRate\")]")
	private WebElement txtMakingrate;    
	public WebElement txtMakingrate() {
	    return txtMakingrate;
	}

	//---validateBtn
	@FindBy(xpath="//span[text()=\"Validate\"]")
	private WebElement btnValidate;    
	public WebElement btnValidate() {
	    return btnValidate;
	}

	//---purityConversion
	@FindBy(xpath="//span[text()=\"Purity Conversion\"]")
	private WebElement btnPurityConversion;    
	public WebElement btnPurityConversion() {
	    return btnPurityConversion;
	}

	//----postbtn
	@FindBy(xpath="//span[text()=\"Post\"]")
	private WebElement btnPost;    
	public WebElement btnPost() {
	    return btnPost;
	}

	//----releasebtn
	@FindBy(xpath="//span[text()=\"Release\"]")
	private WebElement btnRelease;    
	public WebElement btnRelease() {
	    return btnRelease;
	}

	// Save Button
	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement btnSave; 
	public WebElement btnSave() {
	    return btnSave;
	}

	// Expand Notification
	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	private WebElement btnExpandNotification;
	public WebElement btnExpandNotification() {
	    return btnExpandNotification;
	}

	// Close Error Notification
	@FindBy(name = "Close")
	private WebElement btnErrorClose;
	public WebElement btnErrorClose() {
	    return btnErrorClose;
	}

	// Open Notification
	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement btnNotificationOpen;
	public WebElement btnNotificationOpen() {
	    return btnNotificationOpen;
	}

	//---clickOnotherField
	@FindBy(xpath = "//div[text()=\"Create inventory journal\"]")
	private WebElement clickOnOtherField;
	public WebElement clickOnOtherField() {
	    return clickOnOtherField;
	}

   	
   	

}
