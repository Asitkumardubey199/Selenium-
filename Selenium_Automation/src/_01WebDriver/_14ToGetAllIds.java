package _01WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14ToGetAllIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String>allWindowIds = driver.getWindowHandles();
		
		for(String id : allWindowIds)
		{
			System.out.println(id);
		}
		

	}

}
