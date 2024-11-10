package org.testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderClass {

	File file;
	FileInputStream inputStream;
	public static Properties p;
	
	public PropertyReaderClass(String filePath) {
		try {
		file = new File(filePath);
		inputStream = new FileInputStream(file);
		p = new Properties();
		p.load(inputStream);
		}catch(FileNotFoundException e) {
			System.out.println("Throw The FileNotFoundException");
		}catch(IOException e) {
			System.out.println("Throw The IoException");
		}
	}
	public String getProperty(String value) {
		String property = p.getProperty(value);
		return property;
	}
}
