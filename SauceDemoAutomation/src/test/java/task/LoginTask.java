package task;

import org.openqa.selenium.WebDriver;

import page.LoginPage;
import utils.Executor;
import utils.SeleniumActions;
import validations.GenericValidations;

public class LoginTask extends SeleniumActions{

	WebDriver driver;
	Executor execute;
	LoginPage loginPage;
	GenericValidations genericValidation;
	
	
	public LoginTask(WebDriver driver) {
		super(driver);
		execute = new Executor();
		loginPage = new LoginPage(driver, loginPage);
	}

	public void validarTelaLogin() {
		execute.setup();
		genericValidation.validationTextoEsperadoAtual("Swag Labs", loginPage.tituloLogin().getText());
		
		execute.exit();
	}
}
