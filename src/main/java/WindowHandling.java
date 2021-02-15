import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.linkText("Help")).click();
        Set<String> Count = driver.getWindowHandles();
        
        Iterator<String> it= Count.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        driver.findElement(By.linkText("Community")).click();
        
        driver.switchTo().window(parentID);
        driver.findElement(By.linkText("Privacy")).click();
        
        System.out.println(Count.size());
	}

}
