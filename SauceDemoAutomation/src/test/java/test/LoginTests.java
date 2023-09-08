package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import task.LoginTask;

public class LoginTests {

	private WebDriver driver;
	LoginTask loginTask;
	
	@Test
	public void validaTelaLogin() {
		loginTask = new LoginTask(driver);
		loginTask.validarTelaLogin();
	}
}
