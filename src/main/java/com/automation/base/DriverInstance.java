package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static com.automation.base.ConfigUtils.getPropertyByKey;
//import static com.automation.base.ConfigUtils.loadProperties;

public class DriverInstance {
	static WebDriver driver;

	public static void initDriver() {
		//loadProperties();
		System.setProperty("webdriver.chrome.driver", "ConfigFiles/chromedriver_1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jupiter.cloud.planittesting.com/");
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
