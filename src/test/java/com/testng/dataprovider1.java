 package com.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sample.BaseClassMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 extends BaseClassMethods {
	@Test(dataProvider="getdata")
	
	
	private void m1() {
	getDriver();
	loadUrl("https://blazedemo.com/");
	}
	public void hi(int a,int b,String c,String d,String e,String f,String g,int h,String i,String j,String k,String l,String sheetName,int rowNum, int cellNum) throws IOException {
		blazedemoc1 o =new blazedemoc1();
		o.flight(a, b);
		Blazedemoc2 jj=new Blazedemoc2();
	jj.aero();
		Blazedemoc3 vv=new Blazedemoc3();
		vv.plane(c, d, e, f, g, h, i, j, k, l, sheetName, rowNum, cellNum);
		
	}
	
	@DataProvider
	public Object[][]getdata(){
		Object[][]searchproduct=new Object[1][15];
	searchproduct[0][0]=0;
	searchproduct[0][1]=1;
	searchproduct[0][2]="dinesh";
	searchproduct[0][3]="porur";
	searchproduct[0][4]="chennai";
	searchproduct[0][5]="tamilnadu";
	searchproduct[0][6]="1234";
	searchproduct[0][7]=0;
	searchproduct[0][8]="1234567890123456";
	searchproduct[0][9]="jan";
	searchproduct[0][10]="2021";
	searchproduct[0][11]="greencard";
	searchproduct[0][12]="123";
	searchproduct[0][13]=10;
	searchproduct[0][14]=10;
	
	return searchproduct;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(dataProvider="getdata")
//	private void A(  int s1, int s2) {
//		getDriver();
//		loadUrl("https://blazedemo.com/");
//		WebElement aa1 = findLocatorByName("fromPort");
//		selectByIndex(aa1, s1);
//		WebElement bb1 = findLocatorByName("toPort");
//		selectByIndex(bb1, s2);
//		WebElement cc = findLocatorByXpath("//input[@type='submit']");
//		cc.click();
//WebElement dd = findLocatorByXpath("//input[@type='submit'])[1]");
//	dd.click();
////		WebElement ee = findLocatorById("inputName");
////		ee.sendKeys(s1);
////		WebElement ff = findLocatorById("address");
////		ff.sendKeys(s2);
////		WebElement gg = findLocatorById("city");
////		gg.sendKeys(s3);
////		WebElement hh = findLocatorById("state");
////		hh.sendKeys(s4);
////		WebElement ii = findLocatorById("zipCode");
////		ii.sendKeys(s5);
//////		WebElement jj = findLocatorById("cardType");
//////		selectByIndex(jj, 0);
////		
////		WebElement kk = findLocatorById("creditCardNumber");
////		kk.sendKeys(s6);
//	}
//	
//	@DataProvider
//	public Object[][]getdata(){
//		Object[][]searchflight=new Object[1][2];
//		searchflight[0][0]=2;
//		searchflight[0][1]=1;
//		//searchflight[1][0]=0;
//		//searchflight[1][1]=0;
//		
//		
//				
//		return searchflight;
		

	}
}
	
	

	

