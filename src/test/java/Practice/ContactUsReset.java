package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsReset {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		driver.manage().window().fullscreen();

		
		Thread.sleep(500);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'first_name']"));
		
       WebElement lastname = driver.findElement(By.xpath("//input[@name = 'last_name']"));
		

		
        WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
        
        WebElement commentInput = driver.findElement(By.xpath("//textarea[@name='message']"));
        
		WebElement ResetButton = driver.findElement(By.xpath("//input[@class='contact_button'][1]"));

        
        firstname.sendKeys("Raveena");
        
        Thread.sleep(500);
        
        lastname.sendKeys("Reddy");
        
        Thread.sleep(500);
        
        email.sendKeys("raveena@gmail.com");
        
        Thread.sleep(500);
        
        commentInput.sendKeys("Comment Section");
        
        Thread.sleep(500);
        
        ResetButton.click();
        
        Thread.sleep(1000);
        
        driver.quit();
        

	}

}
