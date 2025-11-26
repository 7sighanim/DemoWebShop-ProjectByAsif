package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	//initializing via constructor
	public WelcomePage(WebDriver driver) {
    PageFactory.initElements(driver,this);
	}
	
	// identify and Declare securely
	@FindBy(partialLinkText = "Log")
	private WebElement loginLink;
		
    @FindBy(id = "small-searchterms")
	private WebElement searchboxtextfield;
    
    @FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//a[@href='/register']")
	private WebElement registerlink;
		
	@FindBy(xpath = "//div[@class='header-menu']/ul/li[2]/a")
	private WebElement computerheader;
		
	@FindBy(linkText = "Desktops")
	private WebElement desktophidden;
	
	@FindBy(linkText = "Notebooks")
	private WebElement notebookshidden;
	
	@FindBy(linkText = "Accessories")
	private WebElement accessorieshidden;
	
	@FindBy(xpath = "//div[@class='header-menu']/ul/li[3]/a")
	private WebElement electronicsheader;
	
	@FindBy(linkText = "Camera, photo")
	private WebElement cameraphotohidden;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellphoneshidden;
	
		
		
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
	    
	    public WebElement getComputerheader() {
			return computerheader;
		}
		public WebElement getDesktophidden() {
			return desktophidden;
		}
		public WebElement getNotebookshidden() {
			return notebookshidden;
		}
		public WebElement getAccessorieshidden() {
			return accessorieshidden;
		}
		public WebElement getElectronicsheader() {
			return electronicsheader;
		}
		public WebElement getCameraphotohidden() {
			return cameraphotohidden;
		}
		public WebElement getCellphoneshidden() {
			return cellphoneshidden;
		}
	    
}
