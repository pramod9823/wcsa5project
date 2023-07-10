package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Pramod");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("xjnsds");
		driver.findElement(By.cssSelector("button[class*='ap']")).click();

		

	}

}
