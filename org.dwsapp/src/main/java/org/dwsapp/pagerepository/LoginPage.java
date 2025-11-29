package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//input[@id='Email']")
	private	WebElement emailtextfield; 

	 @FindBy(id = "Password")
	 private WebElement passwordtextfield;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}		

		public WebElement getemailTextfield() {
			return emailtextfield;
		}
		
		public WebElement getpasswordTextField() {
			return passwordtextfield;
		}
		
		public WebElement loginButton() {
			return loginButton;
		}

		public WebElement getloginbutton() {
			// TODO Auto-generated method stub
			return loginButton;
		}
		
		
}
