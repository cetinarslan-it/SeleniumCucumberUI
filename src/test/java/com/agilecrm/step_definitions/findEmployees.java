package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.ConfigurationReader;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class findEmployees extends LoginPage {

    //DONE************************

    @Given("The user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get(userType));
    }

        @When("user writes find employee in searchbox and hits the enter")
    public void user_writes_in_searchbox_and_hits_the_enter() throws InterruptedException {
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.click();
        searchBox.sendKeys("find employee");
        Thread.sleep(3000);

        searchBox.sendKeys(Keys.ENTER);

    }

    @Then("the user should be navigated to the find employee page")
    public void the_user_should_be_navigated_to_the_company_employees_page() {
        String actualurl = Driver.get().getCurrentUrl();
        String expectedurl = "https://qa.agileprocrm.com/company/index.php";
        Assert.assertEquals(expectedurl,actualurl);

    }

    @When("the user write Arben to the search box on the page and hits the enter")
    public void the_user_write_to_the_search_box_on_the_page_and_hits_the_enter() {
        WebElement writeEmployeeName = Driver.get().findElement(By.id("user-fio"));
        writeEmployeeName.sendKeys("Arben");
        writeEmployeeName.sendKeys(Keys.ENTER);
        WebElement arben = Driver.get().findElement(By.xpath("//a[@class='employee-name-link']"));
        arben.click();
    }

    @Then("the user should be able to display Arbens page")
    public void the_user_should_be_able_to_display() {
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL = "https://qa.agileprocrm.com/company/personal/user/479/";
        Assert.assertEquals(expectedURL,actualURL);

    }



}
