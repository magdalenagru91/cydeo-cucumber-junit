package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WebTableLoginStepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page on the web table app")
    public void user_is_on_the_login_page_on_the_web_table_app() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        webTableLoginPage.username.sendKeys(username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        webTableLoginPage.password.sendKeys(password);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see that url contains orders")
    public void user_should_should_see_that_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.login(username,password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
        System.out.println("credentials.get(\"username\") = " + credentials.get("username"));
        System.out.println("credentials.get(\"password\") = " + credentials.get("password"));

        //webTableLoginPage.username.sendKeys(credentials.get("username"));
        //webTableLoginPage.password.sendKeys(credentials.get("password"));
        //webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
    }


}
