package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(id="user-name")
    WebElement usernameField;

   //By usernameField = By.id("user-name");

    @CacheLookup
    @FindBy(name="password")
    WebElement passwordField;

    //By passwordField = By.name("password");

    @CacheLookup
    @FindBy(id="login-button")
            WebElement loginLink;

  //  By loginLink = By.id("login-button");


    public void enterUsername(String username)
    {
        sendTextToElement(usernameField,username);
        log.info("Enter username " + username);
    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
        log.info("Enter password " + password);

    }

    public void clickOnLoginButton()

    {
        clickOnElement(loginLink);
        log.info("Click on login button " + loginLink.toString());

    }



}
