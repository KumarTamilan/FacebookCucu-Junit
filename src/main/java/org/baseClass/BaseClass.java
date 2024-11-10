package org.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void getThePageTitle() {
		driver.getTitle();
	}
	public static void getTheCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void getThePageSource() {
		driver.getPageSource();
	}

	public static void handleTheSingleWindow() {
		String windows = driver.getWindowHandle();
	}

	public static void handleTheMultipleWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList(allWindows);
		driver.switchTo().window(list.get(index));
	}

	public static void navigateToBack() {
		driver.navigate().back();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateToNextUrl(String nextUrl) {
		driver.navigate().to(nextUrl);
	}

	public static void driverClose() {
		driver.close();
	}

	public static void driverQuit() {
		driver.quit();
	}

	public static void getTheSingleText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getTheMultipleText(List<WebElement> element) {
		for (WebElement allText : element) {
			System.out.println(allText.getText());
		}
	}

	public static void getTheDomAttributeValue(WebElement element, String attributeName) {
		String attName = element.getAttribute(attributeName);
		System.out.println(attName);
	}

	public static void getTheTextFieldText(WebElement element, String value) {
		String values = element.getAttribute(value);
		System.out.println(values);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendTheValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clearTheElement(WebElement element) {
		element.clear();
	}

	public static void isDisplayedOrNot(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		System.out.println(isDisplayed);
	}

	public static void isEnabledOrNot(WebElement element) {
		boolean isEnabled = element.isEnabled();
		System.out.println(isEnabled);
	}

	public static void isSelectedOrNot(WebElement element) {
		boolean isSelected = element.isSelected();
		System.out.println(isSelected);
	}

	public static void isMultipleOrNot(WebElement element) {
		Select s = new Select(element);
		boolean isMultiple = s.isMultiple();
		System.out.println(isMultiple);
	}

	public static void selectTheDropDownUsingIndex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectTheDropDownUsingValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectTheDropDownUsingVisibleText(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	public static void selectTheDropDownUsingSelectClass(WebElement element,String type,String value) {
		Select s = new Select(element);
		if(type.equals("byIndex")) {
			int valueOf = Integer.parseInt(value);
			s.selectByIndex(valueOf);
		}else if(type.equals("byValue")) {
			s.selectByValue(value);
		}else if(type.equals("byVisibleText")) {
			s.selectByVisibleText(value);
		}
	}
	public static void selectTheDropDownUsingGetOptions(WebElement element,String value) {
		Select s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement allOption : allOptions) {
			if(allOption.getText().equals(value)) {
				allOption.click();
				break;
			}
		}
	}
	public static void bootstrapDropDown(List<WebElement> element,String value) {
		for(WebElement allOptions : element) {
			if(allOptions.getText().equals(value)) {
				allOptions.click();
				break;
				
			}
		}
	}
	public static void getTheDropDownAllOptions(List<WebElement> element) {
		for(WebElement allOptions : element) {
			System.out.println(allOptions.getText());
		}
	}
	public static void takeTheScreenshotUsingFileUtils(String filePath,String fileName) {
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filePath+"//"+fileName+System.currentTimeMillis()+".png");
		FileUtils.copyFile(source, destination);
		}catch(IOException e) {
			System.out.println("Throw the Screenshot Syntax Issue");
		}
		
	}
	public static void takeTheScreenshotUsingFileHandler(String filePath,String fileName) {
		try {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filePath+"//"+fileName+System.currentTimeMillis()+".png");
		FileHandler.copy(source, destination);
		}catch(IOException e) {
			System.out.println("Throw the Screenshot Syntax Issue");
		}
		
	}
	public static void takeTheScreenshotInParticularElement(WebElement element,String filePath,String fileName) {
		try {
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File(filePath+"//"+fileName+System.currentTimeMillis()+".png");
		FileUtils.copyFile(source, destination);
		}catch(IOException e) {
			System.out.println("Throw the Screenshot Issue");
		}
	}
	public static void handleTheSimpleAlert() {
		driver.switchTo().alert().accept();
	}
	public static void handleTheConfirmAlert() {
		driver.switchTo().alert().accept();
	}
	public static void handleThePromptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	public static void javaScriptExecutorUsingScrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void javaScriptExecutorUsingScrollDown(int xaxis,int yaxis) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+");");
	}
	public static void javaScriptExecutorUsingScrollUp(int xaxis,int yaxis) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+",-"+yaxis+")");
	}
	public static void javaScriptExecutorUsingScrollInWebpageBottom() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}
	public static void javaScriptExecutorUsingScrollInWebpageTop() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
	}
	public static void javaScriptExecutorUsingSendKey(String values,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+values+"'",element);
	}
	public static void javaScriptExecutorUsingClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void javascriptExecutorUsingRefresh() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
	}
	public static void handleTheFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static void handleTheFrameUsingId(String id) {
		driver.switchTo().frame(id);
	}
	public static void handleTheFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}
	public static void handleTheFrameUsingWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void actionsClassUsingSendKeys(WebElement element,String value) {
		Actions as = new Actions(driver);
		as.sendKeys(element,value).perform();
	}
	public static void actionsClassUsingClick(WebElement element) {
		Actions as = new Actions(driver);
		as.click(element).perform();
	}
	public static void actionsClassUsingContextClick(WebElement element) {
		Actions as = new Actions(driver);
		as.contextClick(element).perform();
	}
	public static void actionsClassUsingDoubleClick(WebElement element) {
		Actions as = new Actions(driver);
		as.doubleClick(element).perform();
	}
	public static void actionsClassUsingDragAndDrop(WebElement element1,WebElement element2) {
		Actions as = new Actions(driver);
		as.dragAndDrop(element1,element2).perform();
	}
	public static void actionsClassUsingDragAndDropBy(WebElement element,int xaxis,int yaxis) {
		Actions as = new Actions(driver);
		as.dragAndDropBy(element,xaxis,yaxis).perform();
	}
	public static void actionsClassUsingMoveToElement(WebElement element) {
		Actions as = new Actions(driver);
		as.moveToElement(element).perform();
	}
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	public static void explicitWaitForElementToBeVisibile(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void explicitWaitForElementToBeClickable(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void explicitWaitForElementToBeSelected(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public static void fluentWait() {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(25,TimeUnit.SECONDS);
		wait.pollingEvery(5,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
	}
	public static void radioButtonValidationUsingIfElse(WebElement element) {
		if(element.isDisplayed()) {
			System.out.println(element.isDisplayed());
			if(element.isEnabled()) {
				System.out.println(element.isEnabled());
				if(!element.isSelected()) {
					System.out.println(element.isSelected());
					element.click();
					if(element.isSelected()) {
						System.out.println(element.isSelected());
					}else {
						System.out.println("Element Not Selected");
					}
				}else {
					System.out.println("Element Is Selected");
				}
			}else {
				System.out.println("Element Not Enabled");
			}
		}else {
			System.out.println("Element Not Displayed");
		}
	}
	public static void radioButtonValidationUsingAssertion(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		Assert.assertTrue(isDisplayed);
		System.out.println(isDisplayed);
		
		boolean isEnabled = element.isEnabled();
		Assert.assertTrue(isEnabled);
		System.out.println(isEnabled);
		
		boolean isSelected = element.isSelected();
		Assert.assertFalse(isSelected);
		System.out.println(isSelected);
		element.click();
		
		boolean isSelected2 = element.isSelected();
		Assert.assertTrue(isSelected2);
		System.out.println(isSelected);
	}
	public static void getTheTableHeadersText(List<WebElement> element) {
		for(WebElement all : element) {
			System.out.println(all.getText());
		}
	}
	public static void getTheTableEntireColumnCount(List<WebElement> element) {
		System.out.println(element.size());
	}
	public static void getTheTableParticularData(WebElement element) {
		System.out.println(element.getText());
	}
	public static void getTheTableAllData(List<WebElement> element) {
		for(WebElement all : element) {
			System.out.println(all.getText());
		}
	}
	public static void getTheTableEntireDataCount(List<WebElement> element) {
		System.out.println(element.size());
	}
	public static void getTheTableParticularRowData(List<WebElement> element) {
		for(WebElement all : element) {
			System.out.println(all.getText());
		}
	}
	public static void getTheTableEntireRowCount(List<WebElement> element) {
		System.out.println(element.size());
	}
	public static void getTheTableParticularColumnWithIdOrName(List<WebElement> element) {
		for(WebElement all : element) {
			System.out.println(all.getText());
		}
	}
	public static void getTheTableParticularColumnWithoutIdOrName(List<WebElement> element,int index) {
		for(WebElement particulerColumn : element) {
			List<WebElement> columns = particulerColumn.findElements(By.tagName("td"));
			WebElement column = columns.get(index);
			System.out.println(column);
		}
	}



}


















