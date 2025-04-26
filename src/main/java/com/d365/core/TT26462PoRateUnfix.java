package com.d365.core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.d365.pagelayer.PORateTypePages;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class TT26462PoRateUnfix extends MasterClass {

	public String challanNo ;
	public String purchTransrate100;
	public String exprectedItemID;
	public String exprectednoOfPcs;
	public String exprectgrossWt;
	public String expectedpurchTransPrice;
	public String expectedQTY;
	public String expectedPurchTransvalue;
	public String hmRejectionPcs;
	public String hmRejectionGrossWt;
	public String HmRemark;
	public String HmUser;
	public String successMessage;

	public String ReceiveFrom;
	public String vendorCode;

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
	public String LmRejectionPcs;
	public String LmRejectionGrossWT;
	public String Remarks;
	public String LmRemark;
	public String LmUser;
	public String PoCheckUser1;
	public String poCompleteSeccesMsg;
	public String poPassPcs;
	public String poPassGrossWt;
	public String poPassNetsWt;
	public String challanNoofBR;
	public String PurchTransPrice100;
	public String purchTrans99;
	public String CurrentwereHouseofBR;
	public String currentSiteOfBR;
	public String locatioNofBR;
	public String vendorAccountofBR;
	public String onlyAcceptorReject;
	public String acceptAmountofBR;
	public String rejectAmountofBR;
	public String totalAMountofBR;
	public String rcvNetWt;
	public String qtyOfPretagLine;
	public String purchTransPriceofBR;
	public String purchTransValueofBR;
	public String makingItemName;
	public String valueofPMC;
	public String itemCategoryofPMC;
	public String MakingItemNoofPMC;
	public String makingTypeOfPMC;
	public String makingRateOfPMC;
	public String makingAmountofTagHeader;
	public String poRateType;
	public String vendorAccount;
	public String fixRateType;
	public String unfixRateType;
	public String jobcardRateType;

	public void processUnfixPoRateTYpe_TC_12(MasterDto masterDto) throws InterruptedException, IOException {
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickModule());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickJewellery());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.provisionalParcel());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newButton());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.receiveFrom(), ReceiveFrom);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.vendorCode(), vendorCode);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.challanNo(), challanNo);
//	
//		genericHelper.clearAndsendKeysAndEnter(pORateTypePages.poRateType(), poRateType);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.wareHouse(), wareHouse);
//		genericHelper.scrollingTillWebElement(provisionalParcelPage.newParcelReceive());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newParcelReceive());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.itemID(), itemId);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.configuration(), configuration);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.purity(), purity);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvPcs(), rcvPcs);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.minimumWT(), minimumWT);
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.maximumWT(), maximumWT);
//		genericHelper.scrollingTillWebElement(provisionalParcelPage.rcvGrossWt());
//		genericHelper.clearAndsendKeysAndEnter(provisionalParcelPage.rcvGrossWt(), rcvGrossWt);
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.confirmButton());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.confirmOKButton());
//		String voucherNo = poCheckPage.VoucherNo().getAttribute("title");
//		System.out.println("Voucher No is ===" + voucherNo);
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.issueButton());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.IsuuetoPofromprovisionalParcel());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickModule());
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickJewellery());
//		genericHelper.clickWithJavascriptExecutor(poCheckPage.PoCheck());
//		Thread.sleep(2000);
//		genericHelper.clickWithJavascriptExecutor(poCheckPage.ReferenceNo());
//		Thread.sleep(2000);
//		poCheckPage.enterReferenceNo().sendKeys(voucherNo);
//		Thread.sleep(3000);
//		poCheckPage.ApplyButtonofReferenceNo().click();
//		Thread.sleep(3000);
//		genericHelper.clickWithJavascriptExecutor(poCheckPage.UpdateButton());
//genericHelper.clickWithJavascriptExecutor(poCheckPage.pocompletes());
//genericHelper.clickWithJavascriptExecutor(poCheckPage.PoCompleteOk());
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(poCheckPage.PoCheckUser(), PoCheckUser1);
//			Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
//		Thread.sleep(3000);
//		genericHelper.clickWithJavascriptExecutor(poCheckPage.OkButton());
//		Thread.sleep(4000);
//	  genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.clickModule());
//  genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.clickJewellery());
//    genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.batchRegistration());
//    genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.newBtnofBatchRegistration());
//    genericHelper.clearAndSendKeysWithJavascriptExecutor(batchRegistrationPages.ChallanNo(), challanNo);
//    genericHelper.clearAndSendKeysWithJavascriptExecutor(batchRegistrationPages.purchaseTransPrice100(), purchTransrate100);
//    genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.generateLineButton());
//        genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.preTagheader());
//    Thread.sleep(6000);
//    genericHelper.scrollingTillWebElement(batchRegistrationPages.referenceDocNO());
//    String PoNumber = batchRegistrationPages.referenceDocNO().getAttribute("value");
//    System.out.println("Purchase order No is" + PoNumber);
//    Thread.sleep(5000);
//    genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.releaseBtn());
////  
////
////////                  ---------//-----redirectToPostProduct---//--------//----//---------//---------//---------//-----//------/-///------//----
////
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickModule());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickProcrumentandSourcing());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickPostProductReceipt());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickSelect());
//		Thread.sleep(3000);
//		genericHelper.actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.BACK_SPACE).build().perform();
//		genericHelper.actions.sendKeys(PoNumber).build().perform();   //----enter PO No Here
//
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickOK());
//		Thread.sleep(4000);
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(postProductPage.enterChalanNo(), challanNo);
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(postProductPage.enterproductReceipt(), challanNo);
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickLineregistration());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.processOk());
//////
////////                    ----//--///--------redirectToPendingVendorInvoice------//--------//----------//------//--------///-----------//--------//---------//------
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickModule());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickAccountPayable());
//		genericHelper.clickWithJavascriptExecutor(postProductPage.clickPendingVendorInvoices());
//		
//		genericHelper.clickWithJavascriptExecutor(postProductPage.fromProductReceipt());
//		Thread.sleep(5000);
//		genericHelper.clickWithJavascriptExecutor(pORateTypePages.checkBoxofProductReceipt()); 
//		genericHelper.clickWithJavascriptExecutor(pORateTypePages.okButtonofPendingVendor());
//		Thread.sleep(3000);
////		                                        //genericHelper.clearAndSendKeysWithJavascriptExecutor(pORateTypePages.invoiceNochallan(), challanNo);
//		genericHelper.actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).build().perform();
//		Thread.sleep(3000);
//		genericHelper.actions.sendKeys(challanNo).build().perform();
//		Thread.sleep(3000);
//		genericHelper.clickWithJavascriptExecutor(pORateTypePages.postbtnofpendingInvoice());
//		Thread.sleep(4000);
//		

