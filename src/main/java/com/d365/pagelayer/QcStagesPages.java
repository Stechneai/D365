package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class QcStagesPages extends MasterClass
{
     public QcStagesPages()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
  // ---WebElement of QcCheck
     @FindBy(xpath = "//a[text()=\"QC Check\"]")
     private WebElement labelQcCheck;
     public WebElement labelQcCheck() {
         return labelQcCheck;
     }

     // ---WebElement of Issue
     @FindBy(xpath = "(//span[contains(@class,\"button-label button-label-dropDown\")])[4]")
     private WebElement dropDownIssueQcCheck;
     public WebElement dropDownIssueQcCheck() {
         return dropDownIssueQcCheck;
     }

     // ---IssueTohm
     @FindBy(xpath ="//span[text()=\"Issue To HM\"]")
     private WebElement radioIssueTohm;
     public WebElement radioIssueTohm() {
         return radioIssueTohm;
     }

     // ---QCUser
     @FindBy(xpath = "//input[@name=\"Fld1_1\"]")
     private WebElement txtQCuser;
     public WebElement txtQCuser() {
         return txtQCuser;
     }

     // ---OkQcPerson
     @FindBy(xpath = "//span[text()=\"OK\"]")
     private WebElement btnOkQcPerson;
     public WebElement btnOkQcPerson() {
         return btnOkQcPerson;
     }

     // ---QCSuccessMessage
     @FindBy(xpath = "//span[text()=\"Send To PO Successfully\"]")
     private WebElement labelQCSuccessMessage;
     public WebElement labelQCSuccessMessage() {
         return labelQCSuccessMessage;
     }

     // ---QcRejectionTab
     @FindBy(xpath = "//span[text()=\"QC Rejection\"]")
     private WebElement tabQcRejection;
     public WebElement tabQcRejection() {
         return tabQcRejection;
     }

     // ---NewBtnOfQcRejectionTab
     @FindBy(xpath = "//span[text()=\"New\"]")
     private WebElement btnNewQcRejectionTab;
     public WebElement btnNewQcRejectionTab() {
         return btnNewQcRejectionTab;
     }

     // ---QcRejectionPcs
     @FindBy(xpath = "//input[contains(@id,\"TA_QCRejectionDetailsTable_QCRejPcs\")]")
     private WebElement txtQcRejectionPcs;
     public WebElement txtQcRejectionPcs() {
         return txtQcRejectionPcs;
     }

     // ---QcRejectionGrossWt
     @FindBy(xpath = "//input[contains(@id,\"TA_QCRejectionDetailsTable_QCRejWeight_1\")]")
     private WebElement txtQcRejectionGrossWt;
     public WebElement txtQcRejectionGrossWt() {
         return txtQcRejectionGrossWt;
     }

     // ---QCrejectionRemark
     @FindBy(xpath = "//input[contains(@id,\"TA_QCRejectionDetailsTable_QCRejectionRemark_1\")]")
     private WebElement txtQCrejectionRemark;
     public WebElement txtQCrejectionRemark() {
         return txtQCrejectionRemark;
     }

     // ---QcRejectionNetWt
     @FindBy(xpath = "//input[contains(@id,\"TA_QCRejectionDetailsTable_QCRejNetWeight_1\")]")
     private WebElement txtQcRejectionNetWt;
     public WebElement txtQcRejectionNetWt() {
         return txtQcRejectionNetWt;
     }

     // ---iIssuetoPOfromQC
     @FindBy(xpath = "//span[text()=\"Issue To PO\"]")
     private WebElement btnIssuetoPOfromQC;
     public WebElement btnIssuetoPOfromQC() {
         return btnIssuetoPOfromQC;
     }

     // ---ReferenceNoOfQCCheck
     @FindBy(xpath = "//div[text()=\"Reference No\"]")
     private WebElement labelReferenceNoOfQCCheck;
     public WebElement labelReferenceNoOfQCCheck() {
         return labelReferenceNoOfQCCheck;
     }

     // ---EnterReferenceNoInQCStage
     @FindBy(xpath = "//input[contains(@name,\"FilterField_TA_QCHeaderTable_\")]")
     private WebElement txtEnterReferenceNoInQCStage;
     public WebElement txtEnterReferenceNoInQCStage() {
         return txtEnterReferenceNoInQCStage;
     }

     // ---ApplyReferenceOfQCStage
     @FindBy(xpath = "//span[text()=\"Apply\"]")
     private WebElement btnApplyReferenceOfQCStage;
     public WebElement btnApplyReferenceOfQCStage() {
         return btnApplyReferenceOfQCStage;
     }

     // ---ItemIDOfQcStage
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_ItemId\")]")
     private WebElement txtItemIDOfQcStage;
     public WebElement txtItemIDOfQcStage() {
         return txtItemIDOfQcStage;
     }

     // ---ConfigurationOfQCItem
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_StandardConfig\")]")
     private WebElement txtConfigurationOfQCItem;
     public WebElement txtConfigurationOfQCItem() {
         return txtConfigurationOfQCItem;
     }

     // ---VoucherNoOfQCStage
     @FindBy(xpath = "//div[text()=\"Voucher No\"]")
     private WebElement labelVoucherNoOfQCStage;
     public WebElement labelVoucherNoOfQCStage() {
         return labelVoucherNoOfQCStage;
     }

     // ---QcPassPcs
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_P\")]")
     private WebElement txtQcPassPcs;
     public WebElement txtQcPassPcs() {
         return txtQcPassPcs;
     }

     // ---QcPassGrossWt
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_GrWeight\")]")
     private WebElement txtQcPassGrossWt;
     public WebElement txtQcPassGrossWt() {
         return txtQcPassGrossWt;
     }

     // ---QcPassNetWt
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_NetWeight\")]")
     private WebElement txtQcPassNetWt;
     public WebElement txtQcPassNetWt() {
         return txtQcPassNetWt;
     }

     // ---PurityOfQc
     @FindBy(xpath = "//div[text()=\"Purity Carat\"]")
     private WebElement labelPurityOfQc;
     public WebElement labelPurityOfQc() {
         return labelPurityOfQc;
     }

     // ---RemarkOfQc
     @FindBy(xpath = "//input[contains(@id,\"TA_QCRejectionDetailsTable_QCRejectionRemark\")]")
     private WebElement txtRemarkOfQc;
     public WebElement txtRemarkOfQc() {
         return txtRemarkOfQc;
     }

     // ---ReceiveDate
     @FindBy(xpath = "//input[contains(@id,\"TA_QCHeaderTable_ReceiveDate_21\")]")
     private WebElement txtReceiveDate;
     public WebElement txtReceiveDate() {
         return txtReceiveDate;
     }

     // ---FromLocation
     @FindBy(xpath = "(//input[contains(@id,\"TA_QCHeaderTable_FmInventLocationI\")])[1]")
     private WebElement txtFromLocation;
     public WebElement txtFromLocation() {
         return txtFromLocation;
     }

     // ---ToLocation
     @FindBy(xpath = "(//input[contains(@id,\"TA_QCHeaderTable_ToInventLocationI\")])[1]")
     private WebElement txtToLocation;
     public WebElement txtToLocation() {
         return txtToLocation;
     }

     // ---RcvPassStoneWT
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_RCVStoneWeight\")]")
     private WebElement txtRcvPassStoneWT;
     public WebElement txtRcvPassStoneWT() {
         return txtRcvPassStoneWT;
     }

     // ---RcvPassGrossWT
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_GrWeight\")]")
     private WebElement txtRcvPassGrossWT;
     public WebElement txtRcvPassGrossWT() {
         return txtRcvPassGrossWT;
     }

     // ---RcvPassNetWT
     @FindBy(xpath = "//input[contains(@id,\"TA_QCDetailsTable_NetWeight\")]")
     private WebElement txtRcvPassNetWT;
     public WebElement txtRcvPassNetWT() {
         return txtRcvPassNetWT;
     }

     
     
     
}
