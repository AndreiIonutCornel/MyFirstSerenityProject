package com.fast.steps.serenity;

import com.fast.Utils.Constants;
import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {


    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ShopPage shopPage;
    CartPage cartPage;

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
    public void clickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void openShopPage(){
        homePage.clickShopPage();
    }

    @Step
    public void openProductAlbumPage(){
        shopPage.clickOnAlbumProduct();
    }

    @Step
    public void clickOnReviewsButton(){
        cartPage.clickOnReviewsButton();

    }

    @Step
    public void typeIntoReviewsField(){
        cartPage.typeIntoReviewsField("Foarte Misto este");
    }

    @Step
    public void clickOnOneStarReview(){
        cartPage.clickOnOneStarReview();
    }
    @Step
    public void clickOnSubmitButton(){
        cartPage.clickOnSubmitButton();
    }
    @Step
    public void checkReviewText(){
      Assert.assertTrue(cartPage.containsText("Foarte Misto este"));
    }
    @StepGroup
    public void checkProductReviews(){
        navigateToHomepage();
        goToLogin();
        loghinWithTrueCredentials();
        clickOnLoginButton();
        openShopPage();
        openProductAlbumPage();
        clickOnReviewsButton();
        typeIntoReviewsField();
        clickOnOneStarReview();
        clickOnSubmitButton();
        checkReviewText();
    }
}


