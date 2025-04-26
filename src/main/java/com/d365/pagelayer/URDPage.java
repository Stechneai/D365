package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class URDPage extends MasterClass {
	public URDPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement clickModule;

	public WebElement clickModule() {
		return clickModule;
	}

	@FindBy(xpath = "//a[@data-dyn-title=\"Jewellery\"]")
	private WebElement clickJewellery;

	public WebElement clickJewellery() {
		return clickJewellery;
	}

	@FindBy(xpath = "//a[text()=\"Old Gold Note\"]")
	private WebElement clickOldGoldNote;

	public WebElement clickOldGoldNote() {
		return clickOldGoldNote;
	}

	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement clickNew;

	public WebElement clickNew() {
		return clickNew;
	}

	@FindBy(xpath = "(//input[contains(@id,'acxcustpurchtable_') and contains(@id,'_AcxCustPurchTable_CustAccount')])[1]")

	private WebElement enterCustomerCode;

	public WebElement enterCustomerCode() {
		return enterCustomerCode;
	}

	@FindBy(name = "AcxCustPurchTable_CustAccount")

	private WebElement AcxCustPurchTable_CustAccount;

	public WebElement custAccountNo() {
		return AcxCustPurchTable_CustAccount;
	}

	@FindBy(xpath = "(//input[contains(@id,'acxcustpurchtable_') and contains(@id,'_AcxCustPurchTable_AgentCode')])[1]")
	private WebElement enterSalesPersonCode;

	public WebElement enterSalesPersonCode() {
		return enterSalesPersonCode;
	}

	@FindBy(xpath = "(//input[contains(@id,'acxcustpurchtable_') and contains(@id,'_AcxCustPurchTable_PurchaseType')])[1]")
	private WebElement enterPurchaseType;

	public WebElement enterPurchaseType() {
		return enterPurchaseType;
	}

	@FindBy(xpath = "(//input[contains(@id,'acxcustpurchtable_') and contains(@id,'AcxCustPurchTable_ItemType') and contains(@id,'_input')])[1]")
	private WebElement enterItemType;

	public WebElement enterItemType() {
		return enterItemType;
	}

	@FindBy(xpath = "//span[text()=\"Add Line\"]")
	private WebElement clickAddLine;

	public WebElement clickAddLine() {
		return clickAddLine;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_Purchasecategory') and contains(@id,'_input')])[1]")
	private WebElement selectPurchaseCategory;

	public WebElement selectPurchaseCategory() {
		return selectPurchaseCategory;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_ItemId') and contains(@id,'_input')])[1]")
	private WebElement selectItemID;

	public WebElement selectItemID() {
		return selectItemID;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_StandardConfigId_') and contains(@id,'_input')])[1]")
	private WebElement selectOrnamentcategory;

	public WebElement selectOrnamentcategory() {
		return selectOrnamentcategory;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_NoOfPieces_') and contains(@id,'_input')])[1]")
	private WebElement enterNoOfPieces;

	public WebElement enterNoOfPieces() {
		return enterNoofPieces;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_TagNo_') and contains(@id,'_input')])[1]")
	private WebElement tagNo;

	public WebElement tagNo() {
		return tagNo;
	}

	@FindBy(xpath = "//span[text()='Delete Line']")
	private WebElement delete;

	public WebElement delete() {
		return delete;
	}

	@FindBy(name = "Yes")
	private WebElement deleteYes;

	public WebElement deleteYes() {
		return deleteYes;
	}

	@FindBy(xpath = " (//input[contains(@id,'gridCustMetalPurchLine_Carat') and contains(@id,'_input')])[1]")
	private WebElement selectPutiyCarat;

	public WebElement selectPutiyCarat() {
		return selectPutiyCarat;
	}

	@FindBy(xpath = " (//input[contains(@id,'gridCustMetalPurchLine_GrossWeight') and contains(@id,'_input')])[1]")
	private WebElement enterGrossWeight;

	public WebElement enterGrossWeight() {
		return enterGrossWeight;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_NetWeight') and contains(@id,'_input')])[1]")
	private WebElement enterNetWeight;

	public WebElement enterNetWeight() {
		return enterNetWeight;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_FineWt') and contains(@id,'_input')])[1]")
	private WebElement enterFineWt;

	public WebElement enterFineWt() {
		return enterFineWt;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_NoOfPieces') and contains(@id,'_input')])[1]")
	private WebElement enterNoofPieces;

	public WebElement enterNoofPieces() {
		return enterNoofPieces;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_StoneWeight') and contains(@id,'_input')])[1]")
	private WebElement enterStoneWt;

	public WebElement enterStoneWt() {
		return enterStoneWt;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_StoneWeightCt') and contains(@id,'_input')])[1]")
	private WebElement enterStoneWtCt;

	public WebElement enterStoneWtCt() {
		return enterStoneWtCt;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_PurchTransValue') and contains(@id,'_input')])[1]")
	private WebElement purchTransValue;

	public WebElement purchTransValue() {
		return purchTransValue;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_TransFineWeight') and contains(@id,'_input')])[1]")
	private WebElement transFineWt;

	public WebElement transFineWt() {
		return transFineWt;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustDiaPurchLine_MRPFormingPer') and contains(@id,'_input')])[1]")
	private WebElement mrpformingPercenetage;

	public WebElement mrpformingPercenetage() {
		return mrpformingPercenetage;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_OldTagNo') and contains(@id,'_input')])[1]")
	private WebElement oldTagNo;

	public WebElement oldTagNo() {
		return oldTagNo;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_ReferenceInvoice') and contains(@id,'_input')])[1]")
	private WebElement oldInvoiceNo;

	public WebElement oldInvoiceNo() {
		return oldInvoiceNo;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_TagGeneratedDate') and contains(@id,'_input')])[1]")
	private WebElement tagGeneratedDate;

	public WebElement tagGeneratedDate() {
		return tagGeneratedDate;
	}

	@FindBy(xpath = "//li[contains(@id,'acxcustpurchtable') and contains(@id,'CustDiaPurchLine_header')]")
	private WebElement clickPretagLine;

	public WebElement clickPretagLine() {
		return clickPretagLine;
	}

	@FindBy(xpath = "(//span[contains(@id,'acxcustpurchtable') and contains(@id,'btnAddCDPLLine_label')])[1]")
	private WebElement preAddLine;

	public WebElement preAddLine() {
		return preAddLine;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_ItemId')]")
	private WebElement preItemID;

	public WebElement preItemID() {
		return preItemID;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_Carat') and contains(@id,'input')]")
	private WebElement prePurityCarat;

	public WebElement prePurityCarat() {
		return prePurityCarat;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_Quantity_') and contains(@id,'_input')]")
	private WebElement preQuantity;

	public WebElement preQuantity() {
		return preQuantity;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_TransFineWeight') and contains(@id,'input')]")
	private WebElement preTrasnFineWt;

	public WebElement preTrasnFineWt() {
		return preTrasnFineWt;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_VariantId') and contains(@id,'input')]")
	private WebElement preVariantID;

	public WebElement preVariantID() {
		return preVariantID;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_StandardConfigId') and contains(@id,'input')]")
	private WebElement preConfigID;

	public WebElement preConfigID() {
		return preConfigID;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_StoneSize') and contains(@id,'input')]")
	private WebElement preStoneSize;

	public WebElement preStoneSize() {
		return preStoneSize;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_StoneShape') and contains(@id,'input')]")
	private WebElement preStoneShape;

	public WebElement preStoneShape() {
		return preStoneShape;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_DiamondColor') and contains(@id,'input')]")
	private WebElement preStoneColor;

	public WebElement preStoneColor() {
		return preStoneColor;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_NoofStonePcs_') and contains(@id,'_input')]")
	private WebElement preNoofStonePcs;

	public WebElement preNoofStonePcs() {
		return preNoofStonePcs;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_StoneWeightCT') and contains(@id,'input')]")
	private WebElement preStoneWtCt;

	public WebElement preStoneWtCt() {
		return preStoneWtCt;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_UOM') and contains(@id,'input')]")
	private WebElement preUom;

	public WebElement preUom() {
		return preUom;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_PurchPrice') and contains(@id,'input')]")
	private WebElement preRate;

	public WebElement preRate() {
		return preRate;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_PurchTransPrice') and contains(@id,'input')]")
	private WebElement prePurchTransPrice;

	public WebElement prePurchTransPrice() {
		return prePurchTransPrice;
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_NetWtDeduction') and contains(@id,'input')]")
	private WebElement preNetWtPostDeduction;

	public WebElement preNetWtPostDeduction() {
		return preNetWtPostDeduction;
	}

	@FindBy(xpath = "//span[text()=\"Order Status\"]")
	private WebElement clickOrderStatus;

	public WebElement clickOrderStatus() {
		return clickOrderStatus;
	}

	// span[text()="Open Estimate"]

	@FindBy(xpath = "//span[text()=\"Open Estimate\"]")
	private WebElement clickopenEstimate;

	public WebElement clickopenEstimate() {
		return clickopenEstimate;
	}

	@FindBy(xpath = "//button[@name=\"Validate\"]")
	private WebElement clickValidate;

	public WebElement clickValidate() {
		return clickValidate;
	}

	@FindBy(xpath = "//span[text()=\"Order Estimate\"]")
	private WebElement clickOrderEstimate;

	public WebElement clickOrderEstimate() {
		return clickOrderEstimate;
	}

	@FindBy(xpath = "//button[@name=\"btnCancel\"]")
	private WebElement clickCancelEstimate;

	public WebElement clickCancelEstimate() {
		return clickCancelEstimate;
	}

	@FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
	WebElement invalidError;

	public WebElement invalidErrorMsg() {
		return invalidError;
	}

	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
	WebElement duplicateError;

	public WebElement duplicateErrorMsg() {
		return duplicateError;
	}

	@FindBy(name = "Close")
	WebElement errorClose;

	public WebElement errorCloseButton() {
		return errorClose;
	}

	// span[@class="button-commandRing Back-symbol"]
	@FindBy(xpath = "//span[@class=\"button-commandRing Back-symbol\"]")
	WebElement backbutton;

	public WebElement backbutton() {

		return backbutton;
	}

	@FindBy(xpath = "//input[@name=\"AcxCustPurchTable_InventSiteId\"]")
	WebElement defaultSite;

	public WebElement defaultSite() {

		return defaultSite;
	}

	@FindBy(xpath = "//input[@name=\"AcxCustPurchTable_InventLocationId\"]")
	WebElement defaultLocation;

	public WebElement defaultLocation() {

		return defaultLocation;
	}

	// input[contains(@id,'gridCustDiaPurchLine_LineAmount_') and
	// contains(@id,'input')]
	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_LineAmount_') and contains(@id,'input')]")
	WebElement preAmount;

	public WebElement preAmount() {

		return preAmount;
	}

	// input[contains(@id,'gridCustDiaPurchLine_PurchTransValue_') and
	// contains(@id,'input')]
	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_PurchTransValue_') and contains(@id,'input')]")
	WebElement prePurchTransValue;

	public WebElement prePurchTransValue() {

		return prePurchTransValue;
	}

	// input[contains(@id,'SysGen_{DCC19525-3171-43E9-AB89-0CFE45C549E3}_') and
	// contains(@id,'input')]
	@FindBy(xpath = "(//input[contains(@id,'SysGen_{65CACBD1-B2AF-434D-BACA-CF81EFA87E92}') and contains(@id,'_input')])[1]")
	WebElement deduction;

	public WebElement deduction() {

		return deduction;
	}

	// input[@name='AcxCustPurchTable_OrderValue']
	@FindBy(xpath = "//input[@name='AcxCustPurchTable_OrderValue']")
	WebElement oldornamentValue;

	public WebElement oldornamentValue() {

		return oldornamentValue;
	}
	//button[@name='btnAddCDPLLine']
	@FindBy(xpath = "//button[@name='btnAddCDPLLine']")
	WebElement preaddLine;

	public WebElement preaddLine() {

		return preaddLine;
	}
	//li[contains(@id,'acxcustpurchtable_') and contains(@id,'_CustMetalPurchLine_header')]
	@FindBy(xpath = "	//li[contains(@id,'acxcustpurchtable_') and contains(@id,'_CustMetalPurchLine_header')]")
	WebElement oldtagheader;

	public WebElement oldtagheader() {

		return oldtagheader;
	}
	
	
	
}
