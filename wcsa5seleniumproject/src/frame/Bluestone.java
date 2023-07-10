package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch blue stone application
		driver.get("https://www.bluestone.com/");

		//Handle hidden division popup
		driver.findElement(By.xpath("//span[.='Not now']")).click();

		Thread.sleep(2000);

		//identify frame by using xpath
		WebElement	frameelement=driver.findElement(By.xpath("//iframe[@id='fc_widget']"));

		//handle the frame by switch the control to frame
		//driver.switchTo().frame(6);//handle frame by using index

		//driver.switchTo().frame("fc_widget");//handle frame by using by name or id
		driver.switchTo().frame(frameelement);

		driver.findElement(By.id("chat-icon")).click();
		//WebDriverWait	wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")))

		//
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("pramod");
		driver.findElement(By.id("chat-fc-email")).sendKeys("pramod@");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");




	}

}
