package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://prafpawar11.github.io/twoFrame.html");
		Thread.sleep(5000);
		
		driver.switchTo().frame("chk");
		
		driver.findElement(By.id("TestNG")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		WebElement wb=driver.findElement(By.id("course"));
		Select sel =new Select(wb);
		
		sel.selectByVisibleText("GitHub");
		String a= sel.getFirstSelectedOption().getText();
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys("pooja");
		
		
	}

}
