package com.pagefac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityfile.LibGlo;

public class PageObjectConfirm extends LibGlo{
	public  PageObjectConfirm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderId;
	public WebElement getOrderId() {
		return orderId;
	}
	@FindBy(id="my_itinerary")
	private WebElement iti;
	public WebElement getIti() {
		return iti;
	}
	public void confirm() {
		waiting(getIti());
		System.out.println();
		System.out.println("Booking Id is "+getOrderId().getAttribute("value"));
		driver.quit();
	}
}
