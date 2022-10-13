package com.seleniumall;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollupdown {
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eclipse.org/downloads/packages/release/oxygen/3a");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("(//h2[@class='section-title'])[2]"));
		String text = findElement.getText();
		System.out.println(text);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		//js.executeScript("window.scroll(0,1000)" );
		
	}

}
