package org.facebook.testRunner;

import org.baseClass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testUtilities.Constants;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\org\\facebook\\featureFile",
									 glue = "org.facebook.stepDefinition",
									 dryRun = !true,
									 snippets = SnippetType.UNDERSCORE,
									 monochrome = true,
									 strict = true,
									 tags = {"@Smoke1"},
									 plugin = {"html:Report/Html_Reports.html",
											 		"pretty",
											 		"json:Report/Json_Reports.json",
											 		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Reports.html"}
									 )
						
public class TestRunnerClass extends BaseClass{

	@BeforeClass
	public static void setUp() {
		browserLaunch(Constants.getBrowser());
		implicitWait(10);
	}
	@AfterClass
	public static void tearDown() {
		driverClose();
	}
}
