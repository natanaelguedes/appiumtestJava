package Identacao;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.expression.spel.ast.Assign;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest {
    @Test                                                 
	public void checkbox() throws MalformedURLException {
		// TODO Auto-generated method stub
	    DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability("platformName", "Android");
	    dc.setCapability("deviceName","emulator-5554");
	    dc.setCapability("automationName", "uiautomator2");
	    dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\natan\\git\\TestAppiumJava\\src\\main\\resources\\CTAppium_1_2.apk");
	   // URI a = new URI("http://www.foo.com/");
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	/*    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<MobileElement> elementosENC = driver.findElements(By.className("android.widget.TextView"));
	    for(MobileElement el: elementosENC) {
	    	System.out.println(el.getText());
	    }
    }