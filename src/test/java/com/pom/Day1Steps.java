package com.pom;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;

public class Day1Steps extends BaseClassMethods {
	
	
	public  Day1Steps() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id ="password")
	private WebElement txtpassword;
	
	@FindBy (id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	public void adactinHotel(String txtusername,String password) {
	sendkeys(getTxtusername(), txtusername);
	sendkeys(getTxtpassword(), password);
	click(btnlogin);
	
	
		
	
	

	
	
	}
}

