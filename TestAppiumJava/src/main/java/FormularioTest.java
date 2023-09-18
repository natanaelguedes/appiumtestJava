import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.expression.spel.ast.Assign;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest {
    @Test                                                 
	public void checkbox() throws MalformedURLException {
		// TODO Auto-generated method stub
	    DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability("platformName", "Android");
	    dc.setCapability("deviceName","emulator-5554");
	   dc.setCapability("automationName", "uiautomator2");
	    dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\natan\\git\\TestAppiumJava\\src\\main\\resources\\CTAppium_1_2.apk");
	   // URI a = new URI("http://www.foo.com/");
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    List<MobileElement> elementosENC = driver.findElements(By.className("android.widget.TextView"));
	    for(MobileElement el: elementosENC) {
	    	System.out.println(el.getText());
	    }
	    elementosENC.get(1).click();
	    //selecionar o formulário
	    MobileElement campo = driver.findElement(MobileBy.AccessibilityId("nome"));
	    campo.sendKeys("Natanael");
	    
	    //checar o que foi escrito
	    String nome = campo.getText();//x
	    Assert.assertEquals("Natanael", nome);
	    //driver.findElement(By.xpath("//android.widget.EditText[@text='Formulário]")).click();
	    driver.findElement(MobileBy.AccessibilityId("console")).click();//.xpath(nome))
	    	    // ESCOLHER A OPÇÃO
	    
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();
        
         // VERIFICAR OPÇÃO SELECIONADA
        driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView"));
        
        MobileElement me = driver.findElement(By.className("android.widget.CheckBox")); 
        MobileElement sw = driver.findElement(By.className("android.widget.Switch"));
   //Verificar se o checkbok é falso Assert.assertTrue(
		me.getAttribute("checked").equals(true) ;
		sw.getAttribute("checked").equals(false);
		 
        //  clica nos elementos.quit();
        me.click();
        sw.click();
        
        // verifica estados alterados
        
		
		
		 me.getAttribute("checked").equals(false) ; 
		 sw.getAttribute("checked").equals(false) ;
		 
		 driver.findElement(By.xpath("//*[@text='SALVAR']")).click();
	    // driver.findElement(By.xpath("//android.widget.TextView["));

		/*
		 * //verificações MobileElement nome2 =
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='Natanael']"));
		 * Assert.assertEquals("Natanael", nome2.getText()); //start-with que a variável
		 * text inicie com Console xone MobileElement console =
		 * driver.findElement(By.xpath(
		 * "//android.widget.TextView[start-with(@text,'Console'" ));
		 * Assert.assertEquals("Console " , console.getText());
		 */	
			/*
			 * //start-with que a variável text inicie com o texto Console xone
			 * MobileElement sws = driver.findElement(By.
			 * xpath("//android.widget.TextView[start-with(@text,'Switch: Off'"));
			 * Assert.assertEquals("Switch: Off", sws.getText()); MobileElement sws2 =
			 * driver.findElement(By.
			 * xpath("//android.widget.TextView[start-with(@text,'Data: 01/01/2000'"));
			 * Assert.assertEquals("Data: 01/01/2000", sws2.getText()); MobileElement sws3 =
			 * driver.findElement(By.
			 * xpath("//android.widget.TextView[start-with(@text,'Hora: 06:00'"));
			 * Assert.assertEquals("Hora: 06:00", sws3.getText());
			 */
		     driver.quit();
	}

}
