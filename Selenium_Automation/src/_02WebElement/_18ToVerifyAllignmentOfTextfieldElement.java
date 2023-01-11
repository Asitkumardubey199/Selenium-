package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _18ToVerifyAllignmentOfTextfieldElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Point usernameLoc = driver.findElement(By.id("username")).getLocation();
		Point passwordLoc = driver.findElement(By.name("pwd")).getLocation();
		
		System.out.println(usernameLoc);
		
		int x = usernameLoc.getX();
		int y = usernameLoc.getY();
		System.out.println("X coordiante is " +x);
		System.out.println("Y coordiante is " +y);
		
		int x1 = passwordLoc.getX();
		int y1 = passwordLoc.getY();
		
		System.out.println(x1);
		System.out.println(y1);
		
		if(x==x1 && y==y1)
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
	}

}
