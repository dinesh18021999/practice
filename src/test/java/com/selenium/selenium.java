package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(7000);
//		
		WebElement scrolldown = driver.findElement(By.id("username"));
		
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("argumenst[0].scrollIntoView(true)",scrolldown);
//		
//		
		
		
	//	TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = scrolldown.getScreenshotAs(OutputType.FILE);
		
		System.out.println(screenshotAs);
	}
	
	
	
	
	
	

}
