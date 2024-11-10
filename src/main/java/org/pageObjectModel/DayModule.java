package org.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DayModule {

	public static WebDriver driver;
	
	@FindBy(xpath = "//select[starts-with(@id,'day')]")
	private WebElement day;
	
	@FindBy(xpath = "//select[starts-with(@id,'month')]")
	private WebElement month;
	
	@FindBy(xpath = "//select[starts-with(@id,'year')]")
	private WebElement year;
	
	public DayModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
}
