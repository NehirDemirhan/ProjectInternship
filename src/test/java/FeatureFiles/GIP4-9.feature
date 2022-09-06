Feature: Bank Accounts Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario: Add bank account

    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |
    And Click on the element in the Dialog content
      | addButton |
    And User sending the keys in Dialog content
      | nameInput       | Group461                    |
      | ibanText        | TR14 6100 6119 6700 6100 61 |
      | integrationCode | 61                          |
    And Click on the element in the Dialog content
      | currency    |
      | currencyUSD |
      | saveButton  |
    Then Success message should be displayed

  Scenario: Edit bank accounts

    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |
    And User sending the keys in Dialog content
      | searchInput | Group461 |
    And Click on the element in the Dialog content
      | searchButton |
      | editButton   |
      | currency     |
      | currencyTRY  |
      | saveButton   |

    Then Success message should be displayed

  Scenario: Delete bank account
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |
    And User delete item from Dialog
      | Group461 |
    Then Success message should be displayed

