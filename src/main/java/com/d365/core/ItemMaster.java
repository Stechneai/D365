//package com.d365.core;
//
//import java.io.IOException;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//
//import com.d365.utils.MasterClass;
//import com.sharedutils.GenericHelper;
//
//public class ItemMaster extends MasterClass {
//	
//	
//	public void addItem() throws InterruptedException, IOException {
//		.modules().click();
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView();", im.productInfoManage());
//		Thread.sleep(3000);
//		im.productInfoManage().click();
//		Thread.sleep(3000);
//		im.expandAll().click();
//		Thread.sleep(3000);
//		im.releaseProd().click();
//		Thread.sleep(3000);
//
//		int rowCountItem = ex.rowCountExcelSheet("ItemMaster.xlsx", "Sterling");
//		System.out.println("rowCountItem " + rowCountItem);
//
//		for (int i = 1; i <= rowCountItem; i++) {
//			im.add().click();
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].value = '';", im.productType());
//			im.productType().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 0, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			Gen
//			im.productSubType().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 1, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.productNumber().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 2, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.productName().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 3, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			String searchN = im.searchName().getText();
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			String itemNumber = im.itemNumber().getText();
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			String searchItem = im.searchItem().getText();
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.retailDropdown().click();
//			Thread.sleep(3000);
////			im.retailFilter().sendKeys(String.valueOf(ex.fetchDataIM(i, 4)));
//			act.click(im.retailFilter())
//					.sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 4, 1)), Keys.ENTER).build().perform();
//			Thread.sleep(3000);
//
////			im.retailCategory().sendKeys(String.valueOf(ex.fetchDataIM(i, 4)));
//			act.click(im.ok()).sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].scrollIntoView();", im.itemGroup());
//			Thread.sleep(3000);
//			im.productDimensionGroup().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 5, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.itemModelGroup().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 7, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.itemGroup().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 8, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.storageDimensionGroup().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 9, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.trackingDimensionGroup().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 10, 1)));
//			act.sendKeys(Keys.ENTER).build().perform();
//			Thread.sleep(3000);
//			im.inventoryUnit().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 11, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.purchUnit().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 12, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.salesUnit().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 13, 1)));
//			act.sendKeys(Keys.TAB).build().perform();
//			Thread.sleep(3000);
//			im.BOMUnit().sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 14, 1)));
//			act.sendKeys(Keys.ENTER).build().perform();
//			Thread.sleep(3000);
//
//			WebElement expandGeneral = im.generalTab();
////			expandGeneral.click();
//			act.click(expandGeneral).build().perform();
//			Thread.sleep(3000);
//			act.contextClick(expandGeneral).build().perform();
//			Thread.sleep(3000);
//			im.expandAllTabs().click();
//			Thread.sleep(3000);
//
//			js.executeScript("arguments[0].value = '';", im.itemCategory());
//			Thread.sleep(3000);
//			act.click(im.itemCategory())
//					.sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 15, 1)), Keys.ENTER).build()
//					.perform();
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].value = '';", im.hsnCodes());
//			Thread.sleep(3000);
//			act.click(im.hsnCodes()).sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 16, 1)), Keys.ENTER)
//					.build().perform();
//			Thread.sleep(3000);
//
//			js.executeScript("arguments[0].scrollIntoView();", im.approvedVendor());
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].value = '';", im.approvedVendor());
//			Thread.sleep(3000);
//			act.click(im.approvedVendor()).sendKeys("No check", Keys.ENTER).build().perform();
//			Thread.sleep(3000);
//
//			js.executeScript("arguments[0].scrollIntoView();", im.itemTypeCodeCustom());
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].value = '';", im.itemTypeCodeCustom());
//			Thread.sleep(3000);
//			act.click(im.itemTypeCodeCustom())
//					.sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 17, 1)), Keys.ENTER).build()
//					.perform();
//			Thread.sleep(3000);
//			String purityCheckBox = im.purityApplicable().getAttribute("aria-checked");
//			System.out.println("t " + t);
//			String teststr = String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 17, 1));
//			if (teststr.contains("STERLING") || teststr.contains("PLATINUM")) {
//				if (purityCheckBox.equalsIgnoreCase("false")) {
//					im.purityApplicable().click();
//					Thread.sleep(3000);
//				}
//			}
////			im.makingServiceItem().click();
//			Thread.sleep(3000);
//			js.executeScript("arguments[0].value = '';", im.makingServiceItem());
//			Thread.sleep(3000);
//			act.click(im.makingServiceItem())
//					.sendKeys(String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 19, 1)), Keys.TAB).build().perform();
//			Thread.sleep(3000);
//
////			im.defaultPurity().click();
//			if (teststr.contains("STERLING") || teststr.contains("PLATINUM")) {
//				String purity = String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, 20, 1));
//				js.executeScript("arguments[0].value = '';", im.defaultPurity());
//				Thread.sleep(3000);
//				excelNullCellCheck(purity, im.defaultPurity());
//				Thread.sleep(3000);
//			}
//			im.productTab().click();
//			Thread.sleep(3000);
//
//			im.productDimensionsV().click();
//			Thread.sleep(3000);
//			im.configurationTab().click();
//			Thread.sleep(3000);
//
////			for (int item = 1; item <= rowCountItem; item++) {
////				im.newConfiguration().click();
////				Thread.sleep(3000);
////				String variant1 = String.valueOf(ex.fetchDataIM(i, 21));
////				excelNullCellCheck(variant1, im.variantName());
////				Thread.sleep(3000);
////				String variant2 = String.valueOf(ex.fetchDataIM(i, 22));
////				excelNullCellCheck(variant2, im.variantName());
////			}
//
////			im.newConfiguration().click();
//			Thread.sleep(3000);
//			for (int col : new int[] { 21, 22 }) {
//				im.newConfiguration().click();
//				Thread.sleep(3000);
//				String variantData = String.valueOf(ex.fetchDataIM("itemMaster.xlsx", i, col, 1));
//				Thread.sleep(3000);
//				excelNullCellCheck(variantData, im.variantName());
//				Thread.sleep(3000);
//			}
//			js.executeScript("arguments[0].click();", im.backButton());
//		}
//	}
//
//	public void excelNullCellCheck(String excelCellData, WebElement element) throws InterruptedException {
//		if ((excelCellData == null) || (excelCellData == "")) {
//			return;
//		} else {
//			act.click(element).sendKeys(excelCellData, Keys.ENTER).build().perform();
//			Thread.sleep(3000);
//		}
//	}
//
//}
