package com.projectstask;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	WebElement hh = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
	hh.click();
	Thread.sleep(10000);
	WebElement gg = driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']"));
	gg.click();
	WebElement oo = driver.findElement(By.xpath("(//span[@class='box'])[3]"));
	oo.click();
	
	WebElement g = driver.findElement(By.xpath("//ul[@class='appliedFilter']/child::li"));
	String text = g.getText();
	System.out.println(text);
	
	
	
	
//	WebElement aa = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[1]"));
//    aa.click();
//    WebElement bb = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//    bb.sendKeys("salem");
//    WebElement ff = driver.findElement(By.xpath("(//div[@class='makeFlex hrtlCenter'])[2]"));
//    
//    ff.click();
//    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
//    WebElement bb = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//    bb.sendKeys("chennai", Keys.ENTER);
//    WebElement cc = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[2]"));
//    cc.click();
//    WebElement vv = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//    vv.sendKeys("mumbai");
//    WebElement gg = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
//    gg.click();
//    WebElement kk = driver.findElement(By.xpath("(//span[@class='box'])[4]"));
//    kk.click();
}
}
