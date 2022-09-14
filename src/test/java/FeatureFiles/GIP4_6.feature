Feature:Subject Categories

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @SmokeTest
  Scenario: Create Subject Categories
    And Click on the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|

    And Click on the element in the Dialog content
      |addButton|

    And User sending the keys in Dialog content
      |nameInput|aya|
      |codeInputb|10120110|

    And Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed

  @SmokeTest
  Scenario: Edit Subject Categories
    And Click on the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|


    And User sending the keys in Dialog content
      |searchInputb|aya|


    And Click on the element in the Dialog content
      |searchButtonb|
      |editButton  |

    And User sending the keys in Dialog content
      |nameInput|ayaz |
      |codeInputb|1010101010  |

    And Click on the element in the Dialog content
      |saveButton|

    And Success message should be displayed

  @SmokeTest
  Scenario: Delete Subject Categories
    And Click on the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|

    And User sending the keys in Dialog content
      |searchInputb|ayaz |

    And Click on the element in the Dialog content
      |searchButtonb|
      |deleteButtonb|
      |deleteDialogBtn|

    And Success message should be displayed


