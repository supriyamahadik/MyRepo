package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self element 
		String text =driver.findElement(By.xpath("//a[contains(text(),'Wipro')]")).getText();   //a[contains(text(),'Wipro')]/self::a   => representing selfnode
	    System.out.println(text);
	    
	    //parent element//it will give same val bcoz it is also representing the anchore tag so it will give you the same value //td dosent have any val
	    //td is representing whole sale here// whate ever the text inside the cell that will be capture
	    text =driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/parent::td")).getText();   //a[contains(text(),'Wipro')]/self::a   => representing selfnode
	    System.out.println(text);
	    
	    //a[contains(text(),'Wipro')]/child::*                  => it meance we are searching all childs of self node .if not available then it means there is no child ele to self node
 
	    
	    
	    
	    //Requirement: go to ancester i.e <tr ,of self node <a & find his child i.e <td nods
	    //a[contains(text(),'Wipro')]/ancestor::tr/child::td             =>it will show 5 child ele of <tr
	    List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Wipro')/ancestor::tr/child::td]"));   //a[contains(text(),'Wipro')]/self::a   => representing selfnode
	     System.out.println("Number of child elements: "+childs.size());
	     
	     
	     
	     //Requirement: Capture all the data under <tr node /row
	     //a[contains(text(),'Wipro')/ancestor::tr         => it will represent whole text inside this tr table row
	
	     text =driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/ancestor::tr")).getText();   //a[contains(text(),'Wipro')]/self::a   => representing selfnode
		 System.out.println(text);
		 
		 
	    //Requirement: find all child & grandChild of (ancestor of selftag)
		 
		//a[contains(text(),'Wipro')]/ancestor::tr/descendant::*              //7 element //capture child+innerchild of <tr
		//a[contains(text(),'Wipro')]/ancestor::tr/descendant::td            // 5 ele //only capture child of <tr
		 
		 List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Wipro')]/ancestor::tr/descendant::*"));   
	     System.out.println("Number of all descendant: "+descendant.size());
	     
	     //following elements 
		 List<WebElement> followingNods = driver.findElements(By.xpath("//a[contains(text(),'Wipro')]/ancestor::tr/following::tr"));   
	     System.out.println("Number of all followingNods aftre closing tr tag are: "+followingNods.size());
  
	     //followingSibling :Select all the sibling after the current node 
	     
	    
	      //a[contains(text(),'Wipro')]/ancestor::tr/following-sibling::tr  
	     List<WebElement> followingSibling = driver.findElements(By.xpath("//a[contains(text(),'Wipro')]/ancestor::tr/following::tr"));   
	     System.out.println("Number of all followingSibling aftre closing tr tag are: "+followingSibling.size());

	
	}
}
