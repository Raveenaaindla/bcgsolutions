package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class LoginPortal {
	public static void main(String[] args) throws InterruptedException {		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");		
		driver.manage().window().fullscreen();		
		Thread.sleep(500);		
		WebElement username = driver.findElement(By.id("text"));		
		WebElement password = driver.findElement(By.id("password"));		
		WebElement login = driver.findElement(By.id("login-button"));		
		username.sendKeys("RaveenaReddy");		
		Thread.sleep(500);		
		password.sendKeys("@123");		
		Thread.sleep(500);
		login.click();		
		 Thread.sleep(1000);		 
		 driver.quit();		
	}
}
