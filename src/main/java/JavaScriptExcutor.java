import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutor {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://103.120.178.14:8080/hrbase/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()= 'sign in']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('login-nav-link').click();");
		
		//click
		//js.executeScript("arguments[0].click();", element);
	    
		//id - for sendkeys
		//js.executeScript("document.getElementById('" + "username" + "').value='" + "satya" + "'");
		
		//for getting titile 
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		
		
		
		
		
		
	}

}
 