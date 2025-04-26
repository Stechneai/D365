package com.d365.core;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class BatchRegistration extends MasterClass {

	public String challanNo;
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
	public String poratetype;
	public String valueOfPMC;
	public String pcsOfPMC;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as necessary
	
	

	public void processProvisonalParcelPOBatchRegistration(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
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
		itemCategoryofPMC = masterDto.getAttributeValue("ItemCategory");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("MakingType");
		makingRateOfPMC = masterDto.getAttributeValue("Making Rate");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poratetype = masterDto.getAttributeValue("PoRateType");

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
		

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickQcProcessManagement());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
		
		//genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), poratetype);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), "poratetype");
		
		//genericHelper.clearAndSendKeysWithJavascriptExecutor(provisionalParcelPage.txtPoRateType(), "Fixed Rate");

		

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
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
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

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());

		//String actualPassPcs = poCheckPage.poPassPcs().getAttribute("value");
		//String actualGrossWt = poCheckPage.PoPassGrossWt().getAttribute("value");

//		reportHelper.performAssert(test, "PO Pass Pcs", poPassPcs, actualPassPcs);
//		reportHelper.performAssert(test, "Rcv Gross Weight *", actualGrossWt, rcvGrossWt);
//
//		String poPassNetWt = poCheckPage.txtPoPassNetWt().getAttribute("value");
//		reportHelper.performAssert(test, "PO Pass Net Weight", poPassNetsWt, poPassNetWt);
//
//		String actualItemID = poCheckPage.txtItemofPoDetails().getAttribute("value");
//		reportHelper.performAssert(test, "Item Id *", actualItemID, itemId);
//
//		String actualConfiguration = poCheckPage.txtConfigurationofPoDetails().getAttribute("value");
//		reportHelper.performAssert(test, "Configuration *", actualConfiguration, configuration);
//
//		String expectedPurity = poCheckPage.txtPurityOfPoDetails().getAttribute("value");
//		reportHelper.performAssert(test, "Purity Carat", expectedPurity, purity);

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		reportHelper.performAssert(test, "PO User :", PoCheckUser1, PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());

		Thread.sleep(4000);

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkBatchRegistration());

		// navigation of offline tagging
		try {

			if (batchRegistrationPages.btnNewBatchRegistration().isDisplayed()
					&& batchRegistrationPages.btnRelease().isDisplayed()
					&& batchRegistrationPages.btnPost().isDisplayed()
					&& batchRegistrationPages.btnGenerateLine().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
				reportHelper.onTestSuccess(test,
						"Verify that navigating sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
				reportHelper.onTestFailure(test,
						"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
			reportHelper.onTestFailure(test,
					"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");

		}
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),
				purchTransrate100);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPretagHeader());

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPMC());

		WebElement makingItemNo = batchRegistrationPages.txtMakingItemNo();
		String atualmakingItemNo = makingItemNo.getAttribute("value");
		reportHelper.performAssert(test, "Making Item No.", MakingItemNoofPMC, atualmakingItemNo);

		// genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.releaseBtn());

	}

	public void WithoutEnterMakingItemNo(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
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
		poratetype = masterDto.getAttributeValue("PoRateType");

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickQcProcessManagement());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), poratetype);

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
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
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

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());
		
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());

		Thread.sleep(4000);

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkBatchRegistration());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),
				purchTransrate100);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPretagLine());

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPMC());
		WebElement makingItemNoValue = batchRegistrationPages.txtMakingItemNo();
		String actaulMakingItemNo=makingItemNoValue.getAttribute("value");
		System.out.println("No is:"+actaulMakingItemNo);
		
		
		if (MakingItemNoofPMC.equals(actaulMakingItemNo) && !actaulMakingItemNo.isEmpty()) {
		    System.out.println("✅ The field is auto-filled with: " + actaulMakingItemNo);
		    reportHelper.onTestFailure(test, "The field is auto-filled successfully with: " + actaulMakingItemNo);
		    reportHelper.generateLogFullScreenSS(test, "Field is auto filled");
		} else {
		    System.out.println("❌ The field is NOT auto-filled.");
		    reportHelper.onTestSuccess(test, "The field did not auto-fill as expected.");
		    reportHelper.generateLogFullScreenSS(test, "Field is not auto filled");
		}

		
		makingItemNoValue.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		 
