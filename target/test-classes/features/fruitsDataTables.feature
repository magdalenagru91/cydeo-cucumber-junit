Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumba     |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    #to beautify pipes above: cntrl + alt + l


