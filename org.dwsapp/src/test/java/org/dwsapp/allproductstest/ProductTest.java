package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BaseConfig;


import org.dwsapp.genericlibrary.ExcelLibrary;
import org.dwsapp.pagerepository.AccessoriesComputerspage;
import org.dwsapp.pagerepository.BookPage;
import org.dwsapp.pagerepository.Camerapage;
import org.dwsapp.pagerepository.CellPhonesPage;
import org.dwsapp.pagerepository.DeskTopComputersPage;
import org.dwsapp.pagerepository.NoteBooksComputerPage;
import org.dwsapp.pagerepository.WelcomePage;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
 

@Listeners(org.dwsapp.listenerlibrary.ListenerImplimentation.class)
public class ProductTest extends BaseConfig {


	





@Test(enabled = true, priority = 1, groups = "RT")
	public void verifyHealthBook() {

	
	//TakesScreenshot takescreenshotobj = (TakesScreenshot)driver;
	
	
		// create the Test information
		test = report.createTest("verify Healthbook");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();

		bpobj = new BookPage(driver);
		elib = new ExcelLibrary();

		// Step 4: Search box displayed and Enabled
		Assert.assertEquals(wpobj.getSearchbox().isDisplayed(), true);
		Assert.assertEquals(wpobj.getSearchbox().isEnabled(), true);

		if (wpobj.getSearchbox().isDisplayed() && wpobj.getSearchbox().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Searchbox is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Searchbox is not displayed and not enabled");
		}
		Reporter.log("Search box working Successfully", true);

		// Step 5: Entering the data on Search box
		enterDataOnElement(wpobj.getSearchbox(), elib.readdata("Searchdata", 0, 0));
		Reporter.log("Entering data Successfully", true);

		// Step 6: Search button displayed and Enabled and clicked on the Search button
		Assert.assertEquals(wpobj.getSearchbutton().isDisplayed(), true);
		Assert.assertEquals(wpobj.getSearchbutton().isEnabled(), true);
		if (wpobj.getSearchbutton().isDisplayed() && wpobj.getSearchbutton().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Searchbutton is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Searchbutton is not displayed and not enabled");
		}
		clickOnElement(wpobj.getSearchbutton());
		Reporter.log("Search button clicked Successfully", true);

		// Step 7: Book name displayed and Enabled and clicked on the Book link text
		Assert.assertEquals(bpobj.getBooklinktext().isDisplayed(), true);
		Assert.assertEquals(bpobj.getBooklinktext().isEnabled(), true);
		if (bpobj.getBooklinktext().isDisplayed() && bpobj.getBooklinktext().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Booklinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Booklinktext is not displayed and not enabled");
		}
		clickOnElement(bpobj.getBooklinktext());
		Reporter.log("Clicked on the book Successfully", true);

		// Step8: Add to cart button is displayed and Enabled and clicked on the Cart
		Assert.assertEquals(bpobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(bpobj.getAddtocart().isEnabled(), true);
		if (bpobj.getAddtocart().isDisplayed() && bpobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 8: verified the Addtocart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 8: verified the Addtocart is not displayed and not enabled");
		}

		clickOnElement(bpobj.getAddtocart());
		Reporter.log("book Added to cart Successfully", true);
		
		waitStatement(bpobj.getShoppingcart());
		

		// Step 9: Shoppingcart button is displayed and Enabled and clicked on the Cart
		Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
		if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
			test.log(Status.PASS, "Step 9: verified the Shoppingcart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 9: verified the Shoppingcart is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShoppingcart());
		Reporter.log("Clicked on Shoppingcart Successfully", true);

		// Step 10:countryid dropdown is displayed and enabled
		Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
		Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
		if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
			test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
		}
		SelectOption("Canada", bpobj.getCountryId());
		Reporter.log("Clicked on Countryid dropdown  Successfully", true);

		// Step 11:State dropdown is displayed and enabled
		Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
		Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
		if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
			test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
		}
		SelectOption("Manitoba", bpobj.getStateProvinceId());
		Reporter.log("Clicked on State dropdown  Successfully", true);

		// Step 12:Zipcode textfield is displayed and enabled and enter the code
		Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
		Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
		if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
			test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
		}

