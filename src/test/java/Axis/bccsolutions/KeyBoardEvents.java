package Axis.bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();

		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		
		Actions builder = new Actions(driver);
		
		Action serisofact = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys(email, "AINDLARAVEENA").build();
		
		serisofact.perform();
		
	}
}
