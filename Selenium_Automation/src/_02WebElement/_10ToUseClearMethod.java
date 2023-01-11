package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		
		usernameTextfield.clear();
		Thread.sleep(2000);
		usernameTextfield.sendKeys("admin");
		Thread.sleep(2000);
		passwordTextfield.clear();
		Thread.sleep(2000);
		passwordTextfield.sendKeys("Test@123");
		passwordTextfield.sendKeys(Keys.ENTER);

	}

}
