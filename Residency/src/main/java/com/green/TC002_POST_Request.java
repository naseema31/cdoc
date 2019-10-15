package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	@Test
	public void doctor_registration()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1";

	RequestSpecification httpRequest=RestAssured.given(); 
	JSONObject requestParams=new JSONObject();
	requestParams.put("firstName", "Naseema");
	requestParams.put("lastName", "Banu");
	requestParams.put("mobileNumber", "8548872183");
	requestParams.put("email", "nas123@gmail.com");
	requestParams.put("gender", "female");
	requestParams.put("deviceId", "0");
	requestParams.put("appName", "com.calldoc.doctor");
	requestParams.put("appVersion", "1");
	requestParams.put("dateOfBirth", "05/09/95");
	
	httpRequest.header("Content-Type","application/JSON");
	httpRequest.body(requestParams.toJSONString());
	
	Response response=httpRequest.request(Method.POST,"/register"); 
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	
	
	int statusCode=response.getStatusCode();
	System.out.println("Response Body is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	
	
	String status=response.jsonPath().get("status");
	Assert.assertEquals(status, "success");
	}
	
	
}