
package com.d365.core;

import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.AWTException;

import org.openqa.selenium.Keys;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class BulkTag extends MasterClass {
	
	public void bulktagGO(MasterDto masterDto) throws InterruptedException, IOException, InvalidFormatException, AWTException {

		// Retrieve the file path and file name for the upload

		String filePath = "D:\\Workspace\\Dynamics365\\public\\data\\";

		String fileName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FileName"), "");

		// Click actions to navigate to the file upload interface

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnSelect());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnBulkImport());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnUploadFile());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnBrowse());

		genericHelper.actions.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);

		try {

			// Execute the AutoIt script and pass the file path and file name as separate

			// arguments

			String autoItExecutablePath = "bulkUpload.exe";

			String command = autoItExecutablePath + " \"" + filePath + "\" \"" + fileName + "\"";

			Runtime.getRuntime().exec(command);

			System.out.println("AutoIt script executed successfully.");

		} catch (IOException e) {

			e.printStackTrace();

			throw new IOException("Failed to execute AutoIt script for file upload.");

		}
	}
	

	public void bulktagallitemDelete(MasterDto masterDto) throws InterruptedException, IOException, InvalidFormatException, AWTException {

		// Retrieve the file path and file name for the upload

		String filePath = "D:\\Workspace\\Dynamics365\\public\\data\\";

		String fileName = StringUtils.defaultIfBlank(masterDto.getAttributeValue("FileName"), "");

		// Click actions to navigate to the file upload interface

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnSelect());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnBulkImport());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnUploadFile());

		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnBrowse());

		genericHelper.actions.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);

		try {

			// Execute the AutoIt script and pass the file path and file name as separate

			// arguments

			String autoItExecutablePath = "C:\\Users\\Vaishnavi\\Downloads\\Dynamics365 (6)\\Dynamics365\\public\\data\\bulkUpload.exe";

			String command = autoItExecutablePath + " \"" + filePath + "\" \"" + fileName + "\"";

			Runtime.getRuntime().exec(command);

			System.out.println("AutoIt script executed successfully.");

		} catch (IOException e) {

			e.printStackTrace();

			throw new IOException("Failed to execute AutoIt script for file upload.");

		}
		genericHelper.clickWithJavascriptExecutor(bulkTagPage.btnDelete());
//		checkNotificationPresenceAndHandle();

	}
	

}
