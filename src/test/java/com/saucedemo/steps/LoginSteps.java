package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }



    @And("^I enter password\"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


//    @And("^I should login successfully$")
//    public void iShouldLoginSuccessfully() {
//    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new LoginPage().enterUsername(username);
    }


    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedText)  {
        String actualMessage = new ProductPage().getProductText();
        Assert.assertEquals(expectedText,actualMessage);

    }
}
