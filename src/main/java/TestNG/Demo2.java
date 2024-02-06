package TestNG;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Demo2 {
	public void createAccount() {

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
