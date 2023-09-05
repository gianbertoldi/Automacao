package task;

import org.openqa.selenium.WebDriver;

import page.LoginPage;
import utils.Executor;
import utils.SeleniumActions;

public class LoginTask extends SeleniumActions{

	private WebDriver driver;
	Executor execute;
	LoginPage loginPage;
	
	
	
	public LoginTask(WebDriver driver) {
		super(driver);
	}



	public void validarTelaLogin() {
		execute.setup();
		
	}
}
