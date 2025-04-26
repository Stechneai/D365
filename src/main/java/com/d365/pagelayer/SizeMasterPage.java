package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class SizeMasterPage extends MasterClass {
	public SizeMasterPage() {
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

	@FindBy(xpath = "//a[text()='Size Master']")
	private WebElement clickSizeMaster;

	public WebElement clickSizeMaster() {
		return clickSizeMaster;
	}

	// -----New button
	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement newButton;

	public WebElement newButton() {
		return newButton;
	}

	@FindBy(xpath = "//div[@id=\"GridCell-1-gridSizeMaster_SizeName\"]")
	private WebElement sizeCode;

	public WebElement sizeCode() {
		return sizeCode;
	}

//		@FindBy(xpath="//div[@id=\"GridCell-1-gridSizeMaster_ItemId\"]")
	@FindBy(xpath = "(//input[contains(@id,'gridSizeMaster_ItemId')])[2]")
	private WebElement itemId;

	public WebElement itemId() {
		return itemId;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridSizeMaster_StandardConfigId_')])[2]")
	private WebElement configuration;

	public WebElement configuration() {
		return configuration;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridSizeMaster_FromRange_')])[2]")
	private WebElement fromRange;

	public WebElement fromRange() {
		return fromRange;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridSizeMaster_ToRange_')])[2]")
	private WebElement toRange;

	public WebElement toRange() {
		return toRange;
	}

	@FindBy(xpath = "(//input[contains(@id,'gridSizeMaster_AcxUOM_')])[2]")
	private WebElement uom;

	public WebElement uom() {
		return uom;
	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement saveButton() {
		return Save_B;
	}

	@FindBy(xpath = "//span[text()='Size Master']")
	private WebElement sizeMaster;

	public WebElement pageTitleSizeMaster() {
		return sizeMaster;
	}

	@FindBy(xpath = "//span[text()=\"Delete\"]")
	private WebElement clickDelete;

	public WebElement clickDelete() {
		return clickDelete;
	}

	@FindBy(xpath = "//button[@name=\"SystemDefinedCloseButton\"]")
	private WebElement backButton;

	public WebElement backButton() {
		return backButton;
	}

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement editButton;

	public WebElement editButton() {
		return editButton;
	}

}
