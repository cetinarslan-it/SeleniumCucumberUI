package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

//DONE*****************************

public class companyStructure extends LoginPage {

    @When("the user writes {string} in the search box and hits the enter")
    public void the_user_writes_in_the_search_box_and_hits_the_enter(String string) throws InterruptedException {
        WebElement searchBox=Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.sendKeys("Company Structure");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);

    }

    @Then("user should be able to display the company structure")
    public void userShouldBeAbleToDisplayTheCompanyStructure() {

        String actualurl= Driver.get().getCurrentUrl();
        String expectedurl="https://qa.agileprocrm.com/company/vis_structure.php";
        Assert.assertEquals(actualurl,expectedurl);

    }
}
