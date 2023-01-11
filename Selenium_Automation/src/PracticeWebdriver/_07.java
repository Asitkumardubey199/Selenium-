package PracticeWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println(height);
		System.out.println(width);
	}
}
