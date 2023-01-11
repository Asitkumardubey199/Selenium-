package PracticeWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		String facebookId = driver1.getWindowHandle();
		System.out.println(facebookId);

	}

}
