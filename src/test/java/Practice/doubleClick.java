package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement doubleClick = driver.findElement(By.xpath("//div[@id = 'double-click']"));
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(1000);
		
		builder.doubleClick(doubleClick).perform(); 
        
        Alert alt = driver.switchTo().alert();
        
        alt.accept();
        
        driver.close();
	}

}
