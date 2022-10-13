package com.projectstask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableXpath {
	public static WebDriver driver;
	public static String m1(int c) {
		WebElement dd = driver.findElement(By.xpath("//td[text()='"+  c  +"']/preceding-sibling::td/preceding-sibling::th"));
		String text = dd.getText();
	return text;	
}
	
	public static String m2(String t) {
		WebElement findElement = driver.findElement(By.xpath("(//th[text()='"+ t +"']/following-sibling::td)[3]"));
		String text1 = findElement.getText();
		
		return text1;
		
	}
	
	public static String m3(String city) {
		WebElement findElement = driver.findElement(By.xpath("//td[text()='"+ city +"']/preceding-sibling::td"));
		String text2 = findElement.getText();
		
		return text2;
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		String m1 = m1(4);
		System.out.println(m1);
		String m2 = m2("Financial Center");
		System.out.println(m2);
		String m3 = m3("Taipei");
		System.out.println(m3);
		
		
	}
	

}
