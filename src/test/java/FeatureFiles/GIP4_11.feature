Feature:Discounts

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @Sarı
  Scenario: Create Grade Levels
    And Click on the element in the left Nav
      |setupOne   |
      |parameters |
      |discounts|

    And Click on the element in the Dialog
      |addButton|

    And User sending the keys in Dialog
      |description2   |fani|
      |integrationCode|12345|
      |priority       |  3  |

    And  Click on the element in the Dialog
      | saveButton |

    And Success message should be display


  @Sarı
  Scenario: Edit Discounts
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |discounts|

    And User sending the keys in Dialog
      |description1|fani|

    And  Click on the element in the Dialog
      |searchButtonb|
      |editButtonb  |

    And User sending the keys in Dialog
      |description2    |dolan|
      |integrationCode |25836|
      |priority        |  2  |

    And  Click on the element in the Dialog
      |saveButton|

    And Success message should be display


  @Sarı
  Scenario: Delete Discounts
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |discounts|

    And User sending the keys in Dialog
      |description1|dolan|

    And  Click on the element in the Dialog
      |searchButtonb|
      |deleteButtonb|
      |deleteDialogBtn|

    And Success message should be display