package org.singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.pageObjectModel.AlreadyHaveAccountModule;
import org.pageObjectModel.CreateNewAccountModule;
import org.pageObjectModel.DayModule;
import org.pageObjectModel.ForgotPasswordModule;
import org.pageObjectModel.GenderModule;
import org.pageObjectModel.LogInModule;

public class PageObjectManager {
	public WebDriver driver;

	private  LogInModule lm ;
	private  ForgotPasswordModule fpm ; 
	private  CreateNewAccountModule cm ;
	private  DayModule dm ;
	private  GenderModule gm ;
	private  AlreadyHaveAccountModule am;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public LogInModule getInstanceLm() {
		return lm = new LogInModule(driver);
	}
	public ForgotPasswordModule getInstanceFpm() {
		return fpm = new ForgotPasswordModule(driver);
	}
	public CreateNewAccountModule getInstanceCm() {
		return cm = new CreateNewAccountModule(driver);
	}
	public DayModule getInstanceDm() {
		return dm = new DayModule(driver);
	}
	public GenderModule getInstanceGm() {
		return gm = new GenderModule(driver);
	}
	public AlreadyHaveAccountModule getInstanceAm() {
		return am = new AlreadyHaveAccountModule(driver);
	}
}
