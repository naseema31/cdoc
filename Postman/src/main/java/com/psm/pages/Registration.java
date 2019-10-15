package com.psm.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Registration {

	private  String FirstName="";
	private String LastName="";
	private String MobileNumber="";
	
	private static String AppName = "com.calldoc.patient";
	private static String AppVersion="1";

	One model = new One();
	
  @Test
  public void reg() {
	  
	
	  
	  model.setFirstname("ROHITH");
	  model.setLastname("Kumar");
	  model.setEmail("kanfka@jfk.coo");
	  model.setMobileno("9348093809");  
	 
	  FirstName=model.getFirstname();
	  LastName= model.getLastname();
	  MobileNumber = model.getMobileno();
	  
	  if(FirstName.equals(model.getFirstname()) && LastName.equals(model.getLastname())&& MobileNumber.equals(model.getMobileno())) {
		  System.out.println("StatusCode :"+"OK");
	    	System.out.println("description :"+"user created successfully");
	  }else {
	    	System.out.println("StatusCode :"+"ERROR");
	    	System.out.println("description :"+"");
	    }
	  
	  

	  
	  

	    
	  

	    
	  }

  














}

