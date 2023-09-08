package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class PaginaBase extends Carregavel {

	public PaginaBase(RemoteWebDriver driver) {
		super(driver);
	}

	public Elementos body() {
        return Elementos.com(driver.findElement(By.cssSelector("body")));
    }
}
