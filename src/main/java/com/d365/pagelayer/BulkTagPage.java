package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class BulkTagPage extends MasterClass {
	private WebDriverWait wait;

	public BulkTagPage() {
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement lnkModule;

	public WebElement lnkModule() {
		return  (lnkModule);
	}

	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement lnkJewellery;

	public WebElement lnkJewellery() {
		return  (lnkJewellery);
	}

	@FindBy(xpath = "//a[text()='Offline tagging']")
	private WebElement lnkOfflineTagging;

	public WebElement lnkOfflineTagging() {
		return  (lnkOfflineTagging);
	}

	@FindBy(xpath = "//span[text()='Select']")
	private WebElement btnSelect;

	public WebElement btnSelect() {
		return  (btnSelect);
	}

	@FindBy(xpath = "//span[text()='Bulk Import']")
	private WebElement btnBulkImport;

	public WebElement btnBulkImport() {
		return  (btnBulkImport);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_DeleteButton_label')])[1]")
	private WebElement btnDelete;

	public WebElement btnDelete() {
		return  (btnDelete);
	}

	@FindBy(xpath = "//span[text()='Export File']")
	private WebElement btnExportFile;

	public WebElement btnExportFile() {
		return  (btnExportFile);
	}

	@FindBy(xpath = "//span[text()='Upload File']")
	private WebElement btnUploadFile;

	public WebElement btnUploadFile() {
		return  (btnUploadFile);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_validate_label')])[1]")
	private WebElement btnValidate;

	public WebElement btnValidate() {
		return  (btnValidate);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_generateline_label')])[1]")
	private WebElement btnGenerateLine;

	public WebElement btnGenerateLine() {
		return  (btnGenerateLine);
	}

	@FindBy(xpath = "(//span[contains(@id,'TA_TagUploadCSVStagging_') and contains(@id,'_SystemDefinedSaveButton_label')])[1]")
	private WebElement btnSave;

	public WebElement btnSave() {
		return  (btnSave);
	}

	@FindBy(name = "FileUpload1BrowseButton")
	private WebElement btnBrowse;

	public WebElement btnBrowse() {
		return  (btnBrowse);
	}

	@FindBy(xpath = "//input[@name='FileUpload1FileNameDisplay']")
	private WebElement txtFileName;

	public WebElement txtFileName() {
		return  (txtFileName);
	}

	@FindBy(xpath = "(//input[contains(@id,'FormGridControl1_Remarks_')])[1]")
	private WebElement txtRemarks;

	public WebElement txtRemarks() {
		return  (txtRemarks);
	}

	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement btnNotificationClose;

	public WebElement btnNotificationClose() {
		return  (btnNotificationClose);
	}

}
