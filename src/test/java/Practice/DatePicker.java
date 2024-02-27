package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");		
		driver.manage().window().maximize();		
		Thread.sleep(500);
		
		WebElement datePicker = driver.findElement(By.xpath("//div[@id = 'datepicker'][1]"));		
		datePicker.click();		
		Thread.sleep(500);	
		
        WebElement date = driver.findElement(By.xpath("//td[contains(text(), '26')]"));
		
		date.click();
		
		Thread.sleep(500);
		
		
		

	}

}
