package com.seleniumall;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandling {
	@Test
	public  void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("mobiles",Keys.ENTER);
	WebElement findElement = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	findElement.click();
	
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	
	List<String> l=new LinkedList<String>();
	l.addAll(windowHandles);
	String string = l.get(1);
	driver.switchTo().window(string);
		
	
		
	

	
	WebElement findElement2 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	findElement2.click();
	
	}

}
