package PracticeWebdriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		int x = position.getX();
		int y = position.getY();
		
		System.out.println("X coordinate is: "+x);
		System.out.println("Y coordinate is: "+y);
	}
}