		enterDataOnElement(bpobj.getZippostalcode(), "637372");
		Reporter.log("Enter the code on Zippostal code  Successfully", true);

		// Step 13:Estimateshipping button is displayed and enabled and clicked on that
		Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
		Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
		if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
			test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getEstimateshipping());
		Reporter.log("Estimateshipping button clicked  Successfully", true);

		// Step 14:clicked on checkbox
		clickOnElement(bpobj.getTermsofservice());
		Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

		// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
		Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
		if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
			test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getCheckoutbtn());
		Reporter.log("Clicked on Checkout button Successfully", true);

		// Step 16:Enter billing address and click on continue
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
		if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getBillingcontinuebtn());
		Reporter.log("Clicked on Billingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingcontinuebtn());

		// Step 17:Enter Shipping address and click on continue
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
		if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingcontinuebtn());
		Reporter.log("Clicked on Shippingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingmethod());

		// Step 18:Select Shipping method and click on continue
		Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
		if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
			test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingmethod());
		clickOnElement(bpobj.getshipmethodcontinuebtn());
		Reporter.log("Clicked on Shipping method continue button Successfully", true);

		waitStatement(bpobj.getPaymentmethod());

		// Step 19:Select payment method and click on continue
		Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
		if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
			test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentmethod());
		clickOnElement(bpobj.getPaymentcontinuebtn());
		Reporter.log("Clicked on Payment method continue button Successfully", true);

		waitStatement(bpobj.getPaymentinfocontinuebtn());

		// Step 20:Payment information continue button is displayed and enabled and
		// click on continue
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
		if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentinfocontinuebtn());
		Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

		waitStatement(bpobj.getConfirmbtn());

		// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
		Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
		if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
			test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getConfirmbtn());
		Reporter.log("Clicked on Confirm button  Successfully", true);

		// Step 22:Thank you text is displayed and enabled
		Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
		Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
		if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
			test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
		}
		Reporter.log("Thank you text displayed Successfully", true);

		Reporter.log("BookTest-HealthBook Verified", true);
	}




//2.
      
