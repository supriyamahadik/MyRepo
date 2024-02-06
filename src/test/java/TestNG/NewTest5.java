package TestNG;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest5 {
	
	@BeforeClass
	public void setup() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void abc() {
		System.out.println("Before Method");
	}

	@Test
	public void testCases1() {
		System.out.println("Test cases 1");
	}

	@Test
	public void testCases2() {
		System.out.println("Test cases 2");
	}

	@Test
	public void testCases3() {
		System.out.println("Test cases 3");
	}

	@AfterMethod
	public void xyz() {
		System.out.println("After Method");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("After class");
		System.out.println("-----------------------------------------");
	}
}
