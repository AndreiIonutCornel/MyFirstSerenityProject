package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy(css = "#customer_login #username")
    private WebElementFacade emailField;

    @FindBy(css = "#customer_login #password")
    private WebElementFacade passwordField;

    @FindBy(css = "div  p:nth-child(3) button[value= 'Login']")
    private WebElementFacade loginButton;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade loginErrorMessage;


    public void loghinWithTrueCredentials(String email, String password) {
        typeInto(emailField, email);
        typeInto(passwordField, password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void loginWithFalseCredentials(String email, String password){
        typeInto(emailField, "blabla@gmail.com");
        typeInto(passwordField, "12345678");
    }
    public boolean checkLoginFailure(String error){
        waitFor (loginErrorMessage);
        return loginErrorMessage.containsText(error);
    }

}

