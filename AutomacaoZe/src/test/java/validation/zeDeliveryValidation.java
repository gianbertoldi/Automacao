package validation;

import org.openqa.selenium.WebDriver;

import page.CategoriaPage;
import page.EnderecoPage;
import utils.GerenciamentoDriver;
import utils.TipoBrahma;

public class zeDeliveryValidation {


	GerenciamentoDriver gerenciamentoDriver;
	EnderecoPage enderecoPage;
	CategoriaPage categoraPage;
	TipoBrahma tipoBrahma;
	
	public zeDeliveryValidation(WebDriver driver) {
		enderecoPage = new EnderecoPage(driver);
		categoraPage = new CategoriaPage(driver);
	}
	
	public void validarValorFinal() {
		
	}
}
