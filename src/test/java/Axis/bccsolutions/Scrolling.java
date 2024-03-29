package Axis.bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();

		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//vertical down scroll(x and y coordinates)
		
		js.executeScript("window.scrollBy(0,800)", "");
		
		//vertical up scroll(x and y coordinates)
		
		js.executeScript("window.scrollBy(0,-400)", "");
		
		Thread.sleep(2000);
		
		//Horizontal down scroll(x and y coordinates)
		
		js.executeScript("window.scrollBy(200,0)", "");
				
		//Horizontal up scroll(x and y coordinates)
				
		js.executeScript("window.scrollBy(-300,0)", "");
			
		
		
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		

	}

}
