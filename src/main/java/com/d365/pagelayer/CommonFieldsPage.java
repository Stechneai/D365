package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pos.utils.MasterClass;

public class CommonFieldsPage extends MasterClass {

	public CommonFieldsPage() {
		PageFactory.initElements(driver, this);

	}

//	@FindBy(xpath = "//button[text()='Add']")
//	private WebElement addBtn;
//
//	public WebElement addBtn() {
//		return addBtn;
//	}
//
//	@FindBy(tagName = "small")
//	// @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
//	private WebElement errorMsg;
//
//	public WebElement errorMsg() {
//		return errorMsg;
//	}
//
//	// button[text()='Submit']
//	@FindBy(xpath = "//button[text()='Submit']")
//	private WebElement submitBtn;
//
//	public WebElement submitBtn() {
//		return submitBtn;
//	}
//
//	// button[text()='Submit']
//	@FindBy(xpath = "//button[text()='Submit']")
//	private WebElement submitButton;
//
//	public WebElement submitButton() {
//		return submitButton;
//	}
//
//	@FindBy(xpath = "//button[text()='Back']")
//	private WebElement backBtn;
//
//	public WebElement backBtn() {
//		return backBtn;
//	}
//
//	// button[text()='Verify']
//	@FindBy(xpath = "//button[text()='Verify']")
//	private WebElement verifyBtn;
//
//	public WebElement verifyBtn() {
//		return verifyBtn;
//	}
//
//	// id="apply"
//	@FindBy(id = "apply")
//	private WebElement apply;
//
//	public WebElement apply() {
//		return apply;
//	}
//
//	// button[text()='Update']
//	@FindBy(xpath = "//button[text()='Update']")
//	private WebElement updateBtn;
//
//	public WebElement updateBtn() {
//		return updateBtn;
//	}
//
//	@FindBy(xpath = "//button[text()=' Search']")
//	private WebElement searchBtn;
//
//	public WebElement searchBtn() {
//		return searchBtn;
//	}
//
//	// button[text()=' Reset']
//	@FindBy(xpath = "//button[contains(text(),'Reset')]")
//	private WebElement resetBtn;
//
//	public WebElement resetBtn() {
//		return resetBtn;
//	}
//
//	// span[text()='Next']
//	@FindBy(xpath = "//span[text()='Next']")
//	private WebElement nextBtn;
//
//	public WebElement nextBtn() {
//		return nextBtn;
//	}
//
//	//// button[text()='Add']
//
//	@FindBy(xpath = "//*[text()='Cancel']")
//	private WebElement cancelBtn;
//
//	public WebElement cancelBtn() {
//		return cancelBtn;
//	}
//
//	@FindBy(xpath = "//input[contains(@placeholder,'Search')]")
//	private WebElement search;
//
//	public WebElement search() {
//		return search;
//	}
//
//	@FindBy(xpath = "//input[@placeholder='Search by Country Name....']")
//	private WebElement searchField;
//
//	public WebElement searchField() {
//		return searchField;
//	}
//
//	@FindBy(xpath = "//input[contains(@placeholder,'Search')]")
//	private WebElement billSearchField;
//
//	public WebElement billSearchField() {
//		return billSearchField;
//	}
//
////	@FindBy (id="searchInput")
////	private WebElement search;
////	public WebElement search()
////	{
////		return search;
////	}	
//
//	@FindBy(id = "filterButton")
//	private WebElement filterButton;
//
//	public WebElement filterButton() {
//		return filterButton;
//	}
//
//	@FindBy(xpath = "//button[contains(text(),'Filter ')]")
//	private WebElement filter;
//
//	public WebElement filter() {
//		return filter;
//	}
//
////	@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
//	// div[@class='Toastify__toast-body']/div[2]
//	@FindBy(xpath = "//div[@class='Toastify__toast-body']/div")
//	// @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
//	private WebElement toastifyMsg;
//
//	public WebElement toastifyMsg() {
//		return toastifyMsg;
//	}
//
//	@FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
//	private WebElement toastifyCloseBtn;
//
//	public WebElement toastifyCloseBtn() {
//		return toastifyCloseBtn;
//	}
//
//	@FindBy(xpath = "//*[text()='Close']")
//	private WebElement closeBtn;
//
//	public WebElement closeBtn() {
//		return closeBtn;
//	}

