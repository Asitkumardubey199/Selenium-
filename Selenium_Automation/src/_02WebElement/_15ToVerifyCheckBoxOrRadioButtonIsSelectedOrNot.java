package _02WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15ToVerifyCheckBoxOrRadioButtonIsSelectedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
		boolean selected = checkBox.isSelected();
		
		if(selected)
		{
			System.out.println("Pass: Checkbox is selected");
		}
		else
		{
			System.out.println("Failed: CheckBox is not Selected");
		}

	}

}
