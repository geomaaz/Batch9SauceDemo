package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#user-name")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginBtn;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}
