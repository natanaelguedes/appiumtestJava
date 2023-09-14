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
		   page.escreverNome("Natanael");
		   page.clicarCheck();
		   page.clicarSwitch();
		   page.selecionarCombo("Nitendo Switch");
           page.Salvar();

		   dsl.escrever(By.className("android.widget.EditText"),"Natanael");
		 dsl.clicar(By.className("android.widget.CheckBox"));//.click();
		 dsl.clicar(By.className("android.widget.Switch"));//).cbarracolick();
		 dsl.selecionarCombo(By.className("android.widget.Spinner"),"Nintendo Switch") ;//.click(); dsl.clicarPorTexto("SALVAR"); //;
		 dsl.clicarPorTexto("SALVAR");//.click();
		  
			  }
}	 

