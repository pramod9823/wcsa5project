package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(3000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("pramodburpalle9823@gamil.com");
		Thread.sleep(3000);
		driver.findElement(By.id("id_password")).sendKeys("abcdefgh");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();

	}

}
