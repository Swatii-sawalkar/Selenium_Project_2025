package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	public AddressForm_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Office")
	private WebElement officeRadioButton;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseTextField;
	
	@FindBy(id="Street Info")
	private WebElement streetTextField;
	
	@FindBy(id="Landmark")
	private WebElement landmarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	
	@FindBy(id="State")
	private WebElement stateDropdown;
	
	@FindBy(id="City")
	private WebElement cityDropdown;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;
	
	public WebElement getOfficeRadioButton() {
		return officeRadioButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseTextField() {
		return houseTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressTextField() {
		return addAddressTextField;
	}

	@FindBy(id="addAddress")
	private WebElement addAddressTextField;	
}
