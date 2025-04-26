package com.d365.core;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class DesignCodeMaster extends MasterClass {

	public String designCode;
	public String itemId;
	public String configuration;
	public String status;

	public void adddesigncodeMasterData(MasterDto masterDto)
			throws IOException, InterruptedException, InvalidFormatException {

		designCode = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Design Code"), "");
		itemId = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Item Id"), "");
		configuration = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Configuration"), "");
		status = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Status"), "");

		genericHelper.clickWithJavascriptExecutor(commonFields.btnNew());
		genericHelper.sendKeysWithjavascriptExecutor(designCodeMasterPage.txtDesignCode(), designCode);
		genericHelper.sendKeysWithjavascriptExecutor(designCodeMasterPage.txtItemID(), itemId);
		genericHelper.sendKeysWithjavascriptExecutor(designCodeMasterPage.txtConfiguration(), configuration);
		genericHelper.sendKeysWithjavascriptExecutor(designCodeMasterPage.txtStatus(), status);

		genericHelper.clickWithJavascriptExecutor(designCodeMasterPage.btnSave());
		genericHelper.clickWithJavascriptExecutor(designCodeMasterPage.btnReleased());
		
			String actualconfiguration = designCodeMasterPage.txtConfiguration().getAttribute("value");
			System.out.println("actualdesigncode is" + actualconfiguration);
//			reportHelper.performAssert(test, "Design Code", actualconfiguration, designCode);
		}
	

}
