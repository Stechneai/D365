package com.d365.utils;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.d365.core.Rng;
import com.d365.core.Transfer;
import com.d365.core.TransferOrder;
import com.d365.core.TransferOrderReceipt;
import com.d365.core.TransferReceipt;
import com.d365.pagelayer.RngPage;
import com.d365.pagelayer.TransferOrderPage;
import com.d365.pagelayer.TransferOrderPageLot;
import com.d365.pagelayer.TransferOrderReceiptPage;
import com.d365.pagelayer.TransferPage;
import com.d365.pagelayer.TransferReceiptPage;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pos.core.CardReceipt;
import com.pos.pagelayer.CardReceiptPage;
import com.pos.pagelayer.CommonFieldsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.d365.core.AgentMaster;
import com.d365.core.AllSalesOrderLot;
import com.d365.core.BatchRegistration;
import com.d365.core.CustomerOrder;
import com.d365.core.CustomerOrderRepair;
import com.d365.core.ItemTypeMaster;
import com.d365.core.MonthlySavingSchemeDefaulterList;
//import com.d365.core.ItemMaster;
import com.d365.core.OfflineTagging;
import com.d365.core.PDCReport;
import com.d365.core.PoCheck;
import com.d365.core.ProvisionalParcel;
import com.d365.core.ReprintingOfLabel;
import com.d365.pagelayer.AgentMasterPage;
import com.d365.pagelayer.AllSalesOrderPageLot;
import com.d365.pagelayer.AllTagPage;
import com.d365.pagelayer.AllTagPagesLot;
import com.d365.pagelayer.BatchRegistrationPages;
import com.d365.pagelayer.CommonFields;
import com.d365.pagelayer.CustomerOrderPage;
import com.d365.pagelayer.CustemerOrderPosPage;
import com.d365.pagelayer.CustomerOrderRepairPage;
import com.d365.pagelayer.HomePage;
import com.d365.pagelayer.ItemMasterPage;
import com.d365.pagelayer.ItemTypeMasterPage;
import com.d365.pagelayer.LoginPage;
import com.d365.pagelayer.MonthlySavingSchemeDefaulterListPage;
import com.d365.pagelayer.OfflineTaggingPage;
import com.d365.pagelayer.OfflineTaggingPageLot;
import com.d365.pagelayer.OnHandListPageLot;
import com.d365.pagelayer.PDCReportPage;
import com.d365.pagelayer.PendingVendorInvoicesPage;
import com.d365.pagelayer.PoCheckPage;
import com.d365.pagelayer.PostProductReceiptPage;
import com.d365.pagelayer.ProvisionalParcelPage;
import com.d365.pagelayer.PurchaseOrderPageObject;
import com.d365.pagelayer.ReprintingOfLabelPage;
import com.sharedutils.ExcelHelper;
import com.sharedutils.GenericHelper;
import com.sharedutils.MasterDto;
import com.sharedutils.PropertyHelper;
import com.sharedutils.ReportsHelper;
import com.sharedutils.ScreenShotHelper;

public class ProjectFunctions implements ProjectConstants {

	public GenericHelper genericHelper = new GenericHelper();
	public ExcelHelper excelHelper = new ExcelHelper();
	public PropertyHelper propertyHelper = new PropertyHelper();
	public ReportsHelper reportHelper = new ReportsHelper();
	public ScreenShotHelper ssHelper = new ScreenShotHelper();
	public static MasterDto masterDto = new MasterDto();

	public static ExtentReports extentReports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static XSSFSheet sheet;

	public static Rng rng;
	public static RngPage rngpage;
	public static AllTagPage alltagpage;
	public static ItemTypeMasterPage itemTypeMasterPage;

	public static AgentMaster agentmaster;
	public static AgentMasterPage agentmasterpage;
	public SoftAssert softAssert = new SoftAssert();

	protected static boolean isLoggedIn = false;

//	public static CountryMasterPage countryMasterPage;

	public static HomePage homePage;
	public static CommonFields commonFields;

	public static LoginPage loginPage;
	public static WebDriverWait wait;
	public static CustomerOrderRepair customerOrderRepair;
	public static CustomerOrderRepairPage customerOrderRepairPage;
	public static CustemerOrderPosPage customerOrderPos;
	public static Actions actions;
	public static PurchaseOrderPageObject purchaseOrder;

	public static CustomerOrder customerOrder;
	public static CustomerOrderPage customerOrderPage;
	public static OfflineTaggingPage offlineTaggingPage;
	public static OfflineTaggingPageLot offlinetaggingpagelot;
	public static OfflineTagging offlineTagging;
	public static AllTagPagesLot alltagpageslot;
	public static TransferOrderPageLot transferorderpagelot;
	public static AllSalesOrderPageLot allsalesorderpagelot;
	public static AllSalesOrderLot allsalesorderlot;
	public static OnHandListPageLot onhandlistpagelot;
	public static PoCheck poCheck;
	public static PoCheckPage poCheckPage;
	public static ProvisionalParcel provisionalParcel;
	public static ProvisionalParcelPage provisionalParcelPage;
	public static BatchRegistrationPages batchRegistrationPages;
	public static BatchRegistration batchRegistration;
	public static PostProductReceiptPage postproductreceiptpage;

	public static PendingVendorInvoicesPage pendingVendorInvoicesPage;
	public static PDCReport pdcReport;
	public static PDCReportPage pdcReportPage;

	public static ItemTypeMaster itemTypeMaster;
	public static ReprintingOfLabel reprintingoflabel;
	public static ReprintingOfLabelPage reprintingoflabelpage;
	public static MonthlySavingSchemeDefaulterList monthlySavingSchemeDefaulterList;
	public static MonthlySavingSchemeDefaulterListPage monthlySavingSchemeDefaulterListPage;
	public static TransferOrderPage transferOrderPage;
	public static TransferPage transferPage;
	public static Transfer transfer;
	public static TransferOrder transferOrder;
	public static AllTagPage allTagPage;
	public static CardReceipt cardReceipt;
	public static CardReceiptPage cardReceiptPage;
	public static TransferReceipt transferReceipt;
	public static TransferReceiptPage transferReceiptPage;
	public static TransferOrderReceipt transferOrderReceipt;
	public static TransferOrderReceiptPage transferOrderReceiptPage;
	
	

