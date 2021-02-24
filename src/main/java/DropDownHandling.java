import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//dropdown using select tag
		 WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select Dropselect = new Select(dropdown);
		 Dropselect.selectByValue("AED");
		 //get all elements in drop-down and print
		 
		 List<WebElement> getalldropdown = Dropselect.getOptions();
		 for(int i=0; i<getalldropdown.size(); i++ ) {
			 System.out.println(getalldropdown.get(i).getText());
		 }
		
		 

	}

}