//		makingItemNoValue.clear();
//		makingItemNoValue.sendKeys(Keys.BACK_SPACE); 
//		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnRelease());
		Thread.sleep(2000);

	}

	public void validatePMCData(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
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
		itemCategoryofPMC = masterDto.getAttributeValue("ItemCategory");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("MakingtType");
		makingRateOfPMC = masterDto.getAttributeValue("MakingRate");
		valueOfPMC = masterDto.getAttributeValue("Value");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poratetype = masterDto.getAttributeValue("PoRateType");
		pcsOfPMC = masterDto.getAttributeValue("Pcs");

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickQcProcessManagement());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		reportHelper.generateLogFullScreenSS(test,"Navigation Provisonal Parcel Page Sucessfully");
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), poratetype);

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
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
		System.out.println("Voucher No is ===" + voucherNo);

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIssue());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIsuuetoPofromProvisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());

		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
		reportHelper.generateLogFullScreenSS(test,"PO check page is open sucessfully");

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
		reportHelper.performAssert(test, "PO User :", PoCheckUser1, PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());

		Thread.sleep(4000);

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkBatchRegistration());
		
		// navigation of offline tagging
				try {

					if (batchRegistrationPages.btnNewBatchRegistration().isDisplayed()
							&& batchRegistrationPages.btnRelease().isDisplayed()
							&& batchRegistrationPages.btnPost().isDisplayed()
							&& batchRegistrationPages.btnGenerateLine().isDisplayed()) {
						reportHelper.generateLogFullScreenSS(test,
								"Verify that navigating sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
						reportHelper.onTestSuccess(test,
								"Verify that navigating sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
					} else {
						reportHelper.generateLogFullScreenSS(test,
								"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
						reportHelper.onTestFailure(test,
								"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
					}
				} catch (Exception e) {
					reportHelper.generateLogFullScreenSS(test,
							"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");
					reportHelper.onTestFailure(test,
							"Verify that navigating not sucessfully of Batch registration using following Path Jewellery>>Batch Registration");

				}

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),
				purchTransrate100);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPretagLine());

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPMC());

		WebElement makingItemNo = batchRegistrationPages.txtMakingItemNo();
		String atualmakingItemNo = makingItemNo.getAttribute("value");
		reportHelper.performAssert(test, "Making Item No.", MakingItemNoofPMC, atualmakingItemNo);
		reportHelper.generateLogFullScreenSS(test,"Making Item No is correctly displayed");

		WebElement itemcategory = batchRegistrationPages.dropDownItemcategorYofPMC();
		String actualitemcategory = itemcategory.getAttribute("value");
		reportHelper.performAssert(test, "ItemCategory", itemCategoryofPMC, actualitemcategory);
		reportHelper.generateLogFullScreenSS(test,"Item category is correctly displayed");

		WebElement pcss = batchRegistrationPages.txtNop();
		String atualPcs = pcss.getAttribute("value");
		reportHelper.performAssert(test, "Pcs", pcsOfPMC, atualPcs);
		reportHelper.generateLogFullScreenSS(test,"Pcs is correctly displayed");
		

