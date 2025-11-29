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
	
	@FindBy(xpath="//div[@class='shipping-options']/div[1]/select")
	private WebElement countryId;
	
	@FindBy(xpath="//div[@class='shipping-options']/div[2]/select")
	private WebElement stateProvinceId;
	
	@FindBy(id="ZipPostalCode")
	private WebElement zippostalcode;
	
	@FindBy(name="estimateshipping")
	private WebElement estimateshipping;

	@FindBy(id="termsofservice")
	private WebElement termsofservice;
	
	@FindBy(id="checkout")
	private WebElement checkoutbtn;

	@FindBy(xpath="(//input[@value='Continue']) [1]")
	private WebElement billingcontinuebtn;
	
	@FindBy(xpath="(//input[@value='Continue']) [2]")
	private WebElement shippingcontinuebtn;
	
	@FindBy(id="shippingoption_1")
	private WebElement shippingoption;

	@FindBy(xpath="(//input[@value='Continue']) [3]")
	private WebElement shipmethodcontinuebtn;

	@FindBy(id="paymentmethod_0")
	private WebElement paymentmethod;

	@FindBy(xpath="(//input[@value='Continue']) [4]")
	private WebElement paymentcontinuebtn;

	@FindBy(xpath="(//input[@value='Continue']) [5]")
	private WebElement paymentinfocontinuebtn;

	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement confirmbtn;
	
	@FindBy(xpath="//h1[text()='Thank you']")
	private WebElement thankyoutext;

	
	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooklinktext() {
		return booklinktext;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getCountryId() {
		return countryId;
	}
	public WebElement getStateProvinceId() {
		return stateProvinceId;
	}
	public WebElement getZippostalcode() {
		return zippostalcode;
	}
	public WebElement getEstimateshipping() {
		return estimateshipping;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}
	
	public WebElement getTermsofservice() {
		return termsofservice;
	}
	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}
	public WebElement getBillingcontinuebtn() {
		return billingcontinuebtn;
	}
	public WebElement getShippingcontinuebtn() {
		return shippingcontinuebtn;
	}
	public WebElement getShippingmethod() {
		return shippingoption;
	}
	public WebElement getshipmethodcontinuebtn() {
		return shipmethodcontinuebtn;
	}
	public WebElement getPaymentmethod() {
		return paymentmethod;
	}
	public WebElement getPaymentcontinuebtn() {
		return paymentcontinuebtn;
	}
	public WebElement getPaymentinfocontinuebtn() {
		return paymentinfocontinuebtn;
	}
	public WebElement getConfirmbtn() {
		return confirmbtn;
	}
	public WebElement getThankyoutext() {
		return thankyoutext;
	}

}