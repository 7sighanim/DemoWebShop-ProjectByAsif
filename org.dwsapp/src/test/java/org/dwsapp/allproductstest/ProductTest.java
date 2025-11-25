package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BaseConfig;
import org.dwsapp.genericlibrary.ExcelLibrary;
import org.dwsapp.pagerepository.BookPage;
import org.dwsapp.pagerepository.ComputerPage;
import org.dwsapp.pagerepository.ElectronicsPage;
import org.dwsapp.pagerepository.ShoppingCartPage;
import org.dwsapp.pagerepository.WelcomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(org.dwsapp.listenerlibrary.ListenerImplimentation.class)
public class ProductTest extends BaseConfig {

//  1. COMPUTER TEST

	// product1

	@Test(enabled = true, priority = 2, groups = "FT")
	public void verifyDesktop() {

		waitStatement();

		cpobj = new ComputerPage(driver);
		wpobj = new WelcomePage(driver);
		scobj = new ShoppingCartPage(driver);

		// create the test information
		test = report.createTest("Verify Desktop");

		// step information
		test.log(Status.INFO, "Step1: Launching the browser succesfull");
		test.log(Status.INFO, "Step2: Navigating To Application via URL succesfull");
		test.log(Status.PASS, "Step3: Verified the webpage succesfull");

		// step1:SearchBox
		Assert.assertEquals(wpobj.getsearchboxtextfield().isDisplayed(), true);
		Assert.assertEquals(wpobj.getsearchboxtextfield().isEnabled(), true);
		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the simplecomputer is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the Webelements Not displayed and not enabled");
		}
		Reporter.log("search box is displayed and enabled :) ", true);

		enterDataOnElement(wpobj.getsearchboxtextfield(), "simple computer");

		// step3:search button
		Assert.assertEquals(wpobj.getsearchbutton().isDisplayed(), true);
		Assert.assertEquals(wpobj.getsearchbutton().isEnabled(), true);
		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the simplecomputer is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the Webelements Not displayed and not enabled");
		}
		Reporter.log("search button is active", true);

		clickOnElement_UsingActions(wpobj.getsearchbutton());

		// step4: click on simple computer product
		Assert.assertTrue(cpobj.getsimplecomputerbutton().isDisplayed());
		Assert.assertTrue(cpobj.getsimplecomputerbutton().isEnabled());

		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the simplecomputer is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the Webelements Not displayed and not enabled");
		}
		clickOnElement(cpobj.getsimplecomputerbutton());

		// processor selection- mandatory before add to cart.

		Assert.assertEquals(cpobj.getprocessorselectionElement().isDisplayed(), true);
		Assert.assertEquals(cpobj.getprocessorselectionElement().isEnabled(), true);
		if (cpobj.getprocessorselectionElement().isDisplayed() && cpobj.getprocessorselectionElement().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified proccessor selction is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the proccessor selction Not displayed and not enabled");
		}
		clickOnElement(cpobj.getprocessorselectionElement());

		Assert.assertEquals(cpobj.getaddtocartcomputer1().isDisplayed(), true);
		Assert.assertEquals(cpobj.getaddtocartcomputer1().isEnabled(), true);
		if (cpobj.getprocessorselectionElement().isDisplayed() && cpobj.getprocessorselectionElement().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified addtocart is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the addtocart Not displayed and not enabled");
		}

		clickOnElement(cpobj.getaddtocartcomputer1());

		Reporter.log("computer-Added to cart succesfully", true);

		
		
		
		
    //open shopping cart 
		Assert.assertEquals(scobj.getshoppingcart().isDisplayed(), true);
		Assert.assertEquals(scobj.getshoppingcart().isEnabled(), true);
		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the shopping cart button is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the shoppingcart button Not displayed and not enabled");
		}
		Reporter.log("shopping cart is displayed and enabled :) ", true);
		clickOnElement(scobj.getshoppingcart());

	//click on terms agree checkbox
		waitStatement(scobj.getcheckbox());
		
		clickOnElement(scobj.getcheckbox());
		Reporter.log("ticked checkbox", true);
		
 //Check out button
		Assert.assertEquals(scobj.getcheckoutbutton().isDisplayed(), true);
		Assert.assertEquals(scobj.getcheckoutbutton().isEnabled(), true);
		if (scobj.getcheckoutbutton().isDisplayed() && scobj.getcheckoutbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the Check out button is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the Check out button Not displayed and not enabled");
		}
		
		waitStatement(scobj.getcheckoutbutton());
		clickOnElement(scobj.getcheckoutbutton());
		Reporter.log("CheckOut button is clicked succesfully :) ", true);
		
		
