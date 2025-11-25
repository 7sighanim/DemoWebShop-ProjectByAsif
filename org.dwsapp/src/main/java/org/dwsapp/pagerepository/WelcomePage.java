package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(partialLinkText = "Log")
	// identify and Declare securely
		private WebElement loginLink;
		
    @FindBy(id = "small-searchterms")
	private WebElement searchboxtextfield;
    
    @FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//a[@href='/register']")
	private WebElement registerlink;
		
		//initializing via constructor
		public WelcomePage(WebDriver driver) {
	    PageFactory.initElements(driver,this);
		}
		
		
		
		
		
		
		// utilization
	    public WebElement getloginlink() {
	    	return loginLink;
	    	
	    }
	    
	    public WebElement getregisterlink() {
	    	
	    	return registerlink;
	    }
	    
	    public WebElement getlogoutlink() {
	    	return logoutLink;
	    	
	    }
	    
	    public WebElement getsearchboxtextfield() {
			
			return searchboxtextfield;
		}
	    
	    public WebElement getsearchbutton() {
	    	
	    	return searchbutton;
	    }
}
