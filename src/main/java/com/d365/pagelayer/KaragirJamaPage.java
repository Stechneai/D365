package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class KaragirJamaPage extends MasterClass 
{
   public KaragirJamaPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   //---module
   @FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
  	private WebElement btnclickModule;	
  	public WebElement btnclickModule()
  	{
  		return btnclickModule;
  	}
  	
  	//----accountpayble
  	 @FindBy(xpath="//a[text()=\"Accounts payable\"]")
   	private WebElement btnaccountpayble;	
   	public WebElement btnaccountpayble()
   	{
   		return btnaccountpayble;
   	}
  	
  //----allPurchaseOrder
  	@FindBy(xpath="//a[text()=\"All purchase orders\"]")
  	private WebElement btnallPurchaseOrder ;	
  	public WebElement btnallPurchaseOrder()
  	{
  		return btnallPurchaseOrder ;
  	}
  	
  //----newBtnOfpo
  	@FindBy(xpath="//span[text()=\"New\"]")
  	private WebElement btnnewBtnOfpo ;	
  	public WebElement btnnewBtnOfpo ()
  	{
  		return btnnewBtnOfpo;
  	}
  	
  //----vendorAccount
  	@FindBy(xpath="//input[contains(@name,\"PurchTable_OrderAccount\")]")
  	private WebElement btnvendorAccount ;	
  	public WebElement btnvendorAccount()
  	{
  		return btnvendorAccount ;
  	}
  	
  //----okBtn
  	@FindBy(xpath="//span[text()=\"OK\"]")
  	private WebElement btnokBtn ;	
  	public WebElement btnokBtn()
  	{
  		return btnokBtn;
  	}
  	
  //----itemNumber
  	@FindBy(xpath="//input[contains(@id,\"PurchLine_ItemId\")]")
  	private WebElement dropDownitemNumber;	
  	public WebElement dropDownitemNumber()
  	{
  		return dropDownitemNumber;
  	}
  	
  //----QtyofPO
  	@FindBy(xpath="//input[contains(@id,\"PurchLine_PurchQty\")]")
  	private WebElement txtAreaQtyofPO ;	
  	public WebElement txtAreaQtyofPO()
  	{
  		return txtAreaQtyofPO;
  	}
  	
  //----unitPrice
  	@FindBy(xpath="//input[contains(@id,\"PurchLine_PurchPriceGrid\")]")
  	private WebElement txtAreaunitPrice;	
  	public WebElement txtAreaunitPrice()
  	{
  		return txtAreaunitPrice ;
  	}
  	
  //----purchaseBtn
  	@FindBy(xpath="//span[text()=\"Purchase\"]")
  	private WebElement btnpurchaseBtn ;	
  	public WebElement btnpurchaseBtn()
  	{
  		return btnpurchaseBtn;
  	}
  	
  //----confirmBtn
  	@FindBy(xpath="//span[text()=\"Confirm\"]")
  	private WebElement btnconfirmBtn ;	
  	public WebElement btnconfirmBtn ()
  	{
  		return btnconfirmBtn;
  	}
  	
  //----poRateType
  	@FindBy(xpath="//input[contains(@name,\"PurchTable_AcxPORateType\")]")
  	private WebElement dropDownpoRateType ;	
  	public WebElement dropDownpoRateType()
  	{
  		return dropDownpoRateType;
  	}
  	
  //----backButton
  	@FindBy(xpath="//button[contains(@id,\"purchtablelistpage_3_SystemDefinedCloseB\")]")
  	private WebElement btnbackButton ;	
  	public WebElement btnbackButton()
  	{
  		return btnbackButton;
  	}
  	
  	
  	 //----poNumber
  	@FindBy(xpath="//*[@id=\"purchtablelistpage_3_HeaderTitle\"]")
  	private WebElement txtAreapoNumber ;	
  	public WebElement txtAreapoNumber()
  	{
  		return txtAreapoNumber;
  	}
  	
  //----filterPONumber
  	@FindBy(xpath="(//div[contains(text(),\"Purchase order\")])[1]")
  	private WebElement searchfilterPONumber ;	
  	public WebElement searchfilterPONumber ()
  	{
  		return searchfilterPONumber;
  	}
  	
  //----enterPoNoinFilter
  	@FindBy(xpath="//input[contains(@id,\"__FilterField_PurchTable_PurchIdAdvanced_Purch\")]")
  	private WebElement txtenterPoNoinFilter ;	
  	public WebElement txtenterPoNoinFilter()
  	{
  		return txtenterPoNoinFilter;
  	}
  	
  //----applyBtnofFilter
  	@FindBy(xpath="//span[text()=\"Apply\"]")
  	private WebElement btnapplyBtnofFilter;	
  	public WebElement btnapplyBtnofFilter()
  	{
  		return btnapplyBtnofFilter;
  	}
  	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement btnSave_B;
 
	public WebElement btnSave_B() {
		return btnSave_B;
	}
	
	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement btnexpandNotification;
 
	public WebElement btnexpandNotification() {
		return btnexpandNotification;
	}
 
	@FindBy(name = "Close")
	WebElement btnerrorClose;
 
	public WebElement btnerrorClose()
	{
		return btnerrorClose;
	}
 
 
	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement btnNoteOpen;
	public WebElement btnNoteOpen() {
	    return btnNoteOpen;
	}

	@FindBy(xpath = "//span[text()=\"Standard view\"]")
	private WebElement labelStandardView;
	public WebElement labelStandardView() {
	    return labelStandardView;
	}

	@FindBy(xpath = "//span[text()=\"My view1\"]")
	private WebElement selectMyView;
	public WebElement selectMyView() {
	    return selectMyView;
	}

	@FindBy(xpath = "//div[contains(@id,\"purchtablelistpage_1_LineViewHeader_container\")]")
	private WebElement otherField;
	public WebElement otherField() {
	    return otherField;
	}

	@FindBy(xpath = "//a[text()=\"Jewellery\"]")
	private WebElement linkJewellery;
	public WebElement linkJewellery() {
	    return linkJewellery;
	}

	@FindBy(xpath = "(//a[text()=\"Batch Registration\"])[2]")
	private WebElement linkBatchRegistration;
	public WebElement linkBatchRegistration() {
	    return linkBatchRegistration;
	}

	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement btnNewBatchRegistration;
	public WebElement btnNewBatchRegistration() {
	    return btnNewBatchRegistration;
	}

	@FindBy(xpath="//span[text()=\"PMC\"]")
	private WebElement labelPMC;
	public WebElement labelPMC() {
	    return labelPMC;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_ChallanNo\")]")
	private WebElement txtChallanNo;
	public WebElement txtChallanNo() {
	    return txtChallanNo;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_PurchTransPrice\")]")
	private WebElement txtPurchTransPrice100;
	public WebElement txtPurchTransPrice100() {
	    return txtPurchTransPrice100;
	}

	@FindBy(xpath="(//span[text()=\"Generate Line\"])[1]")
	private WebElement btnGenerateLine;
	public WebElement btnGenerateLine() {
	    return btnGenerateLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_ItemId\")]")
	private WebElement txtItemID;
	public WebElement txtItemID() {
	    return txtItemID;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NoOfPieces\")]")
	private WebElement txtNoOfPcs;
	public WebElement txtNoOfPcs() {
	    return txtNoOfPcs;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_GrossWeight\")]")
	private WebElement txtGrossWT;
	public WebElement txtGrossWT() {
	    return txtGrossWT;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NetWeight\")]")
	private WebElement txtNetWt;
	public WebElement txtNetWt() {
	    return txtNetWt;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_PurchTransPrice\")]")
	private WebElement txtPurchTransPrice;
	public WebElement txtPurchTransPrice() {
	    return txtPurchTransPrice;
	}

	@FindBy(xpath="//span[text()=\"Pre Tag Lines\"]")
	private WebElement labelPretagLine;
	public WebElement labelPretagLine() {
	    return labelPretagLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_Quantity\")]")
	private WebElement txtQtyOfPretagLine;
	public WebElement txtQtyOfPretagLine() {
	    return txtQtyOfPretagLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_LineAmount\")]")
	private WebElement txtPurchTransValueOfPretagLine;
	public WebElement txtPurchTransValueOfPretagLine() {
	    return txtPurchTransValueOfPretagLine;
	}

	@FindBy(xpath="(//span[text()=\"Release\"])[2]")
	private WebElement btnRelease;
	public WebElement btnRelease() {
	    return btnRelease;
	}

	@FindBy(xpath="//input[contains(@id,\"FormGridControl2_ServiceIte\")]")
	private WebElement txtMakingItemNo;
	public WebElement txtMakingItemNo() {
	    return txtMakingItemNo;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPurchaseMakingCharges_MakingRat\")]")
	private WebElement txtMakingRate;
	public WebElement txtMakingRate() {
	    return txtMakingRate;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_InventLocationId\")]")
	private WebElement txtCurrentWarehouse;
	public WebElement txtCurrentWarehouse() {
	    return txtCurrentWarehouse;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_InventSiteId\")]")
	private WebElement txtCurrentSite;
	public WebElement txtCurrentSite() {
	    return txtCurrentSite;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_wMSLocationId\")]")
	private WebElement txtLocation;
	public WebElement txtLocation() {
	    return txtLocation;
	}

	@FindBy(xpath="//input[contains(@name,\"TA_BatchDocHeader_VendAccount\")]")
	private WebElement txtVendorAccountOfBR;
	public WebElement txtVendorAccountOfBR() {
	    return txtVendorAccountOfBR;
	}

	@FindBy(xpath="(//span[text()=\"New\"])[2]")
	private WebElement btnNewPreTagHeader;
	public WebElement btnNewPreTagHeader() {
	    return btnNewPreTagHeader;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_ItemI\")]")
	private WebElement txtItemIdOfBRPreTagHeader;
	public WebElement txtItemIdOfBRPreTagHeader() {
	    return txtItemIdOfBRPreTagHeader;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_PurchId_\")]")
	private WebElement txtReferenceDocNo;
	public WebElement txtReferenceDocNo() {
	    return txtReferenceDocNo;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_VariantId\")]")
	private WebElement txtVariantNumber;
	public WebElement txtVariantNumber() {
	    return txtVariantNumber;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_NoOfPieces\")]")
	private WebElement txtNoOfPcsInBR;
	public WebElement txtNoOfPcsInBR() {
	    return txtNoOfPcsInBR;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_GrossWeigh\")]")
	private WebElement txtGrossWtInBR;
	public WebElement txtGrossWtInBR() {
	    return txtGrossWtInBR;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_PurchaseCost\")]")
	private WebElement txtPurchaseCostOfBR;
	public WebElement txtPurchaseCostOfBR() {
	    return txtPurchaseCostOfBR;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_PurchTransPrice\")]")
	private WebElement txtPurchTransPriceOfBRTagHeader;
	public WebElement txtPurchTransPriceOfBRTagHeader() {
	    return txtPurchTransPriceOfBRTagHeader;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_carat\")]")
	private WebElement txtPurityInBRTagHeader;
	public WebElement txtPurityInBRTagHeader() {
	    return txtPurityInBRTagHeader;
	}

	@FindBy(xpath="//span[contains(@id,\"acxbatchregistration_7_TA_BatchDocHeader_IsJobWork_to\")]")
	private WebElement btnIsJobworkToggle;
	public WebElement btnIsJobworkToggle() {
	    return btnIsJobworkToggle;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_ItemId_627\")]")
	private WebElement txtItemIdOfPreTagLine;
	public WebElement txtItemIdOfPreTagLine() {
	    return txtItemIdOfPreTagLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_VariantId\")]")
	private WebElement txtVariantIdOfPreTagLine;
	public WebElement txtVariantIdOfPreTagLine() {
	    return txtVariantIdOfPreTagLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_Quantity_6277_0_0_input\")]")
	private WebElement txtQtyOfPreTagLine;
	public WebElement txtQtyOfPreTagLine() {
	    return txtQtyOfPreTagLine;
	}

	@FindBy(xpath="//input[contains(@id,\"AcxPreTagLines_GrossWeight\")]")
	private WebElement txtGrossWtOfPreTagLine;
	public WebElement txtGrossWtOfPreTagLine() 
	{
	    return txtGrossWtOfPreTagLine;
	}

}
  	
  	
  	

