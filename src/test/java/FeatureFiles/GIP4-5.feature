Feature: Positions Functionality
  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario:  Add a Position
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput      | Nehir |
      | shortNameInput | Nhr   |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed
