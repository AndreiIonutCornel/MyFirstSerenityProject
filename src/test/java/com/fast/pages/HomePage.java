package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = "a.skip-account .label")
    private WebElementFacade myAccountButton;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade logInLink;

    public void clickMyAccountButton(){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(myAccountButton);
        clickOn(myAccountButton);
    }

    public void clickLoginLink(){
        clickOn(logInLink);
    }

}
