package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
   
    WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/reg");
	
	WebElement name= driver.findElement(By.name("firstname"));
	name.sendKeys("supriya");
	
	WebElement day= driver.findElement(By.id("day"));

	  Select sel =new Select(day);		
		sel.selectByVisibleText("6");
	  
    WebElement abc= sel.getFirstSelectedOption();
    String selectedValue=abc.getText();
    System.out.println(selectedValue);
    
	List<WebElement> list= sel.getOptions();   //WebElement not WebElements
      int a=list.size();
      System.out.println(a);
      
      for(WebElement dobs:list)
      {
    	String b=dobs.getText() ;
    	System.out.println(b);
      }
			 
			 
	}

}
