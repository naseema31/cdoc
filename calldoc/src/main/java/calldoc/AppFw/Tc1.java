package calldoc.AppFw;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import bsh.Capabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsElement;

public class Tc1{
	
 
	//private static final MobileElement MobileElement = null;

	public static void main(String[] args) {
	DesiredCapabilities capabilities= new DesiredCapabilities();

	//AndroidDriver<MobileElement> driver=capabilities();
	AndroidDriver driver;
	MutableCapabilities cap;
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahulemulator");

    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

    // capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());


	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	     driver.findElementByXPath("//android.widget.Button[@text='Sign up']").click();
	     //driver.findElement(By.xpath("//*[@id='input_firstName']")).sendKeys("naseema");
	     MobileElement fname=(MobileElement) driver.findElement(By.id("com.calldoc.calldoc_patient:id/input_firstName"));
	    fname.sendKeys("Naseem");
	    //com.calldoc.calldoc_patient:id/input_firstName
	    MobileElement lname=(MobileElement) driver.findElement(By.id("com.calldoc.calldoc_patient:id/input_lastName"));
	    lname.sendKeys("banu");
	   
	    MobileElement Dname=(MobileElement) driver.findElement(By.id("com.calldoc.calldoc_patient:id/input_display_name"));  
	    Dname.sendKeys("123#abc");
	    Thread.sleep(2000);
	  //  (//android.widget.EditText)[2] com.calldoc.patient_calldoc:id/input_email
	  // same class name how where is the id declar for fname lname Dname ok change and try class name give get confused because all element has same class name so try using id
	    driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));


	    MobileElement Email=(MobileElement) driver.findElement(By.id("com.calldoc.calldoc_patient:id/input_email"));
	    Thread.sleep(2000);
	    Email.sendKeys("nas45@gmail.com");
	   
	   // MobileElement Mob= driver.findElement(By.xpath("//*[@id='input_mobile']"));
	    MobileElement Mob= (MobileElement) driver.findElement(By.id("com.calldoc.calldoc_patient:id/input_mobile"));
	    Thread.sleep(1000);
	    Mob.sendKeys("8866123457");
	    
	   // new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input_mobile']")));
	     
	    driver.findElementByXPath("//android.widget.Button[@text='GET OTP']").click();
	  
	}
	
	
}
	