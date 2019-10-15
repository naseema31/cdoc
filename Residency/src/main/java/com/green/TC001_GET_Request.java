package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {

	@Test
	public void Otp()
	{
		RestAssured.baseURI ="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/register";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Virender"); // Cast
		 requestParams.put("LastName", "Singh");
		 requestParams.put("MobileNumber", "9740127800");
		 requestParams.put("Email", "nas@gmail.com");
		 
		 requestParams.put("appName",  "com.calldoc.doctor");
		 requestParams.put("DOB",  "03/04/96");
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/register");
		 
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode, "200");
		 String successCode = response.jsonPath().get("SuccessCode");
		 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	
	
}
}