package org.sampleTestRunner;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.singletonDesignPattern.PageObjectManager;
import org.testUtilities.Constants;


public class SampleTestRunnerClass extends BaseClass{
	public static WebDriver driver = BaseClass.browserLaunch(Constants.getBrowser());
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	

	public static void main(String[] args) {
		
		
		
		implicitWait(10);
		
		getUrl(Constants.getUrl());
		
		sendTheValue(pom.getInstanceLm().getEMail(), Constants.getEMail());
		sendTheValue(pom.getInstanceLm().getPassword(), Constants.getPassword());
		
		
		
		clickOnElement(pom.getInstanceFpm().getForgotPassword());
		sendTheValue(pom.getInstanceFpm().getEMail1(), Constants.getEMail1());
		sendTheValue(pom.getInstanceFpm().getPassword1(), Constants.getPassword1());
		sendTheValue(pom.getInstanceFpm().geteMail2(), Constants.getEMail2());
		clickOnElement(pom.getInstanceFpm().getFacebookClick());
		
		
		
		clickOnElement(pom.getInstanceCm().getCreateNewAccountClick());
		handleTheMultipleWindow(1);
		sendTheValue(pom.getInstanceCm().getFirstName(), Constants.getFirstName());
		sendTheValue(pom.getInstanceCm().getLastName(), Constants.getLastName());
		
		
		
		
		selectTheDropDownUsingValue(pom.getInstanceDm().getDay(), Constants.getDay());
		selectTheDropDownUsingValue(pom.getInstanceDm().getMonth(), Constants.getMonth());
		selectTheDropDownUsingValue(pom.getInstanceDm().getYear(), Constants.getYear());
		
		
		
		clickOnElement(pom.getInstanceGm().getGenderClick());
		selectTheDropDownUsingValue(pom.getInstanceGm().getPronounDropDown(), Constants.getPronounDropDown());
		sendTheValue(pom.getInstanceGm().getGenderField(), Constants.getGenderField());
		sendTheValue(pom.getInstanceGm().getMobileNumber(), Constants.getMobileNumber());
		sendTheValue(pom.getInstanceGm().getNewPassword(), Constants.getNewPassword());
		
		
		
		
		clickOnElement(pom.getInstanceAm().getAlreadyHaveAccountClick());
		sendTheValue(pom.getInstanceAm().getEMail3(), Constants.getEMail3());
		sendTheValue(pom.getInstanceAm().getPassword2(), Constants.getPassword2());
		clickOnElement(pom.getInstanceAm().getSignUpClick());
		driverClose();
		handleTheMultipleWindow(0);
		driverClose();
		
	}
}
