package com.Shopper.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.Generic.Base_Test;
import com.ShoppersStack.Pom.AddressForm_Page;
import com.ShoppersStack.Pom.MyAddress_Page;
import com.ShoppersStack.Pom.MyProfile_Page;

public class Verify_user_is_able_to_update_address_or_not_Test extends Base_Test{
	
	
	@Test 
	public void updateAdd() throws InterruptedException, IOException {
		Thread.sleep(2000);
		homePage.getAccountSetting().click();
		Thread.sleep(2000);
		homePage.getMyProfile().click();
		
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressbtn().click();
		
		MyAddress_Page myAddPage=new MyAddress_Page(driver);
		myAddPage.getEditBtn().click();
		
		

		AddressForm_Page addressformPage=new AddressForm_Page(driver);
		
		addressformPage.getNameTF().clear();
		Thread.sleep(2000);
		addressformPage.getNameTF().sendKeys(file.readDataFromExcelFile("Sheet1", 0, 1));
		
		addressformPage.getHouseTF().clear();
		Thread.sleep(2000);
		addressformPage.getHouseTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 1));
		
		addressformPage.getStreetInfoTF().clear();
		Thread.sleep(2000);
		addressformPage.getStreetInfoTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 2));
		
		addressformPage.getLandmarkTF().clear();
		Thread.sleep(2000);
		addressformPage.getLandmarkTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1,3));

		
	//	webdtiverutil.Selectbyvalue(addressformPage.getCountryDD(),file.readDataFromPropertyFile("country"));
	//	webdtiverutil.Selectbyvalue(addressformPage.getStateDD(), file.readDataFromPropertyFile("state"));
	//	webdtiverutil.Selectbyvalue(addressformPage.getCityDD(), file.readDataFromPropertyFile("city"));
		
		
		
		Thread.sleep(2000);
		addressformPage.getPincodeTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 4));
		addressformPage.getPhonenoTF().sendKeys(file.readDataFromExcelFile("Sheet1", 1, 5));
		
		Thread.sleep(2000);
		
		
		
		myAddPage.getUbdateAddBtn().click();
		
	}
}