	// *********************************************************///////////////////////////////////****************************************************************************************************

	@FindBy(css = "input[id='customerSelect']")
	private WebElement txtsearchcustomer;

	public WebElement txtsearchcustomer() {
		return (txtsearchcustomer);
	}

	@FindBy(id = "username")
	private WebElement txtusername;

	public WebElement txtUsername() {
		return (txtusername);
	}

	@FindBy(id = "password")
	private WebElement txtpassword;

	public WebElement txtPassword() {
		return (txtpassword);
	}

	@FindBy(id = "estimate_barcode")
	private WebElement txtfsbbarcode;

	public WebElement txtfsbbarcode() {
		return (txtpassword);
	}

	@FindBy(id = "proceed-button")
	private WebElement continueBtn;

	public WebElement btnContinue() {
		return continueBtn;
	}

	@FindBy(id = "SaveCreateInvoice_id")
	private WebElement btnsaveandcreateinvoicefsb;

	public WebElement btnsaveandcreateinvoiceFsb() {
		return (btnsaveandcreateinvoicefsb);
	}

	@FindBy(id = "loginbtn")
	private WebElement btnlogin;

	public WebElement btnlogin() {
		return btnlogin;
	}

	@FindBy(xpath = "//span[@id='select2-employee_id-container']")
	private WebElement dropdownemployee;

	public WebElement dropdownemployee() {
		return (dropdownemployee);
	}

	@FindBy(css = ".select2-search__field")
	private WebElement txtEmployee;

	public WebElement txtemployeeName() {
		return (txtEmployee);
	}

	// Tag
	@FindBy(id = "barcode")
	private WebElement txtTag;

	public WebElement txtTag() {
		return (txtTag);
	}
	// tag scan

	@FindBy(id = "search")
	private WebElement btnTagScan;

	public WebElement btnTagClick() {
		return (btnTagScan);
	}
	// create estimate button

	@FindBy(id = "CreateEstimate")
	private WebElement btnCreateEstimate;

	public WebElement btnCreateEstimate() {
		return (btnCreateEstimate);
	}

	@FindBy(css = "div[id='autocomplete-item-0']")
	private WebElement btnfirstcustomer;

	public WebElement btnfirstcustomer() {
		return (btnfirstcustomer);
	}
//	Common Fields  POS NEW

	// --------------------------------------------------------------------------------------------------------------------------------

	// total discount in in fresh sale bill estimate and fresh sale bill

	@FindBy(id = "total_discount")
	private WebElement txtTotalDiscountField;

	public WebElement txtTotalDiscountField() {
		return txtTotalDiscountField;
	}

	// net amount in fresh sale bill estimate and fresh sale bill

	@FindBy(id = "net_amount")
	private WebElement txtNetAmountField;

	public WebElement txtNetAmountField() {
		return txtNetAmountField;
	}

	// Gross amount
	@FindBy(id = "na_gross_amount")
	private WebElement txtEyeNetAmountDetailsGrossAmount;

	public WebElement txtEyeNetAmountDetailsGrossAmount() {
		return txtEyeNetAmountDetailsGrossAmount;
	}

	// Tax amount
	@FindBy(id = "na_tax_amount")
	private WebElement txtEyeNetAmountDetailsTaxAmount;

	public WebElement txtEyeNetAmountDetailsTaxAmount() {
		return txtEyeNetAmountDetailsTaxAmount;
	}

