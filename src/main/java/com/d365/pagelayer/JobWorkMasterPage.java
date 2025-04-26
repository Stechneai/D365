package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;
import com.d365.utils.MasterClass;

public class JobWorkMasterPage extends MasterClass {
	
	private WebDriverWait wait;

	public JobWorkMasterPage() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Default timeout of 10 seconds
	}

	private WebElement waitForElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	@FindBy(xpath="//div[@id='navPaneModuleID']")
	private WebElement menuModule;	

	public WebElement clickModule() {
		return waitForElement(menuModule);
	}

	@FindBy(xpath = "//a[@data-dyn-title=\"Jewellery\"]")
	private WebElement linkJewellery;

	public WebElement clickJewellery() {
		return waitForElement(linkJewellery);
	}

	@FindBy(xpath = "//a[text()=\"Job Work Charges Master\"]")
	private WebElement linkJobWorkMaster;

	public WebElement clickJobWorkMaster() {
		return waitForElement(linkJobWorkMaster);
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement btnNew;

	public WebElement clickNew() {
		return waitForElement(btnNew);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_VendCode') and contains(@id,'_input')])[1]")
	private WebElement txtVendorGroupType;

	public WebElement enterVendorGroupType() {
		return waitForElement(txtVendorGroupType);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_VendCode') and contains(@id,'_input')])[1]")
	private WebElement txtVendorCode;

	public WebElement enterVendorCode() {
		return waitForElement(txtVendorCode);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxJobWorkCharges_ItemId') and contains(@id,'input')])[1]")
	private WebElement txtItemID;

	public WebElement enterItemID() {
		return waitForElement(txtItemID);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxJobWorkCharges_StandardConfigId') and contains(@id,'input')])[1]")
	private WebElement txtCategory;

	public WebElement enterCategory() {
		return waitForElement(txtCategory);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_FromWeight') and contains(@id,'_input')])[1]")
	private WebElement txtFromWeight;

	public WebElement enterFromWeight() {
		return waitForElement(txtFromWeight);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_ToWeight') and contains(@id,'_input')])[1]")
	private WebElement txtToWeight;

	public WebElement enterToWeight() {
		return waitForElement(txtToWeight);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_MakingType') and contains(@id,'_input')])[1]")
	private WebElement txtMakingType;

	public WebElement enterMakingType() {
		return waitForElement(txtMakingType);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_MakingRate') and contains(@id,'_input')])[1]")
	private WebElement txtMakingRate;

	public WebElement enterMakingRate() {
		return waitForElement(txtMakingRate);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_OffsetLedgerDimension') and contains(@id,'segmentedEntryLookup')])[1]")
	private WebElement txtOffsetLedger;

	public WebElement enterOffsetLeadger() {
		return waitForElement(txtOffsetLedger);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_FromDate') and contains(@id,'input')])[1]")
	private WebElement datePickerFromDate;

	public WebElement enterFromDate() {
		return waitForElement(datePickerFromDate);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_ToDate') and contains(@id,'input')])[1]")
	private WebElement datePickerToDate;

	public WebElement enterToDate() {
		return waitForElement(datePickerToDate);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxJobWorkCharges_FromPurity') and contains(@id,'input')])[1]")
	private WebElement txtFromPurity;

	public WebElement enterFromPurity() {
		return waitForElement(txtFromPurity);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxJobWorkCharges_ToPurity') and contains(@id,'input')])[1]")
	private WebElement txtToPurity;

	public WebElement enterToPurity() {
		return waitForElement(txtToPurity);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxJobWorkCharges_Design') and contains(@id,'input')])[1]")
	private WebElement txtDesign;

	public WebElement enterDesign() {
		return waitForElement(txtDesign);
	}

	@FindBy(name = "SystemDefinedSaveButton")
	private WebElement btnSave;

	public WebElement clickSave() {
		return waitForElement(btnSave);
	}

	@FindBy(xpath = "//span[text()=\"Add / Update\"]")
	private WebElement btnAddUpdate;

	public WebElement addupdate() {
		return waitForElement(btnAddUpdate);
	}

	@FindBy(xpath = "//span[@class=\"button-commandRing Back-symbol\"]")
	private WebElement iconBackArrow;

	public WebElement backArrow() {
		return waitForElement(iconBackArrow);
	}

	@FindBy(xpath = "//div[@class='actionGroup appBar-button-group'][2]")
	private WebElement btnEdit;

	public WebElement edit() {
		return waitForElement(btnEdit);
	}

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement btnDelete;

	public WebElement delete() {
		return waitForElement(btnDelete);
	}


}