//-------//-----------------redirected to unfix Module----------//=----------------------///---------//-----------------------//-------------------//-------

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnjewellery());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnUnfixModule());
		Thread.sleep(3000);

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.txtInvoiceNochallan());
		Thread.sleep(2000);
		pORateTypePages.txtEnterInvoiceNo().sendKeys("Puec_6741" + Keys.ENTER);

		String actualVendorIdofUnfix = pORateTypePages.txtVendorOfunfix().getAttribute("value");
		// String invoiceNO = pORateTypePages.invoiceNoofUnfix().getAttribute("value");
		String invoiceRate = pORateTypePages.txtInvoiceRate().getAttribute("value");
		String invoiceQty = pORateTypePages.txtInvoiceQty().getAttribute("value");
		System.out.println(actualVendorIdofUnfix);
		// System.out.println(invoiceNO);
		System.out.println(invoiceRate);
		System.out.println(invoiceQty);
		reportHelper.performAssert(test, "Purch Trans Price", invoiceRate, purchTransPriceofBR);
		reportHelper.performAssert(test, "Vendor Account", vendorAccount, vendorAccount);
		// reportHelper.performAssert(test, "Challan No *", invoiceNO, challanNo);
		reportHelper.performAssert(test, "Rcv Gross Weight *", rcvGrossWt, rcvGrossWt);

	}

	public void verifyPoFRateTypefield(MasterDto masterDto) throws InterruptedException, IOException {
		
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

		
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");
		fixRateType = masterDto.getAttributeValue("Rate Type Fix");
		unfixRateType = masterDto.getAttributeValue("Rate Type Unfix");
		jobcardRateType = masterDto.getAttributeValue("Rate Type Job Card");

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnjewellery()); 
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
	
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtReceiveFrom(), ReceiveFrom);
	//	genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtPoRateType(), poRateType);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtVendorCode(),vendorCode );
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtChallanNo(), challanNo);

		// genericHelper.clearAndsendKeysAndEnter(pORateTypePages.poRateType(),
		// poRateType);
		genericHelper.clickWithJavascriptExecutor(provisionalP.txtPoRateType());

		String actualfixedRateType = pORateTypePages.txtFixedRateType().getText();
		String actualunfixedRateType = pORateTypePages.txtUnfixedRateType().getText();
		//String actualjobcardRatetype = pORateTypePages.txtJobcardRatetype().getText(); 
		System.out.println(actualfixedRateType);
		System.out.println(actualunfixedRateType);
		
		reportHelper.performAssert(test, "Rate Type Fix", actualfixedRateType, fixRateType);
		reportHelper.performAssert(test, "Rate Type Unfix", actualunfixedRateType, unfixRateType);
		//reportHelper.performAssert(test, "Rate Type Job Card", actualjobcardRatetype, jobcardRateType);
		genericHelper.clearAndSendKeysAndEnter(pORateTypePages.txtPoRateType(), poRateType);

		//genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.sendKeysWithjavascriptExecutor(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(),minimumWT );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(),maximumWT );
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(),rcvGrossWt );
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());

	}

	public void verifyPoRateTypeforKaragir_05(MasterDto mastDto) throws InterruptedException, IOException {

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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

	
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");
		fixRateType = masterDto.getAttributeValue("Rate Type Fix");
		unfixRateType = masterDto.getAttributeValue("Rate Type Unfix");
		jobcardRateType = masterDto.getAttributeValue("Rate Type Job Card");
		
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnjewellery()); 
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
	
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(provisionalP.txtReceiveFrom(), ReceiveFrom);
		Thread.sleep(2000);
	
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(),challanNo );

		// genericHelper.clearAndsendKeysAndEnter(pORateTypePages.poRateType(),
		// poRateType);
		genericHelper.clickWithJavascriptExecutor(provisionalP.txtPoRateType());
		String actualfixedRateType = pORateTypePages.txtFixedRateType().getText();
		String actualunfixedRateType = pORateTypePages.txtUnfixedRateType().getText(); 
		//String actualjobcardRatetype = pORateTypePages.txtJobcardRatetype().getText();
		//genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPoRateType(), poRateType);
		System.out.println("Printed fixed Rate Type is "+actualfixedRateType);
		System.out.println("Printed unfixed Rate Type is"+actualunfixedRateType);
		
		reportHelper.performAssert(test, "Rate Type Fix", actualfixedRateType, fixRateType);
		reportHelper.performAssert(test, "Rate Type Unfix", actualunfixedRateType, unfixRateType);
		
		reportHelper.performAssert(test, "Rate Type Job Card", jobcardRateType, jobcardRateType);

		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(),itemId );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(),purity );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(),rcvPcs );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(),minimumWT );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(),maximumWT );
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(), rcvGrossWt);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());

	}

	public void wholeQCProcess_TC_07(MasterDto masterDto) throws InterruptedException, IOException {
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight"); 
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnjewellery()); 
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());

		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
	
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtReceiveFrom(), ReceiveFrom);
	//	genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtPoRateType(), poRateType);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtVendorCode(),vendorCode );
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalP.txtChallanNo(), challanNo);
		genericHelper.clickWithJavascriptExecutor(provisionalP.txtPoRateType());
		 genericHelper.clearAndSendKeysAndEnter(pORateTypePages.txtPoRateType(),poRateType);
		// poRateType);
		

	
		
	//	genericHelper.clearAndSendKeysAndEnter(pORateTypePages.txtPoRateType(), poRateType);

		//genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.sendKeysWithjavascriptExecutor(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(), itemId);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtConfiguration(), configuration);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtPurity(), purity);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvPcs(), rcvPcs);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMinimumWT(),minimumWT );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtMaximumWT(),maximumWT );
		genericHelper.scrollingTillWebElement(provisionalP.txtRcvGrossWt());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtRcvGrossWt(),rcvGrossWt );
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirm());
		Thread.sleep(4000);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnConfirmOK());
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
		System.out.println("Voucher No is ===" + voucherNo);
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIssue());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnIsuuetoPofromProvisionalParcel());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
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
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), "0001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());
		reportHelper.onTestSuccess(test, "User is able to Complete Whole QC Process when PO Rate Type is Unfix");
	}

	public void verifyBatchRegistration_TC_08(MasterDto masterDto) throws InterruptedException, IOException 
	{
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);

		genericHelper.clearAndSendKeysAndEnter(pORateTypePages.txtPoRateType(), poRateType);
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
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage. btnPoComplete());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), "0001");
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
		batchRegistrationPages.txtPurchaseTransPrice100().clear();
		Thread.sleep(2000);
		batchRegistrationPages.txtPurchaseTransPrice100().sendKeys("8200");
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		//genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnpreTagheader());
		Thread.sleep(3000);
