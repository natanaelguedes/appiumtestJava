import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import DriverCentrado.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PreencherFormularioTest {
	private static 	AndroidDriver<MobileElement> driver;
	@Before
	 public  void InicializarAppium() throws MalformedURLException  {
		// TODO Auto-generated method stub
	driver = DriverFactory.getDriver();
	driver.findElement(By.xpath("//*[@text='Formulário']")).click();//...

	}
	@After
	public void tearDown() {
		DriverFactory.KillDriver();//.quit();
	}
	
	
	  @Test 
	  public void devePreencherCampoTexto() throws MalformedURLException{
	  MobileElement campoNome =	  driver.findElement(MobileBy.AccessibilityId("nome"));
	  campoNome.sendKeys("Natanael"); //checar nome escrito
	  
	  String text = campoNome.getText();
	  Assert.assertEquals("Natanael",text); }
	 
	@Test
	public void PreencherCampoSwitchCombo() throws MalformedURLException{
		// driver.findElement(By.xpath("//*[@text='Formulário']")).click();//...

         MobileElement mobileElement =driver.findElement(By.className("android.widget.CheckBox"));
		 MobileElement SW= driver.findElement(MobileBy.AccessibilityId("switch"));//.click();
		 Assert.assertTrue(mobileElement.getAttribute("checked").equals("false"));
		 Assert.assertTrue(SW.getAttribute("checked").equals("true"));
		 
		       mobileElement.click();
		       SW.click();
		 	 Assert.assertFalse(mobileElement.getAttribute("checked").equals("false"));
			 Assert.assertFalse(SW.getAttribute("checked").equals("true"));
			 
 	}
         
		 

	     @Test
	    public void Desafio() throws MalformedURLException{
			  driver.findElement(By.className("android.widget.EditText")).sendKeys("Natanael");
			  driver.findElement(By.className("android.widget.CheckBox")).click();
			  driver.findElement(By.className("android.widget.Switch")).click();
			  driver.findElement(By.className("android.widget.Spinner")).click();
			  driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();
			  driver.findElement(By.xpath("//*[@text='SALVAR']")).click();
			   
		  //validar 
		 //driver.findElement(By.xpath("//*[@text='SALVAR']")).click();

		 MobileElement nome = driver.findElement(By.xpath("//android.widget.TextView[@text='Nome: Natanael']"));
		 Assert.assertEquals("Nome: Natanael", nome.getText()); 
		 MobileElement con = driver.findElement(By.xpath("//android.widget.TextView[@text='Console: switch']"));
		 Assert.assertEquals("Console: switch" , con.getText()); //start-with que a //
		 MobileElement switch2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Slider: 25']"));
		 Assert.assertEquals("Slider: 25" , switch2.getText()); //start-with que a
		 MobileElement checkbox = driver.findElement(By.xpath("//android.widget.TextView[@text='Checkbox: Marcado']"));
		 Assert.assertEquals("Checkbox: Marcado" , checkbox.getText()); //start-with
		  MobileElement date = driver.findElement(By.xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
		  Assert.assertEquals("Data: 01/01/2000",date.getText());
		  MobileElement hora = driver.findElement(By.xpath("//android.widget.TextView[@text='Hora: 06:00']"));
		   Assert.assertEquals("Hora: 06:00",hora.getText());
			/*
			 * MobileElement Switch = driver.findElement(By.xpath(
			 * "//android.widget.TextView[starts-with(@text,'Switch')]"));
			 * Assert.assertTrue(Switch.getText().endsWith("Off")); //start-with
			 * MobileElement date = driver.findElement(By.
			 * xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
			 * Assert.assertEquals("Data: 01/01/2000",date.getText()); MobileElement hora =
			 * driver.findElement(By.xpath("//android.widget.TextView[@text='Hora: 06:00']")
			 * ); Assert.assertEquals("Hora: 06:00",hora.getText());
			 */ 
		  	}

}
