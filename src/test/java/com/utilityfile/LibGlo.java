package com.utilityfile;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlo {
	public static WebDriver driver;
	public static final String USERNAME = "mohamadidris1";
	public static final String AUTOMATE_KEY = "ocHy4wAdYKzcqqruyzhk";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static DesiredCapabilities caps;
	
	
	public  void launchBrowser(String data) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(data);
	max();
	hang();

	}
	
	
	public void browserStack(String data) throws MalformedURLException {
		caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "74");
		caps.setCapability("name", "vigneshwaranr2's First Test");
		
		driver = new RemoteWebDriver(new java.net.URL(URL), caps);		
		driver.get(data);
		max();
		hang();
	}
	

	public void max() {
		driver.manage().window().maximize();
	}

	public void hang() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterKeys(WebElement ele, String s) {
		ele.sendKeys(s);
	}

	public String attri(WebElement ele) {
		return ele.getAttribute("value");
	}

	public void btnclick(WebElement ele) {
		ele.click();
	}

	public String urlCheck() {
		return driver.getCurrentUrl();
	}
	
	public static void selecVisible(WebElement ele, String selValue) {
		new Select(ele).selectByVisibleText(selValue);
	}
	
	public static void selecVal(WebElement ele, String selVal) {
		new Select(ele).selectByValue(selVal);
	}
	
	public void waiting(WebElement ele) {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ele));
	}

}
