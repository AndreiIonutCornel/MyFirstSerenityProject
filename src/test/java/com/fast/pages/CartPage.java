package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css = "#primary > div.woocommerce-tabs.wc-tabs-wrapper.clear > ul > li.reviews_tab > a")
    private WebElementFacade reviewsButton;

    @FindBy(id = "comment")
    private WebElementFacade reviewsCommentField;

    @FindBy(css = "#commentform > div > p > span > a.star-1")
    private WebElementFacade oneStarReview;

    @FindBy(id = "submit")
    private WebElementFacade submmitButton;

    @FindBy(css = "#comment-228 > div > div.description > p")
    private WebElementFacade reviewText;



    public void clickOnReviewsButton() {
        clickOn(reviewsButton);
    }

    public void typeIntoReviewsField(String text) {
        typeInto(reviewsCommentField, text);
    }

    public void clickOnOneStarReview() {
        clickOn(oneStarReview);
    }

    public void clickOnSubmitButton() {
        clickOn(submmitButton);
    }

    public boolean checkReviewText(String text) {
        waitFor(reviewText);
        return reviewText.containsText(text);


    }
}
