package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12ActivityToVerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMessage = "Please try again";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		String actualErrorMessage = driver.findElement(By.className("errormsg")).getText();
		
		System.out.println(actualErrorMessage);
		System.out.println(expectedErrorMessage);
		
		if(actualErrorMessage.contains(expectedErrorMessage))
		{
			System.out.println("Pass: Error Message has been Verified");
		}
		else
		{
			System.out.println("Fail: Error Message has not been Verified");
			driver.quit();
		}
	}

}
