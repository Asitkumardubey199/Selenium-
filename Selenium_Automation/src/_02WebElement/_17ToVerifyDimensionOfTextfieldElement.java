package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17ToVerifyDimensionOfTextfieldElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension usernameDim = driver.findElement(By.id("username")).getSize();
		System.out.println(usernameDim);
		
		int height = usernameDim.getHeight();
		int width = usernameDim.getWidth();
		
		System.out.println("Height is "+height);
		System.out.println("Width is "+width);
		
		Dimension passwordDim = driver.findElement(By.name("pwd")).getSize();
		System.out.println(passwordDim);
		
		int height1 = passwordDim.getHeight();
		int width1 = passwordDim.getWidth();
		
		System.out.println("passwordTextfield height is :"+height1);
		System.out.println("passwordTextfield width is : "+width1);
	
	if(height==height1 && width==width1)
	{
		System.out.println("verified");
	}
	else
	{
		System.out.println("Not Verified");
	}
}
}
