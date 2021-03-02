package com.stepdefenition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.pagefac.PageObjectManager;
import com.utilityfile.LibGlo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageLoginSteps extends LibGlo {
	WebDriver driver;
	PageObjectManager pageObjectManager;
	
	@Given("User is on the adatin hotel page")
	public void hotel_page() throws MalformedURLException {
//	browserStack("http://adactinhotelapp.com/");
		launchBrowser("http://adactinhotelapp.com/");
	}
	@When("User should enter {string} and {string}")
	public void logInCredentials(String user, String pass) {
		PageObjectManager.getPageObjectManager().getPageObjectLogIn().logIn(user, pass);
	}
	@When("User should select {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}  and click search.")
	public void user_should_select(String location, String hotel, String roomType, String rooms, String inDate,
			String outDate, String adultNos, String childrenNos) {
		PageObjectManager.getPageObjectManager().getPageObjectSearchHotel().searchHotel(location, hotel, roomType, rooms, inDate, outDate, adultNos, childrenNos);
	}
	@Then("User should select the required hotel and click continue button.")
	public void user_should_select_the_required_hotel() {
		PageObjectManager.getPageObjectManager().getPageObjectSelHotel().selHotel();
	}
	@Then("User should enter {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and click Book now button.")
	public void user_should_enter(String firstName, String lastName, String address, String ccNo, String ccType,
			String expMon, String expYr, String cvv) {
		PageObjectManager.getPageObjectManager().getPageObjectBookHotel().bookHotel(firstName, lastName, address, ccNo, ccType, expMon, expYr, cvv);
	}
	@Then("User should check the booking id.")
	public void checkBookingId() {
		PageObjectManager.getPageObjectManager().getPageObjectConfirm().confirm();
	}

}