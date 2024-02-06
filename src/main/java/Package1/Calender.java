package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		
		//step 4: click on Date object
		WebElement wb1 = driver.findElement(By.id("onwardCal"));
		wb1.click();
		
		//step 5 execute infinite while loop
		
		while(true)
		{
			
			WebElement wb2 = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));
			String a= wb2.getText();
			System.out.println(a);
			Thread.sleep(2000);
			
			

		}
		
	}

}
