package com.swagLabs.pages;

import com.swagLabs.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigate extends BasePage {
    public Navigate(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public AddToCart goNavigate(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return getInstance(AddToCart.class);
    }
    public Navigate goNavigate1(){
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        return this;
    }

}
