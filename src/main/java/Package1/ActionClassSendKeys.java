package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdrriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe" );
        
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
		WebElement name= driver.findElement(By.name("firstname"));
		name.sendKeys("supriya");
		
		Actions act= new Actions(driver);
		
		WebElement lastname= driver.findElement(By.name("lastname"));
		act.keyDown(Keys.SHIFT).build().perform(); 
		act.sendKeys(lastname,"mahadik").build().perform();
		
	
	}

}
