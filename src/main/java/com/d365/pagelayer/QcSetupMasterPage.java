package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class QcSetupMasterPage extends MasterClass {

	private WebDriverWait wait;

	public QcSetupMasterPage() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Default timeout of 10 seconds
	}

	private WebElement waitForElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement lnkModule;

	public WebElement getLnkModule() {
		return waitForElement(lnkModule);
	}

	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement lnkJewellery;

	public WebElement getLnkJewellery() {
		return waitForElement(lnkJewellery);
	}

	@FindBy(xpath = "//a[text()='QC Setup']")
	private WebElement lnkQcSetupMaster;

	public WebElement getLnkQcSetupMaster() {
		return waitForElement(lnkQcSetupMaster);
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement lblHeader;

	public WebElement getLblHeader() {
		return waitForElement(lblHeader);
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement btnNew;

	public WebElement getBtnNew() {
		return waitForElement(btnNew);
	}

	@FindBy(xpath = "//span[text()='QC Setup']")
	private WebElement lblQcSetup;

	public WebElement getLblQcSetup() {
		return waitForElement(lblQcSetup);
	}

	@FindBy(xpath = "//a[text()='QC Setup']")
	private WebElement lnkQcMaster;

	public WebElement getLnkQcMaster() {
		return waitForElement(lnkQcMaster);
	}

	@FindBy(xpath = "//input[contains(@name,'AcxBankMaster_Description')]")
	private WebElement txtDescription;

	public WebElement getTxtDescription() {
		return waitForElement(txtDescription);
	}

	@FindBy(xpath = "(//input[contains(@id,'MainGrid_Description_')])[1]")
	private WebElement txtDescriptionEdit;

	public WebElement getTxtDescriptionEdit() {
		return waitForElement(txtDescriptionEdit);
	}

	@FindBy(xpath = "//span[contains(@id,'taqcsetup_') and contains(@id,'_SystemDefinedViewEditButton_label')]")
	private WebElement btnEdit;

	public WebElement getBtnEdit() {
		return waitForElement(btnEdit);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_ItemId_')])[1]")
	private WebElement txtItemId;

	public WebElement getTxtItemId() {
		return waitForElement(txtItemId);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_ItemId_')][1]")
	private WebElement txtItemIdEdit;

	public WebElement getTxtItemIdEdit() {
		return waitForElement(txtItemIdEdit);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_StandardConfigId_')])[1]")
	private WebElement txtConfiguration;

	public WebElement getTxtConfiguration() {
		return waitForElement(txtConfiguration);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_StandardConfigId_')][1]")
	private WebElement txtConfigurationEdit;

	public WebElement getTxtConfigurationEdit() {
		return waitForElement(txtConfigurationEdit);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_DsignCheck')])[1]")
	private WebElement ddDesignCheck;

	public WebElement getDdDesignCheck() {
		return waitForElement(ddDesignCheck);
	}

	@FindBy(xpath = "//li[text()='Yes']")
	private WebElement optDesignYes;

	public WebElement getOptDesignYes() {
		return waitForElement(optDesignYes);
	}

	@FindBy(xpath = "//input[@id='TAQCSetup_DsignCheck_3_0_0_input']")
	private WebElement txtDesignTab;

	public WebElement getTxtDesignTab() {
		return waitForElement(txtDesignTab);
	}

	@FindBy(xpath = "//li[contains(@id,'TAQCSetup_DsignCheck_') and contains(@id,'comboBoxListItem_0')]")
	private WebElement optDesignNo;

	public WebElement getOptDesignNo() {
		return waitForElement(optDesignNo);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_QCCheck_')])[1]")
	private WebElement ddQcCheck;

	public WebElement getDdQcCheck() {
		return waitForElement(ddQcCheck);
	}

	@FindBy(xpath = "//li[text()='Yes']")
	private WebElement optQcCheckYes;

	public WebElement getOptQcCheckYes() {
		return waitForElement(optQcCheckYes);
	}

	@FindBy(xpath = "//li[contains(@id,'TAQCSetup_QCCheck_') and contains(@id,'comboBoxListItem')]")
	private WebElement optQcCheckNo;

	public WebElement getOptQcCheckNo() {
		return waitForElement(optQcCheckNo);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_POCheck_')])[1]")
	private WebElement ddPoCheck;

	public WebElement getDdPoCheck() {
		return waitForElement(ddPoCheck);
	}

	@FindBy(xpath = "//li[text()='Yes']")
	private WebElement optPoCheckYes;

	public WebElement getOptPoCheckYes() {
		return waitForElement(optPoCheckYes);
	}

	@FindBy(xpath = "//li[contains(@id,'TAQCSetup_POCheck_') and contains(@id,'comboBoxListItem_0')]")
	private WebElement optPoCheckNo;

	public WebElement getOptPoCheckNo() {
		return waitForElement(optPoCheckNo);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_HMCheck_')])[1]")
	private WebElement ddHmCheck;

	public WebElement getDdHmCheck() {
		return waitForElement(ddHmCheck);
	}

	@FindBy(xpath = "//li[text()='Yes']")
	private WebElement optHmCheckYes;

	public WebElement getOptHmCheckYes() {
		return waitForElement(optHmCheckYes);
	}

	@FindBy(xpath = "//li[contains(@id,'TAQCSetup_HMCheck_') and contains(@id,'comboBoxListItem_0')]")
	private WebElement optHmCheckNo;

	public WebElement getOptHmCheckNo() {
		return waitForElement(optHmCheckNo);
	}

	@FindBy(xpath = "(//input[starts-with(@id,'TAQCSetup_LMCheck_')])[1]")
	private WebElement ddLmCheck;

	public WebElement getDdLmCheck() {
		return waitForElement(ddLmCheck);
	}

	@FindBy(xpath = "//li[text()='Yes']")
	private WebElement optLmCheckYes;

	public WebElement getOptLmCheckYes() {
		return waitForElement(optLmCheckYes);
	}

	@FindBy(xpath = "//li[contains(@id,'TAQCSetup_LMCheck_') and contains(@id,'comboBoxListItem_0')]")
	private WebElement optLmCheckNo;

	public WebElement getOptLmCheckNo() {
		return waitForElement(optLmCheckNo);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_QCCheck_')][1]")
	private WebElement txtQcCheck;

	public WebElement getTxtQcCheck() {
		return waitForElement(txtQcCheck);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_POCheck_')][1]")
	private WebElement txtPoCheck;

	public WebElement getTxtPoCheck() {
		return waitForElement(txtPoCheck);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_HMCheck_')][1]")
	private WebElement txtHmCheck;

	public WebElement getTxtHmCheck() {
		return waitForElement(txtHmCheck);
	}

	@FindBy(xpath = "//input[contains(@id,'TAQCSetup_LMCheck_')][1]")
	private WebElement txtLmCheck;

	public WebElement getTxtLmCheck() {
		return waitForElement(txtLmCheck);
	}

	@FindBy(xpath = "(//div[contains(@class, 'dyn-container')]/div[@role='checkbox'])[1]")
	private WebElement chkActive;

	public WebElement getChkActive() {
		return waitForElement(chkActive);
	}

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement btnSave;

	public WebElement getBtnSave() {
		return waitForElement(btnSave);
	}

	@FindBy(xpath = "//span[contains(@class, 'button-commandRing') and contains(@class, 'Back-symbol')]")
	private WebElement btnBack;

	public WebElement getBtnBack() {
		return waitForElement(btnBack);
	}

	@FindBy(xpath = "//div[text()='Item Id']")
	private WebElement headerItemId;

	public WebElement getHeaderItemId() {
		return waitForElement(headerItemId);
	}

	@FindBy(xpath = "//input[contains(@id, '__FilterField_TAQCSetup_ItemId_ItemId_Input_')]")
	private WebElement filterItemId;

	public WebElement getFilterItemId() {
		return waitForElement(filterItemId);
	}

	@FindBy(id = "__MainGrid_BankName_ApplyFilters_label")
	private WebElement btnApplyFilters;

	public WebElement getBtnApplyFilters() {
		return waitForElement(btnApplyFilters);
	}

	// Repeat similar for other headers like headerConfiguration, headerDesignCheck, etc.

}
