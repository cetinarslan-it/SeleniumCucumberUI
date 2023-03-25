package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class exportEmployeeList extends LoginPage {

    @When("the user clicks on more button")
    public void the_user_clicks_on_more_button() {
        Driver.get().findElement(By.xpath("(//span[@class='filter-but-text-block'])[4]")).click();
    }

    @Then("the pop up should appear")
    public void the_pop_up_should_appear() {
       WebElement popup= Driver.get().findElement(By.xpath("(//div[@class='menu-popup'])[1]"));
       popup.isDisplayed();
    }

    @When("the user clicks on export to Excel")
    public void the_user_clicks_on_export_to_Excel() {
        Driver.get().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[1]")).click();
    }

    @Then("the Excel file should have been downloaded")
    public void the_Excel_file_should_have_been_downloaded() {

    }


}
