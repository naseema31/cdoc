package calldoc.AppFw;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//import com.mongodb.connection.Stream;
//import com.twilio.base.ResourceSet;
//import com.twilio.rest.api.v2010.account.Message;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {
	
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<MobileElement>cap;
	
		
		
	File f=new File("src");
	File fs=new File(f,"Pat-11-10-19.apk");
	DesiredCapabilities capabilities= new DesiredCapabilities();


   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "cdoc");
   //capabilities.setCapability(MobileCapabilityType.UDID, "SFD3Y18428004735");
    //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
   //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

    capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    //AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4726/wd/hub"),capabilities);
    AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//return driver;
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.Button[@text='Log In']").click();
   
   MobileElement Mob=driver.findElement(By.id("com.calldoc.patient_calldoc:id/input_mobile"));
   Mob.sendKeys("8867278926");
   
   driver.navigate().back();
   driver.findElementById("com.calldoc.patient_calldoc:id/btn_sendOTP").click();
	
   //driver.findElementById("android:id/button1").click();
   //driver.findElementById("android:id/button2").click();
   driver.findElementById("com.calldoc.patient_calldoc:id/input_otp").sendKeys("109162");
   driver.findElementByXPath("//android.widget.Button[@text='CONFIRM']").click();
	}
}

