package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class BankMasterPage extends MasterClass {

	private WebDriverWait wait;

	public BankMasterPage() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Default timeout of 10 seconds
	}

	private WebElement waitForElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	@FindBy(xpath = "//div[@id='navPaneModuleID']")
	private WebElement lnkModule;

	public WebElement lnkModule() {
		return waitForElement(lnkModule);
	}

	@FindBy(xpath = "//a[@data-dyn-title='Jewellery']")
	private WebElement lnkJewellery;

	public WebElement lnkJewellery() {
		return waitForElement(lnkJewellery);
	}

	@FindBy(xpath = "//a[text()='Bank Master']")
	private WebElement lnkBankMaster;

	public WebElement lnkBankMaster() {
		return waitForElement(lnkBankMaster);
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement btnNew;

	public WebElement btnNew() {
		return waitForElement(btnNew);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxBankMaster_BankName_') and contains(@id,'_input')])[1]")
	private WebElement txtBankName;

	public WebElement txtBankName() {
		return waitForElement(txtBankName);
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxBankMaster_Description_') and contains(@id,'_input')])[1]")
	private WebElement txtDescription;

	public WebElement txtDescription() {
		return waitForElement(txtDescription);
	}

	@FindBy(name = "SystemDefinedSaveButton")
	private WebElement btnSave;

	public WebElement btnSave() {
		return waitForElement(btnSave);
	}

	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement btnDelete;

	public WebElement btnDelete() {
		return waitForElement(btnDelete);
	}

	@FindBy(xpath = "//button[@name='Yes']")
	private WebElement btnConfirmDelete;

	public WebElement btnConfirmDelete() {
		return waitForElement(btnConfirmDelete);
	}

	@FindBy(xpath = "//table[@id='bankList']//tr")
	private WebElement gridBankRow;

	public WebElement gridBankRow() {
		return waitForElement(gridBankRow);
	}

		
//		@FindBy(xpath = "SystemDefinedSaveButton")
//		private WebElement selectBankRow;
//
//		public WebElement selectBankRow() {
//		    return selectBankRow;
//		}

		
	  
	}
