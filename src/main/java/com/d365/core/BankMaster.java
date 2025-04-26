package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import com.d365.utils.MasterClass;

public class BankMaster extends MasterClass {
	
	public void bankMasterData() throws IOException, InterruptedException {
		// Fetching data from masterDto
		String bankName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Bank Name"), "");

		String description = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Description"), "");

		// Adding a new bank master record
		genericHelper.clearAndSendkeysWithActions(bankMasterPage.txtBankName(), bankName);
		reportHelper.generateLog(test, bankName + ": ");
		reportHelper.generateLogWithScreenshot(test, bankName + " INsertrd");
		genericHelper.clearAndSendkeysWithActions(bankMasterPage.txtDescription(), description);
		reportHelper.generateLog(test, " " + description + ": ");
		reportHelper.generateLogWithScreenshot(test, description + " SS");

		genericHelper.clickWithjavascriptExecutor(bankMasterPage.btnSave());
		handleValidationBM();
	}

	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

	public void deleteBankData() throws IOException, InterruptedException {
		// Fetching data from masterDto
		String bankName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Bank Name"), "");
		String description = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Description"), "");

		// Adding a new bank master record
		genericHelper.sendKeysWithjavascriptExecutor(bankMasterPage.txtBankName(), bankName);
		genericHelper.sendKeysWithjavascriptExecutor(bankMasterPage.txtDescription(), description);
		genericHelper.clickWithjavascriptExecutor(bankMasterPage.btnDelete());
		genericHelper.clickWithjavascriptExecutor(bankMasterPage.btnConfirmDelete());

	}

}
