package com.d365.core;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class Rng extends MasterClass {

	
	public void addData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);

		checkNotificationPresenceAndHandle(masterDto);

		Thread.sleep(2000);

		String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");
		String splittagstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("RNG Tag Status"), "");

		genericHelper.clickWithJavascriptExecutor(alltagpage.clickModules());
		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(alltagpage.clickJewellery());
		genericHelper.clickWithJavascriptExecutor(alltagpage.clickAllTags());
		genericHelper.clickWithJavascriptExecutor(alltagpage.clickOkButton());
		Thread.sleep(1000);

		WebElement batchn = alltagpage.clickBatchNo();
		genericHelper.scrollingTillWebElement(batchn);
		genericHelper.clickWithJavascriptExecutor(alltagpage.clickBatchNo());

		alltagpage.enterBatchNo().sendKeys(tag);
		Thread.sleep(4000);
		alltagpage.clickApply().click();
		Thread.sleep(2000);

		WebElement statuscolumn = rngpage.getStatusColumn();
		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView({inline: 'center'});",
				statuscolumn);
		// genericHelper.scrollingTillWebElement(statuscolumn);
		Thread.sleep(2000);

		WebElement tags = rngpage.checkTagStatus();
		String getstatus = tags.getAttribute("value");
		System.out.println("Get Status is:" + getstatus);

		if (getstatus.equals(splittagstatus)) {
			reportHelper.onTestSuccess(test, "Tag status is" + getstatus + "is displayed: ");
		} else {
			reportHelper.onTestFailure(test, "Tag status is" + getstatus + "is not displayed:");
		}

		// driver.navigate().refresh();

	}

	

	public void checkValidatedGeneratedPostTag() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		checkNotificationPresenceAndHandleGenerate();
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		checkNotificationPresenceAndHandleValidate();
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);
	}

	
	public void checkNavigation() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);

	}

	
	public void negativeData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		// genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);

	}

	
	public void deleteData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickDelete());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickYes());
		try {
			WebElement itemid = rngpage.checkItemid();
			if (itemid.isDisplayed()) {
				reportHelper.onTestFailure(test, "Line not deleted");
				reportHelper.generateLogFullScreenSS(test, "Line not deleted");
			} else {
				reportHelper.onTestSuccess(test, "Line Deleted");
				reportHelper.generateLogFullScreenSS(test, "Line deleted");
			}
		} catch (Exception e) {
			reportHelper.onTestSuccess(test, "Line deleted");
			reportHelper.generateLogFullScreenSS(test, "Line Deleted As no Element found");
		}

	}

	
	public void postEnableDisable() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		// genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());
		if (rngpage.clickPost().isEnabled()) {
			reportHelper.onTestSuccess(test, "Before post tag post button is enable");
			reportHelper.generateLogFullScreenSS(test, "Before post tag post button is enable");
		} else {
			reportHelper.onTestFailure(test, "Before post tag post button is not enable");
			reportHelper.generateLogFullScreenSS(test, "Before post tag post button is not enable");
		}
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		Thread.sleep(3000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(2000);
		try {
			if (!rngpage.clickPost().isEnabled()) {
				// reportHelper.onTestSuccess(test, "After post tag post button is disable");
				reportHelper.generateLogFullScreenSS(test, "After post tag post button is  disable");
			} else {
				// reportHelper.onTestFailure(test, "After post tag post button is not
				// disable");
				reportHelper.generateLogFullScreenSS(test, "After post tag post button is not disable");
			}
		} catch (Exception e) {
			// reportHelper.onTestFailure(test, "After post tag post button is not
			// disable");
			reportHelper.generateLogFullScreenSS(test, "After post tag post button is not disable");
		}
		Thread.sleep(2000);

	}

	
	public void addDData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String quantity1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity1"), "");
		String quantity2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity2"), "");

		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on RNG process");

		// genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterDQuantity(), quantity1);
		// genericHelper.clearAndSendKeysWithJavascriptExecutor(rngpage.enterSQuantity(),
		// quantity2);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());

	}

	
	public void addMultipleData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String quantity1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity1"), "");

		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on RNG process");

		genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		// genericHelper.clickWithJavascriptExecutor(rngpage.selectTick());
		Thread.sleep(2000);
		// genericHelper.scrollingTillWebElement(rngpage.selectTick1());
		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick1());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity1);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(2000);

	}

	

	public void addMultipleNegativeData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String quantity1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity1"), "");

		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on RNG process");

		genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		// genericHelper.clickWithJavascriptExecutor(rngpage.selectTick());
		Thread.sleep(2000);
		// genericHelper.scrollingTillWebElement(rngpage.selectTick1());
		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick1());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity1);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

	}

	
	public void validateStatus() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String tagstatus1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusTag"), "");
		String tagstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusITag"), "");

		WebElement getstatus = rngpage.checkStatus();
		String status = getstatus.getAttribute("title");
		System.out.println("Initially status:" + status);

		try {

			if (status.equals(tagstatus)) {
				reportHelper.onTestSuccess(test, "Open status is display");
				reportHelper.generateLogFullScreenSS(test, "Open status is display");
			} else {
				reportHelper.onTestFailure(test, "Open status is not display");
				reportHelper.generateLogFullScreenSS(test, "Open status is not display");
			}
		} catch (Exception e) {
			reportHelper.onTestFailure(test, "Open status is not display");
			reportHelper.generateLogFullScreenSS(test, "Open status is not display");
		}

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);
		WebElement getstatus1 = rngpage.checkStatus();
		genericHelper.scrollingTillWebElement(getstatus1);
		String status1 = getstatus1.getAttribute("title");
		System.out.println("Posted Status:" + status1);

		try {

			if (status1.equals(tagstatus1)) {
				reportHelper.onTestSuccess(test, "Posted status is display");
				reportHelper.generateLogFullScreenSS(test, "Posted status is display");
			} else {
				reportHelper.onTestFailure(test, "Posted status is not display");
				reportHelper.generateLogFullScreenSS(test, "Posted status is not display");
			}
		} catch (Exception e) {
			reportHelper.onTestFailure(test, "Posted status is not display");
			reportHelper.generateLogFullScreenSS(test, "Posted status is not display");
		}
		Thread.sleep(2000);

	}

	
	public void negativeQuantity() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);

	}

	
	public void validateToggleButton() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String vistatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusNo"), "");
		String vstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusYes"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		WebElement toggle = rngpage.checkToggle();
		String state = toggle.getAttribute("aria-checked");
		if ("false".equals(state)) {
			reportHelper.onTestSuccess(test, "Toggle button is selected as NO");
			System.out.println("Toggle is ON.");
		} else {
			reportHelper.onTestFailure(test, "Toggle button is not selected as NO");
			System.out.println("Toggle is OFF.");
		}

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

		WebElement toggle1 = rngpage.checkToggle();
		String state1 = toggle1.getAttribute("aria-checked");
		if ("true".equals(state1)) {
			reportHelper.onTestSuccess(test, "Toggle button is Selected as Yes");
			System.out.println("Toggle is ON.");
		} else {
			reportHelper.onTestFailure(test, "Toggle button is not Selected as Yes");
			System.out.println("Toggle is OFF.");
		}

