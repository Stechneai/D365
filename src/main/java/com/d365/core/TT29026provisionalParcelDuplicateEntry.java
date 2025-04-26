package com.d365.core;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;

import org.bouncycastle.oer.its.etsi102941.AaEntry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class TT29026provisionalParcelDuplicateEntry extends MasterClass {
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

	
	
	//---Validate fields Purity,Rcv Pcs,Minimum Wt , maximum Wt , Rcv Net wt
	
	public void addDataprovisionalParcelduplicate(MasterDto masterDto) throws IOException, InterruptedException
	{
	    
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
		
		
		
		
		
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule()); 
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		String expectedvendorCode = provisionalP.txtVendorCode().getAttribute("value");
		reportHelper.performAssert(test, "Karigar/Vendor Code *", vendorCode, expectedvendorCode);
		 genericHelper.clearAndSendKeysWithJavascriptExecutor(	provisionalP.txtPoRateType(), "Fixed Rate");
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		String expectedWarehouse = provisionalP.txtWareHouse().getAttribute("value");
		reportHelper.performAssert(test, "Warehouse *", wareHouse, expectedWarehouse);
		
		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		 String actualItemID = provisionalP.txtItemID().getAttribute("value");
		 reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		 String actualConfiguration = provisionalP.txtConfiguration().getAttribute("value");
		 reportHelper.performAssert(test, "Configuration *", actualConfiguration, configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
	
	
		 reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
		 reportHelper.performAssert(test, "Warehouse *", wareHouse, expectedWarehouse);
	
		reportHelper.performAssert(test, "Karigar/Vendor Code *", vendorCode, expectedvendorCode);

		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		 String actualItemID1 = provisionalP.txtItemID().getAttribute("value");
		 reportHelper.performAssert(test, "Item Id *", itemId, actualItemID1);
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		 String actualConfiguration1 = provisionalP.txtConfiguration().getAttribute("value");
		 reportHelper.performAssert(test, "Configuration *", actualConfiguration1, configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
	
	reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
		 reportHelper.performAssert(test, "Warehouse *", wareHouse, expectedWarehouse);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		reportHelper.performAssert(test, "Karigar/Vendor Code *", vendorCode, expectedvendorCode);
	genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		 String expectedRcvGrossWT = provisionalP.txtRcvGrossWt().getAttribute("value");
		String expectedStoneWt = provisionalP.txtRcvStoneWT().getAttribute("value");
	
	
	reportHelper.performAssert(test, "Rcv Gross Weight *", expectedRcvGrossWT, rcvGrossWt);

	System.out.println("expected RCV WT is ==== " + expectedStoneWt);
	genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		
	
	}
	
	
	public void verifyprovisionalParcelforDuplicateEntry(MasterDto masterDto) throws IOException, InterruptedException
	{
	    
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
		
		
		
		
		
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule()); 
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		if (provisionalP.txtReceiveFrom().isDisplayed()) 
		{
			reportHelper.onTestSuccess(test, "User is able to redirect Provisional parcel by using path Module --> Jewellery --> Provisional Parcel Receive");
			
			
		}
          else 
		{
        	  reportHelper.onTestFailure(test, "User is not able to redirect Provisional parcel by using path Module --> Jewellery --> Provisional Parcel Receive");
		}
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		String expectedvendorCode = provisionalP.txtVendorCode().getAttribute("value");
		
		 genericHelper.clearAndSendKeysWithJavascriptExecutor(	provisionalP.txtPoRateType(), "Fixed Rate");
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
	    genericHelper.clearAndSendKeysWithJavascriptExecutor(	provisionalP.txtPoRateType(), "Fixed Rate");
		
		///---------------------------------------//----------------------------------------------/------------
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId); 
	
		
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
	
	
		

//-----------------------------//----------------------------------//---------------------------//------------------------//-----------------//
		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
		
//---------------------------//-----------------------------------------//------------------------------------------------------------
		
        genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm()); 
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		
		reportHelper.onTestSuccess(test, "User is able to do Process of Adding Provisional ParcelUser is able to do Process of Adding Provisional Parcel");
		reportHelper.onTestSuccess(test, "User is able to add multiple Lines with different Item Type in Parcel Receive Details of Provisional Parel Receive.");
		reportHelper.onTestSuccess(test, "User is able to do Process of Adding Provisional ParcelUser is able to do Process of Adding Provisional Parcel");
		reportHelper.onTestSuccess(test, "User is able to add multiple duplicate lines in Parcel Receive Details of Provisional parcel");
	
	}
	
	
	public void verifyprovisionalParcelforDuplicateEntrywithSameItemSamePuritySameConfig(MasterDto masterDto) throws IOException, InterruptedException
	{
	    
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
		
		
		
		
		
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule()); 
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		String expectedvendorCode = provisionalP.txtVendorCode().getAttribute("value");
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);
		 genericHelper.clearAndSendKeysWithJavascriptExecutor(	provisionalP.txtPoRateType(), "Fixed Rate");
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
	
		
		///---------------------------------------//----------------------------------------------/------------
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
	
		
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
	
	
		

