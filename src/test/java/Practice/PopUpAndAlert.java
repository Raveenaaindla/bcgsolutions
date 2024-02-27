package Practice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PopUpAndAlert {
	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");		
		driver.manage().window().maximize();		
		Thread.sleep(500);		
		
		//JS alert		
		WebElement JSbutton = driver.findElement(By.xpath("//span[@id = 'button1']"));		
		JSbutton.click();		
        Thread.sleep(500);        
        Alert alt1 = driver.switchTo().alert();      
        alt1.dismiss();		
        Thread.sleep(1000);        
        
        //Modal PopUp		
      	WebElement modalpopup = driver.findElement(By.xpath("//span[@id = 'button2']"));      		
      	modalpopup.click();     		
        Thread.sleep(500);             
        Alert alt2 = driver.switchTo().alert();             
        alt2.dismiss();      		
        Thread.sleep(1000);       
        
        //Ajax Loader       
        WebElement AjaxLoader = driver.findElement(By.xpath("//span[@id = 'button3']")); 		
        AjaxLoader.click();     		
        Thread.sleep(500);             
        Alert alt3 = driver.switchTo().alert();             
        alt3.dismiss();     		
        Thread.sleep(1000);       
        WebElement insidebtn = driver.findElement(By.xpath("//div[@id = 'myDiv']"));     
        insidebtn.click();     
        Thread.sleep(500);      
        Alert alt = driver.switchTo().alert();             
        alt.dismiss();     		
        Thread.sleep(1000);       
        
        //JS confirm box   
        WebElement JSCnfrmBx = driver.findElement(By.xpath("//span[@id = 'button4']"));		
        JSCnfrmBx.click();		
        Thread.sleep(500);        
        Alert alt4 = driver.switchTo().alert();        
        alt4.dismiss();       
        Thread.sleep(500);
	}
}