	// Net AMount
	@FindBy(id = "na_net_amount")
	private WebElement txtEyeNetAmountDetailsNetAmount;

	public WebElement txtEyeNetAmountDetailsNetAmount() {
		return txtEyeNetAmountDetailsNetAmount;
	}

	// LI discount
	@FindBy(id = "na_li_discount")
	private WebElement txtEyeNetAmountDetailsLiDiscount;

	public WebElement txtEyeNetAmountDetailsLiDiscount() {
		return txtEyeNetAmountDetailsLiDiscount;
	}

	// Auth code discount
	@FindBy(id = "na_auth_code_discount")
	private WebElement txtEyeNetAmountDetailsAuthCodeDiscount;

	public WebElement txtEyeNetAmountDetailsAuthCodeDiscount() {
		return txtEyeNetAmountDetailsAuthCodeDiscount;
	}

	// total discount
	@FindBy(id = "na_total_discount")
	private WebElement txtEyeNetAmountDetailsTotalDiscount;

	public WebElement txtEyeNetAmountDetailsTotalDiscount() {
		return txtEyeNetAmountDetailsTotalDiscount;
	}

	// net amount eye closed btton
	@FindBy(id = "net_amt_detail_modal_close_id")
	private WebElement btnClosedNetAmountDetails;

	public WebElement btnClosedNetAmountDetails() {
		return btnClosedNetAmountDetails;
	}
//  barcode details eye button field 

	@FindBy(id = "tr_get_tag_details_1")
	private WebElement eyeBarcodeDetails;

	public WebElement eyeBarcodeDetails() {
		return eyeBarcodeDetails;
	}

	@FindBy(id = "bc_item_name")
	private WebElement txtItemName;

	public WebElement txtItemName() {
		return txtItemName;
	}

	@FindBy(id = "bc_category")
	private WebElement txtcategory;

	public WebElement txtcategory() {
		return txtcategory;
	}

	@FindBy(id = "bc_purity")
	private WebElement txtPurity;

	public WebElement txtPurity() {
		return txtPurity;
	}

	@FindBy(id = "bc_gross_weight")
	private WebElement txtGrossWeight;

	public WebElement txtGrossWeight() {
		return txtGrossWeight;
	}

	@FindBy(id = "bc_net_weight")
	private WebElement txtNetWeightBarcodeDetails;

	public WebElement txtNetWeightBarcodeDetails() {
		return txtNetWeightBarcodeDetails;
	}

	@FindBy(id = "bc_metal_amount")
	private WebElement txtMetalAmount;

	public WebElement txtMetalAmount() {
		return txtMetalAmount;
	}

	@FindBy(id = "bc_hm_charges")
	private WebElement txtHMCharges;

	public WebElement txtHMCharges() {
		return txtHMCharges;
	}

	@FindBy(id = "bc_making_charges")
	private WebElement txtMakingCharges;

	public WebElement txtMakingCharges() {
		return txtMakingCharges;
	}

	@FindBy(id = "bc_stone_amount")
	private WebElement txtStoneAmountMakingCharges;

	public WebElement txtStoneAmountMakingCharges() {
		return txtStoneAmountMakingCharges;
	}

	@FindBy(id = "bc_line_discount")
	private WebElement txtLiDiscount;

	public WebElement txtLiDiscount() {
		return txtLiDiscount;
	}

	@FindBy(id = "bc_item_amount")
	private WebElement txtItemAmount;

	public WebElement txtItemAmount() {
		return txtItemAmount;
	}

	@FindBy(id = "bc_tag_age")
	private WebElement txtTagAge;

	public WebElement txtTagAge() {
		return txtTagAge;
	}

	@FindBy(id = "bc_emp_id")
	private WebElement txtEmpId;

	public WebElement txtEmpId() {
		return txtEmpId;
	}

	@FindBy(id = "bc_size")
	private WebElement txtSize;

	public WebElement txtSize() {
		return txtSize;
	}

