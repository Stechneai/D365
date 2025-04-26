package com.d365.testlayer;

import java.util.Map;

import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class runAllSalesOrderLot extends MasterClass {
	 @Test
	 public void checkLotTagProcess() throws Exception
	 {
		 login();
      allsalesorderlot.verifySalesInvoiceCheck();
//        allsalesorderlot.checkOffTagNegative();
//        allsalesorderlot.verifySalesNegativeInvoiceCheck();
//        allsalesorderlot.verifySalesInvoicePartiallyTagCheck();
//        allsalesorderlot.checkMandatoryFields();
//        allsalesorderlot.checkTransferTag();
//        allsalesorderlot.checkNegativeTransferTag();
        allsalesorderlot.checkWeightPcsAllTag();
//        allsalesorderlot.validateRemoveButton();
//        allsalesorderlot.ValidateWeightPcsSalesOrder();
       allsalesorderlot.checkPhysicalInventory();
//        allsalesorderlot.validatePcsField();
       allsalesorderlot.validateWeightField();
        
	 }
	
	
   
}
