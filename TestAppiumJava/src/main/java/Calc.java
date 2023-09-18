import java.net.MalformedURLException;
//import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calc {

	public static void main(String[] args) throws MalformedURLException {

     DesiredCapabilities dc = new DesiredCapabilities();
     dc.setCapability("platformName", "Android");
     dc.setCapability("deviceName","emulator-5554");
     dc.setCapability("automationName", "uiautomator2");
     dc.setCapability("appPackage", "com.android.calculator2");
     dc.setCapability("appActivity","com.android.calculator2.Calculator");
   // URI a = new URI("http://www.foo.com/");
    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);

	}

}
