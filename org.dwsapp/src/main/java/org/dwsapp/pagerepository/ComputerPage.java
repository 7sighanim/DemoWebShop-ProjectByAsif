package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	
	@FindBy(xpath = "//div[@class='product-item']")
	private WebElement simplecomputerbutton;
	
	@FindBy(id = "product_attribute_75_5_31_96")
	private WebElement processorselection;
	
	@FindBy(id = "add-to-cart-button-75")
	private WebElement addtocartcomputer1;

	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartbutton;
	
	
public ComputerPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
}

public WebElement getsimplecomputerbutton() {
	
	return simplecomputerbutton;


}
public WebElement getprocessorselectionElement() {
	
	return processorselection;
}

public WebElement getaddtocartcomputer1() {
	return addtocartcomputer1;
}
public WebElement getshoppingcartbutton() {
	return shoppingcartbutton;
}
}