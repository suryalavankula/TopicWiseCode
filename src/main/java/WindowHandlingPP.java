import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPP {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\Testing Eclipse\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://support.google.com/accounts?hl=en#topic=3382296");
		driver.findElement(By.linkText("Community")).click();
		driver.findElement(By.xpath("//span[text()='Google Account']")).click();
		
		Set<String> Count= driver.getWindowHandles();
		System.out.println(Count.size());
		Iterator<String> it =  Count.iterator();
		
		String ParentID = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		driver.findElement(By.linkText("Create an account")).click();
		driver.switchTo().window(ParentID);
		
		
		
		
		
		
		
		
		

	}

}
