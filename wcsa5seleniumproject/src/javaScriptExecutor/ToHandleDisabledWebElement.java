package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/textboxenable.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		

		//To perform Scrolling operations
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('i2').value='Manager'");
		//To generate PopUp
		jse.executeScript("alert('hello')");
		
		//To Handle PopUp
		driver.switchTo().alert().accept();

	}

}
