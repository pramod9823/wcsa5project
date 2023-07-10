package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7894561230");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passsw");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-1x0uki6 r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73' and @data-testid='login-submit-btn']")).click();


	}

}
