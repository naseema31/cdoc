package com.psm.testcases;

import org.testng.annotations.Test;

import com.psm.firstbase.FirstTestBase;

public class RegistrationTest  extends FirstTestBase{

	
	private  String FirstName;
	private  String LastName;
	
	@Test
	  public void f() {
		  
		  
		  
		  if(FirstName.equals(FirstName)&&LastName.equals(LastName)) {
		    	System.out.println("StatusCode :"+"OK");
		    	System.out.println("description :"+"user created successfully");
		    	
		    }else {
		    	System.out.println("StatusCode :"+"ERROR");
		    	System.out.println("description :"+"");
		    }
		    
		    
		    
	  }
}
