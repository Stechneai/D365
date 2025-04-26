package com.d365.core;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.sharedutils.GenericHelper;

public class JobWorkMaster extends MasterClass {


	public void adddata() throws InterruptedException, AWTException, IOException, InvalidFormatException {

		// Vendor Code
		try {
			
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterVendorCode(),
				getValueOrDefault(masterDto.getAttributeValue("Vend Code / Group Code")));
		Thread.sleep(1000);
		// Item ID
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterItemID(),
				getValueOrDefault(masterDto.getAttributeValue("Item Id")));
		Thread.sleep(1000); 
		// Category
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterCategory(),
				getValueOrDefault(masterDto.getAttributeValue("Category")));
		Thread.sleep(1000);
		// Weight Details
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterFromWeight(),
				getValueOrDefault(masterDto.getAttributeValue("From Weight")));
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterToWeight(),
				getValueOrDefault(masterDto.getAttributeValue("To Weight")));
		Thread.sleep(1000);

		// Making Type
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterMakingType(),
				getValueOrDefault(masterDto.getAttributeValue("Making Type")));
		Thread.sleep(1000);

		// Offset Ledger
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterOffsetLeadger(),
				getValueOrDefault(masterDto.getAttributeValue("Offset Ledger Dimension")));

		// From Date and To Date
		//genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());

		
		String fromDateStr = getValueOrDefault(masterDto.getAttributeValue("From Date"));
		String toDateStr = getValueOrDefault(masterDto.getAttributeValue("To Date"));

		// Safely handle null/empty dates
		String formattedFromDate = (fromDateStr != null && !fromDateStr.trim().isEmpty()) ? formatDate(fromDateStr) : "";
		String formattedToDate = (toDateStr != null && !toDateStr.trim().isEmpty()) ? formatDate(toDateStr) : "";

		System.out.println("formattedFromDate :"+formattedFromDate);
		System.out.println("formattedToDate :"+formattedToDate);

		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromDate(), formattedFromDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		

		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToDate(), formattedToDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();

		// Purity Details
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());
		genericHelper.actions.sendKeys(Keys.TAB);
		
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromPurity(),
				getValueOrDefault(masterDto.getAttributeValue("From Purity")));
		
		genericHelper.actions.sendKeys(Keys.TAB);
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToPurity(),
				getValueOrDefault(masterDto.getAttributeValue("To Purity")));

		// Save Action
		genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickSave());
		
		} catch (Exception e) {
			System.out.println("Issue : "+e.getMessage());
		}

	}

	public static String convertExcelSerialDate(double excelDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(1900, Calendar.JANUARY, 1); // Excel starts counting from 1900-01-01
		calendar.add(Calendar.DATE, (int) excelDate - 2); // Excel offset (leap year bug)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}

// Method to format any date string to "MM/dd/yyyy"
	public static String formatDate(String dateStr) {
		String targetFormat = "MM/dd/yyyy"; // Desired output format

		try {
			if (dateStr.matches("\\d+(\\.0)?")) { // Check if it's an Excel serial date
				dateStr = convertExcelSerialDate(Double.parseDouble(dateStr));
			}
			SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat desiredFormat = new SimpleDateFormat(targetFormat);
			Date date = originalFormat.parse(dateStr);
			return desiredFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public void deletedata() throws InterruptedException, AWTException, IOException, InvalidFormatException {

		// Vendor Code
		try {
			
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterVendorCode(),
				getValueOrDefault(masterDto.getAttributeValue("Vend Code / Group Code")));
		Thread.sleep(1000);
		// Item ID
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterItemID(),
				getValueOrDefault(masterDto.getAttributeValue("Item Id")));
		Thread.sleep(1000); 
		// Category
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterCategory(),
				getValueOrDefault(masterDto.getAttributeValue("Category")));
		Thread.sleep(1000);
		// Weight Details
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterFromWeight(),
				getValueOrDefault(masterDto.getAttributeValue("From Weight")));
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterToWeight(),
				getValueOrDefault(masterDto.getAttributeValue("To Weight")));
		Thread.sleep(1000);

		// Making Type
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterMakingType(),
				getValueOrDefault(masterDto.getAttributeValue("Making Type")));
		Thread.sleep(1000);

		// Offset Ledger
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterOffsetLeadger(),
				getValueOrDefault(masterDto.getAttributeValue("Offset Ledger Dimension")));

		// From Date and To Date
		//genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());

		
		String fromDateStr = getValueOrDefault(masterDto.getAttributeValue("From Date"));
		String toDateStr = getValueOrDefault(masterDto.getAttributeValue("To Date"));

		// Safely handle null/empty dates
		String formattedFromDate = (fromDateStr != null && !fromDateStr.trim().isEmpty()) ? formatDate(fromDateStr) : "";
		String formattedToDate = (toDateStr != null && !toDateStr.trim().isEmpty()) ? formatDate(toDateStr) : "";

		System.out.println("formattedFromDate :"+formattedFromDate);
		System.out.println("formattedToDate :"+formattedToDate);

		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromDate(), formattedFromDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		

		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToDate(), formattedToDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();

		// Purity Details
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());
		genericHelper.actions.sendKeys(Keys.TAB);
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromPurity(),
				getValueOrDefault(masterDto.getAttributeValue("From Purity")));
		
		genericHelper.actions.sendKeys(Keys.TAB);
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToPurity(),
				getValueOrDefault(masterDto.getAttributeValue("To Purity")));

		// Save Action
		genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.delete());
		
		} catch (Exception e) {
			System.out.println("Issue : "+e.getMessage());
		}

	}

	public void editdata() throws InterruptedException, AWTException, IOException, InvalidFormatException {

		// Vendor Code
		try {
			genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.edit());
			genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.edit());
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterVendorCode(),
				getValueOrDefault(masterDto.getAttributeValue("Vend Code / Group Code")));
		Thread.sleep(1000);
		// Item ID
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterItemID(),
				getValueOrDefault(masterDto.getAttributeValue("Item Id")));
		Thread.sleep(1000); 
		// Category
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterCategory(),
				getValueOrDefault(masterDto.getAttributeValue("Category")));
		Thread.sleep(1000);
		// Weight Details
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterFromWeight(),
				getValueOrDefault(masterDto.getAttributeValue("From Weight")));
		Thread.sleep(1000);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterToWeight(),
				getValueOrDefault(masterDto.getAttributeValue("To Weight")));
		Thread.sleep(1000);

		// Making Type
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterMakingType(),
				getValueOrDefault(masterDto.getAttributeValue("Making Type")));
		Thread.sleep(1000);

		// Offset Ledger
		genericHelper.clearAndSendKeysWithJavascriptExecutor(jobWorkMasterPage.enterOffsetLeadger(),
				getValueOrDefault(masterDto.getAttributeValue("Offset Ledger Dimension")));

		// From Date and To Date
		//genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());

		
		String fromDateStr = getValueOrDefault(masterDto.getAttributeValue("From Date"));
		String toDateStr = getValueOrDefault(masterDto.getAttributeValue("To Date"));

		// Safely handle null/empty dates
		String formattedFromDate = (fromDateStr != null && !fromDateStr.trim().isEmpty()) ? formatDate(fromDateStr) : "";
		String formattedToDate = (toDateStr != null && !toDateStr.trim().isEmpty()) ? formatDate(toDateStr) : "";

		System.out.println("formattedFromDate :"+formattedFromDate);
		System.out.println("formattedToDate :"+formattedToDate);

		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterFromDate());
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromDate(), formattedFromDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();
		

		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToDate(), formattedToDate);
		genericHelper.actions.sendKeys(Keys.TAB);
//		driver.findElement(By.xpath("(//h1)[2]")).click();

		// Purity Details
		genericHelper.scrollingTillWebElement(jobWorkMasterPage.enterToPurity());
		genericHelper.actions.sendKeys(Keys.TAB);
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterFromPurity(),
				getValueOrDefault(masterDto.getAttributeValue("From Purity")));
		
		genericHelper.actions.sendKeys(Keys.TAB);
		genericHelper.clearAndsendKeysAndEnter(jobWorkMasterPage.enterToPurity(),
				getValueOrDefault(masterDto.getAttributeValue("To Purity")));

		// Save Action
		genericHelper.clickWithJavascriptExecutor(jobWorkMasterPage.clickSave());
		
	
		} catch (Exception e) {
			System.out.println("Issue : "+e.getMessage());
		}

	}
}
