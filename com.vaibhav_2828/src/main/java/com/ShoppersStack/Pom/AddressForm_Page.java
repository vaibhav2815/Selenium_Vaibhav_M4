package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	
	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "Office")
	private WebElement officebtn;

	@FindBy(id = "Name")
	private WebElement nameTF;

	
	@FindBy(id = "House/Office Info")
	private WebElement houseTF;

	@FindBy(id = "Street Info")
	private WebElement StreetInfoTF;

	@FindBy(id = "Landmark")
	private WebElement landmarkTF;
	
	@FindBy(id = "Country")
	private WebElement countryDD;
	
	@FindBy(id = "State")
	private WebElement stateDD;
	
	@FindBy(id = "City")
	private WebElement cityDD;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTF;
	
	@FindBy(id = "Phone Number")
	private WebElement phonenoTF;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficebtn() {
		return officebtn;
	}

	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getHouseTF() {
		return houseTF;
	}

	public WebElement getStreetInfoTF() {
		return StreetInfoTF;
	}

	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeTF() {
		return pincodeTF;
	}

	public WebElement getPhonenoTF() {
		return phonenoTF;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	

	
	
	
	

}
