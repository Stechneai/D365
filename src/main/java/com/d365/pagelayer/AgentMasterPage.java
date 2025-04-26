package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class AgentMasterPage extends MasterClass {
	public AgentMasterPage() {
		PageFactory.initElements(driver, this);
	}

	// -----Module
	@FindBy(xpath = "//div[@id=\"navPaneModuleID\"]")
	private WebElement clickModule;

	public WebElement clickModule() {
		return clickModule;
	}

	// ---jewellery
	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement jewellery;

	public WebElement clickJewellery() {
		return jewellery;
	}

	@FindBy(xpath = "//a[text()='Agent Master']")
	private WebElement agentmaster;

	public WebElement clickAgentMaster() {
		return agentmaster;
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement newclick;

	public WebElement clickNew() {
		return newclick;
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridAgentTable_AgentCode_') and contains (@id, 'input')])[1]")
	private WebElement agentcode;

	public WebElement enterAgentCode() {
		return agentcode;
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridAgentTable_AgentName_') and contains (@id, 'input')])[1]")
	private WebElement agentname;

	public WebElement enterAgentName() {
		return agentname;
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridAgentTable_AgentType_') and contains (@id, 'input')])[1]")
	private WebElement agenttype;

	public WebElement enterAgentType() {
		return agenttype;
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridAgentTable_VendAccount_') and contains (@id, 'input')])[1]")
	private WebElement vendoraccount;

	public WebElement enterVendorAccount() {
		return vendoraccount;
	}

	@FindBy(xpath = "(//input[contains(@id, 'gridAgentTable_StoreId_') and contains (@id, 'input')])[1]")
	private WebElement storeid;

	public WebElement enterStoreId() {
		return storeid;
	}

	@FindBy(xpath = "//span[@class='_1bmfifs dyn-checkbox-span']")
	private WebElement active;

	public WebElement clickActive() {
		return active;
	}

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement save;

	public WebElement clickSave() {
		return save;
	}

	@FindBy(xpath = "//span[text()='Delete']de")
	private WebElement delete;

	public WebElement clickDelete() {
		return delete;
	}

	@FindBy(xpath = "(//h2[text()='Some of the information that you entered is not valid. You must enter valid information before you can continue.'])[1]")
	WebElement invalidError;

	public WebElement invalidErrorMsg() {
		return invalidError;
	}

	@FindBy(xpath = "//h1[contains (@id,'titleField') and contains(text(), 'The record already exists.')]")
	WebElement duplicateError;

	public WebElement duplicateErrorMsg() {
		return duplicateError;
	}

	@FindBy(xpath = "//h1[contains(text(),'Cannot delete a record in Inventory journal table')]")
	WebElement invalidError1;

	public WebElement invalidErrorMsg1() {
		return invalidError1;
	}

	@FindBy(xpath = "//span[contains(@id, 'SystemDefinedSaveButton_label')]")
	private WebElement Save_B;

	public WebElement saveButton() {
		return Save_B;
	}

	@FindBy(xpath = "//button[contains(@role,'button') and contains(@title,'Messages in list.')]")
	WebElement expandNotification;

	public WebElement expandNotificationBtn() {
		return expandNotification;
	}

	@FindBy(name = "Close")
	WebElement errorClose;

	public WebElement errorCloseButton() {
		return errorClose;
	}

	@FindBy(xpath = "(//button[@data-dyn-controlname='MessageBarToggle' and @class='messageBar-button messageBar-collapseButton'])[2]")
	private WebElement noteOpenButton;

	public WebElement notificationOpenButton() {
		return noteOpenButton;
	}

}
