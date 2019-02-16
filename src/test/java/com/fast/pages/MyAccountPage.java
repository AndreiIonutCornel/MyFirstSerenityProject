package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {


    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeMessageStrong;


    public boolean checkLoggedIn(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello spyroboss!");
    }
}
