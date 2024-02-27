package Axis.bccsolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();

		
		Thread.sleep(500);
		
		//double click
		
		WebElement doubleClick = driver.findElement(By.xpath("//input[@id = 'double-click']"));
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(1000);
		
		builder.doubleClick(doubleClick).perform(); 
        
        Alert alt = driver.switchTo().alert();
        
        alt.accept();
		
		//context click, right click 
		
		builder.contextClick(doubleClick).perform();
		
		
		
		
	}

}
