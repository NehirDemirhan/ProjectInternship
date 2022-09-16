Feature: Positions Functionality
  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
  @NehirTest
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
  @NehirTest
  Scenario: Edit Position
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And User sending the keys in Dialog content
      | searchInputb | Nehir |

    And Click on the element in the Dialog content
      | searchButtonb |
      | editButtonb   |

    And User sending the keys in Dialog content
      | nameInput      | NehirDemir |
      | shortNameInput | NhrD       |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed
  @NehirTest
  Scenario: Delete Position
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | positions      |

    And User delete item from Dialog
      | NehirDemir |

    Then Success message should be displayed