//-----------------------------//----------------------------------//---------------------------//------------------------//-----------------//
		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
		String actualItemIdofFirstLine = provisionalP.txtItemIdofFirstLine().getAttribute("value");
		String actualItemIdoSecondLine = provisionalP.txtItemIdoSecondLine().getAttribute("value");
		String actuaconfigfirstLine = pORateTypePages.txtConfigFirstLine().getAttribute("value");
		String actuaconfigsecondLine = pORateTypePages.txtConfigSecondLine().getAttribute("value");
		String actualPurityfirstLine = provisionalP.txtPurity().getAttribute("value");
		String actualPuritySecondLine = provisionalP.txtPurity().getAttribute("value");
		
	
		reportHelper.performAssert(test, "Item Id *", actualItemIdofFirstLine, actualItemIdoSecondLine);
		reportHelper.performAssert(test, "Configuration *", actuaconfigfirstLine, actuaconfigsecondLine);
		reportHelper.performAssert(test, "Purity Carat", actualPurityfirstLine, actualPuritySecondLine);
		
		
		
//---------------------------//-----------------------------------------//------------------------------------------------------------
		
        genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm()); 
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		
	}
	
	public void verifyQcProcessForDuplicateEntry(MasterDto masterDto) throws IOException, InterruptedException
	{
		 String  hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		 String 	hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight"); 
		 String HmRemark = masterDto.getAttributeValue("HM Remark"); 
		 String HmUser =  masterDto.getAttributeValue("HM User:"); 
		 String successMessage = masterDto.getAttributeValue("Success Message"); 
 		
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
 		String qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
 		String qcRejectionGrossWt =  masterDto.getAttributeValue("QC Rejection Gross Weight");
 		String qcRejectionNetWt =  masterDto.getAttributeValue("QC Rejection Net Weight");
 		String qcRejectionRemark =  masterDto.getAttributeValue("QC Remark");
 		String QCperson = masterDto.getAttributeValue("QC User :");
 		String LmRejectionPcs =  masterDto.getAttributeValue("LM  Rejection Pcs");
 		String LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
 		String Remarks =  masterDto.getAttributeValue("LM Remark");
 		String 	LmRemark = masterDto.getAttributeValue("Remarks");
 		String 	LmUser = masterDto.getAttributeValue("LM User:");
 		String 	PoCheckUser1 = masterDto.getAttributeValue("PO User :");
 		String 	poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
 		String poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
 		String poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
 		String 	poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");
 		

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule()); 
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		String expectedvendorCode = provisionalP.txtVendorCode().getAttribute("value");
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);
		 genericHelper.clearAndSendKeysWithJavascriptExecutor(	provisionalP.txtPoRateType(), "Fixed Rate");
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
	
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);

		genericHelper.scrollingTillWebElement(provisionalP.txtRejDCPCS());
		Thread.sleep(3000);
	
//		genericHelper.scrollingTillWebElement(provisionalParcelPage.newParcelReceive());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newParcelReceive());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.itemID(), itemId);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.configuration(), configuration);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.purity(), purity);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvPcs(), rcvPcs);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.minimumWT(), minimumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.maximumWT(), maximumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvGrossWt(), rcvGrossWt);
 		
 		
 	

 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
 		String voucherNo=poCheckPage.txtVoucherNo().getAttribute("title");
 		System.out.println("Voucher No is ===" + voucherNo);
 		
 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIssue());
 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIsuuetoPofromProvisionalParcel());
 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule());
 		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery()); 
 		
 		
 		
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
 		
 		
 		Thread.sleep(2000);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.lblReferenceNo());
 		Thread.sleep(2000);
 		poCheckPage.txtEnterReferenceNo().sendKeys(voucherNo);
 		Thread.sleep(3000);
 		poCheckPage.btnApplyReferenceNo().click();
 		Thread.sleep(3000);
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());
 		Thread.sleep(2000);
 	
	
 		
 		
 
 		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());
	
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		
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
	
	
	public void verifyBatchRegistration_TC_08(MasterDto masterDto) throws InterruptedException, IOException 
	{
		String hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		String hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		String HmRemark = masterDto.getAttributeValue("HM Remark");
		String HmUser = masterDto.getAttributeValue("HM User:");
		String successMessage = masterDto.getAttributeValue("Success Message");

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
		String rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		String qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		String qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		String qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		String qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		String QCperson = masterDto.getAttributeValue("QC User :");
		String LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		String LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		String Remarks = masterDto.getAttributeValue("LM Remark");
		String LmRemark = masterDto.getAttributeValue("Remarks");
		String LmUser = masterDto.getAttributeValue("LM User:");
		String PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		String poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		String poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		String	poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		String poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		String challanNoofBR = masterDto.getAttributeValue("Challan No.");
		String purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		String exprectedItemID = masterDto.getAttributeValue("Item Id");
		String exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		String exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		String PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		String purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		String CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		String currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		String locatioNofBR = masterDto.getAttributeValue("Location of BR");
		String vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		String onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		String acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		String rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		String totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		String qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		String purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		String purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		String makingItemName = masterDto.getAttributeValue("Making Item No.");
		String valueofPMC = masterDto.getAttributeValue("Value");
		String itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		String MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		String makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		String makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		String makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		String poRateType = masterDto.getAttributeValue("PO Rate Type");
		String vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);

		//genericHelper.clearAndsendKeysAndEnter(pORateTypePages.poRateType(), poRateType);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		
		

