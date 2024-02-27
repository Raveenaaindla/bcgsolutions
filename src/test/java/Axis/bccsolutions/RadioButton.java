package Axis.bccsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.manage().window().fullscreen();
		
		WebElement radioFemale = driver.findElement(By.xpath("((//input[@type= 'radio'])[2])"));
		
		Thread.sleep(500);
		
		if(radioFemale.isDisplayed()) {
			radioFemale.click();
		}
		
        WebElement radioMale = driver.findElement(By.xpath("((//input[@type= 'radio'])[1])"));
		
		if(radioMale.isSelected()) {
			radioMale.click();
		}

	}

}
