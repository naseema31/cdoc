package appiumtests.firstscript;


	
	
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;

	public class App2 {
		
		public static void main(String[] args) {
			
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", "SFD3Y18428004735"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "9.0");
			caps.setCapability("appPackage", "com.calldoc.patient_calldoc");
			caps.setCapability("appActivity", "com.google.android.gms.auth.api.signin.inernal.SignInHubActivity");
			caps.setCapability("noReset", "true");
			
			//Instantiate Appium Driver
			try {
					AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

