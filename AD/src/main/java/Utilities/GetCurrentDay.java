package Utilities;


 


import java.util.Date;

public class GetCurrentDay {
	public static Date date=new Date();
	public static void main(String args[]) {
		String date=date();
		System.out.println(date);
	}
	
    @SuppressWarnings("deprecation")
	public static String  date() {
    	
    	String currentDate=date.toString().replace(" ","").replace(":","");
//    	System.out.println(date.getDay());
//    	System.out.println(date.getHours());
//    	System.out.println(date.getMinutes());
//    	System.out.println(date.getMonth());
//    	System.out.println(date.getTime());
//    	System.out.println(date.getDay());
//    	System.out.println(date.getDay());
//    	System.out.println(date.getDay());
//    	System.out.println(date.getDay());
//    	.replace(" ","").replace(":","");
//    	date.
//       return currentDate;
       //.toString();
		return currentDate;
    }
    public static String  day() {
    	
        return "";
    }
    
}