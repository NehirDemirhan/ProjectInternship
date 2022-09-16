Feature:Discounts

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @Sarı
  Scenario: Create Discounts
    And Click on the element in the left Nav
      |setupOne   |
      |parameters |
      |discounts|

    And Click on the element in the Dialog content
      |addButton|

    And User sending the keys in Dialog content
      |description2   |fani|
      |integrationCode|12345|
      |priority       |  3  |

    And  Click on the element in the Dialog content
      | saveButton |

    And Success message should be displayed


  @Sarı
  Scenario: Edit Discounts
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |discounts|

    And User sending the keys in Dialog content
      |description1|fani|

    And  Click on the element in the Dialog content
      |searchButtonb|
      |editButtonb  |

    And User sending the keys in Dialog content
      |description2    |dolan|
      |integrationCode |25836|
      |priority        |  2  |

    And  Click on the element in the Dialog content
      |saveButton|

    And Success message should be displayed


  @Sarı
  Scenario: Delete Discounts
    And Click on the element in the left Nav
      |setupOne|
      |parameters |
      |discounts|



    And User delete item from Dialog
      | dolan |

    And Success message should be displayed