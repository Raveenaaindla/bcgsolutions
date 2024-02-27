package Axis.bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get url
		
		driver.get("https://automationexercise.com/");
		
		
		
		//Navigate forwards in browser history 
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		//Navigate backward in browser history 
		driver.navigate().back();
		
		Thread.sleep(1000);
				
		// Refresh page 
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
