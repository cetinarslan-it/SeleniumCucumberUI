package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class employeeAlphabetical extends LoginPage {

    @When("user writes employees in searchbox and hits the enter")
    public void userWritesInSearchboxAndHitsTheEnter() throws InterruptedException {
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.click();
        searchBox.sendKeys("employees");
        Thread.sleep(2000);

        searchBox.sendKeys(Keys.ENTER);

    }

    @Then("the user should be navigated to the company employees page")
    public void theUserShouldBeNavigatedToTheCompanyEmployeesPage() {
        String expectedurl ="https://qa.agileprocrm.com/company/vis_structure.php";
        String actualurl = Driver.get().getCurrentUrl();
        Assert.assertEquals(actualurl,expectedurl);

    }

    @When("user clicks on find employee")
    public void userClicksOnFindEmployee() {
        Driver.get().findElement(By.xpath("(//span[@class='main-buttons-item-text-title'])[2]")).click();

    }

    @Then("the user should be able to display the find employee page")
    public void theUserShouldBeAbleToDisplayTheFindEmployeePage() {
        String expectedurl ="https://qa.agileprocrm.com/company/index.php";
        String actualurl = Driver.get().getCurrentUrl();
        Assert.assertEquals(actualurl,expectedurl);
    }

    @When("the user clicks on Search by Alphabet")
    public void the_user_clicks_on() {
        WebElement searchAlphabet=Driver.get().findElement(By.xpath("//span[@class='filter-but-text']"));
        searchAlphabet.click();
    }

    @Then("the letter filters should appear on the page")
    public void the_letter_filters_should_appear_on_the_page() {
        Driver.get().findElement(By.xpath("//div[@class='employee-ABC-popup']")).isDisplayed();
    }

    @When("the user clicks on the letter B")
    public void the_user_clicks_on_the_letter_B() throws InterruptedException {
        Driver.get().findElement(By.xpath("(//a[@class='employee-ABC-letter'])[2]")).click();
        Thread.sleep(1500);
    }

    @Then("the user should display the Murad Boz employee")
    public void the_user_should_display_the_Murad_Boz_employee() {
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL = "https://qa.agileprocrm.com/company/?set_filter_company_search=Y&company_search_LAST_NAME=B%25&show_user=active";
        Assert.assertEquals("links are not same",expectedURL,actualURL);
    }

}
