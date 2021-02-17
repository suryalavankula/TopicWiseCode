
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCode {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://103.120.178.14:8080/hrbase/");
		driver.manage().window().maximize();
		//Screenshot code
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src, new File("D:\\Testing Eclipse\\Screenshot eclipse\\srit.png"));
		 
		//web links in a web page
		 List<WebElement> linksCount = driver.findElements(By.tagName("a"));
		 System.out.println(linksCount.size());
		 for(int i=0; i<linksCount.size(); i++)
		 {
			 System.out.println(linksCount.get(i).getText());
		 }
		
		

	}

}
