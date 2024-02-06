package ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunEndToEndRegressionSuitParallely {

	WebDriver driver;

	@Parameters({ "browsername" })
	@BeforeTest
	public void setUp(String browsername) throws InterruptedException {

		if (browsername.equalsIgnoreCase("chrome")) 
		{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.err.println("Please Provide Valid browser name");
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority = 1)
	public void loginFunctionality() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 3)
	public void validateHomePageUrl() {
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl.contains("orange"), true);
	}

	@Test(priority = 4)
	public void validateUserOnPIMPage() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl.contains("pim"), true);
	}

	@Test(priority = 5)
	public void createNewUser() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();

		driver.findElement(By.name("firstName")).sendKeys("Pooja");
		driver.findElement(By.name("middleName")).sendKeys("abc");
		driver.findElement(By.name("lastName")).sendKeys("patil");

		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


}
