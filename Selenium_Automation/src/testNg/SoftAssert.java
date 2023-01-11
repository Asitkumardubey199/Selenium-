package testNg;
	

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void Demo() {
		boolean expectedData=true;
		boolean actualData= false;
		
		org.testng.asserts.SoftAssert s=new org.testng.asserts.SoftAssert();
		s.assertEquals(actualData, expectedData);
		System.out.println("Pass");
		s.assertAll();
		
		
	}

}
