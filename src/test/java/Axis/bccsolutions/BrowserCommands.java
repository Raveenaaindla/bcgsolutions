package Axis.bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get url
		
		driver.get("https://automationexercise.com/");
		
		// get page title
		
		String title = driver.getTitle();
		
		System.out.println(title); 
		
		//get current url 
		
        String currurl = driver.getCurrentUrl();
		
		System.out.println(currurl); 
		
		// get page source 
		
        String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		//close - to close current browser session
		
		driver.close();
		
		
		

	}

}
