package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesComputerspage {

	

		@FindBy(linkText ="TCP Instructor Led Training")
		private WebElement accessorieslink;
		
		@FindBy(id="add-to-cart-button-66")
		private WebElement addtocart;
		
		public AccessoriesComputerspage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getAccessorieslink() {
			return accessorieslink;
		}

		public WebElement getAddtocart() {
			return addtocart;
		}
		
}

