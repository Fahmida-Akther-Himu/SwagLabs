package com.swagLabs.pages;

import com.swagLabs.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        getWebElement(By.id("react-burger-menu-btn")).click();
        return getWebElements(By.linkText("Logout")).size() > 0;
    }

    public AddToCart clickAddItem1() {
        getWebElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        return getInstance(AddToCart.class);
    }

    public AddToCart clickItem2() {
        getWebElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        return getInstance(AddToCart.class);
    }
    public AddToCart goNavigate(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return getInstance(AddToCart.class);
    }
    public Navigate goNavigate1(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return getInstance(Navigate.class);
    }

}
