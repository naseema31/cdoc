package calldoc.AppFw;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Capabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsElement;

public class Tc5 extends Base{
	
 
	private static final MobileElement MobileElement = null;

	public static void main(String[] args)  {
		File f=new File("src");
		File fs=new File(f,"app1-debug.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		


	   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CallDoc");
		AndroidDriver driver = null;
		
		
		
	    //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Sign Up']")).click();
	      driver.findElement(By.xpath("//*[@id='input_firstName']")).sendKeys("sameer");
	      driver.findElement(By.xpath("//*[@id='input_lastName']")).sendKeys("b");
	      new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input_display_name']")));
	      driver.findElement(By.xpath("//*[@id='input_display_name']")).sendKeys("asd123$");
	      driver.findElement(By.xpath("//*[@id='input_email']")).sendKeys("sam123@gmail.com");
	      new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input_mobile']")));
	      driver.findElement(By.xpath("//*[@id='input_mobile']")).sendKeys("8867278926");
	      new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='GET OTP']")));
	      driver.findElement(By.xpath("//*[@text='GET OTP']")).click();
	      driver.findElement(By.xpath("//*[@text='YES']")).click();



}
}
