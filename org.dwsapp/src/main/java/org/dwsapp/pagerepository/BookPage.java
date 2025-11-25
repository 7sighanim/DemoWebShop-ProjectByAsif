package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	@FindBy(linkText = "Books")
	private WebElement bookmodule;
	
	@FindBy(xpath = "//a[@href='/health'")
	private WebElement healthbookproduct;
	
	@FindBy(id = "add-to-cart-button-22")
	private WebElement addtocartbook;
	
	public BookPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getbookmodule() {
		return bookmodule;
	}
	
	public WebElement gethealthbookproduct() {
		return healthbookproduct;
	}
	
	public WebElement getaddtocartbook() {
		return addtocartbook;
	}
}
