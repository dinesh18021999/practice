package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class SelectHotelPage extends BaseClassMethods {
	public  SelectHotelPage() {
		PageFactory.initElements(driver, this);
	
	}
		
	@FindBy(id="radiobutton_1")
	private WebElement clkround;
	
	@FindBy(id="continue")
	private WebElement clkcontinue;
	
	
	
	public WebElement getClkround() {
		return clkround;
	}



	public WebElement getClkcontinue() {
		return clkcontinue;
	}



	public void selectHotel() {
		click(clkround);
		click(clkcontinue);
		
	}
}
