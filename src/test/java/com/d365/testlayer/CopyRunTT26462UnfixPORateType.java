package com.d365.testlayer;

import java.util.List;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;
import com.sharedutils.ReportsHelper;

public class CopyRunTT26462UnfixPORateType extends MasterClass
{
	ITestResult result; 
	 
    @Test (priority = 1) 
	public void verifyunfixfieldinProvisional_TC_1_to_TC_04() throws Exception 
	{  
		login();       
		   
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet1"); 
		for (MasterDto masterDto : masterDtos) 
		{  
 
			try { 
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				poRateUnfix.verifyPoFRateTypefield(masterDto);   
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{ 
			 getResults();
				
			} finally
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}  
    
    //@Test (priority = 2) 
//	public void verifyunfixfieldinProvisional_TC_05() throws Exception
//	{ 
//		login();     
//		   
//		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet2");
//		for (MasterDto masterDto : masterDtos) {
// 
//			try {
//				test = reportHelper.createTestCase(test, extentReports, masterDto);
//				poRateUnfix.verifyPoRateTypeforKaragir_05(masterDto);  
//				checkNotificationPresenceAndHandle(masterDto); 
//				
//			  } 
//			 catch (Throwable e) 
//			{
//				e.printStackTrace(); 
//			} finally {
//				reportHelper.generateExcelReport(test, result, masterDto);
//			}
//		}
//
//	} 
    
   
    @Test (priority = 3) 
	public void verifyunfixfieldinProvisional_TC_07() throws Exception
	{ 
		//login();     
		   
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet3");
		for (MasterDto masterDto : masterDtos) {
 
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto); 
				poRateUnfix.wholeQCProcess_TC_07(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) {
			
			
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
	
    @Test (priority = 4)   
	public void verifyunfixfieldinProvisional_TC_08() throws Exception
	{ 
		//login();     
		   
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet4");
		for (MasterDto masterDto : masterDtos) {
 
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				poRateUnfix.verifyBatchRegistration_TC_08(masterDto); 
				checkNotificationPresenceAndHandle(masterDto); 
			} catch (Throwable e) 
			{
				getResults();
			} finally
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
    
    @Test (priority = 5)  
	public void verifyunfixfieldinProvisional_TC_09() throws Exception
	{ 
		//login();     
		    
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet5");
		for (MasterDto masterDto : masterDtos) {
 
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				poRateUnfix.verifyPostProductandInvoice_TC_09(masterDto); 
			} 
			finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
    
     
	@Test (priority = 6)  
	public void verifyunfixfieldinProvisional_TC_12() throws Exception
	{ 
		//login();     
		   
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet6");
		for (MasterDto masterDto : masterDtos) {
 
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				poRateUnfix.processUnfixPoRateTYpe_TC_12(masterDto);   
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e) 
			{
				getResults();
			} 
			finally 
			{
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
	
	@Test (priority = 7)  
	public void verifythatUnfixModuleDsiplay_TC_13() throws Exception 
	{ 
		//login();     
		   
		List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet7"); 
		for (MasterDto masterDto : masterDtos) {
 
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				poRateUnfix.verifyUnfixmoduleDiaplay_TC_12(masterDto); 
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Throwable e)
			{
				getResults();
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}

	}
	
	 @Test (priority = 8) 
		public void verifyunfixfieldinProvisional_TC_1_to_TC_04Silver() throws Exception 
		{  
			//login();       
			   
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet8"); 
			for (MasterDto masterDto : masterDtos) 
			{  
	 
				try { 
					test = reportHelper.createTestCase(test, extentReports, masterDto);
					poRateUnfix.verifyPoFRateTypefield(masterDto);   
					checkNotificationPresenceAndHandle(masterDto);
				} catch (Throwable e) 
				{ 
				 getResults();
					
				} finally
				{
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}  
	    
	    //@Test (priority = 9) 
//		public void verifyunfixfieldinProvisional_TC_05Silver() throws Exception
//		{ 
//			login();     
//			   
//			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet9");
//			for (MasterDto masterDto : masterDtos) {
	// 
//				try {
//					test = reportHelper.createTestCase(test, extentReports, masterDto);
//					poRateUnfix.verifyPoRateTypeforKaragir_05(masterDto);  
//					checkNotificationPresenceAndHandle(masterDto); 
//					
//				  } 
//				 catch (Throwable e) 
//				{
//					e.printStackTrace(); 
//				} finally {
//					reportHelper.generateExcelReport(test, result, masterDto);
//				}
//			}
	//
//		} 
	    
	    @Test (priority = 10) 
		public void verifyunfixfieldinProvisional_TC_07Silver() throws Exception
		{ 
			//login();     
			   
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet10");
			for (MasterDto masterDto : masterDtos) {
	 
				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto); 
					poRateUnfix.wholeQCProcess_TC_07(masterDto); 
					checkNotificationPresenceAndHandle(masterDto);
				} catch (Throwable e) {
				
				
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}
		
	    @Test (priority = 11)   
		public void verifyunfixfieldinProvisional_TC_08Silver() throws Exception
		{ 
			//login();     
			   
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet11");
			for (MasterDto masterDto : masterDtos) {
	 
				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);
					poRateUnfix.verifyBatchRegistration_TC_08(masterDto); 
					checkNotificationPresenceAndHandle(masterDto); 
				} catch (Throwable e) 
				{
					getResults();
				} finally
				{
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}
	    
	    @Test (priority = 12)  
		public void verifyunfixfieldinProvisional_TC_09Silver() throws Exception
		{ 
			//login();     
			    
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet12");
			for (MasterDto masterDto : masterDtos) {
	 
				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);
					poRateUnfix.verifyPostProductandInvoice_TC_09(masterDto); 
				} 
				finally 
				{
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}
	    
	     
		@Test (priority = 13)  
		public void verifyunfixfieldinProvisional_TC_12Silver() throws Exception
		{ 
			//login();     
			   
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet13");
			for (MasterDto masterDto : masterDtos) {
	 
				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);
					poRateUnfix.processUnfixPoRateTYpe_TC_12(masterDto);   
					checkNotificationPresenceAndHandle(masterDto);
				} catch (Throwable e) 
				{
					getResults();
				} 
				finally 
				{
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}
		
		@Test (priority = 14)  
		public void verifythatUnfixModuleDsiplay_TC_13Silver() throws Exception 
		{ 
			//login();     
			   
			List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet14"); 
			for (MasterDto masterDto : masterDtos) {
	 
				try {
					test = reportHelper.createTestCase(test, extentReports, masterDto);
					poRateUnfix.verifyUnfixmoduleDiaplay_TC_12(masterDto); 
					checkNotificationPresenceAndHandle(masterDto);
				} catch (Throwable e)
				{
					getResults();
				} finally {
					reportHelper.generateExcelReport(test, result, masterDto);
				}
			}

		}
		
		 @Test (priority = 15) 
			public void verifyunfixfieldinProvisional_TC_1_to_TC_04Platinum() throws Exception 
			{  
				//login();       
				   
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet15"); 
				for (MasterDto masterDto : masterDtos) 
				{  
		 
					try { 
						test = reportHelper.createTestCase(test, extentReports, masterDto);
						poRateUnfix.verifyPoFRateTypefield(masterDto);   
						checkNotificationPresenceAndHandle(masterDto);
					} catch (Throwable e) 
					{ 
					 getResults();
						
					} finally
					{
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}  
		    
		    //@Test (priority = 16) 
//			public void verifyunfixfieldinProvisional_TC_05Platinum() throws Exception
//			{ 
//				login();     
//				   
//				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet16");
//				for (MasterDto masterDto : masterDtos) {
		// 
//					try {
//						test = reportHelper.createTestCase(test, extentReports, masterDto);
//						poRateUnfix.verifyPoRateTypeforKaragir_05(masterDto);  
//						checkNotificationPresenceAndHandle(masterDto); 
//						
//					  } 
//					 catch (Throwable e) 
//					{
//						e.printStackTrace(); 
//					} finally {
//						reportHelper.generateExcelReport(test, result, masterDto);
//					}
//				}
		//
//			} 
		    
		    @Test (priority = 17) 
			public void verifyunfixfieldinProvisional_TC_07Platinum() throws Exception
			{ 
				//login();     
				   
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet17");
				for (MasterDto masterDto : masterDtos) {
		 
					try {
						test = reportHelper.createTestCase(test, extentReports, masterDto); 
						poRateUnfix.wholeQCProcess_TC_07(masterDto); 
						checkNotificationPresenceAndHandle(masterDto);
					} catch (Throwable e) {
					
					
					} finally {
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}
			
		    @Test (priority = 18)   
			public void verifyunfixfieldinProvisional_TC_08Platinum() throws Exception
			{ 
				//login();     
				   
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet18");
				for (MasterDto masterDto : masterDtos) {
		 
					try {
						test = reportHelper.createTestCase(test, extentReports, masterDto);
						poRateUnfix.verifyBatchRegistration_TC_08(masterDto); 
						checkNotificationPresenceAndHandle(masterDto); 
					} catch (Throwable e) 
					{
						getResults();
					} finally
					{
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}
		    
		    @Test (priority = 19)  
			public void verifyunfixfieldinProvisional_TC_09Platinum() throws Exception
			{ 
				//login();     
				    
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet19");
				for (MasterDto masterDto : masterDtos) {
		 
					try {
						test = reportHelper.createTestCase(test, extentReports, masterDto);
						poRateUnfix.verifyPostProductandInvoice_TC_09(masterDto); 
					} 
					finally 
					{
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}
		    
		     
			@Test (priority = 20)  
			public void verifyunfixfieldinProvisional_TC_12Platinum() throws Exception
			{ 
				//login();     
				   
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet20");
				for (MasterDto masterDto : masterDtos) {
		 
					try {
						test = reportHelper.createTestCase(test, extentReports, masterDto);
						poRateUnfix.processUnfixPoRateTYpe_TC_12(masterDto);   
						checkNotificationPresenceAndHandle(masterDto);
					} catch (Throwable e) 
					{
						getResults();
					} 
					finally 
					{
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}
			
			@Test (priority = 21)  
			public void verifythatUnfixModuleDsiplay_TC_13Platinum() throws Exception 
			{ 
				//login();     
				   
				List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet21"); 
				for (MasterDto masterDto : masterDtos) {
		 
					try {
						test = reportHelper.createTestCase(test, extentReports, masterDto);
						poRateUnfix.verifyUnfixmoduleDiaplay_TC_12(masterDto); 
						checkNotificationPresenceAndHandle(masterDto);
					} catch (Throwable e)
					{
						getResults();
					} finally {
						reportHelper.generateExcelReport(test, result, masterDto);
					}
				}

			}
			
			 @Test (priority = 22) 
				public void verifyunfixfieldinProvisional_TC_1_to_TC_04DJ() throws Exception 
				{  
					login();       
					   
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet22"); 
					for (MasterDto masterDto : masterDtos) 
					{  
			 
						try { 
							test = reportHelper.createTestCase(test, extentReports, masterDto);
							poRateUnfix.verifyPoFRateTypefield(masterDto);   
							checkNotificationPresenceAndHandle(masterDto);
						} catch (Throwable e) 
						{ 
						 getResults();
							
						} finally
						{
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}  
			    
			    //@Test (priority = 23) 
//				public void verifyunfixfieldinProvisional_TC_05DJ() throws Exception
//				{ 
//					login();     
//					   
//					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet23");
//					for (MasterDto masterDto : masterDtos) {
			// 
//						try {
//							test = reportHelper.createTestCase(test, extentReports, masterDto);
//							poRateUnfix.verifyPoRateTypeforKaragir_05(masterDto);  
//							checkNotificationPresenceAndHandle(masterDto); 
//							
//						  } 
//						 catch (Throwable e) 
//						{
//							e.printStackTrace(); 
//						} finally {
//							reportHelper.generateExcelReport(test, result, masterDto);
//						}
//					}
			//
//				} 
			    
			   @Test (priority = 24) 
				public void verifyunfixfieldinProvisional_TC_07DJ() throws Exception
				{ 
					//login();     
					   
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet24");
					for (MasterDto masterDto : masterDtos) {
			 
						try {
							test = reportHelper.createTestCase(test, extentReports, masterDto); 
							poRateUnfix.wholeQCProcess_TC_07(masterDto); 
							checkNotificationPresenceAndHandle(masterDto);
						} catch (Throwable e) {
						
						
						} finally {
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}
				
			    @Test (priority = 25)   
				public void verifyunfixfieldinProvisional_TC_08DJ() throws Exception
				{ 
					//login();     
					   
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet25");
					for (MasterDto masterDto : masterDtos) {
			 
						try {
							test = reportHelper.createTestCase(test, extentReports, masterDto);
							poRateUnfix.verifyBatchRegistration_TC_08(masterDto); 
							checkNotificationPresenceAndHandle(masterDto); 
						} catch (Throwable e) 
						{
							getResults();
						} finally
						{
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}
			    
			    @Test (priority = 26)  
				public void verifyunfixfieldinProvisional_TC_09DJ() throws Exception
				{ 
					//login();     
					    
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet26");
					for (MasterDto masterDto : masterDtos) {
			 
						try {
							test = reportHelper.createTestCase(test, extentReports, masterDto);
							poRateUnfix.verifyPostProductandInvoice_TC_09(masterDto); 
						} 
						finally 
						{
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}
			    
			     
				@Test (priority = 27)  
				public void verifyunfixfieldinProvisional_TC_12DJ() throws Exception
				{ 
					//login();     
					   
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet27");
					for (MasterDto masterDto : masterDtos) {
			 
						try {
							test = reportHelper.createTestCase(test, extentReports, masterDto);
							poRateUnfix.processUnfixPoRateTYpe_TC_12(masterDto);   
							checkNotificationPresenceAndHandle(masterDto);
						} catch (Throwable e) 
						{
							getResults();
						} 
						finally 
						{
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}
				
				@Test (priority = 28)  
				public void verifythatUnfixModuleDsiplay_TC_13DJ() throws Exception 
				{ 
					//login();     
					   
					List<MasterDto> masterDtos = excelHelper.getTestData(unFixMasterSheet, "Sheet28"); 
					for (MasterDto masterDto : masterDtos) {
			 
						try {
							test = reportHelper.createTestCase(test, extentReports, masterDto);
							poRateUnfix.verifyUnfixmoduleDiaplay_TC_12(masterDto); 
							checkNotificationPresenceAndHandle(masterDto);
						} catch (Throwable e)
						{
							getResults();
						} finally {
							reportHelper.generateExcelReport(test, result, masterDto);
						}
					}

				}
    
}