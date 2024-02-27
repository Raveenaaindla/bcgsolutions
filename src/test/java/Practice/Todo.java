package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Todo {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		
		WebElement todo = driver.findElement(By.xpath("//input[@type = 'text']"));
		
		todo.sendKeys("Complete the course"); 

		Actions builder = new Actions(driver);
		
		Action serisOf = builder.moveToElement(todo).click().keyDown(todo, Keys.SHIFT).sendKeys(todo).build();
		
		serisOf.perform();	
	}

}
