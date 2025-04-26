package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PORateTypePages extends MasterClass {
	public PORateTypePages() {
		PageFactory.initElements(driver, this);
	}

	// -----Module
		@FindBy(xpath = "//div[@id=\"navPaneModuleID\"]")
		private WebElement btnmodule;

		public WebElement btnmodule() {
		    return btnmodule;
		}

		// -----Jewellery
		@FindBy(xpath = "//a[text()=\"Jewellery\"]")
		private WebElement btnjewellery;

		public WebElement btnjewellery() {
		    return btnjewellery;
		}

		// -----Provisional Parcel
		@FindBy(xpath = "//a[contains(text(),\"Provisional Parc\")]")
		private WebElement btnprovisionalParcel;

		public WebElement btnprovisionalParcel() {
		    return btnprovisionalParcel;
		}

		// -----New button
		@FindBy(xpath = "(//span[text()=\"New\"])[1]")
		private WebElement btnNew;

		public WebElement btnNew() {
		    return btnNew;
		}

		// ---Receive from
		@FindBy(xpath = "//input[@name=\"TA_ParcelReceiveHeaderTable_SourceType\"]")
		private WebElement txtReceiveFrom;

		public WebElement txtReceiveFrom() {
		    return txtReceiveFrom;
		}

		// ---Karigar/Vendor Code *
		@FindBy(xpath = "//input[@name=\"TA_ParcelReceiveHeaderTable_karigarCode\"]")
		private WebElement txtVendorCode;

		public WebElement txtVendorCode() {
		    return txtVendorCode;
		}

		// ---Chalan No
		@FindBy(xpath = "//input[@name=\"TA_ParcelReceiveHeaderTable_DocumentNum\"]")
		private WebElement txtChallanNo;

		public WebElement txtChallanNo() {
		    return txtChallanNo;
		}

		// ---Warehouse
		@FindBy(xpath = "//input[@name=\"TA_ParcelReceiveHeaderTable_InventLocationId\"]")
		private WebElement txtWareHouse;

		public WebElement txtWareHouse() {
		    return txtWareHouse;
		}

		// ---new_parcel_receive_details
		@FindBy(xpath = "(//span[text()=\"New\"])[2]")
		private WebElement btnNewParcelReceive;

		public WebElement btnNewParcelReceive() {
		    return btnNewParcelReceive;
		}

		// ----ItemID
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")]")
		private WebElement txtItemID;

		public WebElement txtItemID() {
		    return txtItemID;
		}

		// ---Configuration
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Stand\")]")
		private WebElement txtConfiguration;

		public WebElement txtConfiguration() {
		    return txtConfiguration;
		}

		// ----Purity
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_Ca\")]")
		private WebElement txtPurity;

		public WebElement txtPurity() {
		    return txtPurity;
		}

		// --RcvPcs
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRPcs\")]")
		private WebElement txtRcvPcs;

		public WebElement txtRcvPcs() {
		    return txtRcvPcs;
		}

		// -----MinimumWt
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MinWei\")]")
		private WebElement txtMinimumWT;

		public WebElement txtMinimumWT() {
		    return txtMinimumWT;
		}

		// ----MaxWt
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_MaxWei\")]")
		private WebElement txtMaximumWT;

		public WebElement txtMaximumWT() {
		    return txtMaximumWT;
		}

		// ---Rcv Gross Wt
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_PRGrWeigh\")]")
		private WebElement txtRcvGrossWt;

		public WebElement txtRcvGrossWt() {
		    return txtRcvGrossWt;
		}

		// ----Confirm button
		@FindBy(xpath = "//span[text()=\"Confirm\"]")
		private WebElement btnConfirm;

		public WebElement btnConfirm() {
		    return btnConfirm;
		}

		// ----Confirm Ok button
		@FindBy(xpath = "//button[@name=\"Ok\"]")
		private WebElement btnConfirmOK;

		public WebElement btnConfirmOK() {
		    return btnConfirmOK;
		}

		// -----Issue button
		@FindBy(xpath = "(//span[contains(@class,\"button-label button-label-dropDown\")])[4]")
		private WebElement btnIssue;

		public WebElement btnIssue() {
		    return btnIssue;
		}

		// ----Issue to Design check
		@FindBy(xpath = "//span[contains(text(),\"Issue To DC\")]")
		private WebElement chkIssueToDesign;

		public WebElement chkIssueToDesign() {
		    return chkIssueToDesign;
		}

		// ---WebElement of Home button
		@FindBy(xpath = "//div[@id=\"home\"]")
		private WebElement btnHome;

		public WebElement btnHome() {
		    return btnHome;
		}

		// --close error message
		@FindBy(xpath = "//span[@id=\"SysBoxForm_3_Close_label\"]")
		private WebElement btnCloseErrorMessage;

		public WebElement btnCloseErrorMessage() {
		    return btnCloseErrorMessage;
		}

		// ---WEbElement of RcvStoneWT
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_RCVStoneWeight\")]")
		private WebElement txtRcvStoneWT;

		public WebElement txtRcvStoneWT() {
		    return txtRcvStoneWT;
		}

		// ----WebElement of StoneName
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneName\")]")
		private WebElement txtStoneName;

		public WebElement txtStoneName() {
		    return txtStoneName;
		}

		// -----WebElement of stoneVariant
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StoneV\")]")
		private WebElement txtStoneVariant;

		public WebElement txtStoneVariant() {
		    return txtStoneVariant;
		}

		// ---InvalidChallanNoErrorMessage
		@FindBy(xpath = "//span[contains(text(),\"Challen No should not be greater than 11\")]")
		private WebElement txtInvalidChallanNoErrorMessage;

		public WebElement txtInvalidChallanNoErrorMessage() {
		    return txtInvalidChallanNoErrorMessage;
		}

		// ----IssuetoQCfromPR
		@FindBy(xpath = "//span[text()=\"Issue To QC\"]")
		private WebElement btnIssuetoQCfromPR;

		public WebElement btnIssuetoQCfromPR() {
		    return btnIssuetoQCfromPR;
		}

		// ---issueToHmfromProvisionalParcel
		@FindBy(xpath = "//span[text()=\"Issue To HM\"]")
		private WebElement btnIssueToHmfromProvisionalParcel;

		public WebElement btnIssueToHmfromProvisionalParcel() {
		    return btnIssueToHmfromProvisionalParcel;
		}

		// ---IssuetoLMfromProvisionalParcel
		@FindBy(xpath = "//span[text()=\"Issue To LM\"]")
		private WebElement btnIssuetoLMfromProvisionalParcel;

		public WebElement btnIssuetoLMfromProvisionalParcel() {
		    return btnIssuetoLMfromProvisionalParcel;
		}

		// ---IsuuetoPofromProvisionalParcel
		@FindBy(xpath = "//span[text()=\"Issue To PO\"]")
		private WebElement btnIsuuetoPofromProvisionalParcel;

		public WebElement btnIsuuetoPofromProvisionalParcel() {
		    return btnIsuuetoPofromProvisionalParcel;
		}

		@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
		private WebElement btnSave;

		public WebElement btnSave() {
		    return btnSave;
		}

		// ---voucherNoprovisionalParcel
		@FindBy(xpath = "//*[@id=\"TA_ParcelReceiveHeaderTable_VoucherNo1_3_0_0_input\"]")
		private WebElement txtVoucherNoprovisionalParcel;

		public WebElement txtVoucherNoprovisionalParcel() {
		    return txtVoucherNoprovisionalParcel;
		}

		// --RejDCPCS
		@FindBy(xpath = "//div[text()=\"Rej QC Net Weight\"]")
		private WebElement txtRejDCPCS;

		public WebElement txtRejDCPCS() {
		    return txtRejDCPCS;
		}

		// ---qcNetWt
		@FindBy(xpath = "//div[contains(@id,\"TA_ParcelReceiveDetailsTable_IssQCNetWeight_206_0_hea\")]")
		private WebElement txtQcNetWt;

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

		// ---stonePcs
		@FindBy(xpath = "//input[contains(@id,\"TA_ParcelReceiveDetailsTable_NoofStonePcs\")]")
		private WebElement txtStonePcs;

		public WebElement txtStonePcs() {
		    return txtStonePcs;
		}

		// ---poRateType
		@FindBy(xpath = "//input[contains(@name,\"TA_ParcelReceiveHeaderTable_PoRateType\")]")
		private WebElement txtPoRateType;

		public WebElement txtPoRateType() {
		    return txtPoRateType;
		}

		// ---okButtonofPendingVendor
		@FindBy(xpath = "//span[text()=\"OK\"]")
		private WebElement btnOkButtonofPendingVendor;

		public WebElement btnOkButtonofPendingVendor() {
		    return btnOkButtonofPendingVendor;
		}

		// ---invoiceNochallan
		@FindBy(xpath = "//div[text()=\"Invoice No.\"]")
		private WebElement txtInvoiceNochallan;

		public WebElement txtInvoiceNochallan() {
		    return txtInvoiceNochallan;
		}

		// ---postbtnofpendingInvoice
		@FindBy(xpath = "(//span[text()=\"Post\"])[2]")
		private WebElement btnPostbtnofpendingInvoice;

		public WebElement btnPostbtnofpendingInvoice() {
		    return btnPostbtnofpendingInvoice;
		}

		// ---unfixModule
		@FindBy(xpath = "//a[text()=\"Unfix Gold Settlement\"]")
		private WebElement btnUnfixModule;

		public WebElement btnUnfixModule() {
		    return btnUnfixModule;
		}

		// ---filterinvoiceNo
		@FindBy(xpath = "(//div[text()=\"Invoice No.\"])[1]")
		private WebElement txtFilterinvoiceNo;

		public WebElement txtFilterinvoiceNo() {
		    return txtFilterinvoiceNo;
		}

		// ---enterInvoiceNo
		@FindBy(xpath = "//input[contains(@id,\"__FilterField_gridSettlementHeader_InvoiceId_Invoi\")]")
		private WebElement txtEnterInvoiceNo;

		public WebElement txtEnterInvoiceNo() {
		    return txtEnterInvoiceNo;
		}

		// ---applyBtnofInvoiceUnfix
		@FindBy(xpath = "//span[text()=\"Apply\"]")
		private WebElement btnApplyBtnofInvoiceUnfix;

		public WebElement btnApplyBtnofInvoiceUnfix() {
		    return btnApplyBtnofInvoiceUnfix;
		}

		// ---vendorOfunfix
		@FindBy(xpath = "//input[contains(@id,\"gridSettlementHeader_VendAccount\")]")
		private WebElement txtVendorOfunfix;

		public WebElement txtVendorOfunfix() {
		    return txtVendorOfunfix;
		}

		// ---invoiceRate
		@FindBy(xpath = "(//input[contains(@id,\"gridSettlementHeader_InvoiceRate\")])[1]")
		private WebElement txtInvoiceRate;

		public WebElement txtInvoiceRate() {
		    return txtInvoiceRate;
		}

		// ---invoiceQty
		@FindBy(xpath = "//input[contains(@id,\"gridSettlementHeader_InvoiceQty\")]")
		private WebElement txtInvoiceQty;

		public WebElement txtInvoiceQty() {
		    return txtInvoiceQty;
		}

		// ---invoiceNoofUnfix
		@FindBy(xpath = "//input[contains(@id,\"gridSettlementHeader_InvoiceId_206\")]")
		private WebElement txtInvoiceNoofUnfix;

		public WebElement txtInvoiceNoofUnfix() {
		    return txtInvoiceNoofUnfix;
		}

		// ---checkBoxofProductReceipt
		@FindBy(xpath = "//span[contains(@class,\"_1bmfifs dyn-checkbox-span\")]")
		private WebElement chkCheckBoxofProductReceipt;

		public WebElement chkCheckBoxofProductReceipt() {
		    return chkCheckBoxofProductReceipt;
		}

		// ---fixedRateType
		@FindBy(xpath = "//li[contains(text(),\"Fixed Rate\")]")
		private WebElement txtFixedRateType;

		public WebElement txtFixedRateType() {
		    return txtFixedRateType;
		}

		// ---unfixedRateType
		@FindBy(xpath = "//li[text()=\"Unfixed Rate\"]")
		private WebElement txtUnfixedRateType;

		public WebElement txtUnfixedRateType() {
		    return txtUnfixedRateType;
		}

		// ---jobcardRatetype
		@FindBy(xpath = "//li[text()=\"JobCard\"]")
		private WebElement txtJobcardRatetype;

		public WebElement txtJobcardRatetype() {
		    return txtJobcardRatetype;
		}

		// ---rateTypeforKaragir
		@FindBy(xpath = "//input[contains(@name,\"TA_ParcelReceiveHeaderTable_PoRateType\")]")
		private WebElement txtRateTypeforKaragir;

		public WebElement txtRateTypeforKaragir() {
		    return txtRateTypeforKaragir;
		}

		// ---unfixmodulediaplay
		@FindBy(xpath = "//span[text()=\"Unfix Gold Settlement\"]")
		private WebElement txtUnfixmodulediaplay;

		public WebElement txtUnfixmodulediaplay() {
		    return txtUnfixmodulediaplay;
		}

		// ---itemIdofFirstLine
		@FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")])[1]")
		private WebElement txtItemIdofFirstLine;

		public WebElement txtItemIdofFirstLine() {
		    return txtItemIdofFirstLine;
		}

		// ---itemIdoSecondLine
		@FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_ItemId\")])[2]")
		private WebElement txtItemIdoSecondLine;

		public WebElement txtItemIdoSecondLine() {
		    return txtItemIdoSecondLine;
		}

		// ---configFirstLine
		@FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StandardConfigId\")])[1]")
		private WebElement txtConfigFirstLine;

		public WebElement txtConfigFirstLine() {
		    return txtConfigFirstLine;
		}

		// ---configSecondLine
		@FindBy(xpath = "(//input[contains(@id,\"TA_ParcelReceiveDetailsTable_StandardConfigId\")])[2]")
		private WebElement txtConfigSecondLine;

		public WebElement txtConfigSecondLine()
		{
			return txtConfigSecondLine;
		}

	      
}
