package com.swagLabs.testcases;

import com.swagLabs.pages.AddToCart;
import com.swagLabs.pages.LoginPage;
import com.swagLabs.pages.OverviewPage;
import com.swagLabs.util.SwagLabs;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

import static org.openqa.selenium.devtools.v119.page.Page.navigate;

public class AddToCartTest extends BaseTest{
    @Test

    public void loginShouldSucceed() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), SwagLabs.LOGIN_TITLE);

        loginPage = loginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();

        AddToCart addToCart = (AddToCart) overviewPage
                .clickAddItem1();
        AddToCart addToCart1 = (AddToCart) overviewPage
                .clickItem2();
        driver.navigate().to("https://www.saucedemo.com/cart.html");


        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
}
