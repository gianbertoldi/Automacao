package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.AcoesSelenium;

public class EnderecoPage extends AcoesSelenium{

	private WebDriver driver;
	
	public EnderecoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void souMaiorDeIdade() {
		By maiorIdade = By.id("age-gate-button-yes");
		click(driver, maiorIdade, 10);
	}
	public void selectInputEndereco() {
		By selectInputEndereco = By.xpath("//input[@class='css-10l4r8f-Input']");
		click(driver, selectInputEndereco, 10);
	}
	
	public void preecherRua() {
		By inputEndereco2 = By.xpath("//input[@id='address-search-input-address']");
		enviarDados(driver, inputEndereco2, "Manuel Braga Gastal", 10);
	}
	public void primeiraOpcao() {
		By primeiroEndereco = By.xpath("//div[@class='css-13udsys']");
		click(driver, primeiroEndereco, 10);
	}
	
	public void numeroEndereco() {
		By numeroEndereco = By.id("address-details-input-number");
		click(driver, numeroEndereco, 10);
		enviarDados(driver, numeroEndereco, "181", 10);
	}
	
	public void semComplemento() {
		By selectSemComplemento = By.id("address-details-checkbox-without-complement");
		click(driver, selectSemComplemento, 10);
	}
	
	public void selectVerProdutos() {
		By btnVerProdutos = By.id("address-details-button-continue");
		click(driver, btnVerProdutos, 10);
	}
}
