package com.d365.testlayer;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;


	public class RunPlatinumUrd extends MasterClass {

		@Test
		public void add() throws InterruptedException, IOException, InvalidFormatException {

			login();
//			platinumurd.addplatinumpurchaseusData();
//			platinumurd.deletepurchaseusplatinum();
//			platinumurd.openpurchaseusplatinum();
//			platinumurd.cancelestimatepurchaseusplatinum();
//			platinumurd.purchaseotherplatinumformula();
//			platinumurd.purchaseusplatinumoldornamentvalueformula();
//			platinumurd.dupliactedatapurchaseusplatinum();
//			
//			platinumurd.addpurchaseotherplatinumData();
//			platinumurd.deletepurchaseotherplatinum();
//			platinumurd.openpurchaseotherplatinum();
//			platinumurd.cancelestimatepurchaseotherplatinum();
//			platinumurd.purchaseotherplatinumformula();
//			platinumurd.purchaseotherplatinumoldornamentvalueformula();
//			platinumurd.dupliactedatapurchaseotherplatinum();
//			
//			platinumurd.addplatinumexchangeusData();
//			platinumurd.deleteexchangeusplatinum();
//			platinumurd.openexchangeusplatinum();
//			platinumurd.cancelestimateexchangeusplatinum();
//			platinumurd.exchangeusplatinumformula();
//			platinumurd.exchangeusplatinumoldornamentvalueformula();
//			platinumurd.dupliactedataexchangeusgplatinum();
//			
			platinumurd.addplatinumexchangeotherData();
			platinumurd.deleteexchangeothersilver();
			platinumurd.openexchangeotherplatinum();
			platinumurd.cancelestimateexchangeotherplatinum();
			platinumurd.exchangeotherplatinumformula();
			platinumurd.exchangeotherplatinumoldornamentvalueformula();
			platinumurd.exchangeotherplatinumduplicatedata();

		}
	}

	
	
	

