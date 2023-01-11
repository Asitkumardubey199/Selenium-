package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _23ToVerifyTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement usernameTextfield = driver.findElement(By.id("username"));
		String usernameTagName = usernameTextfield.getTagName();
		System.out.println(usernameTagName);
		if(usernameTagName.equals("input"))
		{
			usernameTextfield.sendKeys("admin");
		}
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		String passwordTagName = passwordTextfield.getTagName();
		System.out.println(passwordTagName);
		if(passwordTagName.equals("input"))
		{
			passwordTextfield.sendKeys("manager");
		}
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
		String loginButtonTagName = loginButton.getTagName();
		if(loginButtonTagName.equals("div")) 
		{
			Thread.sleep(2000);
			loginButton.click();
		}
		}
		

}
