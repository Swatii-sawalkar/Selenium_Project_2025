package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.AddressForm_Page;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_001_verify_user_is_able_to_add_address_or_not_Test extends Base_Test {
	
	@Test
	
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.out.println("Poll SCM");
		
		homePage.getAccountSettingBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		Thread.sleep(3000);
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		myAddressesPage.getAddAddressBtn().click();
		
		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		addressFormPage.getOfficeRadioButton().click();
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressFormPage.getHouseTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressFormPage.getStreetTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressFormPage.getLandmarkTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByValue(addressFormPage.getCountryDropdown(), fileUtility.readDataFromPropertyFile("country"));
		webDriverUtility.selectByValue(addressFormPage.getStateDropdown(), fileUtility.readDataFromPropertyFile("state"));
		webDriverUtility.selectByValue(addressFormPage.getCityDropdown(), fileUtility.readDataFromPropertyFile("city"));
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressFormPage.getAddAddressTextField().click();
		
		myAddressesPage.getCloseBtn().click();
		
		webDriverUtility.getWebPageScreenShot(driver);
	}
}