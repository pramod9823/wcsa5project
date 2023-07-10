package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the browser");
		String	browservalue=Sc.nextLine();

        if (browservalue.equalsIgnoreCase("Firefox"))
        {
        	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

    		ChromeOptions co = new ChromeOptions();
    		co.addArguments("--disable-notifications");
    		WebDriver driver = new ChromeDriver(co);
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    		driver.get("https://www.easemytrip.com/");

			
		}
        
        else if (browservalue.equalsIgnoreCase("Microsoftedge")) 
        {
        	System.setProperty("webdriver.Edge.driver", "./drivers/msedgedriver.exe");

//    		//= new Ed
//    		//co.addArguments("--disable-notifications");
//    	//	WebDriver driver = new ChromeDriver(co);
//    		driver.manage().window().maximize();
//    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//    		driver.get("https://www.easemytrip.com/");
//
	}
		


	}

}