	public void pageInitialiazation(WebDriver driver) {

		homePage = new HomePage(driver);
		commonFields = new CommonFields();
		loginPage = new LoginPage();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		customerOrderRepair = new CustomerOrderRepair();
		customerOrderRepairPage = new CustomerOrderRepairPage();
		customerOrderPos = new CustemerOrderPosPage();
		purchaseOrder = new PurchaseOrderPageObject();
		rng = new Rng();
		rngpage = new RngPage(driver);
		transferOrderPage = new TransferOrderPage();
		transferPage = new TransferPage();

		agentmaster = new AgentMaster();
		agentmasterpage = new AgentMasterPage();

		customerOrder = new CustomerOrder();
		customerOrderPage = new CustomerOrderPage(driver);
		offlineTaggingPage = new OfflineTaggingPage();
		offlinetaggingpagelot = new OfflineTaggingPageLot();
		transferorderpagelot = new TransferOrderPageLot();
		alltagpageslot = new AllTagPagesLot();
		allsalesorderpagelot = new AllSalesOrderPageLot();
		allsalesorderlot = new AllSalesOrderLot();
		onhandlistpagelot = new OnHandListPageLot();
		poCheck = new PoCheck();
		poCheckPage = new PoCheckPage();
		provisionalParcelPage = new ProvisionalParcelPage();
		provisionalParcel = new ProvisionalParcel();
		batchRegistrationPages = new BatchRegistrationPages();
		postproductreceiptpage = new PostProductReceiptPage();
		pendingVendorInvoicesPage = new PendingVendorInvoicesPage();
		batchRegistration = new BatchRegistration();
		monthlySavingSchemeDefaulterList = new MonthlySavingSchemeDefaulterList();
		monthlySavingSchemeDefaulterListPage = new MonthlySavingSchemeDefaulterListPage();
		offlineTagging = new OfflineTagging();
		itemTypeMasterPage = new ItemTypeMasterPage();
		itemTypeMaster = new ItemTypeMaster();
		reprintingoflabel = new ReprintingOfLabel();
		reprintingoflabelpage = new ReprintingOfLabelPage();
		pdcReport = new PDCReport();
		transfer = new Transfer();
		transferOrder = new TransferOrder();
		pdcReportPage = new PDCReportPage();
		allTagPage = new AllTagPage();
		cardReceipt=new CardReceipt();
		cardReceiptPage=new CardReceiptPage();
		transferReceipt=new TransferReceipt();
		transferReceiptPage=new TransferReceiptPage();
		transferOrderReceipt=new TransferOrderReceipt();
		transferOrderReceiptPage=new TransferOrderReceiptPage();
		
		
		SoftAssert softAssert = new SoftAssert();
		actions = new Actions(driver);

	}

	public void loginPage(WebDriver driver2, String username, String password) throws InterruptedException, Exception {

		if (!isLoggedIn) {

			String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

			genericHelper.insertDataIntoField(loginPage.enterEmail(), username);
			loginPage.nextBtn().click();
			Thread.sleep(3000);
			genericHelper.insertDataIntoField(loginPage.enterPwd(), password);
			loginPage.signInBtn().click();
			loginPage.yesBtn().click();
			try {

				test.pass("<b>Uname : " + username + "<br />Password : " + password + "<b/>");
				reportHelper.onTestSuccess(test, "");

				isLoggedIn = true;

				// onTestFailure("Uname : " +uname+ " Password : "+password+ " : "+msg);
			} catch (Exception e) {
//				String msg = driver.findElement(By.xpath("//div[@class='Toastify__toast-body' and @role='alert']/div"))
//						.getText();
//				test.fail(msg);
//				test.fail("<b>Uname : " + u	sern+ame + "<br />Password : " + password + "<b/>");
//
//				reportHelper.generateLog(test, "");
			}
		}
	}

	public void login() throws InterruptedException {

		driver.findElement(By.id("i0116")).sendKeys(username);
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.xpath("//input[contains(@name,\"pass\")]")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,\"idSIB\")]")).click();
		driver.findElement(By.xpath("//input[contains(@id,\"idBt\")]")).click();
	}
//	public void logoutPage(WebDriver driver) throws InterruptedException, Exception {
//	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(50));
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//img[@alt='profile'])[1]"))));
//	Thread.sleep(2500);
//
//	js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//
//	driver.findElement(By.xpath("(//img[@alt='profile'])[1]")).click();
//	Thread.sleep(2500);
//
//	driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
//	Thread.sleep(2500);
//
//	reportHelper.onTestSuccess(test, "<b>Logged Out successfully<b/>");
//}

	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

	/*
	 * public void saveOrderAndHandleErrors() throws InterruptedException,
	 * IOException {
	 * genericHelper.clickWithjavascriptExecutor(customerOrder.saveButton());
	 * Thread.sleep(1000); try { if (customerOrder.errorCloseButton().isDisplayed())
	 * { customerOrder.errorCloseButton().click(); Thread.sleep(1000); try {
	 * customerOrder.errorCloseButton().click(); } catch (Exception e) {
	 * System.err.println("" + e); } handleNotificationOrRefreshPage(); } } catch
	 * (Exception e) { handleNotificationOrRefreshPage(); } }
	 * 
	 * public void handleNotificationOrRefreshPage() throws InterruptedException,
	 * IOException { if (customerOrder.expandNotificationBtn().isDisplayed()) {
	 * genericHelper.clickWithjavascriptExecutor(customerOrder.
	 * notificationOpenButton()); handleValidation(); } else { handleValidation(); }
	 * driver.navigate().refresh(); }
	 * 
	 * public void handleValidation() throws IOException { String expectedMessage =
	 * masterDto.getAttributeValue("Expected message"); String xpathExpression =
	 * "//span[text()=\"" + expectedMessage + "\"]"; try { WebElement
	 * actualMessageWebElement = driver.findElement(By.xpath(xpathExpression));
	 * genericHelper.javascriptExecutor.executeScript(
	 * "arguments[0].scrollIntoView();", actualMessageWebElement); String
	 * actualMessage = actualMessageWebElement.getText();
	 * System.out.println("actualMessage" + actualMessage);
	 * softAssert.assertEquals(actualMessage, expectedMessage, "Validation failed");
	 * reportHelper.onTestSuccess(test,
	 * masterDto.getAttributeValue("Expected message"));
	 * reportHelper.generateLogFullScreenSS(test,
	 * masterDto.getAttributeValue("Expected message")); } catch
	 * (NoSuchElementException e) { reportHelper.onTestFailure(test,
	 * masterDto.getAttributeValue("Error message"));
	 * reportHelper.generateLogFullScreenSS(test,
	 * masterDto.getAttributeValue("Error message")); } catch (AssertionError a) {
	 * reportHelper.onTestFailure(test,
	 * masterDto.getAttributeValue("Error message"));
	 * reportHelper.generateLogFullScreenSS(test,
	 * masterDto.getAttributeValue("Error message")); } }
	 */

	public void navigateToPage(WebElement selectModule, WebElement specificPageElement) throws InterruptedException {
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnModule());
		Thread.sleep(1000);
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", selectModule);
		Thread.sleep(1000);
		genericHelper.clickWithJavascriptExecutor(selectModule);
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnExpandAll());
		genericHelper.clickWithJavascriptExecutor(specificPageElement);
	}

