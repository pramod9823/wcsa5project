package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		// provide the delay of  2 sec
		
		//maximize the browser
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		//to close browser
	    driver.close();


		
	}

}
