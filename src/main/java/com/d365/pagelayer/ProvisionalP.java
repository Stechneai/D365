package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public  class ProvisionalP extends MasterClass
{
    public ProvisionalP()
    {
    	PageFactory.initElements(driver, this);
    }
    
  //-----Module
    @FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
    private WebElement btnclickModule;	
    public WebElement btnclickModule() {
        return btnclickModule;
    }

    //-----Jewellery
    @FindBy(xpath="//a[text()=\"Jewellery\"]")
    private WebElement btnclickJewellery;	
    public WebElement btnclickJewellery() 
    {
        return btnclickJewellery;
    }

    //-----Provisional Parcel
    @FindBy(xpath="//a[contains(text(),\"Provisional Parc\")]")
    private WebElement btnprovisionalParcel;	
    public WebElement btnprovisionalParcel() {
        return btnprovisionalParcel;
    }

    //-----New button
    @FindBy(xpath="(//span[text()=\"New\"])[1]")
    private WebElement btnNew;	
    public WebElement btnNew() {
        return btnNew;
    }	

    //---Receive from
    @FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_SourceType\"]")
    private WebElement txtReceiveFrom;	
    public WebElement txtReceiveFrom() {
        return txtReceiveFrom;
    }

    //---Karigar/Vendor Code *
    @FindBy(xpath="//input[contains(@name,\"TA_ParcelReceiveHeaderTable_kar\")]")
    private WebElement txtVendorCode;	
    public WebElement txtVendorCode() {
        return txtVendorCode;
    }

    //---Chalan No
    @FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_DocumentNum\"]")
    private WebElement txtChallanNo;	
    public WebElement txtChallanNo() {
        return txtChallanNo;
    }

    //---Warehouse
    @FindBy(xpath="//input[@name=\"TA_ParcelReceiveHeaderTable_InventLocationId\"]")
    private WebElement txtWareHouse;	
    public WebElement txtWareHouse() {
        return txtWareHouse;
    }

    //---new_parcel_receive_details
    @FindBy(xpath="//button[contains(@name,\"CopyOfNewButton\")]")
    private WebElement btnNewParcelReceive;	
    public WebElement btnNewParcelReceive() {
        return btnNewParcelReceive;
    }

    //----ItemID
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")]")
    private WebElement txtItemID;	
    public WebElement txtItemID() {
        return txtItemID;
    }

    //---Configuration
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Stand\")]")
    private WebElement txtConfiguration;	
    public WebElement txtConfiguration() {
        return txtConfiguration;
    }

    //----Purity
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Ca\")]")
    private WebElement txtPurity;	
    public WebElement txtPurity() {
        return txtPurity;
    }

    //--RcvPcs
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRPcs\")]")
    private WebElement txtRcvPcs;	
    public WebElement txtRcvPcs() {
        return txtRcvPcs;
    }

    //-----MinimumWt
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MinWei\")]")
    private WebElement txtMinimumWT;	
    public WebElement txtMinimumWT() {
        return txtMinimumWT;
    }

    //----MaxWt
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MaxWei\")]")
    private WebElement txtMaximumWT;	
    public WebElement txtMaximumWT() {
        return txtMaximumWT;
    }

    //---Rcv Gross Wt
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRGrWeigh\")]")
    private WebElement txtRcvGrossWt;	
    public WebElement txtRcvGrossWt() {
        return txtRcvGrossWt;
    }

    //----Confirm button
    @FindBy(xpath="//span[text()=\"Confirm\"]")
    private WebElement btnConfirm;	
    public WebElement btnConfirm() {
        return btnConfirm;
    }

    //----Confirm Ok button
    @FindBy(xpath="//button[@name=\"Ok\"]")
    private WebElement btnConfirmOK;	
    public WebElement btnConfirmOK() {
        return btnConfirmOK;
    }

    //-----Issue button
    @FindBy(xpath="(//span[contains(@class,\"button-label button-label-dropDown\")])[4]")
    private WebElement btnIssue;	
    public WebElement btnIssue() {
        return btnIssue;
    }

    //----Issue to Design check
    @FindBy(xpath="//span[contains(text(),\"Issue To DC\")]")
    private WebElement chkIssueToDesignCheck;	
    public WebElement chkIssueToDesignCheck() {
        return chkIssueToDesignCheck;
    }

    //---WebElement of Home button
    @FindBy(xpath="//div[@id=\"home\"]")
    private WebElement btnHome;	
    public WebElement btnHome() {
        return btnHome;
    }

    
  

    //---WEbElement of RcvStoneWT
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_RCVStoneWeight\")]")
    private WebElement txtRcvStoneWT;	
    public WebElement txtRcvStoneWT() {
        return txtRcvStoneWT;
    }

    //----WebElement of StoneName
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneName\")]")
    private WebElement txtStoneName;	
    public WebElement txtStoneName() {
        return txtStoneName;
    }

    //-----WebElement of stoneVariant
    @FindBy(xpath="//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneV\")]")
    private WebElement txtStoneVariant ;	
    public WebElement txtStoneVariant() {
        return txtStoneVariant;
    }

    //---InvalidChallanNoErrorMessage
    @FindBy(xpath="//span[contains(text(),\"Challen No should not be greater than 11\")]")
    private WebElement msgInvalidChallanNoError;	
    public WebElement msgInvalidChallanNoError() {
        return msgInvalidChallanNoError;
    }

    //----IssuetoQCfromPR
    @FindBy(xpath="//span[text()=\"Issue To QC\"]")
    private WebElement btnIssuetoQCfromPR ;	
    public WebElement btnIssuetoQCfromPR() {
        return btnIssuetoQCfromPR;
    }

    //---issueToHmfromProvisionalParcel
    @FindBy(xpath="//span[text()=\"Issue To HM\"]")
    private WebElement btnIssueToHmfromProvisionalParcel ;	
    public WebElement btnIssueToHmfromProvisionalParcel() {
        return btnIssueToHmfromProvisionalParcel;
    }

    //---IssuetoLMfromProvisionalParcel
    @FindBy(xpath="//span[text()=\"Issue To LM\"]")
    private WebElement btnIssuetoLMfromProvisionalParcel ;	
    public WebElement btnIssuetoLMfromProvisionalParcel() {
        return btnIssuetoLMfromProvisionalParcel;
    }

    //---IsuuetoPofromProvisionalParcel
    @FindBy(xpath="//span[text()=\"Issue To PO\"]")
    private WebElement btnIsuuetoPofromProvisionalParcel ;	
    public WebElement btnIsuuetoPofromProvisionalParcel() {
        return btnIsuuetoPofromProvisionalParcel;
    }

    @FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
    private WebElement btnSave; 
    public WebElement btnSave() {
        return btnSave;
    }

    @FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
    private WebElement btnExpandNotification;
    public WebElement btnExpandNotification() {
        return btnExpandNotification;
    }

    @FindBy(name = "Close")
    private WebElement btnErrorClose;
    public WebElement btnErrorClose() {
        return btnErrorClose;
    }

    @FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
    private WebElement btnNotificationOpen;
    public WebElement btnNotificationOpen() {
        return btnNotificationOpen;
    }

    //---voucherNoprovisionalParcel
    @FindBy(xpath="//*[@id=\"TA_ParcelReceiveHeaderTable_VoucherNo1_3_0_0_input\"]")
    private WebElement txtVoucherNoprovisionalParcel ;	
    public WebElement txtVoucherNoprovisionalParcel() {
        return txtVoucherNoprovisionalParcel;
    }

    //--RejDCPCS
    @FindBy(xpath="//div[text()=\"Rej QC Net Weight\"]")
    private WebElement txtRejDCPCS ;	
    public WebElement txtRejDCPCS() {
        return txtRejDCPCS;
    }

    //---qcNetWt
    @FindBy(xpath="//div[contains(@id,\"TA_ParcelReceiveDetailsTable_IssQCNetWeight_206_0_hea\")]")
    private WebElement txtQcNetWt ;	
    public WebElement txtQcNetWt() {
        return txtQcNetWt;
    }

    @FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
    private WebElement msgInvalidError;
    public WebElement msgInvalidError() {
        return msgInvalidError;
    }

    @FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
    private WebElement msgDuplicateError;
    public WebElement msgDuplicateError() {
        return msgDuplicateError;
    }

    //---stonePcs
    @FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_NoofStonePcs\")]")
    private WebElement txtStonePcs;
    public WebElement txtStonePcs() {
        return txtStonePcs;
    }

    //---poRateType
    @FindBy(xpath = "//input[contains(@name,\"TA_ParcelReceiveHeaderTable_PoRateType\")]")
    private WebElement txtPoRateType;
    public WebElement txtPoRateType() {
        return txtPoRateType;
    }

    //---itemIdofFirstLine
    @FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")])[1]")
    private WebElement txtItemIdofFirstLine;
    public WebElement txtItemIdofFirstLine() {
        return txtItemIdofFirstLine;
    }

    //---itemIdoSecondLine
    @FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")])[2]")
    private WebElement txtItemIdoSecondLine;
    public WebElement txtItemIdoSecondLine() {
        return txtItemIdoSecondLine;
    }
    
    
    //---btnCloseErrorMessage
    @FindBy(xpath="//span[@id=\"SysBoxForm_3_Close_label\"]")
    private WebElement btnCloseErrorMessage;	
    public WebElement btnCloseErrorMessage() 
    {
        return btnCloseErrorMessage;
    }

 
 
	
	
}
