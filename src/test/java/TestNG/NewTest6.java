package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest6 {
	@BeforeMethod
	public void abc() {
		System.out.println("Before Method abc Method");
	}
	
	@BeforeMethod()
	public void xyz() {
		System.out.println("Before Method XYZ Method");
	}
	
	@AfterMethod
	public void pqr() {
		System.out.println("After Method PQR Method");
	}

	@AfterMethod
	public void lmn() {
		System.out.println("After Method lmn Method");
	}

	@Test
	public void d1() {
		System.out.println("D1 TC");
	}

}
