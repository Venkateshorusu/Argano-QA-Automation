package Utilities;

import java.util.Random;

public class RandomTxt {
	public static void main(String args[]) {
//		System.out.println(randomStr(1000));
		randomStr(10);
	}
	public static String randomStr(int range) {
		 String AlphaString ="ABCDEFGHIJKLMNOPQRSTUVW"+"abcdefghijklmnopqrstuv"+"12345678909+@@@";
		 
		 StringBuilder sb = new StringBuilder(range);
		 for (int i = 0; i < range; i++) 
		 {
			 int index= (int)(AlphaString.length()* Math.random());			 
			 sb.append(AlphaString.charAt(index));
		 }
		 
		return sb.toString();
	}
	public static int randomInt(int n)
	
	{
		int m=n-3;
		return new Random().nextInt(m+2);
		
	}
}
