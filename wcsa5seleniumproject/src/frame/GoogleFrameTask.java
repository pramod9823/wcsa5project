package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrameTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch blue stone application
		driver.get("https:/www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='gb_S gb_Pd gb_x']"));
//		Thread.sleep(2000);
//		driver.findElement(By.)

	}

}