@Test(enabled = true, priority = 2, groups = "FT")
public void verifyDesktop() {

	// create the Test information
	test = report.createTest("verify Desktop");

	// steps information
	test.log(Status.INFO, "Step 1: launching the browser");
	test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
	test.log(Status.INFO, "Step 3: verified page Successful");

	waitStatement();

	dcobj = new DeskTopComputersPage(driver);
	wpobj = new WelcomePage(driver);

	// Step 4: MouseHovering to the computersheader
	Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
	Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
	if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
		test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
	}
	mouseHoverToTheElement(wpobj.getComputerheader());
	Reporter.log("Mouse Hovered to the computers Successfully", true);

	

	// Step 5:MouseHovering to the Desktop and clicked on desktop
	Assert.assertEquals(wpobj.getDesktophidden().isDisplayed(), true);
	Assert.assertEquals(wpobj.getDesktophidden().isEnabled(), true);
	if (wpobj.getDesktophidden().isDisplayed() && wpobj.getDesktophidden().isEnabled()) {
		test.log(Status.PASS, "Step 5: verified the Desktop is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 5: verified the Desktop is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getDesktophidden());
	Reporter.log("Desktop clicked Successfully", true);
	
	waitStatement(dcobj.getComputerlinktext());
	
	// Step 6: Computer text is displayed and enabled
	Assert.assertEquals(dcobj.getComputerlinktext().isDisplayed(), true);
	Assert.assertEquals(dcobj.getComputerlinktext().isEnabled(), true);
	if (dcobj.getComputerlinktext().isDisplayed() && dcobj.getComputerlinktext().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Computerlinktext is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Computerlinktext is not displayed and not enabled");
	}
	clickOnElement(dcobj.getComputerlinktext());
	Reporter.log("computer text clicked Successfully", true);

	// Step 7: Add to cart is displayed and enabled
	Assert.assertEquals(dcobj.getAddtocart().isDisplayed(), true);
	Assert.assertEquals(dcobj.getAddtocart().isEnabled(), true);
	if (dcobj.getAddtocart().isDisplayed() && dcobj.getAddtocart().isEnabled()) {
		test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
	}
	clickOnElement(dcobj.getAddtocart());
	Reporter.log("computer added to cart Successfully", true);

	// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
	Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
	if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
		test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShoppingcart());
	Reporter.log("Clicked on Shoppingcart Successfully", true);

	// Step 10:countryid dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
	if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
		test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
	}
	SelectOption("Canada", bpobj.getCountryId());
	Reporter.log("Clicked on Countryid dropdown  Successfully", true);

	// Step 11:State dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
	if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
		test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
	}
	SelectOption("Manitoba", bpobj.getStateProvinceId());
	Reporter.log("Clicked on State dropdown  Successfully", true);

	// Step 12:Zipcode textfield is displayed and enabled and enter the code
	Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
	Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
	if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
		test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
	}

	enterDataOnElement(bpobj.getZippostalcode(), "637372");
	Reporter.log("Enter the code on Zippostal code  Successfully", true);

	// Step 13:Estimateshipping button is displayed and enabled and clicked on that
	Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
	Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
	if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
		test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getEstimateshipping());
	Reporter.log("Estimateshipping button clicked  Successfully", true);

	// Step 14:clicked on checkbox
	clickOnElement(bpobj.getTermsofservice());
	Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

	// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
	Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
	if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
		test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getCheckoutbtn());
	Reporter.log("Clicked on Checkout button Successfully", true);

	// Step 16:Enter billing address and click on continue
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
	if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getBillingcontinuebtn());
	Reporter.log("Clicked on Billingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingcontinuebtn());

	// Step 17:Enter Shipping address and click on continue
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
	if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingcontinuebtn());
	Reporter.log("Clicked on Shippingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingmethod());

	// Step 18:Select Shipping method and click on continue
	Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
	if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
		test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingmethod());
	clickOnElement(bpobj.getshipmethodcontinuebtn());
	Reporter.log("Clicked on Shipping method continue button Successfully", true);

	waitStatement(bpobj.getPaymentmethod());

	// Step 19:Select payment method and click on continue
	Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
	if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
		test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentmethod());
	clickOnElement(bpobj.getPaymentcontinuebtn());
	Reporter.log("Clicked on Payment method continue button Successfully", true);

	waitStatement(bpobj.getPaymentinfocontinuebtn());

	// Step 20:Payment information continue button is displayed and enabled and click on continue
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
	if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentinfocontinuebtn());
	Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

	waitStatement(bpobj.getConfirmbtn());

	// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
	Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
	if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
		test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getConfirmbtn());
	Reporter.log("Clicked on Confirm button  Successfully", true);

	// Step 22:Thank you text is displayed and enabled
	Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
	Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
	if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
		test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
	}
	Reporter.log("Thank you text displayed Successfully", true);

	Reporter.log("ComputerTest-Desktop Verified", true);
}







// 3. 

private void mouseHoverToTheElement(WebElement computerheader) {
	// TODO Auto-generated method stub
	
}




