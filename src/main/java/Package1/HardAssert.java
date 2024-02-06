package Package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void abc()
	{
			System.out.println("abc is started");
			Assert.assertEquals("java","java");
			System.out.println("abc is Ended");
	}

		
	@Test
	public void pqr()
	{
			System.out.println("pqr is started");
			Assert.assertEquals(12,65555);
			System.out.println("pqr is Ended");
	}

		
	@Test
	public void xyz()
	{
			System.out.println("xyz is started");
			Assert.assertEquals(true,true);
			System.out.println("xyz is Ended");
	}
}
