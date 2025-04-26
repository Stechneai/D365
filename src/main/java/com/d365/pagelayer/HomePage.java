package com.d365.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.d365.utils.MasterClass;

public class HomePage extends MasterClass{
	
//	public static HomePage singleton = new HomePage( );
//
//	   /* A private Constructor prevents any other
//	    * class from instantiating.
//	    */ 
//	   private HomePage() { }
//
//	   /* Static 'instance' method */
//	   public static HomePage getInstance( ) {
//	      return singleton;
//	   }	
	   
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Ticket Management']")
	private WebElement ticketManagement;
	
	public WebElement ticketManagement()
	{
		return ticketManagement;
	}
		
	@FindBy (xpath = "//span[text()='My Tickets']")
	private WebElement myTickets;
	
	public WebElement myTickets()
	{
		return myTickets;
	}
	
	//span[text()='Ticket']
	@FindBy (xpath = "//span[text()='Ticket']")
	private WebElement tickets;
	
	public WebElement tickets()
	{
		return tickets;
	}
	
	@FindBy (xpath = "//span[text()='Create Ticket']")
	private WebElement createTicket;
	
	public WebElement createTicket()
	{
		return createTicket;
	}
	
	@FindBy (xpath = "//span[text()='Reports']")
	private WebElement reports;
	
	public WebElement reports()
	{
		return reports;
	}
	
	@FindBy (xpath = "//a[@href='/TechTicket/Report/ResourcePlanningReport']")
	private WebElement resourcePlanningReport;
	
	public WebElement resourcePlanningReport()
	{
		return resourcePlanningReport;
	}
	
	@FindBy (xpath = "//span[text()='Dashboard']")
	private WebElement dashboard;
	
	public WebElement dashboard()
	{
		return dashboard;
	}
	
	//span[text()='Bill Checking Master']
	//@FindBy (xpath = "//span[text()='Bill Checking']")
	@FindBy (xpath = "//span[contains(text(),'Bill Checking')]")
	private WebElement billCheckingMaster;
	
	public WebElement billCheckingMaster() 
	{
		return billCheckingMaster;
	}
	 
	//a[@href='/TechTicketDummy/vendorMaster']
	///html/body/div/div/div[1]/div/ul[1]/li[10]/ul/li[1]/a/span
	@FindBy (xpath = "//span[text()='Vendor Master']")
	private WebElement vendorMaster;
	
	public WebElement vendorMaster()
	{
		return vendorMaster;
	}
	
	
	@FindBy (xpath = "//span[text()='Bill Checking Transaction']")
	private WebElement billCheckingTransaction;
	
	public WebElement billCheckingTransaction()
	{
		return billCheckingTransaction;
	}
	
	//span[text()='Master']
	@FindBy (xpath = "//span[text()='Master']")
	private WebElement master;
	
	public WebElement master()
	{
		return master;
	}
	
	//span[text()='Master']
	@FindBy (xpath = "//a[@href='/TechTicketDummy/User']")
	private WebElement userMaster;
	
	public WebElement userMaster()
	{
		return userMaster;
	}	
	
	
	@FindBy (xpath = "//button[text()='Unpassed Ticket']")
	private WebElement unpassedTicket;
	
	public WebElement unpassedTicket()
	{
		return unpassedTicket;
	}	
	
	@FindBy (xpath = "//div[@class='notifications dropdown']")
	private WebElement notificationBtn;
	
	public WebElement notificationBtn()
	{
		return notificationBtn;
	}
	
	@FindBy (xpath = "//span[text()='Approval Settings']")
	private WebElement approvalSettings;
	
	public WebElement approvalSettings()
	{
		return approvalSettings;
	}
	
	////i[contains(text(),'Bill Type Master')]  
	@FindBy (xpath = "//span[text()='Bill Type Master']")
	private WebElement billTypeMaster;
	
	public WebElement billTypeMaster()
	{
		return billTypeMaster;
	}
	
	@FindBy (xpath = "//span[text()='Bill Payments']")
	private WebElement billPayment;
	
	public WebElement billPayment()
	{
		return billPayment;
	}
	
	@FindBy (xpath = "//span[text()='Payment Template Master']")
	private WebElement paymentTemplateMaster;
	
	public WebElement paymentTemplateMaster()
	{
		return paymentTemplateMaster;
	}
	
	
	@FindBy (xpath = "//a[text()=' Assigned Person']")
	private WebElement assignedPersonAction;
	
	public WebElement assignedPersonAction()
	{
		return assignedPersonAction;
	}
	
	@FindBy (xpath = "//a[contains(text(),' View')]")
	private WebElement viewAction;
	
	public WebElement viewAction()
	{
		return viewAction;
	}
	
	@FindBy (xpath = "//span[text()='Country Master']")
	private WebElement countryMaster;
	
	public WebElement countryMaster()
	{
		return countryMaster;
	}
	
	
}
