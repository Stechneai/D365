package com.d365.core;

import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;


import org.apache.commons.lang3.StringUtils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration; 


public class Transfer extends MasterClass {
	
	
	    // Method definition
	    public void addTagTransfer(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Correct WebDriverWait usage

	        String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
	        String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
	        String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
	        String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
	        String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
	        String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
	        String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");

	        genericHelper.clickWithJavascriptExecutor(transferPage.btnNeworder());

	        genericHelper.sendKeysAndEnterWithWait(transferPage.txtSite(), datasite, 0);
	        genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtWarehouse(), datawarehouse);

	        genericHelper.clickWithJavascriptExecutor(transferPage.btnOk());
	        genericHelper.clickWithJavascriptExecutor(transferPage.btnTagScanning());

	        genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtEnterTag(), datatag);
	       // Thread.sleep(200);
	        genericHelper.actions.sendKeys(Keys.TAB).build().perform();

	        //Thread.sleep(200);
	        try {
	            // Wait for visibility of invalid tag
	            wait.until(ExpectedConditions.visibilityOf(transferPage.txtInvalidTag()));
	            if (transferPage.txtInvalidTag().isDisplayed()) {
	                System.out.println("Tag is not valid: Tag is either not from the selected location or not in release status.");
	                reportHelper.generateLogFullScreenSS(test, "Tag is not from selected location or Tag is not release status");
	               
	            }
	        } catch (NoSuchElementException | TimeoutException e) {  // Handle exceptions
	            System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
	            
	            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtLocation(), datalocation);
	            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtCounter(), datalocationid);
	            genericHelper.clickWithJavascriptExecutor(transferPage.btnGenerateLine());

	            Thread.sleep(200);

	            genericHelper.clickWithJavascriptExecutor(transferPage.btnTagrelease());
	            Thread.sleep(200);

	            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtScanningStatus(), statusyes);
	            Thread.sleep(300);

	            transferPage.btnValidate().click();
	            Thread.sleep(300);

	            genericHelper.clickWithJavascriptExecutor(transferPage.btnValidateOk());
	            Thread.sleep(300);

	            genericHelper.clickWithJavascriptExecutor(transferPage.btnLines());
	            genericHelper.clickWithJavascriptExecutor(transferPage.btnPost());

	            Thread.sleep(300);
	            genericHelper.clickWithJavascriptExecutor(transferPage.btnPostOK());
	            Thread.sleep(200);
	        }


	    }
	
	public void addBulkTagTransfer(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		


		genericHelper.clickWithJavascriptExecutor(transferPage.btnNeworder());
		
		genericHelper.sendKeysAndEnterWithWait(transferPage.txtSite(), datasite, 0);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtWarehouse(), datawarehouse);

		genericHelper.clickWithJavascriptExecutor(transferPage.btnOk());
		genericHelper.clickWithJavascriptExecutor(transferPage.btnTagScanning());
		Thread.sleep(300);
		
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnToggleButton());
		Thread.sleep(200);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtEnterTag(), datatag);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtLocation(), datalocation);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtCounter(), datalocationid);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnGenerateLine());

		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferPage.btnTagrelease());
		Thread.sleep(200);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtScanningStatus(), statusyes);
		Thread.sleep(300);

		transferPage.btnValidate().click();
		Thread.sleep(300);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnValidateOk());
		Thread.sleep(300);
