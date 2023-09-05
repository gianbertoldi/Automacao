package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumActions;

public class LoginPage extends SeleniumActions{

	SeleniumActions actions;
	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver, SeleniumActions actions) {
		super(driver);
		this.actions = actions;
	}
	
	@Override
	protected boolean estaPronto() {
		return true;
	}
	
	protected WebElement tituloLogin() {
		return actions.visibilidadeDoElemento(driver, By.xpath("div[@class='login_logo']"), 10);
	}

}
