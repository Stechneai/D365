package com.d365.core;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class PDCReport extends MasterClass {

	public void reportReportDataValidate(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {
		String location = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");
		String scheme = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scheme"), "");
		String fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FromDate"), "");
		System.out.println("From date" + fromdate);
		String todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ToDate"), "");
		String type = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Type"), "");
		String customername1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerName1"), "");
		String customername2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerName2"), "");
		String customername3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("CustomerName3"), "");
		String schemetype1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType1"), "");
		String schemetype2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType2"), "");
		String schemetype3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeType3"), "");
		String schemeentryno1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryno1"), "");
		String schemeentryno2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryno2"), "");
		String schemeentryno3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeEntryno3"), "");
		String schemeopeningdate1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeOpeningDate1"), "");
		String schemeopeningdate2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeOpeningDate2"), "");
		String schemeopeningdate3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SchemeOpeningDate3"), "");
		String chequedate1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeDate1"), "");
		String chequedate2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeDate2"), "");
		String chequedate3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeDate3"), "");
		String chequeno1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeNo1"), "");
		String chequeno2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeNo2"), "");
		String chequeno3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeNo3"), "");
		String chequeamount1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeAmount1"), "");
		String chequeamount2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeAmount2"), "");
		String chequeamount3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ChequeAmount3"), "");
		String bankname1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("BankName1"), "");
		String bankname2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("BankName2"), "");
		String bankname3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("BankName3"), "");


		genericHelper.clickWithJavascriptExecutor(pdcReportPage.lnkModule());
		genericHelper.clickWithJavascriptExecutor(pdcReportPage.lnkJewellery());
		genericHelper.scrollingTillWebElement(pdcReportPage.lnkPDCReport());

		genericHelper.clickWithJavascriptExecutor(pdcReportPage.lnkPDCReport());

		genericHelper.sendKeysAndEnterWithjavascriptExecutor(pdcReportPage.dropDownLocation(), location);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(pdcReportPage.datePickerFromDate(), fromdate);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(pdcReportPage.dropDownScheme(), scheme);
		genericHelper.sendKeysAndEnterWithjavascriptExecutor(pdcReportPage.datePickerToDate(), todate);

		genericHelper.clickWithJavascriptExecutor(pdcReportPage.btnok());
		
	/*	Runtime.getRuntime().exec("C:/Users/lenovo/Downloads/downloadClick.exe");
		genericHelper.clickWithJavascriptExecutor(monthlySavingSchemeDefaulterListPage.btnDownload());*/

		WebElement cusname1 =pdcReportPage.txtCustomerName1();
		String actualCustomerName1 = cusname1.getAttribute("value");
		System.out.println("Value:" + actualCustomerName1);
		
		WebElement schmtype1 =pdcReportPage.txtSchemeType1();
		String actualSchemeType1 = schmtype1.getAttribute("value");
		System.out.println("Value:" + actualSchemeType1);

		WebElement schmentry1 = pdcReportPage.txtSChemeEntryNo1();
		String actualSchemeEntryNo1 = schmentry1.getAttribute("value");
		System.out.println("Value:" + actualSchemeEntryNo1);

		WebElement schmopeningdt1 = pdcReportPage.txtSchemeOpeningDate1();
		String actualSchemeOpeningDate = schmopeningdt1.getAttribute("value");
		System.out.println("Value:" + actualSchemeOpeningDate);

		WebElement cheqdate1 = pdcReportPage.txtChequeDate1();
		String actualChequeDate1 = cheqdate1.getAttribute("value");
		System.out.println("Value:" + actualChequeDate1);

		// Validate Making Item No.
		WebElement cheqno1 = pdcReportPage.txtChequeNo1();
		String actualChequeNo1 = cheqno1.getAttribute("value");
		System.out.println("Value:" + actualChequeNo1);

		WebElement cheqamt1 = pdcReportPage.txtChequeAmount1();
		String actaullChequeAmount1 = cheqamt1.getAttribute("value");
		System.out.println("Value:" + actaullChequeAmount1); 
		
		WebElement bankn1 = pdcReportPage.txtBankName1();
		String actualBankName1 = bankn1.getAttribute("value");
		System.out.println("Value:" + actualBankName1); 
		
		if (customername1.equalsIgnoreCase(actualCustomerName1)
				&& schemetype1.equalsIgnoreCase(actualSchemeType1) && schemeentryno1.equalsIgnoreCase(actualSchemeEntryNo1) 
				&& schemeopeningdate1.equalsIgnoreCase(actualSchemeOpeningDate) && chequedate1.equalsIgnoreCase(actualChequeDate1) 
				&& chequeno1.equalsIgnoreCase(actualChequeNo1) && chequeamount1.equalsIgnoreCase(actaullChequeAmount1) 
				&& bankname1.equalsIgnoreCase(actualBankName1)) {
			reportHelper.onTestSuccess(test, "Cheque Entry Details is displayed Correctly.");
			reportHelper.generateLogFullScreenSS(test, "Cheque Entry Details is displayed Correctly.");
		} else {
			reportHelper.onTestFailure(test, "Cheque Entry Details is not displayed Correctly.");
			reportHelper.generateLogFullScreenSS(test, "Cheque Entry Details is not displayed Correctly.");
		}

	}

}
