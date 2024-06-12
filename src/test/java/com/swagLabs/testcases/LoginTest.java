package com.swagLabs.testcases;

import com.swagLabs.pages.LoginPage;
import com.swagLabs.pages.OverviewPage;
import com.swagLabs.util.SwagLabs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void checkLoginPageTitle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), SwagLabs.LOGIN_TITLE);
    }

    @Test
    public void loginShouldSucceed() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), SwagLabs.LOGIN_TITLE);

        loginPage = loginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }




}
