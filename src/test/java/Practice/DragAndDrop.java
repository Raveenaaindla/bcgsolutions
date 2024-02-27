package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(drag, drop).perform();
		

	}

}
