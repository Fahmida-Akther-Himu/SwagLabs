package com.swagLabs.pages;

import com.swagLabs.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview extends BasePage {
    public Overview(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public CheckoutPage clickContinue() {
        getWebElement(By.id("first-name")).sendKeys("Fahmida");
        getWebElement(By.id("last-name")).sendKeys("Akther");
        getWebElement(By.id("postal-code")).sendKeys("1212");
        getWebElement(By.id("continue")).click();
        return getInstance(CheckoutPage.class);
    }

}
