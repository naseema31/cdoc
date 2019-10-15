package appiumtests.firstscript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cal {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_XOOTD"); // Android Emulator

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        dc.setCapability("appPackage", "com.asus.calculator");
        dc.setCapability("appActivity", "com.asus.calculator.Calculator"); // This is Launcher activity of your app
                                                                                // (you can get it from apk info app)

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);

        Thread.sleep(5000);

        // locate the Text on the calculator by using By.name()
        WebElement seven = driver.findElementById("com.asus.calculator:id/digit_7");
        seven.click();
        WebElement plus = driver.findElementById("com.asus.calculator:id/op_add");
        plus.click();
        WebElement three = driver.findElementById("com.asus.calculator:id/digit_3");
        three.click();
        WebElement equalTo = driver.findElementById("com.asus.calculator:id/eq");
        equalTo.click();

        // locate the edit box
        WebElement results = driver.findElementById("com.asus.calculator:id/formula");

        if(results.getText().equals("10"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }
    }

}