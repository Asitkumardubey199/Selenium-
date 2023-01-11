package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		String expectedAltText = "Flipkart";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actualAltText = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("alt");
		if(actualAltText.equals(expectedAltText))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			driver.quit();
	}

}
