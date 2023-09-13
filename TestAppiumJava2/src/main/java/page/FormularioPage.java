package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import DriverCentrado.DSL;
import io.appium.java_client.MobileBy;

public class FormularioPage {
 private DSL dsl = new DSL();	
 public void escreverNome(String nome) {
 dsl.escrever(MobileBy.AccessibilityId("nome"),nome);

 }
 
 public String obterNome() {
	 return dsl.obterTexto(MobileBy.AccessibilityId("Nome"));
 }
 
//}
 public void ObterValorCombo(String v) {
   dsl.selecionarCombo(MobileBy.AccessibilityId("console"),v); 
 }
 
 public void clicarCheck() {
	 dsl.clicar(By.className("android.widget.CheckBox"));
 
	 
	 
 }
 
  public void clicarSwitch() {
	  dsl.clicar(By.className("android.widget.CheckBox"));
  }
 public boolean isCheckboxMarcado() {
	return dsl.isCheckMarcado(By.className("android.widget.CheckBox")); //clicar nos elementos
 }
 public boolean isSwitchMarcado() {
	 
	return  dsl.isCheckMarcado(MobileBy.AccessibilityId("switch"));
 }

 
}