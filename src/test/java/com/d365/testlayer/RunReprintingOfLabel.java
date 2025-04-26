package com.d365.testlayer;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.d365.utils.MasterClass;
import com.sharedutils.MasterDto;

public class RunReprintingOfLabel extends MasterClass {
	ITestResult result;

	@Test(enabled = false, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void editCategory() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "ChangeCategory");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.changeCategory(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void changeSubsmith() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "SubSmithChange");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.addSubSmith(test, masterDto);
				// checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				//getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void withoutEnterSubsmith() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "SubSmithChangeNegative");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeTestCasesSubSmithChange(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeSubsmith() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "SubSmithNegative");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeTestCasesSubSmith(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void validate() throws Throwable {

		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "Validate");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validate(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void post() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "Post");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.post(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void attributeValidateFields() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "AttributeChangeFields");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.attributeValidateField(test, masterDto);
			} catch (Exception e) {
				//getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void ornamentValidateField() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "OrnamentSizeFields");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.ornamentValidateField(test, masterDto);
			} catch (Exception e) {
				//getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

   @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void addSize() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "SizeChange");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.addSize(test, masterDto);
			} catch (Exception e) {
				//getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeOrnament() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "OrnamentSizeNegative");
		for (MasterDto masterDto : masterDtos) {
		try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeOrnament(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
	

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void validateF() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "ValidateO");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateF(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void PostF() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "PostO");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.postF(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void addHmPcs() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "AddHmPcs");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.addHmPcs(test, masterDto);

			} catch (Exception e) {
			//	getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void addCollectionCode() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "AddCollectionCode");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.addCollectionCode(test, masterDto);

			} catch (Exception e) {
			//	getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeDesignCode() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeDesignCode");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeDesignCode(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeHmPcs() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeHmPcs");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeHmPcs(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);

			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeCollectionCode() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeCollectionCode");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeCollectionCode(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void negativeCertificateNo() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeCertificateNo");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.negativeCertificateNo(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void validateDeisgnCode() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "VallidateD");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateDesigncode(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void postDesigncode() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "PostD");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.postDesigncode(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	@Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void validateHmPcs() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "ValidateH");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateHmPcs(test, masterDto);
				checkNotificationPresenceAndHandle(masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	
	 @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void selectDropdownLocation() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "LocationDropdown");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.selectDropdownLocation(test, masterDto);
			} catch (Exception e) {
				// getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	 @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void validateSingleSelectionDropdownLocation() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "ValidateDropdownSelection");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateSingleSelectionDropdownLocation(test, masterDto);
			} catch (Exception e) {
				// getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

   @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Functionality" })
	public void addRateOrnament() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "RateChangeOrnament");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.addRateOrnament(test, masterDto);
			} catch (Exception e) {
				//getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
   @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Validation" })
 	public void negativeRateOrnament() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeRateChanegO");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.negativeRateOrnament(test, masterDto);
 				checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
   @Test
	public void rateOrnamentFields() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "RateOrnamentFields");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.rateOrnamentFields(test, masterDto);
 				//checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
   @Test
	public void itemidOrnamentFields() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "OrnamentItemIdField");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.itemidOrnamentFields(test, masterDto);
 				//checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
	@Test
	public void itemidMRPSterlingSilverFields() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "MRPItemIdField");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.itemidMRPSterlingSilverFields(test, masterDto);
 				//checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
	@Test
	public void addRateMRPSterlingSilver() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "RateChangeMRPSterlingSilver");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.addRateMRPSterlingSilver(test, masterDto);
 				//checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				//getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
	@Test
public void negativeRateMRPSterlingSilver() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "NegativeRateRevisionMRP");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.negativeRateMRPSterlingSilver(test, masterDto);
 				checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
	@Test
	public void validateRateMRPSterlingSilver() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "ValidateRateRevision");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.validateRateMRPSterlingSilver(test, masterDto);
 				checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
	@Test
	public void postRateMRPSterlingSilver() throws Throwable {
 		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "PostRateRevision");
 		for (MasterDto masterDto : masterDtos) {
 			try {
 				test = reportHelper.createTestCase(test, extentReports, masterDto);
 				reprintingoflabel.postRateMRPSterlingSilver(test, masterDto);
 				checkNotificationPresenceAndHandle(masterDto);
 			} catch (Exception e) {
 				getResults(masterDto);
 			} finally {
 				reportHelper.generateExcelReport(test, result, masterDto);
 			}
 		}
 	}
   @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Validation" })
	public void validateRepritingdropdownList() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "PurposeReprintinglabeldropdown");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateReprintingDropdownList(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}
   @Test(enabled = true, groups = { "admin", "Jewellery", "ReprintingOfLabeling", "Validation" })
	public void validateAttributeChangeDropdownList() throws Throwable {
		List<MasterDto> masterDtos = excelHelper.getTestData(reprintingOfLabel, "DropdownAttributeChange");
		for (MasterDto masterDto : masterDtos) {
			try {
				test = reportHelper.createTestCase(test, extentReports, masterDto);
				reprintingoflabel.validateAttributeChangeDropdownList(test, masterDto);
			} catch (Exception e) {
				getResults(masterDto);
			} finally {
				reportHelper.generateExcelReport(test, result, masterDto);
			}
		}
	}

	}

