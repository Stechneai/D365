package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PoCheckPage extends MasterClass {
	public PoCheckPage() {
		PageFactory.initElements(driver, this);
	}
	// ---PoCheck
	@FindBy(xpath = "//a[text()=\"PO Check\"]")
	private WebElement linkPoCheck;

	public WebElement linkPoCheck() {
	    return linkPoCheck;
	}

	// ---DetailsofPO
	@FindBy(xpath = "//span[text()=\"Details\"]")
	private WebElement btnDetailsOfPO;

	public WebElement btnDetailsOfPO() {
	    return btnDetailsOfPO;
	}

	// ---AutoPoAdjust
	@FindBy(xpath = "//span[text()=\"Auto PO Adjust\"]")
	private WebElement btnAutoPoAdjust;

	public WebElement btnAutoPoAdjust() {
	    return btnAutoPoAdjust;
	}

	// ---UpdateButton
	@FindBy(xpath = "//span[text()=\"Update\"]")
	private WebElement btnUpdate;

	public WebElement btnUpdate() {
	    return btnUpdate;
	}

	// ---VoucherNo
	@FindBy(xpath = "//input[@name=\"TA_ParcelReceiveHeaderTable_VoucherNo\"]")
	private WebElement txtVoucherNo;

	public WebElement txtVoucherNo() {
	    return txtVoucherNo;
	}

	// ---ReferenceNo
	@FindBy(xpath = "//div[text()=\"ReferenceNo\"]")
	private WebElement lblReferenceNo;

	public WebElement lblReferenceNo() {
	    return lblReferenceNo;
	}

	// ---enterReferenceNo
	@FindBy(xpath = "//input[contains(@name,\"FilterField_TA_POHeaderTable_ReferenceNo_\")]")
	private WebElement txtEnterReferenceNo;

	public WebElement txtEnterReferenceNo() {
	    return txtEnterReferenceNo;
	}

	// ---ApplyButtonofReferenceNo
	@FindBy(name = "TA_POHeaderTable_ReferenceNo_ApplyFilters")
	private WebElement btnApplyReferenceNo;

	public WebElement btnApplyReferenceNo() {
	    return btnApplyReferenceNo;
	}

	// ---refernceclearfield
	@FindBy(name = "FilterField_TA_POHeaderTable_ReferenceNo_ReferenceNo_Input_0")
	private WebElement txtReferenceClearField;

	public WebElement txtReferenceClearField() {
	    return txtReferenceClearField;
	}

	// ---edit
	@FindBy(xpath = "//span[text()=\"Edit\"]")
	private WebElement btnEdit;

	public WebElement btnEdit() {
	    return btnEdit;
	}

	// ---PoCompleteOk
	@FindBy(xpath = "//span[text()=\"OK\"]")
	private WebElement btnPoCompleteOk;

	public WebElement btnPoCompleteOk() {
	    return btnPoCompleteOk;
	}

	// ---PoCheckUser
	@FindBy(xpath = "//input[contains(@name,\"Fld1_1\")]")
	private WebElement txtPoCheckUser;

	public WebElement txtPoCheckUser() {
	    return txtPoCheckUser;
	}

	// ---OkButton
	@FindBy(xpath = "//span[text()=\"OK\"]")
	private WebElement btnOk;

	public WebElement btnOk() {
	    return btnOk;
	}

	// ---PoCompleteSuccesmsg
	@FindBy(xpath = "//span[text()=\"PO Succesfully Compleate.\"]")
	private WebElement lblPoCompleteSuccessMsg;

	public WebElement lblPoCompleteSuccessMsg() {
	    return lblPoCompleteSuccessMsg;
	}

	// ---poPassPcs
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_Pcs\")]")
	private WebElement txtPoPassPcs;

	public WebElement txtPoPassPcs() {
	    return txtPoPassPcs;
	}

	// ---PoPassGrossWt
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_GrWeight\")]")
	private WebElement txtPoPassGrossWt;

	public WebElement txtPoPassGrossWt() {
	    return txtPoPassGrossWt;
	}

	// ---PoPassNetWtofHeader
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_NetWeight\")]")
	private WebElement txtPoPassNetWtofHeader;

	public WebElement txtPoPassNetWtofHeader() {
	    return txtPoPassNetWtofHeader;
	}

	// ---voucherNoPoCheck
	@FindBy(xpath = "//input[contains(@id,\"TA_POHeaderTable_ReferenceNo_1\")]")
	private WebElement txtVoucherNoPoCheck;

	public WebElement txtVoucherNoPoCheck() {
	    return txtVoucherNoPoCheck;
	}

	// ---itemIdofPoHeader
	@FindBy(xpath = "//input[contains(@id,\"TA_POCheckPurchaseOrder_ItemId\")]")
	private WebElement txtItemIdofPoHeader;

	public WebElement txtItemIdofPoHeader() {
	    return txtItemIdofPoHeader;
	}

	// ---configuration
	@FindBy(xpath = "(//div[text()=\"Configuration\"])[2]")
	private WebElement lblConfiguration;

	public WebElement lblConfiguration() {
	    return lblConfiguration;
	}

	// ---PurityCarate
	@FindBy(xpath = "(//div[text()=\"Purity Carat\"])[2]")
	private WebElement lblPurityCarat;

	public WebElement lblPurityCarat() {
	    return lblPurityCarat;
	}

	// ---acceptedPcs
	@FindBy(xpath = "//input[contains(@id,\"TA_POCheckPurchaseOrder_AcceptedPCS\")]")
	private WebElement txtAcceptedPcs;

	public WebElement txtAcceptedPcs() {
	    return txtAcceptedPcs;
	}

	// ---accepytedGrossWt
	@FindBy(xpath = "//input[contains(@id,\"TA_POCheckPurchaseOrder_AcceptedGrossWt\")]")
	private WebElement txtAccepytedGrossWt;

	public WebElement txtAccepytedGrossWt() {
	    return txtAccepytedGrossWt;
	}

	// ---acceptednetWt
	@FindBy(xpath = "//input[contains(@id,\"TA_POCheckPurchaseOrder_AcceptedNetWt\")]")
	private WebElement txtAcceptedNetWt;

	public WebElement txtAcceptedNetWt() {
	    return txtAcceptedNetWt;
	}

	// ---PoNoofDetails
	@FindBy(xpath = "//div[text()=\"PO NO.\"]")
	private WebElement lblPoNoofDetails;

	public WebElement lblPoNoofDetails() {
	    return lblPoNoofDetails;
	}

	// ---pendingPcs
	@FindBy(xpath = "//div[text()=\"Pending Pcs\"]")
	private WebElement lblPendingPcs;

	public WebElement lblPendingPcs() {
	    return lblPendingPcs;
	}

	// ---itemIDofPoDetails
	@FindBy(xpath = "(//div[text()=\"Item Id\"])[2]")
	private WebElement lblItemIDofPoDetails;

	public WebElement lblItemIDofPoDetails() {
	    return lblItemIDofPoDetails;
	}

	// ---pcsPoDetails
	@FindBy(xpath = "//div[text()=\"Pcs\"]")
	private WebElement lblPcsPoDetails;

	public WebElement lblPcsPoDetails() {
	    return lblPcsPoDetails;
	}

	// ---pocompletelast
	@FindBy(xpath = "(//span[text()=\"PO Complete\"])[2]")
	private WebElement btnPoCompleteLast;

	public WebElement btnPoCompleteLast() {
	    return btnPoCompleteLast;
	}

	// ---pocompletes
	@FindBy(xpath = "//span[text()=\"PO Complete\"]")
	private WebElement btnPoComplete;

	public WebElement btnPoComplete() {
	    return btnPoComplete;
	}

	// ---applyBtnafterautoadst
	@FindBy(xpath = "//*[@id=\"__TA_POHeaderTable_ReferenceNo_ApplyFilters_label\"]")
	private WebElement btnApplyAfterAutoAdjust;

	public WebElement btnApplyAfterAutoAdjust() {
	    return btnApplyAfterAutoAdjust;
	}

	// ---applybtnforsecondtime
	@FindBy(xpath = "//span[text()=\"Apply\"]")
	private WebElement btnApplyForSecondTime;

	public WebElement btnApplyForSecondTime() {
	    return btnApplyForSecondTime;
	}

	// ---selectLine
	@FindBy(xpath = "//*[@id=\"Grid_1831_0-row-0\"]/div[1]/div[1]/div/div/div/div/div/div")
	private WebElement btnSelectLine;

	public WebElement btnSelectLine() {
	    return btnSelectLine;
	}

	// ---PoPassNetWt
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_Net\")]")
	private WebElement txtPoPassNetWt;

	public WebElement txtPoPassNetWt() {
	    return txtPoPassNetWt;
	}

	// ---itemofPoDetails
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_ItemId\")]")
	private WebElement txtItemofPoDetails;

	public WebElement txtItemofPoDetails() {
	    return txtItemofPoDetails;
	}

	// ---configurationofPoDetails
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_StandardConfi\")]")
	private WebElement txtConfigurationofPoDetails;

	public WebElement txtConfigurationofPoDetails() {
	    return txtConfigurationofPoDetails;
	}

	// ---purityOfPoDetails
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_Car\")]")
	private WebElement txtPurityOfPoDetails;

	public WebElement txtPurityOfPoDetails() {
	    return txtPurityOfPoDetails;
	}

	// ---ItemIDofPocheck
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_ItemId_\")]")
	private WebElement txtItemIDofPocheck;

	public WebElement txtItemIDofPocheck() {
	    return txtItemIDofPocheck;
	}

	// ---stoneNameofPoCheck
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_StoneName\")]")
	private WebElement txtStoneNameofPoCheck;

	public WebElement txtStoneNameofPoCheck() {
	    return txtStoneNameofPoCheck;
	}

	// ---stoneNameVariant
	@FindBy(xpath = "//input[contains(@id,\"TA_PODetailsTable_StoneVariantId\")]")
	private WebElement txtStoneNameVariant;

	public WebElement txtStoneNameVariant() {
	    return txtStoneNameVariant;
	}

    
    
	

}
