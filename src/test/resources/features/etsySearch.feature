@etsy
Feature: Etsy Search Functionality and Verification

  Scenario: Etsy Title Verification
    Given user is on the main Etsy page
    Then user sees title of Etsy main page


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user is on the main Etsy page
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden spoon is in the title


  Scenario Outline: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on the main Etsy page
    When user types "<searchValue>" in the search box
    And user clicks search button
    Then user sees "<expectedTitle>" is in the title

    Examples: search values we are going to be using in this scenario as below:
    |searchValue|expectedTitle|
    |candle     |Candle       |
    |gift       |Gift         |
    |tshirt     |Tshirt       |
