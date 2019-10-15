package com.green;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class GetData {

	


	/*@Test
	public void testResponseCode()
	{
		
		
		//Response resp=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
		int code=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
	System.out.println("status code is "+ code);
	Assert.assertEquals(code, 200);
	}*/
	
	
	/*@Test
	public void testBody()
	{
		//Response resp=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
		String data=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
		Long time=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		//System.out.println("Data is " + data);
		System.out.println("Response time is " + time);
		
	}*/
	
        @Test	
		public void doctor_update()
		{
        	RestAssured.baseURI="http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/doctor";
	
		RequestSpecification httpRequest=RestAssured.given();;
		Response response=httpRequest.request(Method.GET,"/2c9f87136d5dcb0f016d6bdbf6700058"); 
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is:"+responseBody);
		
		//int code = response.getStatusCode();
		//System.out.println("status code is "+ code);
		 //Assert.assertEquals(code, "200");
		}
        
        
}