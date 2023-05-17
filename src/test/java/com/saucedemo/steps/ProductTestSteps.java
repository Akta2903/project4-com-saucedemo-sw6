package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductTestSteps {
    @When("^I enter username\"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);
    }



    @And("^I enter Password\"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }


    @Then("^Verify products per Page \"([^\"]*)\"$")
    public void verifyProductsPerPage(String expectedPText)  {
        Assert.assertEquals(expectedPText,new ProductPage().getProductPerPage());
    }
}
