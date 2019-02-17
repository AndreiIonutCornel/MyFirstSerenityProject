package com.fast.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy (css ="#primary > ul > li.item-prod-wrap.wow.flipInY.post-27.product.type-product.status-publish.has-post-thumbnail.product_cat-music.first.instock.downloadable.virtual.taxable.purchasable.product-type-simple > div.collection_combine.item-img > a > img")
    private WebElementFacade albumProduct;

    public void clickOnAlbumProduct(){
        clickOn(albumProduct);
    }

}
