package com.junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement hh = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		hh.click();
		Thread.sleep(10000);
		WebElement gg = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
		gg.click();
		List<WebElement> hrr = driver.findElements(By.xpath("//p[@class='boldFont blackText airlineName']"));
		for (int i = 0; i < hrr.size(); i++) {

			WebElement webElement2 = hrr.get(i);
			String text = webElement2.getText();
			//System.out.println(text);
			String x="AirAsia";
			if (x.equals(text)) {
				System.out.println(x);
				
				
				
			}
			
			
			
			
		
			
			
		}
		
	
	}
}


//span[@class='a-price-whole']