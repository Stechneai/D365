package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PostProductPage extends MasterClass
{
     public PostProductPage()
     {
    	 PageFactory.initElements(driver, this);
     }
     
    
  	
   //-----Jewellery
     @FindBy(xpath="//a[text()=\"Jewellery\"]")
     private WebElement labelJewellery;	

     public WebElement labelJewellery() {
         return labelJewellery;
     }

     //---clickModule
     @FindBy(xpath = "//div[@id='navPaneModuleID']")
     private WebElement labelModule;

     public WebElement labelModule() {
         return labelModule;
     }

     //---clickProcurementandSourcing
     @FindBy(xpath = "//a[text()=\"Procurement and sourcing\"]")
     private WebElement labelProcurementandSourcing;

     public WebElement labelProcurementandSourcing() {
         return labelProcurementandSourcing;
     }

     //----clickPostProductReceipt
     @FindBy(xpath = "//a[text()=\"Post product receipt\"]")
     private WebElement labelPostProductReceipt;

     public WebElement labelPostProductReceipt() {
         return labelPostProductReceipt;
     }

     //----clickSelect
     @FindBy(xpath = "//span[text()=\"Select\"]")
     private WebElement buttonSelect;

     public WebElement buttonSelect() {
         return buttonSelect;
     }

     //--enterPoNo
     @FindBy(xpath = "(//input[contains(@id,\"RangeValue_387_0_0\")])")
     private WebElement textPoNo;

     public WebElement textPoNo() {
         return textPoNo;
     }

     //---clickOK
     @FindBy(xpath = "(//span[contains(@id,'SysQueryForm_') and contains(@id,'_OkButton_label')])[1]")
     private WebElement btnOK;

     public WebElement btnOK() {
         return btnOK;
     }

     //----enterChallanNo
     @FindBy(xpath = "//input[contains(@id,\"PurchParmTable_AcxChallan\")]")
     private WebElement textChallanNo;

     public WebElement textChallanNo() {
         return textChallanNo;
     }

     //---enterProductReceipt
     @FindBy(xpath = "(//input[contains(@id,'PurchParmTable_Num_') and contains(@id,'_input')])[1]")
     private WebElement textProductReceipt;

     public WebElement textProductReceipt() {
         return textProductReceipt;
     }

     //---clickLineGeneration
     @FindBy(xpath = "//button[contains(@id,'PurchEditLines') and contains(@id,'AcxRegistrationOnLines')]")
     private WebElement buttonLineRegistration;

     public WebElement buttonLineRegistration() {
         return buttonLineRegistration;
     }

     @FindBy(xpath = "(//span[contains(@id,'PurchEditLines_') and contains(@id,'_LineStripUpdate_label')])[1]")
     private WebElement buttonUpdateLine;

     public WebElement buttonUpdateLine() {
         return buttonUpdateLine;
     }

     @FindBy(xpath = "(//span[contains(@id,'PurchEditLines_') and contains(@id,'_InventTransRegister_label')])[1]")
     private WebElement buttonRegistration;

     public WebElement buttonRegistration() {
         return buttonRegistration;
     }

     @FindBy(xpath = "(//span[contains(@id,'InventTransRegister_') and contains(@id,'_AddButton_label')])[1]")
     private WebElement buttonAdd;

     public WebElement buttonAdd() {
         return buttonAdd;
     }

     @FindBy(xpath = "(//input[contains(@id,'InventoryDimensions_inventBatchId_') and contains(@id,'_input')])[1]")
     private WebElement textBatchNumber;

     public WebElement textBatchNumber() {
         return textBatchNumber;
     }

     @FindBy(xpath = "(//span[contains(@id,'InventTransRegister_') and contains(@id,'_ctrlUpdateButton_label')])[1]")
     private WebElement buttonConfirmRegistration;

     public WebElement buttonConfirmRegistration() {
         return buttonConfirmRegistration;
     }

     @FindBy(xpath = "(//span[contains(@id,'InventTransRegister_') and contains(@id,'_SystemDefinedSaveButton_label')])[1]")
     private WebElement buttonSave;

     public WebElement buttonSave() {
         return buttonSave;
     }

     @FindBy(xpath = "//span[@class=\"button-commandRing Back-symbol\"]")
     private WebElement buttonBackSpace;

     public WebElement buttonBackSpace() {
         return buttonBackSpace;
     }

     @FindBy(xpath = "//span[text()=\"OK\"]")
     private WebElement buttonProcessOk;

     public WebElement buttonProcessOk() {
         return buttonProcessOk;
     }

     @FindBy(xpath = "//li[@class=\"messageCenter-item\"][1]")
     private WebElement messageCenterNotification;

     public WebElement messageCenterNotification() {
         return messageCenterNotification;
     }

     @FindBy(xpath = "//button[@id='dynNavigationBarMessages_buttonNotifications']")
     private WebElement buttonMessageCenter;

     public WebElement buttonMessageCenter() {
         return buttonMessageCenter;
     }

     @FindBy(xpath = "//a[text()='Accounts payable']")
     private WebElement labelAccountsPayable;

     public WebElement labelAccountsPayable() {
         return labelAccountsPayable;
     }

     @FindBy(xpath = "//a[text()='Pending vendor invoices']")
     private WebElement labelPendingVendorInvoices;

     public WebElement labelPendingVendorInvoices() {
         return labelPendingVendorInvoices;
     }

     @FindBy(xpath = "//span[text()=\"From product receipt\"]")
     private WebElement btnFromProductReceipt;

     public WebElement btnFromProductReceipt() {
         return btnFromProductReceipt;
     }

     @FindBy(xpath = "//input[@type='checkbox' and contains(@id,'IncludeCheckBox')]")
     private WebElement chkInclude;

     public WebElement chkInclude() {
         return chkInclude;
     }

     @FindBy(xpath = "(//input[contains(@id,'PurchParmTable_gridParmTableNum_') and contains(@id,'_input')])[1]")
     private WebElement txtInvoiceNumber;

     public WebElement txtInvoiceNumber() {
         return txtInvoiceNumber;
     }

     @FindBy(xpath = "//button[contains(@id,'VendEditInvoice') and contains(@id,'buttonParmTablePackingSlips')]")
     private WebElement btnMatchProductReceipts;

     public WebElement btnMatchProductReceipts() {
         return btnMatchProductReceipts;
     }

     @FindBy(xpath = "//span[text()='Update match status']")
     private WebElement btnUpdateMatchStatus;

     public WebElement btnUpdateMatchStatus() {
         return btnUpdateMatchStatus;
     }

     @FindBy(xpath = "//span[text()='Overview']")
     private WebElement labelOverview;

     public WebElement labelOverview() {
         return labelOverview;
     }

     @FindBy(xpath = "//span[text()='All']")
     private WebElement labelAll;

     public WebElement labelAll() {
         return labelAll;
     }

     @FindBy(xpath = "//input[contains(@id,'included_')]")
     private WebElement chkIncluded;

     public WebElement chkIncluded() {
         return chkIncluded;
     }

     @FindBy(xpath = "(//span[text()=\"Post\"])[2]")
     private WebElement btnPost;

     public WebElement btnPost() {
         return btnPost;
     }

     @FindBy(xpath = "(//input[contains(@id,'VendPackingSlipJour_All_InvoiceAccount')])[last()]")
     private WebElement txtLastInvoiceAccount;

     public WebElement txtLastInvoiceAccount() {
         return txtLastInvoiceAccount;
     }

     @FindBy(xpath = "(//div[@role='checkbox']//div[@class='_sr23qd' and @title='No'])[last()]")
     private WebElement chkSelectLast;

     public WebElement chkSelectLast() {
         return chkSelectLast;
     }

     @FindBy(xpath = "//button[@class='messageBar-button messageBar-collapseButton']")
     private WebElement btnMessageBar;

     public WebElement btnMessageBar() {
         return btnMessageBar;
     }

     @FindBy(xpath = "//div[@class='messageBar-messageRegion']")
     private WebElement messagePrint;

     public WebElement messagePrint() {
         return messagePrint;
     }

     @FindBy(xpath = "//h2[text()='If you select to create new invoices from another document, the changes that you made to the invoices in the invoice list, and any new invoices that you created, will be discarded. Do you want to continue?']")
     private WebElement alertReserveOk;

     public WebElement alertReserveOk() {
         return alertReserveOk;
     }

     @FindBy(xpath = "//span[starts-with(@id, 'SysBoxForm') and contains(@id, 'Ok_label') and text()='OK']")
     private WebElement btnReserveOk;

     public WebElement btnReserveOk() {
         return btnReserveOk;
     }

     @FindBy(xpath = "(//div[text()='Product receipt'])[3]")
     private WebElement headerProductReceipt;

     public WebElement headerProductReceipt() {
         return headerProductReceipt;
     }

     @FindBy(xpath = "//input[contains(@name, 'FilterField_VendPackingSlipJour_All_PackingSlipId_PackingSlipId')]")
     private WebElement txtProductReceiptSearch;

     public WebElement txtProductReceiptSearch() {
         return txtProductReceiptSearch;
     }

		
		
		

} 
     

