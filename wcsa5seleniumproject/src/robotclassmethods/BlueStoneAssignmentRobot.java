package robotclassmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssignmentRobot {

//	//public static void main(String[] args) throws Robot {
//	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	//	driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	//	
//		//launch blue stone application
//		driver.get("https://www.bluestone.com/");
//		
//		driver.findElement(By.xpath("//span[.='Not now']")).click();
//		
//		// move to watch jewellery
//		  WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
//		 
//		  Actions act = new Actions(driver);
//		 act.moveToElement(target).perform();
//		  driver.findElement(By.xpath("//a[.='Band']")).click();
//		  WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
//		  act.clickAndHold(target2).perform();
//		  
//		  //copy the Filter by text
//		 Robot robot = new Robot();
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_C);
//		 
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_C);
//		 
//		 driver.findElement(By.id("//input[@id='search_query_top_elastic_search']"));
//		 
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_V);
//		 
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_V);
//		 
//		 

	}

//}
