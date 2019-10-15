package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_GET_Reg_Patient {


	@Test
	public void doctor_registration()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1";

	RequestSpecification httpRequest=RestAssured.given();;
	JSONObject requestParams=new JSONObject();
	requestParams.put("firstName", "Naseema");
	requestParams.put("firstName","Prabhas");
	requestParams.put("lastName","Prince");
	requestParams.put("mobileNumber","8867278926");
	requestParams.put("email","prince768@gmail.com");
	requestParams.put("gender","male");
	requestParams.put("dateOfBirth","03/04/1996");
	requestParams.put("deviceId","0");
	requestParams.put("appName","com.calldoc.patient");
	requestParams.put("appVersion","1");
	requestParams.put("deviceManufacturer","Apple");
	requestParams.put("deviceModel","oneplus");
	requestParams.put("deviceSdk","28");
	requestParams.put("imei","88899991923");
	requestParams.put("latitude","1034.0");
	requestParams.put("longitude","3323.4");
	requestParams.put("preferredLanguage","english");
	requestParams.put("registrationId","yguhiljljoj");
	
	
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