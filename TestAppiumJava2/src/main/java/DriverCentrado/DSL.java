package DriverCentrado;

import static DriverCentrado.DriverFactory.getDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class DSL {
	
	public void escrever(By by, String texto) {

	 getDriver().findElement(by).sendKeys(texto);//.getText();
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
		 	} 
 
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals(true);
	}
	
	
}