//	public void validateCustomerNo() throws IOException, InterruptedException, InvalidFormatException {
//	genericHelper.clickWithjavascriptExecutor(customerOrder.NewBtn());
//	Map<String, String> orderData = excelHelper
//			.readExcelDataAndMap(excelPath + "customerOrder_TestData_20240131.xlsx", "Sheet1", 1);
//	for (Map.Entry<String, String> entry : orderData.entrySet()) {
//		masterDto.setAttribute(entry.getKey(), entry.getValue());
//	}
//	test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//	genericHelper.clearAndSendKeysAndEnter(customerOrder.Customer_No1(),
//			getValueOrDefault(masterDto.getAttributeValue("Customer No.")));
//
//	reportHelper.generateLog(test, "Customer_No: " + customerOrder.Customer_No1());
//	genericHelper.clickWithjavascriptExecutor(customerOrder.SaveButton());
//
//	saveOrderAndHandleErrors();
//}
//
//public void validateSalePerson() throws IOException, InterruptedException, InvalidFormatException {
//	genericHelper.clickWithjavascriptExecutor(customerOrder.NewBtn());
//	Map<String, String> orderData = excelHelper
//			.readExcelDataAndMap(excelPath + "customerOrder_TestData_20240131.xlsx", "Sheet1", 2);
//	for (Map.Entry<String, String> entry : orderData.entrySet()) {
//		masterDto.setAttribute(entry.getKey(), entry.getValue());
//	}
//	test = reportHelper.createTestCase(test, extentReports, masterDto);
//	genericHelper.clearAndSendKeysAndEnter(customerOrder.Customer_No1(),
//			getValueOrDefault(masterDto.getAttributeValue("Customer No.")));
//	genericHelper.clearAndSendKeysAndEnter(customerOrder.Sales_Person1(),
//			getValueOrDefault(masterDto.getAttributeValue("Sales Person")));
//	test = reportHelper.createTestCase(test, extentReports, masterDto);
//	reportHelper.generateLog(test, "Sale Person: " + customerOrder.Sales_Person1());
//	genericHelper.clickWithjavascriptExecutor(customerOrder.SaveButton());
//
//	saveOrderAndHandleErrors();
//}
//
//public void validateManualOrderField() throws IOException, InterruptedException, InvalidFormatException {
//	genericHelper.clickWithjavascriptExecutor(customerOrder.NewBtn());
//	Map<String, String> orderData = excelHelper
//			.readExcelDataAndMap(excelPath + "customerOrder_TestData_20240131.xlsx", "Sheet1", 3);
//	for (Map.Entry<String, String> entry : orderData.entrySet()) {
//		masterDto.setAttribute(entry.getKey(), entry.getValue());
//	}
//	test = reportHelper.createTestCase(test, extentReports, masterDto);
//	genericHelper.clearAndSendKeysAndEnter(customerOrder.Manual_Order_No1(),
//			getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
//	genericHelper.clearAndSendKeysAndEnter(customerOrder.Manual_Order_No1(),
//			getValueOrDefault(masterDto.getAttributeValue("Manual Order No.")));
//	test = reportHelper.createTestCase(test, extentReports, masterDto);
//	reportHelper.generateLog(test, "Manual Order No." + customerOrder.Manual_Order_No1());
//	genericHelper.clickWithjavascriptExecutor(customerOrder.SaveButton());
//	Thread.sleep(1000);
//	saveOrderAndHandleErrors();
//}

//	public void saveOrderAndHandleErrorsTo() throws InterruptedException, IOException {
//		genericHelper.clickWithjavascriptExecutor(transferorderpage.saveButton());
//		Thread.sleep(1000);
//		try {
//			if (transferorderpage.errorCloseButton().isDisplayed()) {
//				// handle close button error
//				WebElement closePopUpWE = driver
//						.findElement(By.xpath("//div[contains(@id,'SysBoxForm') and contains (@id,'TextGroup')]"));
//				String closePopUpMsg = closePopUpWE.getText();
//				transferorderpage.errorCloseButton().click();
//				Thread.sleep(1000);
////				try {
////					customerOrder.errorCloseButton().click();
////				} catch (Exception e) {
////					System.err.println("" + e);
////				}
//				handleNotificationOrRefreshPageTo();
//			}
//		} catch (Exception e) {
//			handleNotificationOrRefreshPageTo();
//		}
//	}
//
//	public void handleNotificationOrRefreshPageTo() throws InterruptedException, IOException {
//		if (transferorderpage.expandNotificationBtn().isDisplayed()) {
//			genericHelper.clickWithjavascriptExecutor(transferorderpage.notificationOpenButton());
//			handleValidation();
//		} else {
//			handleValidationTo();
//		}
//		driver.navigate().refresh();
//	}
//
//	public void handleValidationTo() throws IOException {
//		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
//		String xpathExpression = "//div[@class='messageBar-messageRegion']";
//
//		// Find all elements that match the XPath
//		List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));
//
//		boolean messageFound = false; // Tracks if the expected message is found
//		boolean incorrectMessageFound = false; // Tracks if an incorrect message is found
//
//		// Loop through each element and compare the text
//		for (WebElement element : elements) {
//			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
//			String actualMessage = element.getText();
//			System.out.println("Actual Message: " + actualMessage);
//
//			if (actualMessage.contains(expectedMessage)) {
//				reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
//				reportHelper.generateLog(test, actualMessage);
//				reportHelper.generateLogFullScreenSS(test, expectedMessage);
//				driver.navigate().refresh();
//			} else {
//				reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
//				reportHelper.generateLog(test, actualMessage);
//				reportHelper.generateLogFullScreenSS(test, actualMessage);
//				driver.navigate().refresh();
//			}
//		}
//	}

//___________________________________________For All Pages__________________________________________________________________//	

