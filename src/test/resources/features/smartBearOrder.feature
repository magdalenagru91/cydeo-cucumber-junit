@smartBear
Feature: SmartBear order process

  Scenario Outline: User fills out the SmartBear order process form as tester
    Given User is logged into SmartBear Tester account and on Order page
    When User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters zip "<zip>"
    And User selects "<cardType>" as card type
    And User enters "<cardNumber>" to card number
    And User enters "<expDate>" to expiration date
    And User clicks process button
    And User verifies "<expectedName>" is in the list

  Examples:
    | product     | quantity | customer name | street    | city     | state | zip   | cardType         | cardNumber   | expDate | expectedName  |
    | MyMoney     | 1        | Ken Adams     | Kinzie st | Chicago  | IL    | 60004 | Visa             | 313313133315 | 12/22   | Ken Adams     |
    | FamilyAlbum | 4        | Magda Gruszka | Linlew Dr | Derry    | NH    | 03038 | MasterCard       | 111113133315 | 10/22   | Magda Gruszka |
    | ScreenSaver | 5        | John Smith    | Red st    | Bluffton | SC    | 41233 | American Express | 555313133315 | 09/22    | John Smith    |
    | MyMoney     | 10       | Sophie Lex    | Brown st  | Boston   | MA    | 54622 | Visa             | 667313133315 | 03/22    | Sophie Lex    |



