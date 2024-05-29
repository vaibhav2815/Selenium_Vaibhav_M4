package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")
	private WebElement AccountSetting;
	
	@FindBy(xpath ="//li[text()='My Profile']")
	private WebElement MyProfile;
	
	

	@FindBy(xpath ="//li[text()='Logout']")
	private WebElement Logout;



	public WebElement getAccountSetting() {
		return AccountSetting;
	}



	public WebElement getMyProfile() {
		return MyProfile;
	}



	public WebElement getLogout() {
		return Logout;
	}
	
	

}
