package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(linkText = "Log in")
	// Identify and Declare Securely
	private WebElement loginlink;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchboxtextfield;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchbutton;
	
	//@FindBy(xpath = "//div[@class='header-menu']/ul/li[2]/a")
	@FindBy(xpath = "//ul[@class='top-menu']/li[2]/a")
	private WebElement computerheader;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktophidden;
	
	@FindBy(linkText = "Notebooks")
	private WebElement notebookshidden;
	
	@FindBy(linkText = "Accessories")
	private WebElement accessorieshidden;
	
	//@FindBy(xpath = "//div[@class='header-menu']/ul/li[3]/a")
	@FindBy(xpath = "//ul[@class='top-menu']/li[3]/a")
	private WebElement electronicsheader;
	
	@FindBy(linkText = "Camera, photo")
	private WebElement cameraphotohidden;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellphoneshidden;
	
    

	// Initialization via constructor
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization via getters
	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getSearchbox() {
		return searchboxtextfield;
	}

	public WebElement getSearchbutton() {
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