//	public void saveOrderAndHandleErrors() throws InterruptedException, IOException {
//		genericHelper.clickWithjavascriptExecutor(customerOrder.saveButton());
//		Thread.sleep(1000);
//		try {
//			if (customerOrder.errorCloseButton().isDisplayed()) {
////				// handle close button error
////				WebElement closePopUpWE = driver
////						.findElement(By.xpath("//div[contains(@id,'SysBoxForm') and contains (@id,'TextGroup')]"));
////				String closePopUpMsg = closePopUpWE.getText();
//				customerOrder.errorCloseButton().click();
//				Thread.sleep(1000);
//				handleNotificationOrRefreshPage();
//			}
//		} catch (Exception e) {
//			handleNotificationOrRefreshPage();
//		}
//	}
//
//	public void handleNotificationOrRefreshPage() throws InterruptedException, IOException {
//		if (customerOrder.expandNotificationBtn().isDisplayed()) {
//			genericHelper.clickWithjavascriptExecutor(customerOrder.notificationOpenButton());
//			handleValidation();
//		} else {
//			handleValidation();
//		}
//		driver.navigate().refresh();
//	}
//
//	public void handleValidation() throws IOException {
//		String expectedMessage = masterDto.getAttributeValue("Expected Message");
//		String xpathExpression = "//div[@class='messageBar-messageRegion']";
//
//		try {
//			// Find all elements that match the XPath
//			List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));
//
//			boolean messageFound = false; // Tracks if the expected message is found
//			boolean incorrectMessageFound = false; // Tracks if an incorrect message is found
//
//			// Loop through each element and compare the text
//			for (WebElement element : elements) {
//				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
//				String actualMessage = element.getText();
//				System.out.println("Actual Message: " + actualMessage);
//
//				if (actualMessage.contains(expectedMessage)) {
//					// Log success and take a screenshot
//					reportHelper.onTestSuccess(test,
//							"Expected : " + expectedMessage + "and Actual Message: " + actualMessage);
//					reportHelper.generateLogFullScreenSS(test, expectedMessage);
//					messageFound = true;
//					break; // Stop the loop once the expected message is found
//				} else {
//					incorrectMessageFound = true; // Mark as incorrect if the message doesn't match
//				}
//			}
//
//			// Check results after the loop
//			if (!messageFound) {
//				String logMessage;
//				if (incorrectMessageFound) {
//					logMessage = "Expected Message: '" + expectedMessage + "' +actualMessage";
//					reportHelper.generateLog(test, logMessage);
//					reportHelper.generateLogWithScreenshot(test, logMessage);
//				} else {
//					logMessage = "No notifications found. Expected Message: '" + expectedMessage + "'";
//					reportHelper.generateLog(test, logMessage);
//					reportHelper.generateLogWithScreenshot(test, logMessage);
//				}
//				reportHelper.onTestFailure(test, logMessage);
//			}
//
//		} catch (NoSuchElementException e) {
//			reportHelper.generateLog(test, "Exception: " + e.getMessage());
//			reportHelper.generateLogWithScreenshot(test, "Exception: " + e.getMessage());
//		} catch (AssertionError a) {
//			reportHelper.generateLog(test, "AssertionError: " + a.getMessage());
//			reportHelper.generateLogWithScreenshot(test, "AssertionError: " + a.getMessage());
//		}
//	}

	public void navigateToPage(WebElement moduleSelector, WebElement modulePageElement, WebElement elementOfPage)
			throws InterruptedException, IOException {
		// Click to open the modules
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.modules());
		Thread.sleep(1000); // Wait for the modules to load

		// Scroll to the module selector and click it
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", moduleSelector);
		Thread.sleep(1000);
		genericHelper.clickWithJavascriptExecutor(moduleSelector);

		// Expand all if necessary
		genericHelper.clickWithJavascriptExecutor(customerOrderPage.expandAll());

		// Click on the specific module page element
		genericHelper.clickWithJavascriptExecutor(modulePageElement);
		Thread.sleep(3000);
		// Check if the specified element is displayed
		if (elementOfPage.isDisplayed()) {
			reportHelper.generateLogWithScreenshot(test, "Navigate to page successfully");
		} else {
			reportHelper.generateLogWithScreenshot(test, "Navigate to page failed.");
		}
	}

	public void enterDataIntoField(WebElement element, String fieldName, MasterDto masterDto)
			throws IOException, InterruptedException {
		// Enter data into the specified field
		enterData(element, fieldName);

	}

	public void enterData(WebElement field, String attribute) throws InterruptedException, IOException {
//		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", field);
		genericHelper.clearAndSendKeysAndEnter(field, getValueOrDefault(masterDto.getAttributeValue(attribute)));
//		reportHelper.generateLog(test, attribute + ": " + field);
		// reportHelper.generateLogWithScreenshot(test, attribute + " SS");
		Thread.sleep(3000);
	}

	public void enterDataAddLine(WebElement field, String attribute, MasterDto masterDto)
			throws InterruptedException, IOException {
		genericHelper.clearAndSendKeysAndEnter(field, getValueOrDefault(masterDto.getAttributeValue(attribute)));
		Thread.sleep(3000);
	}

	// Helper method to dynamically locate a field by rowIndex
	private WebElement getFieldByRowIndexAddLine(int rowIndex) {
		String dynamicXPath = "[" + rowIndex + "]";
		return driver.findElement(By.xpath(dynamicXPath));
	}

	public static String formatDate(String dateStr, String fromFormat, String toFormat)
			throws java.text.ParseException {
		SimpleDateFormat originalFormat = new SimpleDateFormat(fromFormat);
		SimpleDateFormat targetFormat = new SimpleDateFormat(toFormat);
		try {
			Date date = (Date) originalFormat.parse(dateStr);
			return targetFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void getResults(MasterDto masterDto) throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();

		try {

			WebElement invalidMsg = agentmasterpage.invalidErrorMsg();
			WebElement duplicateErrorMsg = agentmasterpage.duplicateErrorMsg();
			WebElement duplicateErrorMsg1 = agentmasterpage.invalidErrorMsg1();

			if (invalidMsg.isDisplayed() || duplicateErrorMsg1.isDisplayed()) {
				handleInvalidMessage(masterDto);
			} else if (duplicateErrorMsg.isDisplayed()) {
				handleDuplicateMessage(duplicateErrorMsg, expectedMessage);
			} else {
				handleInvalidMessage(masterDto);
			}

		} catch (NoSuchElementException e) {
			System.out.println("Error elements not found: " + e.getMessage());
		}
		checkNotificationPresenceAndHandle(masterDto);
	}

	private void handleInvalidMessage(MasterDto masterDto) throws IOException, InterruptedException {
		genericHelper.clickWithJavascriptExecutor(agentmasterpage.errorCloseButton());
		checkNotificationPresenceAndHandle(masterDto);
	}

//	private void handleInvalidMessageForDuplicateError(MasterDto masterDto) throws IOException, InterruptedException {
//		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();
//		genericHelper.clickWithJavascriptExecutor(agentmasterpage.errorCloseButton());
//		try {
//			String actualMessage = agentmasterpage.invalidErrorMsg().getText();
//			checkNotificationPresenceAndHandle(masterDto);
//
//			if (expectedMessage.contains(actualMessage)) {
//				reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
//				reportHelper.generateLog(test, actualMessage);
//				reportHelper.generateLogFullScreenSS(test, expectedMessage);
//			} else {
//				reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
//				reportHelper.generateLog(test, actualMessage);
//				reportHelper.generateLogFullScreenSS(test, actualMessage);
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		driver.navigate().refresh();
//	}

	public void handleDuplicateMessage(MasterDto masterDto) throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();
		try {

			WebElement duplicateErrorMessage = itemTypeMasterPage.alertDuplicateErrorMsg();
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", duplicateErrorMessage);
			String actualMessage = duplicateErrorMessage.getText();
			System.out.println("Actual Message: " + actualMessage);

			if (expectedMessage.contains(actualMessage)) {
				reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
				reportHelper.generateLog(test, actualMessage);
				reportHelper.generateLogFullScreenSS(test, expectedMessage);
			} else {
				reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
				reportHelper.generateLog(test, actualMessage);
				reportHelper.generateLogFullScreenSS(test, actualMessage);
			}

		} catch (Exception e) {
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
		driver.navigate().refresh();
	}

	public void handleDuplicateMessage(WebElement duplicateErrorMsg, String expectedMessage)
			throws IOException, InterruptedException {

		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", duplicateErrorMsg);
		String actualMessage = duplicateErrorMsg.getText();
		System.out.println("Actual Message: " + actualMessage);

		if (actualMessage.equals(expectedMessage.trim())) {
			reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
			reportHelper.generateLog(test, actualMessage);
			reportHelper.generateLogFullScreenSS(test, expectedMessage);
		} else {
			reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
			reportHelper.generateLog(test, actualMessage);
			reportHelper.generateLogFullScreenSS(test, actualMessage);
		}

		genericHelper.clickWithJavascriptExecutor(agentmasterpage.errorCloseButton());
		if (driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']")).isDisplayed()) {
			checkNotificationPresenceAndHandle(masterDto);
		}
	}

	public void checkNotificationPresenceAndHandle(MasterDto masterDto) throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();
		System.out.println("expectedMessage:" + expectedMessage);
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {

				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText().trim();
					System.out.println("Actual: " + actualMessage);

					// Use contains to verify if expectedMessage is part of actualMessage

//					reportHelper.performAssert(test, "Data", expectedMessage, actualMessage);
//					reportHelper.generateLog(test, actualMessage);
//					reportHelper.generateLogFullScreenSS(test, expectedMessage);
					if (actualMessage.trim().contains(expectedMessage.trim())) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
					} else {
						reportHelper.onTestFailure(test, "No Match: Expected does not contain Actual | Expected: "
								+ expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
						customerOrderPage.notificationCloseButton().click();
					}
				}
			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			// Thread.sleep(2000);
			driver.navigate().refresh();
		}
	}
	
	public void checkNotificationPresenceAndHandleForStore(MasterDto masterDto) throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();
		System.out.println("expectedMessage:" + expectedMessage);
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//li[@class=\"messageCenter-item\"][1]"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {

				String xpathExpression = "//li[@class=\"messageCenter-item\"][1]";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText().trim();
					System.out.println("Actual: " + actualMessage);

					// Use contains to verify if expectedMessage is part of actualMessage

