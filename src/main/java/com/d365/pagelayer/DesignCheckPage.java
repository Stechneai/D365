package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class DesignCheckPage extends MasterClass
{
      public DesignCheckPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      
      //---Design check
      @FindBy(xpath="//a[text()=\"DC Check\"]")
      private WebElement labelDcCheck;
      public WebElement labelDcCheck() { return labelDcCheck; }
      
      //---DC Rejection
      @FindBy(xpath="//span[text()=\"DC Rejection\"]")
      private WebElement labelDcRejection;
      public WebElement labelDcRejection() { return labelDcRejection; }
      
      //---DC Details & Rejection New Button
      @FindBy(xpath="//span[text()=\"New\"]")
      private WebElement btnDcRejectionNew;
      public WebElement btnDcRejectionNew() { return btnDcRejectionNew; }
      
      //---DC Rejection PCs
      @FindBy(xpath="//input[contains(@id,\"TA_DCRejectionDetailsTable_DCRejPcs\")]")
      private WebElement txtDcRejectionPcs;
      public WebElement txtDcRejectionPcs() { return txtDcRejectionPcs; }
      
      //----DC Rejection Gross Weight
      @FindBy(xpath="//input[contains(@id,\"TA_DCRejectionDetailsTable_DCRejWei\")]")
      private WebElement txtDcRejectionGrossWt;
      public WebElement txtDcRejectionGrossWt() { return txtDcRejectionGrossWt; }
      
      //---Remark of Rejection
      @FindBy(xpath="//input[contains(@id,\"TA_DCRejectionDetailsTable_DCRejectionRemar\")]")
      private WebElement txtAreaRemarkRejection;
      public WebElement txtAreaRemarkRejection() { return txtAreaRemarkRejection; }
      
      //---Issue to PO
      @FindBy(xpath="//span[text()=\"Issue To PO\"]")
      private WebElement btnIssueToPos;
      public WebElement btnIssueToPos() 
      { 
    	  return btnIssueToPos; 
    	  }
      
      //---DC User
      @FindBy(xpath="//input[contains(@name,\"Fld\")]")
      private WebElement txtDcUser;
      public WebElement txtDcUser() { return txtDcUser; }
      
      //----Issue Button of DC Page
      @FindBy(xpath="(//span[contains(@class,\"button-label button-label-dropDown\")])[4]")
      private WebElement btnIssueDcPage;
      public WebElement btnIssueDcPage() { return btnIssueDcPage; }
      
      //----OK Button DC User
      @FindBy(xpath="//button[contains(@name,\"Ok\")]")
      private WebElement btnOkDcUser;
      public WebElement btnOkDcUser() { return btnOkDcUser; }
      
      //----Edit Button of DC User
      @FindBy(xpath="//span[text()=\"Edit\"]")
      private WebElement btnEditDcUser;
      public WebElement btnEditDcUser() { return btnEditDcUser; }
      
      //---Actual Success Message
      @FindBy(xpath="//span[text()=\"Send To QC Succesfully\"]")
      private WebElement labelActualSuccessMessage;
      public WebElement labelActualSuccessMessage() { return labelActualSuccessMessage; }
      
      //---Item ID of DC Check
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_ItemI\")]")
      private WebElement txtItemIdDcCheck;
      public WebElement txtItemIdDcCheck() { return txtItemIdDcCheck; }
      
      //--Configuration of DC Stage
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_StandardConfigI\")]")
      private WebElement txtConfigurationDcStage;
      public WebElement txtConfigurationDcStage() { return txtConfigurationDcStage; }
      
      //---Purity of DC
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_Carat\")]")
      private WebElement txtPurityDc;
      public WebElement txtPurityDc() { return txtPurityDc; }
      
      //---Received PCs
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_Pcs\")]")
      private WebElement txtRcvPcs;
      public WebElement txtRcvPcs() { return txtRcvPcs; }
      
      //---Received Gross Weight
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_GrWeight\")]")
      private WebElement txtRcvGrossWt;
      public WebElement txtRcvGrossWt() { return txtRcvGrossWt; }
      
      //---Received Stone Weight
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_RCVStoneWeigh\")]")
      private WebElement txtRcvStoneWt;
      public WebElement txtRcvStoneWt() { return txtRcvStoneWt; }
      
      //---Reference of DC Check
      @FindBy(xpath="//div[text()=\"ReferenceNo\"]")
      private WebElement labelReferenceDcCheck;
      public WebElement labelReferenceDcCheck() { return labelReferenceDcCheck; }
      
      //----Enter Reference Number
      @FindBy(xpath="//input[contains(@name,\"FilterField_TA_DCHeaderTable_Refere\")]")
      private WebElement txtEnterReferenceNoDc;
      public WebElement txtEnterReferenceNoDc() { return txtEnterReferenceNoDc; }
      
      //---Voucher No of DC Check
      @FindBy(xpath="//div[text()=\"VoucherNo\"]")
      private WebElement labelVoucherNoDcCheck;
      public WebElement labelVoucherNoDcCheck() { return labelVoucherNoDcCheck; }
      
      //---DC Pass PCs
      @FindBy(xpath="(//input[contains(@id,\"DCPcs\")])[1]")
      private WebElement txtDcPassPcs;
      public WebElement txtDcPassPcs() { return txtDcPassPcs; }
      
      //---DC Pass Gross Weight of Header
      @FindBy(xpath="//input[contains(@id,\"DCQty\")][1]")
      private WebElement txtDcPassGrossWtHeader;
      public WebElement txtDcPassGrossWtHeader() { return txtDcPassGrossWtHeader; }
      
      //----DC Pass Net Weight of Header
      @FindBy(xpath="//input[contains(@id,\"TA_DCDetailsTable_NetWeight\")]")
      private WebElement txtDcPassNetWtHeader;
      public WebElement txtDcPassNetWtHeader() { return txtDcPassNetWtHeader; }
      
      //---From Location
      @FindBy(xpath="")
      private WebElement dropDownFromLocation;
      public WebElement dropDownFromLocation() { return dropDownFromLocation; }
      
      //---To Location
      @FindBy(xpath="")
      private WebElement dropDownToLocation;
      public WebElement dropDownToLocation() { return dropDownToLocation; }
      
      
}
