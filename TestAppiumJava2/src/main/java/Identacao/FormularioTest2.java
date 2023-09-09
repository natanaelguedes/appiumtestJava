package Identacao;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest2 {
	private AndroidDriver<MobileElement> driver;
	@Before
	public void InicializarAppium() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\natan\\git\\appiumtestJava\\TestAppiumJava2\\src\\main\\resources\\CTAppium_1_2.apk");
		// URI a = new URI("http://www.foo.com/");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@text='Formulário']")).click();//...

 	}

	@Test
	public void deveInteragirComoCombo() throws MalformedURLException{
		
		 driver.findElement(By.className("android.widget.EditText")).sendKeys("Natanael");
		 driver.findElement(By.className("android.widget.CheckBox")).click();
		 driver.findElement(By.className("android.widget.Switch")).click();
		 driver.findElement(By.className("android.widget.Spinner")).click();
		 driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']")).click();
		 driver.findElement(By.xpath("//*[@text='SALVAR']")).click();
		  
		  //validar 
		  MobileElement nome = driver.findElement(By.xpath("//android.widget.TextView[@text='Nome: Natanael']"));
		  Assert.assertEquals("Nome: Natanael", nome.getText()); 
		  MobileElement con = driver.findElement(By.xpath("//android.widget.TextView[@text='Console: ps4']"));
		  Assert.assertEquals("Console: ps4" , con.getText()); //start-with que a //
		  MobileElement switch2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Slider: 25']"));
		  Assert.assertEquals("Slider: 25" , switch2.getText()); //start-with que a
		  MobileElement checkbox = driver.findElement(By.xpath("//android.widget.TextView[@text='Checkbox: Marcado']"));
		  Assert.assertEquals("Checkbox: Marcado" , checkbox.getText()); //start-with
		
		  MobileElement Switch  = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Switch')]"));
		  Assert.assertTrue(Switch.getText().endsWith("Off")); //start-with
		  MobileElement date = driver.findElement(By.xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
		  Assert.assertEquals("Data: 01/01/2000",date.getText());
		  MobileElement hora = driver.findElement(By.xpath("//android.widget.TextView[@text='Hora: 06:00']") );
		  Assert.assertEquals("Hora: 06:00",hora.getText());
		   
		  
		  	}



}