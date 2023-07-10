package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/dropdown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 Select sel=new Select(multiSelectDD);
		 Thread.sleep(2000);
		 //select using index value
		 sel.selectByIndex(1);
		 Thread.sleep(2000);
		 
		 //select using text of webElement
		 sel.selectByVisibleText("pani puri");
		 Thread.sleep(2000);
		 
		 //select using value
		 sel.selectByValue("v5");
		 
		 Thread.sleep(2000);
		 
		 //deselect using index value
		 sel.deselectByIndex(1);
		 
		 Thread.sleep(2000);
		//deselect using index value
		 sel.deselectByVisibleText("pani puri");
		 
		 Thread.sleep(2000);
		 
		 //deselect using value
		 sel.deselectByValue("v5");
		 
		 Thread.sleep(2000);
		 
		 // to select multiple options
		  for (int i = 0; i <5; i++) {
			  
			  sel.selectByIndex(i);
			  Thread.sleep(2000);
			
		}
		  Thread.sleep(2000);
		   for (int i = 0; i < 5; i++) {
			sel.deselectByIndex(i);
		}
		   
		   
		  //sel.deselectAll();
		 
		 
		 
		
	}

}
