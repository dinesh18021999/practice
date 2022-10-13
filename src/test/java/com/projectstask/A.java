package com.projectstask;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement d=driver.findElement(By.id("username")) ;  
				d.sendKeys("asdfg");
	WebElement g=	driver.findElement(By.id("password"));
	g.sendKeys("dfgh");
		
	
	String o=d.getText();
	System.out.println(o);
	
	String attribute = d.getAttribute("value");
	System.out.println(attribute);
	
	
	Actions action=new Actions(driver);
	action.moveToElement(g).perform();
	
	Actions ction=new Actions(driver);
	ction.dragAndDrop(d, g).perform();
	ction.dragAndDrop(d, g).perform();
	
	Actions ac=new Actions(driver);
	ac.contextClick().perform();
	ac.doubleClick().perform();
	
	  ac.keyUp(attribute).perform();
	  ac.keyDown(null).perform();
	  
	  
	  
	  
	  Alert al=driver.switchTo().alert();
	  al.accept();
	  al.dismiss();
	  al.sendKeys("ASDF");

	  
	  
	  Robot robot=new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_A);
	  
	  WebElement gg=	driver.findElement(By.id("password"));
	  
	  Select sel=new Select(gg);
	  java.util.List<WebElement> options = sel.getOptions();
	for(int i=0;i<=options.size();i++) {
		WebElement webElement = options.get(i);
	
	}
	 
	 
	 
	  
	
	 
	
	
	
	
	}

}