//		WebElement makingType = batchRegistrationPages.dropDownMakingTypeofPMC();
//		String atualmakingType = makingType.getAttribute("value");
//		reportHelper.performAssert(test, "MakingType", makingTypeOfPMC, atualmakingType);

		WebElement makingRate = batchRegistrationPages.txtMakingRateofPMC();
		String atualmakingRate = makingRate.getAttribute("value");
		reportHelper.performAssert(test, "MakingRate", makingRateOfPMC, atualmakingRate);
		reportHelper.generateLogFullScreenSS(test,"Making Rate is correctly displayed");


	}

	public void editableMakingItemNo() throws InterruptedException, IOException {
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
		itemCategoryofPMC = masterDto.getAttributeValue("ItemCategory");
		MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");
		makingTypeOfPMC = masterDto.getAttributeValue("MakingtType");
		makingRateOfPMC = masterDto.getAttributeValue("MakingRate");
		valueOfPMC = masterDto.getAttributeValue("Value");
		makingAmountofTagHeader = masterDto.getAttributeValue("Making Amount");
		poratetype = masterDto.getAttributeValue("PoRateType");
		pcsOfPMC = masterDto.getAttributeValue("Pcs");

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());

		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		// genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.clickQcProcessManagement());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		reportHelper.generateLogFullScreenSS(test,"Provisonal Parcel Page is open sucessfully");
		
		
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);

		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), poratetype);

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
		String voucherNo = poCheckPage.txtVoucherNo().getAttribute("title");
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

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnUpdate());

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoComplete());

		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnPoCompleteOk());
		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")).click();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(poCheckPage.btnOk());

		Thread.sleep(4000);

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkBatchRegistration());
		reportHelper.generateLogFullScreenSS(test,"Batch Registration Page is open sucessfully");

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),
				purchTransrate100);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPretagLine());

		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPMC());

		WebElement makingItemNo = batchRegistrationPages.txtMakingItemNo();
		String atualmakingItemNo = makingItemNo.getAttribute("value");
		System.out.println("Value:" + atualmakingItemNo);

		batchRegistrationPages.txtMakingItemNo().clear();
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtMakingItemNo(), MakingItemNoofPMC);

		WebElement makingItemNo1 = batchRegistrationPages.txtMakingItemNo();
		String atualmakingItemNo1 = makingItemNo1.getAttribute("value");
		System.out.println("Value:" + atualmakingItemNo1);

		if (atualmakingItemNo.equalsIgnoreCase(atualmakingItemNo1)) {
			System.out.println("The Making Item No is not changed and field is not editable.");
			reportHelper.onTestFailure(test, "The Making Item No is not changed and field is not editable.");
			reportHelper.generateLogFullScreenSS(test,"The Making Item No is not changed and field is not editable.");
		} else {
			System.out.println("The Making Item No is changed and field is editable.");
			reportHelper.onTestSuccess(test, "The Making Item No is changed and field is editable.");
			reportHelper.generateLogFullScreenSS(test,"The Making Item No is changed and field is editable.");
		}

