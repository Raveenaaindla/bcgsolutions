package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class autocompletedTextField {
	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement AutoText = driver.findElement(By.xpath("//input[@id = 'myInput']"));
		
		AutoText.sendKeys("chocolate"); 
		
		Thread.sleep(500);
		
		WebElement submit = driver.findElement((By.xpath("//input[@id = 'submit-button']")));
		
		Thread.sleep(500);
		
		submit.click();
	}
}
