package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitDay1 {
	
	 static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Test
	public void testmethod() {
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("sasi1398");
		
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("sasi1398");
		
		WebElement clkbutton = driver.findElement(By.id("login"));
		clkbutton.click();
	}
	
	@After
	public void afterMethod() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}
	@Before
	public void beforeMethod() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

}
