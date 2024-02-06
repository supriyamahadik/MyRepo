package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybordevents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		WebElement wb= driver .findElement(By.id("id=\"u_0_b_VV\""));
		
		Actions act = new Actions(driver);
		act.sendKeys(wb, "Supriya").build().perform();                                                                                  //add val Admin as Userid to first  ele textbox                                        
		act.keyDown(Keys.TAB).sendKeys("Mahadik").keyUp(Keys.TAB).build().perform();           //add val admin123 as a password to next ele textbox 
//		act.keyDown(Keys.TAB).sendKeys(Keys.ENTER).keyUp(Keys.TAB).build().perform();             //click on login button

//         act.sendKeys(wb, "Admin").keyDown(Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).keyUp(Keys.TAB).build().perform();


	}

}
