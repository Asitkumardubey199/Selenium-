package BasicTestScript ;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import PomRepo.HomePage;
import PomRepo.LoginPage;

public class ToVerifyHomePageTest extends BaseClass  {
	
    @Test
	public void ToVerifyHomePageTest() throws IOException {
	
	
	String expectedTitle = eUtils.fetchStringDataFromExcelSheet("Sheet2",1,0);
	HomePage home = new HomePage(driver);
	
	
	
	WebDriverUtility wUtils = new WebDriverUtility(driver,20);
	wUtils.toWaitForTitle(driver,"Enter");
	
	
	String actualTitle = home.verifyHomePageTitle();
	
	Assert.assertEquals(actualTitle,expectedTitle);
	System.out.println("pass:The title is verified");
	
	


	   driver.quit();
		
	}

}
