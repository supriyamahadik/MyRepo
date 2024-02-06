package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// step 1: connect to the actual browser
		System.setProperty("webdrriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe" );
				// step 2: Up casting
				WebDriver driver = new ChromeDriver();

				//step 3: maximize the browser
				driver.manage().window().maximize();
				
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
                 Thread.sleep(3000);
                 
				WebElement signin = driver.findElement(By.name("proceed"));
				
				boolean a = signin.isDisplayed();
				boolean b = signin.isEnabled();
				System.out.println(a);
				System.out.println(b);
				
				String c = signin.getAttribute("title");
				String d = signin.getAttribute("value");
				System.out.println(c);
				System.out.println(d);
				
				signin.click();
	}

}
