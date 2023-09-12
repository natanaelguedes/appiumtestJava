import java.awt.Checkbox;
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

public class PreencherDSL {
	private DSL dsl = new DSL();

	@Before
	public void iniciarDSL() throws MalformedURLException {
		// TODO Auto-generated constructor stub
		//driver = DriverFactory.getDriver();
		dsl.clicarPorTexto("Formulário");//.fi
	}
       
	
	
	  @After 
	  public void tearDown() {
		  DriverFactory.KillDriver();//.quit(); }
	  }
	  
	  
		/*
		 * @Test public void devePreencherCampoTexto() throws MalformedURLException{
		 * dsl.clicarPorTexto("Formulário");
		 * dsl.escrever(MobileBy.AccessibilityId("nome"),"Natanael");
		 * Assert.assertEquals("Natanael",dsl.obterTexto(MobileBy.AccessibilityId("nome"
		 * )));
		 */	  	 //*/
    //  dsly.className("android.widget.Spinner/XBox One"));
	  //String text = dsl.obterTexto(By.xpath("android.widget.Spinner/android.widget.TextView"));//
	  //Assert.assertEquals("Nitendo Switch", text);
	/*   }
       @Test 
       public void deveInteragirSwitchCheckbox() throws MalformedURLException{
		 Assert.assertFalse(dsl.isCheckMarcado(By.className("android.widget.CheckBox")));
		 Assert.assertTrue(dsl.isCheckMarcado(MobileBy.AccessibilityId("switch")));
		 dsl.clicar(By.className("android.widget.CheckBox"));
		 dsl.clicar(MobileBy.AccessibilityId("switch")); //clicar nos elementos
		  Assert.assertTrue(dsl.isCheckMarcado(By.className("android.widget.CheckBox")) );
		  Assert.assertFalse(dsl.isCheckMarcado(MobileBy.AccessibilityId("switch")));

       }*/

		  @Test 
		  public void RealizarCadastro() throws MalformedURLException{
		  dsl.escrever(By.className("android.widget.EditText"),"Natanael");
		 dsl.clicar(By.className("android.widget.CheckBox"));//.click();
		 dsl.clicar(By.className("android.widget.Switch"));//).click();
		 dsl.selecionarCombo(By.className("android.widget.Spinner"),"Nintendo Switch") ;//.click(); dsl.clicarPorTexto("SALVAR"); //;
		 dsl.clicarPorTexto("SALVAR");//.click();
		  
		 //validar //driver.findElement(By.xpath("//*[@text='SALVAR']")).click();
		 
		 Assert.assertEquals("Nome: Natanael", dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Nome: Natanael']")));
		 Assert.assertEquals("Console: switch",dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Console: switch']")));
		 Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]")).endsWith("Off"));
		 Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]")).endsWith("Marcado"));
 
//		 Assert.assertTrue(dsl.isCheckMarcado.(By.xpath("//android.widget.TextView[starts-with(@text,'Switch')]".endsWith(null))("android.widget.CheckBox").en) ).;
	//		 Assert.assertFalse(dsl.isCheckMarcado(By.className("android.widget.CheckBox")));
		 // Assert.assertTrue("0ff",dsl.obterTexto(By.xpath("//android.widget.TextView[start-with(@text,'Checkbox:'])")).endsWith("Marcado")); //start-with 
		/*  MobileElement date = driver.findElement(By.xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
		  Assert.assertEquals("Data: 01/01/2000",date.getText());
		  MobileElement hora =dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Hora: 06:00']"));
		 Assert.assertEquals("Hora: 06:00",hora.getText());
		*/ 	  //}
		 // "//android.widget.TextView[start-with(@text,'Checkbox:'])"
		  }
}	 

