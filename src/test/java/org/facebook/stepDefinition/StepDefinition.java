package org.facebook.stepDefinition;

import org.baseClass.BaseClass;
import org.singletonDesignPattern.PageObjectManager;
import org.testUtilities.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Facebook Url$")
	public void user_Launch_The_Facebook_Url() throws Throwable {
		getUrl(Constants.getUrl());
	}

	@When("^user Enter The Email In The Email Field$")
	public void user_Enter_The_Email_In_The_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceLm().getEMail(), Constants.getEMail());
	}

	@Then("^user Enter The Password In The Password Field And Naviget To Forgot Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field_And_Naviget_To_Forgot_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceLm().getPassword(), Constants.getPassword());
	}

	@When("^user Click The Forgot Password Button$")
	public void user_Click_The_Forgot_Password_Button() throws Throwable {
		clickOnElement(pom.getInstanceFpm().getForgotPassword());
	}

	@When("^user Second Time Enter The Email In Email Field$")
	public void user_Second_Time_Enter_The_Email_In_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceFpm().getEMail1(), Constants.getEMail1());
	}

	@When("^user Second Time Enter The Password In Password Field$")
	public void user_Second_Time_Enter_The_Password_In_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceFpm().getPassword1(), Constants.getPassword1());
	}

	@When("^user Third Time Enter The Email In Email Field$")
	public void user_Third_Time_Enter_The_Email_In_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceFpm().geteMail2(), Constants.getEMail2());
	}

	@Then("^user Click The Facebook Link And Navigate To Create Account Field$")
	public void user_Click_The_Facebook_Link_And_Navigate_To_Create_Account_Field() throws Throwable {
		clickOnElement(pom.getInstanceFpm().getFacebookClick());
	}

	@When("^user Click The CreateNewAccount Button Then Open The Another One New Window$")
	public void user_Click_The_CreateNewAccount_Button_Then_Open_The_Another_One_New_Window() throws Throwable {
		clickOnElement(pom.getInstanceCm().getCreateNewAccountClick());
	}

	@When("^user Handle The New Window Using List Concept$")
	public void user_Handle_The_New_Window_Using_List_Concept() throws Throwable {
		handleTheMultipleWindow(1);
	}

	@When("^user Enter The FirstName In FirstName Field$")
	public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
		sendTheValue(pom.getInstanceCm().getFirstName(), Constants.getFirstName());
	}

	@Then("^user Enter The LastName In LastName Field Then Navigate To Date Of Birth DropDown$")
	public void user_Enter_The_LastName_In_LastName_Field_Then_Navigate_To_Date_Of_Birth_DropDown() throws Throwable {
		sendTheValue(pom.getInstanceCm().getLastName(), Constants.getLastName());
	}

	@When("^user Select The Day In The Day DropDown$")
	public void user_Select_The_Day_In_The_Day_DropDown() throws Throwable {
		selectTheDropDownUsingValue(pom.getInstanceDm().getDay(), Constants.getDay());
	}

	@When("^user Select The Month In The Month DropDown$")
	public void user_Select_The_Month_In_The_Month_DropDown() throws Throwable {
		selectTheDropDownUsingValue(pom.getInstanceDm().getMonth(), Constants.getMonth());
	}

	@Then("^user Select The Year In The Year DropDown Then Navigate To Gender Field$")
	public void user_Select_The_Year_In_The_Year_DropDown_Then_Navigate_To_Gender_Field() throws Throwable {
		selectTheDropDownUsingValue(pom.getInstanceDm().getYear(), Constants.getYear());
	}

	@When("^user Click The Custom Gender$")
	public void user_Click_The_Custom_Gender() throws Throwable {
		clickOnElement(pom.getInstanceGm().getGenderClick());
	}

	@When("^user Select The Pronoun DropDown$")
	public void user_Select_The_Pronoun_DropDown() throws Throwable {
		selectTheDropDownUsingValue(pom.getInstanceGm().getPronounDropDown(), Constants.getPronounDropDown());
	}

	@When("^user Enter The Gender Details In Gender Text Field$")
	public void user_Enter_The_Gender_Details_In_Gender_Text_Field() throws Throwable {
		sendTheValue(pom.getInstanceGm().getGenderField(), Constants.getGenderField());
	}

	@When("^user Enter The Mobile Number In Mobile Number Field$")
	public void user_Enter_The_Mobile_Number_In_Mobile_Number_Field() throws Throwable {
		sendTheValue(pom.getInstanceGm().getMobileNumber(), Constants.getMobileNumber());
	}

	@Then("^user Enter The New Password In New Password Field Then Navigate To Already Have Account Field$")
	public void user_Enter_The_New_Password_In_New_Password_Field_Then_Navigate_To_Already_Have_Account_Field() throws Throwable {
		sendTheValue(pom.getInstanceGm().getNewPassword(), Constants.getNewPassword());
	}
	@When("^user Click The Already Have Account Button$")
	public void user_Click_The_Already_Have_Account_Button() throws Throwable {
		clickOnElement(pom.getInstanceAm().getAlreadyHaveAccountClick());
	}

	@When("^user Fourth Time Enter The Email In Email Field$")
	public void user_Fourth_Time_Enter_The_Email_In_Email_Field() throws Throwable {
		sendTheValue(pom.getInstanceAm().getEMail3(), Constants.getEMail3());
	}

	@When("^user Third Time Enter The Password In Password Field$")
	public void user_Third_Time_Enter_The_Password_In_Password_Field() throws Throwable {
		sendTheValue(pom.getInstanceAm().getPassword2(), Constants.getPassword2());
	}

	@When("^user Click The SignUp Button$")
	public void user_Click_The_SignUp_Button() throws Throwable {
		clickOnElement(pom.getInstanceAm().getSignUpClick());
	}

	@When("^user Close The Current Browser Window Only$")
	public void user_Close_The_Current_Browser_Window_Only() throws Throwable {
		driverClose();
	}

	@Then("^user Handle The Window And Switch To First Window$")
	public void user_Handle_The_Window_And_Switch_To_First_Window() throws Throwable {
		handleTheMultipleWindow(0);
	}


}
