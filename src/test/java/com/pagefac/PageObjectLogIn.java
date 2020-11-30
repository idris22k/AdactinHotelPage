package com.pagefac;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityfile.LibGlo;

public class PageObjectLogIn extends LibGlo {

	public PageObjectLogIn() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtUserPass;

	@FindBy(id = "login")
	private WebElement btnLogIn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserPass() {
		return txtUserPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	public void logIn(String user, String pass) {
		enterKeys(getTxtUserName(), user);

		Assert.assertEquals("Verify username", user, getTxtUserName().getAttribute("value"));

		enterKeys(getTxtUserPass(), pass);
		Assert.assertEquals("Verify password", pass, getTxtUserPass().getAttribute("value"));
		btnclick(btnLogIn);
	}
}
