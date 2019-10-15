package com.company;

import java.util.Scanner;

import org.junit.Test;


public class Pgm1 {
	
	private  String FirstName;
	private String LastName;
	private static String AppName = "com.calldoc.patient";


	
	public void demo1( String[] args ) {
	      
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter FirstName");
	    
	    
	     FirstName = myObj.nextLine();  
	    System.out.println("FirstName is: " + FirstName);
	    
	    
	    LastName = myObj.nextLine();  
	    System.out.println("LastName is: " + LastName);
	    
	    if(!FirstName.isEmpty() && !LastName.isEmpty()) {
	    	System.out.println("StatusCode :"+"OK");
	    	System.out.println("description :"+"user created successfully");
	    	
	    }else {
	    	System.out.println("StatusCode :"+"ERROR");
	    	System.out.println("description :"+"");
	    }
	    
	    
	    
	    
	 	   }
	


}



