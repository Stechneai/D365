package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class PDCReportPage extends MasterClass{
	
	public PDCReportPage()
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
 
 	 	@FindBy(xpath="//div[@aria-label='Post Dated Saving Scheme Cheque Pending']/a[text()='Post Dated Saving Scheme Cheque Pending']")
 	 	private WebElement pdcReport;	
 	 	public WebElement lnkPDCReport()
 	 	{
 	 	    return(pdcReport);
 	 	}
 	 	
 	 	@FindBy(xpath="//button[@name='CommandButton']")
 	 	private WebElement ok;	
 	 	public WebElement btnok()
 	 	{
 	 	    return(ok);
 	 	}
 	 	
 	 	@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[1]")
 	 	private WebElement location;	
 	 	public WebElement dropDownLocation()
 	 	{
 	 	    return(location);
 	 	}	
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[2]")
 	 	private WebElement fromdate;	
 	 	public WebElement datePickerFromDate()
 	 	{
 	 	    return(fromdate);
 	 	}
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[3]")
 	 	private WebElement scheme;	
 	 	public WebElement dropDownScheme()
 	 	{
 	 	    return(scheme);
 	 	}
 		@FindBy(xpath="(//input[contains(@id,'SysOperationTemplateForm')])[4]")
 	 	private WebElement todate;	
 	 	public WebElement datePickerToDate()
 	 	{
 	 	    return(todate);
 	 	}	
 		@FindBy(id ="download")
 	 	private WebElement download;	
 	 	public WebElement btnDownload()
 	 	{
 	 	    return(download);
 	 	}
 	 	@FindBy(xpath="(//span[contains(text()='Gold Dream Plan')][2]")
 	 	private WebElement schmetype1;	
 	 	public WebElement txtSchemeType1()
 	 	{
 	 	    return(schmetype1);
 	 	}
 	 	@FindBy(xpath="(//span[contains(text()='Gold Dream Plan')][3]")
 		private WebElement schmetype2;	
 	 	public WebElement txtSchemeType2()
 	 	{
 	 	    return(schmetype2);
 	 	}
 	 	@FindBy(xpath="(//span[contains(text()='Gold Dream Plan')][4]")
 		private WebElement schmetype3;	
 	 	public WebElement txtSchemeType3()
 	 	{
 	 	    return(schmetype3);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'PRIYA DATTATRAY THORAT')]")
 	 	private WebElement customername1;	
 	 	public WebElement txtCustomerName1()
 	 	{
 	 	    return(customername1);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'PRIYA DATTATRAY THORAT')]")
 	 	private WebElement customername2;	
 	 	public WebElement txtCustomerName2()
 	 	{
 	 	    return(customername2);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'AAMRAJA DATTATRAYA JAGTAP')]")
 	 	private WebElement customername3;	
 	 	public WebElement txtCustomerName3()
 	 	{
 	 	    return(customername3);
 	 	}
	 	@FindBy(xpath="//span[contains(text(),'BGDPBL330202548')]")
 	 	private WebElement schementryno1;	
 	 	public WebElement txtSChemeEntryNo1()
 	 	{
 	 	    return(schementryno1);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'BGDPBL330202548')]")
 	 	private WebElement schementryno2;	
 	 	public WebElement txtSChemeEntryNo2()
 	 	{
 	 	    return(schementryno2);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'BGDPBL880202544')]")
 	 	private WebElement schementryno3;	
 	 	public WebElement txtSChemeEntryNo3()
 	 	{
 	 	    return(schementryno3);
 	 	}
 	 	
 	 	@FindBy(xpath="//span[contains(text(),'4/21/2025')]")
 	 	private WebElement chequedate1;	
 	 	public WebElement txtChequeDate1()
 	 	{
 	 	    return(chequedate1);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'3/21/2025')]")
 	 	private WebElement chequedate2;	
 	 	public WebElement txtChequeDate2()
 	 	{
 	 	    return(chequedate2);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'4/28/2025')]")
 	 	private WebElement chequedate3;	
 	 	public WebElement txtChequeDate3()
 	 	{
 	 	    return(chequedate3);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'54321')]")
 	 	private WebElement chequeno1;	
 	 	public WebElement txtChequeNo1()
 	 	{
 	 	    return(chequeno1);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'15246')]")
 	 	private WebElement chequeno2;	
 	 	public WebElement txtChequeNo2()
 	 	{
 	 	    return(chequeno2);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'12349')]")
 	 	private WebElement chequeno3;	
 	 	public WebElement txtChequeNo3()
 	 	{
 	 	    return(chequeno3);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'BOI')]")
 	 	private WebElement bankname1;	
 	 	public WebElement txtBankName1()
 	 	{
 	 	    return(bankname1);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'BOI')]")
 	 	private WebElement bankname2;	
 	 	public WebElement txtBankName2()
 	 	{
 	 	    return(bankname2);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'CNB')]")
 	 	private WebElement bankname3;	
 	 	public WebElement txtBankName3()
 	 	{
 	 	    return(bankname3);
 	 	}
 	 	
 	 	@FindBy(xpath="//span[contains(text(),'3,000.00')]")
 	 	private WebElement chequeamount1;	
 	 	public WebElement txtChequeAmount1()
 	 	{
 	 	    return(chequeamount1);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'3,000.00')]")
 	 	private WebElement chequeamount2;	
 	 	public WebElement txtChequeAmount2()
 	 	{
 	 	    return(chequeamount2);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'2,000.00')]")
 	 	private WebElement chequeamount3;	
 	 	public WebElement txtChequeAmount3()
 	 	{
 	 	    return(chequeamount3);
 	 	}
 		@FindBy(xpath="//span[contains(text(),'2/28/2025')]")
 	 	private WebElement schemeopeningdate1;	
 	 	public WebElement txtSchemeOpeningDate1()
 	 	{
 	 	    return(schemeopeningdate1);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'2/28/2025')]")
 	 	private WebElement schemeopeningdate2;	
 	 	public WebElement txtSchemeOpeningDate2()
 	 	{
 	 	    return(schemeopeningdate2);
 	 	}
 	 	@FindBy(xpath="//span[contains(text(),'2/27/2025')]")
 	 	private WebElement schemeopeningdate3;	
 	 	public WebElement txtSchemeOpeningDate3()
 	 	{
 	 	    return(schemeopeningdate3);
 	 	}
 	 	

}
