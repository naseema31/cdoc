package com.green;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Test1_BasicFeatures {

	
	
	/* Checking status code*/
	
	/*@Test
	public void testCode() {
		
		
		given().
		get("http://localhost:8085/ws/register").
		then().
		statusCode(200);
	}*/

@Test
public void update_doctor()
{
	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/doctor";
	
	RequestSpecification httpRequest=RestAssured.given();
	Response response=httpRequest.request(Method.GET,"/2c9f87136d5dcb0f016d6bdbf6700058"); 
	
	JSONObject requestParams=new JSONObject();
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	//int statusCode=response.getStatusCode();
	//System.out.println("Response Body is:"+statusCode);
	//Assert.assertEquals(StatusCode, 200);
	
	
	//int statusCode=response.getStatusLine();
	//System.out.println("Response Body is:"+statusCode);
	//Assert.assertEquals(StatusCode, 200);
	
	
}


}

