package com.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClassMethods;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Blazedemoc2 extends BaseClassMethods {
	
	public  Blazedemoc2() {
		PageFactory.initElements(driver, this);
	
	}
@FindBy(xpath="(nd")
private WebElement c;

public WebElement getC() {
	return c;
}

@Test
public void aero() {
	click(getC());
}
}



