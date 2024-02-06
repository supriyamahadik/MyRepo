package Package1;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InvocationCount {
	@Test(invocationCount = 10)
	public void abc() {
		System.out.println("ABC TC started");
		Assert.assertEquals(12, 12);
		System.out.println("ABC TC Ended");
	}

	@Test
	public void pqr() {
		System.out.println("PQR TC started");

		SoftAssert soft = new SoftAssert();
		soft.assertEquals("selenium", "selenium");

		System.out.println("PQR TC Running");

		System.out.println("PQR TC Ended");

		soft.assertAll();
	}

	@Test
	public void xyz() {
		System.out.println("XYZ TC started");
		Assert.assertEquals(true, true);
		System.out.println("XYZ TC Ended");
	}
}
