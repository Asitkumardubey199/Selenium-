package _01WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class _01ToLaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();

	}

}
