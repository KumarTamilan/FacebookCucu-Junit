package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountModule {
	public static WebDriver driver;

	@FindBy(xpath = "//span[text()='Create new account']")
	private WebElement createNewAccountClick;
	
	@FindBy(xpath = "//input[starts-with(@name,'firstname')]")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[starts-with(@name,'lastname')]")
	private WebElement lastName;
	
	
	public CreateNewAccountModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewAccountClick() {
		return createNewAccountClick;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
}