@Test(enabled = true, priority = 3, groups = "IT")
public void verifyNoteBook() {

	// create the Test information
	test = report.createTest("verify NoteBook");

	// steps information
	test.log(Status.INFO, "Step 1: launching the browser");
	test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
	test.log(Status.INFO, "Step 3: verified page Successful");

	waitStatement();

	ncobj = new NoteBooksComputerPage(driver);
	wpobj = new WelcomePage(driver);

	// Step 4: MouseHovering to the computers
	Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
	Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
	if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
		test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getComputerheader());
	Reporter.log("Mouse Hovered to the computers Successfully");

	waitStatement(wpobj.getNotebookshidden());

	// Step 5:MouseHovering to the Notebooks and clicked on Notebooks
	Assert.assertEquals(wpobj.getNotebookshidden().isDisplayed(), true);
	Assert.assertEquals(wpobj.getNotebookshidden().isEnabled(), true);
	if (wpobj.getNotebookshidden().isDisplayed() && wpobj.getNotebookshidden().isEnabled()) {
		test.log(Status.PASS, "Step 5: verified the Notebooks is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 5: verified the Notebooks is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getNotebookshidden());
	Reporter.log("Notebooks clicked Successfully");

	// Step 6: Laptop text is displayed and enabled
	Assert.assertEquals(ncobj.getLaptoplinktext().isDisplayed(), true);
	Assert.assertEquals(ncobj.getLaptoplinktext().isEnabled(), true);
	if (ncobj.getLaptoplinktext().isDisplayed() && ncobj.getLaptoplinktext().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Laptoplinktext is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Laptoplinktext is not displayed and not enabled");
	}
	clickOnElement(ncobj.getLaptoplinktext());
	Reporter.log("Laptop text clicked Successfully", true);

	// Step 7: Add to cart is displayed and enabled
	Assert.assertEquals(ncobj.getAddtocart().isDisplayed(), true);
	Assert.assertEquals(ncobj.getAddtocart().isEnabled(), true);
	if (ncobj.getAddtocart().isDisplayed() && ncobj.getAddtocart().isEnabled()) {
		test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
	}
	clickOnElement(ncobj.getAddtocart());
	Reporter.log("computer added to cart Successfully", true);

	// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
	Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
	if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
		test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShoppingcart());
	Reporter.log("Clicked on Shoppingcart Successfully", true);

	// Step 10:countryid dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
	if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
		test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
	}
	SelectOption("Canada", bpobj.getCountryId());
	Reporter.log("Clicked on Countryid dropdown  Successfully", true);

	// Step 11:State dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
	if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
		test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
	}
	SelectOption("Manitoba", bpobj.getStateProvinceId());
	Reporter.log("Clicked on State dropdown  Successfully", true);

	// Step 12:Zipcode textfield is displayed and enabled and enter the code
	Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
	Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
	if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
		test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
	}

	enterDataOnElement(bpobj.getZippostalcode(), "637372");
	Reporter.log("Enter the code on Zippostal code  Successfully", true);

	// Step 13:Estimateshipping button is displayed and enabled and clicked on that
	Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
	Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
	if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
		test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getEstimateshipping());
	Reporter.log("Estimateshipping button clicked  Successfully", true);

	// Step 14:clicked on checkbox
	clickOnElement(bpobj.getTermsofservice());
	Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

	// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
	Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
	if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
		test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getCheckoutbtn());
	Reporter.log("Clicked on Checkout button Successfully", true);

	// Step 16:Enter billing address and click on continue
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
	if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getBillingcontinuebtn());
	Reporter.log("Clicked on Billingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingcontinuebtn());

	// Step 17:Enter Shipping address and click on continue
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
	if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingcontinuebtn());
	Reporter.log("Clicked on Shippingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingmethod());

	// Step 18:Select Shipping method and click on continue
	Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
	if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
		test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingmethod());
	clickOnElement(bpobj.getshipmethodcontinuebtn());
	Reporter.log("Clicked on Shipping method continue button Successfully", true);

	waitStatement(bpobj.getPaymentmethod());

	// Step 19:Select payment method and click on continue
	Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
	if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
		test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentmethod());
	clickOnElement(bpobj.getPaymentcontinuebtn());
	Reporter.log("Clicked on Payment method continue button Successfully", true);

	waitStatement(bpobj.getPaymentinfocontinuebtn());

	// Step 20:Payment information continue button is displayed and enabled and
	// click on continue
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
	if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentinfocontinuebtn());
	Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

	waitStatement(bpobj.getConfirmbtn());

	// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
	Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
	if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
		test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getConfirmbtn());
	Reporter.log("Clicked on Confirm button  Successfully", true);

	// Step 22:Thank you text is displayed and enabled
	Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
	Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
	if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
		test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
	}
	Reporter.log("Thank you text displayed Successfully", true);
	Reporter.log("ComputerTest-NoteBook Verified", true);
}


//4.


