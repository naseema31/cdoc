package calldoc.AppFw;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cdoc_Signup  {
	AndroidDriver driver;
	
    @BeforeTest
	 
    public void setup() throws MalformedURLException {
	   DesiredCapabilities capabilities = new DesiredCapabilities();
		
	   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	   capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
	   capabilities.setCapability(MobileCapabilityType.APP, "c://apks//app1-debug.apk");
	   AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
	   
    public void verifyOTP()
    {
    	driver.findElementByAccessibilityId("OS").click();
    	driver.findElementByAccessibilityId("SMS Messaging").click();
    	driver.findElementById("io.appium.android.apis:id/sms_recipient").sendKeys("44560");
    	driver.findElementById("io.appium.android.apis:id/sms_content").sendKeys("DEMO OTP:654923");
     }
	  
    public String getOTP()
    {
    	driver.startActivity(  );;
    }
    
    
    
    
    
    public static void main(String[] args) {
		   
	   
	}

	@Test
	public void testcase1()throws Exception {
		
		driver.findElementByXPath("//android.widget.Button[@text='Log In']").click();
		   
		   WebElement Mob=driver.findElement(ById.id("com.calldoc.patient_calldoc:id/btn_Login"));
		   Mob.sendKeys("8867278926");
		 driver.navigate().back();
		  driver.findElementById("com.calldoc.patient_calldoc:id/btn_sendOTP").click();
		   driver.findElementById("android:id/button1").click();
		   //driver.findElementById("android:id/button2").click();
		   
	   //driver.findElementById("Example").click();
	   //Assert.assertTrue(driver.findElementById("Example").isDisplayed());
	}

  // @AfterTest
	//public void testCaseTearDown() {
	  // driver.quit();
	//}
}