Feature:Subject Categories

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @SmokeTest
  Scenario: Create Subject Categories
    And Click on  Subject the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|

    And Click on the element in the Dialog
      |addButton|

    And User sending the keys in Dialog
      |nameInput|aya|
      |codeInputb|10120110|

    And  Click on the element in the Dialog
      | saveButton |

    And Success message should be display

  @SmokeTest
  Scenario: Edit Subject Categories
    And Click on  Subject the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|


    And User sending the keys in Dialog
      |searchInputb|aya|


    And  Click on the element in the Dialog
      |searchButtonb|
      |editButton  |

    And User sending the keys in Dialog
      |nameInput|ayaz |
      |codeInputb|1010101010  |

    And  Click on the element in the Dialog
      |saveButton|

    And Success message should be display

  @SmokeTest
  Scenario: Delete Subject Categories
    And Click on  Subject the element in the left Nav
      |educationb|
      |setupfourb    |
      |subjectCategoriesb|

    And User sending the keys in Dialog
      |searchInputb|ayaz |

    And  Click on the element in the Dialog
      |searchButtonb|
      |deleteButtonb|
      |deleteDialogBtn|

    And Success message should be display


