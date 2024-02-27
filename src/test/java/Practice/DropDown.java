package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);	
		
        WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
		Select sel1 = new Select(dropdown1); 
		sel1.selectByVisibleText("SQL");
		Thread.sleep(500);
		
        WebElement dropdown2 = driver.findElement(By.id("dropdowm-menu-2"));
		Select sel2 = new Select(dropdown2); 
		sel2.selectByVisibleText("Maven");
		Thread.sleep(500);
		
        WebElement dropdown3 = driver.findElement(By.id("dropdowm-menu-3"));
		Select sel3 = new Select(dropdown3); 
		sel3.selectByVisibleText("JavaScript");
		Thread.sleep(500);
	}
}
