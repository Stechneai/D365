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
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;

public class ProvisionalParcel extends MasterClass {
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
	public String poratetype;
	
	
	//---Validate fields Purity,Rcv Pcs,Minimum Wt , maximum Wt , Rcv Net wt
	
	public void addDataProvisionalParcel() throws IOException, InterruptedException
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
		poratetype = masterDto.getAttributeValue("PoRateType");
		
		
		
		
		
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule()); 
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);
		String expectedvendorCode = provisionalParcelPage.dropDownVendorCode().getAttribute("value");
		reportHelper.performAssert(test, "Karigar/Vendor Code *", vendorCode, expectedvendorCode);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
		
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
		String expectedWarehouse = provisionalParcelPage.dropDownWareHouse().getAttribute("value");
		reportHelper.performAssert(test, "Warehouse *", wareHouse, expectedWarehouse);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), "poratetype");
		
		
		genericHelper.scrollingTillWebElement(provisionalParcelPage.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNewParcelReceive());
		
		
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropdownItemID(), itemId);
		 String actualItemID = provisionalParcelPage.dropdownItemID().getAttribute("value");
		 reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
	
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownConfiguration(), configuration);
		 String actualConfiguration = provisionalParcelPage.dropDownConfiguration().getAttribute("value");
		 reportHelper.performAssert(test, "Configuration *", actualConfiguration, configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMaximumWT(), maximumWT);
		genericHelper.scrollingTillWebElement(provisionalParcelPage.txtrcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtrcvGrossWt(), rcvGrossWt);

	
		 reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
		 reportHelper.performAssert(test, "Warehouse *", wareHouse, expectedWarehouse);
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirm());
		reportHelper.performAssert(test, "Karigar/Vendor Code *", vendorCode, expectedvendorCode);
		Assert.assertTrue(provisionalParcelPage.btnConfirmOK().isDisplayed());
	
	
			genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirmOK());
		
	//	Thread.sleep(4000);
		//genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.homeButton());
	//	genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.issueButton());
    //	genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.IssuetoQCfromPR());
//		
		
	  String expectedRcvGrossWT = provisionalParcelPage.txtrcvGrossWt().getAttribute("value");
		String expectedStoneWt = provisionalParcelPage.txtRcvStoneWT().getAttribute("value");
	
	//reportHelper.performAssert(test, "RCV Stone Weight", expectedStoneWt, rcvStoneWt);
	//reportHelper.performAssert(test, "Rcv Gross Weight *", expectedRcvGrossWT, rcvGrossWt);

	System.out.println("expected RCV WT is ==== " + expectedStoneWt);
	
	test = reportHelper.createTestCase(test, extentReports, masterDto);  
	
	reportHelper.performAssert(test, "Item Id *", itemId, actualItemID);
	

	
	
	}
	
	
	public void validateChallanNoField() throws IOException, InterruptedException
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
		ExpectedErrorMessage=masterDto.getAttributeValue("Expected Error Message");
		
		
		
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
		Thread.sleep(5000);
		 errrMsg = provisionalParcelPage.InvalidChallanNoErrorMessage();
		 
		 System.out.println("Printed Error Message is ==== " + errrMsg);
		 Assert.assertTrue(errrMsg.isDisplayed());
	}
	
	public void addProvisionalParcelforDC() throws InterruptedException
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
		
		
		
		
		//genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newButton());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
		genericHelper.scrollingTillWebElement(provisionalParcelPage.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropdownItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMinimumWT(), minimumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtMaximumWT(), maximumWT);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtrcvGrossWt(), rcvGrossWt);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtRcvStoneWT(), rcvStoneWt);
		genericHelper.scrollingTillWebElement(provisionalParcelPage.StoneName());
		genericHelper.sendKeysWithjavascriptExecutor(provisionalParcelPage.StoneName(), StoneName);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtStoneVariant(), StoneConfiguration + Keys.ENTER);
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirm());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnConfirmOK());
		
	}
	
    }
	
	
	   
	
	
	


