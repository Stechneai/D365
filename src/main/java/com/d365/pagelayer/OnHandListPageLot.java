package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class OnHandListPageLot extends MasterClass{
	
	public OnHandListPageLot() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement module;

	public WebElement modules() {
		return module;
	}
	@FindBy(xpath = "//a[text()='Inventory management']")
	private WebElement inventorymanagement;

	public WebElement clickInventoryManagement() {
		return inventorymanagement;

	}
	@FindBy(xpath = "//a[text()='On-hand list']")
	private WebElement onhandlist;

	public WebElement clickOnHandList() {
		return onhandlist;

	}
	@FindBy(name="SystemDefinedFilterPane_FilterDisplay_InventSum_ItemId0_Input_0")
	private WebElement itemnumber;	
	public WebElement enterItemNumber()
	{
		return itemnumber;
	}

	@FindBy(name="SystemDefinedFilterPane_FilterDisplay_InventDim_inventBatchId4_Input_0")
	private WebElement batchnumber;
	public WebElement enterBatchNumber()
	{
		return batchnumber;
	}
	@FindBy(xpath="//span[text()='Apply']")
	private WebElement applyb;
	public WebElement clickApply()
	{
		return applyb;
	}
	
	@FindBy(xpath="//input[contains(@id, 'PhysicalInvent') and contains(@id, '_input')]")
	private WebElement physicalinventory;
	public WebElement getPhyasicalInentory()
	{
		return physicalinventory;
	}

	@FindBy(xpath="//span[text()='Intercompany on-hand']")
    private WebElement intercompanyonhand;
	public WebElement clickInterCompanyhand()
	{
		return intercompanyonhand;
	}
	@FindBy(xpath="//span[text()='Quantity adjustment']")
    private WebElement quantityadjustment;
	public WebElement clickQuantityAdjustment()
	{
		return quantityadjustment;
	}
	@FindBy(xpath="//span[text()='Dimensions']")
    private WebElement dimension;
	public WebElement clickDimension()
	{
		return dimension;
	}
	@FindBy(xpath="//span[text()='View']")
    private WebElement view;
	public WebElement clickView()
	{
		return view;
	}
}
