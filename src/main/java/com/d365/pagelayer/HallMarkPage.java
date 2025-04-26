package com.d365.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class HallMarkPage extends MasterClass {
	public HallMarkPage() {
		PageFactory.initElements(driver, this);
	}

	// ---Hallmark Check
	@FindBy(xpath = "//a[contains(text(),\"HM Check\")]")
	private WebElement labelHmCheck;

	public WebElement labelHmCheck() {
	    return labelHmCheck;
	}

	// ---Item ID
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_Item\")]")
	private WebElement txtItemId;

	public WebElement txtItemId() {
	    return txtItemId;
	}

	// ---Configuration
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_Stan\")]")
	private WebElement txtConfiguration;

	public WebElement txtConfiguration() {
	    return txtConfiguration;
	}

	// ---Purity
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_Car\")]")
	private WebElement txtPurity;

	public WebElement txtPurity() {
	    return txtPurity;
	}

	// ---Stone Name
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_StoneName\")]")
	private WebElement txtStoneName;

	public WebElement txtStoneName() {
	    return txtStoneName;
	}

	// ---Received Pcs
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_Pcs\")]")
	private WebElement txtRcvPcs;

	public WebElement txtRcvPcs() {
	    return txtRcvPcs;
	}

	// ---Received Gross Weight
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_GrWeig\")]")
	private WebElement txtRcvGrossWt;

	public WebElement txtRcvGrossWt() {
	    return txtRcvGrossWt;
	}

	// ---Received Stone Weight
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_RCVStoneW\")]")
	private WebElement txtRcvStoneWt;

	public WebElement txtRcvStoneWt() {
	    return txtRcvStoneWt;
	}

	// ---Received Net Weight
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_NetW\")]")
	private WebElement txtRcvNetWt;

	public WebElement txtRcvNetWt() {
	    return txtRcvNetWt;
	}

	// ---HM Rejection
	@FindBy(xpath = "//span[text()=\"HM Rejection\"]")
	private WebElement labelHmRejection;

	public WebElement labelHmRejection() {
	    return labelHmRejection;
	}

	// ---HM Rejection New Button
	@FindBy(xpath = "//span[text()=\"New\"]")
	private WebElement btnHmRejectionNew;

	public WebElement btnHmRejectionNew() {
	    return btnHmRejectionNew;
	}

	// ---HM Rejection Pcs
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckRejectionDetailsTable_HMRejPcs\")]")
	private WebElement txtHmRejectionPcs;

	public WebElement txtHmRejectionPcs() {
	    return txtHmRejectionPcs;
	}

	// ---HM Rejection Gross Weight
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckRejectionDetailsTable_HMRejWeigh\")]")
	private WebElement txtHmRejectionGrossWt;

	public WebElement txtHmRejectionGrossWt() {
	    return txtHmRejectionGrossWt;
	}

	// ---HM Remark
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckRejectionDetailsTable_HMRejectionRem\")]")
	private WebElement txtHmRemark;

	public WebElement txtHmRemark() {
	    return txtHmRemark;
	}

	// ---Issue of HM Check
	@FindBy(xpath = "(//span[contains(@class,\"button-label button-label-dropDown\")])[4]")
	private WebElement btnIssueOfHmCheck;

	public WebElement btnIssueOfHmCheck() {
	    return btnIssueOfHmCheck;
	}

	// ---Issue to LM
	@FindBy(xpath = "//span[text()=\"Issue To LM\"]")
	private WebElement btnIssueToLm;

	public WebElement btnIssueToLm() {
	    return btnIssueToLm;
	}

	// ---HM User
	@FindBy(xpath = "//input[contains(@name,\"Fl\")]")
	private WebElement txtHmUser;

	public WebElement txtHmUser() {
	    return txtHmUser;
	}

	// ---HM Person OK
	@FindBy(xpath = "//span[text()=\"OK\"]")
	private WebElement btnHmPersonOk;

	public WebElement btnHmPersonOk() {
	    return btnHmPersonOk;
	}

	// ---HM Success Message
	@FindBy(xpath = "//span[text()=\"Send To PO Successfully\"]")
	private WebElement labelHmSuccessMessage;

	public WebElement labelHmSuccessMessage() {
	    return labelHmSuccessMessage;
	}

	// ---Issue To PO from HM
	@FindBy(xpath = "//span[text()=\"Issue To PO\"]")
	private WebElement btnIssueToPoFromHm;

	public WebElement btnIssueToPoFromHm() {
	    return btnIssueToPoFromHm;
	}

	// ---Reference No of HM Check
	@FindBy(xpath = "//input[contains(@name,\"FilterField_TA_HMCheckHeaderTable_ReferenceNo_Refere\")]")
	private WebElement txtReferenceNoOfHmCheck;

	public WebElement txtReferenceNoOfHmCheck() {
	    return txtReferenceNoOfHmCheck;
	}

	// ---Delete HM Rejection
	@FindBy(xpath = "//span[text()=\"Delete\"]")
	private WebElement btnDeleteHmRejection;

	public WebElement btnDeleteHmRejection() {
	    return btnDeleteHmRejection;
	}

	// ---PR No
	@FindBy(xpath = "//div[text()=\"Reference No\"]")
	private WebElement labelPrNo;

	public WebElement labelPrNo() {
	    return labelPrNo;
	}

	
	// ---HM Pass Pcs
	@FindBy(xpath = "//div[text()=\"HM Pass Pcs\"]")
	private WebElement labelHmPassPcs;

	public WebElement labelHmPassPcs() {
	    return labelHmPassPcs;
	}

	// ---HM Pass Gross Weight
	@FindBy(xpath = "//div[text()=\"HM Pass Gross Weight\"]")
	private WebElement labelHmPassGrossWt;

	public WebElement labelHmPassGrossWt() {
	    return labelHmPassGrossWt;
	}
	// ---- Reference Number Label
	@FindBy(xpath = "//div[text()=\"Reference No\"]")
	private WebElement labelReferenceNo;

	public WebElement getLabelReferenceNo() {
	    return labelReferenceNo;
	}

	// --- Receive Date Label
	@FindBy(xpath = "//div[text()=\"Receive Date\"]")
	private WebElement labelReceiveDate;

	public WebElement getLabelReceiveDate() {
	    return labelReceiveDate;
	}

	// --- HM Pass Pieces Label
	@FindBy(xpath = "//div[text()=\"HM Pass Pcs\"]")
	private WebElement labelHMPassPcs;

	public WebElement getLabelHMPassPcs() {
	    return labelHMPassPcs;
	}

	// --- HM Pass Gross Weight Label
	@FindBy(xpath = "//div[text()=\"HM Pass Gross Weight\"]")
	private WebElement labelHMPassGrossWeight;

	public WebElement getLabelHMPassGrossWeight() {
	    return labelHMPassGrossWeight;
	}

	// --- HM Pass Pieces Text Field
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_Pc\")]")
	private WebElement txtHMPassPcs;

	public WebElement getTxtHMPassPcs() {
	    return txtHMPassPcs;
	}

	// --- HM Pass Gross Weight Text Field
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_GrWeigh\")]")
	private WebElement txtHMPassGrossWeight;

	public WebElement getTxtHMPassGrossWeight() {
	    return txtHMPassGrossWeight;
	}

	// --- HM Pass Net Weight Text Field
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_NetWeight\")]")
	private WebElement txtHMPassNetWeight;

	public WebElement getTxtHMPassNetWeight() {
	    return txtHMPassNetWeight;
	}


	// --- Item Configuration Text Field
	@FindBy(xpath = "//input[contains(@id,\"TA_HMCheckDetailsTable_StandardConfigId\")]")
	private WebElement txtItemConfiguration;

	public WebElement getTxtItemConfiguration() {
	    return txtItemConfiguration;
	}

        
		
	
	

	public WebElement getElementByAttribute(String attributeName) {
		// Example: Locate element by name or any other attribute like id, class, etc.
		// You can adapt this based on your specific needs (e.g., using XPath, CSS
		// selectors, etc.)

		// If the attribute is "name", the XPath might look like:
		return driver.findElement(By.xpath("//input[@xpath='" + attributeName + "']"));
	}

}
