package com.pagefac;

import com.utilityfile.LibGlo;

public class PageObjectManager extends LibGlo{
	private PageObjectManager() {
}
	private static PageObjectManager pageObjectManager;
	private PageObjectLogIn pageObjectLogIn;
	private PageObjectSearchHotel pageObjectSearchHotel;
	private PageObjectSelHotel pageObjectSelHotel;
	private PageObjectBookHotel pageObjectBookHotel;
	private PageObjectConfirm pageObjectConfirm;
	
	public static PageObjectManager getPageObjectManager() {
		return (pageObjectManager==null)?pageObjectManager= new PageObjectManager():pageObjectManager;
	}
	
	public PageObjectLogIn getPageObjectLogIn() {
		return (pageObjectLogIn==null)?pageObjectLogIn=new PageObjectLogIn():pageObjectLogIn;
	}
	
	public PageObjectSearchHotel getPageObjectSearchHotel() {
		return (pageObjectSearchHotel==null)?pageObjectSearchHotel=new PageObjectSearchHotel():pageObjectSearchHotel;
	}
	
	public PageObjectSelHotel getPageObjectSelHotel() {
		return (pageObjectSelHotel==null)?pageObjectSelHotel=new PageObjectSelHotel():pageObjectSelHotel;
	}
	
	public PageObjectBookHotel getPageObjectBookHotel() {
		return (pageObjectBookHotel==null)?pageObjectBookHotel=new PageObjectBookHotel():pageObjectBookHotel;
	}
	
	public PageObjectConfirm getPageObjectConfirm() {
		return (pageObjectConfirm==null)?pageObjectConfirm=new PageObjectConfirm():pageObjectConfirm;
	}
	
}