//					reportHelper.performAssert(test, "Data", expectedMessage, actualMessage);
//					reportHelper.generateLog(test, actualMessage);
//					reportHelper.generateLogFullScreenSS(test, expectedMessage);
					if (actualMessage.trim().contains(expectedMessage.trim())) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
					} else {
						reportHelper.onTestFailure(test, "No Match: Expected does not contain Actual | Expected: "
								+ expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
						customerOrderPage.notificationCloseButton().click();
					}
				}
			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			// Thread.sleep(2000);
			driver.navigate().refresh();
		}
	}

	public void checkNotificationPresenceAndHandleBR(MasterDto masterDto) throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message"));
		System.out.println("Expected message: " + expectedMessage);

		try {
			// Locate the first notification element just to confirm existence
			WebElement notificationElement = driver
					.findElement(By.xpath("(//div[@class='messageBar-messageRegion'])[1]"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {
				// Grab all message bar elements
				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Collect all messages into one string
				StringBuilder sb = new StringBuilder();
				for (WebElement element : messageElements) {
					// Optionally scroll each element into view (if needed)
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					sb.append(element.getText().trim()).append(" ");
				}
				String allMessages = sb.toString().trim();
				System.out.println("All collected messages: " + allMessages);

				// Now do a single comparison with the combined messages
				if (allMessages.contains(expectedMessage)) {
					reportHelper.onTestSuccess(test,
							"Found expected message: '" + expectedMessage + "' in all messages.");
					reportHelper.generateLog(test, allMessages);
					reportHelper.generateLogFullScreenSS(test, expectedMessage);
				} else {
					reportHelper.onTestFailure(test, "Expected message NOT found.\nExpected: " + expectedMessage
							+ "\nActual Combined: " + allMessages);
					reportHelper.generateLog(test, allMessages);
					reportHelper.generateLogFullScreenSS(test, allMessages);

					// If needed, close notification here
					customerOrderPage.notificationCloseButton().click();
				}
			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found at all
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			// Refresh if you still need to
			driver.navigate().refresh();
		}
	}

	public void checkNotificationPresenceAndHandle1() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message")).trim();

		try {
			// Wait for the notification element to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement notificationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[contains(@class, 'messageBar')]//span[contains(@class, 'messageBar-message')]")));

			// Scroll to the notification element
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", notificationElement);

			// Get the text of the notification
			String actualMessage = notificationElement.getText().trim();
			System.out.println("Actual: " + actualMessage);

			// Compare the actual message with the expected message
			if (actualMessage.contains(expectedMessage)) {
				reportHelper.onTestSuccess(test, "Match Found: Expected contains Actual | Expected: " + expectedMessage
						+ " | Actual: " + actualMessage);
				reportHelper.generateLog(test, actualMessage);
				reportHelper.generateLogFullScreenSS(test, expectedMessage);
			} else {
				reportHelper.onTestFailure(test, "No Match: Expected does not contain Actual | Expected: "
						+ expectedMessage + " | Actual: " + actualMessage);
				reportHelper.generateLog(test, actualMessage);
				reportHelper.generateLogFullScreenSS(test, actualMessage);

				// Refresh the page to handle the failed case
				driver.navigate().refresh();
			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void checkNotificationPresenceAndHandleValidate() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("After Validate Expected Message"))
				.trim();
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {
				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText().trim();
					System.out.println("Actual: " + actualMessage);

					if (actualMessage.contains(expectedMessage)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
						// driver.navigate().refresh();
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
						customerOrderPage.notificationCloseButton().click();

					}
				}

			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
//			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
	}

	public void checkNotificationPresenceAndHandleGenerate() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("After Generated Expected Message"))
				.trim();
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {
				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText().trim();
					System.out.println("Actual: " + actualMessage);

					if (actualMessage.contains(expectedMessage)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);

					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
						customerOrderPage.notificationCloseButton().click();

					}
				}

			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
