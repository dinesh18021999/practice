package com.seleniumall;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	@Parameters({"url"})
	@Test(invocationCount=3,threadPoolSize=2)
	public  void main(String urlloading) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(urlloading);
		driver.manage().window().maximize();
//		WebElement findElement2 = driver.findElement(By.xpath("(//iframe)[2]"));
//		driver.switchTo().frame(findElement2);
//		WebElement findElement3 = driver.findElement(By.xpath("//div[text()='Caption Text']"));
//		String text = findElement3.getText();
//		System.out.println(text);
////		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
//		findElement.sendKeys("dineshkumar@gmail.com");
//		driver.switchTo().frame(driver.findElement(By.name("login_page")));
//		WebElement findElement = driver.findElement(By.name("fldLoginUserId"));
//		findElement.sendKeys("1234567");
//	

}
}
