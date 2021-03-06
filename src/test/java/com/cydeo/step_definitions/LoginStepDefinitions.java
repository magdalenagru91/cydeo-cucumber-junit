package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username");
    }
    @And("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("User enters admin username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("User enters admin password");
    }

    @Given("user in on the library page")
    public void userInOnTheLibraryPage() {
        System.out.println("User is on the library login page");
    }
}
