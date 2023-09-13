package PageTest;
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
import page.FormularioPage;
import page.MenuPage;

public class FormularioTeste {
	private MenuPage menu = new MenuPage();
    private FormularioPage page = new FormularioPage();
	private DSL dsl = new DSL();

	@Before
	public void iniciarDSL() throws MalformedURLException {
        menu.acessarFormulario();

	}
       
	
	
	  @After 
	  public void tearDown() {
		  DriverFactory.KillDriver();//.quit(); }
	  }
	  
	  
		
		  @Test 
		  public void d() throws MalformedURLException{
		  //formPage.clicarPorTexto("Formulário");
		  page.escreverNome("Natanael");
		  Assert.assertEquals("Natanael",page.obterNome());
 		  

}
	
		  @Test 
		  public void DeveInteragirCombo() throws MalformedURLException{
 		
		  Assert.assertEquals("Nitendo Switch",page.obterNome());
 		  

}    
	   @Test 
       public void deveInteragirSwitchCheckbox() throws MalformedURLException{
		 Assert.assertFalse(page.isCheckboxMarcado());
		 Assert.assertTrue(page.isSwitchMarcado());///;/;..isCheckMarcado(MobileBy.AccessibilityId("switch")));
		 page.clicarCheck();//.clicar(By.className("android.widget.CheckBox"));
		 page.clicarSwitch();
		  Assert.assertTrue(page.isCheckboxMarcado());
		  Assert.assertFalse(page.isSwitchMarcado());

       }
	   

		  @Test 
		  public void RealizarCadastro() throws MalformedURLException{
		  dsl.escrever(By.className("android.widget.EditText"),"Natanael");
		 dsl.clicar(By.className("android.widget.CheckBox"));//.click();
		 dsl.clicar(By.className("android.widget.Switch"));//).cbarracolick();
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

