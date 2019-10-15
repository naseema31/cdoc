package calldoc.AppFw;

//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

 public class Tc6 {
  private String reportDirectory = "reports";
  private String reportFormat = "xml";
  private String testName = "Untitled";
  protected AndroidDriver<AndroidElement> driver = null;

  DesiredCapabilities dc = new DesiredCapabilities();
  
  @BeforeMethod
  public void setUp() throws MalformedURLException {
      dc.setCapability("reportDirectory", reportDirectory);
      dc.setCapability("reportFormat", reportFormat);
      dc.setCapability("testName", "Tc6");
      dc.setCapability(MobileCapabilityType.UDID, "SFD3Y18428004735");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.calldoc.patient_calldoc");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Activities.LoginAndSignUpActivity");
      driver = new AndroidDriver<>(new URL("http://127.0.0.1:4724/wd/hub"), dc);
      driver.setLogLevel(Level.INFO);
  }

  @Test
  public void testUntitled() {
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
      driver.findElement(By.xpath("//*[@text='YES']")).click();
  }

  @AfterMethod
  public void tearDown() {
      driver.quit();
  }
}