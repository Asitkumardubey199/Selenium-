package PracticeWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyUrl {

	public static void main(String[] args) {
		String ExpectedURL="facebook";
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualURL= driver.getCurrentUrl();
         System.out.println("The actual URL is "+ actualURL);
		
		if(actualURL.contains(ExpectedURL))
		{
			System.out.println("Pass : The URL is verified");
		}
		else
		{
			System.out.println("fail : The URL is not verified");
		}
	}
		
		
		
		
		
		
		

	}



