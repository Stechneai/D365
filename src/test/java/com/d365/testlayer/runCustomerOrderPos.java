package com.d365.testlayer;

import org.testng.annotations.Test;

import com.d365.core.CustomerOrder;
import com.d365.core.CustomerOrderPos;
import com.d365.core.CustomerOrderRepair;
import com.d365.utils.MasterClass;

import org.testng.asserts.SoftAssert;

public class runCustomerOrderPos extends MasterClass {

	CustomerOrderPos customerOrderPosTest = new CustomerOrderPos();
	SoftAssert softAssert = new SoftAssert();

	@Test(groups = "Smoke")
	public void addCustomerOrderRepairData() throws InterruptedException, Exception {
//		loginPage(driver, username, password);
//		CustomerOrderTest.addNewHeaderData();
		customerOrderPosTest.addCustomerOrderPos();
	}

//	@Test(groups = "Smoke", enabled = false)
//	public void TC_02() throws InterruptedException, Exception {
//		loginPage(driver, "amreens", "12345678");
//		reportHelper.generateLogWithScreenshot(test, "");
//		countryMaster.editCounty();
//
//		logoutPage(driver);
//	}

}