	@FindBy(id = "bc_design_code")
	private WebElement txtDesignCode;

	public WebElement txtDesignCode() {
		return txtDesignCode;
	}

	@FindBy(id = "set_tag_no")
	private WebElement txtSetTagNumber;

	public WebElement txtSetTagNumber() {
		return txtSetTagNumber;

	}

	@FindBy(id = "Certificate_no")
	private WebElement txtCertificateNumber;

	public WebElement txtCertificateNumber() {
		return txtCertificateNumber;

	}

	@FindBy(id = "barcode_details_modal_close_id")
	private WebElement btnClosedBarcodeDetails;

	public WebElement btnClosedBarcodeDetails() {
		return btnClosedBarcodeDetails;
	}

	// making details eye button field
	@FindBy(name = "labour_type")
	private WebElement txtLabourType;

	public WebElement txtLabourType() {
		return txtLabourType;
	}

	@FindBy(name = "labour_rate")
	private WebElement txtLabourRate;

	public WebElement txtLabourRate() {
		return txtLabourRate;
	}

	@FindBy(name = "labour_charges")
	private WebElement txtLabourCharges;

	public WebElement txtLabourCharges() {
		return txtLabourCharges;
	}

	@FindBy(name = "net_weight")
	private WebElement txtNetWeightMakingDetails;

	public WebElement txtNetWeightMakingDetails() {
		return txtNetWeightMakingDetails;
	}

	@FindBy(name = "wastage_rate")
	private WebElement txtwastageRate;

	public WebElement txtwastageRate() {
		return txtwastageRate;
	}

	@FindBy(name = "wastage_wt")
	private WebElement txtWastageWeight;

	public WebElement txtWastageWeight() {
		return txtWastageWeight;
	}

	@FindBy(name = "wastage_amount")
	private WebElement txtWastageAmount;

	public WebElement txtWastageAmount() {
		return txtWastageAmount;
	}

	@FindBy(name = "other_chages")
	private WebElement txtOtherCharges;

	public WebElement txtOtherCharges() {
		return txtOtherCharges;
	}

	@FindBy(id = "making_charges_details_modal_close_id")
	private WebElement BtnCloseMakingChargesDetails;

	public WebElement BtnCloseMakingChargesDetails() {
		return BtnCloseMakingChargesDetails;
	}
	// stone details eye button

	@FindBy(name = "item_id")
	private WebElement txtStoneName;

	public WebElement txtStoneName() {
		return txtStoneName;
	}

	@FindBy(name = "acxitemtype")
	private WebElement txtStoneCategory;

	public WebElement txtStoneCategory() {
		return txtStoneCategory;
	}

	@FindBy(name = "size")
	private WebElement txtStoneSize;

	public WebElement txtStoneSize() {
		return txtStoneSize;
	}

	@FindBy(name = "pcs")
	private WebElement txtStonePieces;

	public WebElement txtStonePieces() {
		return txtStonePieces;
	}

	@FindBy(name = "stone_wt")
	private WebElement txtStoneWeight;

	public WebElement txtStoneWeight() {
		return txtStoneWeight;
	}

	@FindBy(name = "stone_rate")
	private WebElement txtStoneRate;

	public WebElement txtStoneRate() {
		return txtStoneRate;
	}

	@FindBy(name = "stone_amount")
	private WebElement txtStoneAmount;

	public WebElement txtStoneAmount() {
		return txtStoneAmount;
	}

	@FindBy(id = "stone_details_modal_close_id")
	private WebElement btnCloseStoneDetails;

	public WebElement btnCloseStoneDetails() {
		return btnCloseStoneDetails;
	}
	// auth code

	@FindBy(id = "auth_code")
	private WebElement txtAuthCode;

	public WebElement txtAuthCode() {
		return txtAuthCode;
	}

	//
	@FindBy(id = "auth_code_discount")
	private WebElement txtOtherDiscountAmount;

