package com.d365.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class OfflineTaggingPage extends MasterClass{
	public OfflineTaggingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@data-dyn-title='Modules']")
	private WebElement module;

	public WebElement modules() {
		return module;
	}

	@FindBy(xpath = "//a[text()='Jewellery']") // add
	private WebElement jewellery;

	public WebElement jewellery() {
		return jewellery;
	}

	@FindBy(xpath = "//a[text()='Offline tagging']") // add
	private WebElement offlineTagging;

	public WebElement offlineTagging() {
		return offlineTagging;
	}

	@FindBy(xpath = "//span[text()='Select']") // select button
	private WebElement selectButton;

	public WebElement selectButton() {
		return selectButton;
	}

	@FindBy(xpath = "(//span[text()='New'])[1]")
	private WebElement newBtn;

	public WebElement clickNewBtn() {
		return newBtn;
	} 
	@FindBy(xpath = "//button[contains(@id,'AcxGenerateTag') and contains(@id,'LineViewJobHeader_caption')]") // Manual
																												// tagging
	private WebElement manualTagging;

	public WebElement manualTagging() {
		return manualTagging;
	}

	@FindBy(xpath = "//input[contains(@id, 'AcxPreTagHeader_TagNo') and contains(@id, '_0_0_')]")

	private WebElement gettagno;

	public WebElement getTagNo() {
		return gettagno;
	}

	@FindBy(xpath = "//span[text()='New']") // new button
	private WebElement newButton;

	public WebElement newButton() {
		return newButton;
	}

	@FindBy(xpath = "//input[@name='ID_BulkTagNo']") // Tag id
	private WebElement tagID;

	public WebElement tagID() {
		return tagID;
	}

	@FindBy(xpath = "//input[@name='Status_AdjustGrossWeight']") // Gross wt
	private WebElement grosswt;

	public WebElement grosswt() {
		return grosswt;
	}

	@FindBy(name = "ID_DocNo") // select button
	private WebElement ID_DocNo;

	public WebElement selectID_DocNo() {
		return ID_DocNo;
	}

	@FindBy(xpath = "//input[@name='AcxBulkTag_ToLocation']") // add
	private WebElement location;

	public WebElement location() {
		return location;
	}

	@FindBy(xpath = "//span[text()='Generate tag']") // generate tag
	private WebElement generateTag;

	public WebElement generateTag() {
		return generateTag;
	}

	@FindBy(xpath = "//input[@name='Fld5_1']") // tagToBeGenerate
	private WebElement tagToBeGenerate;

	public WebElement tagToBeGenerate() {
		return tagToBeGenerate;
	}

	@FindBy(xpath = "//span[text()='OK']") // add
	private WebElement okButton;

	public WebElement okButton() {
		return okButton;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[1]") // add
	private WebElement grWt1;

	public WebElement grWt1() {
		return grWt1;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[2]") // add
	private WebElement grWt2;

	public WebElement grWt2() {
		return grWt2;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[3]") // add
	private WebElement grWt3;

	public WebElement grWt3() {
		return grWt3;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[4]") // add
	private WebElement grWt4;

	public WebElement grWt4() {
		return grWt4;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[5]") // add
	private WebElement grWt5;

	public WebElement grWt5() {
		return grWt5;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[6]") // add
	private WebElement grWt6;

	public WebElement grWt6() {
		return grWt6;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[7]") // add
	private WebElement grWt7;

	public WebElement grWt7() {
		return grWt7;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[8]") // add
	private WebElement grWt8;

	public WebElement grWt8() {
		return grWt8;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[9]") // add
	private WebElement grWt9;

	public WebElement grWt9() {
		return grWt9;
	}

	@FindBy(xpath = "(//input[contains(@id,'AcxPreTagHeader_GrossWeight') and contains(@id, 'input')])[10]") // add
	private WebElement grWt10;

	public WebElement grWt10() {
		return grWt10;
	}

	@FindBy(xpath = "//span[text()='Adjustment Entry']") // add
	private WebElement adjustmentENtryButton;

	public WebElement adjustmentENtryButton() {
		return adjustmentENtryButton;
	}

	@FindBy(xpath = "//span[text()='Validate']") // add
	private WebElement validateButton;

	public WebElement validateButton() {
		return validateButton;
	}

	@FindBy(xpath = "//span[text()='Post']") // add
	private WebElement postButton;

	public WebElement postButton() {
		return postButton;
	}

	@FindBy(xpath = "//span[@id='AcxGenerateTag_3_Status_TagGenerated_toggle']") // add
	private WebElement tagGeneratedToggle;

	public WebElement tagGeneratedToggle() {
		return tagGeneratedToggle;
	}

	@FindBy(name = "Fld6_1") // add
	private WebElement noofpcs;

	public WebElement enterNoOfPcs() {
		return noofpcs;
	}
	
	
	@FindBy(xpath = "//span[contains(@id,'Dialog_') and contains(@id,'Fld13_1_toggle')]") // add
	private WebElement wtDivide;

	public WebElement wtDivideButton() {
		return wtDivide;
	}


	@FindBy(xpath = "//span[contains(@id,'AcxGenerateTag_') and contains(@id,'Status_Adjustment_toggle')]") // add
	private WebElement adjustmentToggle;

	public WebElement adjustmentToggle() {
		return adjustmentToggle;
	}

	@FindBy(xpath = "//span[text()=\"Tag generated succesfully!\"]") // add
	private WebElement sucessmsgGenerateTag;

	public WebElement sucessmsgGenerateTag() {
		return sucessmsgGenerateTag;
	}

	@FindBy(xpath = "//span[text()=\"Tag validated successfully!\"]") // add
	private WebElement sucessmsgValidateButton;

	public WebElement sucessmsgValidateButton() {
		return sucessmsgValidateButton;
	}

	@FindBy(xpath = "//span[text()='Adjustment qty posted successfully!']") // add
	private WebElement sucessmsgadjustmentButton;

	public WebElement sucessmsgadjustmentButton() {
		return sucessmsgadjustmentButton;
	}
	@FindBy(name = "TA_BatchDocHeader_DocNo") // add
	private WebElement docno;

	public WebElement getDocNo() {
		return docno;
	}
	@FindBy(name = "ID_DocNo") // add
	private WebElement docn;

	public WebElement enterDocNo() {
		return docn;
	}
	@FindBy(xpath = "(//span[text()='New'])[1]")
	private WebElement newButton1;

	public WebElement newButton1() {
		return newButton1;
	}
	@FindBy(xpath = "//span[contains(@id,'Dialog_') and contains(@id,'toggle')]") 
	private WebElement toggle;

	public WebElement clickToggle() {
		return toggle;
	}
	@FindBy(name = "Fld11_1") 
	private WebElement mrprate;

	public WebElement enterMrpRate() {
		return mrprate;
	}
	@FindBy(xpath = "//div[contains(@id, 'AcxGenerateTag') and contains(@id, 'LineViewJobHeaderHeader')]") 
	private WebElement closearrow;

	public WebElement clickarrow() {
		return closearrow;
	}
	@FindBy(name = "Item_NoOfPCS") 
	private WebElement getpcscount;

	public WebElement getPcsCount() {
		return closearrow;
	}
	@FindBy(name = "Item_RemainingPcs") 
	private WebElement getrepcscount;

	public WebElement getRePcsCount() {
		return getrepcscount;
	}
	/*
	 * @FindBy (xpath = "//span[text()=\"Tag validated successfully!\"]")//add
	 * private WebElement sucessmsgValidateButton;
	 * 
	 * public WebElement sucessmsgValidateButton() { return sucessmsgValidateButton;
	 * }
	 */

}