//		genericHelper.clickWithJavascriptExecutor(transferpage.clickLines());

		genericHelper.clickWithJavascriptExecutor(transferPage.btnPost());
		Thread.sleep(300);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnPostOK());

	}	
	public void validateNavigation(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

		String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
		String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
		String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
		String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
		String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
		String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
		String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
		

		navigateToPage(transferPage.lnkInventorymanagement(), transferPage.lnktTransfer());
		genericHelper.clickWithJavascriptExecutor(transferPage.btnNeworder());
		try {

			if (transferPage.btnSave().isDisplayed() && transferPage.btnNeworder().isDisplayed()
					&& transferPage.btnValidate().isDisplayed()
					&& transferPage.btnTagrelease().isDisplayed()) {
				reportHelper.generateLogFullScreenSS(test,
						"Navigating sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");
				reportHelper.onTestSuccess(test,
						"Navigating sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");
			} else {
				reportHelper.generateLogFullScreenSS(test,
						"Navigating not sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");
				reportHelper.onTestFailure(test,
						"Navigating not sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");
			}
		} catch (Exception e) {
			reportHelper.generateLogFullScreenSS(test,
					"Navigating not sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");
			reportHelper.onTestFailure(test,
					"Navigating not sucessfully of Transfer page using following path Inventory management>>Journal entries>>Item>>Transfer:Is Passed");

		}
		Thread.sleep(200);		
		 try {
	            // Wait for visibility of the name field
	            wait.until(ExpectedConditions.visibilityOf(transferPage.txtCheckName()));
	            if (transferPage.txtCheckName().isDisplayed()) {
	                reportHelper.generateLogFullScreenSS(test, "Name is Invt displayed");
	            }
	        } catch (NoSuchElementException | TimeoutException e) {  // Handle NoSuchElement and Timeout exceptions
	            reportHelper.generateLogFullScreenSS(test, "Name is Invt not displayed or took too long.");
	        }

	        try {
	            // Wait for visibility of the description field
	            wait.until(ExpectedConditions.visibilityOf(transferPage.txtCheckDescription()));
	            if (transferPage.txtCheckDescription().isDisplayed()) {
	                reportHelper.generateLogFullScreenSS(test, "Description is Transfer");
	            }
	        } catch (NoSuchElementException | TimeoutException e) {  // Handle exceptions
	            reportHelper.generateLogFullScreenSS(test, "Description is not Transfer or took too long.");
	        }

		
		genericHelper.sendKeysAndEnterWithWait(transferPage.txtSite(), datasite, 10);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtWarehouse(), datawarehouse);

		genericHelper.clickWithJavascriptExecutor(transferPage.btnOk());
		genericHelper.clickWithJavascriptExecutor(transferPage.btnTagScanning());
		Thread.sleep(300);
		
		genericHelper.clickWithJavascriptExecutor(transferOrderPage.btnToggleButton());
		Thread.sleep(200);

		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtEnterTag(), datatag);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtLocation(), datalocation);
		genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtCounter(), datalocationid);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnGenerateLine());

		Thread.sleep(200);

		genericHelper.clickWithJavascriptExecutor(transferPage.btnTagrelease());
		Thread.sleep(200);

		genericHelper.sendKeysWithjavascriptExecutor(transferPage.txtScanningStatus(), statusyes);
		Thread.sleep(300);

		transferPage.btnValidate().click();
		Thread.sleep(300);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnValidateOk());
		Thread.sleep(300);
