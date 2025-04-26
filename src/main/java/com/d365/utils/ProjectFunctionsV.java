package com.d365.utils;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.d365.core.AgentMaster;
//import com.d365.core.AllSalesOrderLot;
import com.d365.core.BankMaster;
import com.d365.core.BulkTag;
//import com.d365.core.ColorMaster;
//import com.d365.core.ConfigurationMaster;
//import com.d365.core.DJHMcheck;
//import com.d365.core.DJLMcheck;
//import com.d365.core.DJPoCheck;
//import com.d365.core.DJQCStage;
//import com.d365.core.DesignCheck;
//import com.d365.core.DesignCheckDJ;
import com.d365.core.DesignCodeMaster;
//import com.d365.core.HallMarkingMaster;
//import com.d365.core.Hallmark;
import com.d365.core.FranchiseeReport;
import com.d365.core.QcSetupMaster;
import com.d365.core.SchemeMaturityReport;
import com.d365.core.SizeMaster;
import com.d365.core.UrdAddData;
import com.d365.pagelayer.BankMasterPage;
import com.d365.pagelayer.BulkTagPage;
import com.d365.pagelayer.CommonFieldsV;
import com.d365.pagelayer.DesignCodeMasterPage;
import com.d365.pagelayer.FranchiseeReportPage;
import com.d365.pagelayer.LoginPage;
import com.d365.pagelayer.ProvisionalParcelPage;
import com.d365.pagelayer.QcSetupMasterPage;
import com.d365.pagelayer.SchememMaturityReportpage;
import com.d365.pagelayer.SizeMasterPage;
import com.d365.pagelayer.URDPage;
import com.sharedutils.ExcelHelper;
import com.sharedutils.GenericHelper;
import com.sharedutils.MasterDto;
import com.sharedutils.PropertyHelper;
import com.sharedutils.ReportsHelper;
import com.sharedutils.ScreenShotHelper;

public class ProjectFunctionsV implements ProjectConstants {

	public GenericHelper genericHelper = new GenericHelper();
	public ExcelHelper excelHelper = new ExcelHelper();
	public PropertyHelper propertyHelper = new PropertyHelper();
	public ReportsHelper reportHelper = new ReportsHelper();
	public ScreenShotHelper ssHelper = new ScreenShotHelper();
	public static MasterDto masterDto = new MasterDto();

	public static CommonFieldsV commonFields;

	public static QcSetupMasterPage qcSetupMasterPage;
	public static QcSetupMaster qcSetupMaster;
	public static BankMasterPage bankMasterPage;
	public static BankMaster bankMaster;
	public static URDPage urdPage;
	public static UrdAddData urdAddData;
	public static BulkTag bulkTag;
	public static BulkTagPage bulkTagPage;
	public static DesignCodeMasterPage designCodeMasterPage;
	public static DesignCodeMaster designCodeMaster;
	public static SizeMaster sizeMaster;
	public static SizeMasterPage sizeMasterPage;
	public static LoginPage loginpage;
	public static FranchiseeReport franchiseereport;
	public static FranchiseeReportPage franchiseereportpage;
	public static SchemeMaturityReport schemematurityreport;
	public static SchememMaturityReportpage schememmaturityreportpage;

	// core page

	public static ExtentReports extentReports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public SoftAssert softAssert = new SoftAssert();

	// POM Pages

	protected static boolean isLoggedIn = false;

//	public static CountryMasterPage countryMasterPage;

	public static WebDriverWait wait;

	public void pageInitialiazation(WebDriver driver) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Core Page

		// POM Page

		SoftAssert softAssert = new SoftAssert();
	}

	public void login() throws InterruptedException {
//		driver.findElement(By.id("i0116")).sendKeys("vaishnavi.khandwe@techneai.com");
//		driver.findElement(By.id("idSIButton9")).click();
//		driver.findElement(By.xpath("//input[contains(@name,\"pass\")]")).sendKeys("Vaishu@543210");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,\"idSIB\")]")).click();
//		driver.findElement(By.xpath("//input[contains(@id,\"idBt\")]")).click();

		String xpath;
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("vaishnavi.khandwe@techneai.com");
		// driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Vaishu@543210");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[contains(@id,\"idSIB\")]")).click();
		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();

		commonFields = new CommonFieldsV();

		// customerOrder = new CustomerOrder();

		qcSetupMasterPage = new QcSetupMasterPage();
		qcSetupMaster = new QcSetupMaster();
		bankMaster = new BankMaster();
		bankMasterPage = new BankMasterPage();
		urdPage = new URDPage();
		urdAddData = new UrdAddData();
		bulkTagPage = new BulkTagPage();
		bulkTag = new BulkTag();
		designCodeMasterPage = new DesignCodeMasterPage();
		designCodeMaster = new DesignCodeMaster();
		sizeMasterPage = new SizeMasterPage();
		sizeMaster = new SizeMaster();
		franchiseereport = new FranchiseeReport();
		franchiseereportpage = new FranchiseeReportPage();
		schemematurityreport = new SchemeMaturityReport();
		schememmaturityreportpage = new SchememMaturityReportpage();
		loginpage = new LoginPage(null);

	}

