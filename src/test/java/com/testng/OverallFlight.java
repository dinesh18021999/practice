package com.testng;

import java.io.IOException;

import org.sample.BaseClassMethods;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OverallFlight extends BaseClassMethods {
	@Test
	private void a() {
		getDriver();
		loadUrl("https://blazedemo.com/");
	}
	@Parameters({ "a" , "b","c","d","e","f","g","h","i","j","k","l","m","n","o" })
	
	
	@Test
	private void b(int a,int b,String c,String d,String e,String f,String g,int h,String i,String j,String k,String l,String sheetName,int rowNum, int cellNum) throws IOException {
		blazedemoc1 demo=new blazedemoc1();
		demo.flight(a,b);
	Blazedemoc2 v=new Blazedemoc2();
	v.aero();
	
	Blazedemoc3 tree=new Blazedemoc3();
	tree.plane(c, d, e, f, g, h, i, j, k, l, sheetName, rowNum, cellNum);
	
	
	
		
		
	}

}
