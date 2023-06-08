package com.Argano.utlis;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
	static Properties pp = new Properties();
	 

	public static Properties read(String FileLOC) {
		try {

			InputStream file = new FileInputStream(FileLOC);
			pp.load(file);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return pp;

	}

}
