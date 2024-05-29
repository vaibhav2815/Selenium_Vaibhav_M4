package com.Shopper.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.Generic.Base_Test;
import com.ShoppersStack.Pom.MyAddress_Page;
import com.ShoppersStack.Pom.MyProfile_Page;

public class Verify_user_is_able_to_delete_address_or_not_Test extends  Base_Test {
	
	@Test
	public void delAddress() throws IOException, InterruptedException {
		Thread.sleep(2000);
		homePage.getAccountSetting().click();
		Thread.sleep(2000);
		homePage.getMyProfile().click();
		
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressbtn().click();
		
		MyAddress_Page myaddPage=new MyAddress_Page(driver);
		myaddPage.getDelAddressBtn().click();
		Thread.sleep(2000);
		myaddPage.getYesBtn().click();
		
		driver.switchTo().alert().accept();
			

}
}