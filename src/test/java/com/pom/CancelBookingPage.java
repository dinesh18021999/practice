package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class CancelBookingPage extends BaseClassMethods {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="a[text()='Booked Iteinerary']")
	private WebElement btnclick;
	
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[2]")
			private WebElement btncheckbox;
	
	@FindBy(xpath="//input[contains(@id,'btn')]")
	private WebElement btncancel;

	public WebElement getBtnclick() {
		return btnclick;
	}

	public WebElement getBtncheckbox() {
		return btncheckbox;
	}

	public WebElement getBtncancel() {
		return btncancel;
	}
	
	
	public void cancekBooking() {
		click(btnclick);
		click(btncheckbox);
		click(btncancel);
		acceptAlert();
	}
	
	
	
	

}
