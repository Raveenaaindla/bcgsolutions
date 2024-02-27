package Axis.bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
        System.setProperty("webdriver.Firefox.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");

	}

}
