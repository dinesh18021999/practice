package com.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;
import org.testng.annotations.Test;

public class Blazedemoc3 extends BaseClassMethods {
	
	public  Blazedemoc3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="inputName")
	private WebElement name;
	
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
private WebElement sta;
	
	
	
	@FindBy(id="zipCode")
private WebElement code;
	
	
	
	@FindBy(id="cardType")
private WebElement cardtype;
	
	
	
	@FindBy(id="creditCardNumber")
private WebElement num;
	
	
	
	@FindBy(id="creditCardMonth")
private WebElement month;
	
	
	
	@FindBy(id="creditCardYear")
private WebElement yr;
	
	
	
	@FindBy(id="nameOnCard")
private WebElement card;
	
	
	
	@FindBy(xpath="submit")
private WebElement sub;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement c;
	
	@FindBy(xpath="(//td)[2]")
	private WebElement id;
	
	
	



	public WebElement getId() {
		return id;
	}



	public WebElement getC() {
		return c;
	}



	public WebElement getName() {
		return name;
	}



	public WebElement getAddress() {
		return address;
	}



	public WebElement getCity() {
		return city;
	}



	public WebElement getSta() {
		return sta;
	}



	public WebElement getCode() {
		return code;
	}



	public WebElement getCardtype() {
		return cardtype;
	}



	public WebElement getNum() {
		return num;
	}



	public WebElement getMonth() {
		return month;
	}



	public WebElement getYr() {
		return yr;
	}



	public WebElement getCard() {
		return card;
	}



	public WebElement getSub() {
		return sub;
	}
	
public void plane(String c,String d,String e,String f,String g,int h,String i,String j,String k,String l,String sheetName,int rowNum, int cellNum) throws IOException {
	 sendkeys(getName(), c);
	 sendkeys(getAddress(), d);
	 sendkeys(getCity(), e);
	 sendkeys(getSta(), f);
	 sendkeys(getCode(), g);
	 selectByIndex(getCardtype(), h);
	 sendkeys(getNum(), i);
	 clearMethod(getMonth());
	 sendkeys(getMonth(), j);
	 clearMethod(getYr());
	 sendkeys(getYr(), k);
	 sendkeys(getCard(), l);
     click(getC());
     String text = getText(getId());
     System.out.println(text);
     createNewCell(sheetName, rowNum, cellNum, text);
     
}

}