//			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
	}

	public void compareAndCloseAfterGenerated() throws IOException {
		String expectedMessageGenerated = getValueOrDefault(
				masterDto.getAttributeValue("After Generated Expected Message")).trim();
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {
				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessageGenerate = element.getText().trim();
					System.out.println("Actual Message: " + actualMessageGenerate);

					if (actualMessageGenerate.equals(expectedMessageGenerated.trim())) {
						reportHelper.onTestSuccess(test, "Expected Message: " + expectedMessageGenerated
								+ " | Actual Message: " + actualMessageGenerate);
						reportHelper.generateLog(test, actualMessageGenerate);
						reportHelper.generateLogFullScreenSS(test, expectedMessageGenerated);
						customerOrderPage.notificationCloseButton().click();
					} else {
						reportHelper.onTestFailure(test, "Expected Message: " + expectedMessageGenerated
								+ " | Actual Message: " + actualMessageGenerate);
						reportHelper.generateLog(test, actualMessageGenerate);
						reportHelper.generateLogFullScreenSS(test, actualMessageGenerate);
						customerOrderPage.notificationCloseButton().click();
						// driver.navigate().refresh();
					}
				}
				try {
					customerOrderPage.notificationCloseButton().click();
				} catch (Exception e) {
					System.err.println("Error for close button");
				}
			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
//			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
	}

	public void compareAndCloseAfterValidate() throws IOException {
		String expectedMessageValidate = getValueOrDefault(
				masterDto.getAttributeValue("After Validate Expected Message")).trim();
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			// Check if the notification element is displayed
			if (notificationElement.isDisplayed()) {
				String xpathExpression = "//div[@class='messageBar-messageRegion']";
				List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

				// Loop through each element and compare the text
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessageValidate = element.getText().trim();
					System.out.println("Actual Message1: " + actualMessageValidate);

					if (actualMessageValidate.equals(expectedMessageValidate.trim())) {
						reportHelper.onTestSuccess(test, "Expected Message1: " + expectedMessageValidate
								+ " | Actual Message1: " + actualMessageValidate);
						reportHelper.generateLog(test, actualMessageValidate);
						reportHelper.generateLogFullScreenSS(test, expectedMessageValidate);
						customerOrderPage.notificationCloseButton().click();
					} else {
						reportHelper.onTestFailure(test, "Expected Message1: " + expectedMessageValidate
								+ " | Actual Message1: " + actualMessageValidate);
						reportHelper.generateLog(test, actualMessageValidate);
						reportHelper.generateLogFullScreenSS(test, actualMessageValidate);
						customerOrderPage.notificationCloseButton().click();
						// driver.navigate().refresh();
					}
				}

			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
//			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}

	}

	public void checkNotificationPresenceAndHandleNew(MasterDto masterDto) throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message"));
		try {
			// Locate all relevant notification elements
			String primaryXpath = "//div[@class='messageBar-messageRegion']";
			String secondaryXpath = "//div[@class='additionalMessageBar-messageRegion']"; // Example XPath for the new
																							// element

			List<WebElement> allMessageElements = new ArrayList<>();
			// Add elements from both XPaths
			allMessageElements.addAll(driver.findElements(By.xpath(primaryXpath)));
			allMessageElements.addAll(driver.findElements(By.xpath(secondaryXpath)));

			if (!allMessageElements.isEmpty()) {
				// Loop through each element and compare the text
				for (WebElement element : allMessageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					if (actualMessage.contains(expectedMessage)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
					}
				}
			} else {
				reportHelper.onTestFailure(test, "No notifications found");
				reportHelper.generateLog(test, "No notifications found");
				reportHelper.generateLogFullScreenSS(test, "No notifications found");
			}
		} catch (NoSuchElementException e) {
			// Handle the case where no notification elements are found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void checkNotificationPresenceAndHandleForRNG() throws IOException {
		String expectedGenerateTagMessage = getValueOrDefault(
				masterDto.getAttributeValue("After Tag Generated Expected Message"));
		String expectedValidationMessage = getValueOrDefault(
				masterDto.getAttributeValue("After Validate Expected Message"));
		String expectedPostedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message"));
//		String expectedRemarkMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Remark Message")).trim();

		try {
			// Stage 1: Validate Upload Notification
			if (validateNotificationMessage(expectedGenerateTagMessage, "Tags generated")) {
				closeAllNotifications();
				// Stage 2: Validate after clicking "Validate"
				genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
				Thread.sleep(2000); // Adjust based on actual UI response time
				if (validateNotificationMessage(expectedValidationMessage, "Validation")) {
					closeAllNotifications();
					// If validation passed, click on "Generate" and validate its notification
					genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
					Thread.sleep(2000);
					checkNotificationPresenceAndHandle(masterDto);
//					if (!validateNotificationMessage(expectedPostedMessage, "Post")) {
//						reportHelper.onTestFailure(test, "Post Notification Validation Failed");
//					}
//				} 
//				else {
//					// If validation notification fails, get and compare the Remark field
//					validateRemarkField(expectedRemarkMessage);
				}
			}
		} catch (Exception e) {
			reportHelper.onTestFailure(test, "An exception occurred during the notification process");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred");
			throw new IOException("Error during notification handling", e);
		} finally {
			closeAllNotifications();
			driver.navigate().refresh();
		}
	}

	// Reusable method to validate notifications
	private boolean validateNotificationMessage(String expectedMessage, String stage) throws IOException {
		try {
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			if (notificationElement.isDisplayed()) {
				List<WebElement> messageElements = driver
						.findElements(By.xpath("//div[@class='messageBar-messageRegion']"));
				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText();
					System.out.println(stage + " Notification: " + actualMessage);

					if (actualMessage.contains(expectedMessage)) {
						reportHelper.onTestSuccess(test, stage + " Notification Validation Successful | Expected: "
								+ expectedMessage + " | Actual: " + actualMessage);
						return true; // Exit loop on successful match
					}
				}
				reportHelper.onTestFailure(test, stage + " Notification Validation Failed | Expected: "
						+ expectedMessage + " but no matching notification found");
				return false; // No match found
			}
		} catch (NoSuchElementException e) {
			reportHelper.onTestFailure(test, stage + " Notification not found");
			return false;
		}
		return false;
	}

	// Reusable method to validate the Remark field