//	if (!makingItemNo.isEnabled() || makingItemNo.getAttribute("readonly") != null) {
//	    System.out.println("The Making Item No field is not editable.");
//	    reportHelper.onTestFailure(test, "The Making Item No field is not editable.");
//	    return;
//	}
//	else
//	{
//		  System.out.println("The Making Item No  field is  editable.");
//		    reportHelper.onTestSuccess(test, "The Making Item No  field is  editable.");
//		    return;
//	}

	}

	public void editableMakingItemNo1(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		// Initialize WebDriverWait for explicit waits

		// Extract attribute values from masterDto
		String hmRejectionPcs = masterDto.getAttributeValue("HM Rejection Pcs");
		String hmRejectionGrossWt = masterDto.getAttributeValue("HM Rejection Gross Weight");
		String HmRemark = masterDto.getAttributeValue("HM Remark");
		String HmUser = masterDto.getAttributeValue("HM User:");
		String successMessage = masterDto.getAttributeValue("Success Message");
		String ReceiveFrom = masterDto.getAttributeValue("Receive From *");
		String vendorCode = masterDto.getAttributeValue("Karigar/Vendor Code *");
		String challanNo = masterDto.getAttributeValue("Challan No *");
		String wareHouse = masterDto.getAttributeValue("Warehouse *");
		String itemId = masterDto.getAttributeValue("Item Id *");
		String configuration = masterDto.getAttributeValue("Configuration *");
		String purity = masterDto.getAttributeValue("Purity Carat");
		String rcvPcs = masterDto.getAttributeValue("Rcv Pcs *");
		String minimumWT = masterDto.getAttributeValue("Minimum Weight");
		String maximumWT = masterDto.getAttributeValue("Maximum Weight");
		String rcvGrossWt = masterDto.getAttributeValue("Rcv Gross Weight *");
		String rcvNetWt = masterDto.getAttributeValue("Rcv Net Weight *");
		String poratetype = masterDto.getAttributeValue("PoRateType");
		String PoCheckUser1 = masterDto.getAttributeValue("PO User :");
		String purchTransrate100 = masterDto.getAttributeValue("Purch Trans Price (100% Purity)");
		String MakingItemNoofPMC = masterDto.getAttributeValue("Making Item No.");

		// Navigate and perform provisional parcel process
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkprovisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnNew());
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownReceiveFrom(), ReceiveFrom);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownVendorCode(), vendorCode);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtChallanNo(), challanNo);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.dropDownWareHouse(), wareHouse);
		genericHelper.clearAndSendKeysAndEnter(provisionalParcelPage.txtEnterPoRateType(), "poratetype");
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
		// Wait for VoucherNo and retrieve its value
		WebElement voucherNoElement = wait.until(ExpectedConditions.visibilityOf(poCheckPage.txtVoucherNo()));
		String voucherNo = voucherNoElement.getAttribute("title");
		System.out.println("Voucher No is ===" + voucherNo);

		// Continue to PO check process
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIssue());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.btnIsuuetoPofromProvisionalParcel());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(poCheckPage.linkPoCheck());
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.lblReferenceNo())).click();
		WebElement referenceNoInput = wait.until(ExpectedConditions.visibilityOf(poCheckPage.txtEnterReferenceNo()));
		referenceNoInput.sendKeys(voucherNo);
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.btnApplyReferenceNo())).click();
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.btnUpdate())).click();
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.btnPoComplete())).click();
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.btnPoCompleteOk())).click();

		genericHelper.sendKeysWithjavascriptExecutor(poCheckPage.txtPoCheckUser(), PoCheckUser1);

		// Designer Code verification
		WebElement designerCodeInput = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//input[contains(@id,\"SysGen_DesignerCode\")]")));
		designerCodeInput.click();
		wait.until(ExpectedConditions.elementToBeClickable(poCheckPage.btnOk())).click();

		// Navigate to batch registration
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkModule());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkJewellery());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.lnkBatchRegistration());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnNewBatchRegistration());
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtChallanNo(), challanNo);
		genericHelper.sendKeysWithjavascriptExecutor(batchRegistrationPages.txtPurchaseTransPrice100(),
				purchTransrate100);
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.btnGenerateLine());
		genericHelper.scrollingTillWebElement(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPretagLine());
		genericHelper.clickWithJavascriptExecutor(batchRegistrationPages.labelPMC());

		// Validate Making Item No.
		WebElement makingItemNo = batchRegistrationPages.txtMakingItemNo();
		String actualMakingItemNo = makingItemNo.getAttribute("value");
		System.out.println("Value:" + actualMakingItemNo);
		batchRegistrationPages.txtMakingItemNo().clear();
		genericHelper.clearAndSendKeysAndEnter(batchRegistrationPages.txtMakingItemNo(), MakingItemNoofPMC);

		WebElement makingItemNo1 = batchRegistrationPages.txtMakingItemNo();
		String actualMakingItemNo1 = makingItemNo1.getAttribute("value");
		System.out.println("Value:" + actualMakingItemNo1);

		if (actualMakingItemNo.equalsIgnoreCase(actualMakingItemNo1)) {
			System.out.println("The Making Item No is not changed and field is not editable.");
			reportHelper.onTestFailure(test, "The Making Item No is not changed and field is not editable.");
			reportHelper.generateLogFullScreenSS(test, "The Making Item No is not changed and field is not editable.");
		} else {
			System.out.println("The Making Item No is changed and field is editable.");
			reportHelper.onTestSuccess(test, "The Making Item No is changed and field is editable.");
			reportHelper.generateLogFullScreenSS(test, "The Making Item No is changed and field is editable.");
		}
	}

}