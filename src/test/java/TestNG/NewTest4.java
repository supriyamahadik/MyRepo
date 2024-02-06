package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest4 {
	@Test                                                      
	public void createAccount() {          //c,l,t,u

		Assert.assertEquals(12, 12);
	}

	@Test(dependsOnMethods = { "createAccount" })
	public void loginPage() {
		Assert.assertEquals("gmail", "amazon");
	}

	@Test(priority = 2, dependsOnMethods = { "loginPage" })
	public void varifyHomePageTitle() {
		Assert.assertEquals("facebook", "facebook");
	}

	@Test(priority = 1, dependsOnMethods = { "loginPage" })
	public void varifyHomePageUrl() {
		Assert.assertEquals(150, 150);
	}
}
/*
PASSED: TestNG.NewTest4.createAccount
FAILED: TestNG.NewTest4.loginPage
Default suite
Total tests run: 4, Passes: 1, Failures: 1, Skips: 2
*/