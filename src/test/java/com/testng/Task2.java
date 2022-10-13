package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sample.BaseClassMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	WebDriver driver;
	@Test(priority=5)
	private void B() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	
	}
	@Test (priority=6)
	private void A() {
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("dineshkumar");
	}
	@Test(priority=5)
	private void C() {
		System.out.println("print C");
	}
	@Test(priority=-1)
	private void D() {
		System.out.println("print D");
	}
	}


