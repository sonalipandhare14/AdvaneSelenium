package com.elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

	public ElectronicsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraPhotoLink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhoneLink;

	public WebElement getCameraPhotoLink() {
		return cameraPhotoLink;
	}

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

}
