package _01WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15ToGetWindowHandleForSameId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String windowId = driver.getWindowHandle();
		System.out.println("Window id 1 : "+windowId);
		
		driver.navigate().to("https://www.facebook.com/");
		String facebookID =driver.getWindowHandle();
		System.out.println(facebookID);
		
	}

}
