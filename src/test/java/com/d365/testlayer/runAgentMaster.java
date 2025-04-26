package com.d365.testlayer;

import java.util.Map;

import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runAgentMaster extends MasterClass{
	@Test
	public void newAgent() throws InterruptedException, Exception {
		loginPage(driver, username, password);
		
		//navigateToPage(agentmasterpage.clickJewellery(), agentmasterpage.clickAgentMaster());
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickModule());
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickJewellery());
		test = reportHelper.createTestCase(test, extentReports, masterDto);
		
//		if(agentmasterpage.clickAgentMaster().isDisplayed())
//		{
//			reportHelper.onTestSuccess(test, "TC_01 --> TC_01-->Agent module should be Visible as per Below Path"+"Module --> Jewellery --> Agent Master");
//			reportHelper.generateLogFullScreenSS(test, "TC_01-->Agent module should be Visible as per Below Path\"+\"Module --> Jewellery --> Agent Master ");
//		}
//		else
//		{
//			reportHelper.onTestFailure(test, "TC_01-->Agent Master module should be Visible is not displayed as per Below Path"+ "Module --> Jewellery --> Agent Master");
//			reportHelper.generateLogFullScreenSS(test, "TC_01-->Agent Master module should be Visible is not displayed as per Below Path"+"Module --> Jewellery --> Agent Master");
//		}
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickAgentMaster());
		
		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on Agent Master");
		
		
		

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
