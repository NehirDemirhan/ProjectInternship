Feature: School department Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @Yesim
  Scenario: Add school department

    And Click on the element in the left Nav
      | setupOne     |
      | schoolSetup1   |
      | departments |
    And Click on the element in the Dialog content
      | addButton |
    And User sending the keys in Dialog content
      | depName       | Math101                    |
      | depCode        | 101 |
    And Click on the element in the Dialog content
      | saveButton |
    Then Success message should be displayed

  @Yesim
  Scenario: Edit school department

    And Click on the element in the left Nav
      | setupOne     |
      | schoolSetup1   |
      | departments |

    And Click on the element in the Dialog content
      | editButtonb |
    And User sending the keys in Dialog content
      | depName       | Math105                    |
      | depCode        | 105 |
    And Click on the element in the Dialog content
      | saveButton |
    Then Success message should be displayed

  @Yesim
  Scenario: Delete school department
    And Click on the element in the left Nav
      | setupOne     |
      | schoolSetup1   |
      | departments  |
    And Click on the element in the Dialog content
      | deleteButton  |
      | deleteDialogBtn |
    Then Success message should be displayed
