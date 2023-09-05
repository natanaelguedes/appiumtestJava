package DriverCentrado;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	 private static AndroidDriver<MobileElement> driver;
	 
	 public static    AndroidDriver<MobileElement> getDriver(){
		 if(driver==null) {
			CreateDriver();
		 }
	 return driver;
}
	 public static void CreateDriver()  {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\natan\\git\\appiumtestJava\\TestAppiumJava2\\src\\main\\resources\\CTAppium_1_2.apk");
		// URI a = new URI("http://www.foo.com/");
		try {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//*[@text='Formulário']")).click();//...

	 }
	 @Before
	 private static void InicializarDriver() throws MalformedURLException  {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\natan\\git\\appiumtestJava\\TestAppiumJava2\\src\\main\\resources\\CTAppium_1_2.apk");
		try{// URI a = new URI("http://www.foo.com/");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		}catch(MalformedURLException e) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
	 }
	 
	 
	 public static void KillDriver() {
	  	 if(driver!=null) {
	  		 driver.quit();
	  		 driver = null;
	   }
	 }
}
