package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public final class ProvisionalParcelPage extends MasterClass
{
    public ProvisionalParcelPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    //-----Module
    @FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
	private WebElement clickModule;	
	public WebElement lnkModule()
	{
		return clickModule;
	}
	
	//-----Jewellery
	@FindBy(xpath="//a[text()=\"Jewellery\"]")
	private WebElement clickJewellery;	
	public WebElement lnkJewellery()
	{
		return clickJewellery;
	}
	@FindBy(xpath="//a[text()='QC Process Management']")
	private WebElement qcprocess;	
	public WebElement lnkQcProcessManagement()
	{
		return qcprocess;
	}
	
	@FindBy(name="TA_ParcelReceiveHeaderTable_PoRateType")
	private WebElement porate;	
	public WebElement txtEnterPoRateType()
	{
		return porate;
	}
	
	
	//-----Provisional Parcel
	@FindBy(xpath="//a[contains(text(),\"Provisional Parc\")]")
	private WebElement provisionalParcel;	
	public WebElement lnkprovisionalParcel()
	{
		return provisionalParcel;
	}
	
	//-----New button
	@FindBy(xpath="(//span[text()=\"New\"])[1]")
	private WebElement newButton;	
	public WebElement btnNew()
	{
		return newButton;
	}	
	
	//---Receive from
	@FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_SourceType\"]")
	private WebElement receiveFrom;	
	public WebElement dropDownReceiveFrom()
	{
		return receiveFrom;
	}
	//---Karigar/Vendor Code *
	@FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_karigarCode\"]")
	private WebElement vendorCode;	
	public WebElement dropDownVendorCode()
	{
		return vendorCode;
	}
	
	//---Chalan No
	@FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_DocumentNum\"]")
	private WebElement challanNo;	
	public WebElement txtChallanNo()
	{
		return challanNo;
	}
	
	//---Warehouse
	@FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_InventLocationId\"]")
	private WebElement wareHouse;	
	public WebElement dropDownWareHouse()
	{
		return wareHouse;
	}
	
	//---new_parcel_receive_details
	@FindBy(xpath="(//span[text()=\"New\"])[2]")
	private WebElement newParcelReceive;	
	public WebElement btnNewParcelReceive()
	{
		return newParcelReceive;
	}
	
	//----ItemID
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")]")
	private WebElement itemID;	
	public WebElement dropdownItemID()
	{
		return itemID;
	}
	
	//---Configuration
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Stand\")]")
	private WebElement configuration;	
	public WebElement dropDownConfiguration()
	{
		return configuration;
	}
	
	//----Purity
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Ca\")]")
	private WebElement purity;	
	public WebElement dropDownPurity()
	{
		return purity;
	}
	
	//--RcvPcs
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRPcs\")]")
	private WebElement rcvPcs;	
	public WebElement txtRcvPcs()
	{
		return rcvPcs;
	}
	
	//-----MinimumWt
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MinWei\")]")
	private WebElement minimumWT;	
	public WebElement txtMinimumWT()
	{
		return minimumWT;
	}
	
	//----MaxWt
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MaxWei\")]")
	private WebElement maximumWT;	
	public WebElement txtMaximumWT()
	{
		return maximumWT;
	}
	
	//---Rcv Gross Wt
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRGrWeigh\")]")
	private WebElement rcvGrossWt;	
	public WebElement txtrcvGrossWt()
	{
		return rcvGrossWt;
	}
	
	//----Confirm button
	@FindBy(xpath="//span[text()=\"Confirm\"]")
	private WebElement confirmButton;	
	public WebElement btnConfirm()
	{
		return confirmButton;
	}
	
	//----Confirm Ok button
	@FindBy(xpath="//button[@name=\"Ok\"]")
	private WebElement confirmOKButton;	
	public WebElement btnConfirmOK()
	{
		return confirmOKButton;
	}
	
	//-----Issue button
	@FindBy(xpath="//span[contains(@id, 'ta_parcelreceive_') and contains(@id, 'Issue_label')]")
	private WebElement issueButton;	
	public WebElement btnIssue()
	{
		return issueButton;
	}
	
	//----Issue to Design check
	@FindBy(xpath="//span[contains(text(),\"Issue To DC\")]")
	private WebElement issueToDesignCheck;	
	public WebElement btnIssueToDesignCheck()
	{
		return issueToDesignCheck;
	}
	
	//---WebElement of Home button
	@FindBy(xpath="//div[@id=\"home\"]")
	private WebElement homeButton;	
	public WebElement btnHome()
	{
		return homeButton;
	}
	
	//--close error message
	@FindBy(xpath="//span[@id=\"SysBoxForm_3_Close_label\"]")
	private WebElement closeErrorMessage;	
	public WebElement closeErrorMessage()
	{
		return closeErrorMessage;
	}
	
	//---WEbElement of RcvStoneWT
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_RCVStoneWeight\")]")
	private WebElement RcvStoneWT;	
	public WebElement txtRcvStoneWT()
	{
		return RcvStoneWT;
	}
	
	//----WebElement of StoneName
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneName\")]")
	private WebElement StoneName;	
	public WebElement StoneName()
	{
		return StoneName;
	}
	
	//-----WebElement of stoneVariant
	@FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneV\")]")
	private WebElement stoneVariant ;	
	public WebElement txtStoneVariant()
	{
		return stoneVariant;
	}
	
	//---InvalidChallanNoErrorMessage
	@FindBy(xpath="//span[contains(text(),\"Challen No should not be greater than 11\")]")
	private WebElement InvalidChallanNoErrorMessage ;	
	public WebElement InvalidChallanNoErrorMessage()
	{
		return InvalidChallanNoErrorMessage;
	}
	
	//----IssuetoQCfromPR
	@FindBy(xpath="//span[text()=\"Issue To QC\"]")
	private WebElement IssuetoQCfromPR ;	
	public WebElement btnIssuetoQCfromPR()
	{
		return IssuetoQCfromPR;
	}
	
	//---issueToHmfromProvisionalParcel
	@FindBy(xpath="//span[text()=\"Issue To HM\"]")
	private WebElement issueToHmfromProvisionalParcel ;	
	public WebElement btnissueToHmfromProvisionalParcel()
	{
		return issueToHmfromProvisionalParcel;
	}
	
	//---IssuetoLMfromProvisionalParcel
	@FindBy(xpath="//span[text()=\"Issue To LM\"]")
	private WebElement IssuetoLMfromProvisionalParcel ;	
	public WebElement btnIssuetoLMfromProvisionalParcel()
	{
		return IssuetoLMfromProvisionalParcel;
	}
	
	//---IsuuetoPofromProvisionalParcel
	@FindBy(xpath="//span[text()=\"Issue To PO\"]")
	private WebElement IsuuetoPofromProvisionalParcel ;	
	public WebElement btnIsuuetoPofromProvisionalParcel()
	{
		return IsuuetoPofromProvisionalParcel;
	}
	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;
 
	public WebElement btnSave() {
		return Save_B;
	}
	
	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement expandNotification;
 
	public WebElement btnExpandNotification() {
		return expandNotification;
	}
 
	@FindBy(name = "Close")
	WebElement errorClose;
 
	public WebElement btnErrorClose()
	{
		return errorClose;
	}
 
 
