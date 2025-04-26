package com.d365.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class NavigateToPage extends MasterClass{

	public NavigateToPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void billTypeMasterPage(WebDriver driver) throws InterruptedException
	{ 
		genericHelper.scrollingTillWebElement(homePage.billCheckingMaster());
		homePage.billCheckingMaster().click();
		Thread.sleep(1000); 

		genericHelper.scrollingTillWebElement(homePage.vendorMaster());
		Thread.sleep(1000);
		homePage.billTypeMaster().click();
	}
	
	public void approvalSettingsPage() throws InterruptedException
	{
		try {

			homePage.billCheckingTransaction().click();
			Thread.sleep(1000); 

		} catch (Exception e) {
			genericHelper.scrollingTillWebElement(homePage.billCheckingMaster());
			Thread.sleep(1000); 

			homePage.billCheckingMaster().click();
			Thread.sleep(1000); 

			genericHelper.scrollingTillWebElement(homePage.approvalSettings());
			Thread.sleep(1000);
			homePage.approvalSettings().click();
			Thread.sleep(1000); 
		}
	}
	
	public void billCheckingTransactionPage() throws InterruptedException
	{
		try {

			homePage.billCheckingTransaction().click();
			Thread.sleep(1000); 

		} catch (Exception e) {
			genericHelper.scrollingTillWebElement(homePage.billCheckingMaster());
			Thread.sleep(1000); 

			homePage.billCheckingMaster().click();
			Thread.sleep(1000); 

			genericHelper.scrollingTillWebElement(homePage.approvalSettings());
			Thread.sleep(1000);
			homePage.billCheckingTransaction().click();
			Thread.sleep(1000); 
		}
	}
	
	public void billPaymentsPage() throws InterruptedException
	{
		try {

			homePage.billPayment().click();
			Thread.sleep(1000); 

		} catch (Exception e) {
			genericHelper.scrollingTillWebElement(homePage.billCheckingMaster());
			Thread.sleep(1000); 

			homePage.billCheckingMaster().click();
			Thread.sleep(1000); 

			genericHelper.scrollingTillWebElement(homePage.approvalSettings());
			Thread.sleep(1000);
			homePage.billPayment().click();
			Thread.sleep(1000);
		}
	}
}