//	public void saveOrderAndHandleErrors() throws InterruptedException, IOException {
//		genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.saveButton());
//		Thread.sleep(1000);
//		try {
//			if (provisionalParcelPage.errorCloseButton().isDisplayed()) {
//				// handle close button error
//				WebElement closePopUpWE = driver
//						.findElement(By.xpath("//div[contains(@id,'SysBoxForm') and contains (@id,'TextGroup')]"));
//				String closePopUpMsg = closePopUpWE.getText();
//				provisionalParcelPage.errorCloseButton().click();
//				Thread.sleep(1000);
////				try { 
////					customerOrder.errorCloseButton().click();
////				} catch (Exception e) {
////					System.err.println("" + e);
////				}
//				handleNotificationOrRefreshPage();
//			}
//		} catch (Exception e) {
//			handleNotificationOrRefreshPage();
//		}
//	}
//
//	public void handleNotificationOrRefreshPage() throws InterruptedException, IOException {
//		if (provisionalParcelPage.expandNotificationBtn().isDisplayed()) {
//			genericHelper.clickWithJavascriptExecutor(provisionalParcelPage.notificationOpenButton());
//			handleValidation();
//		} else {
//			handleValidation();
//		}
//		driver.navigate().refresh();
//	}
//
//	public void handleValidation() throws IOException {
//		String expectedMessage = masterDto.getAttributeValue("Expected message");
//		String xpathExpression = "//div[@class='messageBar-messageRegion']";
//
//		try {
//			// Find all elements that match the XPath
//
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
//
//				} else {
//					reportHelper.onTestSuccess(test,
//							"Expected : " + expectedMessage + "and Actual Message: " + actualMessage);
//					reportHelper.generateLogFullScreenSS(test, expectedMessage);
//				}
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
		genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
		Thread.sleep(1000); // Wait for the modules to load

		// Scroll to the module selector and click it
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", moduleSelector);
		Thread.sleep(1000);
		genericHelper.clickWithJavascriptExecutor(moduleSelector);

		// Expand all if necessary
		genericHelper.clickWithJavascriptExecutor(commonFields.btnExpandAll());

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

	public void getResults1() throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Message"));

		try {

			WebElement invalidMsg = commonFields.lblInvalidError();
			WebElement duplicateErrorMsg = commonFields.lblDuplicateError();
			WebElement duplicateErrorMsg1 = commonFields.lblInvalidError();

			if (invalidMsg.isDisplayed() || duplicateErrorMsg1.isDisplayed()) {
				handleInvalidMessage();
			} else if (duplicateErrorMsg.isDisplayed()) {
				handleDuplicateMessage(duplicateErrorMsg, expectedMessage);
			} else {
				handleInvalidMessage();

			}
		} catch (NoSuchElementException e) {
			System.out.println("Error elements not found: " + e.getMessage());
		}
		checkNotificationPresenceAndHandle(masterDto);
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
						commonFields.btnNotificationClose().click();

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
						commonFields.btnNotificationClose().click();

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
						commonFields.btnNotificationClose().click();
					} else {
						reportHelper.onTestFailure(test, "Expected Message: " + expectedMessageGenerated
								+ " | Actual Message: " + actualMessageGenerate);
						reportHelper.generateLog(test, actualMessageGenerate);
						reportHelper.generateLogFullScreenSS(test, actualMessageGenerate);
						commonFields.btnNotificationClose().click();
						// driver.navigate().refresh();
					}
				}
				try {
					commonFields.btnNotificationClose().click();
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
						commonFields.btnNotificationClose().click();
					} else {
						reportHelper.onTestFailure(test, "Expected Message1: " + expectedMessageValidate
								+ " | Actual Message1: " + actualMessageValidate);
						reportHelper.generateLog(test, actualMessageValidate);
						reportHelper.generateLogFullScreenSS(test, actualMessageValidate);
						commonFields.btnNotificationClose().click();
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

	public void checkNotificationPresenceAndHandleNew() throws IOException {
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
				genericHelper.clickWithJavascriptExecutor(commonFields.btnValidate());
				Thread.sleep(2000); // Adjust based on actual UI response time
				if (validateNotificationMessage(expectedValidationMessage, "Validation")) {
					closeAllNotifications();
					// If validation passed, click on "Generate" and validate its notification
					genericHelper.clickWithJavascriptExecutor(commonFields.btnSave());
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

//	public void loginPage(WebDriver driver, String username, String password) throws InterruptedException, Exception {
//
//		if (!isLoggedIn) {
//
//			String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
//
//			genericHelper.insertDataIntoField(loginPage(), username);
//			loginPage.nextBtn().click();
//			Thread.sleep(3000);
//			genericHelper.insertDataIntoField(loginPage.enterPwd(), password);
//			loginPage.signInBtn().click();
//			loginPage.yesBtn().click();
//			try {
//
//				test.pass("<b>Uname : " + username + "<br />Password : " + password + "<b/>");
//				reportHelper.onTestSuccess(test, "");
//
//				isLoggedIn = true;
//
//				// onTestFailure("Uname : " +uname+ " Password : "+password+ " : "+msg);
//			} catch (Exception e) {
////				String msg = driver.findElement(By.xpath("//div[@class='Toastify__toast-body' and @role='alert']/div"))
////						.getText();
////				test.fail(msg);
////				test.fail("<b>Uname : " + usern+ame + "<br />Password : " + password + "<b/>");
////
////				reportHelper.generateLog(test, "");
//			}
//		}
//	}
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

	public void navigateToPage(WebElement selectModule, WebElement specificPageElement) throws InterruptedException {
		genericHelper.clickWithJavascriptExecutor(commonFields.lnkModule());
		Thread.sleep(1000);
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", selectModule);
		Thread.sleep(1000);
		genericHelper.clickWithJavascriptExecutor(selectModule);
		genericHelper.clickWithJavascriptExecutor(commonFields.btnExpandAll());
		genericHelper.clickWithJavascriptExecutor(specificPageElement);
	}

//	public void saveOrderAndHandleErrors() throws InterruptedException, IOException {
//		genericHelper.clickWithJavascriptExecutor(customerOrder.saveButton());
//		Thread.sleep(1000);
//		try {
//			if (customerOrder.errorCloseButton().isDisplayed()) {
//				customerOrder.errorCloseButton().click();
//				Thread.sleep(1000);
//				try {
//					customerOrder.errorCloseButton().click();
//				} catch (Exception e) {
//					System.err.println("" + e);
//				}
//				handleNotificationOrRefreshPage();
//			}
//		} catch (Exception e) {
//			handleNotificationOrRefreshPage();
//		}
//	}

	public void handleNotificationOrRefreshPagePPR() throws InterruptedException, IOException {
		if (commonFields.btnExpandNotification().isDisplayed()) {
			genericHelper.clickWithJavascriptExecutor(commonFields.btnNotificationOpen());
			handleValidationPPR();
		} else {
			handleValidationPPR();
		}
//		driver.navigate().refresh();
	}

	public void handleValidationPPR() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
		String xpathExpression = "//div[@class='messageBar-messageRegion']";

		try {
			// Find all elements that match the XPath
			List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));

			boolean messageFound = false; // Tracks if the expected message is found
			boolean incorrectMessageFound = false; // Tracks if an incorrect message is found

			// Loop through each element and compare the text
			for (WebElement element : elements) {
				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
				String actualMessage = element.getText();
				System.out.println("Actual Message: " + actualMessage);

				if (actualMessage.contains(expectedMessage)) {
					reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLogFullScreenSS(test,
							"Expected: " + expectedMessage + " | Actual: " + actualMessage);
				} else {
					reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLogFullScreenSS(test,
							"Expected: " + expectedMessage + " | Actual: " + actualMessage);
				}
			}

		} catch (NoSuchElementException e) {
			// Log when no element is found
			reportHelper.onTestFailure(test, "Exception: " + e.getMessage());
			reportHelper.generateLog(test, "Exception: " + e.getMessage());
			reportHelper.generateLogWithScreenshot(test, "No message found.");

		} catch (AssertionError a) {
			reportHelper.onTestFailure(test, "Exception: " + a.getMessage());
			reportHelper.generateLog(test, "AssertionError: " + a.getMessage());
			reportHelper.generateLogWithScreenshot(test, "AssertionError: " + a.getMessage());

		}
	}

	public void handleValidationPVI() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
		String xpathExpression = "(//span[@class='messageBar-message'])[1]";

		try {
			// Find all elements that match the XPath
			List<WebElement> elements = driver.findElements(By.xpath(xpathExpression));

			boolean messageFound = false; // Tracks if the expected message is found
			boolean incorrectMessageFound = false; // Tracks if an incorrect message is found

			// Loop through each element and compare the text
			for (WebElement element : elements) {
				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
				String actualMessage = element.getText();
				System.out.println("Actual Message: " + actualMessage);

				if (actualMessage.contains(expectedMessage)) {
					reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLogFullScreenSS(test,
							"Expected: " + expectedMessage + " | Actual: " + actualMessage);
				} else {
					reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
					reportHelper.generateLogFullScreenSS(test,
							"Expected: " + expectedMessage + " | Actual: " + actualMessage);
				}
			}

		} catch (NoSuchElementException e) {
			// Log when no element is found
			reportHelper.onTestFailure(test, "Exception: " + e.getMessage());
			reportHelper.generateLog(test, "Exception: " + e.getMessage());
			reportHelper.generateLogWithScreenshot(test, "No message found.");

		} catch (AssertionError a) {
			reportHelper.onTestFailure(test, "Exception: " + a.getMessage());
			reportHelper.generateLog(test, "AssertionError: " + a.getMessage());
			reportHelper.generateLogWithScreenshot(test, "AssertionError: " + a.getMessage());

		}
	}

