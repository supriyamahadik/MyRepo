package TestNG;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test(priority=1)
	public void login() {
		System.out.println("Login TC");
	}

	@Test(priority=-20)
	public void home() {
		System.out.println("Home TC");
	}

	@Test(priority=-20)
	public void pim() {
		System.out.println("PIM TC");
	}
}
