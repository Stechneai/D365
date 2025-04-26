package com.d365.core;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.d365.utils.MasterClass;

public class PoCheck extends MasterClass
{
	public String hmRejectionPcs;
	public String hmRejectionGrossWt;
	public String HmRemark;
	public String HmUser;
	public String successMessage;

	public String ReceiveFrom;
	public String vendorCode;
	public String challanNo;
	public String wareHouse;
	public String itemId;
	public String configuration;
	public String purity;
	public String rcvPcs;
	public String minimumWT;
	public String maximumWT;
	public String rcvGrossWt;
	public String expectedOutput;
	public String rcvStoneWt;
	public String StoneName;
	public String StoneConfiguration;
	public String ExpectedErrorMessage;
	public WebElement errrMsg;
	 public String QcUSerperson;
	 public String expectedSuccessMessage; 
	 public String qcRejectionPcs;
	 public String qcRejectionGrossWt;
	 public String qcRejectionNetWt;
	 public String qcRejectionRemark;
	 public String QCperson;
	 public String LmRejectionPcs ;
	 public String LmRejectionGrossWT;
	 public String Remarks;
	 public String LmRemark;
	 public String LmUser;
	 public String PoCheckUser1;
	 public String poCompleteSeccesMsg;
	 public String poPassPcs;
	 public String  poPassGrossWt;
	 public String  poPassNetsWt;
	 
	public void addPocheckData() throws IOException, InterruptedException
	{
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
 		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight"); 
 		HmRemark = masterDto.getAttributeValue("HM Remark"); 
 		HmUser =  masterDto.getAttributeValue("HM User:"); 
 		successMessage = masterDto.getAttributeValue("Success Message"); 
 		
 		ReceiveFrom = masterDto.getAttributeValue("Receive From *");
 		vendorCode = masterDto.getAttributeValue("Karigar/Vendor Code *");
 		challanNo = masterDto.getAttributeValue("Challan No *");
 		wareHouse = masterDto.getAttributeValue("Warehouse *");
 		itemId = masterDto.getAttributeValue("Item Id *");
 		configuration = masterDto.getAttributeValue("Configuration *");
 		purity = masterDto.getAttributeValue("Purity Carat");
 		rcvPcs = masterDto.getAttributeValue("Rcv Pcs *");
 		minimumWT = masterDto.getAttributeValue("Minimum Weight");
 		maximumWT = masterDto.getAttributeValue("Maximum Weight");
 		rcvGrossWt = masterDto.getAttributeValue("Rcv Gross Weight *");
 		rcvStoneWt=masterDto.getAttributeValue("RCV Stone Weight");
 		StoneName = masterDto.getAttributeValue("Stone Name"); 
 		StoneConfiguration=masterDto.getAttributeValue("Stone Configuration");
 		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
 		qcRejectionGrossWt =  masterDto.getAttributeValue("QC Rejection Gross Weight");
 		qcRejectionNetWt =  masterDto.getAttributeValue("QC Rejection Net Weight");
 		qcRejectionRemark =  masterDto.getAttributeValue("QC Remark");
 		QCperson = masterDto.getAttributeValue("QC User :");
 		LmRejectionPcs =  masterDto.getAttributeValue("LM  Rejection Pcs");
 		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
 		Remarks =  masterDto.getAttributeValue("LM Remark");
 		LmRemark = masterDto.getAttributeValue("Remarks");
 		LmUser = masterDto.getAttributeValue("LM User:");
 		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
 		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
 		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
 		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
 		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");
 		
 		
 		
 		
 		test = reportHelper.createTestCase(test, extentReports, masterDto);
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
 		reportHelper.generateLogFullScreenSS(test, "Click on Module");
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
 		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);
 		reportHelper.generateLogFullScreenSS(test, "Enter Receive From");
 		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);
 		reportHelper.generateLogFullScreenSS(test, "Enter vendor Code");
 		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
 		reportHelper.generateLogFullScreenSS(test, "Enter Challan No");
 		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
 		reportHelper.generateLogFullScreenSS(test, "Enter WareHouse");
 		genericHelper.scrollingTillWebElement(provisionalParcelPage.btnNewParcelReceive());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNewParcelReceive());
 		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropdownItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownPurity(), purity);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtRcvPcs(), rcvPcs);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalParcelPage.txtrcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtrcvGrossWt(), rcvGrossWt);

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirm());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirmOK());
 		String voucherNo=poCheckPage.txtVoucherNo().getAttribute("title");
 		System.out.println("Voucher No is ===" + voucherNo);
 		
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIssue());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIsuuetoPofromProvisionalParcel());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
 		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery()); 
 		
 		
 		
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
 		
 		
 		Thread.sleep(2000);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.lblReferenceNo());
 		Thread.sleep(2000);
 		poCheckPage.txtEnterReferenceNo().sendKeys(voucherNo);
 		Thread.sleep(3000);
 		poCheckPage.btnApplyReferenceNo().click();
 		Thread.sleep(3000);
 		
 		
 		String actualPRVoucherNo = poCheckPage.txtVoucherNoPoCheck().getAttribute("value");
 		Assert.assertEquals(actualPRVoucherNo, voucherNo);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());
 
 		String actualPassPcs = poCheckPage.txtPoPassPcs().getAttribute("value");
 		 String actualGrossWt=poCheckPage.txtPoPassGrossWt().getAttribute("value");
 		
 		 reportHelper.performAssert(test,"PO Pass Pcs", poPassPcs, actualPassPcs);
 		 reportHelper.performAssert(test,"Rcv Gross Weight *", actualGrossWt, rcvGrossWt);
 		
 		
// 		genericHelper.clickWithJavascriptExecutor(poCheckPage.DetailsofPO());
// 		genericHelper.clickWithJavascriptExecutor(poCheckPage.AutoPoAdjust());
// 		
 	
 
 	
 	
 		Thread.sleep(2000);
 	
// 		genericHelper.clickWithJavascriptExecutor(poCheckPage.ReferenceNo());
// 		Thread.sleep(4000);
// 		Actions actns = new Actions(driver);
// 		genericHelper.clearAndsendKeysAndEnter(poCheckPage.refernceclearfield(),voucherNo);
// 		//genericHelper.clickWithJavascriptExecutor(poCheckPage.selectLine());
// 		actns.sendKeys(Keys.TAB);
// 		Thread.sleep(3000);
// 		actns.sendKeys(Keys.ENTER);
// 
// 		
 //		poCheckPage.applybtnforsecondtime().click();	
 		String poPassNetWt = poCheckPage.txtPoPassNetWt().getAttribute("value");
 		reportHelper.performAssert(test, "PO Pass Net Weight", poPassNetsWt, poPassNetWt);
 		
 		String actualItemID = poCheckPage.txtItemofPoDetails().getAttribute("value");
 		reportHelper.performAssert(test, "Item Id *", actualItemID, itemId);
 		
 		String actualConfiguration = poCheckPage.txtConfigurationofPoDetails().getAttribute("value");
 		reportHelper.performAssert(test, "Configuration *", actualConfiguration, configuration);
 		
 		  String expectedPurity = poCheckPage.txtPurityOfPoDetails().getAttribute("value");
 		  reportHelper.performAssert(test, "Purity Carat", expectedPurity, purity);
 		
 		
 
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());
	
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		reportHelper.performAssert(test, "PO User :", PoCheckUser1, PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());
 		
 		Thread.sleep(4000);
 		
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk()); 
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
	    Thread.sleep(3000);
		
		Thread.sleep(3000);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());


 		
 			
	}
}
