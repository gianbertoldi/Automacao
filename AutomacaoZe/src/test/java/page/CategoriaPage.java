package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.AcoesSelenium;

public class CategoriaPage extends AcoesSelenium {

	private WebDriver driver;

	public CategoriaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectCategoriaCerveja() {
		By tabCerveja = By.id("category-Cervejas");
		click(driver, tabCerveja, 30);
	}

	public void selecionarMarcaBrahma() {
		By brahma = By.xpath("//div[@class='css-1nk630v']/a[@title='Brahma']");
		click(driver, brahma, 5);
	}

	public void selecionarTipoBrahma(String tipo) {
		By tipoBrahma = By.xpath("//div[@class='css-1bwhyb7']/a[@title='" + tipo + "']");
		click(driver, tipoBrahma, 5);
	}

	public String guardarValorDoProduto() {
		By valorProduto = By.id("subtotal");
		return pegarTexto(driver, valorProduto, 5);
	}

	public void addSeisUnidades() {
		By addSeisUnidades = By.id("add-amount-6");
		click(driver, addSeisUnidades, 5);
	}

	public void addCarrinho() {
		By addCarrinho = By.id("add-product");
		click(driver, addCarrinho, 5);
	}
	
	public String guardarFrete() {
		By valorFrete = By.id("shipping-price");
		return pegarTexto(driver, valorFrete, 5);
	}
	public String valorTotal() {
		By valor = By.id("total-price");
		return pegarTexto(driver, valor, 5);
	}
}
