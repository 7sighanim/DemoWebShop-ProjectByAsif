package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskTopComputersPage {

	@FindBy(linkText ="Build your own cheap computer")
	private WebElement computerlinktext;
	
	@FindBy(id ="add-to-cart-button-72")
	private WebElement addtocart;
	
	public DeskTopComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getComputerlinktext() {
		return computerlinktext;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
}
