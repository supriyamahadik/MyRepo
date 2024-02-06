package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdrriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe" );
        
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
		WebElement name= driver.findElement(By.name("firstname"));
		name.sendKeys("supriya");
		
		WebElement day= driver.findElement(By.id("day"));
		
		Select sel =new Select(day);
		  sel.selectByVisibleText("6");
		//sel.selectByValue("6");
		//sel.selectByIndex(5);
	
		
	}

}
