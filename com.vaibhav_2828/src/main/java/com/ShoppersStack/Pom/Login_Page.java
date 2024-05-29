package com.ShoppersStack.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passwordTF;
	
	@FindBy(id = "Login")
	private WebElement loginBtn2;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn2;
	}
	
	
	
}

