package com.pagefac;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityfile.LibGlo;

public class PageObjectSearchHotel extends LibGlo {
	public PageObjectSearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement selLocation;
	@FindBy(id = "hotels")
	private WebElement selHotel;
	@FindBy(id = "room_type")
	private WebElement selRoomType;
	@FindBy(id = "room_nos")
	private WebElement noOfRoom;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adlPerRoom;
	@FindBy(id = "child_room")
	private WebElement chPerRoom;
	@FindBy(id = "Submit")
	private WebElement sub;

	public WebElement getSelLocation() {
		return selLocation;
	}

	public WebElement getSelHotel() {
		return selHotel;
	}

	public WebElement getSelRoomType() {
		return selRoomType;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getChPerRoom() {
		return chPerRoom;
	}

	public WebElement getAdlPerRoom() {
		return adlPerRoom;
	}

	public WebElement getSub() {
		return sub;
	}

	public void searchHotel(String location, String hotel, String roomType, String rooms, String inDate, String outDate,
			String adultNos, String childrenNos) {
		Assert.assertTrue("Verify login", urlCheck().contains("http://adactinhotelapp.com/SearchHotel.php"));
		selecVisible(getSelLocation(), location);
		selecVisible(getSelHotel(), hotel);
		selecVisible(getSelRoomType(), roomType);
		selecVisible(getNoOfRoom(), rooms);
		enterKeys(getCheckInDate(), inDate);
		enterKeys(getCheckOutDate(), outDate);
		selecVisible(getAdlPerRoom(), adultNos);
		selecVisible(getChPerRoom(), childrenNos);
		btnclick(getSub());
	}

}
