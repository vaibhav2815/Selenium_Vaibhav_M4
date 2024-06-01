package com.Shopper.testScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShoppersStack.Generic.Base_Test;
import com.ShoppersStack.Pom.AddressForm_Page;
import com.ShoppersStack.Pom.MyAddress_Page;
import com.ShoppersStack.Pom.MyProfile_Page;
import com.Shoppersstack_GenericUtility.ListenersUtility;

@Listeners(ListenersUtility.class)
public class Verify_user_is_able_to_add_address_or_not extends Base_Test {
	
	@Test
	public void addAddress() throws IOException, InterruptedException {
		homePage.getAccountSetting().click();
		homePage.getMyProfile().click();
		
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressbtn().click();
		
		
		MyAddress_Page myaddPage=new MyAddress_Page(driver);
		myaddPage.getAddAddress().click();
		
		
		AddressForm_Page addressformPage=new AddressForm_Page(driver);
		addressformPage.getOfficebtn().click();
		addressformPage.getNameTF().sendKeys(file.readDataFromExcelFile("Sheet1", 0, 1));
		addressformPage.getHouseTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 1));
		addressformPage.getStreetInfoTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 2));
		addressformPage.getLandmarkTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1,3));
		
		webdtiverutil.Selectbyvalue(addressformPage.getCountryDD(),file.readDataFromPropertyFile("country"));
		webdtiverutil.Selectbyvalue(addressformPage.getStateDD(), file.readDataFromPropertyFile("state"));
		webdtiverutil.Selectbyvalue(addressformPage.getCityDD(), file.readDataFromPropertyFile("city"));
		
		
		addressformPage.getPincodeTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 4));
		addressformPage.getPhonenoTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 5));
		
		Thread.sleep(2000);
		addressformPage.getAddAddressBtn().click();
		}

}

