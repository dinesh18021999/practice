package com.seleniumall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
@Test
	public  void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("(//table)[3]"));
		// List<WebElement> header = table.findElements(By.tagName("th"));
		// int size = header.size();
		// System.out.println(size);
		// for (WebElement x : header) {
		// String text = x.getText();
		// System.out.println(text);
		// }
		// System.out.println("______rows________________");
		////
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// int size1 = rows.size();
		// System.out.println(size1);
		// for (WebElement y : rows) {
		// String text1 = y.getText();
		// System.out.println(text1);
		// }
		// System.out.println("_______datas_______");
		////
		// List<WebElement> datas = table.findElements(By.tagName("td"));
		// for (WebElement webElement : datas) {
		// String te = webElement.getText();
		// System.out.println(te);
		//
		// }
		
		for (int i = 0; i < rows.size(); i++) {
			WebElement webElement = rows.get(i);
			List<WebElement> datas = webElement.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement webElement2 = datas.get(j);
				String text = webElement2.getText();
				System.out.print(text + "  \t  ");
			}
			System.out.println();

		}

	}

}
