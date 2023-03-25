package com.agilecrm.step_definitions;

import com.agilecrm.pages.LoginPage;
import com.agilecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sendMessage extends LoginPage {
    @When("the user clicks on send message, message box should be enabled")
    public void the_user_clicks_on_send_message_message_box_should_be_enabled()  {

        Driver.get().findElement(By.xpath("//*[@id=\"microoPostFormLHE_blogPostForm_inner\"]/span[1]")).click();

    }

    @Then("user writes something in the box")
    public void user_writes_something_in_the_box() {
        WebElement messageFrame = Driver.get().findElement(By.cssSelector(".bx-editor-iframe"));
        Driver.get().switchTo().frame(messageFrame);
        Driver.get().findElement(By.xpath("//body")).sendKeys("Test");

    }

    @Then("the user clicks on send")
    public void the_user_clicks_on_send() throws InterruptedException {
        Driver.get().findElement(By.xpath("/html/body")).click();
        Thread.sleep(10000);

    }

    @Then("the user should be able to display the message on the home page")
    public void the_user_should_be_able_to_display_the_message_on_the_home_page() {

    }

}
