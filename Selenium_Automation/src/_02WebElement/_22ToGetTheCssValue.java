package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22ToGetTheCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String buttoncolor = driver.findElement(By.xpath("//a[text()='Create New Account']")).getCssValue("background-color");
		System.out.println("The button color is :" +buttoncolor);

	}

}
