package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC008_put_Patientdetails {

	
	@Test
	public void patient_update()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1";

	RequestSpecification httpRequest=RestAssured.given();;
	JSONObject requestParams=new JSONObject();
	requestParams.put("id","2c9f87136d5dcb0f016d6bdbf6700058");
	requestParams.put("height","5'7'");
	requestParams.put("weight","75");
	requestParams.put("bloodGroup","A+");
	requestParams.put("allergies","allergies 1, allergies 2");
	requestParams.put("chronicDisease","chronicDisease 1");
	requestParams.put("dateOfBirth","03/05/1996");
	requestParams.put("gender","Male");
	requestParams.put("userId","2c9f87136d6d707c016d6d740a170003");
	requestParams.put("id","2c9f87136d6d707c016d6d740a320004");
 
	
	httpRequest.header("Content-Type","application/JSON");
	httpRequest.body(requestParams.toJSONString());
	
	Response response=httpRequest.request(Method.PUT,"/patient/update"); 
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	
	
	int statusCode=response.getStatusCode();
	System.out.println("Response Body is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	
	
	String status=response.jsonPath().get("status");
	Assert.assertEquals(status, "success");
	}
	

	

	
	
	
	
	
}