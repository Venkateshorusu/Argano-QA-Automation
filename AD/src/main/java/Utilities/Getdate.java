package Utilities;

import java.util.Date;  
import java.text.SimpleDateFormat;

public class Getdate {
	public static void main(String[] args) {
		System.out.println(getDD());
		System.out.println(getMM());
		System.out.println(getYYYY());
	}
	public static String getDD() { 

	    SimpleDateFormat formatter = new SimpleDateFormat("dd");  
	    Date date = new Date();  
	    String s= formatter.format(date);
	    if(s.charAt(0)=='0') {
	    	return s.charAt(1)+"";
	    }
		    return s;
		  
	}
	public static String getMM() { 

	    SimpleDateFormat formatter = new SimpleDateFormat("mm");  
	    Date date = new Date();  
	    String s= formatter.format(date);
	    
		    return s;
		  
	}
	public static String getYYYY() { 

	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy");  
	    Date date = new Date();  
	    String s= formatter.format(date);
	     
		    return s;
		  
	}
	

}