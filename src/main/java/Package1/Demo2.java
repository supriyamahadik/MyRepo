package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdrriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe" );
 WebDriver driver= new ChromeDriver();
 
 driver.get("https://www.facebook.com/reg");
 
 WebElement Fname=driver.findElement(By.name("firstname"));
 
 boolean FnameIsDisplay = Fname.isDisplayed();
 boolean FnameIsEnable = Fname.isEnabled();
 
 System.out.println(FnameIsDisplay);
 System.out.println(FnameIsEnable);
 
 Fname.sendKeys("Supriya");
 
 String FnameAttribute=Fname.getAttribute("value");
 System.out.println(FnameAttribute);
 
 Thread.sleep(3000);
 
 Fname.clear();
 
 Thread.sleep(2000);
 
 driver.close();
 
 
	}

}
