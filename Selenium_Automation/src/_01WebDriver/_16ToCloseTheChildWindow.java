package _01WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16ToCloseTheChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(10000);
		String parentWindowId = driver.getWindowHandle();
		
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(10000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id : allWindowIds)
		{
			driver.switchTo().window(id);
			if(!id.equals(parentWindowId))
			{
				driver.close();
			}
		}

	}

}
