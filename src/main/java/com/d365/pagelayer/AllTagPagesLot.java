package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class AllTagPagesLot extends MasterClass{

	public AllTagPagesLot()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement module;

	public WebElement clickModules() {
		return module;
	}

	@FindBy(xpath = "//a[text()='Jewellery']") // add
	private WebElement jewellery;

	public WebElement clickJewellery() {
		return jewellery;
	}
	@FindBy(xpath = "//a[text()='All Tags']") // add
	private WebElement alltags;

	public WebElement clickAllTags() {
		return alltags;
	}
	@FindBy(xpath="//span[text()='OK']")
	private WebElement okbutton;	
	public WebElement clickOkButton()
	{
		return okbutton;
	}
	@FindBy(xpath="//input[contains(@id,\"AcxPreTagHeader_TagNo_3158_0_0_\")]")
	private WebElement gettagno;	
	public WebElement getTagNo()
	{
		return gettagno;
	}
	@FindBy(xpath="//div[text()='Batch No']")
	private WebElement batchno;	
	public WebElement clickBatchNo()
	{
		return batchno;
	}
	@FindBy(name="FilterField_MainGrid_InventBatchId_InventBatchId_Input_0")
	private WebElement enterbatchno;	
	public WebElement enterBatchNo()
	{
		return enterbatchno;
	}
	@FindBy(xpath="//span[@id='__MainGrid_InventBatchId_ApplyFilters_label']")
	private WebElement apply;	
	public WebElement clickApply()
	{
		return apply;
	}	
	@FindBy(xpath="//div[text()='Stone Weight(CT)']")
	private WebElement stoneweight;	
	public WebElement getStoneWeightName()
	{
		return stoneweight;
	}

//	@FindBy(xpath="//input[contains(@id,'MainGrid_TagT')]")
//	private WebElement getstatus;	
//	public WebElement getStatusName()
//	{
//		return getstatus;
//	}

	@FindBy(xpath="(//input[contains(@id, 'MainGrid_TagType') and contains(@id, '_input')])[1]")
	private WebElement tagname;	
	public WebElement getTagName()
	{
		return tagname;
	}
	@FindBy(xpath="(//input[contains(@id,'MainGrid_TagStatus') and contains(@id,'_input')])[1]")
	private WebElement tagstatus;

	public WebElement checkTagStatus() {
		return tagstatus;
	}
	
	@FindBy(xpath="//span[text()='Edit']")
	private WebElement edit;

	public WebElement checkEdit() {
		return edit;
	}
	@FindBy(xpath="//span[text()='Transactions']")
	private WebElement transaction;

	public WebElement checkTransaction() {
		return transaction;
	}
	@FindBy(xpath="//span[text()='Posted tag']")
	private WebElement postedtag;

	public WebElement checkPostedTag() {
		return postedtag;
	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_InventSiteId') and contains(@id, '_input')]")
	private WebElement csite;	
	public WebElement getCurrentSite()
	{
		return csite;
	}
	
	@FindBy(xpath="//input[contains(@id, 'MainGrid_NoOfPieces') and contains(@id, '_input')]")
	private WebElement vpcs;	
	public WebElement getPcs()
	{
		return vpcs;
	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_GrossWeight') and contains(@id, '_input')]")
	private WebElement vgwt;	
	public WebElement getGrossWeight()
	{
		return vgwt;
	}
	@FindBy(xpath="//input[contains(@id, 'MainGrid_wMSLocationId') and contains(@id, '_input')]")
	private WebElement vlocn;	
	public WebElement getLocation()
	{
		return vlocn;
	}
	
	

}
