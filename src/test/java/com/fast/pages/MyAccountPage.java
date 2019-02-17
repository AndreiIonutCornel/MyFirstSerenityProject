package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {


    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade welcomeMessageStrong;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade registerErrorMessage;



    public boolean checkLoggedIn() {
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("spyroboss");
    }

    public boolean checkRegister(){
        waitFor(registerErrorMessage);
        return registerErrorMessage.containsText("Error: An account is already registered with your email address. Please log in.");
    }
    public boolean checkRegisterWithInvalid(){
        waitFor(registerErrorMessage);
        return registerErrorMessage.containsText("Error: Error: Couldn’t register you… please contact us if you continue to have problems.");
    }
}