@Test(enabled = true, priority = 4, groups = "RT")
public void verifyAccessories() {

	// create the Test information
	test = report.createTest("verify Accessories");

	// steps information
	test.log(Status.INFO, "Step 1: launching the browser");
	test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
	test.log(Status.INFO, "Step 3: verified page Successful");

	waitStatement();
	acobj = new AccessoriesComputerspage(driver);
	wpobj = new WelcomePage(driver);

	// Step 4: MouseHovering to the computers
	Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
	Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
	if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
		test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
	}
	mouseHoverToTheElement(wpobj.getComputerheader());
	Reporter.log("Mouse Hovered to the computers Successfully");

	waitStatement(wpobj.getAccessorieshidden());

	// Step 5:MouseHovering to the Notebooks and clicked on Notebooks
	Assert.assertEquals(wpobj.getAccessorieshidden().isDisplayed(), true);
	Assert.assertEquals(wpobj.getAccessorieshidden().isEnabled(), true);
	if (wpobj.getAccessorieshidden().isDisplayed() && wpobj.getAccessorieshidden().isEnabled()) {
		test.log(Status.PASS, "Step 5: verified the Accessories is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 5: verified the Accessories is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getAccessorieshidden());
	Reporter.log("Accessories clicked Successfully");

	// Step 6: Accessories text is displayed and enabled
	Assert.assertEquals(acobj.getAccessorieslink().isDisplayed(), true);
	Assert.assertEquals(acobj.getAccessorieslink().isEnabled(), true);
	if (acobj.getAccessorieslink().isDisplayed() && acobj.getAccessorieslink().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Accessories is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Accessories is not displayed and not enabled");
	}
	clickOnElement(acobj.getAccessorieslink());
	Reporter.log("Accessories text clicked Successfully", true);

	// Step 7: Add to cart is displayed and enabled
	Assert.assertEquals(acobj.getAddtocart().isDisplayed(), true);
	Assert.assertEquals(acobj.getAddtocart().isEnabled(), true);
	if (acobj.getAddtocart().isDisplayed() && acobj.getAddtocart().isEnabled()) {
		test.log(Status.PASS, "Step 7: verified the Addtocart() is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 7: verified the Addtocart() is not displayed and not enabled");
	}
	clickOnElement(acobj.getAddtocart());
	Reporter.log("computer added to cart Successfully", true);

	// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
	Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
	if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
		test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShoppingcart());
	Reporter.log("Clicked on Shoppingcart Successfully", true);

	// Step 10:countryid dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
	if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
		test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
	}
	SelectOption("Canada", bpobj.getCountryId());
	Reporter.log("Clicked on Countryid dropdown  Successfully", true);

	// Step 11:State dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
	if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
		test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
	}
	SelectOption("Manitoba", bpobj.getStateProvinceId());
	Reporter.log("Clicked on State dropdown  Successfully", true);

	// Step 12:Zipcode textfield is displayed and enabled and enter the code
	Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
	Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
	if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
		test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
	}

	enterDataOnElement(bpobj.getZippostalcode(), "637372");
	Reporter.log("Enter the code on Zippostal code  Successfully", true);

	// Step 13:Estimateshipping button is displayed and enabled and clicked on that
	Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
	Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
	if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
		test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getEstimateshipping());
	Reporter.log("Estimateshipping button clicked  Successfully", true);

	// Step 14:clicked on checkbox
	clickOnElement(bpobj.getTermsofservice());
	Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

	// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
	Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
	if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
		test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getCheckoutbtn());
	Reporter.log("Clicked on Checkout button Successfully", true);

	// Step 16:Enter billing address and click on continue
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
	if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getBillingcontinuebtn());
	Reporter.log("Clicked on Billingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingcontinuebtn());

	// Step 17:Enter Shipping address and click on continue
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
	if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingcontinuebtn());
	Reporter.log("Clicked on Shippingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingmethod());

	// Step 18:Select Shipping method and click on continue
	Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
	if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
		test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingmethod());
	clickOnElement(bpobj.getshipmethodcontinuebtn());
	Reporter.log("Clicked on Shipping method continue button Successfully", true);

	waitStatement(bpobj.getPaymentmethod());

	// Step 19:Select payment method and click on continue
	Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
	if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
		test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentmethod());
	clickOnElement(bpobj.getPaymentcontinuebtn());
	Reporter.log("Clicked on Payment method continue button Successfully", true);

	waitStatement(bpobj.getPaymentinfocontinuebtn());

	// Step 20:Payment information continue button is displayed and enabled and
	// click on continue
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
	if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentinfocontinuebtn());
	Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

	waitStatement(bpobj.getConfirmbtn());

	// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
	Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
	if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
		test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getConfirmbtn());
	Reporter.log("Clicked on Confirm button  Successfully", true);

	// Step 22:Thank you text is displayed and enabled
	Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
	Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
	if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
		test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
	}
	Reporter.log("Thank you text displayed Successfully", true);
	Reporter.log("ComputerTest-Accessories Verified", true);
}


