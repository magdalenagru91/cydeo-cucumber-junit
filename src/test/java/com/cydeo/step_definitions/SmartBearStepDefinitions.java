package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefinitions {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return\n" +
                "Url=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx ");

        smartBearPage.userNameInput.sendKeys("Tester");
        smartBearPage.passwordIput.sendKeys("test");
        smartBearPage.loginButton.click();

        smartBearPage.orderModule.click();

    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBearPage.productDropdown);
        if (string.equalsIgnoreCase("MyMoney")){
            select.selectByIndex(0);
        } else if (string.equalsIgnoreCase("FamilyAlbum")){
            select.selectByIndex(1);
        } else if (string.equalsIgnoreCase("ScreenSaver")){
            select.selectByIndex(2);
        }
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantityInput.sendKeys(Keys.BACK_SPACE);
        smartBearPage.quantityInput.sendKeys(string);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerName.sendKeys(string);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.street.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.city.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.state.sendKeys(string);
    }
    @When("User enters zip {string}")
    public void user_enters(String  string) {
        smartBearPage.zip.sendKeys(string);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
       if (string.equalsIgnoreCase("visa")){
           smartBearPage.visaCard.click();
       } else if (string.equalsIgnoreCase("mastercard")){
           smartBearPage.masterCard.click();
       } else if (string.equalsIgnoreCase("american express")){
           smartBearPage.americanExpressCard.click();
        }
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expireDate.sendKeys(string);
        BrowserUtils.sleep(5);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();
    }
    @When("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        smartBearPage.viewAllOrders.click();
        String actualName = smartBearPage.nameOnTheListVerification.getText();
        Assert.assertEquals(string,actualName);
    }

}
