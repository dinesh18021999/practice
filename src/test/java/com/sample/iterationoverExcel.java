package com.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sample.BaseClassMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iterationoverExcel extends BaseClassMethods {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		iterationoverExcel i=new iterationoverExcel();
		i.bookHotel();
	}
	public void bookHotel() throws IOException, InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
        getDriver();	

		//driver.get("https://adactinhotelapp.com/");
        loadUrl("https://adactinhotelapp.com/");
		
		//driver.manage().window().maximize();
        maximize();
		
		//WebElement txtusername = driver.findElement(By.id("username"));
        WebElement element = findLocatorById("username");
        String data = getData("1234", 1, 0);
        
		//txtusername.sendKeys("RanaVettayan");
        
        sendkeys(element, data);
		
		//WebElement txtpassword = driver.findElement(By.id("password"));
        WebElement txtpassword = findLocatorById("password");
        String data2 = getData("1234", 1, 1);
		//txtpassword.sendKeys("Raj@66628");
        sendkeys(txtpassword, data2);
		
		//WebElement clkbutton = driver.findElement(By.id("login"));
        WebElement clkbutton = findLocatorById("login");
      
		//clkbutton.click();
        click(clkbutton);
		
		//WebElement locationselect = driver.findElement(By.id("location"));
    	//Select select=new Select(locationselect);
        //select.selectByIndex(3);
        WebElement locationselect = findLocatorById("location");
        String data3 = getData("1234", 1, 2);
        sendkeys(locationselect, data3);
        
	
		
		//WebElement hotelselect = driver.findElement(By.id("hotels"));
        //Select select1=new Select(hotelselect);
		//select1.selectByIndex(1);
		WebElement hotelselect = findLocatorById("hotels");
		String data4 = getData("1234", 1, 3);
		sendkeys(hotelselect, data4);
		
		
		
		//WebElement roomtype = driver.findElement(By.id("room_type"));
		//Select select2=new Select(roomtype);
		//select2.selectByIndex(1);
		
		WebElement roomtype = findLocatorById("room_type");
		String data5 = getData("1234", 1, 4);
		sendkeys(roomtype, data5);
		
//		
//		WebElement selectnoofrooms = driver.findElement(By.id("room_nos"));
//		Select select3=new Select(selectnoofrooms);
//		select3.selectByIndex(1);
		
		
		WebElement noofrooms = findLocatorById("room_nos");
		String data6 = getData("1234", 1, 5);
		sendkeys(noofrooms, data6);
		
		
//		WebElement clkbutton1 = driver.findElement(By.id("Submit"));
//		clkbutton1.click();
		
		WebElement clkb1 = findLocatorById("Submit");
		click(clkb1);

//		WebElement clkbutton2 = driver.findElement(By.id("radiobutton_0"));
//		clkbutton2.click();
		WebElement clkb2 = findLocatorById("radiobutton_0");
		click(clkb2);
		
		

//		WebElement clkbutton3= driver.findElement(By.id("continue"));
//		clkbutton3.click();
		
		WebElement clkb3 = findLocatorById("continue");
		click(clkb3);
		
		

		WebElement txtfirstname = findLocatorByName("first_name");
		String data11 = getData("1234", 1, 6);
		sendkeys(txtfirstname, data11);
		
		
		
		
//		WebElement txtlastname = driver.findElement(By.name("last_name"));
//		txtlastname.sendKeys("kumar");
		
		WebElement txtlastname = findLocatorByName("last_name");
		String data7 = getData("1234", 1, 7);
		sendkeys(txtlastname, data7);
		
		
	//	WebElement txtaddress = driver.findElement(By.name("address"));
	//	txtaddress.sendKeys("chennai");
		WebElement txtaddress = findLocatorByName("address");
		String data8 = getData("1234", 1, 8);
		sendkeys(txtaddress, data8);

		
		
		// WebElement txtccnum = driver.findElement(By.name("cc_num"));
		// txtccnum.sendKeys("123456789999");
		WebElement txtccnum = findLocatorByName("cc_num");
		String data9 = getData("1234", 1, 9);
		sendkeys(txtccnum, data9);
		
	//	WebElement cctype = driver.findElement(By.name("cc_type"));
	//	Select s1=new Select(cctype);
	//	s1.selectByVisibleText("VISA");
		WebElement cctype= findLocatorByName("cc_type");
		String data10 = getData("1234", 1, 10);
		sendkeys(cctype, data10);
		

//		WebElement ccmonth = driver.findElement(By.name("cc_expo_month"));
//		Select s2=new Select(ccmonth);
//		s2.selectByIndex(2);
		
		WebElement ccmonth = findLocatorByName("cc_exp_month");
		String data111 = getData("1234", 1, 11);
		sendkeys(ccmonth, data111);
		
		
//		WebElement ccyear = driver.findElement(By.name("cc_expo_year"));
//		Select s3=new Select(ccyear);
//		s3.selectByIndex(3);
		WebElement ccyear = findLocatorByName("cc_exp_year");
		String data12 = getData("1234", 1, 12);
		sendkeys(ccyear, data12);
		
		
	//	WebElement cccvv = driver.findElement(By.name("cc_cvv"));
	//	cccvv.sendKeys("123");
		WebElement cccvv = findLocatorByName("cc_cvv");
		String data13 = getData("1234", 1, 13);
		sendkeys(cccvv, data13);
	

	//	WebElement clksearch= driver.findElement(By.id("book_now"));
	//	clksearch.click();
		
		WebElement clksearch = findLocatorById("book_now");
		click(clksearch);
		
		Thread.sleep(7000);
		
	WebElement orderid = findLocatorById("order_no");
	String attribute = getAttribute(orderid);
	
	createNewCell("1234", 0, 15, "dataordeeridadactin");
	
	createNewCell("1234", 1, 15, attribute);
	
		
		
		
		
	
		
		
		
		
		
	}
	
	
	
	
	
	

}
