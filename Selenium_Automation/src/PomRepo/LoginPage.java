package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;
		
	}

		@FindBy(id="username")
	    private WebElement usernametextfield;
		
		@FindBy(name= "pwd")
		 private WebElement passwordtextfield;
		
		@FindBy(xpath="//div[text()='Login ']")
		 private WebElement loginbutton;
		
		
		public WebElement getusernametextfield() {
			return usernametextfield;
			
		}
		public WebElement getpasswordtextfield() {
			return passwordtextfield;
		}
		public WebElement getLoginButton() {
			return loginbutton;
		}
		
	      public void loginAction(String username,String password) {
	    	 usernametextfield.sendKeys(username);
	    	 passwordtextfield.sendKeys(password);
	    	 loginbutton.click();
	      }
	

	
		
	}


