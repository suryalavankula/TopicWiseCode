import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		WebElement ele = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//p[text() = 'Drag me to my target']")).click();
		//System.out.println("Text");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		
		
		

	}

}
