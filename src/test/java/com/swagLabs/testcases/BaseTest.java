package com.swagLabs.testcases;

import com.swagLabs.pages.base.BasePage;
import com.swagLabs.pages.base.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    private Properties properties;

    Page page;

    public BaseTest() {
        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
        properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @BeforeMethod
    public void browserSetup() {
        String browserName = properties.getProperty("browserName");

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (Objects.equals(browserName, "chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("headless")) { //headless means backend theke browser open kore sob kaj korbe/UI dekhbo na which is not visible
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase("chromeHeadless")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Please provide proper browserName");
        }
        driver.get(properties.getProperty("baseUrl"));
        driver.manage().window().maximize();

        page = new BasePage(driver);

    }

    @AfterMethod
    public void browserQuit() {
        driver.quit();

    }

    public String getUsername() {
        return properties.getProperty("Username");
    }

    public String getPassword() {
        return properties.getProperty("Password");
    }
}
