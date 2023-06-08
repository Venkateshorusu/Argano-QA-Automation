package com.Argano.utlis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class FileReaderUtils {

	public static String readFromFile(String directory)
	{
		String result="";  
		FileReader fr;
		try {
			
			File file1 = new File(directory);
			fr = new FileReader(file1);
			long length = file1.length( );  
			for(long i=0; i<length; i++)
				result+=(char) fr.read( );
			   //System.out.print((char) fr.read( )); 
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return result;
	}
	
	public static String formatInline(String code)
	{
		String result="";
		
		
		return result;
	}
}
