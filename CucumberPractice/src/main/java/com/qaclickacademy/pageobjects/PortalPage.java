package com.qaclickacademy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaclickacademy.base.TestBase;

public class PortalPage extends TestBase {
	
	@FindBy (xpath = "//a[@href='/courses/enrolled']")
	WebElement myCoursesLink;
	
	
	
	
	public PortalPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	public void loginValidation() {
		myCoursesLink.isDisplayed();
	}
}
