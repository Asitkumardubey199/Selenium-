package _05AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03ToClickOnAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//span[text()='selenium']"));
		
		for(WebElement suggestion :allAutoSuggestion)
		{
			String option = suggestion.getText();
			if(option.equals("selenium webdriver"))
			{
				suggestion.click();
				break;
			}
		}
	}

}
