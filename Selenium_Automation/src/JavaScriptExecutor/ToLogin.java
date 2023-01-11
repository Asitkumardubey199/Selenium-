package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLogin {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameTextField =driver.findElement(By.id("username"));
		WebElement passwordtextField =driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin'",userNameTextField);
		js.executeScript("arguments[0].value='manager'",passwordtextField);
		js.executeScript("arguments[0].click()",loginButton);
		

	}

}
