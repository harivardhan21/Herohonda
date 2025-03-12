package com.javautlity
import java.sql.Date;
import java.text.SimpleDateFormat;
public class JavaUtlity {	
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String StartDate=sdf.format(dateobj);
		return StartDate;		
	}	
import java.util.Random;
public class JavaUtlity {
	public static int random() {
		Random random=new Random();
		int num = random.nextInt();
		return num;
    //this method is created by harivardhan
	}
}
