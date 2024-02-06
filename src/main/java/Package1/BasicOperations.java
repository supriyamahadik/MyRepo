package Package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	

	Dimension d =new Dimension(700,1300);	
	driver.manage().window().setSize(d);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	
	String title=driver.getTitle();
	driver.navigate().refresh();
	if(title.startsWith("Face"))
	{
		System.out.println("method pass");
	}
	else
	{
		System.out.println("method fails");
	}
	
	System.out.println(title);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	
	driver.close();
	driver.quit();
	}

}