//5.



@Test(enabled = true, priority = 5, groups = "FT")
public void verifyCameraAndPhoto() {

	// create the Test information
	test = report.createTest("verify CameraAndPhoto");

	// steps information
	test.log(Status.INFO, "Step 1: launching the browser");
	test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
	test.log(Status.INFO, "Step 3: verified page Successful");

	waitStatement();
	cpobj = new Camerapage(driver);
	wpobj = new WelcomePage(driver);

	// Step 4: MouseHovering to the Electronics
	Assert.assertEquals(wpobj.getElectronicsheader().isDisplayed(), true);
	Assert.assertEquals(wpobj.getElectronicsheader().isEnabled(), true);
	if (wpobj.getElectronicsheader().isDisplayed() && wpobj.getElectronicsheader().isEnabled()) {
		test.log(Status.PASS, "Step 4: verified the Electronicsheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 4: verified the Electronicsheader is not displayed and not enabled");
	}
	mouseHoverToTheElement(wpobj.getElectronicsheader());
	Reporter.log("Mouse Hovered to the Electronics Successfully");

	waitStatement(wpobj.getCameraphotohidden());

	// Step 5: MouseHovering to the Electronics and clicked on Camera and Photo
	Assert.assertEquals(wpobj.getCameraphotohidden().isDisplayed(), true);
	Assert.assertEquals(wpobj.getCameraphotohidden().isEnabled(), true);
	if (wpobj.getCameraphotohidden().isDisplayed() && wpobj.getCameraphotohidden().isEnabled()) {
		test.log(Status.PASS, "Step 5: verified the Cameraphoto is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 5: verified the Cameraphoto is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getCameraphotohidden());
	Reporter.log("Camera clicked Successfully");

	// Step 6: Camera text is displayed and enabled
	Assert.assertEquals(cpobj.getCameralinktext().isDisplayed(), true);
	Assert.assertEquals(cpobj.getCameralinktext().isEnabled(), true);
	if (cpobj.getCameralinktext().isDisplayed() && cpobj.getCameralinktext().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Electronicsheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Electronicsheader is not displayed and not enabled");
	}
	clickOnElement(cpobj.getCameralinktext());
	Reporter.log("camera text clicked Successfully", true);

	// Step 7: Add to cart is displayed and enabled
	Assert.assertEquals(cpobj.getAddtocart().isDisplayed(), true);
	Assert.assertEquals(cpobj.getAddtocart().isEnabled(), true);
	if (cpobj.getAddtocart().isDisplayed() && cpobj.getAddtocart().isEnabled()) {
		test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
	}
	clickOnElement(cpobj.getAddtocart());
	Reporter.log("Camera added to cart Successfully", true);

	// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
	Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
	if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
		test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShoppingcart());
	Reporter.log("Clicked on Shoppingcart Successfully", true);

	// Step 10:countryid dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
	if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
		test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
	}
	SelectOption("Canada", bpobj.getCountryId());
	Reporter.log("Clicked on Countryid dropdown  Successfully", true);

	// Step 11:State dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
	if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
		test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
	}
	SelectOption("Manitoba", bpobj.getStateProvinceId());
	Reporter.log("Clicked on State dropdown  Successfully", true);

	// Step 12:Zipcode textfield is displayed and enabled and enter the code
	Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
	Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
	if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
		test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
	}

	enterDataOnElement(bpobj.getZippostalcode(), "637372");
	Reporter.log("Enter the code on Zippostal code  Successfully", true);

	// Step 13:Estimateshipping button is displayed and enabled and clicked on that
	Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
	Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
	if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
		test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getEstimateshipping());
	Reporter.log("Estimateshipping button clicked  Successfully", true);

	// Step 14:clicked on checkbox
	clickOnElement(bpobj.getTermsofservice());
	Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

	// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
	Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
	if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
		test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getCheckoutbtn());
	Reporter.log("Clicked on Checkout button Successfully", true);

	// Step 16:Enter billing address and click on continue
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
	if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getBillingcontinuebtn());
	Reporter.log("Clicked on Billingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingcontinuebtn());

	// Step 17:Enter Shipping address and click on continue
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
	if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingcontinuebtn());
	Reporter.log("Clicked on Shippingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingmethod());

	// Step 18:Select Shipping method and click on continue
	Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
	if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
		test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingmethod());
	clickOnElement(bpobj.getshipmethodcontinuebtn());
	Reporter.log("Clicked on Shipping method continue button Successfully", true);

	waitStatement(bpobj.getPaymentmethod());

	// Step 19:Select payment method and click on continue
	Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
	if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
		test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentmethod());
	clickOnElement(bpobj.getPaymentcontinuebtn());
	Reporter.log("Clicked on Payment method continue button Successfully", true);

	waitStatement(bpobj.getPaymentinfocontinuebtn());

	// Step 20:Payment information continue button is displayed and enabled and
	// click on continue
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
	if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentinfocontinuebtn());
	Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

	waitStatement(bpobj.getConfirmbtn());

	// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
	Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
	if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
		test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getConfirmbtn());
	Reporter.log("Clicked on Confirm button  Successfully", true);

	// Step 22:Thank you text is displayed and enabled
	Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
	Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
	if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
		test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
	}
	Reporter.log("Thank you text displayed Successfully", true);
	Reporter.log("ElectronicsTest-Camera and phone Verified", true);
}



