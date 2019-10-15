package com.green;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_Install_POST {
	

	@Test
	public void install_app()
	{
    	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1";

	RequestSpecification httpRequest=RestAssured.given();;
	JSONObject requestParams=new JSONObject();
	
	
	
	    requestParams.put("id","41");
	    requestParams.put( "deviceId","");
		requestParams.put("imeiNumber","8666760356662329");
		requestParams.put("appName","com.calldoc.doctor");
		requestParams.put("appVersion","1");
		requestParams.put("deviceModel","honour");
		requestParams.put("deviceManufacturer","huawei");
		requestParams.put("deviceSdk","28");
		requestParams.put("source","");
		requestParams.put("medium","");
		requestParams.put("term","");
		requestParams.put( "content","");	
	
	
	httpRequest.header("Content-Type","application/JSON");
	httpRequest.body(requestParams.toJSONString());
	
	Response response=httpRequest.request(Method.POST,"/install"); 
	
	
	String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	
	
	int statusCode=response.getStatusCode();
	System.out.println("Response Body is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	
	
	String status=response.jsonPath().get("status");
	Assert.assertEquals(status, "success");
	
	
	
	
	}

}
