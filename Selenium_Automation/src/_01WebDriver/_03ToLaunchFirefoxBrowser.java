package _01WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class _03ToLaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}
