package com.d365.testlayer;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunProvisionalParcel extends MasterClass
{

	@Test (groups = {"Add"})
	public void addProvisionalParcel() throws InterruptedException, InvalidFormatException, AWTException, IOException
	{
		login();    
		
	
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Provisionalparcel.xlsx",
				"Sheet1"); rowIndex++) 
		{
			
		//	genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.newButton());
					Map<String, String> orderData = excelHelper
					.readExcelDataAndMap(excelPath + "Provisionalparcel.xlsx", "Sheet1", rowIndex);
					
			for (Map.Entry<String, String> entry : orderData.entrySet())
			{
			  masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			 
			 
			try 
			{
				provisionalParcel.addDataProvisionalParcel();
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) 
			{
				getResults(masterDto);
				System.out.println("Exeption Occur in Code Run");
			}
		
		}

	}
	

	
	@Test
	public void validateChallanNo() throws InvalidFormatException, IOException, InterruptedException
	{
		
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "Provisionalparcel.xlsx",
				"Sheet2"); rowIndex++ ) 
		{
					Map<String, String> orderData = excelHelper
					.readExcelDataAndMap(excelPath + "QCProcess.xlsx", "Sheet2", rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet())
			{
			  masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			provisionalParcel.validateChallanNoField();
		
		}
		
	
	}
	
	
	}
	
   
	


