package com.pom;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sample.BaseClassMethods;

public class AdactinHotelBooking extends BaseClassMethods {
	
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	
		
	}
	@Test
	public void booking() throws IOException, InterruptedException {
		
		Day1Steps d=new Day1Steps();
		
		d.adactinHotel(getData("1234", 1, 0), getData("1234", 1, 1));
	  
	  SearchHotelPage hotel=new SearchHotelPage();
	  hotel.searchHotelmethod(getData("1234", 1, 2), getData("1234", 1, 3), getData("1234", 1, 4), getData("1234", 1, 5));
	 
	  SelectHotelPage page=new SelectHotelPage();
	  page.selectHotel();
	  
	  BookHotelPage h=new BookHotelPage();
	  h.bookHotel(getData("1234", 1, 6), getData("1234", 1, 7), getData("1234", 1, 8), getData("1234", 1, 9), getData("1234", 1, 10), getData("1234", 1, 11), getData("1234", 1, 12), getData("1234", 1, 13));
	  
	  
	 sleep(7000);
	  BookingConfirmPage c=new BookingConfirmPage();
	  c.bookingConfirm();
	  
	  CancelBookingPage c1=new CancelBookingPage();
	  c1.cancekBooking();
	  
	  
	    
	    	
	  
	
	
		
		
	
	
	//fterClass
//ublic static void afterClass() {
		
	//uit();
		
	}

}
