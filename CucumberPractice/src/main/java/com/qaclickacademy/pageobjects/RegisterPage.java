package com.qaclickacademy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaclickacademy.base.TestBase;

public class RegisterPage extends TestBase{
	
	@FindBy (id = "user_name")
	WebElement userFullNameEditBox;
	
	@FindBy (id = "user_email")
	WebElement userEmailEditBox;
	
	@FindBy (id = "user_password")
	WebElement userPasswordEditBox;
	
	@FindBy (id = "user_password_confirmation")
	WebElement userPasswordConfirmEditBox;
	
	@FindBy (id = "user_unsubscribe_from_marketing_emails")
	WebElement agreePromotionEmailCheckBox;
	
	@FindBy (id = "user_agreed_to_terms")
	WebElement agreeTermsCheckBox;
	
	@FindBy (xpath = "//input[@value='Sign Up']")
	WebElement signUpBtn;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void registerWithPersonalInformation(String fullName, String email, String password) {
		
		userFullNameEditBox.sendKeys(fullName);
		userEmailEditBox.sendKeys(email);
		userPasswordEditBox.sendKeys(password);
		userPasswordConfirmEditBox.sendKeys(password);
	}
	

}