	public WebElement txtOtherDiscountAmount() {
		return txtOtherDiscountAmount;
	}

	// remark
	@FindBy(id = "remark")
	private WebElement txtRemark;

	public WebElement txtRemark() {
		return txtRemark;
	}

	@FindBy(id = "legal_name")
	private WebElement txtLegalName;

	public WebElement txtLegalName() {
		return txtLegalName;
	}

	// Altert poup closed

	@FindBy(id = "AlertCloseId")
	private WebElement btnAlertPopUpClosed;

	public WebElement btnAlertPopUpClosed() {
		return (btnAlertPopUpClosed);
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	// For Create Scheme page

	// Customer name

	@FindBy(id = "CustomerNameId")
	WebElement txtCustomerName;
	// span[@id='select2-employee_id-container']

	public WebElement txtCustomerName() {
		return txtCustomerName;
	}

	// submit button

	@FindBy(id = "create_Scheme_submit")
	WebElement btnSubmit;
	// span[@id='select2-employee_id-container']

	public WebElement btnSubmit() {
		return btnSubmit;
	}

	@FindBy(css = "div[id='squareDiv_2_1']")
	WebElement btnfreshsalebillestimate;

	public WebElement btnfreshsalebillEstimate() {
		return (btnfreshsalebillestimate);
	}

	@FindBy(css = "div[id='squareDiv_2_2']")
	WebElement btnfreshsalebill;

	public WebElement btnfreshsaleBill() {
		return (btnfreshsalebill);
	}
	// btn Cash Payment Mode

	@FindBy(xpath = "//button[@onclick=\"ShowModal('CashModal','1')\"]")
	private WebElement btnCash;

	public WebElement btnCash() {
		return (btnCash);
	}

	@FindBy(css = "button[id='cashsubmitid']")
	private WebElement btncashconfirm;

	public WebElement btncashconfirmBtn() {
		return (btncashconfirm);
	}

	@FindBy(css = "input[id='acmendocno_id']")
	private WebElement txtacmedocnumber;

	public WebElement txtacmedocNumber() {
		return (txtacmedocnumber);
	}

	@FindBy(css = "button[id='PrintPreview']")
	private WebElement btnprintbutton;

	public WebElement btnprintButton() {
		return (btnprintbutton);
	}

	// Estimate Number Grid
	@FindBy(css = "#td_estimateno_1")
	private WebElement td_estimateno_1;

	public WebElement txtEstimateGrid() {
		return td_estimateno_1;
	}

	// Tag Number Grid
	@FindBy(css = "#td_tagno_1")
	private WebElement td_tagno_1;

	public WebElement txtTagNumberGrid() {
		return td_tagno_1;
	}

	// Purity Grid
	@FindBy(css = "#tr_purity_1")
	private WebElement tr_purity_1;

	public WebElement txtPurityGrid() {
		return tr_purity_1;
	}

	// Rate Grid
	@FindBy(css = "#td_rate_1")
	private WebElement txtrategrid;

	public WebElement txtrateGrid() {
		return txtrategrid;
	}

	// Total Pieces Grid
	@FindBy(css = "#tr_total_pcs_1")
	private WebElement tr_total_pcs_1;

	public WebElement txtTotalPcsGrid() {
		return tr_total_pcs_1;
	}

	// Net Weight Grid
	@FindBy(css = "#td_netwt_1")
	private WebElement td_netwt_1;

	public WebElement txtNetWeightGrid() {
		return td_netwt_1;
	}

	// Making Charges Grid
	@FindBy(css = "#td_making_1")
	private WebElement td_making_1;

	public WebElement txtMakingChargesGrid() {
		return td_making_1;
	}

	// Stone Amount Grid
	@FindBy(css = "#tr_stone_amount_id_1")
	private WebElement tr_stone_amount_id_1;

	public WebElement txtStoneAmountGrid() {
		return tr_stone_amount_id_1;
	}

	// LI Discount Grid
	@FindBy(css = "#tr_discount_id_1")
	private WebElement tr_discount_id_1;

	public WebElement txtLiDiscountGrid() {
		return tr_discount_id_1;
	}

	// Other Discount Grid
	@FindBy(css = "#tr_total_other_discount_1")
	private WebElement tr_total_other_discount_1;

	public WebElement txtOtherDiscountGrid() {
		return tr_total_other_discount_1;
	}

	// Card Swap Machine Master
	@FindBy(id = "squareDiv_1_30")
	private WebElement btncardswapmachinMaster;

	public WebElement btncardswapmachinMaster() {
		return btncardswapmachinMaster;
	}

	// City Master
	@FindBy(id = "squareDiv_1_6")
	private WebElement btncityMaster;

	public WebElement btncityMaster() {
		return btncityMaster;
	}

	// Country Master
	@FindBy(id = "squareDiv_1_4")
	private WebElement btncountryMaster;

	public WebElement btncountryMaster() {
		return btncountryMaster;
	}

	// Designation Master
	@FindBy(id = "squareDiv_1_12")
	private WebElement btndesignationMaster;

	public WebElement btndesignationMaster() {
		return btndesignationMaster;
	}

	// Device Master
	@FindBy(id = "squareDiv_1_13")
	private WebElement btndeviceMaster;

	public WebElement btndeviceMaster() {
		return btndeviceMaster;
	}

	// Document Payment Mapping
	@FindBy(id = "squareDiv_1_26")
	private WebElement btndocumentpaymentmapping;

	public WebElement btndocumentpaymentmapping() {
		return btndocumentpaymentmapping;
	}

	// Document Template Master
	@FindBy(id = "squareDiv_1_14")
	private WebElement btndocumenttemplateMaster;

	public WebElement btndocumenttemplateMaster() {
		return btndocumenttemplateMaster;
	}

	// Master Setting Master
	@FindBy(id = "squareDiv_1_16")
	private WebElement btnmastersettingMaster;

	public WebElement btnmastersettingMaster() {
		return btnmastersettingMaster;
	}

	// Master Setting
	@FindBy(id = "squareDiv_1_15")
	private WebElement btnmasterSetting;

	public WebElement btnmasterSetting() {
		return btnmasterSetting;
	}

	// Role Master
	@FindBy(id = "squareDiv_1_3")
	private WebElement btnroleMaster;

	public WebElement btnroleMaster() {
		return btnroleMaster;
	}

	// Signature Pad Master
	@FindBy(id = "squareDiv_1_17")
	private WebElement btnsignaturepadMaster;

	public WebElement btnsignaturepadMaster() {
		return btnsignaturepadMaster;
	}

	// State Master
	@FindBy(id = "squareDiv_1_5")
	private WebElement btnstateMaster;

	public WebElement btnstateMaster() {
		return btnstateMaster;
	}

	// User Master
	@FindBy(id = "squareDiv_1_10")
	private WebElement btnuserMaster;

	public WebElement btnuserMaster() {
		return btnuserMaster;
	}

	@FindBy(xpath = "//button[contains(@onclick, \"editRoleMaster('42')\")]")
	private WebElement btneditrole;

	public WebElement btneditrole() {
		return btneditrole;
	}

	@FindBy(css = "a[id='netAmountDetailsSh']")
	private WebElement btneyenetamountDetails;

	public WebElement btneyenetamountDetails() {
		return btneyenetamountDetails;
	}

	@FindBy(css = "button[id='net_amt_detail_modal_close_id']")
	private WebElement btnclosenetdetails;

	public WebElement btnclosenetdetails() {
		return btnclosenetdetails;
	}

	@FindBy(css = "a[id='getmakingCharges_1']")
	private WebElement btnmakingdetails;

	public WebElement btnmakingDetails() {
		return btnmakingdetails;
	}

}
