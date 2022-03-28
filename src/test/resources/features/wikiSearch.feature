@wiki
Feature: Wikipedia Search Functionality and verifications


  Scenario: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Bill Gates" in the wiki search box
    And user clicks wiki search button
    Then user sees "Bill Gates" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

@scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Anthony Hopkins   | Anthony Hopkins   | Anthony Hopkins    |
      | Marie Curie       | Marie Curie       | Marie Curie        |
      | Kate Winslet      | Kate Winslet      | Kate Winslet       |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |