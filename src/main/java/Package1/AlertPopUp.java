package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
   	WebElement wb = driver.findElement(By.name("proceed"));
	wb.click();
	
	Alert alt=driver.switchTo().alert();
	Thread.sleep(3000);
	String alertText=alt.getText();
	System.out.println(alertText);
	
	alt.accept();
	
	
	}

}