//		genericHelper.scrollingTillWebElement(batchRegistrationPages.txtreferenceDocNO());
//		String PoNumber = batchRegistrationPages.txtreferenceDocNO().getAttribute("value");
//		System.out.println("Purchase order No is" + PoNumber);
//		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnRelease());
		reportHelper.onTestSuccess(test, "User is able to Complete Batch Registration while Po Rate Type is Unfix");

	}

	public void verifyPostProductandInvoice_TC_09(MasterDto masterDto) throws InterruptedException, IOException 
	{
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnclickJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtReceiveFrom(),ReceiveFrom );
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtChallanNo(), challanNo);

		genericHelper.clearAndSendKeysAndEnter(pORateTypePages.txtPoRateType(), poRateType);
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtWareHouse(), wareHouse);
		genericHelper.scrollingTillWebElement(provisionalP.btnNewParcelReceive());
		genericHelper.clickWithJavascriptExecutor(provisionalP.btnNewParcelReceive());
		genericHelper.clearAndSendKeysAndEnter(provisionalP.txtItemID(),itemId);
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
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), "0001");
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
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),"6500");
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnpreTagheader());
		Thread.sleep(6000);
		genericHelper.scrollingTillWebElement(batchRegistrationPages.txtreferenceDocNO());
		String PoNumber = batchRegistrationPages.txtreferenceDocNO().getAttribute("value"); 
		System.out.println("Purchase order No is" + PoNumber);
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnRelease());
//  
// 
//////                  ---------//-----redirectToPostProduct---//--------//----//---------//---------//---------//-----//------/-///------//----
//
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelModule());  
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelProcurementandSourcing()); 
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelPostProductReceipt());
		genericHelper.clickWithJavascriptExecutor(postProductPage.buttonSelect());
		Thread.sleep(3000);
		genericHelper.actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,Keys.TAB).build().perform();
		genericHelper.actions.sendKeys(PoNumber).build().perform(); // ----enter PO No Here---PoNumber

		genericHelper.clickWithJavascriptExecutor(postProductPage.btnOK());
		Thread.sleep(4000);
		genericHelper.sendKeysWithjavascriptExecutor(postProductPage.textChallanNo(), challanNo); 
		genericHelper.actions.sendKeys(Keys.TAB).build().perform();
		genericHelper.actions.sendKeys(challanNo).build().perform();
		genericHelper.scrollingTillWebElement(postProductPage.buttonLineRegistration());
		genericHelper.clickWithJavascriptExecutor(postProductPage.buttonLineRegistration());
		genericHelper.clickWithJavascriptExecutor(postProductPage.buttonProcessOk());
