package com.d365.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class RngPage extends MasterClass {

	public RngPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='loginfmt']")
	private WebElement username;

	public WebElement enterUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement usrsubmit;

	public WebElement clickUsersubmit() {
		return usrsubmit;
	}

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement enterPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement paswsubmit;

	public WebElement clickPaswsubmit() {
		return paswsubmit;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public WebElement clicksubmit() {
		return submit;
	}

	@FindBy(xpath = "//Span[@class='workspace-image GroupedList-symbol']")
	private WebElement icon;

	public WebElement clickmodule() {
		return icon;
	}

	@FindBy(xpath = "//a[text()='Jewellery']")
	private WebElement jewellery;

	public WebElement clickJewellery() {
		return jewellery;
	}

	@FindBy(xpath = "//a[text()='RNG Process']")
	private WebElement rng;

	public WebElement clickRng() {
		return rng;
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement rnew;

	public WebElement clickRNew() {
		return rnew;
	}

	
//	@FindBy(name = "NewButton")
//	private WebElement newrng;
//
//	public WebElement clickNewrng() {
//		return newrng;
//	}

	@FindBy(xpath = "//input[@name='ID_BulkTagNo']")
	private WebElement tagno;

	public WebElement enterTagno() {
		return tagno;
	}

	@FindBy(name = "ID_TagHeader")
	private WebElement TagHeader;

	public WebElement clickIDTagHeader() {
		return TagHeader;
	}

	@FindBy(xpath = "//span[text()='Generate Tag']")
	private WebElement taggenaration;

	public WebElement clickTaggeneration() {
		return taggenaration;
	}

	@FindBy(name="Fld1_1")
	private WebElement generatetag;

	public WebElement enterGeneratetag() {
		return generatetag;
	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement ok;

	public WebElement clickOk() {
		return ok;
	}

	@FindBy(xpath = "//span[text()='PreTagLine']")
	private WebElement pretagline;

	public WebElement clickPretagline() {
		return pretagline;
	}
	@FindBy(xpath = "//span[text()='PreTag header']")
	private WebElement pretagheader;

	public WebElement clickPretagHeader() {
		return pretagheader;
	}

	@FindBy(xpath="(//input[contains(@id,'AcxPreTagLines_Quantity') and contains(@id,'_input') ])[1]")
	private WebElement quantity;

	public WebElement enterQuantity() {
		return quantity;
	}
	@FindBy(xpath="(//input[contains(@id,'AcxPreTagLines_Quantity') and contains(@id,'_input') ])[2]")
	private WebElement diamondquantity;

	public WebElement enterDQuantity() {
		return diamondquantity;
	}
	@FindBy(xpath="(//input[contains(@id,'AcxPreTagLines_Quantity') and contains(@id,'_input') ])[3]")
	private WebElement stonequantity;

	public WebElement enterSQuantity() {
		return stonequantity;
	}

	@FindBy(xpath = "//span[text()='Validate']")
	private WebElement validate;

	public WebElement clickValidate() {
		return validate;
	}

	@FindBy(xpath = "//span[text()='Post']")
	private WebElement post;

	public WebElement clickPost() {
		return post;
	}
	@FindBy(xpath = "(//span[text()='Delete'])[2]")
	private WebElement delete;

	public WebElement clickDelete() {
		return delete;
	}

	@FindBy(xpath = "(//div[@title='Select or unselect row'])[1]")
	private WebElement row;

	public WebElement selectRow() {
		return row;
	}
	
	@FindBy(xpath = "(//div[@role='checkbox' and contains(@title,'Select or unselect row')])[1]")
	private WebElement tick;

	public WebElement selectTick() {
		return tick;
	}
	@FindBy(xpath = "(//div[@role='checkbox' and contains(@title,'Select or unselect row')])[2]")
	private WebElement tick1;

	public WebElement selectTick1() {
		return tick1;
	}
	@FindBy(xpath = "//span[text()='Yes']")
	private WebElement yes;

	public WebElement clickYes() {
		return yes;
	}
	@FindBy(xpath = "(//div[contains(@id,'TA_RngPreTagHeader_ItemId')])[2]")
	private WebElement itemid;

	public WebElement checkItemid() {
		return itemid;
	}
	
	@FindBy(name = "Status_Status")
	private WebElement status;

	public WebElement checkStatus() {
		return status;
	}
	@FindBy(xpath="(//input[contains(@id,'MainGrid_TagStatus') and contains(@id,'_input')])[1]")
	private WebElement tagstatus;

	public WebElement checkTagStatus() {
		return tagstatus;
	}
	
	@FindBy(xpath = "(//div[text()='Tag Status'])[1]")
	private WebElement cstatus;

	public WebElement getStatusColumn() {
		return cstatus;
	}
	@FindBy(xpath="//span[contains(@id,'ta_rngprocess1') and contains(@id,'_Status_Validated_toggle')]")
	private WebElement toggle;

	public WebElement checkToggle() {
		return toggle;
	}
	@FindBy(xpath = "//div[text()='No'])")
	private WebElement statusno;

	public WebElement getToggleNo() {
		return statusno;
	}
	@FindBy(xpath = "//div[text()='Yes'])")
	private WebElement statusyes;

	public WebElement getToggleYes() {
		return statusyes;
	}
	@FindBy(xpath="//input[contains(@id,'ta_rngprocess1') and contains(@id,'_ID_TransDate_input')]")
	private WebElement date;

	public WebElement checkDate() {
		return date;
	}
	@FindBy(xpath = "//button[contains(@class, 'messageBar-button') and contains(@data-dyn-controlname, 'MessageBarClose') and contains(@aria-label, 'Close')]")
	private WebElement noteButton;
 
	public WebElement notificationCloseButton() {
		return noteButton;
	}
}
