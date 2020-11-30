package com.pagefac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityfile.LibGlo;

public class PageObjectBookHotel extends LibGlo {
	public PageObjectBookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	@FindBy(id = "cc_type")
	private WebElement ccType;
	@FindBy(id = "cc_exp_month")
	private WebElement ccExpMon;
	@FindBy(id = "cc_exp_year")
	private WebElement ccExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvV;
	@FindBy(id = "book_now")
	private WebElement bkNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMon() {
		return ccExpMon;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvV() {
		return cvV;
	}

	public void setCvV(WebElement cvV) {
		this.cvV = cvV;
	}

	public WebElement getBkNow() {
		return bkNow;
	}

	public void bookHotel(String firstName, String lastName, String address, String ccNo, String ccType, String expMon,
			String expYr, String cvv) {
		enterKeys(getFirstName(), firstName);
		enterKeys(getLastName(), lastName);
		enterKeys(getAddress(), address);
		enterKeys(getCreditCardNo(), ccNo);
		selecVisible(getCcType(), ccType);
		selecVisible(getCcExpMon(), expMon);
		selecVisible(getCcExpYear(), expYr);
		enterKeys(getCvV(), cvv);
		btnclick(getBkNow());
	}
}