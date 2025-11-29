package org.dwsapp.pagerepository;



	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class NoteBooksComputerPage {

		@FindBy(linkText ="14.1-inch Laptop")
		private WebElement laptoplinktext;
		
		@FindBy(id="add-to-cart-button-31")
		private WebElement addtocart;

		
		
		public NoteBooksComputerPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}



		public WebElement getLaptoplinktext() {
			return laptoplinktext;
		}



		public WebElement getAddtocart() {
			return addtocart;
		}
		
	}

