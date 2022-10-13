package com.projectstask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ggoglereccommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement u = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		u.sendKeys("ins");
		Thread.sleep(3000);
		List<WebElement> findElements = driver.findElements(By.xpath("//li[@class='sbct']"));

		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}

		}
	}







