package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class ShopSteps extends ScenarioSteps {


    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ShopPage shopPage;
    CartPage cartPage;

    @Step
    public void openShopPage(){
        homePage.clickShopPage();
    }

    @Step
    public void openProductAlbumPage(){
        shopPage.clickOnAlbumProduct();
    }

    @StepGroup
    public void selectAlbumElement (){
        openShopPage();
        openProductAlbumPage();
    }

}
