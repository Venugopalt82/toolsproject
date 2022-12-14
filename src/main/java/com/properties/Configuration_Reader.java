package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
		
	}
	
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
		
	}
	
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
		
	}
	
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
		
	}
	
	public String getCcnum() {
		String ccnum = p.getProperty("ccnum");
		return ccnum;
		
	}
	
	public String getCccvv() {
		String cccvv = p.getProperty("cccvv");
		return cccvv;
		
	}
	
	


}