//	public void clickAndValidateButton(WebElement element, String buttonName) throws InterruptedException, IOException {
//		genericHelper.clickWithJavascriptExecutor(element);
//		try {
//			if (element.isSelected()) {
//				reportHelper.generateLog(test, buttonName + " button is clicked.");
//				reportHelper.generateLogWithScreenshot(test, buttonName + " button is clicked.");
//			} else {
//				reportHelper.generateLogWithScreenshot(test, buttonName + " button is clicked.");
//			}
//		} catch (Exception e) {
//			reportHelper.generateLogWithScreenshot(test, buttonName + " Exception occure in button clicked.");
//		}
//
//	}

	public void clearSendKeysAndLog(WebElement element, String value) throws InterruptedException, IOException {
		genericHelper.clearAndSendKeysAndEnter(element, value);

		// Verify if the value was successfully inserted
		if (element.getAttribute("value").equals(value)) {
			reportHelper.generateLog(test, "Value inserted: " + value + " successfully.");
			reportHelper.generateLogWithScreenshot(test, "Value inserted.");
		} else {
			reportHelper.generateLog(test, "Value insertion failed: " + value);
			reportHelper.generateLogWithScreenshot(test, "Value insertion failed.");
		}
	}

	public String convertToString(Object value) {

		if (value == null) {

			return "";

		} else if (value instanceof Double || value instanceof Integer) {

			return value.toString();

		} else if (value instanceof String) {

			return (String) value;

		} else {

			throw new IllegalArgumentException("Unsupported value type: " + value.getClass());

		}

	}

