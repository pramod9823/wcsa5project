package popUpHandling;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");
		
		
		WebElement uploadbutton = driver.findElement(By.id("uploadfile"));

		Actions act = new Actions(driver);
		
		act.doubleClick(uploadbutton).perform();

		Runtime.getRuntime().exec("./aotoitPrograms/omayo11.exe");
		
		Thread.sleep(2000);
		
		
		


	}

}
