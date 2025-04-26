package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class BatchRegistrationPages extends MasterClass
{
     
 	public BatchRegistrationPages() {
 		PageFactory.initElements(driver, this);
 		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Default timeout of 10 seconds
 	}
  
 
       
 	@FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
 	private WebElement clickModule;	
 	public WebElement lnkModule()
 	{
 	    return(clickModule);
 	}

 	//-----Jewellery
 	@FindBy(xpath="//a[text()=\"Jewellery\"]")
 	private WebElement clickJewellery;	
 	public WebElement lnkJewellery()
 	{
 	    return(clickJewellery);
 	}

 	//----Batch Registration
 	@FindBy(xpath="(//a[text()=\"Batch Registration\"])[2]")
 	private WebElement batchRegistration;	
 	public WebElement lnkBatchRegistration()
 	{
 	    return(batchRegistration);
 	}

 	//----New Button of Batch Registration
 	@FindBy(xpath="//span[text()=\"New\"]")
 	private WebElement newBtnofBatchRegistration;	
 	public WebElement btnNewBatchRegistration()
 	{
 	    return(newBtnofBatchRegistration);
 	}

 	//---WebElement of PMC
 	@FindBy(xpath="//span[text()=\"PMC\"]")
 	private WebElement PMC;	
 	public WebElement labelPMC()
 	{
 	    return(PMC);
 	}

 	//----Challan No
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_ChallanNo\")]")
 	private WebElement ChallanNo;	
 	public WebElement txtChallanNo()
 	{
 	    return(ChallanNo);
 	}

 	//----Purchase Transaction Price (100% Purity)
 	@FindBy(name="TA_BatchDocHeader_PurchTransPrice")
 	private WebElement purchaseTransPrice100;	
 	public WebElement txtPurchaseTransPrice100()
 	{
 	    return(purchaseTransPrice100);
 	}

 	//---Generate Line Button
 	@FindBy(xpath="(//span[text()=\"Generate Line\"])[1]")
 	private WebElement generateLineButton;	
 	public WebElement btnGenerateLine()
 	{
 	    return(generateLineButton);
 	}

 	//----Item ID
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_ItemId\")]")
 	private WebElement itemID;	
 	public WebElement txtItemID()
 	{
 	    return(itemID);
 	}

 	//---No of Pieces
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NoOfPieces\")]")
 	private WebElement noOfPcs;	
 	public WebElement txtNoOfPcs()
 	{
 	    return(noOfPcs);
 	}

 	//----Gross Weight
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_GrossWeight\")]")
 	private WebElement GrossWT;	
 	public WebElement txtGrossWT()
 	{
 	    return(GrossWT);
 	}

 	//---Net Weight
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NetWeight\")]")
 	private WebElement NetWt;	
 	public WebElement txtNetWt()
 	{
 	    return(NetWt);
 	}

 	//---PreTag Line
 	@FindBy(xpath="//span[text()=\"Pre Tag Lines\"]")
 	private WebElement PretagLine;	
 	public WebElement labelPretagLine()
 	{
 	    return(PretagLine);
 	}

 	//---Quantity of PreTag Line
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_Quant\")]")
 	private WebElement QtyofPretagLine;	
 	public WebElement txtQtyofPretagLine()
 	{
 	    return(QtyofPretagLine);
 	}

 	//---Purchase Transaction Value of PreTag Line
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_LineAmount\")]")
 	private WebElement PurchTransValueofpretagline;	
 	public WebElement txtPurchTransValueofpretagline()
 	{
 	    return(PurchTransValueofpretagline);
 	}

 	//---Purchase Transaction Price of PreTag Line
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_PurchPrice\")]")
 	private WebElement PurchTransPriceofpretagline;	
 	public WebElement txtPurchTransPriceofpretagline()
 	{
 	    return(PurchTransPriceofpretagline);
 	}

 	//----Release Button
 	@FindBy(xpath="(//span[text()=\"Release\"])[2]")
 	private WebElement releaseBtn;	
 	public WebElement btnRelease()
 	{
 	    return(releaseBtn);
 	}

 	//---Making Item No	
 	@FindBy(xpath="//input[contains(@id,\"FormGridControl2_ServiceIte\")]")
 	private WebElement makingItemNo;	
 	public WebElement txtMakingItemNo()
 	{
 	    return(makingItemNo);
 	}

 	//---Making Rate of PMC	
 	@FindBy(xpath="//input[contains(@id,\"AcxPurchaseMakingCharges_MakingRate\")]")
 	private WebElement makingRateofPMC;	
 	public WebElement txtMakingRateofPMC()
 	{
 	    return(makingRateofPMC);
 	}

 	//---Save Button
 	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
 	private WebElement Save_B;
 	public WebElement btnSave()
 	{
 	    return(Save_B);
 	}

 	//---Notification Button
 	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
 	private WebElement expandNotification;
 	public WebElement btnNotification()
 	{
 	    return(expandNotification);
 	}

 	//---Close Error Message
 	@FindBy(name = "Close")
 	private WebElement errorClose;
 	public WebElement btnErrorClose()
 	{
 	    return(errorClose);
 	}

 	//---Voucher No (Provisional Parcel)
 	@FindBy(xpath="//*[@id=\"TA_ParcelReceiveHeaderTable_VoucherNo1_3_0_0_input\"]")
 	private WebElement voucherNoprovisionalParcel;	
 	public WebElement btnVoucherNoprovisionalParcel()
 	{
 	    return(voucherNoprovisionalParcel);
 	}

 	//--Close Error Message
 	@FindBy(xpath="//span[@id=\"SysBoxForm_3_Close_label\"]")
 	private WebElement closeErrorMessage;	
 	public WebElement btnCloseErrorMessage()
 	{
 	    return(closeErrorMessage);
 	}

 	//---Invalid Error Message
 	@FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
 	private WebElement invalidError;
 	public WebElement labelInvalidErrorMsg()
 	{
 	    return(invalidError);
 	}

 	//---Duplicate Record Error Message
 	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
 	private WebElement duplicateError;
 	public WebElement labelDuplicateError()
 	{
 	    return(duplicateError);
 	}

 	//---Post Button
 	@FindBy(xpath="//span[text()=\"Post\"]")
 	private WebElement postBtn;	
 	public WebElement btnPost()
 	{
 	    return(postBtn);
 	}

 	//---Challan No of BR
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_Chall\")]")
 	private WebElement challanNoofBR;	
 	public WebElement txtChallanNoofBR()
 	{
 	    return(challanNoofBR);
 	}

 	//---Current Warehouse of BR
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_InventLocati\")]")
 	private WebElement currentWareHouseofBR;	
 	public WebElement dropDownCurrentWareHouseofBR()
 	{
 	    return(currentWareHouseofBR);
 	}

 	//---Current Site of BR
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_InventSite\")]")
 	private WebElement currentSiteofBR;	
 	public WebElement dropDownCurrentSiteofBR()
 	{
 	    return(currentSiteofBR);
 	}

 	//---Vendor Account
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_VendAccount\")]")
 	private WebElement vendorAccount;	
 	public WebElement dropDownVendorAccount()
 	{
 	    return(vendorAccount);
 	}

 	//---Purchase Transaction (100% Purity)
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_PurchTran\")]")
 	private WebElement purchTransof100_Purity;	
 	public WebElement txtPurchTransof100_Purity()
 	{
 	    return(purchTransof100_Purity);
 	}

 	//---Purchase Transaction Rate (99.50% Purity)
 	@FindBy(xpath="(//input[contains(@name,\"TA_BatchDocHeader_Rate\")])[2]")
 	private WebElement purchTransRateof99_Purity;	
 	public WebElement txtPurchTransRateof99_Purity()
 	{
 	    return(purchTransRateof99_Purity);
 	}
	
 	//---Job Work Toggle
 	@FindBy(xpath="(//span[contains(@class,\"toggle-thumb\")])[1]")
 	private WebElement jobWorkToggle;	
 	public WebElement btnToggleJobWorkToggle()
 	{
 	    return(jobWorkToggle);
 	}

 	//---Acceptor Both
 	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_KaragirTy\")]")
 	private WebElement acceptorBoth;	
 	public WebElement dropDownAcceptorBoth()
 	{
 	    return(acceptorBoth);
 	}

 	//---Accept Amount of BR
 	@FindBy(xpath="//input[contains(@name,\"AcceptAmount\")]")
 	private WebElement acceptAmountofBR;	
 	public WebElement txtAcceptAmountofBR()
 	{
 	    return(acceptAmountofBR);
 	}

 	//---Reject Amount of BR
 	@FindBy(xpath="//input[contains(@name,\"RejectAmount\")]")
 	private WebElement reJectAmountofBR;	
 	public WebElement txtReJectAmountofBR()
 	{
 	    return(reJectAmountofBR);
 	}

 	//---Total Amount
 	@FindBy(xpath="//input[contains(@name,\"TotalAmount\")]")
 	private WebElement totalAmount;	
 	public WebElement txtTotalAmount()
 	{
 	    return(totalAmount);
 	}

 	//---Net Weight of BR Header
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NetWeight\")]")
 	private WebElement netWtofBRheader;	
 	public WebElement txtNetWtofBRheader()
 	{
 	    return(netWtofBRheader);
 	}

 	//---New Button of PMC
 	@FindBy(xpath="//button[contains(@name,\"CmdBtnNewPMC\")]")
 	private WebElement newBtnofPMC;	
 	public WebElement btnNewOfPMC()
 	{
 	    return(newBtnofPMC);
 	}

 	//---Item Category of PMC
 	@FindBy(xpath="//input[contains(@id,\"FormGridControl2_ItemCategory_\")]")
 	private WebElement itemcategorYofPMC;	
 	public WebElement dropDownItemcategorYofPMC()
 	{
 	    return(itemcategorYofPMC);
 	}

 	//---Delete Button of PMC
 	@FindBy(xpath="(//span[text()=\"Delete\"])[3]")
 	private WebElement deleteBtnofPMC;	
 	public WebElement btnDeleteofPMC()
 	{
 	    return(deleteBtnofPMC);
 	}

 	//---Making Type of PMC
 	@FindBy(xpath="//input[contains(@id,\"FormGridControl2_RateType\")]")
 	private WebElement makingTypeofPMC;	
 	public WebElement dropDownMakingTypeofPMC()
 	{
 	    return(makingTypeofPMC);
 	}

 	//---Making Amount of PreTag Header
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_MakingAmount\")]")
 	private WebElement makingAmountofPreTagHeader;	
 	public WebElement txtMakingAmountofPreTagHeader()
 	{
 	    return(makingAmountofPreTagHeader);
 	}

 	//---Pre Tag Header
 	@FindBy(xpath="//span[text()=\"Pre Tag Header\"]")
 	private WebElement preTagheader;	
 	public WebElement txtPreTagheader()
 	{
 	    return(preTagheader);
 	}

 	//---Arrow of Item Category
 	@FindBy(xpath="(//div[contains(@class,\"dyn-container _31p7er dyn-svg-symbol dyn-combobo\")])[2]")
 	private WebElement arrowofItemcategory;	
 	public WebElement iconOfItemcategory()
 	{
 	    return(arrowofItemcategory);
 	}

 	//----Reference Document Number
 	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_PurchId\")]")
 	private WebElement referenceDocNO;	
 	public WebElement txtReferenceDocNO()
 	{
 	    return(referenceDocNO);
 	}

 	//---PreTag Header Label
 	@FindBy(xpath="//span[text()='Pre Tag Header']")
 	private WebElement pretagheader;	
 	public WebElement labelPretagHeader()
 	{
 	    return(pretagheader);
 	}

 	//---Number of Pieces (NOP)
 	@FindBy(xpath = "//input[contains(@id, 'FormGridControl2_Qty') and contains(@id, '_input')]")
 	private WebElement nop;
 	public WebElement txtNop() 
 	{
 	    return(nop);
 	}

 	//---Purchase Transaction Value
 	@FindBy(xpath = "//input[contains(@id, 'FormGridControl2_PurchTransValue') and contains(@id, '_input')]")
 	private WebElement value;
 	public WebElement txtValue() 
 	{
 	    return(value);
 	}

} 
     

