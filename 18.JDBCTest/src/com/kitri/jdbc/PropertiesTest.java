package com.kitri.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class PropertiesTest {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(new FileReader(new File("src\\com\\kitri\\jdbc\\Test.properties")));
			String name = prop.getProperty("name_en");
			System.out.println(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
