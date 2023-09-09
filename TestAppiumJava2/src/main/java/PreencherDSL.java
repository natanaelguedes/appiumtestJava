import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import DriverCentrado.DSL;
import DriverCentrado.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PreencherDSL {
	private static 	AndroidDriver<MobileElement> driver;
	private DSL dsl = new DSL();
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
			dsl.escrever(MobileBy.AccessibilityId("nome"),"Natanael");/*
								 * MobileElement campoNome =
								 * driver.findElement(MobileBy.AccessibilityId("nome"));
								 * campoNome.sendKeys("Natanael"); //checar nome escrito
								 */	  
 	  Assert.assertEquals("Natanael",dsl.obterTexto(MobileBy.AccessibilityId("nome")));
	  }
	 
	@Test
	public void DeveInteragirCombo() throws MalformedURLException{
		// driver.findElement(By.xpath("//*[@text='Formulário']")).click();//...

         dsl.selecionarCombo(MobileBy.AccessibilityId("Console"), "Nitendo Seitch");
		  String text = dsl.obterTexto(By.xpath("android.widget.Spinner/android.widget.TextView"));//.getText();
          Assert.assertEquals("Nitendo Switch", text);
	}
         
	@Test
	public void PreencherCampoSwitchCombo() throws MalformedURLException{
		// verificar status dos elementos
		

		 Assert.assertFalse(dsl.isCheckMarcado(By.className("android.widget.CheckBox")));
		 Assert.assertTrue(dsl.isCheckMarcado(MobileBy.AccessibilityId("switch")));
		 
		 dsl.clicar(By.className("android.widget.CheckBox"));
		 dsl.clicar(By.className("switch"));
		 //clicar nos elementos 
		       Assert.assertTrue(dsl.isCheckMarcado(By.className("android.widget.CheckBox")));
			   Assert.assertFalse(dsl.isCheckMarcado(MobileBy.AccessibilityId("switch")));
			 
 	}
         
		 
//parou aqui
	
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
