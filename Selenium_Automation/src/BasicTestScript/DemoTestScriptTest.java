package BasicTestScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass {
	@Test(priority=1)
	public void verifyHomePageTest() {
		System.out.println("Home page has been verified");
		
	}
	@Test(priority=2)
	public void verifyCustomer() {
		System.out.println("Customer has been verified");
	}

}
