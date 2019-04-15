package com.qaclickacademy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaclickacademy.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy (id = "user_email")
	WebElement userEmailEditBox;
	
	@FindBy (id = "user_password")
	WebElement userPasswordEditBox;
	
	@FindBy (xpath = "//input[@value='Log In']")
	WebElement loginBtn;
	
	@FindBy (xpath = "//a[contains(text(),'Forgot Password?')]")
	WebElement forgotPasswordLink;
	
	@FindBy (xpath = "//div[@class='alert alert-danger']")
	WebElement loginErrorText;

	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginWithCredentials(String email, String password) {
		
		userEmailEditBox.sendKeys(email);
		userPasswordEditBox.sendKeys(password);
		loginBtn.click();
	}
	
	public void validateLoginErrorText() {
		loginErrorText.isDisplayed();
	}
}
