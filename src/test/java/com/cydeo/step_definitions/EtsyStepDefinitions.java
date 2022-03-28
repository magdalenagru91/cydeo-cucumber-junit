package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EtsyStepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("user is on the main Etsy page")
    public void user_is_on_the_main_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com/");
    }

    @Then("user sees title of Etsy main page")
    public void user_sees_title_of_etsy_main_page() {
        BrowserUtils.verifyTitle("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();
    }

    @Then("user sees Wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitle("Wooden spoon");
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsySearchPage.searchBox.sendKeys(string);
    }

    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        BrowserUtils.verifyTitle(string);
    }
}
