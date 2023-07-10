package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextOfDropdownWithoutUsingSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/dropdown.html");
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 Select sel=new Select(multiSelectDD);
		 Thread.sleep(2000);
		 
	       	//getOptions Method
			//using for each loop
		 
			List<WebElement> ops = sel.getOptions();
			for(WebElement We:ops)
			{
				if (We.getText().equals("pani puri")) {
					Thread.sleep(2000);
					We.click();
					break;
					
				}
			}
	}

}
