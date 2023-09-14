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
 public void selecionarCombo(String v) {
   dsl.selecionarCombo(MobileBy.AccessibilityId("console"),v);//.xpath("//android.widget.Spinner/android.widget.TextView")); 
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

 public void Salvar() {
	 dsl.clicarPorTexto("SALVAR");
 }
 
 public String obterNomeCadastrado() {
	 return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:'"));
 }
 public String obterConsoleCadastrado() {
	 return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console']"));
 }
 public String obterSwitchCadastrado() {
	 //return  dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text='Checkbox']")).endsWith("Marcado"));
	// return dsl.obterTexto(By.xpath("//android.widget.TextView[start-with(@text,'Checkbox:'])")).endsWith("Marcado")); //start-with 
	return dsl.obterTexto(By.xpath("//android.widget.TextView[start-with(@text,'Switch:'])"));//.endsWith("Marcado")); //start-with 

//	 return dsl.s "//android.widget.TextView[@text='Nome: Natanael'])))";
 }
 
 public String obterCheckboxCadastrado() {
	 //return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:'])")).endsWith("Marcado")); //.endsWith("Marcado")); //start-with 

	 return dsl.obterTexto(By.xpath("//android.widget.TextView[start-with(@text,'Checkbox:'])"));//.endsWith("Marcado")); 
 }
 
 
 //validar //driver.findElement(By.xpath("//*[@text='SALVAR']")).click();
 
 Assert.assertEquals("Nome: Natanael", dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Nome: Natanael']")));
 Assert.assertEquals("Console: switch",dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Console: switch']")));
 Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]")).endsWith("Off"));
 Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]")).endsWith("Marcado"));

// Assert.assertTrue(dsl.isCheckMarcado.(By.xpath("//android.widget.TextView[starts-with(@text,'Switch')]".endsWith(null))("android.widget.CheckBox").en) ).;
//		 Assert.assertFalse(dsl.isCheckMarcado(By.className("android.widget.CheckBox")));
 Assert.assertTrue("0ff",dsl.obterTexto(By.xpath("//android.widget.TextView[start-with(@text,'Checkbox:'])")).endsWith("Marcado")); //start-with 
/*  MobileElement date = driver.findElement(By.xpath("//android.widget.TextView[@text='Data: 01/01/2000']"));
  Assert.assertEquals("Data: 01/01/2000",date.getText());
  MobileElement hora =dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Hora: 06:00']"));
 Assert.assertEquals("Hora: 06:00",hora.getText());
*/ 	  //}
 // "//android.widget.TextView[start-with(@text,'Checkbox:'])"

}