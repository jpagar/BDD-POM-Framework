package com.qaclickacademy.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qaclickacademy.config.TestUtils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\CucumberPractice\\src\\main\\java\\com\\qaclickacademy\\config\\data.properties");
			
			prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
			driver = new ChromeDriver();
		}else if (browserName.equals("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOADOUT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
