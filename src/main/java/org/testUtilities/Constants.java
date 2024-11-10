package org.testUtilities;

public class Constants {

	public static String getBrowser() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("browser");
	}
	public static String getUrl() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("url");
	}
	public static String getEMail() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("eMail");
	}
	public static String getPassword() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("password");
	}
	public static String getEMail1() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("eMail1");
	}
	public static String getPassword1() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("password1");
	}
	public static String getEMail2() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("eMail2");
	}
	public static String getFirstName() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("firstName");
	}
	public static String getLastName() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("lastName");
	}
	public static String getDay() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("day");
	}
	public static String getMonth() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("month");
	}
	public static String getYear() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("year");
	}
	public static String getPronounDropDown() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("pronounDropDown");
	}
	public static String getGenderField() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("genderField");
	}
	public static String getMobileNumber() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("mobileNumber");
	}
	public static String getNewPassword() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("newPassword");
	}
	public static String getEMail3() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("eMail3");
	}
	public static String getPassword2() {
		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\main\\java\\org\\testUtilities\\Facebook.properties"); 
		return reader.getProperty("password2");
	}
}
