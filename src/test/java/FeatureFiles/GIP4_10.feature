Feature:Grade Levels

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @Hankulu
  Scenario: Create Grade Levels
    And Click on the element in the left Nav
      |setupOne   |
      |parameters |
      |gradeLevels|

    And Click on the element in the Dialog
      |addButton|

    And User sending the keys in Dialog
      |nameInput|yalan|
      |shortNameInput|yaldız|
      |order         |  3  |

    And  Click on the element in the Dialog
      | saveButton |

    And Success message should be display

  @Hankulu
  Scenario: Edit Grade Levels
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |gradeLevels|


    And  Click on the element in the Dialog
      |gradeEdit|


    And User sending the keys in Dialog
      |nameInput|nalan|
      |shortNameInput|gül|
      |order         |  4  |

    And  Click on the element in the Dialog
      |saveButton|

    And Success message should be display

  @Hankulu
  Scenario: Delete Grade Levels
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |gradeLevels|

    And  Click on the element in the Dialog
      |gradeDelete|
      |deleteDialogBtn|

    And Success message should be display