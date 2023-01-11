package _01WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;



public class _19ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.co.in/");
		Thread.sleep(2000);//Thread is a class and sleep is a method which is used to pause the execution of program.
		
		Navigation nav = driver.navigate();
		nav.to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
		URL url = new URL("https://www.instagram.com/");
		nav.to(url);
		
		System.out.println(url);
	}

}
