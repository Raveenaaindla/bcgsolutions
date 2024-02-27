package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxLoader {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement ajax = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));
		
		ajax.click();
		
		Thread.sleep(500);
        
        Alert alt3 = driver.switchTo().alert();
              
        alt3.dismiss();
      		
        Thread.sleep(1000);

	}

}
