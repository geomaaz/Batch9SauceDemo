package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(css = "#checkout")
    public WebElement checkoutBtn;

    @FindBy(css = "#first-name")
    public WebElement firstNameInput;

    @FindBy(css = "#last-name")
    public WebElement lastNameInput;

    @FindBy(css = "#postal-code")
    public WebElement postcode;

    @FindBy(name = "continue")
    public WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    public WebElement totalPrice;

    @FindBy(css = "#finish")
    public WebElement finishBtn;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement verifyMessage;

    public void enterDetails(String firstname, String lastname, String postcode){
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        this.postcode.sendKeys(postcode);
    }
}
