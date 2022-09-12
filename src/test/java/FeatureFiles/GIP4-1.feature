Feature: Position Categories Under Human Resources Setup Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario: Add Position Categories

    And Click on the element in the left Nav
      | humanResources     |
      | setupThree         |
      | positionCategories |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Position Categories-MHRM |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed