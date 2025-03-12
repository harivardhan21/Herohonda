package com.genricUtlity;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class JavaUtlity {
	
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String StartDate=sdf.format(dateobj);
		return StartDate;		
	}	
	public static int random() {
		Random random=new Random();
		int num = random.nextInt();
		return num;
    //this method is created by hari vardhan
	}
	public String getRequiredDateYYYYMMDD(int days) {
		  Date dateObj = new Date();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  String date = sdf.format(dateObj);
		  
		  Calendar cal = sdf.getCalendar();
		  cal.add(Calendar.DAY_OF_MONTH, days);
		  String requiredDate = sdf.format(cal.getTime());
		  return requiredDate;
		 }
}
