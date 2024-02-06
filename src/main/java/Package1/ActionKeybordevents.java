package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeybordevents {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement wb= driver.findElement(By.id("email"));
			
			Actions act =new Actions(driver);
			act.keyDown(Keys.SHIFT).build().perform();                         //press SHIFT key by using keyDown() method from Actions class-> build()-> perform()		
			act.sendKeys(wb,"Supriya").build().perform();
			
			WebElement wb1= driver.findElement(By.id("pass"));
			wb1.sendKeys("Mahadik");
			
			
	}

}
