package com.psm.firstbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class FirstTestBase {
	
	static WebDriver driver;
	static Properties prop;
	public FirstTestBase() {
		
	prop=new Properties();
	try {
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/psm/config/config.prop");
	try {
		prop.load(ip);
	} catch (IOException e) {
		 
		e.printStackTrace();
	}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	}
}