package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
	


		@FindBy(linkText = "Smartphone")
		private WebElement phonelinktext;
		
		
		@FindBy(id="add-to-cart-button-43")
		private WebElement addtocart;
		
		public CellPhonesPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getPhonelinktext() {
			return phonelinktext;
		}

		public WebElement getAddtocart() {
			return addtocart;
		}
		
	}

