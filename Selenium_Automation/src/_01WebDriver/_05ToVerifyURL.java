package _01WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05ToVerifyURL {

	public static void main(String[] args) {
		String ExcepectedURL = "facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualURL = driver.getCurrentUrl();
		System.out.println("The actual URL is "+ actualURL);
		
		if(actualURL.contains(ExcepectedURL))
		{
			System.out.println("Pass : The URL is verified");
		}
		else
		{
			System.out.println("fail : The URL is not verified");
		}
	}

}
