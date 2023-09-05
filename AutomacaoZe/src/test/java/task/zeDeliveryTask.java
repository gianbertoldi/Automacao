package task;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import page.CategoriaPage;
import page.EnderecoPage;
import utils.ConversorDeValores;
import utils.GerenciamentoDriver;
import utils.TipoBrahma;

public class zeDeliveryTask {

	EnderecoPage enderecoPage;
	CategoriaPage categoraPage;
	TipoBrahma tipoBrahma;
	ConversorDeValores converterValores;

	public zeDeliveryTask(WebDriver driver) {
		enderecoPage = new EnderecoPage(driver);
		categoraPage = new CategoriaPage(driver);
		converterValores = new ConversorDeValores();
	}

	public void validationEnderecoZeDelivary() {
		enderecoPage.souMaiorDeIdade();
		enderecoPage.selectInputEndereco();
		enderecoPage.preecherRua();
		enderecoPage.primeiraOpcao();
		enderecoPage.numeroEndereco();
		enderecoPage.semComplemento();
		enderecoPage.selectVerProdutos();
	}

	public void validaCategoriaCerveja() {
		categoraPage.selectCategoriaCerveja();
		categoraPage.selecionarMarcaBrahma();
		categoraPage.selecionarTipoBrahma(TipoBrahma.Chopp1Lt.getMilliliters());
		categoraPage.addSeisUnidades();
		categoraPage.addCarrinho();
		String valor = categoraPage.guardarValorDoProduto();
		String frete = categoraPage.guardarFrete();	
		double calcularTotal = converterValores.convert(valor.replaceAll("[^0-9,]", "")) + converterValores.convert(frete.replaceAll("[^0-9,]", ""));
		String stringTotal = Double.toString(calcularTotal);
		stringTotal = stringTotal.replace('.', ',');
		String total = categoraPage.valorTotal();
		assertEquals("R$ " + stringTotal, total);
	}
}