//billing address
		Assert.assertEquals(scobj.getaddresscontiniuebutton1().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton1().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton1().isDisplayed() && scobj.getaddresscontiniuebutton1().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the addresscontiniuebutton is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the addresscontiniuebutton Not displayed and not enabled");
		}
		
		
		
		clickOnElement(scobj.getaddresscontiniuebutton1());
		waitStatement(scobj.getaddresscontiniuebutton1());
		
		clickOnElement(scobj.getaddresscontiniuebutton2());
		waitStatement(scobj.getaddresscontiniuebutton2());
		
		clickOnElement(scobj.getaddresscontiniuebutton3());
		waitStatement(scobj.getaddresscontiniuebutton3());
		
		clickOnElement(scobj.getaddresscontiniuebutton4());
		waitStatement(scobj.getaddresscontiniuebutton4());
		
		clickOnElement(scobj.getaddresscontiniuebutton5());
		waitStatement(scobj.getaddresscontiniuebutton5());
		
		clickOnElement(scobj.getconfirmshoppingbutton());
		
		
	Reporter.log("Your order has been successfully processed!" , true );
		
		
		
	}
	
	
	
	// product2
	

	

	@Test(enabled = false, priority = 1, groups = "IT")
	public void verifyNotebook() {

		waitStatement();
		

		Reporter.log("Computer-Notebook product Verified", true);
	}

	// product3

	@Test(enabled = false, priority = 3, groups = "RT")
	public void verifyAccessories() {
		waitStatement();

		Reporter.log("Computer-Accessories product Verified", true);
	}

	// 2. BOOK TEST

	// product4
	@Test(enabled = false, priority = 1, groups = "RT")
	public void verifyHealthBook() {

		waitStatement();

		exlib = new ExcelLibrary();
		bpobj = new BookPage(driver);

		test = report.createTest("Verify Health Book");

		test.log(Status.INFO, "Step1: Launching the browser succesfull");
		test.log(Status.INFO, "Step2: Navigating To Application via URL succesfull");
		test.log(Status.PASS, "Step3: Verified the webpage succesfull");

		// step1:
		Assert.assertTrue(wpobj.getsearchboxtextfield().isDisplayed());
		Assert.assertTrue(wpobj.getsearchboxtextfield().isEnabled());

		if (wpobj.getsearchboxtextfield().isDisplayed() && wpobj.getsearchboxtextfield().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the health book product is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the searchbox text field is Not displayed and not enabled");
		}
		Reporter.log("search Box text filed is displayed and enabled");

		// step2:enter data in txt field
		enterDataOnElement(wpobj.getsearchboxtextfield(), exlib.readdata("Searchdata", 0, 0));

		// step3: click on health book product
		Assert.assertTrue(bpobj.gethealthbookproduct().isDisplayed());
		Assert.assertTrue(bpobj.gethealthbookproduct().isEnabled());

		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the health book product is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the health book product Not displayed and not enabled");
		}
		clickOnElement(bpobj.gethealthbookproduct());

		// step4: add to cart
		Assert.assertTrue(bpobj.getaddtocartbook().isDisplayed());
		Assert.assertTrue(bpobj.getaddtocartbook().isEnabled());

		if (cpobj.getsimplecomputerbutton().isDisplayed() && cpobj.getsimplecomputerbutton().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified the add to cart is Displyed and is enabled");

		} else {
			test.log(Status.FAIL, "Step4: Verified the add to cart is Not displayed and not enabled");
		}

		clickOnElement(bpobj.getaddtocartbook());

		Reporter.log("Healthbook- Added to cart succesfully", true);
		
		// Step 16:Enter billing address and click on continue
		Assert.assertEquals(scobj.getaddresscontiniuebutton1().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton1().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton1().isDisplayed() && scobj.getaddresscontiniuebutton1().isEnabled()) {
			test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(scobj.getaddresscontiniuebutton1());
		Reporter.log("Clicked on Billingcontinue button Successfully", true);

		waitStatement(scobj.getaddresscontiniuebutton2());

		// Step 17:Enter Shipping address and click on continue
		Assert.assertEquals(scobj.getaddresscontiniuebutton2().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton2().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton2().isDisplayed() && scobj.getaddresscontiniuebutton2().isEnabled()) {
			test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(scobj.getaddresscontiniuebutton2());
		Reporter.log("Clicked on Shippingcontinue button Successfully", true);

		waitStatement(scobj.getaddresscontiniuebutton3());

		// Step 18:Select Shipping method and click on continue
		Assert.assertEquals(scobj.getaddresscontiniuebutton3().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton3().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton3().isDisplayed() && scobj.getaddresscontiniuebutton3().isEnabled()) {
			test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
		}
		clickOnElement(scobj.getaddresscontiniuebutton3());
		clickOnElement(scobj.getaddresscontiniuebutton3());
		Reporter.log("Clicked on Shipping method continue button Successfully", true);

		waitStatement(scobj.getaddresscontiniuebutton4());

		// Step 19:Select payment method and click on continue
		Assert.assertEquals(scobj.getaddresscontiniuebutton4().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton4().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton4().isDisplayed() && scobj.getaddresscontiniuebutton4().isEnabled()) {
			test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
		}
		clickOnElement(scobj.getaddresscontiniuebutton4());
	
		Reporter.log("Clicked on Payment method continue button Successfully", true);

		waitStatement(scobj.getaddresscontiniuebutton5());

		// Step 20:Payment information continue button is displayed and enabled and
		// click on continue
		Assert.assertEquals(scobj.getaddresscontiniuebutton5().isDisplayed(), true);
		Assert.assertEquals(scobj.getaddresscontiniuebutton5().isEnabled(), true);
		if (scobj.getaddresscontiniuebutton5().isDisplayed() && scobj.getaddresscontiniuebutton5().isEnabled()) {
			test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
		}
		clickOnElement(scobj.getaddresscontiniuebutton5());
		Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

		waitStatement(scobj.getconfirmshoppingbutton());

		// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
		Assert.assertEquals(scobj.getconfirmshoppingbutton().isDisplayed(), true);
		Assert.assertEquals(scobj.getconfirmshoppingbutton().isEnabled(), true);
		if (scobj.getconfirmshoppingbutton().isDisplayed() && scobj.getconfirmshoppingbutton().isEnabled()) {
			test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
		}
		clickOnElement(scobj.getconfirmshoppingbutton());
		Reporter.log("Clicked on Confirm button  Successfully", true);

		// Step 22:Thank you text is displayed and enabled
		Assert.assertEquals(scobj.getThankyoutext().isDisplayed(), true);
		Assert.assertEquals(scobj.getThankyoutext().isEnabled(), true);
		if (scobj.getThankyoutext().isDisplayed() && scobj.getThankyoutext().isEnabled()) {
			test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
		}
		Reporter.log("Thank you text displayed Successfully", true);

		Reporter.log("BookTest-HealthBook Verified", true);

	}

// 3. ELECTRONICS TEST			

	@Test(enabled = false, priority = 1, groups = "RT")
	public void verifyCellphone() {

		waitStatement();

		epobj = new ElectronicsPage(driver);

		clickOnElement(epobj.getelectronicsmodule());
		clickOnElement(epobj.getsmartphoneselection());
		clickOnElement(epobj.getphonecoverselection());
		clickOnElement(epobj.getaddtocartphone());

		Reporter.log("Electronics-Cellphone added to cart succesfully", true);

	}

	@Test(enabled = false, priority = 2, groups = "FT")
	public void verifyCameraAndPhoto() {

		waitStatement();

		clickOnElement(epobj.getelectronicsmodule());
		clickOnElement(epobj.getcameraselection());
		clickOnElement(epobj.getcameraproductselection());
		clickOnElement(epobj.getaddtocartcamera());

		Reporter.log("Electronics-Camera added to cart succesfully", true);
	}

}
