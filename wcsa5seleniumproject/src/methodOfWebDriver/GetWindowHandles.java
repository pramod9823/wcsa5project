package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//get the handle or address of current or parent window
		String parentHandle = driver.getWindowHandle();
		
		//launch the child window
	WebElement	childWindow=driver.findElement(By.partialLinkText("Open a popup window"));
	
		

	}

}
