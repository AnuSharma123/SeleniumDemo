package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	@FindBy(id = "q")
	private WebElement search;
	@FindBy(id = "submit")
	private WebElement go;

	public SeleniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String str) {
		search.sendKeys(str);
	}

	public void click() {
		go.click();
	}

	public void clear() {
		search.clear();
	}
}
