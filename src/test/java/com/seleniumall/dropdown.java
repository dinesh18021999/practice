package com.seleniumall;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	@Test
	public  void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("//select[@name='url']"));
		Select s=new Select(findElement);
		List<WebElement> options = s.getOptions();
		
//	WebElement webElement = options.get(10);
//	   String text = webElement.getText();
//   	System.out.println(text);
   	
   	
			
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
	String text = webElement.getText();
		System.out.println(text);
		}
		
		
//		s.selectByIndex(3);
//		WebElement firstSelectedOption = s.getFirstSelectedOption();
//		String text = firstSelectedOption.getText();
//		System.out.println(text);
//		
		
		boolean multiple = s.isMultiple();
		System.out.println("is multiple"+ multiple);
		
		
		
			
		
		
		
		
		
		
		
		}
		
		
		
		}
			
		
		
		
	
	

