package Axis.bccsolutions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args, TimeUnit MILLISECONDS) throws InterruptedException {
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/tables");
			
			driver.manage().window().maximize();
			
			//Implicit wait will wait for all the elements in the 
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			
			
			Thread.sleep(500);
			
			// find the no of rows present 
			
			List<WebElement> rowno = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
			
			int rowcount = rowno.size();
			
			System.out.print(rowcount);
			
			// find the no of columns present 
			
			List<WebElement> colno = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr[1]/td"));
						
			int colcount = colno.size();
						
			System.out.print(colcount); 
			
			
			//explicit wait - to wait for the compose button to be click-able 
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
			
			WebElement celldata = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]"));
			
			//fetch the cell data from the particular cell 
			
			String text = celldata.getText(); 
			
			System.out.print(text); 
			
			String expectedtext = "tconway@earthlink.net";
			
			if (text.equals(expectedtext)) {
				
				System.out.println("The celldata is correct");
				
			}
			else {
				
				System.out.println("The celldata is wrong");
				
			}
	}
}

