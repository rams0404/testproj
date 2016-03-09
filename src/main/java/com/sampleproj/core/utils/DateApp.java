package com.sampleproj.core.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateApp {

	public static void main(String[] args) {
		 System.out.println( "Hello World!" );
	        
	        String dateTime = "11/15/2013 08:00:00";
	     // Format for input
	     DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
	     // Parsing the date
	     DateTime jodatime = dtf.parseDateTime(dateTime);
	     // Format for output
	     DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
	     // Printing the date
	     System.out.println(dtfOut.print(jodatime));

	}

}
