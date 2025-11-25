package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

	@FindBy(linkText = "Electronics")
	private WebElement electronicsmodule;
	
	@FindBy(linkText = "Smartphone")
	private WebElement smartphoneselection;
	
	@FindBy(linkText = "Show details for Phone Cover")
	private WebElement phonecoverselection;
	
	@FindBy(id = "add-to-cart-button-80")
	private WebElement addtocartphone;
	
	
	@FindBy(linkText = "Show products in category Camera, photo")
	private WebElement cameraselection;
	
	@FindBy(linkText = "Show details for Digital SLR Camera 12.2 Mpixel")
	private WebElement cameraproductselection;
	
	@FindBy(id = "add-to-cart-button-18")
	private WebElement addtocartcamera;
	
public ElectronicsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
}

public WebElement getelectronicsmodule() {
	return electronicsmodule;
	
	
}
public WebElement getsmartphoneselection() {
	return smartphoneselection;
}

public WebElement getphonecoverselection() {
	return phonecoverselection;
}

public WebElement getaddtocartphone() {
	return addtocartphone;
}


public WebElement getcameraselection() {
	return cameraselection;
}
public WebElement getcameraproductselection() {
	return cameraproductselection;
}
public WebElement getaddtocartcamera() {
return addtocartcamera;
}
}