//6.


@Test(enabled = true, priority = 6, groups = "RT")
public void verifyCellPhones() {

	// create the Test information
	test = report.createTest("verify CellPhones");

	// steps information
	test.log(Status.INFO, "Step 1: launching the browser");
	test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
	test.log(Status.INFO, "Step 3: verified page Successful");

	waitStatement();

	cppobj = new CellPhonesPage(driver);
	wpobj = new WelcomePage(driver);

	// Step 4: MouseHovering to the Electronics
	Assert.assertEquals(wpobj.getElectronicsheader().isDisplayed(), true);
	Assert.assertEquals(wpobj.getElectronicsheader().isEnabled(), true);
	if (wpobj.getElectronicsheader().isDisplayed() && wpobj.getElectronicsheader().isEnabled()) {
		test.log(Status.PASS, "Step 4: verified the Electronicsheader is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 4: verified the Electronicsheader is not displayed and not enabled");
	}
	mouseHoverToTheElement(wpobj.getElectronicsheader());
	Reporter.log("Mouse Hovered to the Electronics Successfully");

	waitStatement(wpobj.getCellphoneshidden());

	// Step 5: MouseHovering to the Electronics and clicked on cell phones
	Assert.assertEquals(wpobj.getCellphoneshidden().isDisplayed(), true);
	Assert.assertEquals(wpobj.getCellphoneshidden().isEnabled(), true);
	if (wpobj.getCellphoneshidden().isDisplayed() && wpobj.getCellphoneshidden().isEnabled()) {
		test.log(Status.PASS, "Step 5: verified the Cellphones is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 5: verified the Cellphones is not displayed and not enabled");
	}
	clickOnElement_UsingActions(wpobj.getCellphoneshidden());
	Reporter.log("Cellphone clicked Successfully");

	// Step 6: Camera text is displayed and enabled
	Assert.assertEquals(cppobj.getPhonelinktext().isDisplayed(), true);
	Assert.assertEquals(cppobj.getPhonelinktext().isEnabled(), true);
	if (cppobj.getPhonelinktext().isDisplayed() && cppobj.getPhonelinktext().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Phonelinktext is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Phonelinktext is not displayed and not enabled");
	}
	clickOnElement(cppobj.getPhonelinktext());
	Reporter.log("Phone text clicked Successfully", true);

	// Step 7: Add to cart is displayed and enabled
	Assert.assertEquals(cppobj.getAddtocart().isDisplayed(), true);
	Assert.assertEquals(cppobj.getAddtocart().isEnabled(), true);
	if (cppobj.getAddtocart().isDisplayed() && cppobj.getAddtocart().isEnabled()) {
		test.log(Status.PASS, "Step 6: verified the Phonelinktext is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 6: verified the Phonelinktext is not displayed and not enabled");
	}
	clickOnElement(cppobj.getAddtocart());
	Reporter.log("Phone added to cart Successfully", true);
	// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
	Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
	if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
		test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShoppingcart());
	Reporter.log("Clicked on Shoppingcart Successfully", true);

	// Step 10:countryid dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
	if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
		test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
	}
	SelectOption("Canada", bpobj.getCountryId());
	Reporter.log("Clicked on Countryid dropdown  Successfully", true);

	// Step 11:State dropdown is displayed and enabled
	Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
	Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
	if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
		test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
	}
	SelectOption("Manitoba", bpobj.getStateProvinceId());
	Reporter.log("Clicked on State dropdown  Successfully", true);

	// Step 12:Zipcode textfield is displayed and enabled and enter the code
	Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
	Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
	if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
		test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
	}

	enterDataOnElement(bpobj.getZippostalcode(), "637372");
	Reporter.log("Enter the code on Zippostal code  Successfully", true);

	// Step 13:Estimateshipping button is displayed and enabled and clicked on that
	Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
	Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
	if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
		test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getEstimateshipping());
	Reporter.log("Estimateshipping button clicked  Successfully", true);

	// Step 14:clicked on checkbox
	clickOnElement(bpobj.getTermsofservice());
	Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

	// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
	Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
	if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
		test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getCheckoutbtn());
	Reporter.log("Clicked on Checkout button Successfully", true);

	// Step 16:Enter billing address and click on continue
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
	if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getBillingcontinuebtn());
	Reporter.log("Clicked on Billingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingcontinuebtn());

	// Step 17:Enter Shipping address and click on continue
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
	if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingcontinuebtn());
	Reporter.log("Clicked on Shippingcontinue button Successfully", true);

	waitStatement(bpobj.getShippingmethod());

	// Step 18:Select Shipping method and click on continue
	Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
	if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
		test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getShippingmethod());
	clickOnElement(bpobj.getshipmethodcontinuebtn());
	Reporter.log("Clicked on Shipping method continue button Successfully", true);

	waitStatement(bpobj.getPaymentmethod());

	// Step 19:Select payment method and click on continue
	Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
	if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
		test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentmethod());
	clickOnElement(bpobj.getPaymentcontinuebtn());
	Reporter.log("Clicked on Payment method continue button Successfully", true);

	waitStatement(bpobj.getPaymentinfocontinuebtn());

	// Step 20:Payment information continue button is displayed and enabled and
	// click on continue
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
	if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
		test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getPaymentinfocontinuebtn());
	Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

	waitStatement(bpobj.getConfirmbtn());

	// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
	Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
	Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
	if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
		test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
	}
	clickOnElement(bpobj.getConfirmbtn());
	Reporter.log("Clicked on Confirm button  Successfully", true);

	// Step 22:Thank you text is displayed and enabled
	Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
	Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
	if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
		test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
	} else {
		test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
	}
	Reporter.log("Thank you text displayed Successfully", true);
	Reporter.log("ElectronicsTest-CellPhones Verified", true);
}

       

      



}
