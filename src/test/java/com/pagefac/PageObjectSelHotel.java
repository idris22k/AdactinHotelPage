package com.pagefac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityfile.LibGlo;

public class PageObjectSelHotel extends LibGlo {
	public PageObjectSelHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radClick;
	@FindBy(id = "continue")
	private WebElement con;

	public WebElement getRadClick() {
		return radClick;
	}

	public WebElement getCon() {
		return con;
	}

	public void selHotel() {
		btnclick(getRadClick());
		btnclick(getCon());
	}
}
