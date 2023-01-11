package _practiceWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameElement = driver.findElement(By.id("username"));
		WebElement passwordElement = driver.findElement(By.name("pwd"));
		
		usernameElement.sendKeys("trainee");
		Thread.sleep(2000);
		usernameElement.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		usernameElement.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		passwordElement.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		passwordElement.sendKeys(Keys.ENTER);

	}

}
