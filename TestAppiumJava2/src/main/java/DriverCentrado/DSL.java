package DriverCentrado;

import static DriverCentrado.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
 
public class DSL {

	public void escrever(By by, String text) {
	  getDriver().findElement(by).sendKeys(text);
	//  campoNome.sendKeys("Natanael"); //checar nome escrito
	 
  }
	public String obterTexto(By by) {

	return getDriver().findElement(by).getText();
	}
	public void clicar(By by) {
		
		 getDriver().findElement(by).click();

	}
	
	public void clicarPorTexto(String texto) {
		
		 getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).click();

	}
	public void selecionarCombo(By by, String v) {
		 getDriver().findElement(by).click();
		 clicarPorTexto(v);
		 getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='"+"v'")).click();

	} 
 
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals(true);
	}
}
