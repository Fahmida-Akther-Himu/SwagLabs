package com.swagLabs.testcases;

import com.swagLabs.pages.*;
import com.swagLabs.util.SwagLabs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OverviewTest extends BaseTest{
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
        //Overview overview = (Overview) CheckoutPage
//.clickContinue;


        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
}
