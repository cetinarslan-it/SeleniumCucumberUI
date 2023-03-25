package com.agilecrm.pages;

import com.agilecrm.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(className = "errortext")
    public WebElement errorText;

    public void loginAsHR(){
        usernameBox.sendKeys(ConfigurationReader.get("hr_username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void loginAsHelpDesk(){
        usernameBox.sendKeys(ConfigurationReader.get("helpdesk_username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void loginAsMarketing(){
        usernameBox.sendKeys(ConfigurationReader.get("marketing_username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void loginNegative(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void login(String username){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }
}
