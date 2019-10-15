package com.green;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008_getpatient_details {

	@Test
	public void get_Pat_details()
	{
		
		
		//Response resp=get("https://samples.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
		int code=get("http://staging-644472902.ap-south-1.elb.amazonaws.com/ws/v1/patient/2c9f87136d6d707c016d6d740a320004").getStatusCode();
	System.out.println("status code is "+ code);
	Assert.assertEquals(code, 200);
	}
	
	
	
	
}
