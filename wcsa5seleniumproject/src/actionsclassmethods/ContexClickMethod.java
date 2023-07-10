package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClickMethod {

	//Use to perform right click
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/Dropdownsingle.html");

		WebElement Target = driver.findElement(By.id("menu"));

		//To perform right click
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		act.contextClick(Target).perform();


	}

}
