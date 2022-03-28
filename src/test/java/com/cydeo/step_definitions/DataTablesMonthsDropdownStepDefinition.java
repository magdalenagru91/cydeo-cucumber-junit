package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoDataTablesDropdownMonthsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTablesMonthsDropdownStepDefinition {

    CydeoDataTablesDropdownMonthsPage cydeoDataTablesDropdownMonthsPage = new CydeoDataTablesDropdownMonthsPage();

    @Given("User in on the dropdowns page")
    public void user_in_on_the_dropdowns_page() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }


    @Then("User should see below info in month dropdown")
    public void user_should_see_months_in_month_dropdown(List<String> expectedMonths) {

        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(cydeoDataTablesDropdownMonthsPage.monthDropdown);

        Assert.assertEquals(expectedMonths, actualMonths);

        /*
        System.out.println("expectedMonths = " + expectedMonths);

        Select select = new Select(cydeoDataTablesDropdownMonthsPage.monthDropdown);
        List<WebElement> dropdownMonths = select.getOptions();

        List<String> actualMonthsAsString = new ArrayList<>();

        for (WebElement eachMonth : dropdownMonths) {
            actualMonthsAsString.add(eachMonth.getText());
        }

        Assert.assertEquals(expectedMonths,actualMonthsAsString);
        }

         */
    }



    }

