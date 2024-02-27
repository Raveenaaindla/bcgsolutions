package Axis.bccsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");

	}

}
