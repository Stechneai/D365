package com.d365.testlayer;

import java.util.Map;

import com.d365.utils.MasterClass;

public class runItemMaster extends MasterClass {
	
	public void newitemcreation() throws InterruptedException, Exception
	{
		loginPage(driver, username, password);
		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "AgentMasterData.xlsx",
				"Sheet1"); rowIndex++) 
		{ 
			genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickNew());
			
			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "AgentMasterData.xlsx", "Sheet1",
					rowIndex);
			for (Map.Entry<String, String> entry : orderData.entrySet()) 
			{
				masterDto.setAttribute(entry.getKey(), entry.getValue());
			}
			
			test = reportHelper.createTestCase(test, extentReports, masterDto);

		try {
				agentmaster.addAgent();
				checkNotificationPresenceAndHandle(masterDto);
				
					
		}catch(Exception e)
		{
			getResults(masterDto);
			
		}

		}	
	}
	

}
