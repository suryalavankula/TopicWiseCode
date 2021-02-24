import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingconcept {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//handling alret
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		//alert.accept();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
