package com.projectstask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reuseabletask2 {
	public static WebDriver driver;
	
	private static String dash(	String c) {
		
		WebElement findElement = driver.findElement(By.xpath("(//td[text()='"+ c +"']/preceding-sibling::td)[2]"));
		String text = findElement.getText();
		return text;
	}
	
	
	private static String table(String s) {
		WebElement findElement = driver.findElement(By.xpath("(//td[text()='"+ s +"']/preceding-sibling::td/following-sibling::td/following-sibling::td)[1]"));
String text3=findElement.getText();
return text3;
	}
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		String dash = dash("Albanian");
		System.out.println(dash);
		String tab=table("Lek");
		System.out.println(tab);
		
		
	}
	}


