package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PendingVendorInvoicesPage extends MasterClass {
	public PendingVendorInvoicesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Accounts payable']")
	private WebElement clickAccountPayable;

	public WebElement clickAccountPayable() {
		return clickAccountPayable;
	}

	@FindBy(xpath = "//a[text()='Pending vendor invoices']")
	private WebElement clickPedingVendorInvoices;

	public WebElement clickPedingVendorInvoices() {
		return clickPedingVendorInvoices;
	}

//	@FindBy(xpath = "//span[text()='From product receipt']")
//	private WebElement clickFromProductReceipt;
//
//	public WebElement clickFromProductReceipt() {
//		return clickFromProductReceipt;
//	}

//	@FindBy(xpath = "//button[@name='CommandButtonOK']")
//	private WebElement clickOk;
//
//	public WebElement clickOk() {
//		return clickOk;
//	}
//
//	@FindBy(xpath = "(//input[contains(@id,'PurchParmTable_gridParmTableNum_') and contains(@id,'_input')])[1]")
//	private WebElement enterInvoiceNumber;
//
//	public WebElement enterInvoiceNumber() {
//		return enterInvoiceNumber;
//	}
//
//	@FindBy(xpath = "//span[text()='Match product receipts']")
//	private WebElement clickMatchProductreceipt;
//
//	public WebElement clickMatchProductreceipt() {
//		return clickMatchProductreceipt;
//	}
//
//	@FindBy(xpath = "(//span[contains(@id,'VendEditInvoice_') and contains(@id,'_OK_label')])[1]")
//	private WebElement clickPost;
//
//	public WebElement clickPost() {
//		return clickPost;
//	}

	// Pending Vendor Invoices menu
	@FindBy(xpath = "//a[text()='Pending vendor invoices']")
	private WebElement clickPendingVendorInvoices;

	public WebElement clickPendingVendorInvoices() {
		return clickPendingVendorInvoices;
	}

	// 'From Product Receipt' button
	@FindBy(xpath = "//span[text()='From product receipt']")
	private WebElement ProductReceiptButton;

	public WebElement clickFromProductReceipt() {
		return ProductReceiptButton;
	}

	// 'Include' checkbox
	@FindBy(xpath = "//input[@type='checkbox' and contains(@id, 'IncludeCheckBox')]")
	private WebElement checkIncludeCheckbox;

	public WebElement checkIncludeCheckbox() {
		return checkIncludeCheckbox;
	}

	// 'OK' button
	@FindBy(xpath = "//button[@name='CommandButtonOK']")
	private WebElement clickOK;

	public WebElement clickOK() {
		return clickOK;
	}

	// Invoice Number field
	@FindBy(xpath = "(//input[contains(@id,'PurchParmTable_gridParmTableNum_') and contains(@id,'_input')])[1]")
	private WebElement enterInvoiceNumber;

	public WebElement enterInvoiceNumber() {
		return enterInvoiceNumber;
	}

	// 'Match Product Receipts' button
	@FindBy(xpath = "//span[text()='Match product receipts']")
	private WebElement clickMatchProductReceipts;

	public WebElement clickMatchProductReceipts() {
		return clickMatchProductReceipts;
	}

	// 'Post' button
	@FindBy(xpath = "(//span[contains(@id,'VendEditInvoice_') and contains(@id,'_OK_label')])[1]")
	private WebElement clickPost;

	public WebElement clickPost() {
		return clickPost;
	}

	// Notification message in message center
	@FindBy(xpath = "//li[@class='messageCenter-item'][1]")
	private WebElement getMessageFromNotification;

	public WebElement getMessageFromNotification() {
		return getMessageFromNotification;
	}

	// Message Center Button
	@FindBy(xpath = "//button[@id='dynNavigationBarMessages_buttonNotifications']")
	private WebElement dynNavigationBarMessages_buttonNotifications;

	public WebElement messageCenterButton() {
		return dynNavigationBarMessages_buttonNotifications;
	}

	@FindBy(xpath = "(//input[contains(@id,'VendPackingSlipJour_All_InvoiceAccount')])[last()]")
	private WebElement VendPackingSlipJour_All_InvoiceAccount;

	public WebElement selectLastRow() {
		return VendPackingSlipJour_All_InvoiceAccount;
	}
//
//	@FindBy( = "svg._15hssbx")
//	private WebElement checkboxElement;
//
//	public WebElement selectRow() {
//		return checkboxElement;
//	}
	
	//(//div[@role='checkbox']//div[@class='_sr23qd' and @title='No'])[last()]
			@FindBy(xpath = "(//div[@role='checkbox']//div[@class='_sr23qd' and @title='No'])[last()]")
			private WebElement selectcheckbox;

			public WebElement selectcheckbox() {
				return selectcheckbox;
			}
			//button[@class='messageBar-button messageBar-collapseButton']
			@FindBy(xpath = "//button[@class='messageBar-button messageBar-collapseButton']")
			private WebElement clickmessagebar;

			public WebElement clickmessagebar() {
				return clickmessagebar;
			}
			//div[@class='messageBar-messageRegion']
			
			@FindBy(xpath = "//div[@class='messageBar-messageRegion']")
			private WebElement printMessage;

			public WebElement printMessage() {
				return printMessage;
			}
}
