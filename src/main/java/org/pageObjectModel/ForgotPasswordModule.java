package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordModule {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "(//input[starts-with(@name,'email')])[1]")
	private WebElement eMail1;
	
	@FindBy(xpath = "(//input[starts-with(@name,'pass')])[1]")
	private WebElement password1;
	
	@FindBy(xpath = "(//input[starts-with(@name,'email')])[2]")
	private WebElement eMail2;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]")
	private WebElement facebookClick;
	
	public ForgotPasswordModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	public WebElement getEMail1() {
		return eMail1;
	}
	public WebElement getPassword1() {
		return password1;
	}
	public WebElement geteMail2() {
		return eMail2;
	}
	public WebElement getFacebookClick() {
		return facebookClick;
	}
}
