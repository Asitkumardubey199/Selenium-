package _04Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04ToUseXpathByIndependentAndDependent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+13&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+13%7CMobiles&requestId=81ac63fc-0779-4ff9-bff5-95ad10cabe9a&as-searchtext=iph");
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']/../..//div[text()='₹59,990']")).getText();
		System.out.println(price );

	}

}
