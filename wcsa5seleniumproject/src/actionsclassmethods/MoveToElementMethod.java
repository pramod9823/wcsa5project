package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com/");
		
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp laptops");
        
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
       WebElement target = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
       
      Actions act = new Actions(driver);
      act.moveToElement(target).perform();
	}

}
