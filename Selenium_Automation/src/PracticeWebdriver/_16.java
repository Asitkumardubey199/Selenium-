package PracticeWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String id:allWindowsId)
		{
			driver.switchTo().window(id);
			if(!id.equals(parentId))
			{
				driver.close();
			}
		}
	}
}