@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement noteOpenButton;
 
	public WebElement btnNotificationOpen() {
		return noteOpenButton;
	}
	
	//---voucherNoprovisionalParcel
	@FindBy(xpath="//*[@id=\"TA_ParcelReceiveHeaderTable_VoucherNo1_3_0_0_input\"]")
	private WebElement voucherNoprovisionalParcel ;	
	public WebElement txtVoucherNoprovisionalParcel()
	{
		return voucherNoprovisionalParcel;
	}
	
	//--RejDCPCS
	@FindBy(xpath="//div[text()=\"Rej QC Net Weight\"]")
	private WebElement RejDCPCS ;	
	public WebElement txtRejDCPCS()
	{
		return RejDCPCS;
	}
	
	//---qcNetWt
	@FindBy(xpath="//div[contains(@id,\"TA_ParcelReceiveDetailsTable_IssQCNetWeight_206_0_hea\")]")
	private WebElement qcNetWt ;	
	public WebElement txtQcNetWt()
	{
		return qcNetWt;
	}
	
	@FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
	WebElement invalidError;
 
	public WebElement invalidErrorMsg() {
		return invalidError;
	}
 
	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
	 private WebElement duplicateError;
 
	public WebElement duplicateErrorMsg() 
	{
		return duplicateError;
	}
	
	//---stonePcs
	@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_NoofStonePcs\")]")
	private WebElement stonePcs;
    public WebElement txtStonePcs() 
	{
		return stonePcs;
	}
	
    //---poRateType
    @FindBy(xpath = "//input[contains(@name,\"TA_ParcelReceiveHeaderTable_PoRateType\")]")
    private WebElement txtPoRateType;
    public WebElement txtPoRateType() {
        return txtPoRateType;
    }

 
 
	
	
}
