package page;

import org.openqa.selenium.By;

import DriverCentrado.DSL;

public class MenuPage {
  private DSL dsl = new DSL();	
  public void acessarFormulario() {
		dsl.clicarPorTexto("Formulário");//.fi

  }

  public String obterValorCombo() {
	  return dsl.obterTexto(By.xpath("android.widget.Spinner/android.widget.TextView"));//

  }
}
