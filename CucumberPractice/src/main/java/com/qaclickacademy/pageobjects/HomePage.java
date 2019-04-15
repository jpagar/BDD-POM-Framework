package com.qaclickacademy.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaclickacademy.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy (xpath = "//button[contains(text(),'NO THANKS')]")
	WebElement popUpBox;
	
	@FindBy (xpath = "//span[contains(text(),'Register')]")
	WebElement registerLink;
	
	@FindBy (xpath = "//span[contains(text(),'Login')]")
	WebElement loginLink;
	
	@FindBy (xpath = "//a[contains(text(),'Courses')]")
	WebElement coursesLink;
	
	@FindBy (xpath = "//a[contains(text(),'Videos')]")
	WebElement videosLink;
	
	@FindBy (xpath = "//a[contains(text(),'Interview Guide')]")
	WebElement interviewGuideLink;

	@FindBy (xpath = "//a[contains(text(),'Practice')]")
	WebElement practiceLink;
	
	@FindBy (xpath = "//a[contains(text(),'Blog')]")
	WebElement blogLink;
	
	@FindBy (xpath = "//a[contains(text(),'About')]")
	WebElement aboutLink;
	
	@FindBy (xpath = "//a[contains(text(),'Contact')]")
	WebElement contactLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
