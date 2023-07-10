package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=20q6apen0428q");

		FileInputStream fis = new FileInputStream("./data/Actitime.xlsx"); 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ValidCred"); 
		Row row = sheet.getRow(1); 
		Cell cell = row.getCell(0); 
		String validusername = cell.getStringCellValue(); 

		Thread.sleep(2000);
		FileInputStream fis1 = new FileInputStream("./data/Actitime.xlsx"); 
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("ValidCred"); 
		Row row1 = sheet1.getRow(1); 
		Cell cell1 = row1.getCell(1); 
		String validpassword = cell1.getStringCellValue(); 

		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(validusername);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("loginButton")).click();

	}

}
