package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class SchememMaturityReportpage extends MasterClass {
	public SchememMaturityReportpage() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@name='Username']")
	private WebElement txtusername;

	public WebElement txtusername() {
		return (txtusername);
	}

	@FindBy(xpath = "//input[@name='Password']")
	private WebElement txtPassword;

	public WebElement txtPassword() {
		return (txtPassword);
	}
	@FindBy(xpath = "//input[@id='loginbtn']")
	private WebElement btnSignin;

	public WebElement btnSignin() {
		return (btnSignin);
	}
	
	@FindBy(xpath = "//input[@name='customer']")
	private WebElement txtSelectCustomer;

	public WebElement txtSelectCustomer() {
		return (txtSelectCustomer);
	}
	
	

	@FindBy(xpath = "//a[@id='showCustomerModalView_id'][1]")
	private WebElement lnkHambergermenu;

	public WebElement lnkHambergermenu() {
		return (lnkHambergermenu);
	}
	
	@FindBy(xpath = "//a[contains(@href, 'SchemeMaturityReport') and contains(text(), 'Scheme Maturity Report')]")
	private WebElement lnkSchemeMaturityReport;

	public WebElement lnkSchemeMaturityReport() {
		return (lnkSchemeMaturityReport);
	}
	@FindBy(xpath = "//input[@name='FromDate']")
	private WebElement datepickerFromdate;

	public WebElement datepickerFromdate() {
		return (datepickerFromdate);
	}
	
	@FindBy(xpath = "//input[@name='ToDate']")
	private WebElement datepickerToDate;

	public WebElement datepickerToDate() {
		return (datepickerToDate);
	}
	

	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[1]")
	private WebElement dropdownScheemType;

	public WebElement dropdownScheemType() {
		return (dropdownScheemType);
	}
	
	@FindBy(xpath = "(//input[@class='choices__input choices__input--cloned'])[2]")
	private WebElement dropdownStore;

	public WebElement dropdownStore() {
		return (dropdownStore);
	}
	//button[@id='findexportId']
	
	@FindBy(xpath = "//button[@id='findexportId']")
	private WebElement btnExport;

	public WebElement btnExport() {
		return (btnExport);
	}
	@FindBy(xpath = "//button[@id='findreportId']")
	private WebElement btnFind;

	public WebElement btnFind() {
		return (btnFind);
	}
	
	@FindBy(xpath = "//button[@id='resetId']")
	private WebElement btnReset;

	public WebElement btnReset() {
		return (btnReset);
	}
	
	
	
	
}
