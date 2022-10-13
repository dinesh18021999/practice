package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class SearchHotelPage extends BaseClassMethods {
	
	public  SearchHotelPage() {
		PageFactory.initElements(driver, this);
	
	}
		
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;

	
	@FindBy(id="room_type")
	private WebElement typeofroom;
	
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="Submit")
	private WebElement clksearch;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getTypeofroom() {
		return typeofroom;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getClksearch() {
		return clksearch;
	}
	
	public void searchHotelmethod(String location,String hotels,String typesofroom,String noofrooms ) {
		selectByIndex(getLocation(), 2);
		selectByIndex(getHotels(), 3);
		selectByIndex(getTypeofroom(), 0);
		selectByIndex(getNoofrooms(), 1);
		click(clksearch);
		
	}
	
	
}
