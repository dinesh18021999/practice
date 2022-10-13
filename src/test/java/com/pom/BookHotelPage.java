package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class BookHotelPage extends BaseClassMethods {
	
	 public BookHotelPage() {
		 PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement creditcard;
	
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	
	
	@FindBy(id="book_now")
	private WebElement clkbooknow;


	public WebElement getFirst() {
		return first;
	}


	public WebElement getLast() {
		return last;
	}


	public WebElement getAdd() {
		return add;
	}


	public WebElement getCreditcard() {
		return creditcard;
	}


	public WebElement getCreditcardtype() {
		return creditcardtype;
	}


	public WebElement getExpmonth() {
		return expmonth;
	}


	public WebElement getExpyear() {
		return expyear;
	}


	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getClkbooknow() {
		return clkbooknow;
	}
	
	public void bookHotel(String firstname,String lastname,String address,String creditcard,String cardtype,String expmonth,String expyr,String cvvnum) {
		sendkeys(getFirst(), firstname);
		sendkeys(getLast(), lastname);
		sendkeys(getAdd(), address);
		sendkeys(getCreditcard(), creditcard);
		selectByIndex(getCreditcardtype(), 1);
		selectByIndex(getExpmonth(), 2);
		selectByIndex(getExpyear(), 11
				);
		sendkeys(getCvvnum(), cvvnum);
		click(clkbooknow);
	}
	

}
