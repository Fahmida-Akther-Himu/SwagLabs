package com.swagLabs.pages;

import com.swagLabs.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public LoginPage fillUsername(String Username) {
        getWebElement(By.id("user-name")).sendKeys(Username);
        return this;
    }

    public LoginPage fillPassword(String Password) {
        getWebElement(By.id("password")).sendKeys(Password);
        return this;
    }

    public BasePage clickLoginBtn() {
        getWebElement(By.cssSelector("input[value='Login']")).click();
        return getInstance(OverviewPage.class);


    }


}
