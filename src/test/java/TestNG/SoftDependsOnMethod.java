package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SoftDependsOnMethod {
	@Test
	public void createAccount() {                //c ,f:l, url,t

		Assert.assertEquals(12, 12);
	}

	@Test(dependsOnMethods = { "createAccount" })
	public void loginPage() {
		Assert.assertEquals("gmail", "amazon");
	}

	@Test(priority = 2, dependsOnMethods = { "loginPage" },alwaysRun=true)
	public void varifyHomePageTitle() {
		Assert.assertEquals("facebook", "facebook");
	}

	@Test(priority = 1, dependsOnMethods = { "loginPage" },alwaysRun=true)
	public void varifyHomePageUrl() {
		Assert.assertEquals(150, 150);
	}
}

/*
 PASSED: TestNG.SoftDependsOnMethod.varifyHomePageTitle
PASSED: TestNG.SoftDependsOnMethod.createAccount
PASSED: TestNG.SoftDependsOnMethod.varifyHomePageUrl
FAILED: TestNG.SoftDependsOnMethod.loginPage

===============================================
Default suite
Total tests run: 4, Passes: 3, Failures: 1, Skips: 0
*/
