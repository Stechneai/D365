package com.d365.core;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import com.d365.utils.MasterClass;

public class QcSetupMaster extends MasterClass{
		
	public String itemId;
	public String configuration;
	public String designcheck;
	public String qccheck;
	public String hmcheck;
	public String lmcheck;
	public String pocheck;
	public String designcheckyes;
	public String qccheckyes;
	public String hmcheckyes;
	public String lmcheckyes;
	public String pocheckyes;

	public void qcsetupmaster() throws IOException, InterruptedException {
		// Fetching data from masterDto
		String itemId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		String designcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Check"), "");
		String qccheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Check"), "");
		String hmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Check"), "");
		String lmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Check"), "");
		String pocheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Check"), "");
		String designcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Yes"), "");
		String qccheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Yes"), "");
		String hmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Yes"), "");
		String lmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Yes"), "");
		String pocheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Yes"), "");
		if(qcSetupMasterPage.headerItemID().isDisplayed())
		{
			reportHelper.onTestSuccess(test,"TC_03 Verify validation of add Item Id  field: Following are the validations of Item Id field:\r\n"
					+ "1.It should be single select.\r\n"
					+ "2.It should have drop down. "); 
			reportHelper.generateLogFullScreenSS(test, "TC_03 Verify validation of add Item Id  field: Following are the validations of Item Id field:\\r\\n\"\r\n"
					+ "					+ \"1.It should be single select.\\r\\n");
		}
		else
		{
			reportHelper.onTestFailure(test, "TC_03 Verify validation of add Item Id  field: Following are the validations of Item Id field:\\r\\n\"\r\n"
					+ "					+ \"1.It should be single select.\\r\\n");
			reportHelper.generateLogFullScreenSS(test, "TC_03 Verify validation of add Item Id  field: Following are the validations of Item Id field:\\r\\n\"\r\n"
					+ "					+ \"1.It should be single select.\\r\\n");
		}
				
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.itemIdField(), itemId);
		
		if(qcSetupMasterPage.headerConfiguration().isDisplayed())
		{
			reportHelper.onTestSuccess(test,"TC_04 Verify validation of add Configuration field: Following are the validations of Configuration field:"
					+ "1.It should be single select."
					+ "2.It should have drop down. "); 
			reportHelper.generateLogFullScreenSS(test, "TC_04 Verify validation of add Configuration field: Following are the validations of Configuration field:"
					+ "					+ \"1.It should be single select.");
		}
		else
		{
			reportHelper.onTestFailure(test, "TC_03 Verify validation of add Configuration field: Following are the validations of Configuration field:"
					+ "					+ \"1.It should be single select.");
			reportHelper.generateLogFullScreenSS(test, "TC_03 Verify validation of add Configuration field: Following are the validations of Configuration field:"
					+ "					+ \"1.It should be single select.");
		}
		
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.configurationField(), configuration);
		
		if(qcSetupMasterPage.headerDesignCheck().isDisplayed())
		{
			reportHelper.onTestSuccess(test,"TC_05 Verify validation of add  Dc check field: Following are the validations of Dc check field:"
					+ "1.It should be single select."
					+ "2.It should have drop down. "); 
			reportHelper.generateLogFullScreenSS(test, "TC_05 Verify validation of add  Dc check field: Following are the validations of Dc check field:"
					+ "					+ \"1.It should be single select.");
		}
		else
		{
			reportHelper.onTestFailure(test, "TC_05 Verify validation of add  Dc check field: Following are the validations of  Dc check field:"
					+ "					+ \"1.It should be single select.");
			reportHelper.generateLogFullScreenSS(test, "TC_05 Verify validation of add  Dc check field: Following are the validations of  Dc check field:"
					+ "					+ \"1.It should be single select.");
		}
		
		genericHelper.clearAndsendKeysAndEnter(qcSetupMasterPage.designCheckFieldDD(), designcheck);
		Thread.sleep(3000);
		qcSetupMasterPage.DesignYes().click();
        Actions actn = new Actions(driver);
	     actn.sendKeys(Keys.TAB);
		
	//	genericHelper.clickWithJavascriptExecutor(qcSetupMasterPage.DesignYes(), designcheckyes);
	   
	     if(qcSetupMasterPage.headerQcCheck().isDisplayed())
			{
				reportHelper.onTestSuccess(test,"TC_06 Verify validation of add Qc check field: Following are the validations of Qc check field:"
						+ "1.It should be single select."
						+ "2.It should have drop down. "); 
				reportHelper.generateLogFullScreenSS(test, "TC_05 Verify validation of add Qc check field: Following are the validations of Qc check field:"
						+ "					+ \"1.It should be single select.");
			}
			else
			{
				reportHelper.onTestFailure(test, "TC_05 Verify validation of add Qc check field: Following are the validations of Qc check field:"
						+ "					+ \"1.It should be single select.");
				reportHelper.generateLogFullScreenSS(test, "TC_05 Verify validation of add Qc check field: Following are the validations of Qc check field:"
						+ "					+ \"1.It should be single select.");
			}
		genericHelper.clearAndsendKeysAndEnter(qcSetupMasterPage.QCCheckFieldDD(), qccheck);
		Thread.sleep(3000);
		qcSetupMasterPage.QCCheckYes().click();
		actn.sendKeys(Keys.TAB);
		 
		Thread.sleep(3000);
		if(qcSetupMasterPage.headerHmCheck().isDisplayed())
		{
			reportHelper.onTestSuccess(test,"TC_07 Verify validation of add Hm check field: Following are the validations ofHm check field:"
					+ "1.It should be single select."
					+ "2.It should have drop down. "); 
			reportHelper.generateLogFullScreenSS(test, "TC_05 Verify validation of add Hm check field: Following are the validations of Hm check field:"
					+ "					+ \"1.It should be single select.");
		}
		else
		{
			reportHelper.onTestFailure(test, "TC_07 Verify validation of add Hm check field: Following are the validations of Hm check field:"
					+ "					+ \"1.It should be single select.");
			reportHelper.generateLogFullScreenSS(test, "TC_07 Verify validation of add Hm check field: Following are the validations of Hm check field:"
					+ "					+ \"1.It should be single select.");
		}
		genericHelper.clearAndsendKeysAndEnter(qcSetupMasterPage.hmCheckFieldDD(), hmcheck);
		qcSetupMasterPage.hmCheckYes().click();
		Thread.sleep(3000);
		
		actn.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		 if(qcSetupMasterPage.headerLmCheck().isDisplayed())
			{
				reportHelper.onTestSuccess(test,"TC_08 Verify validation of add Lm check field: Following are the validations of Lm check field:"
						+ "1.It should be single select."
						+ "2.It should have drop down. "); 
				reportHelper.generateLogFullScreenSS(test, "TC_08 Verify validation of add Hm check field: Following are the validations of  Lm check field:"
						+ "					+ \"1.It should be single select.");
			}
			else
			{
				reportHelper.onTestFailure(test, "TC_08 Verify validation of add  Lm check field:Following are the validations of  Lm check field:"
						+ "					+ \"1.It should be single select.");
				reportHelper.generateLogFullScreenSS(test, "TC_08 Verify validation of add  Lm check field: Following are the validations of  Lm check field:"
						+ "					+ \"1.It should be single select.");
			}
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.lmCheckFieldDD(), lmcheck);
		qcSetupMasterPage.lmCheckYes().click();
		Thread.sleep(3000);
		actn.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.poCheckFieldDD(), pocheck);
