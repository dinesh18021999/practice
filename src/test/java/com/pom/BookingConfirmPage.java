package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class BookingConfirmPage extends BaseClassMethods {
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
	
	public void bookingConfirm() throws IOException {
		String attribute = getAttribute(orderno);
		System.out.println(attribute);
		
		
		createNewCell("1234", 1, 20, attribute);
	}
	
	
	
	
	
	
	
			

}
