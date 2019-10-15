package calldoc.AppFw;
	import java.io.File;
	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;

	//import bsh.Capabilities;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;
	import io.appium.java_client.windows.WindowsElement;

	public class Tc2 {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<MobileElement>cap;
		
			
			
		File f=new File("src");
		File fs=new File(f,"Pat-11-10-19.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();


	   //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "cdoc");
	   capabilities.setCapability(MobileCapabilityType.UDID, "SFD3Y18428004735");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	   //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

	    capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    //AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4726/wd/hub"),capabilities);
	    AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//return driver;
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.Button[@text='Sign Up']").click();
	   
	   driver.findElementById("com.calldoc.patient_calldoc:id/input_firstName").sendKeys("Naseema");
	   driver.findElementById("com.calldoc.patient_calldoc:id/input_lastName").sendKeys("banu");
	   driver.findElementById("com.calldoc.patient_calldoc:id/input_gender").click();
	   driver.findElementByXPath("//android.widget.TextView[@text='Male']").click();
	   driver.findElementByXPath("//android.widget.TextView[@text='Select your Birth Date']").click();
	   driver.findElementById("android:id/button1").click();
	   driver.navigate().back();
	   
		}
	}

