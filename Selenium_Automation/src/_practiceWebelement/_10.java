package _practiceWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameElement = driver.findElement(By.id("username"));
		WebElement passwordElement = driver.findElement(By.name("password"));
		
		usernameElement.clear();
		Thread.sleep(2000);
		usernameElement.sendKeys("admin");
		Thread.sleep(2000);
		passwordElement.clear();
		Thread.sleep(2000);
		passwordElement.sendKeys("Test@123");
		passwordElement.sendKeys(Keys.ENTER);
		

	}

}
