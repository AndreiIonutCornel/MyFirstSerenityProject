package com.fast.steps.serenity;

import com.fast.Utils.Constants;
import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToLogin() {
        homePage.clickMyAccountButton();

    }

    @Step
    public void loghinWithTrueCredentials() {
        loginPage.loghinWithTrueCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
    }
    @Step
    public void loginWithFalseCredentials(){
        loginPage.loginWithFalseCredentials("blabla@gmail.com", "12345678");
    }

    @Step
    public void checkLoginFailure() {
            loginPage.checkLoginFailure ("ERROR: Invalid email address. Lost your password?");
    }


    @Step
    public void clickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn() {
        Assert.assertTrue(myAccountPage.checkLoggedIn());
    }

    @StepGroup
    public void login() {
        navigateToHomepage();
        goToLogin();
        loghinWithTrueCredentials();
        clickOnLoginButton();
        checkLoggedIn();
    }
    @StepGroup
    public void invalidLogin(){
        navigateToHomepage();
        goToLogin();
        loginWithFalseCredentials();
        clickOnLoginButton();
        checkLoginFailure();
    }
}
