package com.fast.steps.serenity;

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
    public void clickOnReviewsButton(){
        cartPage.clickOnReviewsButton();

    }

    @Step
    public void typeIntoReviewsField(){
        cartPage.typeIntoReviewsField("Excelent");
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
      Assert.assertTrue(cartPage.checkReviewText("Excelent"));
    }
    @StepGroup
    public void checkProductReviews(){
        clickOnReviewsButton();
        typeIntoReviewsField();
        clickOnOneStarReview();
        clickOnSubmitButton();
        checkReviewText();
    }
}


