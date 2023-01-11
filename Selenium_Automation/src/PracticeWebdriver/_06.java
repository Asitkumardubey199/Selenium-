package PracticeWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06 {

	public static void main(String[] args) {
		String expectedTitle = "Facebook";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Pass: Title Verified");
		}
		else
		{
			System.out.println("Fail: Title not Verified");
		}
	}
}
