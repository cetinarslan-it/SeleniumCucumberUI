package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class sendMessagePhoneDirectory extends LoginPage {

    //DONE**************************************************

    @When("the user writes telephone directory in the searchbox and hits enter")
    public void the_user_writes_telephone_directory_in_the_searchbox_and_hits_enter() throws InterruptedException {
        WebElement searchBox= Driver.get().findElement(By.id("search-textbox-input"));
        searchBox.sendKeys("Telephone Directory");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("the user should be navigated to the telephone directory webpage")
    public void the_user_should_be_navigated_to_the_telephone_directory_webpage() {
       String actualURL= Driver.get().getCurrentUrl();
       String expectedURL = "https://qa.agileprocrm.com/company/telephones.php";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @When("the user clicks on Arben Istrefi")
    public void the_user_clicks_on() {
        WebElement employee = Driver.get().findElement(By.xpath("(//a[starts-with(@id,'anchor_')])[1]"));
        employee.click();
    }

    @Then("the user should be navigated to the emplooyee's page")
    public void the_user_should_be_navigated_to_the_emplooyee_s_page() {
        String actualURL= Driver.get().getCurrentUrl();
        String expectedURL= "https://qa.agileprocrm.com/company/personal/user/479/";
        Assert.assertEquals(actualURL,expectedURL);
    }

    @When("the user clicks on send message")
    public void the_user_clicks_on_send_message() {
       WebElement sendMessageBtn = Driver.get().findElement(By.xpath("//span[@class='webform-small-button-text']"));
        sendMessageBtn.click();
    }

    @When("writes {string} in the message box and hits the enter")
    public void writes_in_the_message_box_and_hits_the_enter(String string) {
    WebElement messagebox= Driver.get().findElement(By.xpath("//textarea[@class='bx-messenger-textarea-input']"));
    messagebox.click();
    messagebox.sendKeys("hello");
    messagebox.sendKeys(Keys.ENTER);
    }

    @Then("the message should have been sent")
    public void the_message_should_have_been_sent() {
    Driver.get().findElement(By.xpath("//span[@class='bx-messenger-message']"));
    Driver.get().getPageSource().contains("hello");

    }


}
