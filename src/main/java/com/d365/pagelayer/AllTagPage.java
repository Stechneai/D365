package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class AllTagPage extends MasterClass{

	public AllTagPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement lnkmodule;

	public WebElement lnkModules() {
		return lnkmodule;
	}

	@FindBy(xpath = "//a[text()='Jewellery']") // add
	private WebElement jewellery;

	public WebElement lnkJewellery() {
		return jewellery;
	}
	@FindBy(xpath = "//a[text()='All Tags']") // add
	private WebElement alltags;

	public WebElement lnkAllTags() {
		return alltags;
	}
	@FindBy(xpath="//span[text()='OK']")
	private WebElement okbutton;	
	public WebElement btnOk()
	{
		return okbutton;
	}
	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_TagNo_3158_0_0_\")]")
	private WebElement gettagno;	
	public WebElement txtTagNo()
	{
		return gettagno;
	}
	@FindBy(xpath="//div[text()='Batch No']")
	private WebElement batchno;	
	public WebElement btnBatchNo()
	{
		return batchno;
	}
	@FindBy(name="FilterField_MainGrid_InventBatchId_InventBatchId_Input_0")
	private WebElement txtbatchno;	
	public WebElement txtbatchno()
	{
		return txtbatchno;
	}
	@FindBy(xpath="//span[@id='__MainGrid_InventBatchId_ApplyFilters_label']")
	private WebElement apply;	
	public WebElement btnApply()
	{
		return apply;
	}	
	@FindBy(xpath="//div[text()='Stone Weight(CT)']")
	private WebElement stoneweight;	
	public WebElement lblStoneWeightName()
	{
		return stoneweight;
	}

//	@FindBy(xpath="//input[contains(@id,'MainGrid_TagT')]")
//	private WebElement getstatus;	
//	public WebElement getStatusName()
//	{
//		return getstatus;
//	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_TagType') and contains(@id, '_input')]")
	private WebElement tagtype;	
	public WebElement txtStatusName()
	{
		return tagtype;
	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_InventSiteId') and contains(@id, '_input')]")
	private WebElement csite;	
	public WebElement txtCurrentSite()
	{
		return csite;
	}
	@FindBy(xpath="//div[text()='Location']")
	private WebElement locationf;	
	public WebElement txtScrollLocation()
	{
		return locationf;
	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_wMSLocationId') and contains(@id, '_input')]")
	private WebElement location;	
	public WebElement txtLocation()
	{
		return location;
	}


}
