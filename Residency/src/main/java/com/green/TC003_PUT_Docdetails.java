package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_PUT_Docdetails {

	@Test
	public void doctor_update()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1";

	RequestSpecification httpRequest=RestAssured.given();;
	JSONObject requestParams=new JSONObject();
	requestParams.put ("id","2c9f87136d5dcb0f016d6bdbf6700058");
	requestParams.put ("userId","2c9f87136d5dcb0f016d61fce0a3002f");
	requestParams.put("specicalization", "Cardiologist");
	requestParams.put("degree","MBBS");
	requestParams.put("mciRegistrationNo","28463285");
	requestParams.put("experience","10-12 years");
	requestParams.put("practiceAddress","Green Residency");
	requestParams.put("city","bangalore");
	requestParams.put("state","Karnataka");
	requestParams.put("pincode","560037");
	requestParams.put("gender","Female");
	requestParams.put("knownLanguage","English");
	requestParams.put("fees","800.0");
	requestParams.put("consultationDuration","72");
	requestParams.put("accountHolderName","Naseema");
	requestParams.put("accountNo","567890");
	requestParams.put("accountType","Current");
	requestParams.put("bankName","ICICI");
	requestParams.put("ifscCode","SBIN00326");
	requestParams.put("panCard","AKMPH8034G");
 
	
	httpRequest.header("Content-Type","application/JSON");
	httpRequest.body(requestParams.toJSONString());
	
	Response response=httpRequest.request(Method.PUT,"/doctor"); 
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	
	
	int statusCode=response.getStatusCode();
	System.out.println("Response Body is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	
	
	String status=response.jsonPath().get("status");
	Assert.assertEquals(status, "success");
	}
	

	
}
