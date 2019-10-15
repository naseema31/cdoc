package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class TC004_GET_Docdetails {

	@Test
	public void get_Docdetails()
	{
		
		
		//Response resp=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
		int code=get("http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/doctor/2c9f87136d5dcb0f016d6bdbf6700058").getStatusCode();
	System.out.println("status code is "+ code);
	Assert.assertEquals(code, 200);
	}
	
}
