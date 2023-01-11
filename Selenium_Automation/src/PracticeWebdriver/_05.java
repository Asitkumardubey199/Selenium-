package PracticeWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05 {

	public static void main(String[] args) {
		String expectedUrl = "facebook";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Pass: Url Verified");
		}
		else
		{
			System.out.println("Fail: Url not Verified");
		}
	}
}
