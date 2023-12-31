package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {
	
	WebDriver driver;
	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(WebDriver driver, By by, int espera) {
		WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(espera)))
				.until(ExpectedConditions.elementToBeClickable(by));
		element.click();
	}

	public WebElement inputText(WebDriver driver, By by, String valor, int espera) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		WebElement element = driver.findElement(by);

		element.sendKeys(valor);
		return element;
	}
	
	public WebElement visibilidadeDoElemento(WebDriver driver, By by, int esperas){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(esperas));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
	
	public String getText(WebDriver driver, By by, int espera) {
	    String text = "";
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(espera));
	    wait.until(ExpectedConditions.presenceOfElementLocated(by));
	    WebElement element = driver.findElement(by);
	    text = element.getText();
	    return text;
	}
	
	public FluentWait<WebDriver> aguardarCondicao(int timeout) {
        return new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .ignoring(Exception.class);
    }

	protected boolean estaPronto() {
		// TODO Auto-generated method stub
		return false;
	}
}
