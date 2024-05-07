package com.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends BasePage {

	public CellPhonePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText = "Smartphone")
	private WebElement smartPhoneClick;
	
	@FindBy(xpath = "//a[text()=\"Smartphone\"]/../..//input[@value=\"Add to cart\"]")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getSmartPhoneClick() {
		return smartPhoneClick;
		
		
	}

}
