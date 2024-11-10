package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderModule {

	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[starts-with(@id,'sex')])[3]")
	private WebElement genderClick;
	
	@FindBy(xpath = "//select[starts-with(@name,'preferred_pronoun')]")
	private WebElement pronounDropDown;
	
	@FindBy(xpath = "//input[starts-with(@id,'custom_gender')]")
	private WebElement genderField;
	
	@FindBy(xpath = "//input[starts-with(@name,'reg_email__')]")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//input[starts-with(@name,'reg_passwd__')]")
	private WebElement newPassword;
	
	
	public GenderModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getGenderClick() {
		return genderClick;
	}
	public WebElement getPronounDropDown() {
		return pronounDropDown;
	}
	public WebElement getGenderField() {
		return genderField;
	}
	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
}
