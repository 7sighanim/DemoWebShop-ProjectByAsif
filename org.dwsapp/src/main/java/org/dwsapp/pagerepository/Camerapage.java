package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Camerapage {
	

	

	
		@FindBy(linkText = "Digital SLR Camera 12.2 Mpixel")
		private WebElement cameralinktext;
		
		@FindBy(id="add-to-cart-button-18")
		private WebElement addtocart;
		
		
		


		public Camerapage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getCameralinktext() {
			return cameralinktext;
		}


		public WebElement getAddtocart() {
			return addtocart;
		}
	}

