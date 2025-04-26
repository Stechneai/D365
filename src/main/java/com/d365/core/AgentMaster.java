package com.d365.core;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;


import com.d365.utils.MasterClass;

public class AgentMaster extends MasterClass {
	
	public void addAgent() throws InterruptedException, IOException
	{
		String agentc = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Agent Code"), "");
		String agentn = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Agent Name"), "");
		String agentt = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Agent Type"), "");
		String vendora = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Vendor Accout"), "");
		String storei = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Store Id"), "");
		

//		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickModule());
//		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickJewellery());
//		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickAgentMaster());
//		

		
		//genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickNew());
		
		
		genericHelper.clearAndSendKeysAndEnter(agentmasterpage.enterAgentCode(), agentc);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(agentmasterpage.enterAgentName(), agentn);
		genericHelper.clearAndSendKeysAndEnter(agentmasterpage.enterAgentType(), agentt);
		Thread.sleep(2000);
		genericHelper.clearAndSendKeysAndEnter(agentmasterpage.enterVendorAccount(), vendora);
		Thread.sleep(4000);
		genericHelper.clearAndSendKeysAndEnter(agentmasterpage.enterStoreId(), storei);
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickActive());
		Thread.sleep(2000);
		
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.clickSave());
	}
	
}
