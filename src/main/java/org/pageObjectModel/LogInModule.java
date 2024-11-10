package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInModule {
	public static  WebDriver driver;

	@FindBy(xpath = "//input[starts-with(@id,'email')]")
	private WebElement eMail;
	
	@FindBy(xpath = "//input[starts-with(@id,'pass')]")
	private WebElement password;
	
	public LogInModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEMail() {
		return eMail;
	}
	public WebElement getPassword() {
		return password;
	}
}
