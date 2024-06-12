package com.swagLabs.pages;

import com.swagLabs.pages.base.BasePage;
import com.swagLabs.testcases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
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
        //return this;
        //return getInstance(CheckoutPage.class);

        //return getInstance(AddToCart.class);
    }

}
