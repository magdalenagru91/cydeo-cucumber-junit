Feature: User should be able to login using correct credentials

Background: user is on the login page
  Given user is on the login page on the web table app


  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click on login button
    Then user should see that url contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see that url contains orders

    #1 - implement this new step
    #2 - create login method in WebTableLoginPage
    #3 - this method should have multiple different overloaded versions


  Scenario: User should be able to see all 12 months in months dropdown
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should see that url contains orders

