package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.ConfigurationReader;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class loginStepDefs {

    LoginPage login=new LoginPage();

    @Given("User enters {string} information")
    public void user_enters_information(String userType) {
        login.login(ConfigurationReader.get(userType));
    }

    @Then("User should login")
    public void user_should_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.agileprocrm.com/stream/?login=yes";

        Assert.assertEquals("Verify the URL",expectedUrl,actualUrl);
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password)  {

        login.loginNegative(username, password);
    }

    @Then("User should not login")
    public void user_should_not_login() {

        Assert.assertTrue(login.errorText.isDisplayed());

    }

}
