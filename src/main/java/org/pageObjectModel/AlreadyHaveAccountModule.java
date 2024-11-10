package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlreadyHaveAccountModule {

	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Already have an account?']")
	private WebElement alreadyHaveAccountClick;
	
	@FindBy(xpath = "//input[starts-with(@id,'email')]")
	private WebElement eMail3;
	
	@FindBy(xpath = "//input[starts-with(@id,'pass')]")
	private WebElement password2;
	
	@FindBy(xpath = "//a[text()='Sign up for Facebook']")
	private WebElement signUpClick;
	
	
	
	public AlreadyHaveAccountModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getAlreadyHaveAccountClick() {
		return alreadyHaveAccountClick;
	}
	public WebElement getEMail3() {
		return eMail3;
	}
	public WebElement getPassword2() {
		return password2;
	}
	public WebElement getSignUpClick() {
		return signUpClick;
	}
}
