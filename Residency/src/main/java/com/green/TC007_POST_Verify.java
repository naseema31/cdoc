package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC007_POST_Verify {

	
	@Test
	public void Verify()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/login";

	RequestSpecification httpRequest=RestAssured.given(); 
	JSONObject requestParams=new JSONObject();
	
	requestParams.put("mobileNumber", "9740127800");
	requestParams.put("otp", "724870");
	requestParams.put("moduleName", "registration");
	
	httpRequest.header("Content-Type","application/JSON");
	httpRequest.body(requestParams.toJSONString());
	
	Response response=httpRequest.request(Method.POST,"/verify"); 
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	
	
	int statusCode=response.getStatusCode();
	System.out.println("Response Body is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	
	
	String status=response.jsonPath().get("status");
	Assert.assertEquals(status, "success");
	}
}
