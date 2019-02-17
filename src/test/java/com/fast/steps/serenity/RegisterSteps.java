package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToLogin(){
        homePage.clickMyAccountButton();



    }
    @Step
    public void registerWithValidCredentials(){
        loginPage.registerWithValidCredentials("lala@gmail.com","Mamaaremere#" );
    }

    @Step
    public void clickOnRegisterButton(){
        loginPage.clickOnRegisterButton();
    }

    @Step
    public void checkRegister(){
        Assert.assertTrue(myAccountPage.checkRegister());
    }

    @StepGroup
    public void validRegister(){
        navigateToHomepage();
        goToLogin();
        registerWithValidCredentials();
        clickOnRegisterButton();
        checkRegister();
    }

}
