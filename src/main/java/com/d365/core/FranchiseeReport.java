package com.d365.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class FranchiseeReport extends MasterClass {

	public String loaction;
	public String productgroup;
	public String fromdate;
	public String todate;

	public void add(MasterDto masterDto)
			throws IOException, InterruptedException, InvalidFormatException, ParseException, AWTException {

		loaction = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Location"), "");

		productgroup = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Product Group"), "");
		fromdate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("From date"), "");
		todate = StringUtils.defaultIfBlank(masterDto.getAttributeValue("To Date"), "");

		if (franchiseereportpage.labelBranch().isDisplayed() && franchiseereportpage.labelProductGroup().isDisplayed()
				&& franchiseereportpage.labelFromDate().isDisplayed()
				&& franchiseereportpage.labelToDate().isDisplayed()) {
			reportHelper.generateLogFullScreenSS(test,
					"Tc_01-->Verify Navigation to 'Franchisee Sale Bill ornament report' module");
			reportHelper.onTestSuccess(test, "Verify Navigation to 'Franchisee Sale Bill ornament report' module");
		} else {
			reportHelper.generateLogFullScreenSS(test,
					"Verify Navigation to 'Franchisee Sale Bill ornament report' module");
			reportHelper.onTestFailure(test, "Verify Navigation to 'Franchisee Sale Bill ornament report' module");
		}

		franchiseereportpage.dropdownicon().click();
		genericHelper.sendKeysWithjavascriptExecutor(franchiseereportpage.dropdownLocation(), loaction);
		// franchiseereportpage.dropdownicon().click();
		// franchiseereportpage.radioBranch().click();
		// franchiseereportpage.selectBranch().click();
		franchiseereportpage.btnSelect().click();
		genericHelper.sendKeysWithjavascriptExecutor(franchiseereportpage.dropdownProductGroup(), productgroup);
//		String fromDateStr = getValueOrDefault(masterDto.getAttributeValue(fromdate));
//		String formattedFromDate = formatDate(fromDateStr, "MM/dd/yyyy", "MM/dd/yyyy"); 
//		if (!formattedFromDate.isEmpty()) {
//		    genericHelper.clearAndSendKeysAndEnter(franchiseereportpage.datepickerFroamDate(), formattedFromDate);
//		    reportHelper.generateLog(test, "FROMDATE : " + formattedFromDate);
//		    reportHelper.generateLogWithScreenshot(test, "FROMDATE Entered");
//		}
//
//		String toDateStr = getValueOrDefault(masterDto.getAttributeValue(todate));
//		String formattedToDate = formatDate(toDateStr, "MM/dd/yyyy", "MM/dd/yyyy"); 
//		if (!formattedToDate.isEmpty()) {
//		    genericHelper.clearAndSendKeysAndEnter(franchiseereportpage.datepickerToDate(), formattedToDate);
//		    reportHelper.generateLog(test, "TODATE : " + formattedToDate);
//		    reportHelper.generateLogWithScreenshot(test, "TODATE Entered");
//		}

		genericHelper.sendKeysWithjavascriptExecutor(franchiseereportpage.datepickerFroamDate(), fromdate);
		genericHelper.sendKeysWithjavascriptExecutor(franchiseereportpage.datepickerToDate(), todate);

		genericHelper.clickWithJavascriptExecutor(franchiseereportpage.btnOk());
		franchiseereportpage.btnEport().click();
		franchiseereportpage.btnExcel().click();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Downloads\\"); 
		prefs.put("download.prompt_for_download", false);
		prefs.put("download.directory_upgrade", true);
		prefs.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", prefs);

//		genericHelper.actions.sendKeys(Keys.ENTER).build().perform();
	}

}
