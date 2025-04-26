//import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class TemplateMasterAutomation {
//
//	public static void main(String[] args) throws IOException, InterruptedException {
//
//		WebDriverManager.chromedriver().setup();
////		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().wait(10);
//
//		WebDriver driver2 = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		String url = "http://3.108.206.34/3_SoftLaunch/TechTicket/";
//		String username = "sayaliv";
//		String password = "abcd123";
//
//		driver.get(url);
//		WebElement usernameField = driver.findElement(By.id("email_id"));
//		WebElement passwordField = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
//		usernameField.sendKeys(username);
//		passwordField.sendKeys(password);
//		loginButton.click();
//
//		// Wait until the template master section is visible
//		WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(10));
//		WebElement MasterSection = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MasterSection);
//		MasterSection.click();
//
//		WebElement templateMasterSection = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Template Master']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templateMasterSection);
//		templateMasterSection.click();
//
//		WebElement addButton = driver.findElement(By.xpath("//a[text()='Add Template']"));
//		addButton.click();
//
//		// Read data from Excel file
//		FileInputStream excelFile = new FileInputStream("TestData.xlsx");
//		Workbook workbook = new XSSFWorkbook(excelFile);
//		Sheet sheet = workbook.getSheetAt(0);
//		String templateName = sheet.getRow(0).getCell(0).getStringCellValue();
//		String basketName = sheet.getRow(1).getCell(0).getStringCellValue();
//		String assignTo = sheet.getRow(2).getCell(0).getStringCellValue();
//
//		// Step 2: Add data to the template master
//		WebElement templateNameField = driver.findElement(By.id("template_name"));
//		templateNameField.sendKeys(templateName);
//
//		Select dropdown = new Select(driver.findElement(By.id("calculate_from")));
//		dropdown.selectByVisibleText("From Start");
//
//		WebElement basketNameField = driver.findElement(By.name("basket_name"));
//		basketNameField.sendKeys(basketName);
//
//		basketNameField.sendKeys(Keys.TAB);
//
//		WebElement assignToField = driver.findElement(By.id("react-select-2-placeholder"));
//		assignToField.sendKeys(assignTo);
//
//		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
//		submitButton.click();
//
//		WebElement createTask = driver.findElement(By.xpath("//button[text()='Create Task']"));
//		createTask.click();
//
//		// Step 8: Enter hard-coded or Excel data
//		String taskField1 = "TestGokul";
//		String taskField2 = "docs2";
//		String taskField3 = "10";
//		String taskField4 = "1";
//		String taskField5 = "10";
//
//		WebElement title = driver.findElement(By.name("taskName"));
//		createTask.sendKeys("taskField1");
//
//		WebElement taskType = driver.findElement(By.id("react-select-3-placeholder"));
//		createTask.sendKeys("docs2");
//
//		WebElement daysRequired = driver.findElement(By.name("days"));
//		createTask.sendKeys(taskField3);
//
//		WebElement hrRequired = driver.findElement(By.name("hours"));
//		hrRequired.sendKeys(taskField4);
//
//		WebElement startTaskRequired = driver.findElement(By.name("start_days"));
//		startTaskRequired.sendKeys(taskField5);
//		// Writing task data to Excel
//
//		sheet.createRow(3).createCell(0).setCellValue(taskField1);
//		sheet.createRow(4).createCell(0).setCellValue(taskField2);
//		sheet.createRow(5).createCell(0).setCellValue(taskField3);
//		sheet.createRow(6).createCell(0).setCellValue(taskField4);
//		sheet.createRow(7).createCell(0).setCellValue(taskField5);
//
//		// Write output to Excel file
//		FileOutputStream outputStream = new FileOutputStream("TestOutput.xlsx");
//		workbook.write(outputStream);
//		workbook.close();
//
//		WebElement specificElement = driver.findElement(By.xpath("//h3[text()='Template Master']"));
//
//		// Capture screenshot of the specific element
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotFile, new File("specific_element_screenshot.png"));
//		driver.quit();
//
//	}
//}
