import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassCode {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Move to element(focus)
		
		//Select drop = new Select(WebElement);
		Actions action = new Actions(driver);
		
		WebElement Addele = driver.findElement(By.id("highlight-addons"));
		action.moveToElement(Addele).click().perform(); 
		
		//using action class click 
		WebElement Checkele = driver.findElement(By.linkText("Priority Check-in"));
		action.moveToElement(Checkele).click().perform();
		
		//sending text in cap
		WebElement textele = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(textele).click().keyDown(Keys.SHIFT).sendKeys("Vasu").build().perform();
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
