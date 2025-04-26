package com.d365.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.d365.utils.MasterClass;

public class ReprintingOfLabelPage extends MasterClass {

	public ReprintingOfLabelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement module;

	public WebElement lnkModules() {
		return  (module);
	}

	@FindBy(xpath = "//a[text()='Jewellery']") // add
	private WebElement jewellery;

	public WebElement lnkJewellery() {
		return  (jewellery);
	}

	@FindBy(xpath = "//a[text()='Reprinting of Labels']") // add
	private WebElement reprintingoflabel;

	public WebElement lnkReprintingOfLabel() {
		return  (reprintingoflabel);
	}

	@FindBy(xpath = "//span[text()='New']")
	private WebElement newb;

	public WebElement btnNew() {
		return  (newb);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_Location']")
	private WebElement location;

	public WebElement dropDownLocation() {
		return  (location);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_ItemId']")
	private WebElement selectItem;

	public WebElement dropDownItem() {
		return  (selectItem);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_PurposeOfReprinting']")
	private WebElement purpose;

	public WebElement dropDownPurposeOfReprinting() {
		return  (purpose);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_OrnamentCategoryCode']")
	private WebElement category;

	public WebElement dropDownCategory() {
		return  (category);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_TagNo']")
	private WebElement tagno;

	public WebElement txtTagNo() {
		return  (tagno);
	}

	@FindBy(xpath = "//span[text()='Validate']")
	private WebElement validate;

	public WebElement lnkValidate() {
		return  (validate);
	}

	@FindBy(xpath = "//span[text()='Post']")
	private WebElement post;

	public WebElement lnkPost() {
		return  (post);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_VendName']")
	private WebElement subsmith;

	public WebElement dropDownSubSmith() {
		return  (subsmith);
	}

	@FindBy(xpath = "//a[text()='All Tags']") // add
	private WebElement alltags;

	public WebElement lnkAllTags() {
		return  (alltags);
	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement okbutton;

	public WebElement btnOk() {
		return  (okbutton);
	}

	@FindBy(xpath = "//div[text()='Ornament Size1']")
	private WebElement ornamentc;

	public WebElement labelOrnamentSize() {
		return  (ornamentc);
	}

	@FindBy(xpath = "//div[text()='Design Code']")
	private WebElement designcode;

	public WebElement labelGetDesigncode() {
		return  (designcode);
	}

	@FindBy(xpath = "//input[contains(@id,'MainGrid_DesignCode') and contains(@id,'_input')]")
	private WebElement designcodev;

	public WebElement txtGetDesignCode() {
		return  (designcodev);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_AttributeChange']")
	private WebElement valuedesigncode;

	public WebElement txtDesigncodeValue() {
		return  (valuedesigncode);
	}

	@FindBy(xpath = "//div[text()='Design Code']")
	private WebElement hmpcs;

	public WebElement labelGetHallmarkingPcs() {
		return  (hmpcs);
	}

	@FindBy(xpath = "//input[@aria-label='HallMarking Pcs']")
	private WebElement hmpcsv;

	public WebElement txtGetHmPcs() {
		return  (hmpcsv);
	}

	@FindBy(xpath = "//div[text()='Collection Code']")
	private WebElement collectioncode;

	public WebElement labelGetCollectionCode() {
		return  (collectioncode);
	}

	@FindBy(xpath = "//input[@aria-label='Collection Code']")
	private WebElement collectioncodev;

	public WebElement txtGetCollectionCode() {
		return  (collectioncodev);
	}

	@FindBy(xpath = "//div[text()='Certificate No']")
	private WebElement certificateno;

	public WebElement labelGetCerticateNo() {
		return  (certificateno);
	}

	@FindBy(xpath = "//input[@aria-label='Certificate No']")
	private WebElement certificatenov;

	public WebElement txtGetCertificateNo() {
		return  (certificatenov);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_ItemId']")
	private WebElement itemid;

	public WebElement dropDownItemid() {
		return  (itemid);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_AcxWastageCode']")
	private WebElement wastagecode;

	public WebElement dropDownWastageCode() {
		return  (wastagecode);
	}

	@FindBy(xpath = "//div[text()='Making Code']")
	private WebElement makingcode;

	public WebElement labelGetMakingCode() {
		return  (makingcode);
	}

	@FindBy(xpath = "//input[contains(@id,'MainGrid_MakingCode') and contains(@id,'_input')]")
	private WebElement makingcodet;

	public WebElement txtGetMakingCode() {
		return  (makingcodet);
	}

	@FindBy(xpath = "//div[text()='Making Rate']")
	private WebElement makingrate;

	public WebElement labelGetMakingRate() {
		return  (makingrate);
	}

	@FindBy(xpath = "//input[contains(@id,'MainGrid_MakingRate') and contains(@id,'_input')]")
	private WebElement makingratet;

	public WebElement txtGetMakingRate() {
		return  (makingratet);
	}

	@FindBy(xpath = "//label[text()='Select Item']")
	private WebElement itemidl;

	public WebElement labelGetItemId() {
		return  (itemidl);
	}

	@FindBy(xpath = "//label[text()='Wastage Code']")
	private WebElement wastagecodel;

	public WebElement labelGetWastageCode() {
		return  (wastagecodel);
	}

	@FindBy(xpath = "//label[text()='Rate']")
	private WebElement rate;

	public WebElement labelGetRate() {
		return  (rate);
	}

	@FindBy(xpath = "//input[@name='AutoSummary_MakingRate']")
	private WebElement ratet;

	public WebElement txtGetRate() {
		return  (ratet);
	}

	@FindBy(xpath = "//label[text()='MRP']")
	private WebElement mrp;

	public WebElement labelGetMRP() {
		return  (mrp);
	}

	@FindBy(xpath = "//input[@aria-label='MRP']")
	private WebElement mrpt;

	public WebElement txtGetMRP() {
		return  (mrpt);
	}

	@FindBy(xpath = "//div[text()='Rate']")
	private WebElement ratealltag;

	public WebElement labelGetRateAllTag() {
		return  (ratealltag);
	}

	@FindBy(xpath = "//input[@aria-label='Rate']")
	private WebElement ratetalltag;

	public WebElement txtGetRateAllTag() {
		return  (ratetalltag);
	}

	@FindBy(xpath = "//div[text()='Batch No']")
	private WebElement batchno;

	public WebElement labelGetBatchNo() {
		return  (batchno);
	}

	@FindBy(name = "FilterField_MainGrid_InventBatchId_InventBatchId_Input_0")
	private WebElement enterbatchno;

	public WebElement txtGetBatchNo() {
		return  (enterbatchno);
	}

	@FindBy(xpath = "//span[@id='__MainGrid_InventBatchId_ApplyFilters_label']")
	private WebElement apply;

	public WebElement btnApply() {
		return  (apply);
	}

	@FindBy(xpath = "//div[text()='Gross Weight']")
	private WebElement getGrosswt;

	public WebElement labelGetGrossWt() {
		return  (getGrosswt);
	}

	@FindBy(xpath = "//div[text()='Sub smith']")
	private WebElement getSubsmith;

	public WebElement labelGetSubsmith() {
		return  (getSubsmith);
	}

	@FindBy(xpath = "//input[contains(@id,'MainGrid_Subsmith') and contains(@id,'input')]")
	private WebElement getSubsmithv;

	public WebElement txtGetSubsmith() {
		return  (getSubsmithv);
	}

	@FindBy(xpath = "//label[text()='Scan Tag']")
	private WebElement Tagn;

	public WebElement labelGetTag() {
		return  (Tagn);
	}

	@FindBy(xpath = "//label[text()='Sub Smith Name']")
	private WebElement subsmithn;

	public WebElement labelGetSubsmithName() {
		return  (subsmithn);
	}
	@FindBy(xpath = "//div[text()='Sub smith']")
	private WebElement subsmithnreprintingline;

	public WebElement labelGetSubsmithReprintLine() {
		return  (subsmithnreprintingline);
	}
	
	@FindBy(xpath = "//input[contains(@id,'TA_ReprintingLines_Subsmith_') and contains(@id,'input')]")
	private WebElement subsmithnreprintinglinetxt;

	public WebElement txtSubsmithReprintLine() {
		return  (subsmithnreprintinglinetxt);
	}

	@FindBy(xpath = "//label[text()='Attribute Change']")
	private WebElement attributechangen;

	public WebElement labelGetAttributeChange() {
		return  (attributechangen);
	}

	@FindBy(xpath = "//input[@name='TA_ReprintingHeader_AttributeChangeTypes']")
	private WebElement attributechangef;

	public WebElement txtGetAttributeChange() {
		return  (attributechangef);
	}

	@FindBy(xpath = "//label[text()='Value']")
	private WebElement value;

	public WebElement labelGetValue() {
		return  (value);
	}

	@FindBy(xpath = "//input[@name='TA_ReprintingHeader_OrnamentSize1']")
	private WebElement valuet;

	public WebElement txtGetValue() {
		return  (valuet);
	}
	//div[@class='lookupButton' and @data-dyn-helptext='(Alt+Down)']
	//div[@class='lookupButton' and @data-dyn-qtip-title='Open']
	@FindBy(xpath = "(//div[contains(@class, 'lookupButton')])[4]")
	private WebElement reprintingicon;

	public WebElement iconReprintigOfLabel() {
		return  (reprintingicon);
	}
	////ul[contains(@class, 'comboBox-list')]/li[text()='Only Reprinting of Label']--Specific value from dropdown
	@FindBy(xpath = "(//ul[contains(@class, 'comboBox-list') and contains(@class, 'sysPopup')])[2]")
	private WebElement valuesreprintingdropdown;

	public WebElement txtPurposeofReprintingDropdown() {
		return  (valuesreprintingdropdown);
	}
	@FindBy(xpath = "(//div[@class='lookupButton' and @title='Open'])[5]")
	private WebElement attributeicon;

	public WebElement iconAttributeChange() {
		return  (attributeicon);
	}
	
	

}
