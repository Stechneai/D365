package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class MonthlySavingSchemeDefaulterListPage extends MasterClass{
	
	public MonthlySavingSchemeDefaulterListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"navPaneModuleID\"]")
 	private WebElement clickModule;	
 	public WebElement lnkModule()
 	{
 	    return(clickModule);
 	}

	//-----Jewellery
 	@FindBy(xpath="//a[text()=\"Jewellery\"]")
 	private WebElement clickJewellery;	
 	public WebElement lnkJewellery()
 	{
 	    return(clickJewellery);
 	}
 
 	 	@FindBy(xpath="//div[@aria-label=\"Monthly Saving Scheme Defaulter's List Report\"]/a[text()=\"Monthly Saving Scheme Defaulter's List Report\"]")
 	 	private WebElement schemedefaulterlist;	
 	 	public WebElement lnkSchemeDefaulterList()
 	 	{
 	 	    return(schemedefaulterlist);
 	 	}
	 	@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[1]")
 	 	private WebElement store;	
 	 	public WebElement dropDownStore()
 	 	{
 	 	    return(store);
 	 	}	
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[2]")
 	 	private WebElement fromdate;	
 	 	public WebElement datePickerFromDate()
 	 	{
 	 	    return(fromdate);
 	 	}
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[3]")
 	 	private WebElement schemetype;	
 	 	public WebElement dropDownSchemeType()
 	 	{
 	 	    return(schemetype);
 	 	}
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[4]")
 	 	private WebElement todate;	
 	 	public WebElement datePickerToDate()
 	 	{
 	 	    return(todate);
 	 	}	
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[5]")
 	 	private WebElement type;	
 	 	public WebElement dropDownType()
 	 	{
 	 	    return(type);
 	 	}	
 	 
// 	 	@FindBy(xpath="(//button[contains(@id,'SysOperationTemplateForm_4_CommandButton')])[1]")
// 	 	private WebElement ok;	
// 	 	public WebElement btnok()
// 	 	{
// 	 	    return(ok);
// 	 	}
 	 	

 	 	@FindBy(xpath="//span[text()='OK']")
 	 	private WebElement ok;	
 	 	public WebElement btnok()
 	 	{
 	 	    return(ok);
 	 	}
 	 	
 		@FindBy(xpath ="//button[@id='download']")
 	 	private WebElement download;	
 	 	public WebElement btnDownload()
 	 	{
 	 	    return(download);
 	 	}
 		@FindBy(xpath="//span[text()='WAKAD BRANCH']")
 	 	private WebElement stored;	
 	 	public WebElement labelStored()
 	 	{
 	 	    return(stored);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'CSUT000000005')]")
 	 	private WebElement customercode1;	
 	 	public WebElement txtCustomerCode1()
 	 	{
 	 	    return(customercode1);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'CSUT000208794')]")
 	 	private WebElement customercode2;	
 	 	public WebElement txtCustomerCode2()
 	 	{
 	 	    return(customercode2);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'CSUT000059370')]")
 	 	private WebElement customercode3;	
 	 	public WebElement txtCustomerCode3()
 	 	{
 	 	    return(customercode3);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'GDPWAK256202519')]")
 	 	private WebElement schementryno1;	
 	 	public WebElement txtSchemeEntryNo1()
 	 	{
 	 	    return(schementryno1);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'GDPWAK59220251')]")
 	 	private WebElement schementryno2;	
 	 	public WebElement txtSchemeEntryNo2()
 	 	{
 	 	    return(schementryno2);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'GDPWAK925202518')]")
 	 	private WebElement schementryno3;	
 	 	public WebElement txtSchemeEntryNo3()
 	 	{
 	 	    return(schementryno3);
 	 	}
 		@FindBy(xpath="//label[text()='Store']")
 	 	private WebElement storel;	
 	 	public WebElement labelStorel()
 	 	{
 	 	    return(storel);
 	 	}
 	 	@FindBy(xpath="//label[text()='Scheme Type']")
 	 	private WebElement schemetypel;	
 	 	public WebElement labelSchemeTypel()
 	 	{
 	 	    return(schemetypel);
 	 	}
 		@FindBy(xpath="//label[text()='From Date']")
 	 	private WebElement fromdatel;	
 	 	public WebElement labelFromDatel()
 	 	{
 	 	    return(fromdatel);
 	 	}
 		@FindBy(xpath="//label[text()='To Date']")
 	 	private WebElement todatel;	
 	 	public WebElement labelToDatel()
 	 	{
 	 	    return(todatel);
 	 	}
 		@FindBy(xpath="//label[text()='Type']")
 	 	private WebElement typel;	
 	 	public WebElement labelTypel()
 	 	{
 	 	    return(typel);
 	 	}
 	 	
 		@FindBy(xpath="//button[@id='dynNavigationBarMessages_buttonNotifications']")
 	 	private WebElement notificationb;	
 	 	public WebElement btnNotification()
 	 	{
 	 	    return(notificationb);
 	 	}
 	 	@FindBy(xpath = "//li[@class=\"messageCenter-item\"][1]")
 		private WebElement notificationmessage;

 		public WebElement labelNotificationMessage() {
 			return notificationmessage;
 		}

 	 	
 		

}
