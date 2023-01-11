package _01WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06ToVerifyTheTitle {

	public static void main(String[] args) {
		String excepectedTitle = ("Facebook");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(excepectedTitle))
		{
			System.out.println("Pass : The Title is verified");
		}
		else
		{
			System.out.println("Fail : The Title is not verified");
		}
		

	}

}
