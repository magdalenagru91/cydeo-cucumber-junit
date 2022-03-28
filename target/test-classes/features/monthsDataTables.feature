
Feature:  User should be able to see all 12 months in months dropdown

  Scenario: User should be able see all 12 months are visible in the dropdown
    Given User in on the dropdowns page
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
