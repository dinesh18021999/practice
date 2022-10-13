package com.junit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass2 {
	
	 static WebDriver driver;
	 
	@BeforeClass
  public static void aa() {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	  
  }
	@Test
	public void ww() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Dhinesh1999");
		
		//verification process
		String attribute = txtusername.getAttribute("value");
	Assert.assertEquals("username", "Dhinesh1999", attribute);
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("87VY28");
		String attribute2 = txtpassword.getAttribute("value");
		Assert.assertEquals("message", "87VY28", attribute2);
		
		WebElement clkbut = driver.findElement(By.id("login"));
		clkbut.click();
	WebElement findElement = driver.findElement(By.xpath("(//td[@valign='top'])[1]"));
	String text = findElement.getText();
	System.out.println(text);
	boolean contains = text.contains("Welcome");
	Assert.assertTrue("enemy", contains);
	}
//	@AfterClass
//	public static void  cc() {
//		driver.quit();
//		
//	
	
	
	

}
