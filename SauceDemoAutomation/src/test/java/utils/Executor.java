package utils;

import org.openqa.selenium.WebDriver;


public class Executor {

	private WebDriver driver;
	BrowserDriverMananger browserMananger;
	
	public void setup() {	
		browserMananger = new BrowserDriverMananger();
		driver = BrowserDriverMananger.browser("edge");
		driver.get("https://www.saucedemo.com/");
	}
	
	public void exit() {
		driver.quit();
	}
}
