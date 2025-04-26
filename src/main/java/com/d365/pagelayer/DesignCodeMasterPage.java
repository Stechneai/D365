package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class DesignCodeMasterPage extends MasterClass {

	private WebDriverWait wait;

	public DesignCodeMasterPage() {
		PageFactory.initElements(driver, this);
	}

	// -----Module
	@FindBy(xpath = "//div[@id=\"navPaneModuleID\"]")
	private WebElement navPaneModule;

	public WebElement navPaneModule() {
		return (navPaneModule);
	}

	// -----Jewellery
	@FindBy(xpath = "//a[text()=\"Jewellery\"]")
	private WebElement lnkJewellry;

	public WebElement lnkJewellry() {
		return (lnkJewellry);
	}

	@FindBy(xpath = "//a[text()='Design Code']")
	private WebElement lnkDesignCodeMaster;

	public WebElement lnkDesignCodeMaster() {
		return (lnkDesignCodeMaster);
	}

	// -----New button
	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement btnNew;

	public WebElement btnNew() {
		return (btnNew);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[1]")
	private WebElement txtDesignCode;

	public WebElement txtDesignCode() {
		return (txtDesignCode);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_ItemId_') and contains(@id,'_input')])[1]")
	private WebElement txtItemID;

	public WebElement txtItemID() {
		return (txtItemID);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_StandardConfigId_') and contains(@id,'_input')])[1]")
	private WebElement txtConfiguration;

	public WebElement txtConfiguration() {
		return (txtConfiguration);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_Status_') and contains(@id,'_input')])[1]")
	private WebElement txtStatus;

	public WebElement txtStatus() {
		return (txtStatus);
	}

	@FindBy(xpath = "//span[text()=\"Save\"]")
	private WebElement btnSave;

	public WebElement btnSave() {
		return (btnSave);
	}

	@FindBy(xpath = "//span[text()=\"Delete\"]")
	private WebElement btnDelete;

	public WebElement btnDelete() {
		return (btnDelete);
	}

	@FindBy(xpath = "//span[text()=\"Open\"]")
	private WebElement btnOpen;

	public WebElement btnOpen() {
		return (btnOpen);
	}

	@FindBy(xpath = "//span[text()=\"Released\"]")
	private WebElement btnReleased;

	public WebElement btnReleased() {
		return (btnReleased);
	}

	@FindBy(xpath = "//span[text()=\"Close\"]")
	private WebElement btnClose;

	public WebElement btnClose() {
		return (btnClose);
	}

	@FindBy(xpath = "//button[@name=\"SystemDefinedCloseButton\"]")
	private WebElement btnBack;

	public WebElement btnBack() {
		return (btnBack);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[1]")
	private WebElement txtDesignCode1;

	public WebElement txtDesignCode1() {
		return (txtDesignCode1);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[2]")
	private WebElement txtDesignCode2;

	public WebElement txtDesignCode2() {
		return (txtDesignCode2);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[3]")
	private WebElement txtDesignCode3;

	public WebElement txtDesignCode3() {
		return (txtDesignCode3);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[4]")
	private WebElement txtDesignCode4;

	public WebElement txtDesignCode4() {
		return (txtDesignCode4);
	}

	@FindBy(xpath = "(//input[contains(@id,'TA_DesignCode_DesignCode_') and contains(@id,'_input')])[4][2]")
	private WebElement txtConfiguration2;

	public WebElement txtConfiguration2() {
		return (txtConfiguration2);
	}

}
