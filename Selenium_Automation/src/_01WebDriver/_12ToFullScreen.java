package _01WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12ToFullScreen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Options m = driver.manage();
		Window w = m.window();
		w.maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().window().fullscreen();	}

}
