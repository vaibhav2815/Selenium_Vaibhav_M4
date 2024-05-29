package com.ShoppersStack.Pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
	
	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath = "//button[text()='Add Address']")
		private WebElement AddAddress;
		
		@FindBy(xpath = "(//span[contains(@class,'MuiButton-s')])[2]")
		private WebElement delAddressBtn;
		
		@FindBy(xpath = "(//button[text()='Yes'])[1]")
		private WebElement yesBtn;
		
		@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[1]")
		private WebElement editBtn;
		
		@FindBy(id = "Update Address")
		private WebElement ubdateAddBtn;
		
		
		public WebElement getEditBtn() {
			return editBtn;
		}

		public WebElement getUbdateAddBtn() {
			return ubdateAddBtn;
		}

		public WebElement getDelAddressBtn() {
			return delAddressBtn;
		}

		public WebElement getYesBtn() {
			return yesBtn;
		}

		public WebElement getDelAddress() {
			return delAddressBtn;
		}

		public WebElement getAddAddress() {
			
			return AddAddress;
			
		
		}
	}
	
	


