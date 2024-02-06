package TestNG;

import org.testng.annotations.Test;

public class NewTest3 {
	@Test(priority = 100)
	public void abc() {
		System.out.println("100 preority");
	}

	@Test
	public void loginPage() {
		System.out.println("not mension any preority");
	}

	@Test(priority = 0)
	public void loginFunctionality() {
		System.out.println(" 0 preotity");
	}

	@Test(priority = 2)
	public void xyz() {
		System.out.println("2 preority");
	}

	@Test(priority = -2)
	public void home() {
		System.out.println("-2 preority");
	}

}