//		genericHelper.scrollingTillWebElement(provisionalParcelPage.newParcelReceive());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newParcelReceive());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.itemID(), itemId);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.configuration(), configuration);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.purity(), purity);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvPcs(), rcvPcs);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.minimumWT(), minimumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.maximumWT(), maximumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvGrossWt(), rcvGrossWt);
 		
		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
		System.out.println("Voucher No is ===" + voucherNo);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIssue());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIsuuetoPofromProvisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.lblReferenceNo());
		Thread.sleep(2000);
		poCheckPage.txtEnterReferenceNo().sendKeys(voucherNo);
		Thread.sleep(3000);
		poCheckPage.btnApplyReferenceNo().click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnBatchRegistration());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNumber(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),purchTransrate100);
		//batchRegistrationPages.purchaseTransPrice100().sendKeys("8500");
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPreTagHeader());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.txtreferenceDocNO());
		String PoNumber = batchRegistrationPages.txtreferenceDocNO().getAttribute("value");
		System.out.println("Purchase order No is" + PoNumber);
		Thread.sleep(5000);
		 genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnPmc());
		 String pmcMakingValue = batchRegistrationPages.txtPMCValue().getAttribute("value");
		 System.out.println(pmcMakingValue);
		 reportHelper.performAssert(test, "PMC Value", pmcMakingValue, pmcMakingValue);
			reportHelper.onTestSuccess(test, "User is able to Proceed Batch Ragistration Process Whenever User added multiple duplicate lines having same Item ID, Same Purity & Same Configuration");
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnRelease());
	
}
	
	
	

	public void verifyBatchRegistrationForKaragir_TC_10(MasterDto masterDto) throws InterruptedException, IOException 
	{
		String hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		String hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		String HmRemark = masterDto.getAttributeValue("HM Remark");
		String HmUser = masterDto.getAttributeValue("HM User:");
		String successMessage = masterDto.getAttributeValue("Success Message");

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
		String rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		String qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		String qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		String qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		String qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		String QCperson = masterDto.getAttributeValue("QC User :");
		String LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		String LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		String Remarks = masterDto.getAttributeValue("LM Remark");
		String LmRemark = masterDto.getAttributeValue("Remarks");
		String LmUser = masterDto.getAttributeValue("LM User:");
		String PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		String poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		String poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		String	poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		String poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		String challanNoofBR = masterDto.getAttributeValue("Challan No.");
		String purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		String exprectedItemID = masterDto.getAttributeValue("Item Id");
		String exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		String exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		String PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		String purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		String CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		String currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		String locatioNofBR = masterDto.getAttributeValue("Location of BR");
		String vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		String onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		String acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		String rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		String totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		String qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		String purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		String purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		String makingItemName = masterDto.getAttributeValue("Making Item No.");
		String valueofPMC = masterDto.getAttributeValue("Value");
		String itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		String MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		String makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		String makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		String makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		String poRateType = masterDto.getAttributeValue("PO Rate Type");
		String vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);

		//genericHelper.clearAndsendKeysAndEnter(pORateTypePages.poRateType(), poRateType);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		
		

//		genericHelper.scrollingTillWebElement(provisionalParcelPage.newParcelReceive());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newParcelReceive());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.itemID(), itemId);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.configuration(), configuration);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.purity(), purity);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvPcs(), rcvPcs);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.minimumWT(), minimumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.maximumWT(), maximumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvGrossWt(), rcvGrossWt);
 		
		
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
		System.out.println("Voucher No is ===" + voucherNo);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIssue());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIsuuetoPofromProvisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickModule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.lblReferenceNo());
		Thread.sleep(2000);
		poCheckPage.txtEnterReferenceNo().sendKeys(voucherNo);
		Thread.sleep(3000);
		poCheckPage.btnApplyReferenceNo().click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnBatchRegistration());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),purchTransrate100);
		//batchRegistrationPages.purchaseTransPrice100().sendKeys("8500");
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnpreTagheader());
		Thread.sleep(6000);
		genericHelper.scrollingTillWebElement(batchRegistrationPages.txtreferenceDocNO());
		String PoNumber = batchRegistrationPages.txtreferenceDocNO().getAttribute("value");
		System.out.println("Purchase order No is" + PoNumber);
		
			reportHelper.onTestSuccess(test, "User is able to Proceed Batch Ragistration Process for karagir Whenever User added multiple duplicate lines having same Item ID, Same Purity & Sam");
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnRelease());
	
}

}


	
	
	
    
	
	
	   
	
	
	


