package com.swagLabs.pages;

import com.beust.ah.A;
import com.swagLabs.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart extends BasePage {

    public AddToCart(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public AddToCart clickAddItem1() {
        getWebElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return this;
    }

    public AddToCart clickItem2() {
        getWebElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        return this;
    }
    public AddToCart goNavigate(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return this;
    }
    public Navigate goNavigate1(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return getInstance(Navigate.class);
    }
}
