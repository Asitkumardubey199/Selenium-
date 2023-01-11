package _01WebDriver;


import org.openqa.selenium.edge.EdgeDriver;

public class _02ToLaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		new EdgeDriver();

	}

}
