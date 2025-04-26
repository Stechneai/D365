
package com.d365.pagelayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class CustemerOrderPosPage extends MasterClass {

	public CustemerOrderPosPage() {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "(//button[2])[1]")
//	private WebElement create_Esti_button;
//
//	public WebElement CreateEstimateButton() {
//		return create_Esti_button;
//	}
//
//	@FindBy(xpath = "//span[text()=' -- Select Employee -- ']")
//	private WebElement select_employee_dropdown;
//
//	public WebElement selectEmployeeDropdown() {
//		return select_employee_dropdown;
//	}
//
//	@FindBy(id = "customerNameMobile")
//	private WebElement customerNameMobile;
//
//	@FindBy(xpath = "//*[@id='orderno']")
//	private WebElement orderNo;
//
//	public WebElement orderNo() {
//		return orderNo;
//	}
//
//	@FindBy(id = "tagScan")
//	private WebElement tagScan;
//
//	@FindBy(id = "totalDiscount")
//	private WebElement totalDiscount;
//
//	@FindBy(id = "netAmount")
//	private WebElement netAmount;
//
//	@FindBy(id = "action")
//	private WebElement action;
//
//	// Order Details Table
//	@FindBy(id = "orderno")
//	private WebElement orderNoTable;
//
//	@FindBy(id = "barcode")
//	private WebElement barcode;
//
//	@FindBy(id = "itemName")
//	private WebElement itemName;
//
//	@FindBy(id = "purity")
//	private WebElement purity;
//
//	@FindBy(id = "rate")
//	private WebElement rate;
//
//	@FindBy(id = "orderRate")
//	private WebElement orderRate;
//
//	@FindBy(id = "pcs")
//	private WebElement pcs;
//
//	@FindBy(id = "liDis")
//	private WebElement liDis;
//
//	@FindBy(id = "makingCharges")
//	private WebElement makingCharges;
//
//	@FindBy(id = "netWt")
//	private WebElement netWt;
//
//	@FindBy(id = "itemAmount")
//	private WebElement itemAmount;
//
//	@FindBy(id = "total")
//	private WebElement total;
//
//	@FindBy(id = "advancePayment")
//	private WebElement advancePayment;
//
//	@FindBy(id = "rateFreezed")
//	private WebElement rateFreezed;
//
//	@FindBy(id = "remark")
//	private WebElement remark;
//
//	@FindBy(xpath = "//*[@id='search']")
//	private WebElement cnfbtn;
//
//	public WebElement customerNameMobile() {
//		return customerNameMobile;
//	}
//
//	public WebElement tagScan() {
//		return tagScan;
//	}
//
//	public WebElement totalDiscount() {
//		return totalDiscount;
//	}
//
//	public WebElement netAmount() {
//		return netAmount;
//	}
//
//	public WebElement action() {
//		return action;
//	}
//
//	public WebElement orderNoTable() {
//		return orderNoTable;
//	}
//
//	public WebElement barcode() {
//		return barcode;
//	}
//
//	public WebElement itemName() {
//		return itemName;
//	}
//
//	public WebElement purity() {
//		return purity;
//	}
//
//	public WebElement rate() {
//		return rate;
//	}
//
//	public WebElement orderRate() {
//		return orderRate;
//	}
//
//	public WebElement pcs() {
//		return pcs;
//	}
//
//	public WebElement liDis() {
//		return liDis;
//	}
//
//	public WebElement makingCharges() {
//		return makingCharges;
//	}
//
//	public WebElement netWt() {
//		return netWt;
//	}
//
//	public WebElement itemAmount() {
//		return itemAmount;
//	}
//
//	public WebElement total() {
//		return total;
//	}
//
//	public WebElement advancePayment() {
//		return advancePayment;
//	}
//
//	public WebElement rateFreezed() {
//		return rateFreezed;
//	}
//
//	public WebElement remark() {
//		return remark;
//	}
//
//	public WebElement confirmButton() {
//		return cnfbtn;
//	}

	// Customer
	@FindBy(xpath = "//*[@id='customerDetailModal']/div/div/div[2]/div/div[2]/div/input")
	private WebElement cxMob;

	public WebElement cxMobileNo() {
		return cxMob;
	}

	@FindBy(xpath = "//*[@id='orderno']")
	private WebElement orderNo;

	public WebElement orderNo() {
		return orderNo;
	}

	@FindBy(xpath = "//*[@id='customerDetailModal']/div/div/div[2]/div/div[1]/div/input")
	private WebElement cxName;

	public WebElement customerName() {
		return cxName;
	}

	@FindBy(xpath = "//*[@id='customerDetailModal']/div/div/div[2]/div/div[3]/div/textarea")
	private WebElement cxAdd;

	public WebElement customerAddress() {
		return cxAdd;
	}

	@FindBy(xpath = "//*[@id='customerDetailModal']/div/div/div[1]/button")
	private WebElement cxDetailsCross;

	public WebElement customerDetailsClose() {
		return cxDetailsCross;
	}

	@FindBy(xpath = "//select[@id = 'select2-employee_id-container']")
	private WebElement emp;

	public WebElement selectEmployee() {
		return emp;
	}

	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;

	public WebElement empSearch() {
		return search;
	}

	@FindBy(xpath = "//input[@id='barcode']")
	private WebElement tag;

	public WebElement tagScan() {
		return tag;
	}

	@FindBy(xpath = "//button[@id='search']")
	private WebElement tagClick;

	public WebElement tagSearchBtn() {
		return tagClick;
	}

	@FindBy(id = "total_discount")
	private WebElement discount;

	public WebElement totalDiscount() {
		return discount;
	}

	@FindBy(id = "net_amount")
	private WebElement net;

	public WebElement netAmount() {
		return net;
	}

	@FindBy(id = "netAmountDetails")
	private WebElement netEye;

	public WebElement netAmountEyeIcon() {
		return netEye;
	}

	@FindBy(partialLinkText = "Create Estimate -")
	private WebElement cx;

	public WebElement customer() {
		return cx;
	}

	@FindBy(id = "auth_code")
	private WebElement auth;

	public WebElement authCode() {
		return auth;
	}

	@FindBy(id = "auth_code_discount")
	private WebElement authD;

	public WebElement authDiscount() {
		return authD;
	}

	@FindBy(id = "ApplyAuthCodeDiscount")
	private WebElement authApply;

	public WebElement authDiscountApply() {
		return authApply;
	}

	@FindBy(id = "remark")
	private WebElement rmk;

	public WebElement remark() {
		return rmk;
	}

	@FindBy(id = "tr_remove_btn_1")
	private WebElement tact;

	public WebElement tableAction() {
		return tact;
	}

	@FindBy(id = "select2-employee_id-container")
	private WebElement empName;

	public WebElement employee() {
		return empName;
	}

	@FindBy(id = "tr_get_tag_details_1")
	private WebElement brDetails;

	public WebElement barcodeDetails() {
		return brDetails;
	}

	@FindBy(id = "tr_barcode_1")
	private WebElement scTag;

	public WebElement barcodeScanned() {
		return scTag;
	}

	// Barcode details
	@FindBy(id = "bc_item_name")
	private WebElement itmNm;

	public WebElement itemName() {
		return itmNm;
	}

	@FindBy(id = "bc_category")
	private WebElement cat;

	public WebElement category() {
		return cat;
	}

	@FindBy(id = "bc_purity")
	private WebElement prty;

	public WebElement purity() {
		return prty;
	}

	@FindBy(id = "bc_gross_weight")
	private WebElement grwt;

	public WebElement grossWeight() {
		return grwt;
	}

	@FindBy(id = "bc_net_weight")
	private WebElement ntwt;

	public WebElement netWeight() {
		return ntwt;
	}

	@FindBy(id = "bc_metal_amount")
	private WebElement metal;

	public WebElement metalAmount() {
		return metal;
	}

	@FindBy(id = "bc_hm_charges")
	private WebElement hm;

	public WebElement hmcharges() {
		return hm;
	}

	@FindBy(id = "bc_making_charges")
	private WebElement brmk;

	public WebElement brMakingCharges() {
		return brmk;
	}

	@FindBy(id = "bc_stone_amount")
	private WebElement brStAmt;

	public WebElement brStoneAmount() {
		return brStAmt;
	}

	@FindBy(id = "bc_line_discount")
	private WebElement brLi;

	public WebElement brLiDiscount() {
		return brLi;
	}

	@FindBy(id = "bc_item_amount")
	private WebElement item;

	public WebElement brItemAmount() {
		return item;
	}

	@FindBy(id = "bc_tag_age")
	private WebElement tage;

	public WebElement tagAge() {
		return tage;
	}

	@FindBy(id = "bc_emp_id")
	private WebElement emid;

	public WebElement empid() {
		return emid;
	}

	@FindBy(id = "bc_size")
	private WebElement sz;

	public WebElement size() {
		return sz;
	}

	@FindBy(id = "bc_design_code")
	private WebElement dsgnCode;

	public WebElement designCode() {
		return dsgnCode;
	}

	@FindBy(xpath = "//*[@id='barcode_details_modal']/div/div/div[1]/button")
	private WebElement brCross;

	public WebElement brCloseBtn() {
		return brCross;
	}

//		barcode label
	@FindBy(xpath = "//label[text()='Item Name']")
	private WebElement itmName;

	public WebElement itemName_Label() {
		return itmName;
	}

	@FindBy(xpath = "//label[text()='Category']")
	private WebElement catgry;

	public WebElement category_Label() {
		return catgry;
	}

	@FindBy(xpath = "//label[text()='Purity']")
	private WebElement purty;

	public WebElement purity_Label() {
		return purty;
	}

	@FindBy(xpath = "//label[text()='Gross Weight']")
	private WebElement grosswt;

	public WebElement grossWeight_Label() {
		return grosswt;
	}

	@FindBy(xpath = "//label[text()='Net Weight']")
	private WebElement netwt;

	public WebElement netWeight_Label() {
		return netwt;
	}

	@FindBy(xpath = "//label[text()='HM Charges']")
	private WebElement hmchrg;

	public WebElement hmCharges_Label() {
		return hmchrg;
	}

//		Table
	@FindBy(id = "tr_rate_1")
	private WebElement tagRate;

	public WebElement rate() {
		return tagRate;
	}

	@FindBy(id = "tr_pcs_1")
	private WebElement tagPcs;

	public WebElement pcs() {
		return tagPcs;
	}

	@FindBy(id = "tr_netwt_1")
	private WebElement tagNetWeight;

	public WebElement netWeightTable() {
		return tagNetWeight;
	}

//		Making Charges

	@FindBy(id = "tr_making_charges_1")
	private WebElement making;

	public WebElement makingCharges() {
		return making;
	}

	@FindBy(id = "makingDetails_1")
	private WebElement mkDetails;

	public WebElement makingDetails() {
		return mkDetails;
	}

	// making details
	@FindBy(name = "labour_type")
	private WebElement lbType;

	public WebElement labourType() {
		return lbType;
	}

	@FindBy(name = "labour_rate")
	private WebElement lbRate;

	public WebElement labourRate() {
		return lbRate;
	}

	@FindBy(name = "labour_charges")
	private WebElement lbCharges;

	public WebElement labourCharges() {
		return lbCharges;
	}

	@FindBy(name = "net_weight")
	private WebElement netWtMk;

	public WebElement netWeightMk() {
		return netWtMk;
	}

	@FindBy(name = "wastage_rate")
	private WebElement wstRate;

	public WebElement wastageRate() {
		return wstRate;
	}

	@FindBy(name = "wastage_wt")
	private WebElement wstWeight;

	public WebElement wastageWeight() {
		return wstWeight;
	}

	@FindBy(name = "wastage_amount")
	private WebElement wstAmt;

	public WebElement wastageAmount() {
		return wstAmt;
	}

	@FindBy(name = "other_chages")
	private WebElement otCharges;

	public WebElement otherCharges() {
		return otCharges;
	}

	@FindBy(xpath = "//*[@id='making_charges_details_modal']/div/div/div[1]/button")
	private WebElement mkCross;

	public WebElement mkCloseBtn() {
		return mkCross;
	}

	// Stone
	@FindBy(id = "tr_stone_amount_1")
	private WebElement stAmt;

	public WebElement stoneAmount() {
		return stAmt;
	}

	@FindBy(id = "stoneDetails_1")
	private WebElement stDetails;

	public WebElement stoneDetails() {
		return stDetails;
	}

	@FindBy(name = "item_id")
	private WebElement stName;

	public WebElement stoneName() {
		return stName;
	}

	@FindBy(name = "acxitemtype")
	private WebElement stCat;

	public WebElement stoneCategory() {
		return stCat;
	}

	@FindBy(name = "size")
	private WebElement stSize;

	public WebElement stoneSize() {
		return stSize;
	}

	@FindBy(name = "pcs")
	private WebElement stPcs;

	public WebElement stonePcs() {
		return stPcs;
	}

	@FindBy(name = "stone_wt")
	private WebElement stWeight;

	public WebElement stoneWeight() {
		return stWeight;
	}

	@FindBy(name = "stone_rate")
	private WebElement stRate;

	public WebElement stoneRate() {
		return stRate;
	}

	@FindBy(name = "stone_amount")
	private WebElement stAmtDetails;

	public WebElement stoneAmountDetails() {
		return stAmtDetails;
	}

	@FindBy(xpath = "//*[@id='stone_details_modal']/div/div/div[1]/button")
	private WebElement stCross;

	public WebElement stClose() {
		return stCross;
	}

	@FindBy(id = "tr_total_line_discount_1")
	private WebElement liDi;

	public WebElement liDiscount() {
		return liDi;
	}

	@FindBy(id = "tr_astrologet_1")
	private WebElement astro;

	public WebElement astrologer() {
		return astro;
	}

	@FindBy(id = "legal_name")
	private WebElement legal;

	public WebElement legalName() {
		return legal;
	}

	@FindBy(id = "tcs_applied")
	private WebElement tcs;

	public WebElement tcsApplied() {
		return tcs;
	}

	@FindBy(id = "CreateEstimate")
	private WebElement crtEstimateBtn;

	public WebElement createEstimate() {
		return crtEstimateBtn;
	}

	@FindBy(xpath = "//button[@value='create_invoice']")
	private WebElement saveAndCreateInvoiceBtn;

	public WebElement saveAndCreateInvoice() {
		return saveAndCreateInvoiceBtn;
	}

	@FindBy(id = "salesReturnBtn")
	private WebElement salesReturnBtn;

	public WebElement salesReturn() {
		return salesReturnBtn;
	}

//		Total 
	@FindBy(xpath = "//tr[@id='total']/td[2]/input")
	private WebElement ttPcs;

	public WebElement totalPcs() {
		return ttPcs;
	}

	@FindBy(xpath = "//tr[@id='total']/td[3]/input")
	private WebElement ttNetWt;

	public WebElement totalNetWeight() {
		return ttNetWt;
	}

	@FindBy(xpath = "//tr[@id='total']/td[4]/input")
	private WebElement ttMkCharge;

	public WebElement totalMakingCharges() {
		return ttMkCharge;
	}

	@FindBy(xpath = "//tr[@id='total']/td[5]/input")
	private WebElement ttStAmt;

	public WebElement totalStoneAmount() {
		return ttStAmt;
	}

	@FindBy(xpath = "//tr[@id='total']/td[6]/input")
	private WebElement ttLiDis;

	public WebElement totalLiDiscount() {
		return ttLiDis;
	}

	@FindBy(id = "refPerson")
	private WebElement refPer;

	public WebElement referencePerson() {
		return refPer;
	}

	@FindBy(id = "na_gross_amount")
	private WebElement grsAmt;

	public WebElement grossAmount() {
		return grsAmt;
	}

	@FindBy(id = "na_tax_amount")
	private WebElement taxAmt;

	public WebElement taxAmount() {
		return taxAmt;
	}

	@FindBy(id = "na_net_amount")
	private WebElement netAmtD;

	public WebElement netAmountDetails() {
		return netAmtD;
	}

	@FindBy(id = "na_li_discount")
	private WebElement liDiscnt;

	public WebElement liDiscountNaDetail() {
		return liDiscnt;
	}

	@FindBy(id = "na_auth_code_discount")
	private WebElement authCodeD;

	public WebElement authCodeDiscount() {
		return authCodeD;
	}

	@FindBy(id = "na_total_discount")
	private WebElement totalDis;

	public WebElement totalDiscountNaDetails() {
		return totalDis;
	}

	@FindBy(xpath = "//div[@id='net_amt_details_modal']/div/div/div[1]/button")
	private WebElement closeNa;

	public WebElement closeNetAmountPopup() {
		return closeNa;
	}

	@FindBy(id = "alertMessage")
	private WebElement empError;

	public WebElement employeeError() {
		return empError;
	}

	@FindBy(xpath = "//div[@id='bodyBackground']//div//button[@aria-label='Close']")
	private WebElement alertClose;

	public WebElement employeeAlertClose() {
		return alertClose;
	}
}