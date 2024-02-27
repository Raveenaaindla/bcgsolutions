package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		
         List <WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type= 'checkbox']"));
		
         Thread.sleep(500);
         
         for (WebElement wb : allcheckbox) {
        	 
        	 wb.click();
         }
         

	}
	}
