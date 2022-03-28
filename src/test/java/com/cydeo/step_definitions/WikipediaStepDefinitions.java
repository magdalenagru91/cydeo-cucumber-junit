package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaStepDefinitions {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchedKeyword) {
        wikipediaPage.searchBox.sendKeys(searchedKeyword);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPage.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String searchedKeyword) {
        String expectedTitle = searchedKeyword + " - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String searchedKeyword) {
        String expectedMainHeader = searchedKeyword;
        String actualMainHeader = wikipediaPage.mainHeader.getText();

        Assert.assertEquals(expectedMainHeader,actualMainHeader);
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String searchedKeyword) {
        String expectedImageHeader = searchedKeyword;
        String actualImageHeader = wikipediaPage.imageHeader.getText();

        Assert.assertEquals(expectedImageHeader,actualImageHeader);
    }
}
