package calldoc.AppFw;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;


public class Login {
	
	public static final String ACCOUNT_SID="AC591789639fc859a1d0c78c407c34e065";
	public static final String AUTH_TOKEN="6c938d99b99c8ff3d8c1e6a652b07a5f";
	
	
	public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<MobileElement>cap;
	
		
		
	File f=new File("src");
	File fs=new File(f,"app1-debug.apk");
	DesiredCapabilities capabilities= new DesiredCapabilities();


   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CallDoc");
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
   Mob.sendKeys("+12512610727");
   
   driver.navigate().back();
   driver.findElementById("com.calldoc.patient_calldoc:id/btn_sendOTP").click();
	
   //driver.findElementById("android:id/button1").click();
   //driver.findElementById("android:id/button2").click();I
   //driver.findElementById("com.calldoc.patient_calldoc:id/input_otp").sendKeys("109162");
   //driver.findElementByXPath("//android.widget.Button[@text='CONFIRM']").click();
   Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	String smsBody = getMessage();
	System.out.println(smsBody);
	String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
	System.out.println(OTPNumber);
	
	driver.findElement(By.id("auth-pv-enter-code")).sendKeys(OTPNumber);

	}
	
	
	public static String getMessage() {
		return getMessages().filter(m->m.getDirection().compareTo(Message.Direction.INBOUND)==0)
				.filter(m->m.getTo().equals("+12512610727")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);//here
	}
	
	private static Stream<Message> getMessages() {
        ResourceSet<Message>messages=Message.reader(ACCOUNT_SID).read();
        return StreamSupport.stream(messages.spliterator(), false);
	}

}