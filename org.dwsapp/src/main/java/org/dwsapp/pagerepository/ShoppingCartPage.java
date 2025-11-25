package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//initializing via constructor
	public ShoppingCartPage(WebDriver driver) {
    PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcart;

	@FindBy(id = "termsofservice")
	private WebElement checkbox;
   
	@FindBy(xpath = "//button[@value='checkout']")
	private WebElement checkoutbutton;

	@FindBy(id = "billing-address-select")
	private WebElement billingtextfield;
	
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	private WebElement addresscontiniuebutton1;
	
	@FindBy(xpath = "(//input[@value='Continue'])[2]")
	private WebElement addresscontiniuebutton2;
	
	@FindBy(xpath = "(//input[@value='Continue'])[3]")
	private WebElement addresscontiniuebutton3;
	
	@FindBy(xpath = "(//input[@value='Continue'])[4]")
	private WebElement addresscontiniuebutton4;
	
	@FindBy(xpath = "(//input[@value='Continue'])[5]")
	private WebElement addresscontiniuebutton5;
 
	@FindBy(xpath = "(//input[@value='Confirm'])")
	private WebElement confirmshoppingbutton;

	@FindBy(xpath = "//h1[text()='Thank you']")
	private WebElement Thankyoutext;

public WebElement getshoppingcart() {
	return shoppingcart;
}

public WebElement getcheckbox() {
	return checkbox;
}

public WebElement getcheckoutbutton() {
	return checkoutbutton; 
}

public WebElement getbillingtextfield() {
	return billingtextfield;
}

public WebElement getaddresscontiniuebutton1() {
	return addresscontiniuebutton1;
}

public WebElement getaddresscontiniuebutton2() {
	return addresscontiniuebutton2;
}
public WebElement getaddresscontiniuebutton3() {
	return addresscontiniuebutton3;
}
public WebElement getaddresscontiniuebutton4() {
	return addresscontiniuebutton4;
}
public WebElement getaddresscontiniuebutton5() {
	return addresscontiniuebutton5;
}

public WebElement getconfirmshoppingbutton() {
	return confirmshoppingbutton;
}
public WebElement getThankyoutext() {
	return Thankyoutext;
}
}