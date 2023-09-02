import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
//import java.net.URI;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class CalcJunit {
    @Before                                                 
	public void Soma() throws MalformedURLException {
	     DesiredCapabilities dc = new DesiredCapabilities();
	     dc.setCapability("platformName", "Android");
	     dc.setCapability("deviceName","192.168.56.101:5555");
	     dc.setCapability("automationName", "uiautomator2");
	     dc.setCapability("appPackage", "com.android.calculator2");
	     dc.setCapability("appActivity","com.android.calculator2.Calculator");
	   // URI a = new URI("http://www.foo.com/");
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

		MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
		el8.click();
		//MobileElement el9 = (MobileElement) driver.findElementById("com.android.calculator2:id/eq");
		//el9.click();//
		//MobileElement el0 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_16");
        //el0.click();
        // System.out.println(el9);
		MobileElement el10 =(MobileElement) driver.findElementById("com.android.calculator2:id/result");
		el10.click();
		System.out.println(el10);
		System.out.println(el10.getText());
        Assert.assertEquals("16", el10.getText());
		//Assert.e
        //testes
	}

}
