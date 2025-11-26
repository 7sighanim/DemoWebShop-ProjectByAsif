package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	@FindBy(linkText ="Health Book")
	private WebElement booklinktext;
	
	@FindBy(id="add-to-cart-button-22")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcart;
	
	
	
	public BookPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getBooklinktext() {
		return booklinktext;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getShoppingcart() {
		return shoppingcart;
	}
}