//	public void saveOrderAndHandleErrorsBM() throws InterruptedException, IOException {
//		try {
//			if (customerOrder.errorCloseButton().isDisplayed()) {
//				handleErrorCloseButton();
//			}
//		} catch (Exception e) {
//		}
//		handleNotificationOrRefreshPageBM();
//		
//	}
//

	public boolean saveOrderAndHandleErrorsBM() throws InterruptedException, IOException {
		// Check if the error close button is displayed and handle it
		if (commonFields.btnErrorClose().isDisplayed()) {
			if (handleErrorCloseButton()) { // Modified to return true if error handling is done
				return true; // Exit early if the error is handled
			}
		}
		handleNotificationOrRefreshPageBM();
		return false; // Continue execution if no error handling was required
	}

	private boolean handleErrorCloseButton() throws IOException {
		String expectedMessage = masterDto.getAttributeValue("Expected message");
		String actualMessage = driver.findElement(By.id("titleField")).getText();

		String logMessage = String.format("Expected Message: '%s' | Actual Message: '%s'", expectedMessage,
				actualMessage);
		reportHelper.generateLog(test, logMessage);

		if (actualMessage.equals(expectedMessage)) {
			reportHelper.onTestSuccess(test, logMessage);
		} else {
			reportHelper.onTestFailure(test, logMessage);
		}

		reportHelper.generateLogWithScreenshot(test, logMessage);
		commonFields.btnErrorClose().click();

		return true; // Indicate that error handling was executed
	}

	public void handleNotificationOrRefreshPageBM() throws InterruptedException, IOException {
		// Check if the expand notification button is displayed
		if (commonFields.btnExpandNotification().isDisplayed()) {
			genericHelper.clickWithJavascriptExecutor(commonFields.btnNotificationOpen());
		}

		handleValidationBM();
		refreshPage();
	}

	public void refreshPage() throws IOException {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			reportHelper.generateLog(test, "Failed to refresh the page: " + e.getMessage());
		}
	}

	public void handleValidationBM() throws IOException {
		String expectedMessage = masterDto.getAttributeValue("Expected message");

		// Check if the message region is displayed
		if (!isMessageRegionDisplayed()) {
			logAndScreenshot("Message region not displayed.");
//			return;
		}

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='messageBar-messageRegion']"));
		validateMessages(expectedMessage, elements);
		refreshPage();
	}

	public boolean isMessageRegionDisplayed() {
		try {
			return driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']")).isDisplayed();
		} catch (NoSuchElementException e) {
			return false; // Message region is not displayed
		}
	}

	public void validateMessages(String expectedMessage, List<WebElement> elements) throws IOException {
		boolean messageFound = false;

		for (WebElement element : elements) {
			String actualMessage = element.getText();
			reportHelper.generateLog(test, "Actual Message found: '" + actualMessage + "'");

			if (actualMessage.contains(expectedMessage)) {
				reportHelper.onTestSuccess(test,
						String.format("Message found. Expected: '%s' | Actual: '%s'", expectedMessage, actualMessage));
				reportHelper.generateLogFullScreenSS(test, expectedMessage);
				messageFound = true;

			} else {
				reportHelper.onTestFailure(test,
						String.format("Message found. Expected: '%s' | Actual: '%s'", expectedMessage, actualMessage));
				reportHelper.generateLogFullScreenSS(test, expectedMessage);
			}
		}

		if (!messageFound) {
			logAndScreenshot("Expected Message: '" + expectedMessage + "' not found among the displayed messages.");
		}
	}

	private void logAndScreenshot(String message) throws IOException {
		reportHelper.onTestFailure(test, message);
		reportHelper.generateLog(test, message);
		reportHelper.generateLogWithScreenshot(test, message);
	}

	public void getResults(MasterDto masterDto) throws IOException, InterruptedException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));

		try {
			WebElement duplicateErrorMsg = commonFields.lblDuplicateError();
			WebElement invalidMsg = commonFields.lblInvalidError();

			if (invalidMsg.isDisplayed()) {
				handleInvalidMessage();
			} else if (duplicateErrorMsg.isDisplayed()) {
				handleDuplicateMessage(duplicateErrorMsg, expectedMessage);
			} else {
				checkNotificationPresenceAndHandle(masterDto);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error elements not found: " + e.getMessage());
		}
		checkNotificationPresenceAndHandle(masterDto);

	}

	private void handleInvalidMessage() throws IOException, InterruptedException {
		genericHelper.clickWithJavascriptExecutor(commonFields.btnErrorClose());
		checkNotificationPresenceAndHandle(masterDto);
	}

	private void handleDuplicateMessage(WebElement duplicateErrorMsg, String expectedMessage)
			throws IOException, InterruptedException {
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", duplicateErrorMsg);
		String actualMessage = duplicateErrorMsg.getText();
		System.out.println("Actual Message: " + actualMessage);

		if (actualMessage.contains(expectedMessage)) {
			reportHelper.onTestSuccess(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
			reportHelper.generateLog(test, actualMessage);
			reportHelper.generateLogFullScreenSS(test, expectedMessage);
		} else {
			reportHelper.onTestFailure(test, "Expected: " + expectedMessage + " | Actual: " + actualMessage);
			reportHelper.generateLog(test, actualMessage);
			reportHelper.generateLogFullScreenSS(test, actualMessage);
		}

		genericHelper.clickWithJavascriptExecutor(commonFields.btnErrorClose());
		if (driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']")).isDisplayed()) {
			checkNotificationPresenceAndHandle(masterDto);
		}
	}

	public void checkNotificationPresenceAndHandle(MasterDto masterDto) throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
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

			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
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

	public void checkNotificationPresenceAndHandleJW() throws IOException {
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
		System.out.println("Expected Message: " + expectedMessage);

		try {
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			if (notificationElement.isDisplayed()) {
				List<WebElement> messageElements = driver
						.findElements(By.xpath("//div[@class='messageBar-messageRegion']"));

				for (WebElement element : messageElements) {
					genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					// Normalize whitespace and case for comparison
					String normalizedExpected = expectedMessage.trim().replaceAll("\\s+", " ");
					String normalizedActual = actualMessage.trim().replaceAll("\\s+", " ");

					System.out.println("Normalized Expected: '" + normalizedExpected + "'");
					System.out.println("Normalized Actual: '" + normalizedActual + "'");

					if (normalizedActual.equals(normalizedExpected)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessage + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessage);
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + normalizedExpected + " | Actual: " + normalizedActual);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
					}
				}
			}
		} catch (NoSuchElementException e) {
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void checkNotificationPresenceAndHandleForBulkTagForThreeCondition(MasterDto masterDto) throws IOException {
		String expectedUploadMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Upload Message"));
		String expectedValidationMessage = getValueOrDefault(
				masterDto.getAttributeValue("Expected Validation Message"));
		String expectedGeneratedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Generated Message"));
		String expectedRemarkMessage = getValueOrDefault(masterDto.getAttributeValue("Expected Remark Message")).trim();

		try {
			// Stage 1: Validate Upload Notification
			if (validateNotificationMessage(expectedUploadMessage, "File Upload")) {
				closeAllNotifications();
				// Stage 2: Validate after clicking "Validate"
				genericHelper.clickWithJavascriptExecutor(commonFields.btnValidate());
				Thread.sleep(4000); // Adjust based on actual UI response time
				if (validateNotificationMessage(expectedValidationMessage, "Validation")) {
					closeAllNotifications();
					// If validation passed, click on "Generate" and validate its notification
					genericHelper.clickWithJavascriptExecutor(commonFields.btnGenerateLine());
					Thread.sleep(4000);

					if (!validateNotificationMessage(expectedGeneratedMessage, "Generate")) {
						reportHelper.onTestFailure(test, "Generate Notification Validation Failed");
					}
				} else {
					// If validation notification fails, get and compare the Remark field
					validateRemarkField(expectedRemarkMessage);
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
	private void validateRemarkField(String expectedRemarkMessage) throws IOException {
		try {
			WebElement remarkField = commonFields.txtRemark(); // Adjust the XPath
			try {
				WebElement horizontalScrollbar = driver
						.findElement(By.xpath("//div[contains(@class, 'ScrollbarLayout_faceHorizontal')]"));
				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollLeft = arguments[1];",
						horizontalScrollbar, remarkField.getLocation().getX());

			} catch (Exception e) {
				System.out.println("RemarkField not found");
			}
			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", remarkField);

			String actualRemarkMessage = remarkField.getAttribute("title").trim();
			System.out.println("Remark Field Text: " + actualRemarkMessage);

			if (actualRemarkMessage.equals(expectedRemarkMessage)) {
				reportHelper.onTestSuccess(test, "Remark Validation Successful | Expected: " + expectedRemarkMessage
						+ " | Actual: " + actualRemarkMessage);
			} else {
				reportHelper.onTestFailure(test, "Remark Validation Failed | Expected: " + expectedRemarkMessage
						+ " | Actual: " + actualRemarkMessage);
			}
		} catch (NoSuchElementException e) {
			reportHelper.onTestFailure(test, "Remark field not found");
		}
	}

	// Reusable method to close all notifications
	private void closeAllNotifications() {
		try {
			WebElement closeButtons = commonFields.btnNotificationClose();
			if (closeButtons.isDisplayed()) {
				closeButtons.click();
				Thread.sleep(500); // Allow time for each notification to close
			}

		} catch (Exception e) {
			System.out.println("Failed to close notifications: " + e.getMessage());
		}
	}

	public void checkNotificationPresenceAndHandleForCustomerOrder() throws IOException {
		commonFields.btnSave().click();
		String expectedMessage = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
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
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					if (actualMessage.equals(expectedMessage)) {
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

			}
		} catch (NoSuchElementException e) {
			// Handle the case where the notification element is not found
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

	public void checkValidatePresenceAndHandle() throws IOException {
		String expectedMessageValidate = getValueOrDefault(
				masterDto.getAttributeValue("After validate Expected Message"));
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
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					if (actualMessage.equals(expectedMessageValidate)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessageValidate + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessageValidate);
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessageValidate + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
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
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
	}

	public void checkOrderEstimatePresenceAndHandle() throws IOException {
		String expectedMessageOrderEstimate = getValueOrDefault(masterDto.getAttributeValue("Expected message"));
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
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					if (actualMessage.contains(expectedMessageOrderEstimate)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessageOrderEstimate + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessageOrderEstimate);
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessageOrderEstimate + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
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
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void checkValidationPresenceAndHandle() throws IOException {
		String expectedMessageOrderEstimate = getValueOrDefault(
				masterDto.getAttributeValue("After validate Expected Message"));
		try {
			// Locate the notification element
			WebElement notificationElement = driver.findElement(By.xpath("//div[@class='messageBar-messageRegion']"));

			String xpathExpression = "//div[@class='messageBar-messageRegion']";
			List<WebElement> messageElements = driver.findElements(By.xpath(xpathExpression));

			// Loop through each element and compare the text
			for (WebElement element : messageElements) {
				genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
				String actualMessage = element.getText();
				System.out.println("Actual Message: " + actualMessage);

				if (actualMessage.contains(expectedMessageOrderEstimate)) {
					reportHelper.onTestSuccess(test,
							"Expected: " + expectedMessageOrderEstimate + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, actualMessage);
					reportHelper.generateLogFullScreenSS(test, expectedMessageOrderEstimate);
				} else {
					reportHelper.onTestFailure(test,
							"Expected: " + expectedMessageOrderEstimate + " | Actual: " + actualMessage);
					reportHelper.generateLog(test, actualMessage);
					reportHelper.generateLogFullScreenSS(test, actualMessage);
				}
			}

		} catch (

		NoSuchElementException e) {
			// Handle the case where the notification element is not found
			reportHelper.onTestFailure(test, "No notification found");
			reportHelper.generateLog(test, "No notification found");
			reportHelper.generateLogFullScreenSS(test, "No notification found");
		} catch (Exception e) {
			// Handle any other exceptions that may occur
			reportHelper.onTestFailure(test, "An exception occurred while checking notification presence");
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		}
	}

	public void checkCancelEstimatePresenceAndHandle() throws IOException {
		String expectedMessageCancelled = getValueOrDefault(
				masterDto.getAttributeValue("After Cancelled Expected message"));
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
					String actualMessage = element.getText();
					System.out.println("Actual Message: " + actualMessage);

					if (actualMessage.equals(expectedMessageCancelled)) {
						reportHelper.onTestSuccess(test,
								"Expected: " + expectedMessageCancelled + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, expectedMessageCancelled);
					} else {
						reportHelper.onTestFailure(test,
								"Expected: " + expectedMessageCancelled + " | Actual: " + actualMessage);
						reportHelper.generateLog(test, actualMessage);
						reportHelper.generateLogFullScreenSS(test, actualMessage);
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
			reportHelper.generateLog(test, "An exception occurred while checking notification presence");
			reportHelper.generateLogWithScreenshot(test, "Exception occurred while checking notification presence");
		} finally {
			driver.navigate().refresh();
		}
	}

	public void compareSingleFieldValue(String fieldName) throws IOException {
		try {
			Object expectedValue = masterDto.getAttributeValue(fieldName);
			Object actualValue = getFieldValue(fieldName).getAttribute("value");

			// If both values are non-null, proceed
			if (expectedValue != null && actualValue != null) {
				String expectedStr = expectedValue.toString().trim();
				String actualStr = actualValue.toString().trim();

				// Check if actualStr contains commas, then handle accordingly
				if (isNumeric(expectedStr) && isNumeric(actualStr)) {
					double expectedNum, actualNum;

					if (actualStr.contains(",")) {
						// Remove commas from both expected and actual numbers
						expectedNum = Double.parseDouble(expectedStr.replace(",", "").replace(" ", ""));
						actualNum = Double.parseDouble(actualStr.replace(",", "").replace(" ", ""));
					} else {
						// No commas in actualStr, compare directly without removing commas
						expectedNum = Double.parseDouble(expectedStr);
						actualNum = Double.parseDouble(actualStr);
					}

					if (Double.compare(actualNum, expectedNum) == 0) {
						logSuccess(fieldName, actualNum, expectedNum);
					} else {
						logFailure(fieldName, actualNum, expectedNum);
					}

				} else if (isDate(expectedStr) && isDate(actualStr)) {
					// Handle date comparison if both expected and actual are dates
					Date expectedDate = parseDate(expectedStr);
					Date actualDate = parseDate(actualStr);

					if (expectedDate.equals(actualDate)) {
						logSuccess(fieldName, actualDate, expectedDate);
					} else {
						logFailure(fieldName, actualDate, expectedDate);
					}

				} else {
					// String comparison for non-numeric, non-date values
					if (actualStr.equals(expectedStr)) {
						logSuccess(fieldName, actualStr, expectedStr);
					} else {
						logFailure(fieldName, actualStr, expectedStr);
					}
				}
			} else {
				// Handle null cases
				if (expectedValue == null && actualValue == null) {
					reportHelper.onTestSuccess(test, "Both actual and expected values are null for " + fieldName);
				} else {
					reportHelper.onTestFailure(test, "Mismatch: actual or expected value is null for " + fieldName);
				}
			}

		} catch (NumberFormatException | NoSuchElementException e) {
			reportHelper.onTestFailure(test,
					"Failed to validate field: " + fieldName + " due to invalid format or missing element.");
			reportHelper.generateLogFullScreenSS(test, "Validation failed for field: " + fieldName);
		} catch (Exception e) {
			System.err.println("An error occurred while validating field: " + fieldName + ": " + e.getMessage());
			reportHelper.onTestFailure(test, "Error occurred while validating field: " + fieldName);
		}
	}

	public void compareSingleFieldTitle(String fieldName) throws IOException {
		try {
			Object expectedValue = masterDto.getAttributeValue(fieldName);
			String actualValue = getFieldValue(fieldName).getAttribute("title");

			// If both values are non-null, proceed
			if (expectedValue != null && actualValue != null) {
				String expectedStr = expectedValue.toString().trim();
				String actualStr = actualValue.toString().trim();

				// Check if actualStr contains commas, then handle accordingly
				if (isNumeric(expectedStr) && isNumeric(actualStr)) {
					double expectedNum, actualNum;

					if (actualStr.contains(",")) {
						// Remove commas from both expected and actual numbers
						expectedNum = Double.parseDouble(expectedStr.replace(",", "").replace(" ", ""));
						actualNum = Double.parseDouble(actualStr.replace(",", "").replace(" ", ""));
					} else {
						// No commas in actualStr, compare directly without removing commas
						expectedNum = Double.parseDouble(expectedStr);
						actualNum = Double.parseDouble(actualStr);
					}

					if (Double.compare(actualNum, expectedNum) == 0) {
						logSuccess(fieldName, actualNum, expectedNum);
					} else {
						logFailure(fieldName, actualNum, expectedNum);
					}

				} else if (isDate(expectedStr) && isDate(actualStr)) {
					// Handle date comparison if both expected and actual are dates
					Date expectedDate = parseDate(expectedStr);
					Date actualDate = parseDate(actualStr);

					if (expectedDate.equals(actualDate)) {
						logSuccess(fieldName, actualDate, expectedDate);
					} else {
						logFailure(fieldName, actualDate, expectedDate);
					}

				} else {
					// String comparison for non-numeric, non-date values
					if (actualStr.equals(expectedStr)) {
						logSuccess(fieldName, actualStr, expectedStr);
					} else {
						logFailure(fieldName, actualStr, expectedStr);
					}
				}
			} else {
				// Handle null cases
				if (expectedValue == null && actualValue == null) {
					reportHelper.onTestSuccess(test, "Both actual and expected values are null for " + fieldName);
				} else {
					reportHelper.onTestFailure(test, "Mismatch: actual or expected value is null for " + fieldName);
				}
			}

		} catch (NumberFormatException | NoSuchElementException e) {
			reportHelper.onTestFailure(test,
					"Failed to validate field: " + fieldName + " due to invalid format or missing element.");
			reportHelper.generateLogFullScreenSS(test, "Validation failed for field: " + fieldName);
		} catch (Exception e) {
			System.err.println("An error occurred while validating field: " + fieldName + ": " + e.getMessage());
			reportHelper.onTestFailure(test, "Error occurred while validating field: " + fieldName);
		}
	}

	// Utility to check if a string is numeric
	private boolean isNumeric(String str) {
		try {
			Double.parseDouble(str.replace(",", "").replace(" ", ""));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// Utility to check if a string is a valid date
	private boolean isDate(String str) {
		try {
			new SimpleDateFormat("dd/MM/yyyy").parse(str); // Adjust date format if necessary
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	// Utility to parse a string into a date
	private Date parseDate(String str) throws ParseException {
		return (Date) new SimpleDateFormat("dd/MM/yyyy").parse(str); // Adjust date format if necessary
	}

	// Log success message
	private void logSuccess(String fieldName, Object actualValue, Object expectedValue) throws IOException {
		reportHelper.onTestSuccess(test,
				"Actual value of " + fieldName + " is equal to expected value: " + actualValue);
		reportHelper.generateLog(test, "Actual value of " + fieldName + " matches expected value.");
		reportHelper.generateLogFullScreenSS(test, "Actual value of " + fieldName + " is equal to expected value.");
	}

	// Log failure message
	private void logFailure(String fieldName, Object actualValue, Object expectedValue) throws IOException {
		reportHelper.onTestFailure(test, "Actual value of " + fieldName + " (" + actualValue
				+ ") does not match expected value (" + expectedValue + ").");
		reportHelper.generateLog(test, "Actual value of " + fieldName + " does not match expected value.");
		reportHelper.generateLogFullScreenSS(test, "Actual value of " + fieldName + " does not match expected value.");
	}

	public WebElement getFieldValue(String fieldName) {
		switch (fieldName) {
		case "Purch Trans Value *":
			System.out.println("Purch Trans Value");
			return commonFields.txtPurchTransValue();
		case "Old Ornament Value":
			return commonFields.txtOldOrnamentValue();
		case "Deduction":
			return commonFields.txtDeduction();
		case "Purity Carat":
			System.out.println("Purity Carat");
			return commonFields.txtPrePurityCarat();
		case "Net Weight *":
			return commonFields.txtNetWeight();
		case "Rate *":
			return commonFields.txtPreRate();

		default:
			throw new IllegalArgumentException("Invalid field name: " + fieldName);
		}
	}

}
