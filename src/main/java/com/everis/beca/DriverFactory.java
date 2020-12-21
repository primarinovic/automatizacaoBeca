package com.everis.beca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public void iniciarDriver(){
    	System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver _Driver(){
        return driver;
    }
	
}
