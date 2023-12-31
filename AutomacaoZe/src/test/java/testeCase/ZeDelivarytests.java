package testeCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import task.zeDeliveryTask;
import utils.GerenciamentoDriver;

public class ZeDelivarytests {
	
	private WebDriver driver;
	GerenciamentoDriver gerenciamentoDriver;
	zeDeliveryTask zeDeliveryTask;
	
	@Before
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDriver();
		driver = GerenciamentoDriver.browser("edge");
		zeDeliveryTask = new zeDeliveryTask(driver);
		driver.get("https://www.ze.delivery/");
	}

	@Test
	public void validaPreenchimentoEndereco() {
		zeDeliveryTask.validationEnderecoZeDelivary();
	}
	
	@Test
	public void validaSelecaoCervejasEValorFinal() {
		zeDeliveryTask.validationEnderecoZeDelivary();
		zeDeliveryTask.validaCategoriaCerveja();		
	}
	
	@After
	public void fim() {
		driver.quit();
	}
}
