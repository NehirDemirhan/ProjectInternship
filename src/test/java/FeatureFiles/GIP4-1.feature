Feature: Position Categories Under Human Resources Setup Functionality

  Background:
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully

  @GIP4-1
  Scenario: Add Position Categories

    And Click on the element in the left Nav
      | humanResources     |
      | setupThree         |
      | positionCategories |

    And Click on the element in the Dialog content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Position Categories-MHRMTR |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  @GIP4-1
  Scenario: Edit Position Categories

    And Click on the element in the left Nav
      | humanResources     |
      | setupThree         |
      | positionCategories |

    And User sending the keys in Dialog content
      | searchInput | Position Categories-MHRMTR |

    And Click on the element in the Dialog content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | Position Categories-MHRMTR-Duzenlendi.. |

    And Click on the element in the Dialog content
      | saveButton |

    Then Success message should be displayed


  @GIP4-1
  Scenario: Delete Position Categories

    And Click on the element in the left Nav
      | humanResources     |
      | setupThree         |
      | positionCategories |

    And User sending the keys in Dialog content
      | searchInput | Position Categories-MHRMTR |

    And Click on the element in the Dialog content
      | searchButton    |
      | deleteButton    |
      | deleteDialogBtn |

    Then Success message should be displayed