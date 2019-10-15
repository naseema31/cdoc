package tests1;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	@BeforeTest
	public void setup()
	{ 
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Samsung");	
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability(MobileCapabilityType.UDID, "442dc207");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
	}
	
	@Test
	public void sampleTest()
	{
		System.out.println("I am inside sample test");
	}
	 
	
	@AfterTest
	public void teardown()
	{
		System.out.println();
	}
}