//	private void validateRemarkField(String expectedRemarkMessage) throws IOException {
//		try {
//			WebElement remarkField = bulkTagPage.remarkField(); // Adjust the XPath
//			try {
//				WebElement horizontalScrollbar = driver
//						.findElement(By.xpath("//div[contains(@class, 'ScrollbarLayout_faceHorizontal')]"));
//				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollLeft = arguments[1];",
//						horizontalScrollbar, remarkField.getLocation().getX());
//
//			} catch (Exception e) {
//				System.out.println("RemarkField not found");
//			}
//			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", remarkField);
//
//			String actualRemarkMessage = remarkField.getAttribute("title").trim();
//			System.out.println("Remark Field Text: " + actualRemarkMessage);
//
//			if (actualRemarkMessage.equals(expectedRemarkMessage)) {
//				reportHelper.onTestSuccess(test, "Remark Validation Successful | Expected: " + expectedRemarkMessage
//						+ " | Actual: " + actualRemarkMessage);
//			} else {
//				reportHelper.onTestFailure(test, "Remark Validation Failed | Expected: " + expectedRemarkMessage
//						+ " | Actual: " + actualRemarkMessage);
//			}
//		} catch (NoSuchElementException e) {
//			reportHelper.onTestFailure(test, "Remark field not found");
//		}
//	}

	// Reusable method to close all notifications
	public void closeAllNotifications() {
		try {
			WebElement closeButtons = rngpage.notificationCloseButton();
			if (closeButtons.isDisplayed()) {
				closeButtons.click();
				Thread.sleep(500); // Allow time for each notification to close
			}

		} catch (Exception e) {
			System.out.println("Failed to close notifications: " + e.getMessage());
		}
	}

	public void checkNotificationPresenceAndHandleAlert() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message"));

		try {
			// XPath for notification elements
			String Xpath = "//div[contains(@class,'messageBar-message')]";
			List<WebElement> allMessageElements = driver.findElements(By.xpath(Xpath));

			if (!allMessageElements.isEmpty()) {
				boolean messageMatched = false;

				// Loop through each element and compare the text
				for (WebElement element : allMessageElements) {
//					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);

					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage); // Debug logging

					if (expectedMessage.contains(actualMessage)) {
						// Success: Expected and Actual match
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
						messageMatched = true;
						break;
					}
				}

				if (!messageMatched) {
					// Failure: No matching message found
					String actualMessages = allMessageElements.stream().map(WebElement::getText).reduce("",
							(a, b) -> a + "\n" + b);
					reportHelper.onTestFailure(test,
							"Expected: " + expectedMessage + " | Actual: No matching notification found.");
					reportHelper.generateLog(test, "Actual messages: " + actualMessages);
					reportHelper.generateLogFullScreenSS(test, "No matching notification found");
				}

			} else {
				// Failure: No notification elements found
				reportHelper.onTestFailure(test, "No notifications found");
				reportHelper.generateLog(test, "No notifications found");
				reportHelper.generateLogFullScreenSS(test, "No notifications found");
			}

		} catch (NoSuchElementException e) {
			// Handle case where no notification elements are present
			reportHelper.onTestFailure(test, "No notification elements found");
			reportHelper.generateLog(test, "No notification elements found");
			reportHelper.generateLogFullScreenSS(test, "No notification elements found");
		} catch (Exception e) {
			// Generic exception handling
			reportHelper.onTestFailure(test, "An exception occurred while checking notifications");
			reportHelper.generateLog(test, "Exception: " + e.getMessage());
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notifications");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void tryAllClickMethods(WebElement element) {
		try {
			System.out.println("Trying: actions.moveToElement().click().perform()");
			actions.moveToElement(element).click().perform();
			System.out.println("Success!");
			return;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}

		try {
			System.out.println("Trying: element.click()");
			element.click();
			System.out.println("Success!");
			return;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}

		try {
			System.out.println("Trying: JavaScript click");
			genericHelper.javascriptExecutor.executeScript("arguments[0].click();", element);
			System.out.println("Success!");
			return;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}

		try {
			System.out.println("Trying: actions.click()");
			actions.click(element).perform();
			System.out.println("Success!");
			return;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}

		try {
			System.out.println("Trying: using sendKeys()");
			element.sendKeys(Keys.RETURN);
			System.out.println("Success!");
			return;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}

		try {
			System.out.println("Trying: waiting and clicking");
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			System.out.println("Success!");
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
		}
	}

	public static String convertDateFormatJava8(String inputDate) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

		LocalDate date = LocalDate.parse(inputDate, inputFormatter);
		return date.format(outputFormatter);
	}

	public void downloadPDFUsingRobot() {
		try {
//			WebElement pdfElement = driver.findElement(By.tagName("body"));
//			pdfElement.click();
//			Thread.sleep(1000);

			WebElement downloadButton = monthlySavingSchemeDefaulterListPage.btnDownload();

			// Scroll element into view
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", downloadButton);

			// Get element's location on screen
			Point location = downloadButton.getLocation();
			int x = location.getX();
			int y = location.getY();

			// Adjust based on browser window position (optional if using fullscreen)
			Robot robot = new Robot();
			robot.mouseMove(x + 10, y + 80); // Add offset if needed (toolbar, window decoration)
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_S);
//			robot.keyRelease(KeyEvent.VK_S);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			Thread.sleep(2000);
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);

			System.out.println("PDF Downloaded Successfully!");
		} catch (Exception e) {
			System.err.println("Error handling PDF download with Robot class: " + e.getMessage());
		}
	}

	public void downloadPDF() {
		try {
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.err.println("Error handling PDF download with JavaScript: " + e.getMessage());
		}
	}

	/**
	 * Waits for the latest downloaded PDF file.
	 */
	public static String waitForLatestDownloadedPDF(String directoryPath) throws InterruptedException {
		for (int i = 0; i < 30; i++) {
			String latestFilePath = getLatestDownloadedPDF(directoryPath);
			if (latestFilePath != null) {
				return latestFilePath;
			}
			Thread.sleep(1000);
		}
		return null;
	}

	/**
	 * Gets the latest downloaded PDF file dynamically.
	 */
	public static String getLatestDownloadedPDF(String directoryPath) {
		try {
			Path downloadPath = Paths.get(directoryPath);
			Optional<Path> latestFilePath = Files.list(downloadPath).filter(file -> file.toString().endsWith(".pdf"))
					.max(Comparator.comparingLong(file -> file.toFile().lastModified()));

			return latestFilePath.map(Path::toString).orElse(null);
		} catch (IOException e) {
			System.err.println("Error while fetching the latest PDF file: " + e.getMessage());
			return null;
		}
	}

	/**
     * Extracts structured data from a PDF.
     */
    public static Map<String, Object> extractDataFromPDF(String pdfPath) throws IOException {
        File file = new File(pdfPath);
        if (!file.exists()) {
            System.err.println("PDF file not found: " + pdfPath);
            return null;
        }

        try (PDDocument document = PDDocument.load(file)) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            pdfStripper.setSortByPosition(true);
            String text = pdfStripper.getText(document);
            System.out.println("======= Extracted PDF Content =======");
            System.out.println(text);
            System.out.println("======================================");

            return parsePDFText(text);
        }
    }

    /**
     * Parses extracted PDF text into structured key-value pairs and tables.
     * This implementation is generic and will:
     * - Use a regex to extract any key-value pairs on a line.
     * - Create generic table rows if a line has multiple spaces.
     */
    public static Map<String, Object> parsePDFText(String text) {
        Map<String, Object> extractedData = new LinkedHashMap<>();
        Map<String, String> keyValuePairs = new LinkedHashMap<>();
        List<Map<String, String>> tables = new ArrayList<>();
        boolean isTable = false;

        // Generic regex for key-value pairs:
        // This will capture anything before a colon or equal sign as key and
        // everything after as the value until another key delimiter or end of line.
        Pattern kvPattern = Pattern.compile("([^:=]+?)\\s*[:=]\\s*([^:=]+?)(?=\\s*[:=]|$)");

        String[] lines = text.split("\\n");
        for (String line : lines) {
            line = line.trim();
            if (line.isEmpty())
                continue;

            boolean lineProcessed = false;
            // Process lines that contain key-value pairs
            if (line.contains(":") || line.contains("=")) {
                Matcher matcher = kvPattern.matcher(line);
                while (matcher.find()) {
                    String key = matcher.group(1).trim();
                    String value = matcher.group(2).trim();
                    keyValuePairs.put(key, value);
                    lineProcessed = true;
                }
            }

            // If the line wasn't processed as key-value, check if it looks like a table row.
            if (!lineProcessed && line.matches(".*\\s{2,}.*")) {
                isTable = true;
                // Split the line on multiple spaces.
                String[] columns = line.split("\\s{2,}");
                // Create a generic table row using Column1, Column2, etc.
                if (columns.length > 1) {
                    Map<String, String> rowData = new LinkedHashMap<>();
                    for (int i = 0; i < columns.length; i++) {
                        rowData.put("Column" + (i + 1), columns[i].trim());
                    }
                    tables.add(rowData);
                }
            }
        }

        if (!keyValuePairs.isEmpty()) {
            extractedData.put("Invoice Details", keyValuePairs);
        }
        if (!tables.isEmpty()) {
            extractedData.put("Table Data", tables);
        }

        // Debug: Print out the extracted data as JSON
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(extractedData);
            System.out.println(jsonString);
        } catch (Exception e) {
            System.err.println("Error converting to JSON: " + e.getMessage());
        }

        return extractedData;
    }

    /**
     * Validates that the extracted data contains the expected value.
     * @throws IOException 
     */
    public void validateExtractedData(ExtentTest test, Map<String, Object> extractedData, String expectedValue) throws IOException {
        boolean isValid = extractedData.values().stream()
            .anyMatch(value -> value.toString().contains(expectedValue));

        if (isValid) {
            reportHelper.onTestSuccess(test, "Expected Value Found: " + expectedValue);
            reportHelper.generateLogWithScreenshot(test, "Expected Value Found: " + expectedValue);
        } else {
            reportHelper.onTestFailure(test, "Expected Value NOT Found: " + expectedValue);
            reportHelper.generateLogWithScreenshot(test, "Expected Value NOT Found: " + expectedValue);
        }
    }


