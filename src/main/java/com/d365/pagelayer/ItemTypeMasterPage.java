package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class ItemTypeMasterPage extends MasterClass {

	public ItemTypeMasterPage() {
		PageFactory.initElements(driver, this);
	}

	// Modules
	@FindBy(id = "navPaneModuleID")
	private WebElement module;

	public WebElement lnkModules() {
		return (module);
	}

	// Jewellery master
	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement jewel;

	public WebElement lnkJewellery() {
		return (jewel);
	}

	@FindBy(xpath = "//a[text()='Master']")
	private WebElement master;

	public WebElement lnkMaster() {
		return (master);
	}

	@FindBy(xpath = "//a[text()='Item Type Master (Group)']")
	private WebElement itemmaster;

	public WebElement lnkItemMaster() {
		return (itemmaster);
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement newb;

	public WebElement btnNew() {
		return (newb);
	}

	@FindBy(xpath = "//span[text()='Item Type Master']")
	private WebElement itemtypemaster;

	public WebElement checkItemTypeMaster() {
		return (itemtypemaster);
	}

	@FindBy(xpath = "//span[text()='Options']")
	private WebElement options;

	public WebElement btnOptions() {
		return (options);
	}

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement delete;

	public WebElement btnDelete() {
		return (delete);
	}

	@FindBy(xpath = "//div[@title='Select or unselect row']")
	private WebElement selectrow;

	public WebElement radioRow() {
		return (selectrow);
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridItemType_ItemTypeCode') and contains(@id, '_input')])[1]")
	private WebElement itemtype;

	public WebElement txtItemType() {
		return (itemtype);
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridItemType_ItemTypeName') and contains(@id, '_input')])[1]")
	private WebElement itemtypename;

	public WebElement txtItemTypeName() {
		return (itemtypename);
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridItemType_FineItem') and contains(@id, '_input')])[1]")
	private WebElement fineitem;

	public WebElement txtFineItem() {
		return (fineitem);
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridItemType_PrimaryItem') and contains(@id, '_input')])[1]")
	private WebElement primaryitem;

	public WebElement txtPrimaryItem() {
		return (primaryitem);
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridItemType_HMItem') and contains(@id, '_input')])[1]")
	private WebElement hmitem;

	public WebElement txtHmItem() {
		return (hmitem);
	}

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement save;

	public WebElement btnSave() {
		return (save);
	}

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement edit;

	public WebElement btnEdit() {
		return (edit);
	}

	@FindBy(xpath = "//div[contains(@id,'gridItemType_ItemTypeCode_') and contains(@id,'header')]")
	private WebElement filter;

	public WebElement iconFilter() {
		return (filter);
	}

	@FindBy(xpath = "//input[contains(@id,'__FilterField_gridItemType_ItemTypeCode') and contains(@id,'_ItemTypeCode_Input')]")
	private WebElement itemc;

	public WebElement btnSearchItemcode() {
		return (itemc);
	}

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement applyok;

	public WebElement btnApply() {
		return (applyok);
	}

	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
	private WebElement duplicateError;

	public WebElement alertDuplicateErrorMsg() {
		return (duplicateError);
	}

}
