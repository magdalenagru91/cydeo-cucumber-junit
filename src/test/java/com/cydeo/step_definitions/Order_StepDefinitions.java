package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.Order_Page;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {


    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    Order_Page order_page = new Order_Page();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTableLoginPage.login();
        basePage.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(order_page.productDropdown);
       select.selectByVisibleText(string);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {
        order_page.inputQuantity.sendKeys(Keys.BACK_SPACE);
        //order_page.inputQuantity.sendKeys(2+"");
        order_page.inputQuantity.sendKeys(String.valueOf(quantity));
    }

    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {
        order_page.inputName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        order_page.inputStreet.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        order_page.inputCity.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        order_page.inputState.sendKeys(string);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        order_page.inputZip.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

        List<WebElement> cardTypes = order_page.cardType;

        BrowserUtils.clickRadioButton(cardTypes,string);

        /*
        for (WebElement each : cardTypes) {
            if (each.getAttribute("value").equals(string)){
                each.click();
            }
        }

        LAMBDA:
        orderPage.creditCardType.forEach(p->{p.getAttribute("value").equals(string); p.click();
        });

        //WebElement cardType = Driver.getDriver().findElement(By.xpath("//input[@value='" + string + "']"));
        //cardType.click();
        */
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        order_page.cardNumber.sendKeys(string);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        order_page.cardExp.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        order_page.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
       String actualName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedName,actualName);

    }
}
