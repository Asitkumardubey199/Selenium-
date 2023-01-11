package _07actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu/");
		
		WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropDown);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByVisibleText("Green");
		Thread.sleep(2000);
		select.selectByValue("5");
		

	}

}
