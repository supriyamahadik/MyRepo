package Package1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);

		driver.findElement(By.id("windowButton")).click();                           		//click on new window button

		
		Set<String> allWindowId = driver.getWindowHandles();                           // capture all window ID number
		ArrayList<String> arr = new ArrayList<String>(allWindowId);                	//Convert Set<String> into ArrayList<String>
		driver.switchTo().window(arr.get(1));                                                                  // switch focus to Facebook window

		
		String a = driver.findElement(By.id("sampleHeading")).getText();                       		// capture result message
		System.out.println(a);
		String b = driver.getCurrentUrl();                                                                               		         //capture url
		System.out.println(b);
	
		driver.switchTo().window(arr.get(0));                                                                          		//switch focus to main window	
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;                                                                     // take screenshot
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dist1 = new File(System.getProperty("user.dir") + "\\screenshotNewwindow\\abc.png");
		FileUtils.copyFile(src1, dist1);
	
	
		driver.switchTo().window(arr.get(1));                                                                                    		//switch focus to message tab
		Thread.sleep(5000);
		driver.close();                                                                                                                                            	// close pop up message window
		Thread.sleep(5000);

		driver.switchTo().window(arr.get(0));     

	}

}
