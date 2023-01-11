package _04Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05ToUseXpathByAxes {

	public static void main(String[] args) {
		String staticElement = "realme Techlife Buds T100 with up to 28 Hours Playback & AI ENC for Calls Bluetooth Headset";
		String dynamicElement = "₹1,499";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/realme-techlife-buds-t100-up-28-hours-playback-ai-enc-calls-bluetooth-headset/p/itmb496242b3d1fb?pid=ACCGGZEH4K3ZCQFT&lid=LSTACCGGZEH4K3ZCQFTNO8HGO&marketplace=FLIPKART&q=earbuds&store=0pm%2Ffcn%2F821%2Fa7x%2F2si&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&fm=search-autosuggest&iid=2d62ed33-9067-45d0-985a-4c831bbe3619.ACCGGZEH4K3ZCQFT.SEARCH&ppt=sp&ppn=sp&ssid=o77ry5bco00000001667873896428&qH=2951f68ff1fee1e0");
		
		
		driver.findElement(By.xpath("//span[text()='"+staticElement+"']/ancestor::div[@class='aMaAEs']/descendant::div[text()='"+dynamicElement+"']"));
		
	}

}
