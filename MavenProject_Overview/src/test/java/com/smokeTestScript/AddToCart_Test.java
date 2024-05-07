package com.smokeTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.elementRepo.CellPhonePage;
import com.elementRepo.ElectronicsPage;
import com.genericClasses.BaseClass;

public class AddToCart_Test extends BaseClass {
	@Test
	public void addingSmartPhoneToCart()
	{
		//ActionUtilities actionutil = new ActionUtilities(driver);
		ExtentTest test = extent.createTest("Adding to cart");
		//actionutil.clickOnElement(basepage.getElectronics());
		basepage.getElectronics().click();
		test.pass("Electronics link clicked");
		
		
		ElectronicsPage elePage = new ElectronicsPage(driver);
		elePage.getCellPhoneLink().click();
		test.pass("cell phone link clicked");
		
		CellPhonePage cellPage = new CellPhonePage(driver);
		cellPage.getSmartPhoneClick();
		test.pass("Smart phone link clicked");
		
		cellPage.getAddToCartButton().click();
		test.pass("Added to the cart");
		
		
		
	}

}
