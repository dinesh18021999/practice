package com.testng;

import org.bouncycastle.asn1.ocsp.ServiceLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sample.BaseClassMethods;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blaze extends BaseClassMethods {
	@Test(priority=-5)
	public  void main() {
		
		
		getDriver();
		loadUrl("https://blazedemo.com/");
	}
	@Test(enabled=false)
		public void m1() {
		WebElement findLocatorByName = findLocatorByName("fromPort");
		selectByIndex(findLocatorByName, 2);
		WebElement findLocatorByName2 = findLocatorByName("toPort");
		selectByIndex(findLocatorByName2, 1);
		}
	@Test(priority=-3)
		public void m2() {
			
		
		WebElement findLocatorByXpath = findLocatorByXpath("//input[@type='submit']");
		click(findLocatorByXpath);
		WebElement findLocatorByXpath2 = findLocatorByXpath("(//input[@type='submit'])[1]");
		click(findLocatorByXpath2);
		
		
		
	}

}
