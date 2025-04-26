package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PostProductReceiptPage extends MasterClass {
	public PostProductReceiptPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement clickModule;

	public WebElement clickModule() {
		return clickModule;
	}

	@FindBy(xpath = "//a[text()=\"Procurement and sourcing\"]")
	private WebElement clickProcrumentandSourcing;

	public WebElement clickProcrumentandSourcing() {
		return clickProcrumentandSourcing;
	}

	@FindBy(xpath = "//a[text()='Post product receipt']")
	private WebElement clickPostProductReceipt;

	public WebElement clickPostProductReceipt() {
		return clickPostProductReceipt;
	}

	@FindBy(xpath = "//span[text()='Select']")
	private WebElement clickSelect;

	public WebElement clickSelect() {
		return clickSelect;
	}

	@FindBy(xpath = "(//input[contains(@id,'RangeValue_') and contains(@id,'_input')])[1]")
	private WebElement enterPONo;

	public WebElement enterPONo() {
		return enterPONo;
	}

	@FindBy(xpath = "(//span[contains(@id,'SysQueryForm_') and contains(@id,'_OkButton_label')])[1]")
	private WebElement clickOK;

	public WebElement clickOK() {
		return clickOK;
	}

	@FindBy(xpath = "(//input[contains(@id,'PurchParmTable_AcxChallanNo_') and contains(@id,'_input')])[1]")
	private WebElement enterChalanNo;

	public WebElement enterChalanNo() {
		return enterChalanNo;
	}

	@FindBy(xpath = "(//input[contains(@id,'PurchParmTable_Num_') and contains(@id,'_input')])[1]")
	private WebElement enterproductReceipt;

	public WebElement enterproductReceipt() {
		return enterproductReceipt;
	}

	@FindBy(xpath = "	(//span[contains(@id,'PurchEditLines_') and contains(@id,'_AcxRegistrationOnLines_label')])[1]")
	private WebElement clickLineregistration;

	public WebElement clickLineregistration() {
		return clickLineregistration;
	}

	@FindBy(xpath = "	(//span[contains(@id,'PurchEditLines_') and contains(@id,'_LineStripUpdate_label')])[1]")
	private WebElement clickUpdateLine;

	public WebElement clickUpdateLine() {
		return clickUpdateLine;
	}

	@FindBy(xpath = "	(//span[contains(@id,'PurchEditLines_') and contains(@id,'_InventTransRegister_label')])[1]")
	private WebElement clickRegistration;

	public WebElement clickRegistration() {
		return clickRegistration;
	}

	@FindBy(xpath = "	(//span[contains(@id,'InventTransRegister_') and contains(@id,'_AddButton_label')])[1]")
	private WebElement clickAdd;

	public WebElement clickAdd() {
		return clickAdd;
	}

	@FindBy(xpath = "	(//input[contains(@id,'InventoryDimensions_inventBatchId_') and contains(@id,'_input')])[1]")
	private WebElement enterBatchNumber;

	public WebElement enterBatchNumber() {
		return enterBatchNumber;
	}

	@FindBy(xpath = "(//span[contains(@id,'InventTransRegister_') and contains(@id,'_ctrlUpdateButton_label')])[1]")
	private WebElement clickConfirmRegistration;

	public WebElement clickConfirmRegistration() {
		return clickConfirmRegistration;
	}

	@FindBy(xpath = "(//span[contains(@id,'InventTransRegister_') and contains(@id,'_SystemDefinedSaveButton_label')])[1]")
	private WebElement clickSave;

	public WebElement clickSave() {
		return clickSave;
	}

	@FindBy(xpath = "//span[@class=\"button-commandRing Back-symbol\"]")
	private WebElement clickBackSpace;

	public WebElement clickBackSpace() {
		return clickBackSpace;
	}

	@FindBy(xpath = "(//span[contains(@id,'PurchEditLines_') and contains(@id,'_OK_label')])[1]")
	private WebElement processOk;

	public WebElement processOk() {
		return processOk;
	}

	@FindBy(xpath = "//li[@class=\"messageCenter-item\"][1]")
	private WebElement messageCenter;

	public WebElement getMessageFromNotification() {
		return messageCenter;
	}

	@FindBy(xpath = "//button[@id='dynNavigationBarMessages_buttonNotifications']")
	private WebElement dynNavigationBarMessages_buttonNotifications;

	public WebElement messageCenterButton() {
		return dynNavigationBarMessages_buttonNotifications;
	}

}