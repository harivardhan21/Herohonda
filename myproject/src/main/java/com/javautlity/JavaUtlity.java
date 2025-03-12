package com.javautlity;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
public class JavaUtlity {	
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date(0);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String StartDate=sdf.format(dateobj);
		return StartDate;		
	}	


	public static int random() {
		Random random=new Random();
		int num = random.nextInt();
		return num;
    //this method is created by harivardhan
	}
}

