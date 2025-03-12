package com.javautlity;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class JavaUtlity {

	
	public String getSystemDateYYYYMMDD() {
		Date dateobj=new Date(0);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String StartDate=sdf.format(dateobj);
		return StartDate;
		
	}
	
}