//		//genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.poCheckYes(), pocheckyes);
//		qcSetupMasterPage.poCheckYes().click();
//		Actions actnpo = new Actions(driver);
//		actnpo.sendKeys(Keys.TAB);
//		Thread.sleep(3000);
		
		qcSetupMasterPage.SaveButton().click();
	}

	public void withoutDataqcsetup() throws IOException, InterruptedException {
		// Fetching data from masterDto
		String itemId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		String designcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Check"), "");
		String qccheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Check"), "");
		String hmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Check"), "");
		String lmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Check"), "");
		String pocheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Check"), "");
		String designcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Yes"), "");
		String qccheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Yes"), "");
		String hmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Yes"), "");
		String lmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Yes"), "");
		String pocheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Yes"), "");
		
		
		qcSetupMasterPage.SaveButton().click();
	}
	
	
	public void editrecordqcsetup() throws IOException, InterruptedException {
		// Fetching data from masterDto
		String itemId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		String configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		String designcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Check"), "");
		String qccheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Check"), "");
		String hmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Check"), "");
		String lmcheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Check"), "");
		String pocheck = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Check"), "");
		String designcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Yes"), "");
		String qccheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("QC Yes"), "");
		String hmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("HM Yes"), "");
		String lmcheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("LM Yes"), "");
		String pocheckyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("PO Yes"), "");
		
		
		genericHelper.clearAndsendKeysAndEnter(qcSetupMasterPage.itemIdField(), itemId);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.configurationField(), configuration);
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.designCheckFieldDD(), designcheck);
	//	genericHelper.clickWithJavascriptExecutor(qcSetupMasterPage.DesignYes(), designcheckyes);
	    qcSetupMasterPage.DesignYes().click();
         Actions actn = new Actions(driver);
	     actn.sendKeys(Keys.TAB);
	     
		genericHelper.clearAndsendKeysAndEnter(qcSetupMasterPage.QCCheckFieldDD(), qccheck);
//		qcSetupMasterPage.QCCheckYes().click();
//		actn.sendKeys(Keys.TAB);
	     
		Thread.sleep(3000);
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.hmCheckFieldDD(), hmcheck);
		//genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.QCCheckYes(), hmcheckyes);
		qcSetupMasterPage.hmCheckYes().click();
		actn.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.lmCheckFieldDD(), lmcheck);
		//genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.lmCheckYes(), hmcheckyes);
		qcSetupMasterPage.lmCheckYes().click();
		Actions actnlm = new Actions(driver);
		actnlm.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.poCheckFieldDD(), pocheck);
//		//genericHelper.clearAndSendKeysWithJavascriptExecutor(qcSetupMasterPage.poCheckYes(), pocheckyes);
//		qcSetupMasterPage.poCheckYes().click();
//		Actions actnpo = new Actions(driver);
//		actnpo.sendKeys(Keys.TAB);
//		Thread.sleep(3000);
		qcSetupMasterPage.SaveButton().click();
	}
	
}