public void compareFields(ExtentTest test, MasterDto masterDto, String fieldName, String expected)
		throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//Validate inputs
	if (fieldName == null || fieldName.isEmpty()) {
		System.out.println("Error: Field Name is null or empty");
		return;
	}
	if (expected == null) {
		System.out.println("Error: Expected Value is null");
		return;
	}

	String actual = "";
	try {
//Get the corresponding method from CommonFieldsPage
		Method method = CommonFieldsPage.class.getMethod(fieldName);
		WebElement element = (WebElement) method.invoke(commonFields);

		if (element.getTagName().equalsIgnoreCase("input") || element.getTagName().equalsIgnoreCase("textarea")) {
			actual = element.getAttribute("value");
		} else {
			actual = element.getText().trim();
		}

		System.out.println("Comparing " + fieldName + " | Expected: " + expected + " | Actual: " + actual);

//Compare expected and actual values
		if (!expected.equalsIgnoreCase(actual)) {
			reportHelper.onTestFailure(test,
					fieldName + " mismatch. Expected: " + expected + ", Actual: " + actual);
			reportHelper.generateLogWithScreenshot(test, "Mismatch for: " + fieldName);
		} else {
			reportHelper.onTestSuccess(test, "PASS: " + fieldName + " matches. Value: " + expected);
			reportHelper.generateLogWithScreenshot(test, "PASS: " + fieldName + " matches. Value: " + expected);
		}
	} catch (NoSuchMethodException e) {
		System.out.println("No matching method found for field: " + fieldName);
		reportHelper.onTestFailure(test, "No matching field found: " + fieldName);
	} 
}
}
