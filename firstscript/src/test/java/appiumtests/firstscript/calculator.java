package appiumtests.firstscript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class calculator {
	static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
		openCalculator();
		}catch(Exception exp) {
			
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		// TODO Auto-generated method stub
	}
		public static void openCalculator() throws MalformedURLException {
			DesiredCapabilities cap= new DesiredCapabilities();
					
			cap.setCapability("deviceName", "Honor 7X");	
			cap.setCapability("udid", "SFD3Y18428004735");
			cap.setCapability("platformName", "Android");
			cap.setCapability("PlatformVersion", "9");
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url,cap);
			System.out.println("Application started");
	
		    MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		    MobileElement plus =driver.findElement(By.id("com.android.calculator2:id/op_add"));
		    
		    MobileElement three =driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		    MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		    MobileElement result=driver.findElement(By.className("android.widget.ImageView"));
		    
		    two.click();
		    plus.click();
		    three.click();
		    String res =result.getText();
		    System.out.println("Res is : "+ res);
		    System.out.println("completed");
		    equals.click();
		}
		

}
