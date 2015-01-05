package com.main.controller;

import java.io.IOException;
import java.util.Properties;

public class configReader {

	public static String readConfig(String key) {
		Properties configFile = new Properties();
		String value = null;
		try {
			configFile.load(configReader.class.getClassLoader().getResourceAsStream("config.properties"));
			value = configFile.getProperty(key);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
