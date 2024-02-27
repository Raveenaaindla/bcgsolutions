package Axis.bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerCalender {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement Datepicker = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));

		Thread.sleep(500);
		
		Datepicker.click();
		
		Thread.sleep(1000);
		
		WebElement Date = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));

		Date.click();
		
		
		
		
	}

}
