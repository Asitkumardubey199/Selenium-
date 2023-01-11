package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void Demo() {
		boolean expectedData=true;
		boolean actualData= false;
		
		Assert.assertEquals(actualData,expectedData);
		System.out.println("pass");
	}

}
