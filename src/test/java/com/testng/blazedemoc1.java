package com.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;
import org.testng.annotations.Test;

public class blazedemoc1 extends BaseClassMethods{
	
	public  blazedemoc1() {
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="fromPort")
	private WebElement departure;
	
	@FindBy(name="toPort")
	private WebElement destiny;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement cli;

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getDestiny() {
		return destiny;
	}

	public WebElement getCli() {
		return cli;
	}

public void flight(int a,int b) {
	selectByIndex(getDeparture(), a);
	selectByIndex(getDestiny(), b);
	click(getCli());
}


}
