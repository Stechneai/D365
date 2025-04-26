package com.d365.pagelayer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class FranchiseeReportPage extends MasterClass {
	public FranchiseeReportPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement lnkModule;

	public WebElement lnkModule() {
		return (lnkModule);
	}

	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement lnkJewellery;

	public WebElement lnkJewellery() {
		return (lnkJewellery);
	}

	@FindBy(xpath = "//a[text()='Franchisee Sales Ornament Bill']")
	private WebElement lnkFranchiseeReport;

	public WebElement lnkFranchiseeReport() {
		return (lnkFranchiseeReport);
	}

	@FindBy(xpath = "(//input[contains(@id,'SysOperationTemplateForm_') and contains(@id,'_input')])[1]")
	private WebElement dropdownLocation;

	public WebElement dropdownLocation() {
		return (dropdownLocation);

	}

	@FindBy(xpath = "(//input[contains(@id,'SysGen_Name_') and contains(@id,'_input')])[1]")
	private WebElement selectBranch;

	public WebElement selectBranch() {
		return (selectBranch);

	}

	@FindBy(xpath = "(//span[contains(@id,'SysLookupMultiSelectGrid_') and contains(@id,'_OK_label')])[1]")
	private WebElement btnSelect;

	public WebElement btnSelect() {
		return (btnSelect);

	}

	@FindBy(xpath = "/html/body/div[2]/div/div[7]/div[2]/div/div[5]/div/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div")
	private WebElement dropdownicon;

	public WebElement dropdownicon() {
		return (dropdownicon);

	}

	// input[@name = "Fld3_1"]
	@FindBy(xpath = "//input[@name = \"Fld3_1\"]")
	private WebElement dropdownProductGroup;

	public WebElement dropdownProductGroup() {
		return (dropdownProductGroup);
	}

	@FindBy(xpath = "//input[@name = \"Fld2_1\"]")
	private WebElement datepickerFroamDate;

	public WebElement datepickerFroamDate() {
		return (datepickerFroamDate);
	}

	@FindBy(xpath = "//input[@name = \"Fld4_1\"]")
	private WebElement datepickerToDate;

	public WebElement datepickerToDate() {
		return (datepickerToDate);
	}
	// span[text()= "OK"]

	@FindBy(xpath = "//span[text()= \"OK\"]")
	private WebElement btnOk;

	public WebElement btnOk() {
		return (btnOk);
	}

	// span[text()= "Cancel"]
	@FindBy(xpath = "//span[text()= \"Cancel\"]")
	private WebElement btnCancel;

	public WebElement btnCancel() {
		return (btnCancel);
	}

	@FindBy(xpath = "(//span[contains(@id,'SrsReportPdfViewerForm_') and contains(@id,'_PdfViewerExportMenuButton_label')])[1]")
	private WebElement btnEport;

	public WebElement btnEport() {
		return (btnEport);
	}

	@FindBy(xpath = "//button[@name='PdfViewerExportToExcelButton']")
	private WebElement btnExcel;

	public WebElement btnExcel() {
		return (btnExcel);
	}

	@FindBy(css = "svg._3ej1dl")
	private WebElement radio_Branch;

	public WebElement radioBranch() {
		return radio_Branch;
	}
	
	

	@FindBy(xpath = "//label[text()='Location']")
	private WebElement labelBranch;

	public WebElement labelBranch() {
		return labelBranch;
	}
	
	@FindBy(xpath = "//label[text()='Product group']")
	private WebElement labelProductGroup;

	public WebElement labelProductGroup() {
		return labelProductGroup;
	}
	
	@FindBy(xpath = "//label[text()='From Date']")
	private WebElement labelFromDate;

	public WebElement labelFromDate() {
		return labelFromDate;
	}
	
	@FindBy(xpath = "//label[text()='To Date']")
	private WebElement labelToDate;

	public WebElement labelToDate() {
		return labelToDate;
	}
	
}
