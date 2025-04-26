package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class AllSalesOrderPageLot extends MasterClass {

	public AllSalesOrderPageLot() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement module;

	public WebElement modules() {
		return module;
	}

	@FindBy(xpath = "//a[text()='Accounts receivable']")
	private WebElement acreceivable;

	public WebElement clickAcreceivable() {
		return acreceivable;
	}

	@FindBy(xpath = "//a[text()='All sales orders']")
	private WebElement allsalesorder;

	public WebElement clickAllSalesOrder() {
		return allsalesorder;
	}

	@FindBy(name = "SystemDefinedNewButton")
	private WebElement news;

	public WebElement clickNewS() {
		return news;
	}

	@FindBy(name = "SalesTable_CustAccount")
	private WebElement cusn;

	public WebElement selectCusAc() {
		return cusn;
	}

	@FindBy(name = "SalesTable_AcxNumberSequenceTemplateId") // add
	private WebElement numbersequence;

	public WebElement enterNumberSequence() {
		return numbersequence;
	}

	@FindBy(xpath = "//span[text()='OK']") // add
	private WebElement ok;

	public WebElement clickOkButton() {
		return ok;
	}

	@FindBy(xpath = "//button[contains(@id,'SalesTable_') and contains(@id,'SalesOrder_button')]") // add
	private WebElement salesorder;

	public WebElement clickSalesOrder() {
		return salesorder;
	}

	@FindBy(xpath = "//span[text()='Tag Scanning']") // add
	private WebElement tagscanning;

	public WebElement clickTagScanning() {
		return tagscanning;
	}

	@FindBy(xpath = "//input[contains(@id,'AcxBarcodeScanning')and contains(@id,'SeTag_input')]") // add
	private WebElement scantag;

	public WebElement enterTag() {
		return scantag;
	}

	@FindBy(xpath = "//span[text()='Generate Line']") // add
	private WebElement generateline;

	public WebElement clickGenerateLine() {
		return generateline;
	}

	@FindBy(xpath = "(//span[text()='Sell'])[2]") // add
	private WebElement sell;

	public WebElement clickSellButton() {
		return sell;
	}

	@FindBy(xpath = "//span[text()='Sell']") // add
	private WebElement sell1;

	public WebElement clickSellButton1() {
		return sell1;
	}

	@FindBy(xpath = "//span[text()='Confirm now']") // add
	private WebElement confirmnow;

	public WebElement clickConfirmNow() {
		return confirmnow;
	}

	@FindBy(xpath = "(//span[text()='Pick and pack'])[2]") // add
	private WebElement pickpack;

	public WebElement clickPickPackButton() {
		return pickpack;
	}

	@FindBy(xpath = "//button[contains(@id,'SalesTable') and contains(@id,'_PickAndPack_button')]") // add
	private WebElement pickpack1;

	public WebElement clickPickPackButton1() {
		return pickpack1;
	}

	@FindBy(xpath = "//span[text()='Generate picking list']") //
	private WebElement generatingpack;

	public WebElement clickGeneratingPick() {
		return generatingpack;
	}

	@FindBy(xpath = "(//span[text()='OK'])[1]") // add
	private WebElement okg;

	public WebElement clickGOkButton() {
		return okg;
	}

	@FindBy(xpath = "(//span[text()='OK'])[2]") //
	private WebElement okc;

	public WebElement clickCOkButton() {
		return okc;
	}

	@FindBy(xpath = "//button[contains(@id,'SalesTable') and contains(@id,'buttonUpdatePickingListRegistrate_label')]")
	private WebElement registartionpick;

	public WebElement clickRegistartionPick() {
		return registartionpick;
	}

//	@FindBy(name = "buttonUpdatePickingListRegistrate")
	@FindBy(xpath = "(//span[text()='Picking list registration'])[2]")
	private WebElement regPick;

	public WebElement registrationPick() {
		return regPick;
	}

	@FindBy(xpath = "//button[contains(@name,'buttonUpdatePickingListRegistrate')]")
	private WebElement buttonUpdatePickingListRegistrate;

	public WebElement clickRegistartionPickName() {
		return buttonUpdatePickingListRegistrate;
	}

	@FindBy(name = "UpdatesMenuButton") //
	private WebElement updateb;

	public WebElement clickUpdateButton() {
		return updateb;
	}

	@FindBy(xpath = "//span[text()='Update all']") //
	private WebElement updatea;

	public WebElement clickUpdateAllButton() {
		return updatea;
	}

	@FindBy(name = "SystemDefinedCloseButton") //
	private WebElement back;

	public WebElement clickBackButton() {
		return back;
	}

	@FindBy(xpath = "//span[text()='Post packing slip']") //
	private WebElement packslip;

	public WebElement clickPackSlip() {
		return packslip;
	}

	@FindBy(xpath = "(//span[text()='OK'])[1]") //
	private WebElement okpack;

	public WebElement clickOkPackSlip() {
		return okpack;
	}

	@FindBy(xpath = "(//span[text()='OK'])[2]") //
	private WebElement okspack;

	public WebElement clickCOkPackSlip() {
		return okspack;
	}

	@FindBy(xpath = "(//span[text()='Invoice'])[2]") //
	private WebElement invoice;

	public WebElement clickInvoiceButton() {
		return invoice;
	}

	@FindBy(name = "buttonUpdateInvoice") //
	private WebElement invoicec;

	public WebElement clickCInvoiceButton() {
		return invoicec;
	}

	@FindBy(xpath = "(//span[text()='OK'])[1]") //
	private WebElement invoiceok;

	public WebElement clickOkInvoiceButton() {
		return invoiceok;
	}

	@FindBy(xpath = "(//span[text()='OK'])[2]") //
	private WebElement invoicecok;

	public WebElement clickCOkInvoiceButton() {
		return invoicecok;
	}

	@FindBy(name = "SalesTable_InventSiteId") //
	private WebElement site;

	public WebElement enterSalesSite() {
		return site;
	}


	@FindBy(name = "LineViewHeader_InventLocationIdFrom")
	private WebElement fromwarehouse;

	public WebElement enterFromWarehouse() {
		return fromwarehouse;
	}

	@FindBy(name = "LineViewHeader_InventLocationIdTo")
	private WebElement towarehouse;

	public WebElement enterToWarehouse() {
		return towarehouse;
	}
	@FindBy(name = "SalesTable_InventLocationId") //
	private WebElement warehouse;

	public WebElement enterSalesWarehouse() {
		return warehouse;
	}
	
	@FindBy(xpath = "(//input[contains(@id,'SalesLine_SalesQty') and contains(@id,'_input')])[1]")
	private WebElement salelineqty;
	public WebElement getSaleLineQuantity() {
		return salelineqty;
	}
	
	@FindBy(xpath = "(//input[contains(@id,'FormGroupControl1_PCS') and contains(@id,'_input')])[1]")
	private WebElement salelinepcs;
	public WebElement getSaleLinePcs() {
		return salelinepcs;
	}
	@FindBy(xpath = "//button[contains(@id,'SalesTable') and contains(@id,'_LineStripDelete')]")
	private WebElement remove;
   public WebElement getRemove() {
		return remove;
	}
}
