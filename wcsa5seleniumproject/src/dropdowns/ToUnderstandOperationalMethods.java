package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("file:///C:/Users/pramo/OneDrive/Desktop/WCSA5/webelement/dropdown.html");
		
		 WebElement multiSelectDD = driver.findElement(By.id("menu"));
		 Select sel=new Select(multiSelectDD);
		 
		 //isMultiple Method
		 boolean res = sel.isMultiple();
		 
		 System.out.println(res);
		 
		 //getOptions Method
		 List<WebElement> res1 = sel.getOptions();
		for (int i = 0; i < res1.size(); i++) {
			
			String options = res1.get(i).getText();
			System.out.println(options);
			Thread.sleep(2000);
			
		}
		System.out.println();
		
		
		//using for each loop
		List<WebElement> ops = sel.getOptions();
		for(WebElement We:ops)
		{
			String textofops = We.getText();
			System.out.println(textofops);
		}
		
		
		for(int i=2; i<=4; i++)
		{
			sel.selectByIndex(i);
			WebElement firstoption = sel.getFirstSelectedOption();
			System.out.println(" First selected option is:" +firstoption.getText());
		}
		 
		 
		 

	}

}
