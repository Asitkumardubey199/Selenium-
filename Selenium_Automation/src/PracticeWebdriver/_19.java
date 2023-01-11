package PracticeWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		driver.navigate();
		Thread.sleep(3000);
		driver.get("https://www.sarkariresult.com");
		driver.navigate();
		Thread.sleep(4000);
		driver.get("https://www.twitter.com");
		Thread.sleep(2000);
		driver.get("https://www.rojgarresult.com");
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);

	}

}
