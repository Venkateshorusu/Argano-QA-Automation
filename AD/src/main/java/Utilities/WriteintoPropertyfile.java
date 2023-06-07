package Utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteintoPropertyfile {
	
	public static void main(String[] args) throws IOException {
		WritePropertiesFile("place","India","C:\\eclipse\\AD\\src\\main\\java\\Resources\\sample.properties");
		
	}
	
	public static void WritePropertiesFile(String key, String data, String loc) throws IOException
	{
	Properties configProperty = new Properties();
	configProperty.setProperty(key, data);
	File file = new File(loc);
	FileOutputStream fileOut = new FileOutputStream(file,true);
	configProperty.store(fileOut, "updated the file with --> "+key);
	fileOut.close();
	}

}
