package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.BaseClassMethods;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1  {
	@Test(priority=1,groups= {"sanity"})
	private void jan() {
		System.out.println("print jan");
	}
	@Test(priority=-1,invocationCount=2,alwaysRun=true,groups={"reg"})
private void feb() {
	System.out.println("print feb");
	
}
	@Test (dependsOnMethods="feb",alwaysRun=true,groups= {"smoke"})
	private void mar() {
		System.out.println("print march");
		
	}
	@Test(priority=-8,groups= {"smoke"})
	private void apr() {
		System.out.println("print apr");		
	}
}