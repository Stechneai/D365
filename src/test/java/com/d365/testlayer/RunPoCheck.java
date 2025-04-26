package com.d365.testlayer;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class RunPoCheck extends MasterClass
{
	@Test (groups = {"Add"})
    public void verifyPoCheck() throws InvalidFormatException, IOException, InterruptedException
    {
        login();  
	
	
	for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "ProvisionalparcelToPO.xlsx",
			"Sheet3"); rowIndex++)  
	{
		Map<String, String> orderData = excelHelper
				.readExcelDataAndMap(excelPath + "ProvisionalparcelToPO.xlsx", "Sheet3", rowIndex);
		for (Map.Entry<String, String> entry : orderData.entrySet())
		{
			masterDto.setAttribute(entry.getKey(), entry.getValue());
		}
		 
		
		try 
		{
			poCheck.addPocheckData(); 
			checkNotificationPresenceAndHandle(masterDto); 
			
		} catch (Exception e) 
		{
			System.out.println("Exeption Occur in Code Run");
			getResults(masterDto);
		}
		
	
}
}
}