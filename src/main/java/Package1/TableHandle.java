package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {
		System.setProperty("webdrriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://prafpawar11.github.io/emptable.html");
	List<WebElement> colname=  driver.findElements(By.xpath("//tr"));
	 
	for(WebElement abc: colname)
	{
		String columnname= abc.getText();
		System.out.println(columnname);
	}
	
	
	}

}
