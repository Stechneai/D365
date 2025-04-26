package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class CommonFieldsV extends MasterClass {

	public CommonFieldsV() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement btnAdd;

	public WebElement btnAdd() {
		return (btnAdd);
	}

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement btnSubmit;

	public WebElement btnSubmit() {
		return (btnSubmit);
	}

	@FindBy(xpath = "//button[text()='Back']")
	private WebElement btnBack;

	public WebElement btnBack() {
		return (btnBack);
	}

	@FindBy(xpath = "//button[text()='Verify']")
	private WebElement btnVerify;

	public WebElement btnVerify() {
		return (btnVerify);
	}

	@FindBy(id = "apply")
	private WebElement btnApply;

	public WebElement btnApply() {
		return (btnApply);
	}

	@FindBy(xpath = "//button[text()='Update']")
	private WebElement btnUpdate;

	public WebElement btnUpdate() {
		return (btnUpdate);
	}

	@FindBy(xpath = "//button[text()=' Search']")
	private WebElement btnSearch;

	public WebElement btnSearch() {
		return (btnSearch);
	}

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement btnReset;

	public WebElement btnReset() {
		return (btnReset);
	}

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement btnNext;

	public WebElement btnNext() {
		return (btnNext);
	}

	@FindBy(xpath = "//*[text()='Cancel']")
	private WebElement btnCancel;

	public WebElement btnCancel() {
		return (btnCancel);
	}

	@FindBy(xpath = "//input[@placeholder='Search....']")
	private WebElement txtSearch;

	public WebElement txtSearch() {
		return (txtSearch);
	}

	@FindBy(xpath = "//input[@placeholder='Search by Country Name....']")
	private WebElement txtCountrySearch;

	public WebElement txtCountrySearch() {
		return (txtCountrySearch);
	}

	@FindBy(xpath = "//input[@placeholder='Search By Bill ID....']")
	private WebElement txtBillSearch;

	public WebElement txtBillSearch() {
		return (txtBillSearch);
	}

	@FindBy(id = "filterButton")
	private WebElement btnFilter;

	public WebElement btnFilter() {
		return (btnFilter);
	}

	@FindBy(xpath = "//button[contains(text(),'Filter ')]")
	private WebElement btnFilterOptions;

	public WebElement btnFilterOptions() {
		return (btnFilterOptions);
	}

	@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
	private WebElement lblToastMessage;

	public WebElement lblToastMessage() {
		return (lblToastMessage);
	}

	@FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
	private WebElement btnToastClose;

	public WebElement btnToastClose() {
		return (btnToastClose);
	}

	@FindBy(id = "navPaneModuleID")
	private WebElement lnkModule;

	public WebElement lnkModule() {
		return (lnkModule);
	}

	@FindBy(xpath = "//button[@title='Expand all']")
	private WebElement btnExpandAll;

	public WebElement btnExpandAll() {
		return (btnExpandAll);
	}

	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement btnNotificationClose;

	public WebElement btnNotificationClose() {
		return (btnNotificationClose);
	}

	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement btnNotificationOpen;

	public WebElement btnNotificationOpen() {
		return (btnNotificationOpen);
	}

	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	private WebElement btnExpandNotification;

	public WebElement btnExpandNotification() {
		return (btnExpandNotification);
	}

	@FindBy(name = "Close")
	private WebElement btnErrorClose;

	public WebElement btnErrorClose() {
		return (btnErrorClose);
	}

	@FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
	private WebElement lblInvalidError;

	public WebElement lblInvalidError() {
		return (lblInvalidError);
	}

	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
	private WebElement lblDuplicateError;

	public WebElement lblDuplicateError() {
		return (lblDuplicateError);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_Remarks_')])[1]")
	private WebElement txtRemark;

	public WebElement txtRemark() {
		return (txtRemark);
	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement btnSave;

	public WebElement btnSave() {
		return (btnSave);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_PurchTransValue') and contains(@id,'_input')])[1]")
	private WebElement txtPurchTransValue;

	public WebElement txtPurchTransValue() {
		return (txtPurchTransValue);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_TransFineWeight') and contains(@id,'_input')])[1]")
	private WebElement txtTransFineWeight;

	public WebElement txtTransFineWeight() {
		return (txtTransFineWeight);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustDiaPurchLine_MRPFormingPer') and contains(@id,'_input')])[1]")
	private WebElement txtMrpFormingPercentage;

	public WebElement txtMrpFormingPercentage() {
		return (txtMrpFormingPercentage);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_OldTagNo') and contains(@id,'_input')])[1]")
	private WebElement txtOldTagNo;

	public WebElement txtOldTagNo() {
		return (txtOldTagNo);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_ReferenceInvoice') and contains(@id,'_input')])[1]")
	private WebElement txtOldInvoiceNo;

	public WebElement txtOldInvoiceNo() {
		return (txtOldInvoiceNo);
	}

	@FindBy(xpath = "(//input[contains(@id,'SysGen_{65CACBD1-B2AF-434D-BACA-CF81EFA87E92}') and contains(@id,'_input')])[1]")
	private WebElement txtDeduction;

	public WebElement txtDeduction() {
		return (txtDeduction);
	}

	@FindBy(xpath = "//input[@name='AcxCustPurchTable_OrderValue']")
	private WebElement txtOldOrnamentValue;

	public WebElement txtOldOrnamentValue() {
		return (txtOldOrnamentValue);
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_Carat') and contains(@id,'input')]")
	private WebElement txtPrePurityCarat;

	public WebElement txtPrePurityCarat() {
		return (txtPrePurityCarat);
	}

	@FindBy(xpath = "(//input[contains(@id,'gridCustMetalPurchLine_NetWeight') and contains(@id,'_input')])[1]")
	private WebElement txtNetWeight;

	public WebElement txtNetWeight() {
		return (txtNetWeight);
	}

	@FindBy(xpath = "//input[contains(@id,'gridCustDiaPurchLine_PurchPrice') and contains(@id,'input')]")
	private WebElement txtPreRate;

	public WebElement txtPreRate() {
		return (txtPreRate);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_validate_label')])[1]")
	private WebElement btnValidate;

	public WebElement btnValidate() {
		return (btnValidate);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_generateline_label')])[1]")
	private WebElement btnGenerateLine;

	public WebElement btnGenerateLine() {
		return (btnGenerateLine);
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement btnNew;

	public WebElement btnNew() {
		return btnNew;
	}

}
