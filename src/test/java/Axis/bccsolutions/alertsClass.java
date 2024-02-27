package Axis.bccsolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsClass {

	public static void main(String[] args) throws InterruptedException {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		//information alert
		
		WebElement infloalt = driver.findElement(By.xpath("//input[@name = 'alert']"));
		
		infloalt.click();
		
        Thread.sleep(500);
        
        Alert alt = driver.switchTo().alert();
        
        alt.dismiss();
		
        Thread.sleep(500);
        
        //confirmation alert
        
		WebElement confrmalt = driver.findElement(By.xpath("//input[@name = 'confirmation']"));
		
		confrmalt.click();
		
        Thread.sleep(500);
        
        Alert alt1 = driver.switchTo().alert();
        
        alt1.dismiss();
        
        Thread.sleep(500);
        
        //prompt alert
        
		WebElement prmpalt = driver.findElement(By.xpath("//input[@name = 'prompt']"));
		
		prmpalt.click();
		
		Thread.sleep(500);
		
        Alert alt2 = driver.switchTo().alert();
        
        alt2.dismiss();

	}

}
