package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14ToVerifyElementOnWebpageIsDisplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+c");
		Thread.sleep(5000);
		
		WebElement emailTextfield = driver.findElement(By.id("email"));
		boolean displayed = emailTextfield.isDisplayed();
		if(displayed)
		{
			System.out.println("Pass: The element is displayed");
		}
		else
		{
			System.out.println("Fail: The element is not displayed");
		}

	}

}