////
//////                    ----//--///--------redirectToPendingVendorInvoice------//--------//----------//------//--------///-----------//--------//---------//------
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelModule());
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelAccountsPayable());
		genericHelper.clickWithJavascriptExecutor(postProductPage.labelPendingVendorInvoices());

		genericHelper.clickWithJavascriptExecutor(postProductPage.btnFromProductReceipt());
		Thread.sleep(5000);
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.chkCheckBoxofProductReceipt());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnOkButtonofPendingVendor());
		Thread.sleep(3000);
		                                                  //genericHelper.clearAndSendKeysWithJavascriptExecutor(pORateTypePages.invoiceNochallan(), challanNo);
		genericHelper.actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB).build().perform();
		Thread.sleep(3000);
		genericHelper.actions.sendKeys(PoNumber).build().perform();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnPostbtnofpendingInvoice()); 
		Thread.sleep(4000);

	}

	public void verifyUnfixmoduleDiaplay_TC_12(MasterDto masterDto) throws InterruptedException, IOException {
		hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		HmRemark = masterDto.getAttributeValue("HM Remark");
		HmUser = masterDto.getAttributeValue("HM User:");
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
		rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		rcvStoneWt = masterDto.getAttributeValue("RCV Stone Weight");
		StoneName = masterDto.getAttributeValue("Stone Name");
		StoneConfiguration = masterDto.getAttributeValue("Stone Configuration");
		qcRejectionPcs = masterDto.getAttributeValue("QC Rejection Pcs");
		qcRejectionGrossWt = masterDto.getAttributeValue("QC Rejection Gross Weight");
		qcRejectionNetWt = masterDto.getAttributeValue("QC Rejection Net Weight");
		qcRejectionRemark = masterDto.getAttributeValue("QC Remark");
		QCperson = masterDto.getAttributeValue("QC User :");
		LmRejectionPcs = masterDto.getAttributeValue("LM  Rejection Pcs");
		LmRejectionGrossWT = masterDto.getAttributeValue("LM Rejection Gross Weight");
		Remarks = masterDto.getAttributeValue("LM Remark");
		LmRemark = masterDto.getAttributeValue("Remarks");
		LmUser = masterDto.getAttributeValue("LM User:");
		PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		poCompleteSeccesMsg = masterDto.getAttributeValue("Succes Message Po Complete");
		poPassPcs = masterDto.getAttributeValue("PO Pass Pcs");
		poPassGrossWt = masterDto.getAttributeValue("PO Pass Gross Weight");
		poPassNetsWt = masterDto.getAttributeValue("PO Pass Net Weight");

		challanNoofBR = masterDto.getAttributeValue("Challan No.");
		purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		exprectedItemID = masterDto.getAttributeValue("Item Id");
		exprectednoOfPcs = masterDto.getAttributeValue("No. of Pieces");
		exprectgrossWt = masterDto.getAttributeValue("Gross Weight");

		PurchTransPrice100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		purchTrans99 = masterDto.getAttributeValue("Purch Trans 99");
		CurrentwereHouseofBR = masterDto.getAttributeValue("Current WareHouse of BR");
		currentSiteOfBR = masterDto.getAttributeValue("Current Site of BR");
		locatioNofBR = masterDto.getAttributeValue("Location of BR");
		vendorAccountofBR = masterDto.getAttributeValue("Vendor Account");
		onlyAcceptorReject = masterDto.getAttributeValue("Only Accept OR Both");
		acceptAmountofBR = masterDto.getAttributeValue("Accept Amount");
		rejectAmountofBR = masterDto.getAttributeValue("Reject Amount");
		totalAMountofBR = masterDto.getAttributeValue("Total Amount");
		qtyOfPretagLine = masterDto.getAttributeValue("QTy of Pre tag line");
		purchTransPriceofBR = masterDto.getAttributeValue("Purch Trans Price");
		purchTransValueofBR = masterDto.getAttributeValue("Purch Trans Value");
		makingItemName = masterDto.getAttributeValue("Making Item No.");
		valueofPMC = masterDto.getAttributeValue("Value");
		itemCategoryofPMC = masterDto.getAttributeValue("Item Category");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("Making type");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poRateType = masterDto.getAttributeValue("PO Rate Type");
		vendorAccount = masterDto.getAttributeValue("Vendor Account");

		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnmodule());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnjewellery());
		genericHelper.clickWithJavascriptExecutor(pORateTypePages.btnUnfixModule());
		Thread.sleep(3000);
		if (pORateTypePages.txtUnfixmodulediaplay().isDisplayed()) {
			reportHelper.onTestSuccess(test,
					"User is able to redirect Unfix module via Module--> Jewellery --> Unfix Gold Settlement");
		}

		else {
			reportHelper.onTestFailure(test,
					"User is not able to redirect Unfix module via Module--> Jewellery --> Unfix Gold Settlement");
		}

	}
}