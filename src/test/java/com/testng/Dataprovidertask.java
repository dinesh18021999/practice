package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovidertask {
	
	@Test(dataProvider="getdata")
	
	private void amazon(String s) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys(s);
		WebElement findElement2 = driver.findElement(By.id("nav-search-submit-button"));
		findElement2.click();
	}
	@DataProvider
	public Object[][]getdata(){
		Object[][]searchproduct=new Object[5][1];
		searchproduct[0][0]="mobile";
		searchproduct[1][0]="tv";
		searchproduct[2][0]="laptop";
		searchproduct[3][0]="powerbank";
		searchproduct[4][0]="headphones";
		return searchproduct;
	}

}
