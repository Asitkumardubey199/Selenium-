package GenericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import PomRepo.HomePage;
import PomRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	public ExcelUtility eUtils= new ExcelUtility();
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("Data base connection has been established ");
		
	}
	@BeforeClass
	public void bcconfig() throws IOException {
		
		String url = fUtils.fetchDataFromPropertyFile("url");
	
		FileUtility eUtils= new FileUtility();
		String expectedTitle = eUtils.fetchStringDataFromExcelSheet("Sheet2",1,0);
		
		//test script
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Browser has been launched");
		System.out.println("Navigated to url");
		
	}
	@BeforeMethod
	public void bmconfig() throws IOException {
		String username = fUtils.fetchDataFromPropertyFile("username");
		String password = fUtils.fetchDataFromPropertyFile("password");
		
		     LoginPage login = new LoginPage(driver);
			login.loginAction(username,password);
		System.out.println("Logged in to application");
		
	}
	@AfterMethod
	public void amconfig() {
		HomePage home = new HomePage(driver);
		  home.logoutAction();
		System.out.println("Logged out from the application");
		
	}
	@AfterClass
	public void acconfig() {
		System.out.println("Browser has been closed");
		
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("Data base connection has been closed");
		
	}
	}


