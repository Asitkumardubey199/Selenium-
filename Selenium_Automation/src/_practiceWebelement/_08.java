package _practiceWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement passwordElement = driver.findElement(By.name("pwd"));
		passwordElement.sendKeys("manager");
		passwordElement.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
	}

}