//		genericHelper.clickWithJavascriptExecutor(transferpage.clickLines());

		genericHelper.clickWithJavascriptExecutor(transferPage.btnPost());
		Thread.sleep(300);
		genericHelper.clickWithJavascriptExecutor(transferPage.btnPostOK());

	}	
	public void validateTagCounter(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Correct WebDriverWait usage

        String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
        String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
        String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
        String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
        String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
        String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
        String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");

        genericHelper.clickWithJavascriptExecutor(transferPage.btnNeworder());

       
        genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferPage.txtSite(), datasite);
        genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtWarehouse(), datawarehouse);

        genericHelper.clickWithJavascriptExecutor(transferPage.btnOk());
        genericHelper.clickWithJavascriptExecutor(transferPage.btnTagScanning());

        genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtEnterTag(), datatag);
       // Thread.sleep(200);
        genericHelper.actions.sendKeys(Keys.TAB).build().perform();

        Thread.sleep(200);
        try {
            // Wait for visibility of invalid tag
            wait.until(ExpectedConditions.visibilityOf(transferPage.txtInvalidTag()));
            if (transferPage.txtInvalidTag().isDisplayed()) {
                System.out.println("Tag is not valid: Tag is either not from the selected location or not in release status.");
                reportHelper.generateLogFullScreenSS(test, "Tag is not from selected location or Tag is not release status");
               
            }
        } catch (NoSuchElementException | TimeoutException e) {  // Handle exceptions
            System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtLocation(), datalocation);
            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtCounter(), datalocationid);
            genericHelper.clickWithJavascriptExecutor(transferPage.btnGenerateLine());

            Thread.sleep(200);

            genericHelper.clickWithJavascriptExecutor(transferPage.btnTagrelease());
            Thread.sleep(200);

            genericHelper.sendKeysWithjavascriptExecutor(transferPage.txtScanningStatus(), statusyes);
            Thread.sleep(300);

            transferPage.btnValidate().click();
            Thread.sleep(300);

            genericHelper.clickWithJavascriptExecutor(transferPage.btnValidateOk());
            Thread.sleep(300);

            genericHelper.clickWithJavascriptExecutor(transferPage.btnLines());
            genericHelper.clickWithJavascriptExecutor(transferPage.btnPost());

            Thread.sleep(300);
            genericHelper.clickWithJavascriptExecutor(transferPage.btnPostOK());
            Thread.sleep(200);
            String tag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Tag"), "");
    		String wloc = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ValidateLocation"), "");
    		System.out.println(wloc);
    		


    		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkModules());
    		// genericHelper.clickWithJavascriptExecutor(atp.clickModules());
    		Thread.sleep(200);
    		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkJewellery());
    		genericHelper.clickWithJavascriptExecutor(allTagPage.lnkAllTags());
    		genericHelper.clickWithJavascriptExecutor(allTagPage.btnOk());
    		Thread.sleep(1000);

    		WebElement batchn = allTagPage.btnBatchNo();
    		genericHelper.scrollingTillWebElement(batchn);
    		genericHelper.clickWithJavascriptExecutor(allTagPage.btnBatchNo());

    		allTagPage.txtbatchno().sendKeys(tag);
    		Thread.sleep(4000);
    		allTagPage.btnApply().click();
    		Thread.sleep(200);
    		
    		WebElement loc = allTagPage.txtScrollLocation();
    		genericHelper.scrollingTillWebElement(loc);
    		
    		
    		WebElement locatn=allTagPage.txtLocation();
    		String location=locatn.getAttribute("value");
    		System.out.println("Get Site is:"+location);
    		
    		
    		if (wloc.equals(location)) {
    			reportHelper.onTestSuccess(test, "Transfer Tag to specified counter"  +wloc+  "is sucessfully: ");
    		} else {
    			reportHelper.onTestFailure(test, "Transfer Tag to specified counter"  +wloc+  "is not sucessfully: ");
    		}


           
        }
	}
        public void validateGeneratedTagDetails(ExtentTest test, MasterDto masterDto) throws InterruptedException, IOException {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Correct WebDriverWait usage

            String Tagtype = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Tag Type"), "");
            String datasite = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Site"), "");
            String datawarehouse = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Warehouse"), "");
            String datatag = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Scan Individual Tag"), "");
            String datalocation = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Invent Location"), "");
            String datalocationid = StringUtils.defaultIfBlank(masterDto.getAttributeValue("SewMSLocationId"), "");
            String statusyes = StringUtils.defaultIfBlank(masterDto.getAttributeValue("ScanningStatus"), "");
            String getquantity = StringUtils.defaultIfBlank(masterDto.getAttributeValue("Quantity"), "");

            genericHelper.clickWithJavascriptExecutor(transferPage.btnNeworder());

           
            genericHelper.sendKeysAndEnterWithjavascriptExecutor(transferPage.txtSite(), datasite);
            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtWarehouse(), datawarehouse);

            genericHelper.clickWithJavascriptExecutor(transferPage.btnOk());
            genericHelper.clickWithJavascriptExecutor(transferPage.btnTagScanning());

            genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtEnterTag(), datatag);
           // Thread.sleep(200);
            genericHelper.actions.sendKeys(Keys.TAB).build().perform();

            Thread.sleep(200);
            try {
                // Wait for visibility of invalid tag
                wait.until(ExpectedConditions.visibilityOf(transferPage.txtInvalidTag()));
                if (transferPage.txtInvalidTag().isDisplayed()) {
                    System.out.println("Tag is not valid: Tag is either not from the selected location or not in release status.");
                    reportHelper.generateLogFullScreenSS(test, "Tag is not from selected location or Tag is not release status");
                   
                }
            } catch (NoSuchElementException | TimeoutException e) {  // Handle exceptions
                System.out.println("No invalid tag element found. Proceeding with valid tag actions.");
                genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtLocation(), datalocation);
                genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtCounter(), datalocationid);
                genericHelper.clickWithJavascriptExecutor(transferPage.btnGenerateLine());

                Thread.sleep(200);
                
                WebElement qty=transferPage.txtQuantity();
                String quantity=qty.getAttribute("title");
                System.out.println(quantity);
                
                reportHelper.performAssert(test, statusyes, getquantity, quantity);
                
                genericHelper.clickWithJavascriptExecutor(transferPage.btnTagrelease());
                Thread.sleep(200);

                genericHelper.clearAndSendKeysWithJavascriptExecutor(transferPage.txtScanningStatus(), statusyes);
                Thread.sleep(300);

                transferPage.btnValidate().click();
                Thread.sleep(300);

                genericHelper.clickWithJavascriptExecutor(transferPage.btnValidateOk());
                Thread.sleep(300);

                genericHelper.clickWithJavascriptExecutor(transferPage.btnLines());
                genericHelper.clickWithJavascriptExecutor(transferPage.btnPost());

                Thread.sleep(300);
                genericHelper.clickWithJavascriptExecutor(transferPage.btnPostOK());
                Thread.sleep(200);  
            }
        }
}
    



		



