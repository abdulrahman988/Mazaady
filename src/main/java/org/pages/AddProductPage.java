package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
    protected WebDriver driver;

    @FindBy(xpath = "//a[@class='btn add-product-call-to-action']")
    private WebElement addProductButton;

    @FindBy(xpath = "//label[@for='opt-single_product']")
    private WebElement auctionType;


    @FindBy(xpath = "//button[@class='btn btn-buy continue']")
    private WebElement step1Button;


    @FindBy(xpath = "//label[@for='opt-94']")
    private WebElement auctionTypeStep2;

    @FindBy(xpath = "//input[@placeholder='Auction Name']")
    private WebElement auctionNameInput;

    public AddProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddProductButton() {
        addProductButton.click();
    }

    public void clickAuctionTypeRadioButton() {
        auctionType.click();
    }
    public void clickStep1Button() {
        step1Button.click();
    }

    public void clickAuctionTypeStep2RadioButton() {
        auctionTypeStep2.click();
    }

    public void enterAuctionName(String auctionName) {
        auctionNameInput.sendKeys(auctionName);
    }


}
