package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/")
public class MyAccountPage extends PageObject {


    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeMessageStrong;


    public boolean checkLoggedIn(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello, asdasda asdasd!");
    }
}
