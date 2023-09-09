package DriverCentrado;

import static DriverCentrado.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
 
public class DSL {

	public void escrever(By by, String text) {
	  getDriver().findElement(by).sendKeys(text);
	//  campoNome.sendKeys("Natanael"); //checar nome escrito
	 
  }
	public String obterTexto(By by) {

	return getDriver().findElement(by).getText();
	}
}