//		
//		 try {
//				
//				if (rngpage.checkToggle().isEnabled()) {
//					reportHelper.onTestSuccess(test, "Toggle button is Yes");
//					reportHelper.generateLogFullScreenSS(test, "Toggle button is Yes");
//				} else {
//					reportHelper.onTestFailure(test, "Toggle button is not Yes");
//					reportHelper.generateLogFullScreenSS(test, "Toggle button is not Yes");
//				}
//			} catch (Exception e) {
//				reportHelper.onTestFailure(test, "Toggle button is not Yes");
//				reportHelper.generateLogFullScreenSS(test, "Toggle button is not Yes");
//			}
		Thread.sleep(2000);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);

	}

	
	public void validateDate() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String vistatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusNo"), "");
		String vstatus = StringUtils.defaultIfBlank(masterDto.getAttributeValue("StatusYes"), "");
		String date = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Date"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		try {
			// Validate Ship Date
			WebElement transdate = rngpage.checkDate();
			String datecheck = transdate.getAttribute("title"); // Example: "12/7/2024"

			// Parse and compare dates
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate webDate = LocalDate.parse(datecheck, dateFormat);
			LocalDate currentDate = LocalDate.now();

			System.out.println("Displayed trans Date: " + datecheck);
			System.out.println("Parsed trans Date: " + webDate);
			System.out.println("Current System Date: " + currentDate);

			// Compare displayed date with current date
			if (webDate.equals(currentDate)) {
				reportHelper.onTestSuccess(test, "The displayed date matches the current date");
			} else {
				reportHelper.onTestFailure(test, "The displayed date does NOT match the current date.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("An error occurred while validating the trans date.");
		}

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());
		Thread.sleep(5000);

	}

	

	public void addValidateQuantityPreTagHeader() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());
		Thread.sleep(3000);
		rngpage.notificationCloseButton();
		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		Thread.sleep(2000);
		genericHelper.actions.sendKeys(Keys.TAB).build().perform();

//		checkNotificationPresenceAndHandle(masterDto);

//		checkNotificationPresenceAndHandleForRNG();

	}
	
	public void addDaimondMultipleData() throws InterruptedException, IOException {

		String tagNo = StringUtils.defaultIfBlank(masterDto.getAttributeValue("TagNo"), "");

		String generatequantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Generate Type Quantity"), "");

		String quantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");
		String quantity1 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity1"), "");
		String quantity2 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity2"), "");
		String quantity3 = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity3"), "");

		reportHelper.generateLogFullScreenSS(test, "Succesfully Navigate on RNG process");

		// genericHelper.clickWithJavascriptExecutor(rngpage.enterTagno());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterTagno(), tagNo);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickTaggeneration());

		genericHelper.clearAndSendKeysAndEnter(rngpage.enterGeneratetag(), generatequantity);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickOk());

		genericHelper.clickWithJavascriptExecutor(rngpage.clickIDTagHeader());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());

		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity);
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterDQuantity(), quantity1);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		
		genericHelper.clickWithJavascriptExecutor(rngpage.selectTick1());
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagline());
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterQuantity(), quantity2);
		genericHelper.sendKeysWithjavascriptExecutor(rngpage.enterDQuantity(), quantity3);
		genericHelper.clickWithJavascriptExecutor(rngpage.clickPretagHeader());
		Thread.sleep(2000);
	
		genericHelper.clickWithJavascriptExecutor(rngpage.clickValidate());
		Thread.sleep(2000);

		genericHelper.clickWithJavascriptExecutor(rngpage.clickPost());

	}

	public String getValueOrDefault(String value) {
		return value != null ? value : "";
	}

}
