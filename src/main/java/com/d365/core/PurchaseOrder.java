//package com.d365.core;
//
//import java.awt.AWTException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Map;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import com.d365.utils.MasterClass;
//
//public class PurchaseOrder extends MasterClass {
//
//	public void addData() throws InterruptedException, AWTException, IOException, InvalidFormatException {
//
//		// Method to navigate to the purchase order page and perform validations
//		navigateToPage(purchaseOrder.allPurchaseOrders(), purchaseOrder.accountPayable());
//
//		// Method to validate fields on the page
////		validateFields("Vendor Account", purchaseOrder.vendorAccountPO(), 3);
//
//		// Method to validate header fields
////		validateHeaderFields();
//
//		// Method to check calculations
////		checkCalculations();
//
//		// Loop through Excel data to add purchase orders
//		for (int rowIndex = 1; rowIndex <= excelHelper.rowCountExcel(excelPath + "purchaseOrder_TestData.xlsx",
//				"Sheet1"); rowIndex++) {
//			genericHelper.clickWithJavascriptExecutor(purchaseOrder.newBtnPo());
//			Map<String, String> orderData = excelHelper.readExcelDataAndMap(excelPath + "purchaseOrder_TestData.xlsx",
//					"Sheet1", rowIndex);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//
//			addHeaderAndAddlineEnterAddItemDetails();
//
////			saveOrderAndHandleErrors();
//		}
//	}
//
//	public void addHeaderAndAddlineEnterAddItemDetails() throws InterruptedException, IOException {
//
//		// Enter Vendor Account
//		enterData(purchaseOrder.vendorAccountPO(), "Vendor Account");
//
//		// Enter Purchase Type
////		enterData(purchaseOrder.purchaseType(), "Purchase Type");
//
//		// Enter Site
//		enterData(purchaseOrder.sitePO(), "Site");
//
//		// Enter Warehouse
//		enterData(purchaseOrder.warehousePO(), "Warehouse");
//
//		// Enter Item Number
//		enterData(purchaseOrder.itemNumberPO(), "Item Number");
//
//		// Enter Variant number
////		enterData(purchaseOrder.variantNumberPO(), "Variant Number");
//
//		// Enter Inventory Item
//		enterData(purchaseOrder.inventoryItemPO(), "Inventory Item");
//
//		// Enter Inventory Item
//		enterData(purchaseOrder.inventoryItemPO(), "Configuration");
//
//		// Enter Inventory Variant Id
//		enterData(purchaseOrder.inventoryVariantIdPO(), "Inventory Variant Id");
//
//		// Enter Unit
////		enterData(purchaseOrder.unitPO(), "Unit");
//
//		// Enter Purity
////		enterData(purchaseOrder.purityPO(), "Purity");
//
//		// Enter PCS
////		enterData(purchaseOrder.pcsPO(), "PCS");
//
//		// Enter Size Range
//		enterData(purchaseOrder.alSizeRange(), "Size Range");
//
//		// Enter Weight Range
////		enterData(purchaseOrder.alWeightRange(), "Weight Range");
//		enterData(purchaseOrder.alFromWeight(), "From Weight");
//		enterData(purchaseOrder.aiToWeight(), "To Weight");
////		enterData(purchaseOrder.alExactWt(), "Exact Weight");
//		enterData(purchaseOrder.alPcs(), "Annexure Line Pcs");
////		enterData(purchaseOrder.alQty(), "Annexure Line Quantity");
//		enterData(purchaseOrder.dsDeliveryDate(), "Delivery date");
//		enterData(purchaseOrder.alFromPurity(), "From Purity");
//		enterData(purchaseOrder.alToPurity(), "To Purity");
//
//		// Enter Delivery date
////		enterData(purchaseOrder.dsDeliveryDate(), "Delivery date");
//	}
//
//	public void enterAnnexurePoLineDetails() throws InterruptedException, IOException {
////        enterData(purchaseOrder.purchaseOrderPO(), "Purchase order");
////        enterData(purchaseOrder.annexureLineNo(), "Annexure line No.");
////        enterData(purchaseOrder.itemId(), "Item Id");
////        enterData(purchaseOrder.productName(), "Product Name");
//		enterData(purchaseOrder.alSizeRange(), "Size Range");
//		enterData(purchaseOrder.alFromWeight(), "From Weight");
//		enterData(purchaseOrder.aiToWeight(), "To Weight");
//		enterData(purchaseOrder.alExactWt(), "Exact Weight");
//		enterData(purchaseOrder.alPcs(), "Annexure Line Pcs");
//		enterData(purchaseOrder.alQty(), "Annexure Line Quantity");
//		enterData(purchaseOrder.dsDeliveryDate(), "Delivery date");
//		enterData(purchaseOrder.alFromPurity(), "From Purity");
//		enterData(purchaseOrder.alToPurity(), "To Purity");
//	}
//
//	// Method to enter data
//	public void enterData(WebElement field, String attribute) throws IOException, InterruptedException {
//		genericHelper.clearAndSendKeysWithJavascriptExecutor(field,
//				getValueOrDefault(masterDto.getAttributeValue(attribute)));
//		reportHelper.generateLog(test, attribute + ": " + field);
//		reportHelper.generateLogWithScreenshot(test, attribute + " SS");
//	}
//
//	public void checkCalculations() throws IOException, InterruptedException, InvalidFormatException {
//		genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
//		Map<String, String> orderData = excelHelper
//				.readExcelDataAndMap(excelPath + "customerOrder_TestData_20240131.xlsx", "Sheet1", 4);
//		for (Map.Entry<String, String> entry : orderData.entrySet()) {
//			masterDto.setAttribute(entry.getKey(), entry.getValue());
//		}
//
//		addHeaderAndAddlineEnterAddItemDetails();
//
//		String[] fields = { "Purity", "Order Pieces", "Gross Order Qty", "Net Order Qty", "Fine Order Qty",
//				"Order Rate", "Making Rate", "Making Charge", "Order Value", "Metal Value", "Wastage Code",
//				"Stone amount" };
//
//		try {
//			for (String fieldName : fields) {
//				try {
//					Object expectedValue = masterDto.getAttribute(fieldName);
//					Object actualValue = getFieldValue(fieldName);
//					if (expectedValue != null) {
//						if (fieldName == "Wastage Code") {
//							expectedValue = expectedValue.toString();
//							System.out.println("expectedValue: " + expectedValue);
//							actualValue = getFieldValue(fieldName).getAttribute("value").toString();
//							System.out.println("actualValue: " + fieldName + " " + actualValue);
//						} else {
//							expectedValue = Double.parseDouble(masterDto.getAttribute(fieldName).toString());
//							System.out.println("expectedValue: " + fieldName + " " + expectedValue);
//
//							actualValue = Double.parseDouble(getFieldValue(fieldName).getAttribute("value").toString());
//							System.out.println("actualValue: " + fieldName + " " + actualValue);
//						}
//					}
//
//					softAssert.assertEquals(actualValue, expectedValue,
//							"Expected value of " + fieldName + " does not match actual value");
//					reportHelper.onTestSuccess(test, "actual Value of " + fieldName + " is equal to expected Value");
//					reportHelper.generateLogFullScreenSS(test,
//							"actual Value of " + fieldName + " is equal to expected Value");
//				} catch (NumberFormatException | NoSuchElementException e) {
//					reportHelper.onTestFailure(test, "Failed to validate field: " + fieldName);
//					reportHelper.generateLogFullScreenSS(test, "Failed to validate field: " + fieldName);
//				}
//			}
//			driver.navigate().refresh();
////		softAssert.assertAll(); // Assert all collected failures
//		} catch (Exception e) {
//			System.err.println("An error occurred while checking formulas: " + e.getMessage());
//		}
//	}
//
//	private WebElement getFieldValue(String fieldName) {
//		switch (fieldName) {
//		case "Purity":
//			System.out.println("Purity switch");
//			return customerOrder.purity();
//		case "Order Pieces":
//			return customerOrder.orderPcs();
//		case "Gross Order Qty":
//			return customerOrder.grossOrderQty();
//		case "Net Order Qty":
//			return customerOrder.netOrderQty();
//		case "Fine Order Qty":
//			return customerOrder.fineOrderQty();
//		case "Order Rate":
//			return customerOrder.orderRate();
//		case "Making Rate":
//			return customerOrder.makingRate();
//		case "Making Charge":
//			return customerOrder.makingCharge();
//		case "Order Value":
//			return customerOrder.orderValue();
//		case "Metal Value":
//			return customerOrder.metalValue();
////		case "Order Status":
////			return customerOrder.Order_StatusLine();
//		case "Wastage Code":
//			return customerOrder.wastageCode();
//		case "Stone amount":
//			return customerOrder.stoneAmount();
//		default:
//			throw new IllegalArgumentException("Invalid field name: " + fieldName);
//		}
//	}
//
//	public void validateHeaderFields() throws IOException, InterruptedException, InvalidFormatException {
//		try {
//			validateFields("Customer No.", customerOrder.customerNo(), 1);
//			validateFields("Sales Person", customerOrder.salesPerson(), 2);
//			validateFields("Customer No.", customerOrder.manualOrderNo(), 4);
//		} catch (InterruptedException | IOException | InvalidFormatException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void validateFields(String fieldName, WebElement element, int rowNum)
//			throws IOException, InterruptedException, InvalidFormatException {
//		try {
//			genericHelper.clickWithJavascriptExecutor(customerOrder.newButton());
//			Map<String, String> orderData = excelHelper
//					.readExcelDataAndMap(excelPath + "customerOrder_TestData_20240131.xlsx", "Sheet1", rowNum);
//			for (Map.Entry<String, String> entry : orderData.entrySet()) {
//				masterDto.setAttribute(entry.getKey(), entry.getValue());
//			}
//			test = reportHelper.createTestCase(test, extentReports, masterDto);
//			genericHelper.clearAndsendKeysAndEnter(element, getValueOrDefault(masterDto.getAttributeValue(fieldName)));
//
//			if (fieldName != null && fieldName.equals(fieldName)) {
//				try {
//					WebElement salePerson = driver
//							.findElement(By.xpath("//input[contains(@id,'SysGen_AgentCode') and contains(@value,'"
//									+ masterDto.getAttributeValue(fieldName) + "')]"));
//
//					if (salePerson.isDisplayed()) {
//						reportHelper.onTestSuccess(test, "Sale Person is deactivated");
//						reportHelper.generateLogFullScreenSS(test, "Sale Person is deactivated");
//					} else {
//						reportHelper.onTestFailure(test, "Sale Person is active for " + fieldName);
//						reportHelper.generateLogFullScreenSS(test, "Sale Person is active for " + fieldName);
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			reportHelper.generateLog(test, fieldName + ": " + element.getText());
//			genericHelper.clickWithJavascriptExecutor(customerOrder.saveButton());
//			saveOrderAndHandleErrors();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public Integer rowCountExcelSheet(String fileName, String shName) throws IOException {
//		String file_path = fileName;
//		FileInputStream fi = new FileInputStream(file_path);
//		XSSFWorkbook wb = new XSSFWorkbook(fi);
//		sheet = wb.getSheet(shName);
//		int a = sheet.getLastRowNum();
//		int b = sheet.getPhysicalNumberOfRows();
//		System.out.println("count " + a);
//		return a;
//
//	}
//
//	public Object fetchDataIM(String fileName, int r, int col, int sheetIndex) throws IOException {
//		Object data = null;
//		String path = fileName;
//		File f = new File(path);
//		FileInputStream fi = new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(fi);
//		sheet = wb.getSheetAt(sheetIndex);
//		XSSFRow row = sheet.getRow(r);
//		if (row != null) {
//			Cell cell = row.getCell(col);
//			if (cell != null) {
//				switch (cell.getCellType()) {
//				case STRING:
//					data = cell.getStringCellValue();
//					break;
//				case NUMERIC:
//					double doubleVal = cell.getNumericCellValue();
//					if (doubleVal % 1 == 0) {
//						data = (int) doubleVal;
//					} else {
//						data = doubleVal;
//					}
//					break;
//				default:
//					break;
//				}
//			}
//		}
//
//		int rowCount = sheet.getPhysicalNumberOfRows();
//		System.out.println("Row count: " + rowCount);
//
//		wb.close();
//		return data;
//	}
//
//	public void addItem() throws InterruptedException, IOException {
//		purchaseOrder.modules().click();
//		Thread.sleep(1500);
//		genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
//				purchaseOrder.productInfoManage());
//		Thread.sleep(1500);
//		purchaseOrder.productInfoManage().click();
//		Thread.sleep(1500);
//		purchaseOrder.expandAll().click();
//		Thread.sleep(1500);
//		purchaseOrder.releaseProd().click();
//		Thread.sleep(1500);
//
//		int rowCountItem = rowCountExcelSheet("ProductUat.xlsx", "ItemMaster");
//		System.out.println("rowCountItem " + rowCountItem);
//
//		for (int i = 1; i <= rowCountItem; i++) {
//			purchaseOrder.add().click();
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';", purchaseOrder.productType());
//			purchaseOrder.productType().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 0, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.productSubType().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 1, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.productNumber().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 2, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.productName().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 3, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			String searchN = purchaseOrder.searchName().getText();
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			String itemNumber = purchaseOrder.itemNumber().getText();
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			String searchItem = purchaseOrder.searchItem().getText();
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.retailDropdown().click();
//			Thread.sleep(1500);
////				purchaseOrder.retailFilter().sendKeys(String.valueOf(fetchDataIM(i, 4)));
//			genericHelper.actions.click(purchaseOrder.retailFilter())
//					.sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 4, 1)), Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//
////				purchaseOrder.retailCategory().sendKeys(String.valueOf(fetchDataIM(i, 4)));
//			genericHelper.actions.click(purchaseOrder.ok()).sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();", purchaseOrder.itemGroup());
//			Thread.sleep(1500);
//			purchaseOrder.productDimensionGroup().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 5, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.itemModelGroup().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 7, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.itemGroup().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 8, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.storageDimensionGroup().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 9, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.trackingDimensionGroup().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 10, 1)));
//			genericHelper.actions.sendKeys(Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.inventoryUnit().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 11, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.purchUnit().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 12, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.salesUnit().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 13, 1)));
//			genericHelper.actions.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(1500);
//			purchaseOrder.BOMUnit().sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 14, 1)));
//			genericHelper.actions.sendKeys(Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//
//			WebElement expandGeneral = purchaseOrder.generalTab();
////				expandGeneral.click();
//			genericHelper.actions.click(expandGeneral).build().perform();
//			Thread.sleep(1500);
//			genericHelper.actions.contextClick(expandGeneral).build().perform();
//			Thread.sleep(1500);
//				purchaseOrder.expandAllTabs().click();
//			Thread.sleep(1500);
//
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';", purchaseOrder.itemCategory());
//			Thread.sleep(1500);
//			genericHelper.actions.click(purchaseOrder.itemCategory())
//					.sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 15, 1)), Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';", purchaseOrder.hsnCodes());
//			Thread.sleep(1500);
//			genericHelper.actions.click(purchaseOrder.hsnCodes())
//					.sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 16, 1)), Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//
//			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
//					purchaseOrder.approvedVendor());
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';", purchaseOrder.approvedVendor());
//			Thread.sleep(1500);
//			genericHelper.actions.click(purchaseOrder.approvedVendor()).sendKeys("No check", Keys.ENTER).build()
//					.perform();
//			Thread.sleep(1500);
//
//			genericHelper.javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
//					purchaseOrder.itemTypeCodeCustom());
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';",
//					purchaseOrder.itemTypeCodeCustom());
//			Thread.sleep(1500);
//			genericHelper.actions.click(purchaseOrder.itemTypeCodeCustom())
//					.sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 17, 1)), Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//			String purityCheckBox = purchaseOrder.purityApplicable().getAttribute("aria-checked");
////				System.out.println("t " + t);
//			String teststr = String.valueOf(fetchDataIM("ProductUat.xlsx", i, 17, 1));
//			if (teststr.contains("STERLING") || teststr.contains("PLATINUM")) {
//				if (purityCheckBox.equalsIgnoreCase("false")) {
//					purchaseOrder.purityApplicable().click();
//					Thread.sleep(1500);
//				}
//			}
////				purchaseOrder.makingServiceItem().click();
//			Thread.sleep(1500);
//			genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';",
//					purchaseOrder.makingServiceItem());
//			Thread.sleep(1500);
//			genericHelper.actions.click(purchaseOrder.makingServiceItem())
//					.sendKeys(String.valueOf(fetchDataIM("ProductUat.xlsx", i, 19, 1)), Keys.TAB).build().perform();
//			Thread.sleep(1500);
//
////				purchaseOrder.defaultPurity().click();
//			if (teststr.contains("STERLING") || teststr.contains("PLATINUM")) {
//				String purity = String.valueOf(fetchDataIM("ProductUat.xlsx", i, 20, 1));
//				genericHelper.javascriptExecutor.executeScript("arguments[0].value = '';",
//						purchaseOrder.defaultPurity());
//				Thread.sleep(1500);
//				excelNullCellCheck(purity, purchaseOrder.defaultPurity());
//				Thread.sleep(1500);
//			}
//			purchaseOrder.productTab().click();
//			Thread.sleep(1500);
//
//			purchaseOrder.productDimensionsV().click();
//			Thread.sleep(1500);
//			purchaseOrder.configurationTab().click();
//			Thread.sleep(1500);
//
////				for (int item = 1; item <= rowCountItem; item++) {
////					purchaseOrder.newConfiguration().click();
////					Thread.sleep(1500);
////					String variant1 = String.valueOf(fetchDataIM(i, 21));
////					excelNullCellCheck(variant1, purchaseOrder.variantName());
////					Thread.sleep(1500);
////					String variant2 = String.valueOf(fetchDataIM(i, 22));
////					excelNullCellCheck(variant2, purchaseOrder.variantName());
////				}
//
////				purchaseOrder.newConfiguration().click();
//			Thread.sleep(1500);
//			for (int col : new int[] { 21, 22 }) {
//				purchaseOrder.newConfiguration().click();
//				Thread.sleep(1500);
//				String variantData = String.valueOf(fetchDataIM("ProductUat.xlsx", i, col, 1));
//				Thread.sleep(1500);
//				excelNullCellCheck(variantData, purchaseOrder.variantName());
//				Thread.sleep(1500);
//			}
//			genericHelper.javascriptExecutor.executeScript("arguments[0].click();", purchaseOrder.backButton());
//		}
//	}
//
//	public void excelNullCellCheck(String excelCellData, WebElement element) throws InterruptedException {
//		if ((excelCellData == null) || (excelCellData == "")) {
//			return;
//		} else {
//			genericHelper.actions.click(element).sendKeys(excelCellData, Keys.ENTER).build().perform();
//			Thread.sleep(1500);
//		}
//	}
//}
