package appiumtests.firstscript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Patient_apk {

static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
		openPatient();
		}catch(Exception exp) {
			
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

}
	}
	public static void openPatient() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
				
		cap.setCapability("deviceName", "Samsung");	
		cap.setCapability("udid", "442dc207");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
	
		cap.setCapability("appPackage", "com.calldoc.calldoc_doctor");
		//cap.setCapability("appActivity", "com.calldoc.patient_calldoc.Activities.LoginAndSignUpActivity");
		cap.setCapability("appActivity", "com.calldoc.calldoc_doctor.SplashPage");
		//cap.setCapability("appActivity", "com.calldoc.calldoc_doctor.doc_home");
		cap.setCapability("appActivity", "com.calldoc.calldoc_doctor.doc_reg");
		//cap.setCapability("appActivity", "com.calldoc.calldoc_doctor.SplashPage");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,cap);
		System.out.println("Application started");
}
}