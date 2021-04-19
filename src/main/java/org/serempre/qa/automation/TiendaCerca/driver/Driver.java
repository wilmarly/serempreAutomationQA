package org.serempre.qa.automation.TiendaCerca.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;

public class Driver {
	public static WebDriver driver;

	public Driver(){
		String downloadPath = "src/test/resources/data/";
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		HashMap<String, Object> preferences = new HashMap<String,Object>();
		preferences.put("profile.default_content_settings.popups", 0);
		//preferences.put("download.prompt_for_download", "false");
		preferences.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito","--start-maximized","--disable-infobars");
		options.setExperimentalOption("prefs",preferences);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	public static Driver web() {
		return new Driver();
	}

	public static WebDriver inThePage(String url) {
		 driver.get(url);
		 return driver;
	}

	public static WebDriver inTheStage() {
		return driver;
	}
}
