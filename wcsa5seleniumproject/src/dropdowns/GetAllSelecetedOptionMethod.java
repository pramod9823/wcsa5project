package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelecetedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/dropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		 Select sel = new Select(dropDownElement);
		 
		 
		 
		 for(int i=2; i<=5; i++)
		 {
			 Thread.sleep(2000);
			 sel.selectByIndex(i);
		 }
		 
		 // To read all selected options from dropdown
		 List<WebElement> allopt = sel.getAllSelectedOptions();
		 //To read the list of webelement we use loop
		 
		 for(WebElement op:allopt);
		 {
			
			 
		 }
		

	}

}
